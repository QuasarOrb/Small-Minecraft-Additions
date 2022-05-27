
package quasarorb.smm.client.renderer;

import quasarorb.smm.entity.WizardEntity;
import quasarorb.smm.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WizardRenderer extends MobRenderer<WizardEntity, Modelcustom_model<WizardEntity>> {
	public WizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WizardEntity entity) {
		return new ResourceLocation("smm:textures/finalwizard.png");
	}
}
