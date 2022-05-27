package quasarorb.smm.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("smm", "modelcustom_model"), "main");
	public final ModelPart armright;
	public final ModelPart head;
	public final ModelPart armleft;
	public final ModelPart other;

	public Modelcustom_model(ModelPart root) {
		this.armright = root.getChild("armright");
		this.head = root.getChild("head");
		this.armleft = root.getChild("armleft");
		this.other = root.getChild("other");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armright = partdefinition.addOrReplaceChild("armright",
				CubeListBuilder.create().texOffs(24, 33).addBox(-15.0F, -30.0F, -14.0F, 1.0F, 29.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 44)
						.addBox(-16.0F, -33.0F, -15.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 45)
						.addBox(-15.0F, -23.0F, -13.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition arm1_r1 = armright.addOrReplaceChild("arm1_r1",
				CubeListBuilder.create().texOffs(29, 0).addBox(-15.0F, -3.0F, -3.0F, 19.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -24.0F, 0.0F, 0.0F, -0.8727F, -0.3491F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 33).addBox(-3.0F, -35.0F, -3.0F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 7)
						.addBox(-3.0F, -37.0F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 36)
						.addBox(-3.0F, -31.0F, -5.0F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
						.addBox(-3.0F, -36.0F, 2.0F, 7.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(4.0F, -36.0F, -3.0F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(-4.0F, -36.0F, -3.0F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft",
				CubeListBuilder.create().texOffs(0, 45).addBox(10.0F, -10.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition arm2_r1 = armleft.addOrReplaceChild("arm2_r1",
				CubeListBuilder.create().texOffs(32, 29).addBox(-16.1763F, -3.7622F, -2.3673F, 18.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -24.0F, 2.0F, 1.4511F, -0.1837F, -1.9101F));
		PartDefinition other = partdefinition.addOrReplaceChild("other",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -1.0F, -4.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -1.0F, -4.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -27.0F, -3.0F, 11.0F, 26.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		other.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.armright.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.armleft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
