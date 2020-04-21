package mumakil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(value=Side.CLIENT)
public class MumakilModel
extends ModelBase {
    ModelRenderer Head;
    ModelRenderer Neck;
    ModelRenderer HeadBump;
    ModelRenderer Chin;
    ModelRenderer LowerLip;
    ModelRenderer Back;
    ModelRenderer LeftSmallEar;
    ModelRenderer LeftBigEar;
    ModelRenderer RightSmallEar;
    ModelRenderer RightBigEar;
    ModelRenderer Hump;
    ModelRenderer Body;
    ModelRenderer Skirt;
    ModelRenderer RightTuskA;
    ModelRenderer RightTuskB;
    ModelRenderer RightTuskC;
    ModelRenderer RightTuskD;
    ModelRenderer LeftTuskA;
    ModelRenderer LeftTuskB;
    ModelRenderer LeftTuskC;
    ModelRenderer LeftTuskD;
    ModelRenderer TrunkA;
    ModelRenderer TrunkB;
    ModelRenderer TrunkC;
    ModelRenderer TrunkD;
    ModelRenderer TrunkE;
    ModelRenderer FrontRightUpperLeg;
    ModelRenderer FrontRightLowerLeg;
    ModelRenderer FrontLeftUpperLeg;
    ModelRenderer FrontLeftLowerLeg;
    ModelRenderer BackRightUpperLeg;
    ModelRenderer BackRightLowerLeg;
    ModelRenderer BackLeftUpperLeg;
    ModelRenderer BackLeftLowerLeg;
    ModelRenderer TailRoot;
    ModelRenderer Tail;
    ModelRenderer TailPlush;
    ModelRenderer StorageRightBedroll;
    ModelRenderer StorageLeftBedroll;
    ModelRenderer StorageFrontRightChest;
    ModelRenderer StorageBackRightChest;
    ModelRenderer StorageFrontLeftChest;
    ModelRenderer StorageBackLeftChest;
    ModelRenderer StorageRightBlankets;
    ModelRenderer StorageLeftBlankets;
    ModelRenderer HarnessBlanket;
    ModelRenderer HarnessUpperBelt;
    ModelRenderer HarnessLowerBelt;
    ModelRenderer CabinPillow;
    ModelRenderer CabinLeftRail;
    ModelRenderer Cabin;
    ModelRenderer CabinRightRail;
    ModelRenderer CabinBackRail;
    ModelRenderer CabinRoof;
    ModelRenderer FortNeckBeam;
    ModelRenderer FortBackBeam;
    ModelRenderer TuskLD1;
    ModelRenderer TuskLD2;
    ModelRenderer TuskLD3;
    ModelRenderer TuskLD4;
    ModelRenderer TuskLD5;
    ModelRenderer TuskRD1;
    ModelRenderer TuskRD2;
    ModelRenderer TuskRD3;
    ModelRenderer TuskRD4;
    ModelRenderer TuskRD5;
    ModelRenderer TuskLI1;
    ModelRenderer TuskLI2;
    ModelRenderer TuskLI3;
    ModelRenderer TuskLI4;
    ModelRenderer TuskLI5;
    ModelRenderer TuskRI1;
    ModelRenderer TuskRI2;
    ModelRenderer TuskRI3;
    ModelRenderer TuskRI4;
    ModelRenderer TuskRI5;
    ModelRenderer TuskLW1;
    ModelRenderer TuskLW2;
    ModelRenderer TuskLW3;
    ModelRenderer TuskLW4;
    ModelRenderer TuskLW5;
    ModelRenderer TuskRW1;
    ModelRenderer TuskRW2;
    ModelRenderer TuskRW3;
    ModelRenderer TuskRW4;
    ModelRenderer TuskRW5;
    ModelRenderer FortFloor1;
    ModelRenderer FortFloor2;
    ModelRenderer FortFloor3;
    ModelRenderer FortBackWall;
    ModelRenderer FortBackLeftWall;
    ModelRenderer FortBackRightWall;
    ModelRenderer StorageUpLeft;
    ModelRenderer StorageUpRight;
    float radianF = 57.29578f;

    public MumakilModel() {
        this.textureWidth = 128;
        this.textureHeight = 256;
        this.Head = new ModelRenderer((ModelBase)this, 60, 0);
        this.Head.addBox(-5.5f, -6.0f, -8.0f, 11, 15, 10);
        this.Head.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.Head, -0.1745329f, 0.0f, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 46, 48);
        this.Neck.addBox(-4.95f, -6.0f, -8.0f, 10, 14, 8);
        this.Neck.setRotationPoint(0.0f, -8.0f, -10.0f);
        this.setRotation(this.Neck, -0.2617994f, 0.0f, 0.0f);
        this.HeadBump = new ModelRenderer((ModelBase)this, 104, 41);
        this.HeadBump.addBox(-3.0f, -9.0f, -6.0f, 6, 3, 6);
        this.HeadBump.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.HeadBump, -0.1745329f, 0.0f, 0.0f);
        this.Chin = new ModelRenderer((ModelBase)this, 86, 56);
        this.Chin.addBox(-1.5f, -6.0f, -10.7f, 3, 5, 4);
        this.Chin.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.Chin, 2.054118f, 0.0f, 0.0f);
        this.LowerLip = new ModelRenderer((ModelBase)this, 80, 65);
        this.LowerLip.addBox(-2.0f, -2.0f, -14.0f, 4, 2, 6);
        this.LowerLip.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.LowerLip, 1.570796f, 0.0f, 0.0f);
        this.Back = new ModelRenderer((ModelBase)this, 0, 48);
        this.Back.addBox(-5.0f, -10.0f, -10.0f, 10, 2, 26);
        this.Back.setRotationPoint(0.0f, -4.0f, -3.0f);
        this.LeftSmallEar = new ModelRenderer((ModelBase)this, 102, 0);
        this.LeftSmallEar.addBox(2.0f, -8.0f, -5.0f, 8, 10, 1);
        this.LeftSmallEar.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.LeftSmallEar, -0.1745329f, -0.5235988f, 0.5235988f);
        this.LeftBigEar = new ModelRenderer((ModelBase)this, 102, 0);
        this.LeftBigEar.addBox(2.0f, -8.0f, -5.0f, 12, 14, 1);
        this.LeftBigEar.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.LeftBigEar, -0.1745329f, -0.5235988f, 0.5235988f);
        this.RightSmallEar = new ModelRenderer((ModelBase)this, 106, 15);
        this.RightSmallEar.addBox(-10.0f, -8.0f, -5.0f, 8, 10, 1);
        this.RightSmallEar.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.RightSmallEar, -0.1745329f, 0.5235988f, -0.5235988f);
        this.RightBigEar = new ModelRenderer((ModelBase)this, 102, 15);
        this.RightBigEar.addBox(-14.0f, -8.0f, -5.0f, 12, 14, 1);
        this.RightBigEar.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.RightBigEar, -0.1745329f, 0.5235988f, -0.5235988f);
        this.Hump = new ModelRenderer((ModelBase)this, 88, 30);
        this.Hump.addBox(-6.0f, -2.0f, -3.0f, 12, 3, 8);
        this.Hump.setRotationPoint(0.0f, -13.0f, -5.5f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 0);
        this.Body.addBox(-8.0f, -10.0f, -10.0f, 16, 20, 28);
        this.Body.setRotationPoint(0.0f, -2.0f, -3.0f);
        this.Skirt = new ModelRenderer((ModelBase)this, 28, 94);
        this.Skirt.addBox(-8.0f, -10.0f, -6.0f, 16, 28, 6);
        this.Skirt.setRotationPoint(0.0f, 8.0f, -3.0f);
        this.setRotation(this.Skirt, 1.570796f, 0.0f, 0.0f);
        this.RightTuskA = new ModelRenderer((ModelBase)this, 2, 60);
        this.RightTuskA.addBox(-3.8f, -3.5f, -19.0f, 2, 2, 10);
        this.RightTuskA.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.RightTuskA, 1.22173f, 0.0f, 0.1745329f);
        this.RightTuskB = new ModelRenderer((ModelBase)this, 0, 0);
        this.RightTuskB.addBox(-3.8f, 6.2f, -24.2f, 2, 2, 7);
        this.RightTuskB.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.RightTuskB, 0.6981317f, 0.0f, 0.1745329f);
        this.RightTuskC = new ModelRenderer((ModelBase)this, 0, 18);
        this.RightTuskC.addBox(-3.8f, 17.1f, -21.9f, 2, 2, 5);
        this.RightTuskC.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.RightTuskC, 0.1745329f, 0.0f, 0.1745329f);
        this.RightTuskD = new ModelRenderer((ModelBase)this, 14, 18);
        this.RightTuskD.addBox(-3.8f, 25.5f, -14.5f, 2, 2, 5);
        this.RightTuskD.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.RightTuskD, -0.3490659f, 0.0f, 0.1745329f);
        this.LeftTuskA = new ModelRenderer((ModelBase)this, 2, 48);
        this.LeftTuskA.addBox(1.8f, -3.5f, -19.0f, 2, 2, 10);
        this.LeftTuskA.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.LeftTuskA, 1.22173f, 0.0f, -0.1745329f);
        this.LeftTuskB = new ModelRenderer((ModelBase)this, 0, 9);
        this.LeftTuskB.addBox(1.8f, 6.2f, -24.2f, 2, 2, 7);
        this.LeftTuskB.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.LeftTuskB, 0.6981317f, 0.0f, -0.1745329f);
        this.LeftTuskC = new ModelRenderer((ModelBase)this, 0, 18);
        this.LeftTuskC.addBox(1.8f, 17.1f, -21.9f, 2, 2, 5);
        this.LeftTuskC.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.LeftTuskC, 0.1745329f, 0.0f, -0.1745329f);
        this.LeftTuskD = new ModelRenderer((ModelBase)this, 14, 18);
        this.LeftTuskD.addBox(1.8f, 25.5f, -14.5f, 2, 2, 5);
        this.LeftTuskD.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.LeftTuskD, -0.3490659f, 0.0f, -0.1745329f);
        this.TrunkA = new ModelRenderer((ModelBase)this, 0, 76);
        this.TrunkA.addBox(-4.0f, -2.5f, -18.0f, 8, 7, 10);
        this.TrunkA.setRotationPoint(0.0f, -3.0f, -22.46667f);
        this.setRotation(this.TrunkA, 1.570796f, 0.0f, 0.0f);
        this.TrunkB = new ModelRenderer((ModelBase)this, 0, 93);
        this.TrunkB.addBox(-3.0f, -2.5f, -7.0f, 6, 5, 7);
        this.TrunkB.setRotationPoint(0.0f, 6.5f, -22.5f);
        this.setRotation(this.TrunkB, 1.658063f, 0.0f, 0.0f);
        this.TrunkC = new ModelRenderer((ModelBase)this, 0, 105);
        this.TrunkC.addBox(-2.5f, -2.0f, -4.0f, 5, 4, 5);
        this.TrunkC.setRotationPoint(0.0f, 13.0f, -22.0f);
        this.setRotation(this.TrunkC, 1.919862f, 0.0f, 0.0f);
        this.TrunkD = new ModelRenderer((ModelBase)this, 0, 114);
        this.TrunkD.addBox(-2.0f, -1.5f, -5.0f, 4, 3, 5);
        this.TrunkD.setRotationPoint(0.0f, 16.0f, -21.5f);
        this.setRotation(this.TrunkD, 2.216568f, 0.0f, 0.0f);
        this.TrunkE = new ModelRenderer((ModelBase)this, 0, 122);
        this.TrunkE.addBox(-1.5f, -1.0f, -4.0f, 3, 2, 4);
        this.TrunkE.setRotationPoint(0.0f, 19.5f, -19.0f);
        this.setRotation(this.TrunkE, 2.530727f, 0.0f, 0.0f);
        this.FrontRightUpperLeg = new ModelRenderer((ModelBase)this, 100, 109);
        this.FrontRightUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
        this.FrontRightUpperLeg.setRotationPoint(-4.6f, 4.0f, -9.6f);
        this.FrontRightLowerLeg = new ModelRenderer((ModelBase)this, 100, 73);
        this.FrontRightLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
        this.FrontRightLowerLeg.setRotationPoint(-4.6f, 14.0f, -9.6f);
        this.FrontLeftUpperLeg = new ModelRenderer((ModelBase)this, 100, 90);
        this.FrontLeftUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
        this.FrontLeftUpperLeg.setRotationPoint(4.6f, 4.0f, -9.6f);
        this.FrontLeftLowerLeg = new ModelRenderer((ModelBase)this, 72, 73);
        this.FrontLeftLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
        this.FrontLeftLowerLeg.setRotationPoint(4.6f, 14.0f, -9.6f);
        this.BackRightUpperLeg = new ModelRenderer((ModelBase)this, 72, 109);
        this.BackRightUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
        this.BackRightUpperLeg.setRotationPoint(-4.6f, 4.0f, 11.6f);
        this.BackRightLowerLeg = new ModelRenderer((ModelBase)this, 100, 56);
        this.BackRightLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
        this.BackRightLowerLeg.setRotationPoint(-4.6f, 14.0f, 11.6f);
        this.BackLeftUpperLeg = new ModelRenderer((ModelBase)this, 72, 90);
        this.BackLeftUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
        this.BackLeftUpperLeg.setRotationPoint(4.6f, 4.0f, 11.6f);
        this.BackLeftLowerLeg = new ModelRenderer((ModelBase)this, 44, 77);
        this.BackLeftLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
        this.BackLeftLowerLeg.setRotationPoint(4.6f, 14.0f, 11.6f);
        this.TailRoot = new ModelRenderer((ModelBase)this, 20, 105);
        this.TailRoot.addBox(-1.0f, 0.0f, -2.0f, 2, 10, 2);
        this.TailRoot.setRotationPoint(0.0f, -8.0f, 15.0f);
        this.setRotation(this.TailRoot, 0.296706f, 0.0f, 0.0f);
        this.Tail = new ModelRenderer((ModelBase)this, 20, 117);
        this.Tail.addBox(-1.0f, 9.7f, -0.2f, 2, 6, 2);
        this.Tail.setRotationPoint(0.0f, -8.0f, 15.0f);
        this.setRotation(this.Tail, 0.1134464f, 0.0f, 0.0f);
        this.TailPlush = new ModelRenderer((ModelBase)this, 26, 76);
        this.TailPlush.addBox(-1.5f, 15.5f, -0.7f, 3, 6, 3);
        this.TailPlush.setRotationPoint(0.0f, -8.0f, 15.0f);
        this.setRotation(this.TailPlush, 0.1134464f, 0.0f, 0.0f);
        this.StorageRightBedroll = new ModelRenderer((ModelBase)this, 90, 231);
        this.StorageRightBedroll.addBox(-2.5f, 8.0f, -8.0f, 3, 3, 16);
        this.StorageRightBedroll.setRotationPoint(-9.0f, -10.2f, 1.0f);
        this.setRotation(this.StorageRightBedroll, 0.0f, 0.0f, 0.418879f);
        this.StorageLeftBedroll = new ModelRenderer((ModelBase)this, 90, 231);
        this.StorageLeftBedroll.addBox(-0.5f, 8.0f, -8.0f, 3, 3, 16);
        this.StorageLeftBedroll.setRotationPoint(9.0f, -10.2f, 1.0f);
        this.setRotation(this.StorageLeftBedroll, 0.0f, 0.0f, -0.418879f);
        this.StorageFrontRightChest = new ModelRenderer((ModelBase)this, 76, 208);
        this.StorageFrontRightChest.addBox(-3.5f, 0.0f, -5.0f, 5, 8, 10);
        this.StorageFrontRightChest.setRotationPoint(-11.0f, -1.2f, -4.5f);
        this.setRotation(this.StorageFrontRightChest, 0.0f, 0.0f, -0.2617994f);
        this.StorageBackRightChest = new ModelRenderer((ModelBase)this, 76, 208);
        this.StorageBackRightChest.addBox(-3.5f, 0.0f, -5.0f, 5, 8, 10);
        this.StorageBackRightChest.setRotationPoint(-11.0f, -1.2f, 6.5f);
        this.setRotation(this.StorageBackRightChest, 0.0f, 0.0f, -0.2617994f);
        this.StorageFrontLeftChest = new ModelRenderer((ModelBase)this, 76, 226);
        this.StorageFrontLeftChest.addBox(-1.5f, 0.0f, -5.0f, 5, 8, 10);
        this.StorageFrontLeftChest.setRotationPoint(11.0f, -1.2f, -4.5f);
        this.setRotation(this.StorageFrontLeftChest, 0.0f, 0.0f, 0.2617994f);
        this.StorageBackLeftChest = new ModelRenderer((ModelBase)this, 76, 226);
        this.StorageBackLeftChest.addBox(-1.5f, 0.0f, -5.0f, 5, 8, 10);
        this.StorageBackLeftChest.setRotationPoint(11.0f, -1.2f, 6.5f);
        this.setRotation(this.StorageBackLeftChest, 0.0f, 0.0f, 0.2617994f);
        this.StorageRightBlankets = new ModelRenderer((ModelBase)this, 0, 228);
        this.StorageRightBlankets.addBox(-4.5f, -1.0f, -7.0f, 5, 10, 14);
        this.StorageRightBlankets.setRotationPoint(-9.0f, -10.2f, 1.0f);
        this.StorageLeftBlankets = new ModelRenderer((ModelBase)this, 38, 228);
        this.StorageLeftBlankets.addBox(-0.5f, -1.0f, -7.0f, 5, 10, 14);
        this.StorageLeftBlankets.setRotationPoint(9.0f, -10.2f, 1.0f);
        this.HarnessBlanket = new ModelRenderer((ModelBase)this, 0, 196);
        this.HarnessBlanket.addBox(-8.5f, -2.0f, -3.0f, 17, 14, 18);
        this.HarnessBlanket.setRotationPoint(0.0f, -13.2f, -3.5f);
        this.HarnessUpperBelt = new ModelRenderer((ModelBase)this, 70, 196);
        this.HarnessUpperBelt.addBox(-8.5f, 0.5f, -2.0f, 17, 10, 2);
        this.HarnessUpperBelt.setRotationPoint(0.0f, -2.0f, -2.5f);
        this.HarnessLowerBelt = new ModelRenderer((ModelBase)this, 70, 196);
        this.HarnessLowerBelt.addBox(-8.5f, 0.5f, -2.5f, 17, 10, 2);
        this.HarnessLowerBelt.setRotationPoint(0.0f, -2.0f, 7.0f);
        this.CabinPillow = new ModelRenderer((ModelBase)this, 76, 146);
        this.CabinPillow.addBox(-6.5f, 0.0f, -6.5f, 13, 4, 13);
        this.CabinPillow.setRotationPoint(0.0f, -16.0f, 2.0f);
        this.CabinLeftRail = new ModelRenderer((ModelBase)this, 56, 147);
        this.CabinLeftRail.addBox(-7.0f, 0.0f, 7.0f, 14, 1, 1);
        this.CabinLeftRail.setRotationPoint(0.0f, -23.0f, 1.5f);
        this.setRotation(this.CabinLeftRail, 0.0f, 1.570796f, 0.0f);
        this.Cabin = new ModelRenderer((ModelBase)this, 0, 128);
        this.Cabin.addBox(-7.0f, 0.0f, -7.0f, 14, 20, 14);
        this.Cabin.setRotationPoint(0.0f, -35.0f, 2.0f);
        this.CabinRightRail = new ModelRenderer((ModelBase)this, 56, 147);
        this.CabinRightRail.addBox(-7.0f, 0.0f, 7.0f, 14, 1, 1);
        this.CabinRightRail.setRotationPoint(0.0f, -23.0f, 1.5f);
        this.setRotation(this.CabinRightRail, 0.0f, -1.570796f, 0.0f);
        this.CabinBackRail = new ModelRenderer((ModelBase)this, 56, 147);
        this.CabinBackRail.addBox(-7.0f, 0.0f, 7.0f, 14, 1, 1);
        this.CabinBackRail.setRotationPoint(0.0f, -23.0f, 1.5f);
        this.CabinRoof = new ModelRenderer((ModelBase)this, 56, 128);
        this.CabinRoof.addBox(-7.5f, 0.0f, -7.5f, 15, 4, 15);
        this.CabinRoof.setRotationPoint(0.0f, -34.0f, 2.0f);
        this.FortNeckBeam = new ModelRenderer((ModelBase)this, 26, 180);
        this.FortNeckBeam.addBox(-12.0f, 0.0f, -20.5f, 24, 4, 4);
        this.FortNeckBeam.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.FortBackBeam = new ModelRenderer((ModelBase)this, 26, 180);
        this.FortBackBeam.addBox(-12.0f, 0.0f, 0.0f, 24, 4, 4);
        this.FortBackBeam.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.TuskLD1 = new ModelRenderer((ModelBase)this, 108, 207);
        this.TuskLD1.addBox(1.3f, 5.5f, -24.2f, 3, 3, 7);
        this.TuskLD1.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLD1, 0.6981317f, 0.0f, -0.1745329f);
        this.TuskLD2 = new ModelRenderer((ModelBase)this, 112, 199);
        this.TuskLD2.addBox(1.29f, 16.5f, -21.9f, 3, 3, 5);
        this.TuskLD2.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLD2, 0.1745329f, 0.0f, -0.1745329f);
        this.TuskLD3 = new ModelRenderer((ModelBase)this, 110, 190);
        this.TuskLD3.addBox(1.3f, 24.9f, -15.5f, 3, 3, 6);
        this.TuskLD3.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLD3, -0.3490659f, 0.0f, -0.1745329f);
        this.TuskLD4 = new ModelRenderer((ModelBase)this, 86, 175);
        this.TuskLD4.addBox(2.7f, 14.5f, -21.9f, 0, 7, 5);
        this.TuskLD4.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLD4, 0.1745329f, 0.0f, -0.1745329f);
        this.TuskLD5 = new ModelRenderer((ModelBase)this, 112, 225);
        this.TuskLD5.addBox(2.7f, 22.9f, -17.5f, 0, 7, 8);
        this.TuskLD5.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLD5, -0.3490659f, 0.0f, -0.1745329f);
        this.TuskRD1 = new ModelRenderer((ModelBase)this, 108, 207);
        this.TuskRD1.addBox(-4.3f, 5.5f, -24.2f, 3, 3, 7);
        this.TuskRD1.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRD1, 0.6981317f, 0.0f, 0.1745329f);
        this.TuskRD2 = new ModelRenderer((ModelBase)this, 112, 199);
        this.TuskRD2.addBox(-4.29f, 16.5f, -21.9f, 3, 3, 5);
        this.TuskRD2.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRD2, 0.1745329f, 0.0f, 0.1745329f);
        this.TuskRD3 = new ModelRenderer((ModelBase)this, 110, 190);
        this.TuskRD3.addBox(-4.3f, 24.9f, -15.5f, 3, 3, 6);
        this.TuskRD3.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRD3, -0.3490659f, 0.0f, 0.1745329f);
        this.TuskRD4 = new ModelRenderer((ModelBase)this, 86, 163);
        this.TuskRD4.addBox(-2.8f, 14.5f, -21.9f, 0, 7, 5);
        this.TuskRD4.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRD4, 0.1745329f, 0.0f, 0.1745329f);
        this.TuskRD5 = new ModelRenderer((ModelBase)this, 112, 232);
        this.TuskRD5.addBox(-2.8f, 22.9f, -17.5f, 0, 7, 8);
        this.TuskRD5.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRD5, -0.3490659f, 0.0f, 0.1745329f);
        this.TuskLI1 = new ModelRenderer((ModelBase)this, 108, 180);
        this.TuskLI1.addBox(1.3f, 5.5f, -24.2f, 3, 3, 7);
        this.TuskLI1.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLI1, 0.6981317f, 0.0f, -0.1745329f);
        this.TuskLI2 = new ModelRenderer((ModelBase)this, 112, 172);
        this.TuskLI2.addBox(1.29f, 16.5f, -21.9f, 3, 3, 5);
        this.TuskLI2.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLI2, 0.1745329f, 0.0f, -0.1745329f);
        this.TuskLI3 = new ModelRenderer((ModelBase)this, 110, 163);
        this.TuskLI3.addBox(1.3f, 24.9f, -15.5f, 3, 3, 6);
        this.TuskLI3.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLI3, -0.3490659f, 0.0f, -0.1745329f);
        this.TuskLI4 = new ModelRenderer((ModelBase)this, 96, 175);
        this.TuskLI4.addBox(2.7f, 14.5f, -21.9f, 0, 7, 5);
        this.TuskLI4.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLI4, 0.1745329f, 0.0f, -0.1745329f);
        this.TuskLI5 = new ModelRenderer((ModelBase)this, 112, 209);
        this.TuskLI5.addBox(2.7f, 22.9f, -17.5f, 0, 7, 8);
        this.TuskLI5.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLI5, -0.3490659f, 0.0f, -0.1745329f);
        this.TuskRI1 = new ModelRenderer((ModelBase)this, 108, 180);
        this.TuskRI1.addBox(-4.3f, 5.5f, -24.2f, 3, 3, 7);
        this.TuskRI1.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRI1, 0.6981317f, 0.0f, 0.1745329f);
        this.TuskRI2 = new ModelRenderer((ModelBase)this, 112, 172);
        this.TuskRI2.addBox(-4.29f, 16.5f, -21.9f, 3, 3, 5);
        this.TuskRI2.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRI2, 0.1745329f, 0.0f, 0.1745329f);
        this.TuskRI3 = new ModelRenderer((ModelBase)this, 110, 163);
        this.TuskRI3.addBox(-4.3f, 24.9f, -15.5f, 3, 3, 6);
        this.TuskRI3.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRI3, -0.3490659f, 0.0f, 0.1745329f);
        this.TuskRI4 = new ModelRenderer((ModelBase)this, 96, 163);
        this.TuskRI4.addBox(-2.8f, 14.5f, -21.9f, 0, 7, 5);
        this.TuskRI4.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRI4, 0.1745329f, 0.0f, 0.1745329f);
        this.TuskRI5 = new ModelRenderer((ModelBase)this, 112, 216);
        this.TuskRI5.addBox(-2.8f, 22.9f, -17.5f, 0, 7, 8);
        this.TuskRI5.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRI5, -0.3490659f, 0.0f, 0.1745329f);
        this.TuskLW1 = new ModelRenderer((ModelBase)this, 56, 166);
        this.TuskLW1.addBox(1.3f, 5.5f, -24.2f, 3, 3, 7);
        this.TuskLW1.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLW1, 0.6981317f, 0.0f, -0.1745329f);
        this.TuskLW2 = new ModelRenderer((ModelBase)this, 60, 158);
        this.TuskLW2.addBox(1.29f, 16.5f, -21.9f, 3, 3, 5);
        this.TuskLW2.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLW2, 0.1745329f, 0.0f, -0.1745329f);
        this.TuskLW3 = new ModelRenderer((ModelBase)this, 58, 149);
        this.TuskLW3.addBox(1.3f, 24.9f, -15.5f, 3, 3, 6);
        this.TuskLW3.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLW3, -0.3490659f, 0.0f, -0.1745329f);
        this.TuskLW4 = new ModelRenderer((ModelBase)this, 46, 164);
        this.TuskLW4.addBox(2.7f, 14.5f, -21.9f, 0, 7, 5);
        this.TuskLW4.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLW4, 0.1745329f, 0.0f, -0.1745329f);
        this.TuskLW5 = new ModelRenderer((ModelBase)this, 52, 192);
        this.TuskLW5.addBox(2.7f, 22.9f, -17.5f, 0, 7, 8);
        this.TuskLW5.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskLW5, -0.3490659f, 0.0f, -0.1745329f);
        this.TuskRW1 = new ModelRenderer((ModelBase)this, 56, 166);
        this.TuskRW1.addBox(-4.3f, 5.5f, -24.2f, 3, 3, 7);
        this.TuskRW1.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRW1, 0.6981317f, 0.0f, 0.1745329f);
        this.TuskRW2 = new ModelRenderer((ModelBase)this, 60, 158);
        this.TuskRW2.addBox(-4.29f, 16.5f, -21.9f, 3, 3, 5);
        this.TuskRW2.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRW2, 0.1745329f, 0.0f, 0.1745329f);
        this.TuskRW3 = new ModelRenderer((ModelBase)this, 58, 149);
        this.TuskRW3.addBox(-4.3f, 24.9f, -15.5f, 3, 3, 6);
        this.TuskRW3.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRW3, -0.3490659f, 0.0f, 0.1745329f);
        this.TuskRW4 = new ModelRenderer((ModelBase)this, 46, 157);
        this.TuskRW4.addBox(-2.8f, 14.5f, -21.9f, 0, 7, 5);
        this.TuskRW4.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRW4, 0.1745329f, 0.0f, 0.1745329f);
        this.TuskRW5 = new ModelRenderer((ModelBase)this, 52, 199);
        this.TuskRW5.addBox(-2.8f, 22.9f, -17.5f, 0, 7, 8);
        this.TuskRW5.setRotationPoint(0.0f, -10.0f, -16.5f);
        this.setRotation(this.TuskRW5, -0.3490659f, 0.0f, 0.1745329f);
        this.FortFloor1 = new ModelRenderer((ModelBase)this, 0, 176);
        this.FortFloor1.addBox(-0.5f, -20.0f, -6.0f, 1, 8, 12);
        this.FortFloor1.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.setRotation(this.FortFloor1, 1.570796f, 0.0f, 1.570796f);
        this.FortFloor2 = new ModelRenderer((ModelBase)this, 0, 176);
        this.FortFloor2.addBox(-0.5f, -12.0f, -6.0f, 1, 8, 12);
        this.FortFloor2.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.setRotation(this.FortFloor2, 1.570796f, 0.0f, 1.570796f);
        this.FortFloor3 = new ModelRenderer((ModelBase)this, 0, 176);
        this.FortFloor3.addBox(-0.5f, -4.0f, -6.0f, 1, 8, 12);
        this.FortFloor3.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.setRotation(this.FortFloor3, 1.570796f, 0.0f, 1.570796f);
        this.FortBackWall = new ModelRenderer((ModelBase)this, 0, 176);
        this.FortBackWall.addBox(-5.0f, -6.2f, -6.0f, 1, 8, 12);
        this.FortBackWall.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.setRotation(this.FortBackWall, 0.0f, 1.570796f, 0.0f);
        this.FortBackLeftWall = new ModelRenderer((ModelBase)this, 0, 176);
        this.FortBackLeftWall.addBox(6.0f, -6.0f, -7.0f, 1, 8, 12);
        this.FortBackLeftWall.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.FortBackRightWall = new ModelRenderer((ModelBase)this, 0, 176);
        this.FortBackRightWall.addBox(-7.0f, -6.0f, -7.0f, 1, 8, 12);
        this.FortBackRightWall.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.StorageUpLeft = new ModelRenderer((ModelBase)this, 76, 226);
        this.StorageUpLeft.addBox(6.5f, 1.0f, -14.0f, 5, 8, 10);
        this.StorageUpLeft.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.setRotation(this.StorageUpLeft, 0.0f, 0.0f, -0.3839724f);
        this.StorageUpRight = new ModelRenderer((ModelBase)this, 76, 208);
        this.StorageUpRight.addBox(-11.5f, 1.0f, -14.0f, 5, 8, 10);
        this.StorageUpRight.setRotationPoint(0.0f, -16.0f, 10.0f);
        this.setRotation(this.StorageUpRight, 0.0f, 0.0f, 0.3839724f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	MumakilEntity elephant = (MumakilEntity)entity;
        byte tusks = 0;
        int type = 3;
        byte harness = 0;
        byte storage = 0;
        boolean sitting = false;
        boolean moveTail = false;
        this.setRotationAngles(f, f1, f2, f3, f4, f5, tusks, sitting, moveTail);
        if (tusks == 0) {
            this.LeftTuskB.render(f5);
            this.RightTuskB.render(f5);
                this.LeftTuskC.render(f5);
                this.RightTuskC.render(f5);
                this.LeftTuskD.render(f5);
                this.RightTuskD.render(f5);
        } else if (tusks == 1) {
            this.TuskLW1.render(f5);
            this.TuskLW2.render(f5);
            this.TuskLW3.render(f5);
            this.TuskLW4.render(f5);
            this.TuskLW5.render(f5);
            this.TuskRW1.render(f5);
            this.TuskRW2.render(f5);
            this.TuskRW3.render(f5);
            this.TuskRW4.render(f5);
            this.TuskRW5.render(f5);
        } else if (tusks == 2) {
            this.TuskLI1.render(f5);
            this.TuskLI2.render(f5);
            this.TuskLI3.render(f5);
            this.TuskLI4.render(f5);
            this.TuskLI5.render(f5);
            this.TuskRI1.render(f5);
            this.TuskRI2.render(f5);
            this.TuskRI3.render(f5);
            this.TuskRI4.render(f5);
            this.TuskRI5.render(f5);
        } else if (tusks == 3) {
            this.TuskLD1.render(f5);
            this.TuskLD2.render(f5);
            this.TuskLD3.render(f5);
            this.TuskLD4.render(f5);
            this.TuskLD5.render(f5);
            this.TuskRD1.render(f5);
            this.TuskRD2.render(f5);
            this.TuskRD3.render(f5);
            this.TuskRD4.render(f5);
            this.TuskRD5.render(f5);
        }
        if (type == 1) {
            this.LeftBigEar.render(f5);
            this.RightBigEar.render(f5);
        } else {
            this.LeftSmallEar.render(f5);
            this.RightSmallEar.render(f5);
        }
        if (type == 3 || type == 4) {
            this.HeadBump.render(f5);
            this.Skirt.render(f5);
        }
        if (harness >= 1) {
            this.HarnessBlanket.render(f5);
            this.HarnessUpperBelt.render(f5);
            this.HarnessLowerBelt.render(f5);
            if (type == 5) {
                this.Skirt.render(f5);
            }
        }
        if (harness == 3) {
            if (type == 5) {
                this.CabinPillow.render(f5);
                this.CabinLeftRail.render(f5);
                this.Cabin.render(f5);
                this.CabinRightRail.render(f5);
                this.CabinBackRail.render(f5);
                this.CabinRoof.render(f5);
            }
            if (type == 4) {
                this.FortBackRightWall.render(f5);
                this.FortBackLeftWall.render(f5);
                this.FortBackWall.render(f5);
                this.FortFloor1.render(f5);
                this.FortFloor2.render(f5);
                this.FortFloor3.render(f5);
                this.FortNeckBeam.render(f5);
                this.FortBackBeam.render(f5);
            }
        }
        if (storage >= 1) {
            this.StorageRightBedroll.render(f5);
            this.StorageFrontRightChest.render(f5);
            this.StorageBackRightChest.render(f5);
            this.StorageRightBlankets.render(f5);
        }
        if (storage >= 2) {
            this.StorageLeftBlankets.render(f5);
            this.StorageLeftBedroll.render(f5);
            this.StorageFrontLeftChest.render(f5);
            this.StorageBackLeftChest.render(f5);
        }
        if (storage >= 3) {
            this.StorageUpLeft.render(f5);
        }
        if (storage >= 4) {
            this.StorageUpRight.render(f5);
        }
        this.Head.render(f5);
        this.Neck.render(f5);
        this.Chin.render(f5);
        this.LowerLip.render(f5);
        this.Back.render(f5);
        this.Hump.render(f5);
        this.Body.render(f5);
        this.RightTuskA.render(f5);
        this.LeftTuskA.render(f5);
        this.TrunkA.render(f5);
        this.TrunkB.render(f5);
        this.TrunkC.render(f5);
        this.TrunkD.render(f5);
        this.TrunkE.render(f5);
        this.FrontRightUpperLeg.render(f5);
        this.FrontRightLowerLeg.render(f5);
        this.FrontLeftUpperLeg.render(f5);
        this.FrontLeftLowerLeg.render(f5);
        this.BackRightUpperLeg.render(f5);
        this.BackRightLowerLeg.render(f5);
        this.BackLeftUpperLeg.render(f5);
        this.BackLeftLowerLeg.render(f5);
        this.TailRoot.render(f5);
        this.Tail.render(f5);
        this.TailPlush.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    private void AdjustY(float f) {
        float yOff = f;
        this.Head.rotationPointY = yOff + -10.0f;
        this.Neck.rotationPointY = yOff + -8.0f;
        this.HeadBump.rotationPointY = yOff + -10.0f;
        this.Chin.rotationPointY = yOff + -10.0f;
        this.LowerLip.rotationPointY = yOff + -10.0f;
        this.Back.rotationPointY = yOff + -4.0f;
        this.LeftSmallEar.rotationPointY = yOff + -10.0f;
        this.LeftBigEar.rotationPointY = yOff + -10.0f;
        this.RightSmallEar.rotationPointY = yOff + -10.0f;
        this.RightBigEar.rotationPointY = yOff + -10.0f;
        this.Hump.rotationPointY = yOff + -13.0f;
        this.Body.rotationPointY = yOff + -2.0f;
        this.Skirt.rotationPointY = yOff + 8.0f;
        this.RightTuskA.rotationPointY = yOff + -10.0f;
        this.RightTuskB.rotationPointY = yOff + -10.0f;
        this.RightTuskC.rotationPointY = yOff + -10.0f;
        this.RightTuskD.rotationPointY = yOff + -10.0f;
        this.LeftTuskA.rotationPointY = yOff + -10.0f;
        this.LeftTuskB.rotationPointY = yOff + -10.0f;
        this.LeftTuskC.rotationPointY = yOff + -10.0f;
        this.LeftTuskD.rotationPointY = yOff + -10.0f;
        this.TrunkA.rotationPointY = yOff + -3.0f;
        this.TrunkB.rotationPointY = yOff + 5.5f;
        this.TrunkC.rotationPointY = yOff + 13.0f;
        this.TrunkD.rotationPointY = yOff + 16.0f;
        this.TrunkE.rotationPointY = yOff + 19.5f;
        this.FrontRightUpperLeg.rotationPointY = yOff + 4.0f;
        this.FrontRightLowerLeg.rotationPointY = yOff + 14.0f;
        this.FrontLeftUpperLeg.rotationPointY = yOff + 4.0f;
        this.FrontLeftLowerLeg.rotationPointY = yOff + 14.0f;
        this.BackRightUpperLeg.rotationPointY = yOff + 4.0f;
        this.BackRightLowerLeg.rotationPointY = yOff + 14.0f;
        this.BackLeftUpperLeg.rotationPointY = yOff + 4.0f;
        this.BackLeftLowerLeg.rotationPointY = yOff + 14.0f;
        this.TailRoot.rotationPointY = yOff + -8.0f;
        this.Tail.rotationPointY = yOff + -8.0f;
        this.TailPlush.rotationPointY = yOff + -8.0f;
        this.StorageRightBedroll.rotationPointY = yOff + -10.2f;
        this.StorageLeftBedroll.rotationPointY = yOff + -10.2f;
        this.StorageFrontRightChest.rotationPointY = yOff + -1.2f;
        this.StorageBackRightChest.rotationPointY = yOff + -1.2f;
        this.StorageFrontLeftChest.rotationPointY = yOff + -1.2f;
        this.StorageBackLeftChest.rotationPointY = yOff + -1.2f;
        this.StorageRightBlankets.rotationPointY = yOff + -10.2f;
        this.StorageLeftBlankets.rotationPointY = yOff + -10.2f;
        this.HarnessBlanket.rotationPointY = yOff + -13.2f;
        this.HarnessUpperBelt.rotationPointY = yOff + -2.0f;
        this.HarnessLowerBelt.rotationPointY = yOff + -2.0f;
        this.CabinPillow.rotationPointY = yOff + -16.0f;
        this.CabinLeftRail.rotationPointY = yOff + -23.0f;
        this.Cabin.rotationPointY = yOff + -35.0f;
        this.CabinRightRail.rotationPointY = yOff + -23.0f;
        this.CabinBackRail.rotationPointY = yOff + -23.0f;
        this.CabinRoof.rotationPointY = yOff + -34.0f;
        this.FortBackRightWall.rotationPointY = yOff + -16.0f;
        this.FortBackLeftWall.rotationPointY = yOff + -16.0f;
        this.FortBackWall.rotationPointY = yOff + -16.0f;
        this.FortNeckBeam.rotationPointY = yOff + -16.0f;
        this.FortBackBeam.rotationPointY = yOff + -16.0f;
        this.FortFloor1.rotationPointY = yOff + -16.0f;
        this.FortFloor2.rotationPointY = yOff + -16.0f;
        this.FortFloor3.rotationPointY = yOff + -16.0f;
        this.StorageUpLeft.rotationPointY = yOff + -16.0f;
        this.StorageUpRight.rotationPointY = yOff + -16.0f;
        this.TuskLD1.rotationPointY = yOff + -10.0f;
        this.TuskLD2.rotationPointY = yOff + -10.0f;
        this.TuskLD3.rotationPointY = yOff + -10.0f;
        this.TuskLD4.rotationPointY = yOff + -10.0f;
        this.TuskLD5.rotationPointY = yOff + -10.0f;
        this.TuskRD1.rotationPointY = yOff + -10.0f;
        this.TuskRD2.rotationPointY = yOff + -10.0f;
        this.TuskRD3.rotationPointY = yOff + -10.0f;
        this.TuskRD4.rotationPointY = yOff + -10.0f;
        this.TuskRD5.rotationPointY = yOff + -10.0f;
        this.TuskLI1.rotationPointY = yOff + -10.0f;
        this.TuskLI2.rotationPointY = yOff + -10.0f;
        this.TuskLI3.rotationPointY = yOff + -10.0f;
        this.TuskLI4.rotationPointY = yOff + -10.0f;
        this.TuskLI5.rotationPointY = yOff + -10.0f;
        this.TuskRI1.rotationPointY = yOff + -10.0f;
        this.TuskRI2.rotationPointY = yOff + -10.0f;
        this.TuskRI3.rotationPointY = yOff + -10.0f;
        this.TuskRI4.rotationPointY = yOff + -10.0f;
        this.TuskRI5.rotationPointY = yOff + -10.0f;
        this.TuskLW1.rotationPointY = yOff + -10.0f;
        this.TuskLW2.rotationPointY = yOff + -10.0f;
        this.TuskLW3.rotationPointY = yOff + -10.0f;
        this.TuskLW4.rotationPointY = yOff + -10.0f;
        this.TuskLW5.rotationPointY = yOff + -10.0f;
        this.TuskRW1.rotationPointY = yOff + -10.0f;
        this.TuskRW2.rotationPointY = yOff + -10.0f;
        this.TuskRW3.rotationPointY = yOff + -10.0f;
        this.TuskRW4.rotationPointY = yOff + -10.0f;
        this.TuskRW5.rotationPointY = yOff + -10.0f;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, byte tusks, boolean sitting, boolean tail) {
        float RLegXRot = MathHelper.cos((float)(f * 0.6662f + 3.141593f)) * 0.8f * f1;
        float LLegXRot = MathHelper.cos((float)(f * 0.6662f)) * 0.8f * f1;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        float HeadXRot = f4 / 57.29578f;
        if (f3 > 20.0f) {
            f3 = 20.0f;
        }
        if (f3 < -20.0f) {
            f3 = -20.0f;
        }
        float HeadYRot = f3 / 57.29578f;
        float f10 = 0.0f;
        if (sitting) {
            f10 = 8.0f;
        }
        this.AdjustY(f10);
        float TrunkXRot = f1 * 5.0f;
        if ((double)f1 > 0.5) {
        	HeadXRot = 0.0f;
            TrunkXRot = 0.0f;
        } else {
        	HeadXRot = 0.0f;
            TrunkXRot = 0.0f;
        }
        if (sitting) {
        	HeadXRot = 0.0f;
            TrunkXRot = 0.0f;
        }
        this.Head.rotateAngleX = -10.0f / this.radianF + HeadXRot;
        this.HeadBump.rotateAngleY = this.Head.rotateAngleY = HeadYRot;
        this.HeadBump.rotateAngleX = this.Head.rotateAngleX;
        this.RightTuskA.rotateAngleY = HeadYRot;
        this.LeftTuskA.rotateAngleY = HeadYRot;
        this.RightTuskA.rotateAngleX = 70.0f / this.radianF + HeadXRot;
        this.LeftTuskA.rotateAngleX = 70.0f / this.radianF + HeadXRot;
        this.Chin.rotateAngleY = HeadYRot;
        this.Chin.rotateAngleX = 113.0f / this.radianF + HeadXRot;
        this.LowerLip.rotateAngleY = HeadYRot;
        this.LowerLip.rotateAngleX = 85.0f / this.radianF + HeadXRot;
        float EarF = 0.0f;
        float f2a = f2 % 100.0f;
        if (f2a > 60.0f & f2a < 90.0f) {
            EarF = MathHelper.cos((float)(f2 * 0.5f)) * 0.35f;
        }
        this.RightBigEar.rotateAngleY = 30.0f / this.radianF + HeadYRot + EarF;
        this.RightSmallEar.rotateAngleY = 30.0f / this.radianF + HeadYRot + EarF;
        this.LeftBigEar.rotateAngleY = -30.0f / this.radianF + HeadYRot - EarF;
        this.LeftSmallEar.rotateAngleY = -30.0f / this.radianF + HeadYRot - EarF;
        this.RightBigEar.rotateAngleX = -10.0f / this.radianF + HeadXRot;
        this.RightSmallEar.rotateAngleX = -10.0f / this.radianF + HeadXRot;
        this.LeftBigEar.rotateAngleX = -10.0f / this.radianF + HeadXRot;
        this.LeftSmallEar.rotateAngleX = -10.0f / this.radianF + HeadXRot;
        this.TrunkA.rotationPointZ = -22.5f;
        this.adjustAllRotationPoints(this.TrunkA, this.Head);
        this.TrunkA.rotateAngleY = HeadYRot;
        float TrunkARotX = 90.0f - TrunkXRot;
        if (TrunkARotX < 85.0f) {
            TrunkARotX = 85.0f;
        }
        this.TrunkA.rotateAngleX = TrunkARotX / this.radianF + HeadXRot;
        this.TrunkB.rotationPointZ = -22.5f;
        this.adjustAllRotationPoints(this.TrunkB, this.TrunkA);
        this.TrunkB.rotateAngleY = HeadYRot;
        this.TrunkB.rotateAngleX = (95.0f - TrunkXRot * 1.5f) / this.radianF + HeadXRot;
        this.TrunkC.rotationPointZ = -22.5f;
        this.adjustAllRotationPoints(this.TrunkC, this.TrunkB);
        this.TrunkC.rotateAngleY = HeadYRot;
        this.TrunkC.rotateAngleX = (110.0f - TrunkXRot * 3.0f) / this.radianF + HeadXRot;
        this.TrunkD.rotationPointZ = -21.5f;
        this.adjustAllRotationPoints(this.TrunkD, this.TrunkC);
        this.TrunkD.rotateAngleY = HeadYRot;
        this.TrunkD.rotateAngleX = (127.0f - TrunkXRot * 4.5f) / this.radianF + HeadXRot;
        this.TrunkE.rotationPointZ = -19.0f;
        this.adjustAllRotationPoints(this.TrunkE, this.TrunkD);
        this.TrunkE.rotateAngleY = HeadYRot;
        this.TrunkE.rotateAngleX = (145.0f - TrunkXRot * 6.0f) / this.radianF + HeadXRot;
        if (sitting) {
            this.FrontRightUpperLeg.rotateAngleX = -30.0f / this.radianF;
            this.FrontLeftUpperLeg.rotateAngleX = -30.0f / this.radianF;
            this.BackLeftUpperLeg.rotateAngleX = -30.0f / this.radianF;
            this.BackRightUpperLeg.rotateAngleX = -30.0f / this.radianF;
        } else {
            this.FrontRightUpperLeg.rotateAngleX = RLegXRot;
            this.FrontLeftUpperLeg.rotateAngleX = LLegXRot;
            this.BackLeftUpperLeg.rotateAngleX = RLegXRot;
            this.BackRightUpperLeg.rotateAngleX = LLegXRot;
        }
        this.adjustXRotationPoints(this.FrontRightLowerLeg, this.FrontRightUpperLeg);
        this.adjustXRotationPoints(this.BackRightLowerLeg, this.BackRightUpperLeg);
        this.adjustXRotationPoints(this.FrontLeftLowerLeg, this.FrontLeftUpperLeg);
        this.adjustXRotationPoints(this.BackLeftLowerLeg, this.BackLeftUpperLeg);
        if (sitting) {
            this.FrontLeftLowerLeg.rotateAngleX = 90.0f / this.radianF;
            this.FrontRightLowerLeg.rotateAngleX = 90.0f / this.radianF;
            this.BackLeftLowerLeg.rotateAngleX = 90.0f / this.radianF;
            this.BackRightLowerLeg.rotateAngleX = 90.0f / this.radianF;
        } else {
            float LLegXRotD = LLegXRot * 57.29578f;
            float RLegXRotD = RLegXRot * 57.29578f;
            if (LLegXRotD > 0.0f) {
                LLegXRotD *= 2.0f;
            }
            if (RLegXRotD > 0.0f) {
                RLegXRotD *= 2.0f;
            }
            this.FrontLeftLowerLeg.rotateAngleX = LLegXRotD / this.radianF;
            this.FrontRightLowerLeg.rotateAngleX = RLegXRotD / this.radianF;
            this.BackLeftLowerLeg.rotateAngleX = RLegXRotD / this.radianF;
            this.BackRightLowerLeg.rotateAngleX = LLegXRotD / this.radianF;
        }
        if (tusks == 0) {
            this.LeftTuskB.rotateAngleY = HeadYRot;
            this.LeftTuskC.rotateAngleY = HeadYRot;
            this.LeftTuskD.rotateAngleY = HeadYRot;
            this.RightTuskB.rotateAngleY = HeadYRot;
            this.RightTuskC.rotateAngleY = HeadYRot;
            this.RightTuskD.rotateAngleY = HeadYRot;
            this.LeftTuskB.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.LeftTuskC.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.LeftTuskD.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.RightTuskB.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.RightTuskC.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.RightTuskD.rotateAngleX = -20.0f / this.radianF + HeadXRot;
        } else if (tusks == 1) {
            this.TuskLW1.rotateAngleY = HeadYRot;
            this.TuskLW2.rotateAngleY = HeadYRot;
            this.TuskLW3.rotateAngleY = HeadYRot;
            this.TuskLW4.rotateAngleY = HeadYRot;
            this.TuskLW5.rotateAngleY = HeadYRot;
            this.TuskRW1.rotateAngleY = HeadYRot;
            this.TuskRW2.rotateAngleY = HeadYRot;
            this.TuskRW3.rotateAngleY = HeadYRot;
            this.TuskRW4.rotateAngleY = HeadYRot;
            this.TuskRW5.rotateAngleY = HeadYRot;
            this.TuskLW1.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.TuskLW2.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskLW3.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskLW4.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskLW5.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskRW1.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.TuskRW2.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskRW3.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskRW4.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskRW5.rotateAngleX = -20.0f / this.radianF + HeadXRot;
        } else if (tusks == 2) {
            this.TuskLI1.rotateAngleY = HeadYRot;
            this.TuskLI2.rotateAngleY = HeadYRot;
            this.TuskLI3.rotateAngleY = HeadYRot;
            this.TuskLI4.rotateAngleY = HeadYRot;
            this.TuskLI5.rotateAngleY = HeadYRot;
            this.TuskRI1.rotateAngleY = HeadYRot;
            this.TuskRI2.rotateAngleY = HeadYRot;
            this.TuskRI3.rotateAngleY = HeadYRot;
            this.TuskRI4.rotateAngleY = HeadYRot;
            this.TuskRI5.rotateAngleY = HeadYRot;
            this.TuskLI1.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.TuskLI2.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskLI3.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskLI4.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskLI5.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskRI1.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.TuskRI2.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskRI3.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskRI4.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskRI5.rotateAngleX = -20.0f / this.radianF + HeadXRot;
        } else if (tusks == 3) {
            this.TuskLD1.rotateAngleY = HeadYRot;
            this.TuskLD2.rotateAngleY = HeadYRot;
            this.TuskLD3.rotateAngleY = HeadYRot;
            this.TuskLD4.rotateAngleY = HeadYRot;
            this.TuskLD5.rotateAngleY = HeadYRot;
            this.TuskRD1.rotateAngleY = HeadYRot;
            this.TuskRD2.rotateAngleY = HeadYRot;
            this.TuskRD3.rotateAngleY = HeadYRot;
            this.TuskRD4.rotateAngleY = HeadYRot;
            this.TuskRD5.rotateAngleY = HeadYRot;
            this.TuskLD1.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.TuskLD2.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskLD3.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskLD4.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskLD5.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskRD1.rotateAngleX = 40.0f / this.radianF + HeadXRot;
            this.TuskRD2.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskRD3.rotateAngleX = -20.0f / this.radianF + HeadXRot;
            this.TuskRD4.rotateAngleX = 10.0f / this.radianF + HeadXRot;
            this.TuskRD5.rotateAngleX = -20.0f / this.radianF + HeadXRot;
        }
        this.StorageLeftBedroll.rotateAngleX = LLegXRot / 10.0f;
        this.StorageFrontLeftChest.rotateAngleX = LLegXRot / 5.0f;
        this.StorageBackLeftChest.rotateAngleX = LLegXRot / 5.0f;
        this.StorageRightBedroll.rotateAngleX = RLegXRot / 10.0f;
        this.StorageFrontRightChest.rotateAngleX = RLegXRot / 5.0f;
        this.StorageBackRightChest.rotateAngleX = RLegXRot / 5.0f;
        this.FortNeckBeam.rotateAngleZ = LLegXRot / 50.0f;
        this.FortBackBeam.rotateAngleZ = LLegXRot / 50.0f;
        this.FortBackRightWall.rotateAngleZ = LLegXRot / 50.0f;
        this.FortBackLeftWall.rotateAngleZ = LLegXRot / 50.0f;
        this.FortBackWall.rotateAngleX = 0.0f - LLegXRot / 50.0f;
        float tailMov = f1 * 0.9f;
        if (tailMov < 0.0f) {
            tailMov = 0.0f;
        }
        if (tail) {
            this.TailRoot.rotateAngleY = MathHelper.cos((float)(f2 * 0.4f)) * 1.3f;
            tailMov = 30.0f / this.radianF;
        } else {
            this.TailRoot.rotateAngleY = 0.0f;
        }
        this.TailRoot.rotateAngleX = 17.0f / this.radianF + tailMov;
        this.TailPlush.rotateAngleX = this.Tail.rotateAngleX = 6.5f / this.radianF + tailMov;
        this.Tail.rotateAngleY = this.TailPlush.rotateAngleY = this.TailRoot.rotateAngleY;
    }

    private void adjustXRotationPoints(ModelRenderer target, ModelRenderer origin) {
        float distance = target.rotationPointY - origin.rotationPointY;
        if (distance < 0.0f) {
            distance *= -1.0f;
        }
        target.rotationPointZ = origin.rotationPointZ + MathHelper.sin((float)origin.rotateAngleX) * distance;
        target.rotationPointY = origin.rotationPointY + MathHelper.cos((float)origin.rotateAngleX) * distance;
    }

    private void adjustYRotationPoints(ModelRenderer target, ModelRenderer origin) {
        float distanceZ = 0.0f;
        distanceZ = target.rotationPointZ > origin.rotationPointZ ? target.rotationPointZ - origin.rotationPointZ : origin.rotationPointZ - target.rotationPointZ;
        target.rotationPointZ = origin.rotationPointZ - MathHelper.cos((float)origin.rotateAngleY) * distanceZ;
        target.rotationPointX = origin.rotationPointX - MathHelper.sin((float)origin.rotateAngleY) * distanceZ;
    }

    private void adjustAllRotationPoints(ModelRenderer target, ModelRenderer origin) {
        float distanceY = 0.0f;
        distanceY = target.rotationPointY > origin.rotationPointY ? target.rotationPointY - origin.rotationPointY : origin.rotationPointY - target.rotationPointY;
        float distanceZ = 0.0f;
        distanceZ = target.rotationPointZ > origin.rotationPointZ ? target.rotationPointZ - origin.rotationPointZ : origin.rotationPointZ - target.rotationPointZ;
        target.rotationPointY = origin.rotationPointY + MathHelper.sin((float)origin.rotateAngleX) * distanceY;
        target.rotationPointZ = origin.rotationPointZ - MathHelper.cos((float)origin.rotateAngleY) * (MathHelper.cos((float)origin.rotateAngleX) * distanceY);
        target.rotationPointX = origin.rotationPointX - MathHelper.sin((float)origin.rotateAngleY) * (MathHelper.cos((float)origin.rotateAngleX) * distanceY);
    }
}