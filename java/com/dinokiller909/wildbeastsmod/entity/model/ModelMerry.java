package com.dinokiller909.wildbeastsmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelWolf - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelMerry extends ModelBase {
    public ModelRenderer field_78179_f;
    public ModelRenderer field_78186_h;
    public ModelRenderer field_78181_d;
    public ModelRenderer field_78184_c;
    public ModelRenderer field_78182_e;
    public ModelRenderer field_78180_g;
    public ModelRenderer field_78185_a0;
    public ModelRenderer field_78183_b;
    public ModelRenderer field_78185_a1;
    public ModelRenderer field_78185_a2;
    public ModelRenderer field_78185_a3;

    public ModelMerry() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78185_a3 = new ModelRenderer(this, 0, 10);
        this.field_78185_a3.setRotationPoint(-0.1F, -1.4F, 0.1F);
        this.field_78185_a3.addBox(-0.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
        this.field_78182_e = new ModelRenderer(this, 0, 18);
        this.field_78182_e.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.field_78182_e.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78185_a2 = new ModelRenderer(this, 16, 14);
        this.field_78185_a2.setRotationPoint(2.8F, 0.7F, 2.9F);
        this.field_78185_a2.addBox(2.0F, -5.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(field_78185_a2, 0.0F, 1.5707963267948966F, 0.0F);
        this.field_78185_a0 = new ModelRenderer(this, 0, 0);
        this.field_78185_a0.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.field_78185_a0.addBox(-2.0F, -4.1F, -2.0F, 6, 6, 4, 0.0F);
        this.field_78183_b = new ModelRenderer(this, 18, 14);
        this.field_78183_b.setRotationPoint(-0.1F, 10.3F, 0.0F);
        this.field_78183_b.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(field_78183_b, 3.141592653589793F, 0.0F, 0.0F);
        this.field_78184_c = new ModelRenderer(this, 0, 18);
        this.field_78184_c.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.field_78184_c.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78185_a1 = new ModelRenderer(this, 16, 14);
        this.field_78185_a1.setRotationPoint(-2.9F, 0.7F, 2.9F);
        this.field_78185_a1.addBox(2.0F, -5.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(field_78185_a1, 0.0F, 1.5707963267948966F, 0.0F);
        this.field_78179_f = new ModelRenderer(this, 0, 18);
        this.field_78179_f.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.field_78179_f.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78181_d = new ModelRenderer(this, 0, 18);
        this.field_78181_d.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.field_78181_d.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78186_h = new ModelRenderer(this, 21, 0);
        this.field_78186_h.setRotationPoint(0.0F, 14.0F, -3.1F);
        this.field_78186_h.addBox(-3.0F, -3.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(field_78186_h, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_78180_g = new ModelRenderer(this, 9, 18);
        this.field_78180_g.setRotationPoint(-0.4F, 11.4F, 8.5F);
        this.field_78180_g.addBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(field_78180_g, 0.4553564018453205F, 0.0F, 0.0F);
        this.field_78185_a0.addChild(this.field_78185_a3);
        this.field_78185_a0.addChild(this.field_78185_a2);
        this.field_78186_h.addChild(this.field_78183_b);
        this.field_78185_a0.addChild(this.field_78185_a1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78182_e.render(f5);
        this.field_78185_a0.render(f5);
        this.field_78184_c.render(f5);
        this.field_78179_f.render(f5);
        this.field_78181_d.render(f5);
        this.field_78186_h.render(f5);
        this.field_78180_g.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
