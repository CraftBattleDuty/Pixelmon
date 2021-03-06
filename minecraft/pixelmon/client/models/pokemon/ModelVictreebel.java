// Date: 4/23/2013 5:23:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.bird.EnumWing;
import pixelmon.client.models.animations.bird.ModuleWing;
import pixelmon.client.models.animations.bird.SkeletonBird;

public class ModelVictreebel extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelVictreebel()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0,9,0);
      PixelmonModelRenderer  body_angled_corner_front = new PixelmonModelRenderer(this, 46, 35);
      body_angled_corner_front.addBox(-4F, -4.9F, -2F, 11, 5, 4);
      body_angled_corner_front.setRotationPoint(-1.5F, -2F, 6F);
      body_angled_corner_front.setTextureSize(128, 64);
      body_angled_corner_front.mirror = true;
      setRotation(body_angled_corner_front, 1.343077F, 0F, 0F);
      PixelmonModelRenderer  body_front_face = new PixelmonModelRenderer(this, -5, 26);
      body_front_face.addBox(-4F, -1F, -1F, 7, 7, 8);
      body_front_face.setRotationPoint(0.5F, 2.5F, -2F);
      body_front_face.setTextureSize(128, 64);
      body_front_face.mirror = true;
      setRotation(body_front_face, 0F, 0F, 0F);
      PixelmonModelRenderer  body_angled_corner_back = new PixelmonModelRenderer(this, 0, 0);
      body_angled_corner_back.addBox(-5F, -1.9F, -2.3F, 11, 5, 4);
      body_angled_corner_back.setRotationPoint(-0.5F, 5.2F, 10.2F);
      body_angled_corner_back.setTextureSize(128, 64);
      body_angled_corner_back.mirror = true;
      setRotation(body_angled_corner_back, 0.8726646F, 0F, 0F);
      PixelmonModelRenderer  body_sides = new PixelmonModelRenderer(this, 0, 45);
      body_sides.addBox(-5F, -3F, -2F, 13, 9, 10);
      body_sides.setRotationPoint(-1.5F, 0F, 4.6F);
      body_sides.setTextureSize(128, 64);
      body_sides.mirror = true;
      setRotation(body_sides, 0F, 0F, 0F);
      PixelmonModelRenderer  body_upper = new PixelmonModelRenderer(this, 5, 24);
      body_upper.addBox(-5F, -3F, -2F, 11, 9, 10);
      body_upper.setRotationPoint(-0.5F, -5F, 3.8F);
      body_upper.setTextureSize(128, 64);
      body_upper.mirror = true;
      setRotation(body_upper, 0.445059F, 0F, 0F);
      PixelmonModelRenderer  body_top = new PixelmonModelRenderer(this, 43, 45);
      body_top.addBox(-5F, -2F, -2F, 10, 11, 9);
      body_top.setRotationPoint(0F, -10.5F, 2.2F);
      body_top.setTextureSize(128, 64);
      body_top.mirror = true;
      setRotation(body_top, 0.445059F, 0F, 0F);
      PixelmonModelRenderer  lip_back_left_corner = new PixelmonModelRenderer(this, 45, 27);
      lip_back_left_corner.addBox(-1.3F, -1.2F, 0.6F, 3, 3, 1);
      lip_back_left_corner.setRotationPoint(-4F, -15.5F, 6F);
      lip_back_left_corner.setTextureSize(128, 64);
      lip_back_left_corner.mirror = true;
      setRotation(lip_back_left_corner, 0.2094395F, -1.134464F, -0.4363323F);
      PixelmonModelRenderer  lip_left = new PixelmonModelRenderer(this, 45, 23);
      lip_left.addBox(-1.9F, -1.8F, -4.1F, 1, 3, 6);
      lip_left.setRotationPoint(-4F, -14F, 4F);
      lip_left.setTextureSize(128, 64);
      lip_left.mirror = true;
      setRotation(lip_left, 0.445059F, 0.0872665F, -0.0872665F);
      PixelmonModelRenderer  lip_right = new PixelmonModelRenderer(this, 45, 22);
      lip_right.addBox(0.6F, -2F, -3.2F, 1, 3, 6);
      lip_right.setRotationPoint(4.5F, -13.5F, 3.5F);
      lip_right.setTextureSize(128, 64);
      lip_right.mirror = true;
      setRotation(lip_right, 0.445059F, -0.0523599F, 0.0872665F);
      PixelmonModelRenderer  lip_front = new PixelmonModelRenderer(this, 45, 27);
      lip_front.addBox(-3.8F, -1F, -1.1F, 8, 3, 1);
      lip_front.setRotationPoint(0F, -12.5F, -1F);
      lip_front.setTextureSize(128, 64);
      lip_front.mirror = true;
      setRotation(lip_front, 0.5235988F, 0F, 0F);
      PixelmonModelRenderer  lip_back = new PixelmonModelRenderer(this, 45, 27);
      lip_back.addBox(-4F, -1.7F, -0.7F, 9, 3, 2);
      lip_back.setRotationPoint(-0.7F, -15.5F, 7F);
      lip_back.setTextureSize(128, 64);
      lip_back.mirror = true;
      setRotation(lip_back, 0.445059F, 0F, 0F);
      PixelmonModelRenderer  lip_back_right_corner = new PixelmonModelRenderer(this, 45, 24);
      lip_back_right_corner.addBox(-0.4F, -1.7F, 1F, 3, 3, 1);
      lip_back_right_corner.setRotationPoint(3F, -15.4F, 7F);
      lip_back_right_corner.setTextureSize(128, 64);
      lip_back_right_corner.mirror = true;
      setRotation(lip_back_right_corner, 0.2443461F, 0.9599311F, 0.3665191F);
      PixelmonModelRenderer  lip_front_right_corner = new PixelmonModelRenderer(this, 45, 27);
      lip_front_right_corner.addBox(-1.3F, -1.9F, -2.8F, 3, 3, 1);
      lip_front_right_corner.setRotationPoint(3F, -12.5F, 1F);
      lip_front_right_corner.setTextureSize(128, 64);
      lip_front_right_corner.mirror = true;
      setRotation(lip_front_right_corner, 0.3141593F, -0.8028515F, -0.3316126F);
      PixelmonModelRenderer  lip_front_left_corner = new PixelmonModelRenderer(this, 45, 27);
      lip_front_left_corner.addBox(-0.8F, -0.9F, -2.5F, 3, 3, 1);
      lip_front_left_corner.setRotationPoint(-4F, -13.6F, 1.2F);
      lip_front_left_corner.setTextureSize(128, 64);
      lip_front_left_corner.mirror = true;
      setRotation(lip_front_left_corner, 0.3490659F, 0.6457718F, 0.2617994F);
      PixelmonModelRenderer  stem_curve_top = new PixelmonModelRenderer(this, 45, 0);
      stem_curve_top.addBox(-1F, -2F, -1.2F, 2, 2, 3);
      stem_curve_top.setRotationPoint(0F, -17F, 8F);
      stem_curve_top.setTextureSize(128, 64);
      stem_curve_top.mirror = true;
      setRotation(stem_curve_top, 0.9599311F, 0F, 0F);
      PixelmonModelRenderer  stem_top_ = new PixelmonModelRenderer(this, 45, 0);
      stem_top_.addBox(-1F, -2.1F, -1F, 2, 2, 2);
      stem_top_.setRotationPoint(0F, -18.1F, 9.1F);
      stem_top_.setTextureSize(128, 64);
      stem_top_.mirror = true;
      setRotation(stem_top_, 0.4363323F, 0F, 0F);
      PixelmonModelRenderer  stem_curve_top_down = new PixelmonModelRenderer(this, 45, 0);
      stem_curve_top_down.addBox(-1F, -1.5F, -0.6F, 2, 2, 5);
      stem_curve_top_down.setRotationPoint(0F, -5.1F, 18.7F);
      stem_curve_top_down.setTextureSize(128, 64);
      stem_curve_top_down.mirror = true;
      setRotation(stem_curve_top_down, -1.296707F, 0F, 0F);
      PixelmonModelRenderer  stem_curve = new PixelmonModelRenderer(this, 45, 0);
      stem_curve.addBox(-1F, -1F, 0F, 2, 2, 2);
      stem_curve.setRotationPoint(0F, -19.4F, 9.1F);
      stem_curve.setTextureSize(128, 64);
      stem_curve.mirror = true;
      setRotation(stem_curve, -0.0469896F, 0F, 0F);
      PixelmonModelRenderer  stem_tip = new PixelmonModelRenderer(this, 84, 49);
      stem_tip.addBox(-2.2F, -0.6F, -2.6F, 4, 5, 2);
      stem_tip.setRotationPoint(0F, 8.9F, 30.3F);
      stem_tip.setTextureSize(128, 64);
      stem_tip.mirror = true;
      setRotation(stem_tip, 1.487144F, 0F, 0F);
      PixelmonModelRenderer  stem_bottom = new PixelmonModelRenderer(this, 45, 0);
      stem_bottom.addBox(-1F, 0F, -0.1F, 2, 3, 1);
      stem_bottom.setRotationPoint(0F, 8F, 29F);
      stem_bottom.setTextureSize(128, 64);
      stem_bottom.mirror = true;
      setRotation(stem_bottom, 0.4537856F, 0F, 0F);
      PixelmonModelRenderer  body_bottom = new PixelmonModelRenderer(this, 0, 7);
      body_bottom.addBox(-5.5F, 0F, 0F, 11, 10, 11);
      body_bottom.setRotationPoint(0F, -1F, 0F);
      body_bottom.setTextureSize(128, 64);
      body_bottom.mirror = true;
      setRotation(body_bottom, 0F, 0F, 0F);
      PixelmonModelRenderer  body_angled_corner_front2 = new PixelmonModelRenderer(this, 0, 0);
      body_angled_corner_front2.addBox(-4F, -4.9F, -2F, 11, 5, 4);
      body_angled_corner_front2.setRotationPoint(-1.5F, 1F, 5F);
      body_angled_corner_front2.setTextureSize(128, 64);
      body_angled_corner_front2.mirror = true;
      setRotation(body_angled_corner_front2, 0.7853982F, 0F, 0F);
      PixelmonModelRenderer  body_front = new PixelmonModelRenderer(this, 0, 0);
      body_front.addBox(-4.5F, 1F, -1F, 9, 9, 9);
      body_front.setRotationPoint(0F, -1F, 0F);
      body_front.setTextureSize(128, 64);
      body_front.mirror = true;
      setRotation(body_front, 0F, 0F, 0F);
      PixelmonModelRenderer  leaf_top = new PixelmonModelRenderer(this, 66, 0);
      leaf_top.addBox(-10.4F, 0F, -7.3F, 20, 1, 11);
      leaf_top.setRotationPoint(0.3F, -17.6F, 5F);
      leaf_top.setTextureSize(128, 64);
      leaf_top.mirror = true;
      setRotation(leaf_top, -0.122173F, -0.0174533F, 0F);
      PixelmonModelRenderer  tooth_right = new PixelmonModelRenderer(this, 61, 0);
      tooth_right.addBox(-0.5F, -0.2F, -1.5F, 1, 1, 3);
      tooth_right.setRotationPoint(3F, -13.5F, 0F);
      tooth_right.setTextureSize(128, 64);
      tooth_right.mirror = true;
      setRotation(tooth_right, 0.4363323F, -0.296706F, 0F);
      PixelmonModelRenderer  tooth_left = new PixelmonModelRenderer(this, 61, 5);
      tooth_left.addBox(-0.5F, -0.2F, -1.5F, 1, 1, 3);
      tooth_left.setRotationPoint(-3F, -13.5F, 0F);
      tooth_left.setTextureSize(128, 64);
      tooth_left.mirror = true;
      setRotation(tooth_left, 0.4363323F, 0.2974289F, 0F);
      PixelmonModelRenderer  body_bottom2 = new PixelmonModelRenderer(this, 0, 28);
      body_bottom2.addBox(-4F, -1F, -1F, 8, 8, 9);
      body_bottom2.setRotationPoint(0F, 2F, -1F);
      body_bottom2.setTextureSize(128, 64);
      body_bottom2.mirror = true;
      setRotation(body_bottom2, 0F, 0F, 0F);
      PixelmonModelRenderer  stem = new PixelmonModelRenderer(this, 45, 0);
      stem.addBox(-1F, -2.1F, 0.9F, 2, 2, 3);
      stem.setRotationPoint(0F, -19.5F, 9.1F);
      stem.setTextureSize(128, 64);
      stem.mirror = true;
      setRotation(stem, -0.8429217F, 0F, 0F);
      PixelmonModelRenderer  stem2 = new PixelmonModelRenderer(this, 45, 0);
      stem2.addBox(-1F, -1.2F, 0F, 2, 2, 3);
      stem2.setRotationPoint(0F, -17.5F, 12.1F);
      stem2.setTextureSize(128, 64);
      stem2.mirror = true;
      setRotation(stem2, -0.8429217F, 0F, 0F);
      PixelmonModelRenderer  stem3 = new PixelmonModelRenderer(this, 45, 0);
      stem3.addBox(-1F, -1.1F, 0F, 2, 2, 4);
      stem3.setRotationPoint(0F, -15.7F, 13.9F);
      stem3.setTextureSize(128, 64);
      stem3.mirror = true;
      setRotation(stem3, -1.122174F, 0F, 0F);
      PixelmonModelRenderer  stem4 = new PixelmonModelRenderer(this, 45, 0);
      stem4.addBox(-1F, -1F, -0.2F, 2, 2, 4);
      stem4.setRotationPoint(0F, -12.1F, 15.7F);
      stem4.setTextureSize(128, 64);
      stem4.mirror = true;
      setRotation(stem4, -1.261801F, 0F, 0F);
      PixelmonModelRenderer  stem5 = new PixelmonModelRenderer(this, 45, 0);
      stem5.addBox(-1F, -1.4F, -0.5F, 2, 2, 4);
      stem5.setRotationPoint(0F, -8.1F, 16.7F);
      stem5.setTextureSize(128, 64);
      stem5.mirror = true;
      setRotation(stem5, -0.9301882F, 0F, 0F);
      PixelmonModelRenderer  body_back = new PixelmonModelRenderer(this, 0, 0);
      body_back.addBox(-5.5F, -3F, 3.6F, 11, 9, 10);
      body_back.setTextureSize(128, 64);
      body_back.mirror = true;
      setRotation(body_back, 0F, 0F, 0F);
      PixelmonModelRenderer  stem_bottom1 = new PixelmonModelRenderer(this, 45, 0);
      stem_bottom1.addBox(-1F, 0F, -0.1F, 2, 6, 2);
      stem_bottom1.setRotationPoint(0F, -1.3F, 19.5F);
      stem_bottom1.setTextureSize(128, 64);
      stem_bottom1.mirror = true;
      setRotation(stem_bottom1, 0.0872665F, 0F, 0F);
      PixelmonModelRenderer  stem_bottom2 = new PixelmonModelRenderer(this, 45, 0);
      stem_bottom2.addBox(-1F, 0F, -0.1F, 2, 4, 2);
      stem_bottom2.setRotationPoint(0F, 4.5F, 20F);
      stem_bottom2.setTextureSize(128, 64);
      stem_bottom2.mirror = true;
      setRotation(stem_bottom2, 0.5934119F, 0F, 0F);
      PixelmonModelRenderer  stem_bottom3 = new PixelmonModelRenderer(this, 45, 0);
      stem_bottom3.addBox(-1F, 0F, -0.1F, 2, 4, 2);
      stem_bottom3.setRotationPoint(0F, 7.7F, 22.1F);
      stem_bottom3.setTextureSize(128, 64);
      stem_bottom3.mirror = true;
      setRotation(stem_bottom3, 1.169371F, 0F, 0F);
      PixelmonModelRenderer  stem_bottom4 = new PixelmonModelRenderer(this, 45, 0);
      stem_bottom4.addBox(-1F, 0F, -0.1F, 2, 4, 2);
      stem_bottom4.setRotationPoint(0F, 9.2F, 25.6F);
      stem_bottom4.setTextureSize(128, 64);
      stem_bottom4.mirror = true;
      setRotation(stem_bottom4, 1.518436F, 0F, 0F);
      Body.addChild(body_angled_corner_front);
      Body.addChild(body_front_face);
      Body.addChild(body_angled_corner_back);
      Body.addChild(body_sides);
      Body.addChild(body_upper);
      Body.addChild(body_top);
      Body.addChild(lip_back_left_corner);
      Body.addChild(lip_left);
      Body.addChild(lip_right);
      Body.addChild(lip_front);
      Body.addChild(lip_back);
      Body.addChild(lip_back_right_corner);
      Body.addChild(lip_front_right_corner);
      Body.addChild(lip_front_left_corner);
      Body.addChild(stem_curve_top);
      Body.addChild(stem_top_);
      Body.addChild(stem_curve_top_down);
      Body.addChild(stem_curve);
      Body.addChild(stem_tip);
      Body.addChild(stem_bottom);
      Body.addChild(body_bottom);
      Body.addChild(body_angled_corner_front2);
      Body.addChild(body_front);
      Body.addChild(leaf_top);
      Body.addChild(tooth_right);
      Body.addChild(tooth_left);
      Body.addChild(body_bottom2);
      Body.addChild(stem);
      Body.addChild(stem2);
      Body.addChild(stem3);
      Body.addChild(stem4);
      Body.addChild(stem5);
      Body.addChild(body_back);
      Body.addChild(stem_bottom1);
      Body.addChild(stem_bottom2);
      Body.addChild(stem_bottom3);
      Body.addChild(stem_bottom4);
      
      
      PixelmonModelRenderer LeftWing = new PixelmonModelRenderer(this, "Left Leaf");
      LeftWing.setRotationPoint(-3, -0.3F, 5);
      PixelmonModelRenderer  leaf_left = new PixelmonModelRenderer(this, 78, 14);
      leaf_left.addBox(-11.3F, 0F, -4F, 11, 1, 14);
      leaf_left.setTextureSize(128, 64);
      leaf_left.mirror = true;
      setRotation(leaf_left, 0.9773844F, -0.1570796F, -0.7679449F);
      LeftWing.addChild(leaf_left);
      Body.addChild(LeftWing);
      
      
      PixelmonModelRenderer RightWing = new PixelmonModelRenderer(this, "Right Leaf");
      RightWing.setRotationPoint(4, -1, 6);
      PixelmonModelRenderer  leaf_right = new PixelmonModelRenderer(this, 78, 29);
      leaf_right.addBox(1F, 0F, -4F, 11, 1, 14);
      leaf_right.setTextureSize(128, 64);
      leaf_right.mirror = true;
      setRotation(leaf_right, 0.9773844F, 0.1396263F, 0.7679449F);
      RightWing.addChild(leaf_right);
      Body.addChild(RightWing);
      
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0,0,0);

      ModuleHead headModule = new ModuleHead(Head);

		ModuleWing leftWingModule = new ModuleWing(LeftWing, EnumWing.Left,
				21, 0.1F, 0.5F);
		ModuleWing rightWingModule = new ModuleWing(RightWing, EnumWing.Right,
				21, 0.1F, 0.5F);

		skeleton = new SkeletonBird(Body, headModule, leftWingModule,
				rightWingModule, null, null);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
