// Date: 4/26/2013 9:46:58 PM
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

public class ModelAerodactyl extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer BODY;
  
  public ModelAerodactyl()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      BODY = new PixelmonModelRenderer(this, "BODY");
      BODY.setRotationPoint(0, 4, 2);
      PixelmonModelRenderer body_1 = new PixelmonModelRenderer(this, 0, 0);
      body_1.addBox(-4F, -1.4F, -3F, 8, 10, 10);
      body_1.setTextureSize(128, 64);
      body_1.mirror = true;
      setRotation(body_1, -0.3665191F, 0F, 0F);
      PixelmonModelRenderer body_2 = new PixelmonModelRenderer(this, 0, 0);
      body_2.addBox(-4F, 0.2F, 2F, 8, 8, 6);
      body_2.setTextureSize(128, 64);
      body_2.mirror = true;
      setRotation(body_2, -0.1570796F, 0F, 0F);
      PixelmonModelRenderer chest = new PixelmonModelRenderer(this, 0, 0);
      chest.addBox(-3.5F, -0.5333334F, -3.6F, 7, 9, 4);
      chest.setTextureSize(128, 64);
      chest.mirror = true;
      setRotation(chest, -0.5934119F, 0F, 0F);
      PixelmonModelRenderer back_hump_thing_ = new PixelmonModelRenderer(this, 0, 0);
      back_hump_thing_.addBox(-1F, -2.4F, -3.733333F, 2, 4, 6);
      back_hump_thing_.setTextureSize(128, 64);
      back_hump_thing_.mirror = true;
      setRotation(back_hump_thing_, -0.8726646F, 0F, 0F);
      PixelmonModelRenderer neck_1 = new PixelmonModelRenderer(this, 0, 0);
      neck_1.addBox(-2.5F, -3.333333F, -2.6F, 5, 7, 4);
      neck_1.setRotationPoint(0F, 1F, -5F);
      neck_1.setTextureSize(128, 64);
      neck_1.mirror = true;
      setRotation(neck_1, -0.4363323F, 0F, 0F);
      PixelmonModelRenderer neck_2 = new PixelmonModelRenderer(this, 0, 0);
      neck_2.addBox(-2F, -2.8F, -3.866667F, 4, 5, 4);
      neck_2.setRotationPoint(0F, 0F, -7F);
      neck_2.setTextureSize(128, 64);
      neck_2.mirror = true;
      setRotation(neck_2, -0.3665191F, 0F, 0F);
      PixelmonModelRenderer neck_3 = new PixelmonModelRenderer(this, 0, 0);
      neck_3.addBox(-2F, -1.8F, -5.866667F, 4, 4, 6);
      neck_3.setRotationPoint(0F, -2F, -10F);
      neck_3.setTextureSize(128, 64);
      neck_3.mirror = true;
      setRotation(neck_3, -0.2617994F, 0F, 0F);
      
      BODY.addChild(body_1);
      BODY.addChild(body_2);
      BODY.addChild(chest);
      BODY.addChild(back_hump_thing_);
      BODY.addChild(neck_1);
      BODY.addChild(neck_2);
      BODY.addChild(neck_3);
      
      PixelmonModelRenderer TAIL = new PixelmonModelRenderer(this, "");
      TAIL.setRotationPoint(0, 5, 7);
     PixelmonModelRenderer tail_1 = new PixelmonModelRenderer(this, 0, 0);
      tail_1.addBox(-3F, -3F, -0.3333333F, 6, 7, 5);
      tail_1.setTextureSize(128, 64);
      tail_1.mirror = true;
      setRotation(tail_1, -0.3141593F, 0F, 0F);
      PixelmonModelRenderer tail_2 = new PixelmonModelRenderer(this, 0, 0);
      tail_2.addBox(-2.5F, -3F, -1.4F, 5, 6, 4);
      tail_2.setRotationPoint(0, 2, 5);
      tail_2.setTextureSize(128, 64);
      tail_2.mirror = true;
      setRotation(tail_2, -0.3839724F, 0F, 0F);
      PixelmonModelRenderer tail_3 = new PixelmonModelRenderer(this, 0, 0);
      tail_3.addBox(-2F, -2.266667F, -1.4F, 4, 5, 5);
      tail_3.setRotationPoint(0F, 3F, 8F);
      tail_3.setTextureSize(128, 64);
      tail_3.mirror = true;
      setRotation(tail_3, -0.4886922F, 0F, 0F);
      PixelmonModelRenderer tail_4 = new PixelmonModelRenderer(this, 0, 0);
      tail_4.addBox(-1.5F, -1.866667F, -1.4F, 3, 4, 6);
      tail_4.setRotationPoint(0F, 5F, 12F);
      tail_4.setTextureSize(128, 64);
      tail_4.mirror = true;
      setRotation(tail_4, -0.4712389F, 0F, 0F);
      PixelmonModelRenderer tail_5 = new PixelmonModelRenderer(this, 0, 0);
      tail_5.addBox(-1F, -1.133333F, -1.4F, 2, 3, 7);
      tail_5.setRotationPoint(0F, 7F, 17F);
      tail_5.setTextureSize(128, 64);
      tail_5.mirror = true;
      setRotation(tail_5, -0.3141593F, 0F, 0F);
      PixelmonModelRenderer tail_6 = new PixelmonModelRenderer(this, 0, 0);
      tail_6.addBox(-0.5F, -1.2F, -1.4F, 1, 2, 7);
      tail_6.setRotationPoint(0F, 9F, 23F);
      tail_6.setTextureSize(128, 64);
      tail_6.mirror = true;
      setRotation(tail_6, -0.1570796F, 0F, 0F);
      PixelmonModelRenderer tail_tip = new PixelmonModelRenderer(this, -7, 55);
      tail_tip.addBox(-4.5F, -0.2666667F, 2.333333F, 9, 1, 8);
      tail_tip.setRotationPoint(0F, 9F, 23F);
      tail_tip.setTextureSize(128, 64);
      tail_tip.mirror = true;
      setRotation(tail_tip, -0.1570796F, 0F, 0F);
     
      TAIL.addChild(tail_1);
      TAIL.addChild(tail_2);
      TAIL.addChild(tail_3);
      TAIL.addChild(tail_4);
      TAIL.addChild(tail_5);
      TAIL.addChild(tail_6);
      TAIL.addChild(tail_tip);
      BODY.addChild(TAIL);
      
      
      PixelmonModelRenderer HEAD = new PixelmonModelRenderer(this,"HEAD");
      HEAD.setRotationPoint(0, -4, -16);
      PixelmonModelRenderer head_main = new PixelmonModelRenderer(this, 0, 0);
      head_main.addBox(-2.5F, -3.866667F, -1.933333F, 5, 3, 5);
      head_main.setTextureSize(128, 64);
      head_main.mirror = true;
      setRotation(head_main, 0.2268928F, 0F, 0F);
      PixelmonModelRenderer head_L = new PixelmonModelRenderer(this, 0, 0);
      head_L.addBox(0.9F, -2F, -2.4F, 3, 4, 5);
      head_L.setTextureSize(128, 64);
      head_L.mirror = true;
      setRotation(head_L, 0.1919862F, 0.6632251F, 0.0523599F);
      PixelmonModelRenderer head_R = new PixelmonModelRenderer(this, 0, 0);
      head_R.addBox(-3.9F, -2F, -2.4F, 3, 4, 5);
      head_R.setTextureSize(128, 64);
      head_R.mirror = true;
      setRotation(head_R, 0.1919862F, -0.6632251F, -0.0872665F);
      PixelmonModelRenderer head_front = new PixelmonModelRenderer(this, 0, 0);
      head_front.addBox(-1.5F, -2.4F, -4.866667F, 3, 3, 4);
      head_front.setTextureSize(128, 64);
      head_front.mirror = true;
      setRotation(head_front, 0.1919862F, 0F, 0F);
      PixelmonModelRenderer head_L_back = new PixelmonModelRenderer(this, 0, 0);
      head_L_back.addBox(1F, -2F, -2.066667F, 3, 5, 4);
      head_L_back.setTextureSize(128, 64);
      head_L_back.mirror = true;
      setRotation(head_L_back, 0.1919862F, -0.4014257F, -0.122173F);
      PixelmonModelRenderer head_R_back = new PixelmonModelRenderer(this, 0, 0);
      head_R_back.addBox(-4F, -2F, -2.066667F, 3, 5, 4);
      head_R_back.setTextureSize(128, 64);
      head_R_back.mirror = true;
      setRotation(head_R_back, 0.1919862F, 0.4014257F, 0.122173F);
      PixelmonModelRenderer upper_jaw_tip_2 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_tip_2.addBox(-0.5F, 4.366667F, -10F, 1, 2, 1);
      upper_jaw_tip_2.setTextureSize(128, 64);
      upper_jaw_tip_2.mirror = true;
      setRotation(upper_jaw_tip_2, -0.0523599F, 0F, 0F);
      PixelmonModelRenderer upper_jaw_tip = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_tip.addBox(-0.5F, -0.5F, -11.86667F, 1, 2, 1);
      upper_jaw_tip.setTextureSize(128, 64);
      upper_jaw_tip.mirror = true;
      setRotation(upper_jaw_tip, 0.4363323F, 0F, 0F);
      PixelmonModelRenderer nose_bottom = new PixelmonModelRenderer(this, 0, 0);
      nose_bottom.addBox(-1F, -1.566667F, -11.93333F, 2, 2, 3);
      nose_bottom.setTextureSize(128, 64);
      nose_bottom.mirror = true;
      setRotation(nose_bottom, 0.4886922F, 0F, 0F);
      PixelmonModelRenderer nose_top = new PixelmonModelRenderer(this, 0, 0);
      nose_top.addBox(-1F, 1.966667F, -10.8F, 2, 1, 3);
      nose_top.setTextureSize(128, 64);
      nose_top.mirror = true;
      setRotation(nose_top, 0.0174533F, 0F, 0F);
      PixelmonModelRenderer nose_ = new PixelmonModelRenderer(this, 13, 49);
      nose_.addBox(-1.5F, 4.366667F, -10.2F, 3, 2, 3);
      nose_.setTextureSize(128, 64);
      nose_.mirror = true;
      setRotation(nose_, -0.2094395F, 0F, 0F);
      PixelmonModelRenderer head_top_2 = new PixelmonModelRenderer(this, 0, 0);
      head_top_2.addBox(-1.5F, -4.4F, -3.266667F, 3, 3, 3);
      head_top_2.setTextureSize(128, 64);
      head_top_2.mirror = true;
      setRotation(head_top_2, 0.6457718F, 0F, 0F);
      PixelmonModelRenderer  eye_ridge_R = new PixelmonModelRenderer(this, 51, 50);
      eye_ridge_R.addBox(-4F, -3.3F, -3.333333F, 2, 4, 5);
      eye_ridge_R.setTextureSize(128, 64);
      eye_ridge_R.mirror = true;
      setRotation(eye_ridge_R, 0.4363323F, -0.4712389F, -0.0523599F);
      PixelmonModelRenderer eye_ridge_L = new PixelmonModelRenderer(this, 51, 50);
      eye_ridge_L.addBox(2F, -3.266667F, -3.266667F, 2, 4, 5);
      eye_ridge_L.setTextureSize(128, 64);
      eye_ridge_L.mirror = true;
      setRotation(eye_ridge_L, 0.4363323F, 0.4712389F, 0.0523599F);
      PixelmonModelRenderer horn_2_L = new PixelmonModelRenderer(this, 0, 0);
      horn_2_L.addBox(0.9666666F, -4.866667F, -0.2666667F, 1, 3, 2);
      horn_2_L.setTextureSize(128, 64);
      horn_2_L.mirror = true;
      setRotation(horn_2_L, -0.1047198F, 0.4014257F, 0.296706F);
      PixelmonModelRenderer horn_1_L = new PixelmonModelRenderer(this, 0, 0);
      horn_1_L.addBox(2.566667F, -4.4F, -0.2666667F, 2, 3, 2);
      horn_1_L.setTextureSize(128, 64);
      horn_1_L.mirror = true;
      setRotation(horn_1_L, -0.1047198F, 0.4014257F, -0.0523599F);
      PixelmonModelRenderer horn_3_L = new PixelmonModelRenderer(this, 0, 0);
      horn_3_L.addBox(1.766667F, -7.066667F, 0.2F, 1, 3, 1);
      horn_3_L.setTextureSize(128, 64);
      horn_3_L.mirror = true;
      setRotation(horn_3_L, -0.1047198F, 0.4014257F, 0.1919862F);
      PixelmonModelRenderer horn_4_L = new PixelmonModelRenderer(this, 0, 0);
      horn_4_L.addBox(3.3F, -6.6F, 0.2F, 1, 3, 1);
      horn_4_L.setTextureSize(128, 64);
      horn_4_L.mirror = true;
      setRotation(horn_4_L, -0.1047198F, 0.4014257F, -0.0174533F);
      PixelmonModelRenderer face_L_1 = new PixelmonModelRenderer(this, 0, 0);
      face_L_1.addBox(1.766667F, -2.4F, -0.3333333F, 3, 3, 2);
      face_L_1.setTextureSize(128, 64);
      face_L_1.mirror = true;
      setRotation(face_L_1, -0.0349066F, 0.4014257F, -0.1570796F);
      PixelmonModelRenderer upper_jaw_R_3_2 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_R_3_2.addBox(-4.8F, 0F, -1.933333F, 2, 4, 1);
      upper_jaw_R_3_2.setTextureSize(128, 64);
      upper_jaw_R_3_2.mirror = true;
      setRotation(upper_jaw_R_3_2, 1.256637F, -0.4014257F, -0.1047198F);
      PixelmonModelRenderer upper_jaw_R_3 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_R_3.addBox(-4.8F, 0F, -0.5333334F, 2, 4, 2);
      upper_jaw_R_3.setTextureSize(128, 64);
      upper_jaw_R_3.mirror = true;
      setRotation(upper_jaw_R_3, 0.8901179F, -0.4014257F, -0.1047198F);
      PixelmonModelRenderer upper_jaw_R_2 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_R_2.addBox(-4.8F, -0.7333333F, -3.8F, 2, 3, 5);
      upper_jaw_R_2.setTextureSize(128, 64);
      upper_jaw_R_2.mirror = true;
      setRotation(upper_jaw_R_2, 0.296706F, -0.4014257F, -0.1047198F);
      PixelmonModelRenderer upper_jaw_L_3_2 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_L_3_2.addBox(2.766667F, 0F, -1.933333F, 2, 4, 1);
      upper_jaw_L_3_2.setTextureSize(128, 64);
      upper_jaw_L_3_2.mirror = true;
      setRotation(upper_jaw_L_3_2, 1.256637F, 0.4014257F, 0.1047198F);
      PixelmonModelRenderer upper_jaw_L_3 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_L_3.addBox(2.766667F, 0F, -0.5333334F, 2, 4, 2);
      upper_jaw_L_3.setTextureSize(128, 64);
      upper_jaw_L_3.mirror = true;
      setRotation(upper_jaw_L_3, 0.8901179F, 0.4014257F, 0.1047198F);
      PixelmonModelRenderer upper_jaw_L_2 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_L_2.addBox(2.766667F, -0.7333333F, -3.8F, 2, 3, 5);
      upper_jaw_L_2.setTextureSize(128, 64);
      upper_jaw_L_2.mirror = true;
      setRotation(upper_jaw_L_2, 0.296706F, 0.4014257F, 0.1047198F);
      PixelmonModelRenderer  head_back = new PixelmonModelRenderer(this, 0, 0);
      head_back.addBox(-2.5F, -2.133333F, 1.8F, 5, 3, 2);
      head_back.setTextureSize(128, 64);
      head_back.mirror = true;
      setRotation(head_back, 0.2268928F, 0F, 0F);
      PixelmonModelRenderer upper_jaw_L_1 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_L_1.addBox(2.1F, -0.7333333F, -10.26667F, 2, 3, 7);
      upper_jaw_L_1.setTextureSize(128, 64);
      upper_jaw_L_1.mirror = true;
      setRotation(upper_jaw_L_1, 0.296706F, 0.2443461F, 0.0698132F);
      PixelmonModelRenderer upper_jaw_R_1 = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_R_1.addBox(-4.1F, -0.7F, -10.26667F, 2, 3, 7);
      upper_jaw_R_1.setTextureSize(128, 64);
      upper_jaw_R_1.mirror = true;
      setRotation(upper_jaw_R_1, 0.296706F, -0.2443461F, -0.0698132F);
      PixelmonModelRenderer upper_jaw_main = new PixelmonModelRenderer(this, 0, 0);
      upper_jaw_main.addBox(-1.5F, -0.7F, -10.2F, 3, 3, 7);
      upper_jaw_main.setTextureSize(128, 64);
      upper_jaw_main.mirror = true;
      setRotation(upper_jaw_main, 0.296706F, 0F, 0F);
      PixelmonModelRenderer face_R_1 = new PixelmonModelRenderer(this, 0, 0);
      face_R_1.addBox(-4.8F, -2.4F, -0.3333333F, 3, 3, 2);
      face_R_1.setTextureSize(128, 64);
      face_R_1.mirror = true;
      setRotation(face_R_1, -0.0349066F, -0.4014257F, 0.1570796F);
      PixelmonModelRenderer  horn_1_R = new PixelmonModelRenderer(this, 0, 0);
      horn_1_R.addBox(-4.6F, -4.4F, -0.2666667F, 2, 3, 2);
      horn_1_R.setTextureSize(128, 64);
      horn_1_R.mirror = true;
      setRotation(horn_1_R, -0.1047198F, -0.4014257F, 0.0523599F);
      PixelmonModelRenderer horn_2_R = new PixelmonModelRenderer(this, 0, 0);
      horn_2_R.addBox(-2.033333F, -4.866667F, -0.2666667F, 1, 3, 2);
      horn_2_R.setTextureSize(128, 64);
      horn_2_R.mirror = true;
      setRotation(horn_2_R, -0.1047198F, -0.4014257F, -0.296706F);
      PixelmonModelRenderer horn_4_R = new PixelmonModelRenderer(this, 0, 0);
      horn_4_R.addBox(-4.3F, -6.6F, 0.2F, 1, 3, 1);
      horn_4_R.setTextureSize(128, 64);
      horn_4_R.mirror = true;
      setRotation(horn_4_R, -0.1047198F, -0.4014257F, 0.0174533F);
      PixelmonModelRenderer horn_3_R = new PixelmonModelRenderer(this, 0, 0);
      horn_3_R.addBox(-2.8F, -7.066667F, 0.2F, 1, 3, 1);
      horn_3_R.setTextureSize(128, 64);
      horn_3_R.mirror = true;
      setRotation(horn_3_R, -0.1047198F, -0.4014257F, -0.1919862F);
      PixelmonModelRenderer upper_jaw_inside = new PixelmonModelRenderer(this, 0, 35);
      upper_jaw_inside.addBox(-3.5F, 1.4F, -10.86667F, 7, 1, 10);
      upper_jaw_inside.setTextureSize(128, 64);
      upper_jaw_inside.mirror = true;
      setRotation(upper_jaw_inside, 0.296706F, 0F, 0F);
      PixelmonModelRenderer bottom_jaw_main = new PixelmonModelRenderer(this, 0, 0);
      bottom_jaw_main.addBox(-1.5F, 1.566667F, -12.66667F, 3, 2, 12);
      bottom_jaw_main.setTextureSize(128, 64);
      bottom_jaw_main.mirror = true;
      setRotation(bottom_jaw_main, 0.7330383F, 0F, 0F);
      PixelmonModelRenderer bottom_jaw_L = new PixelmonModelRenderer(this, 0, 0);
      bottom_jaw_L.addBox(1.833333F, 1.566667F, -11.73333F, 3, 2, 12);
      bottom_jaw_L.setTextureSize(128, 64);
      bottom_jaw_L.mirror = true;
      setRotation(bottom_jaw_L, 0.7330383F, 0.3141593F, 0.0872665F);
      PixelmonModelRenderer bottom_jaw_R = new PixelmonModelRenderer(this, 0, 0);
      bottom_jaw_R.addBox(-4.8F, 1.566667F, -11.73333F, 3, 2, 12);
      bottom_jaw_R.setTextureSize(128, 64);
      bottom_jaw_R.mirror = true;
      setRotation(bottom_jaw_R, 0.7330383F, -0.3141593F, -0.0872665F);
      PixelmonModelRenderer bottom_jaw_end_1 = new PixelmonModelRenderer(this, 0, 0);
      bottom_jaw_end_1.addBox(-1.5F, -5.833333F, -11.8F, 3, 2, 2);
      bottom_jaw_end_1.setTextureSize(128, 64);
      bottom_jaw_end_1.mirror = true;
      setRotation(bottom_jaw_end_1, 1.48353F, 0F, 0F);
      PixelmonModelRenderer bottom_jaw_end_2 = new PixelmonModelRenderer(this, 0, 0);
      bottom_jaw_end_2.addBox(-1.5F, -1.766667F, -12.4F, 3, 2, 4);
      bottom_jaw_end_2.setTextureSize(128, 64);
      bottom_jaw_end_2.mirror = true;
      setRotation(bottom_jaw_end_2, 1.151917F, 0F, 0F);
      PixelmonModelRenderer bottom_jaw_inside = new PixelmonModelRenderer(this, 40, 17);
      bottom_jaw_inside.addBox(-3.5F, 1.133333F, -12.46667F, 7, 1, 11);
      bottom_jaw_inside.setTextureSize(128, 64);
      bottom_jaw_inside.mirror = true;
      setRotation(bottom_jaw_inside, 0.7504916F, 0F, 0F);
      PixelmonModelRenderer teeth_L = new PixelmonModelRenderer(this, 0, 25);
      teeth_L.addBox(3.433333F, 1.3F, -11.73333F, 1, 2, 7);
      teeth_L.setTextureSize(128, 64);
      teeth_L.mirror = true;
      setRotation(teeth_L, 0.6283185F, 0.3141593F, 0.0872665F);
      PixelmonModelRenderer teeth_R = new PixelmonModelRenderer(this, 0, 25);
      teeth_R.addBox(-5.4F, 1.3F, -11.73333F, 1, 2, 7);
      teeth_R.setTextureSize(128, 64);
      teeth_R.mirror = true;
      setRotation(teeth_R, 0.6283185F, -0.3141593F, -0.0872665F);
    
      
      HEAD.addChild(head_main);
      HEAD.addChild(head_L);
      HEAD.addChild(head_R);
      HEAD.addChild(head_front);
      HEAD.addChild(head_L_back);
      HEAD.addChild(head_R_back);
      HEAD.addChild(upper_jaw_tip_2);
      HEAD.addChild(upper_jaw_tip);
      HEAD.addChild(nose_bottom);
      HEAD.addChild(nose_top);
      HEAD.addChild(nose_);
      HEAD.addChild(head_top_2);
      HEAD.addChild(eye_ridge_R);
      HEAD.addChild(eye_ridge_L);
      HEAD.addChild(horn_2_L);
      HEAD.addChild(horn_1_L);
      HEAD.addChild(horn_3_L);
      HEAD.addChild(horn_4_L);
      HEAD.addChild(face_L_1);
      HEAD.addChild(upper_jaw_R_3_2);
      HEAD.addChild(upper_jaw_R_3);
      HEAD.addChild(upper_jaw_R_2);
      HEAD.addChild(upper_jaw_L_3_2);
      HEAD.addChild(upper_jaw_L_3);
      HEAD.addChild(upper_jaw_L_2);
      HEAD.addChild(head_back);
      HEAD.addChild(upper_jaw_L_1);
      HEAD.addChild(upper_jaw_R_1);
      HEAD.addChild(upper_jaw_main);
      HEAD.addChild(face_R_1);
      HEAD.addChild(horn_1_R);
      HEAD.addChild(horn_2_R);
      HEAD.addChild(horn_4_R);
      HEAD.addChild(horn_3_R);
      HEAD.addChild(upper_jaw_inside);
      HEAD.addChild(bottom_jaw_main);
      HEAD.addChild(bottom_jaw_L);
      HEAD.addChild(bottom_jaw_R);
      HEAD.addChild(bottom_jaw_end_1);
      HEAD.addChild(bottom_jaw_end_2);
      HEAD.addChild(bottom_jaw_inside);
      HEAD.addChild(teeth_L);
      HEAD.addChild(teeth_R);
      BODY.addChild(HEAD);
      
      PixelmonModelRenderer LEGR = new PixelmonModelRenderer(this,"");
      LEGR.setRotationPoint(-4, 5, 5);
      PixelmonModelRenderer leg_1_R = new PixelmonModelRenderer(this, 0, 0);
      leg_1_R.addBox(-1F, -0.9333333F, -4.333333F, 3, 9, 5);
      leg_1_R.setTextureSize(128, 64);
      leg_1_R.mirror = true;
      setRotation(leg_1_R, -0.2268928F, 0.5410521F, 0.2094395F);
      PixelmonModelRenderer leg_2_R = new PixelmonModelRenderer(this, 0, 0);
      leg_2_R.addBox(-0.5F, 6.933333F, -2.066667F, 2, 2, 8);
      leg_2_R.setTextureSize(128, 64);
      leg_2_R.mirror = true;
      setRotation(leg_2_R, -0.4537856F, 0.5410521F, 0.2094395F);
      PixelmonModelRenderer leg_3_R = new PixelmonModelRenderer(this, 0, 0);
      leg_3_R.addBox(-0.5F, 4.5F, 0.8F, 2, 2, 7);
      leg_3_R.setTextureSize(128, 64);
      leg_3_R.mirror = true;
      setRotation(leg_3_R, -0.7504916F, 0.5410521F, 0.2094395F);
      PixelmonModelRenderer foot_R = new PixelmonModelRenderer(this, 0, 0);
      foot_R.addBox(-0.5F, 7.466667F, 3.6F, 2, 3, 1);
      foot_R.setTextureSize(128, 64);
      foot_R.mirror = true;
      setRotation(foot_R, -0.2443461F, 0.5410521F, 0.2094395F);
      PixelmonModelRenderer  toe_back_R = new PixelmonModelRenderer(this, 0, 0);
      toe_back_R.addBox(0F, 3.8F, 4.533333F, 1, 3, 1);
      toe_back_R.setTextureSize(128, 64);
      toe_back_R.mirror = true;
      setRotation(toe_back_R, -0.3839724F, 0.5410521F, 0.2094395F);
      PixelmonModelRenderer toe_R_2 = new PixelmonModelRenderer(this, 0, 0);
      toe_R_2.addBox(2.5F, 8.266666F, 1.933333F, 1, 4, 1);
      toe_R_2.setTextureSize(128, 64);
      toe_R_2.mirror = true;
      setRotation(toe_R_2, -0.0872665F, 0.5235988F, 0.4886922F);
      PixelmonModelRenderer  toe_R_1 = new PixelmonModelRenderer(this, 0, 0);
      toe_R_1.addBox(-1.5F, 8.933333F, 1.933333F, 1, 4, 1);
      toe_R_1.setTextureSize(128, 64);
      toe_R_1.mirror = true;
      setRotation(toe_R_1, -0.0872665F, 0.5410521F, 0F);
      
      LEGR.addChild(leg_1_R);
      LEGR.addChild(leg_2_R);
      LEGR.addChild(leg_3_R);
      LEGR.addChild(foot_R);
      LEGR.addChild(toe_back_R);
      LEGR.addChild(toe_R_2);
      LEGR.addChild(toe_R_1);
      BODY.addChild(LEGR);
      
      
      PixelmonModelRenderer LEGL = new PixelmonModelRenderer(this,"");
      LEGL.setRotationPoint(4, 5, 5);
      PixelmonModelRenderer  leg_1_L = new PixelmonModelRenderer(this, 0, 0);
      leg_1_L.addBox(-2F, -0.9333333F, -4.333333F, 3, 9, 5);
      leg_1_L.setTextureSize(128, 64);
      leg_1_L.mirror = true;
      setRotation(leg_1_L, -0.2268928F, -0.5410521F, -0.2094395F);
      PixelmonModelRenderer  leg_2_L = new PixelmonModelRenderer(this, 0, 0);
      leg_2_L.addBox(-1.5F, 6.933333F, -2.066667F, 2, 2, 8);
      leg_2_L.setTextureSize(128, 64);
      leg_2_L.mirror = true;
      setRotation(leg_2_L, -0.4537856F, -0.5410521F, -0.2094395F);
      PixelmonModelRenderer leg_3_L = new PixelmonModelRenderer(this, 0, 0);
      leg_3_L.addBox(-1.5F, 4.8F, 0.8F, 2, 2, 7);
      leg_3_L.setTextureSize(128, 64);
      leg_3_L.mirror = true;
      setRotation(leg_3_L, -0.7504916F, -0.5410521F, -0.2094395F);
      PixelmonModelRenderer foot_L = new PixelmonModelRenderer(this, 0, 0);
      foot_L.addBox(-1.5F, 7.466667F, 3.6F, 2, 3, 1);
      foot_L.setTextureSize(128, 64);
      foot_L.mirror = true;
      setRotation(foot_L, -0.2443461F, -0.5410521F, -0.2094395F);
      PixelmonModelRenderer toe_back_L = new PixelmonModelRenderer(this, 0, 0);
      toe_back_L.addBox(-1F, 3.8F, 4.533333F, 1, 3, 1);
      toe_back_L.setTextureSize(128, 64);
      toe_back_L.mirror = true;
      setRotation(toe_back_L, -0.3839724F, -0.5410521F, -0.2094395F);
      PixelmonModelRenderer toe_L_1 = new PixelmonModelRenderer(this, 0, 0);
      toe_L_1.addBox(0.5F, 8.933333F, 1.933333F, 1, 4, 1);
      toe_L_1.setTextureSize(128, 64);
      toe_L_1.mirror = true;
      setRotation(toe_L_1, -0.0872665F, -0.5410521F, 0F);
      PixelmonModelRenderer toe_L_2 = new PixelmonModelRenderer(this, 0, 0);
      toe_L_2.addBox(-3.5F, 8.266666F, 1.933333F, 1, 4, 1);
      toe_L_2.setTextureSize(128, 64);
      toe_L_2.mirror = true;
      setRotation(toe_L_2, -0.0872665F, -0.5235988F, -0.4886922F);
     
      
      
      LEGL.addChild(leg_1_L);
      LEGL.addChild(leg_2_L);
      LEGL.addChild(leg_3_L);
      LEGL.addChild(foot_L);
      LEGL.addChild(toe_back_L);
      LEGL.addChild(toe_L_1);
      LEGL.addChild(toe_L_2);
      BODY.addChild(LEGL);
      
     
      
      
      PixelmonModelRenderer WINGL = new PixelmonModelRenderer(this,"");
      WINGL.setRotationPoint(3, -1, -3);
      PixelmonModelRenderer wing_membrane_2_L = new PixelmonModelRenderer(this, 40, 2);
      wing_membrane_2_L.addBox(0F, -0.5F, -3F, 31, 1, 26);
      wing_membrane_2_L.setRotationPoint(12F, 0F, 1F);
      wing_membrane_2_L.setTextureSize(128, 64);
      wing_membrane_2_L.mirror = true;
      setRotation(wing_membrane_2_L, -0.2268928F, -0.0872665F, -0.0349066F);
      PixelmonModelRenderer  wing_membrane_1_L = new PixelmonModelRenderer(this, 10, 47);
      wing_membrane_1_L.addBox(0F, 0.5F, 0F, 12, 1, 16);
      wing_membrane_1_L.setTextureSize(128, 64);
      wing_membrane_1_L.mirror = true;
      setRotation(wing_membrane_1_L, -0.2268928F, -0.0872665F, -0.0872665F);
      PixelmonModelRenderer wing_3_L = new PixelmonModelRenderer(this, 0, 0);
      wing_3_L.addBox(0F, -1F, -1F, 22, 1, 1);
      wing_3_L.setRotationPoint(25F, -1F, -1F);
      wing_3_L.setTextureSize(128, 64);
      wing_3_L.mirror = true;
      setRotation(wing_3_L, 0F, -0.715585F, 0.1047198F);
      PixelmonModelRenderer wing_2_L = new PixelmonModelRenderer(this, 0, 0);
      wing_2_L.addBox(0F, -1F, -1F, 14, 2, 2);
      wing_2_L.setRotationPoint(12F, 0F, 1F);
      wing_2_L.setTextureSize(128, 64);
      wing_2_L.mirror = true;
      setRotation(wing_2_L, 0F, 0.1570796F, -0.0872665F);
      PixelmonModelRenderer wing_1_L = new PixelmonModelRenderer(this, 0, 0);
      wing_1_L.addBox(0F, 0F, -1F, 12, 2, 2);
      wing_1_L.setTextureSize(128, 64);
      wing_1_L.mirror = true;
      setRotation(wing_1_L, 0F, -0.0872665F, -0.0872665F);
      PixelmonModelRenderer finger_1_L = new PixelmonModelRenderer(this, 0, 0);
      finger_1_L.addBox(-3F, -1F, -1F, 3, 1, 1);
      finger_1_L.setRotationPoint(25F, -1F, -1F);
      finger_1_L.setTextureSize(128, 64);
      finger_1_L.mirror = true;
      setRotation(finger_1_L, 0F, -0.9599311F, 0F);
      PixelmonModelRenderer finger_2_L = new PixelmonModelRenderer(this, 0, 0);
      finger_2_L.addBox(-3F, -1F, -0.2666667F, 3, 1, 1);
      finger_2_L.setRotationPoint(25F, -1F, -1F);
      finger_2_L.setTextureSize(128, 64);
      finger_2_L.mirror = true;
      setRotation(finger_2_L, 0F, -1.884956F, -0.0872665F);
     PixelmonModelRenderer finger_3_L = new PixelmonModelRenderer(this, 0, 0);
      finger_3_L.addBox(-3F, -1F, -0.2666667F, 3, 1, 1);
      finger_3_L.setRotationPoint(25F, -1F, -1F);
      finger_3_L.setTextureSize(128, 64);
      finger_3_L.mirror = true;
      setRotation(finger_3_L, 0F, -2.478368F, -0.2094395F);
    
      
      
      WINGL.addChild(wing_membrane_2_L);
      WINGL.addChild(wing_membrane_1_L);
      WINGL.addChild(wing_3_L);
      WINGL.addChild(wing_2_L);
      WINGL.addChild(wing_1_L);
      WINGL.addChild(finger_1_L);
      WINGL.addChild(finger_2_L);
      WINGL.addChild(finger_3_L);
      BODY.addChild(WINGL);
      
     
      PixelmonModelRenderer WINGR = new PixelmonModelRenderer(this,"");
      WINGR.setRotationPoint(-3, -1, -3);
      PixelmonModelRenderer wing_membrane_2_R = new PixelmonModelRenderer(this, 40, 37);
      wing_membrane_2_R.addBox(-31F, -0.5F, -3F, 31, 1, 26);
      wing_membrane_2_R.setRotationPoint(-12F, 0F, 1F);
      wing_membrane_2_R.setTextureSize(128, 64);
      wing_membrane_2_R.mirror = true;
      setRotation(wing_membrane_2_R, -0.2268928F, 0.0872665F, 0.0349066F);
      PixelmonModelRenderer wing_membrane_1_R = new PixelmonModelRenderer(this, 10, 29);
      wing_membrane_1_R.addBox(-12F, 0.5F, 0F, 12, 1, 16);
      wing_membrane_1_R.setTextureSize(128, 64);
      wing_membrane_1_R.mirror = true;
      setRotation(wing_membrane_1_R, -0.2268928F, 0.0872665F, 0.0872665F);
      PixelmonModelRenderer  wing_3_R = new PixelmonModelRenderer(this, 0, 0);
      wing_3_R.addBox(-21F, -1F, -1F, 22, 1, 1);
      wing_3_R.setRotationPoint(-25F, -1F, -1F);
      wing_3_R.setTextureSize(128, 64);
      wing_3_R.mirror = true;
      setRotation(wing_3_R, 0F, 0.715585F, -0.1047198F);
      PixelmonModelRenderer  wing_2_R = new PixelmonModelRenderer(this, 0, 0);
      wing_2_R.addBox(-14F, -1F, -1F, 14, 2, 2);
      wing_2_R.setRotationPoint(-12F, 0F, 1F);
      wing_2_R.setTextureSize(128, 64);
      wing_2_R.mirror = true;
      setRotation(wing_2_R, 0F, -0.1570796F, 0.0872665F);
      PixelmonModelRenderer  wing_1_R = new PixelmonModelRenderer(this, 0, 0);
      wing_1_R.addBox(-12F, 0F, -1F, 12, 2, 2);
      wing_1_R.setTextureSize(128, 64);
      wing_1_R.mirror = true;
      setRotation(wing_1_R, 0F, 0.0872665F, 0.0872665F);
      PixelmonModelRenderer  finger_2_R = new PixelmonModelRenderer(this, 0, 0);
      finger_2_R.addBox(0F, -1F, -0.2666667F, 3, 1, 1);
      finger_2_R.setRotationPoint(-25F, -1F, -1F);
      finger_2_R.setTextureSize(128, 64);
      finger_2_R.mirror = true;
      setRotation(finger_2_R, 0F, 1.884956F, 0.0872665F);
      PixelmonModelRenderer  finger_1_R = new PixelmonModelRenderer(this, 0, 0);
      finger_1_R.addBox(0F, -1F, -1F, 3, 1, 1);
      finger_1_R.setRotationPoint(-25F, -1F, -1F);
      finger_1_R.setTextureSize(128, 64);
      finger_1_R.mirror = true;
      setRotation(finger_1_R, 0F, 0.9599311F, 0F);
      PixelmonModelRenderer  finger_3_R = new PixelmonModelRenderer(this, 0, 0);
      finger_3_R.addBox(0F, -1F, -0.2666667F, 3, 1, 1);
      finger_3_R.setRotationPoint(-25F, -1F, -1F);
      finger_3_R.setTextureSize(128, 64);
      finger_3_R.mirror = true;
      setRotation(finger_3_R, 0F, 2.478368F, 0.2094395F);
      
      WINGR.addChild(wing_membrane_2_R);
      WINGR.addChild(wing_membrane_1_R);
      WINGR.addChild(wing_3_R);
      WINGR.addChild(wing_2_R);
      WINGR.addChild(wing_1_R);
      WINGR.addChild(finger_2_R);
      WINGR.addChild(finger_1_R);
      WINGR.addChild(finger_3_R);
      BODY.addChild(WINGR);
      
      ModuleHead headModule = new ModuleHead(HEAD);

		ModuleWing rightWingModule = new ModuleWing(WINGR, EnumWing.Right,
				90, 0.25F, 0.3F);
		ModuleWing leftWingModule = new ModuleWing(WINGL, EnumWing.Left,
				90, 0.25F, 0.3F);

		skeleton = new SkeletonBird(BODY, headModule, leftWingModule,
				rightWingModule, LEGL, LEGR);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
   BODY.render(f5);
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
