package at.acpi.heartfall.renderer;

import at.acpi.heartfall.entity.HeartShardEntity;
import at.acpi.heartfall.registry.HeartfallItemRegistry;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

//? if <1.21.2 {
/*import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
*///?} else {
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.item.ItemModelResolver;
import org.jspecify.annotations.NonNull;
import org.joml.Quaternionfc;
//?}
//? if >=26.1 {
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.util.LightCoordsUtil;
//?} else if >=1.21.2 {
/*import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.state.CameraRenderState;
*///?}

public class HeartShardEntityRenderer
		//? if <1.21.2 {
		/*extends EntityRenderer<HeartShardEntity> {
		 *///?} else {
		extends EntityRenderer<HeartShardEntity, HeartShardEntityRenderState> {
	//?}
	private static final float
			BOB_PRIMARY_PERIOD = 8.0f,
			BOB_PRIMARY_AMP = 0.08f,
			BOB_SECONDARY_PERIOD = 5.3f,
			BOB_SECONDARY_AMP = 0.03f,
			BOB_BASE = 0.5f,
			SCALE_BASE = 0.5f,
			SCALE_PRIMARY_FREQ = 0.18f,
			SCALE_PRIMARY_AMP = 0.03f,
			SCALE_SECONDARY_FREQ = 0.31f,
			SCALE_SECONDARY_AMP = 0.015f,
			ROTATION_PERIOD = 32f;

	private static ItemStack itemStack;

	//? if <1.21.2 {
	/*private final ItemRenderer itemRenderer;
	 *///?} else {
	private final ItemModelResolver itemModelResolver;
	//?}

	public HeartShardEntityRenderer(EntityRendererProvider.Context ctx) {
		super(ctx);
		//? if <1.21.2 {
		/*this.itemRenderer = ctx.getItemRenderer();
		 *///?} else {
		this.itemModelResolver = ctx.getItemModelResolver();
		//?}
	}

	private static ItemStack itemStack() {
		if (itemStack == null) itemStack = new ItemStack(HeartfallItemRegistry.heartShardIcon());
		return itemStack;
	}

	private static int fullBrightLight() {
		//? if >=26.1 {
		return LightCoordsUtil.FULL_BRIGHT;
		//?} else {
		/*return LightTexture.FULL_BRIGHT;
		 *///?}
	}

	//? if >=1.21.2 {
	private static void rotate(PoseStack stack, Quaternionfc quaternion) {
		//? if >=26.3 {
		/*stack.rotate(quaternion);
		*///?} else {
		stack.mulPose(quaternion);
		//?}
	}
	//?}

	private static float scale(float delta, float deathProgress) {
		float breathing = SCALE_BASE
				+ (float) Math.sin(delta * SCALE_PRIMARY_FREQ) * SCALE_PRIMARY_AMP
				+ (float) Math.sin(delta * SCALE_SECONDARY_FREQ) * SCALE_SECONDARY_AMP;
		float death = deathProgress > 0f ? (float) Math.pow(1f - deathProgress, 2f) : 1f;
		return breathing * death;
	}

	//? if <1.21.2 {
	/*@Override
	public ResourceLocation getTextureLocation(HeartShardEntity entity) {
		return ResourceLocation.withDefaultNamespace("textures/gui/sprites/hud/heart/full.png");
	}

	@Override
	public void render(
			HeartShardEntity entity, float entityYaw, float partialTicks, PoseStack stack,
			MultiBufferSource buffer, int packedLight
	) {
		float delta = entity.tickCount + partialTicks;
		float scale = scale(delta, entity.getDeathProgress(partialTicks));
		if (scale <= 0f) return;

		float bob = (float) (Math.sin(delta / BOB_PRIMARY_PERIOD) * BOB_PRIMARY_AMP
				+ Math.sin(delta / BOB_SECONDARY_PERIOD) * BOB_SECONDARY_AMP);
		float rotation = delta / ROTATION_PERIOD;

		BakedModel model = itemRenderer.getModel(itemStack(), entity.level(), null, entity.getId());

		stack.pushPose();
		stack.translate(0, BOB_BASE + bob, 0);
		stack.mulPose(entityRenderDispatcher.cameraOrientation());
		stack.mulPose(Axis.YP.rotation(rotation));
		stack.scale(scale, scale, scale);

		itemRenderer.render(itemStack(), ItemDisplayContext.FIXED, false, stack, buffer, fullBrightLight(),
				OverlayTexture.NO_OVERLAY, model);

		stack.popPose();
		super.render(entity, entityYaw, partialTicks, stack, buffer, packedLight);
	}
	*///?} else {
	@Override
	public @NotNull HeartShardEntityRenderState createRenderState() {
		return new HeartShardEntityRenderState();
	}

	@Override
	public void extractRenderState(
			@NonNull HeartShardEntity entity, @NonNull HeartShardEntityRenderState state, float partialTicks
	) {
		super.extractRenderState(entity, state, partialTicks);
		float delta = entity.tickCount + partialTicks;

		float bob = (float) (Math.sin(delta / BOB_PRIMARY_PERIOD) * BOB_PRIMARY_AMP
				+ Math.sin(delta / BOB_SECONDARY_PERIOD) * BOB_SECONDARY_AMP);

		state.rotation = delta / ROTATION_PERIOD;
		state.bob = BOB_BASE + bob;
		state.scale = scale(delta, entity.getDeathProgress(partialTicks));

		itemModelResolver.updateForTopItem(state.item, itemStack(), ItemDisplayContext.FIXED, entity.level(), entity, 0);
	}

	@Override
	public void submit(
			HeartShardEntityRenderState state, @NonNull PoseStack stack, @NonNull SubmitNodeCollector collector,
			@NonNull CameraRenderState camera
	) {
		if (state.scale <= 0f) return;

		stack.pushPose();
		stack.translate(0, state.bob, 0);
		rotate(stack, camera.orientation);
		rotate(stack, Axis.YP.rotation(state.rotation));
		stack.scale(state.scale, state.scale, state.scale);

		state.item.submit(stack, collector, fullBrightLight(), OverlayTexture.NO_OVERLAY, 0);

		stack.popPose();
		super.submit(state, stack, collector, camera);
	}
	//?}
}
