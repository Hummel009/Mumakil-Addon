package ma;

import cpw.mods.fml.relauncher.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(value = Side.CLIENT)
public class MAModelMumakil extends ModelBase {
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

	public MAModelMumakil() {
		textureWidth = 128;
		textureHeight = 256;
		Head = new ModelRenderer(this, 60, 0);
		Head.addBox(-5.5f, -6.0f, -8.0f, 11, 15, 10);
		Head.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(Head, -0.1745329f, 0.0f, 0.0f);
		Neck = new ModelRenderer(this, 46, 48);
		Neck.addBox(-4.95f, -6.0f, -8.0f, 10, 14, 8);
		Neck.setRotationPoint(0.0f, -8.0f, -10.0f);
		setRotation(Neck, -0.2617994f, 0.0f, 0.0f);
		HeadBump = new ModelRenderer(this, 104, 41);
		HeadBump.addBox(-3.0f, -9.0f, -6.0f, 6, 3, 6);
		HeadBump.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(HeadBump, -0.1745329f, 0.0f, 0.0f);
		Chin = new ModelRenderer(this, 86, 56);
		Chin.addBox(-1.5f, -6.0f, -10.7f, 3, 5, 4);
		Chin.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(Chin, 2.054118f, 0.0f, 0.0f);
		LowerLip = new ModelRenderer(this, 80, 65);
		LowerLip.addBox(-2.0f, -2.0f, -14.0f, 4, 2, 6);
		LowerLip.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(LowerLip, 1.570796f, 0.0f, 0.0f);
		Back = new ModelRenderer(this, 0, 48);
		Back.addBox(-5.0f, -10.0f, -10.0f, 10, 2, 26);
		Back.setRotationPoint(0.0f, -4.0f, -3.0f);
		LeftSmallEar = new ModelRenderer(this, 102, 0);
		LeftSmallEar.addBox(2.0f, -8.0f, -5.0f, 8, 10, 1);
		LeftSmallEar.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(LeftSmallEar, -0.1745329f, -0.5235988f, 0.5235988f);
		LeftBigEar = new ModelRenderer(this, 102, 0);
		LeftBigEar.addBox(2.0f, -8.0f, -5.0f, 12, 14, 1);
		LeftBigEar.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(LeftBigEar, -0.1745329f, -0.5235988f, 0.5235988f);
		RightSmallEar = new ModelRenderer(this, 106, 15);
		RightSmallEar.addBox(-10.0f, -8.0f, -5.0f, 8, 10, 1);
		RightSmallEar.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(RightSmallEar, -0.1745329f, 0.5235988f, -0.5235988f);
		RightBigEar = new ModelRenderer(this, 102, 15);
		RightBigEar.addBox(-14.0f, -8.0f, -5.0f, 12, 14, 1);
		RightBigEar.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(RightBigEar, -0.1745329f, 0.5235988f, -0.5235988f);
		Hump = new ModelRenderer(this, 88, 30);
		Hump.addBox(-6.0f, -2.0f, -3.0f, 12, 3, 8);
		Hump.setRotationPoint(0.0f, -13.0f, -5.5f);
		Body = new ModelRenderer(this, 0, 0);
		Body.addBox(-8.0f, -10.0f, -10.0f, 16, 20, 28);
		Body.setRotationPoint(0.0f, -2.0f, -3.0f);
		Skirt = new ModelRenderer(this, 28, 94);
		Skirt.addBox(-8.0f, -10.0f, -6.0f, 16, 28, 6);
		Skirt.setRotationPoint(0.0f, 8.0f, -3.0f);
		setRotation(Skirt, 1.570796f, 0.0f, 0.0f);
		RightTuskA = new ModelRenderer(this, 2, 60);
		RightTuskA.addBox(-3.8f, -3.5f, -19.0f, 2, 2, 10);
		RightTuskA.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(RightTuskA, 1.22173f, 0.0f, 0.1745329f);
		RightTuskB = new ModelRenderer(this, 0, 0);
		RightTuskB.addBox(-3.8f, 6.2f, -24.2f, 2, 2, 7);
		RightTuskB.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(RightTuskB, 0.6981317f, 0.0f, 0.1745329f);
		RightTuskC = new ModelRenderer(this, 0, 18);
		RightTuskC.addBox(-3.8f, 17.1f, -21.9f, 2, 2, 5);
		RightTuskC.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(RightTuskC, 0.1745329f, 0.0f, 0.1745329f);
		RightTuskD = new ModelRenderer(this, 14, 18);
		RightTuskD.addBox(-3.8f, 25.5f, -14.5f, 2, 2, 5);
		RightTuskD.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(RightTuskD, -0.3490659f, 0.0f, 0.1745329f);
		LeftTuskA = new ModelRenderer(this, 2, 48);
		LeftTuskA.addBox(1.8f, -3.5f, -19.0f, 2, 2, 10);
		LeftTuskA.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(LeftTuskA, 1.22173f, 0.0f, -0.1745329f);
		LeftTuskB = new ModelRenderer(this, 0, 9);
		LeftTuskB.addBox(1.8f, 6.2f, -24.2f, 2, 2, 7);
		LeftTuskB.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(LeftTuskB, 0.6981317f, 0.0f, -0.1745329f);
		LeftTuskC = new ModelRenderer(this, 0, 18);
		LeftTuskC.addBox(1.8f, 17.1f, -21.9f, 2, 2, 5);
		LeftTuskC.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(LeftTuskC, 0.1745329f, 0.0f, -0.1745329f);
		LeftTuskD = new ModelRenderer(this, 14, 18);
		LeftTuskD.addBox(1.8f, 25.5f, -14.5f, 2, 2, 5);
		LeftTuskD.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(LeftTuskD, -0.3490659f, 0.0f, -0.1745329f);
		TrunkA = new ModelRenderer(this, 0, 76);
		TrunkA.addBox(-4.0f, -2.5f, -18.0f, 8, 7, 10);
		TrunkA.setRotationPoint(0.0f, -3.0f, -22.46667f);
		setRotation(TrunkA, 1.570796f, 0.0f, 0.0f);
		TrunkB = new ModelRenderer(this, 0, 93);
		TrunkB.addBox(-3.0f, -2.5f, -7.0f, 6, 5, 7);
		TrunkB.setRotationPoint(0.0f, 6.5f, -22.5f);
		setRotation(TrunkB, 1.658063f, 0.0f, 0.0f);
		TrunkC = new ModelRenderer(this, 0, 105);
		TrunkC.addBox(-2.5f, -2.0f, -4.0f, 5, 4, 5);
		TrunkC.setRotationPoint(0.0f, 13.0f, -22.0f);
		setRotation(TrunkC, 1.919862f, 0.0f, 0.0f);
		TrunkD = new ModelRenderer(this, 0, 114);
		TrunkD.addBox(-2.0f, -1.5f, -5.0f, 4, 3, 5);
		TrunkD.setRotationPoint(0.0f, 16.0f, -21.5f);
		setRotation(TrunkD, 2.216568f, 0.0f, 0.0f);
		TrunkE = new ModelRenderer(this, 0, 122);
		TrunkE.addBox(-1.5f, -1.0f, -4.0f, 3, 2, 4);
		TrunkE.setRotationPoint(0.0f, 19.5f, -19.0f);
		setRotation(TrunkE, 2.530727f, 0.0f, 0.0f);
		FrontRightUpperLeg = new ModelRenderer(this, 100, 109);
		FrontRightUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
		FrontRightUpperLeg.setRotationPoint(-4.6f, 4.0f, -9.6f);
		FrontRightLowerLeg = new ModelRenderer(this, 100, 73);
		FrontRightLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
		FrontRightLowerLeg.setRotationPoint(-4.6f, 14.0f, -9.6f);
		FrontLeftUpperLeg = new ModelRenderer(this, 100, 90);
		FrontLeftUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
		FrontLeftUpperLeg.setRotationPoint(4.6f, 4.0f, -9.6f);
		FrontLeftLowerLeg = new ModelRenderer(this, 72, 73);
		FrontLeftLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
		FrontLeftLowerLeg.setRotationPoint(4.6f, 14.0f, -9.6f);
		BackRightUpperLeg = new ModelRenderer(this, 72, 109);
		BackRightUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
		BackRightUpperLeg.setRotationPoint(-4.6f, 4.0f, 11.6f);
		BackRightLowerLeg = new ModelRenderer(this, 100, 56);
		BackRightLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
		BackRightLowerLeg.setRotationPoint(-4.6f, 14.0f, 11.6f);
		BackLeftUpperLeg = new ModelRenderer(this, 72, 90);
		BackLeftUpperLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 12, 7);
		BackLeftUpperLeg.setRotationPoint(4.6f, 4.0f, 11.6f);
		BackLeftLowerLeg = new ModelRenderer(this, 44, 77);
		BackLeftLowerLeg.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 7);
		BackLeftLowerLeg.setRotationPoint(4.6f, 14.0f, 11.6f);
		TailRoot = new ModelRenderer(this, 20, 105);
		TailRoot.addBox(-1.0f, 0.0f, -2.0f, 2, 10, 2);
		TailRoot.setRotationPoint(0.0f, -8.0f, 15.0f);
		setRotation(TailRoot, 0.296706f, 0.0f, 0.0f);
		Tail = new ModelRenderer(this, 20, 117);
		Tail.addBox(-1.0f, 9.7f, -0.2f, 2, 6, 2);
		Tail.setRotationPoint(0.0f, -8.0f, 15.0f);
		setRotation(Tail, 0.1134464f, 0.0f, 0.0f);
		TailPlush = new ModelRenderer(this, 26, 76);
		TailPlush.addBox(-1.5f, 15.5f, -0.7f, 3, 6, 3);
		TailPlush.setRotationPoint(0.0f, -8.0f, 15.0f);
		setRotation(TailPlush, 0.1134464f, 0.0f, 0.0f);
		StorageRightBedroll = new ModelRenderer(this, 90, 231);
		StorageRightBedroll.addBox(-2.5f, 8.0f, -8.0f, 3, 3, 16);
		StorageRightBedroll.setRotationPoint(-9.0f, -10.2f, 1.0f);
		setRotation(StorageRightBedroll, 0.0f, 0.0f, 0.418879f);
		StorageLeftBedroll = new ModelRenderer(this, 90, 231);
		StorageLeftBedroll.addBox(-0.5f, 8.0f, -8.0f, 3, 3, 16);
		StorageLeftBedroll.setRotationPoint(9.0f, -10.2f, 1.0f);
		setRotation(StorageLeftBedroll, 0.0f, 0.0f, -0.418879f);
		StorageFrontRightChest = new ModelRenderer(this, 76, 208);
		StorageFrontRightChest.addBox(-3.5f, 0.0f, -5.0f, 5, 8, 10);
		StorageFrontRightChest.setRotationPoint(-11.0f, -1.2f, -4.5f);
		setRotation(StorageFrontRightChest, 0.0f, 0.0f, -0.2617994f);
		StorageBackRightChest = new ModelRenderer(this, 76, 208);
		StorageBackRightChest.addBox(-3.5f, 0.0f, -5.0f, 5, 8, 10);
		StorageBackRightChest.setRotationPoint(-11.0f, -1.2f, 6.5f);
		setRotation(StorageBackRightChest, 0.0f, 0.0f, -0.2617994f);
		StorageFrontLeftChest = new ModelRenderer(this, 76, 226);
		StorageFrontLeftChest.addBox(-1.5f, 0.0f, -5.0f, 5, 8, 10);
		StorageFrontLeftChest.setRotationPoint(11.0f, -1.2f, -4.5f);
		setRotation(StorageFrontLeftChest, 0.0f, 0.0f, 0.2617994f);
		StorageBackLeftChest = new ModelRenderer(this, 76, 226);
		StorageBackLeftChest.addBox(-1.5f, 0.0f, -5.0f, 5, 8, 10);
		StorageBackLeftChest.setRotationPoint(11.0f, -1.2f, 6.5f);
		setRotation(StorageBackLeftChest, 0.0f, 0.0f, 0.2617994f);
		StorageRightBlankets = new ModelRenderer(this, 0, 228);
		StorageRightBlankets.addBox(-4.5f, -1.0f, -7.0f, 5, 10, 14);
		StorageRightBlankets.setRotationPoint(-9.0f, -10.2f, 1.0f);
		StorageLeftBlankets = new ModelRenderer(this, 38, 228);
		StorageLeftBlankets.addBox(-0.5f, -1.0f, -7.0f, 5, 10, 14);
		StorageLeftBlankets.setRotationPoint(9.0f, -10.2f, 1.0f);
		HarnessBlanket = new ModelRenderer(this, 0, 196);
		HarnessBlanket.addBox(-8.5f, -2.0f, -3.0f, 17, 14, 18);
		HarnessBlanket.setRotationPoint(0.0f, -13.2f, -3.5f);
		HarnessUpperBelt = new ModelRenderer(this, 70, 196);
		HarnessUpperBelt.addBox(-8.5f, 0.5f, -2.0f, 17, 10, 2);
		HarnessUpperBelt.setRotationPoint(0.0f, -2.0f, -2.5f);
		HarnessLowerBelt = new ModelRenderer(this, 70, 196);
		HarnessLowerBelt.addBox(-8.5f, 0.5f, -2.5f, 17, 10, 2);
		HarnessLowerBelt.setRotationPoint(0.0f, -2.0f, 7.0f);
		CabinPillow = new ModelRenderer(this, 76, 146);
		CabinPillow.addBox(-6.5f, 0.0f, -6.5f, 13, 4, 13);
		CabinPillow.setRotationPoint(0.0f, -16.0f, 2.0f);
		CabinLeftRail = new ModelRenderer(this, 56, 147);
		CabinLeftRail.addBox(-7.0f, 0.0f, 7.0f, 14, 1, 1);
		CabinLeftRail.setRotationPoint(0.0f, -23.0f, 1.5f);
		setRotation(CabinLeftRail, 0.0f, 1.570796f, 0.0f);
		Cabin = new ModelRenderer(this, 0, 128);
		Cabin.addBox(-7.0f, 0.0f, -7.0f, 14, 20, 14);
		Cabin.setRotationPoint(0.0f, -35.0f, 2.0f);
		CabinRightRail = new ModelRenderer(this, 56, 147);
		CabinRightRail.addBox(-7.0f, 0.0f, 7.0f, 14, 1, 1);
		CabinRightRail.setRotationPoint(0.0f, -23.0f, 1.5f);
		setRotation(CabinRightRail, 0.0f, -1.570796f, 0.0f);
		CabinBackRail = new ModelRenderer(this, 56, 147);
		CabinBackRail.addBox(-7.0f, 0.0f, 7.0f, 14, 1, 1);
		CabinBackRail.setRotationPoint(0.0f, -23.0f, 1.5f);
		CabinRoof = new ModelRenderer(this, 56, 128);
		CabinRoof.addBox(-7.5f, 0.0f, -7.5f, 15, 4, 15);
		CabinRoof.setRotationPoint(0.0f, -34.0f, 2.0f);
		FortNeckBeam = new ModelRenderer(this, 26, 180);
		FortNeckBeam.addBox(-12.0f, 0.0f, -20.5f, 24, 4, 4);
		FortNeckBeam.setRotationPoint(0.0f, -16.0f, 10.0f);
		FortBackBeam = new ModelRenderer(this, 26, 180);
		FortBackBeam.addBox(-12.0f, 0.0f, 0.0f, 24, 4, 4);
		FortBackBeam.setRotationPoint(0.0f, -16.0f, 10.0f);
		TuskLD1 = new ModelRenderer(this, 108, 207);
		TuskLD1.addBox(1.3f, 5.5f, -24.2f, 3, 3, 7);
		TuskLD1.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLD1, 0.6981317f, 0.0f, -0.1745329f);
		TuskLD2 = new ModelRenderer(this, 112, 199);
		TuskLD2.addBox(1.29f, 16.5f, -21.9f, 3, 3, 5);
		TuskLD2.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLD2, 0.1745329f, 0.0f, -0.1745329f);
		TuskLD3 = new ModelRenderer(this, 110, 190);
		TuskLD3.addBox(1.3f, 24.9f, -15.5f, 3, 3, 6);
		TuskLD3.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLD3, -0.3490659f, 0.0f, -0.1745329f);
		TuskLD4 = new ModelRenderer(this, 86, 175);
		TuskLD4.addBox(2.7f, 14.5f, -21.9f, 0, 7, 5);
		TuskLD4.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLD4, 0.1745329f, 0.0f, -0.1745329f);
		TuskLD5 = new ModelRenderer(this, 112, 225);
		TuskLD5.addBox(2.7f, 22.9f, -17.5f, 0, 7, 8);
		TuskLD5.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLD5, -0.3490659f, 0.0f, -0.1745329f);
		TuskRD1 = new ModelRenderer(this, 108, 207);
		TuskRD1.addBox(-4.3f, 5.5f, -24.2f, 3, 3, 7);
		TuskRD1.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRD1, 0.6981317f, 0.0f, 0.1745329f);
		TuskRD2 = new ModelRenderer(this, 112, 199);
		TuskRD2.addBox(-4.29f, 16.5f, -21.9f, 3, 3, 5);
		TuskRD2.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRD2, 0.1745329f, 0.0f, 0.1745329f);
		TuskRD3 = new ModelRenderer(this, 110, 190);
		TuskRD3.addBox(-4.3f, 24.9f, -15.5f, 3, 3, 6);
		TuskRD3.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRD3, -0.3490659f, 0.0f, 0.1745329f);
		TuskRD4 = new ModelRenderer(this, 86, 163);
		TuskRD4.addBox(-2.8f, 14.5f, -21.9f, 0, 7, 5);
		TuskRD4.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRD4, 0.1745329f, 0.0f, 0.1745329f);
		TuskRD5 = new ModelRenderer(this, 112, 232);
		TuskRD5.addBox(-2.8f, 22.9f, -17.5f, 0, 7, 8);
		TuskRD5.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRD5, -0.3490659f, 0.0f, 0.1745329f);
		TuskLI1 = new ModelRenderer(this, 108, 180);
		TuskLI1.addBox(1.3f, 5.5f, -24.2f, 3, 3, 7);
		TuskLI1.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLI1, 0.6981317f, 0.0f, -0.1745329f);
		TuskLI2 = new ModelRenderer(this, 112, 172);
		TuskLI2.addBox(1.29f, 16.5f, -21.9f, 3, 3, 5);
		TuskLI2.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLI2, 0.1745329f, 0.0f, -0.1745329f);
		TuskLI3 = new ModelRenderer(this, 110, 163);
		TuskLI3.addBox(1.3f, 24.9f, -15.5f, 3, 3, 6);
		TuskLI3.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLI3, -0.3490659f, 0.0f, -0.1745329f);
		TuskLI4 = new ModelRenderer(this, 96, 175);
		TuskLI4.addBox(2.7f, 14.5f, -21.9f, 0, 7, 5);
		TuskLI4.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLI4, 0.1745329f, 0.0f, -0.1745329f);
		TuskLI5 = new ModelRenderer(this, 112, 209);
		TuskLI5.addBox(2.7f, 22.9f, -17.5f, 0, 7, 8);
		TuskLI5.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLI5, -0.3490659f, 0.0f, -0.1745329f);
		TuskRI1 = new ModelRenderer(this, 108, 180);
		TuskRI1.addBox(-4.3f, 5.5f, -24.2f, 3, 3, 7);
		TuskRI1.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRI1, 0.6981317f, 0.0f, 0.1745329f);
		TuskRI2 = new ModelRenderer(this, 112, 172);
		TuskRI2.addBox(-4.29f, 16.5f, -21.9f, 3, 3, 5);
		TuskRI2.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRI2, 0.1745329f, 0.0f, 0.1745329f);
		TuskRI3 = new ModelRenderer(this, 110, 163);
		TuskRI3.addBox(-4.3f, 24.9f, -15.5f, 3, 3, 6);
		TuskRI3.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRI3, -0.3490659f, 0.0f, 0.1745329f);
		TuskRI4 = new ModelRenderer(this, 96, 163);
		TuskRI4.addBox(-2.8f, 14.5f, -21.9f, 0, 7, 5);
		TuskRI4.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRI4, 0.1745329f, 0.0f, 0.1745329f);
		TuskRI5 = new ModelRenderer(this, 112, 216);
		TuskRI5.addBox(-2.8f, 22.9f, -17.5f, 0, 7, 8);
		TuskRI5.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRI5, -0.3490659f, 0.0f, 0.1745329f);
		TuskLW1 = new ModelRenderer(this, 56, 166);
		TuskLW1.addBox(1.3f, 5.5f, -24.2f, 3, 3, 7);
		TuskLW1.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLW1, 0.6981317f, 0.0f, -0.1745329f);
		TuskLW2 = new ModelRenderer(this, 60, 158);
		TuskLW2.addBox(1.29f, 16.5f, -21.9f, 3, 3, 5);
		TuskLW2.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLW2, 0.1745329f, 0.0f, -0.1745329f);
		TuskLW3 = new ModelRenderer(this, 58, 149);
		TuskLW3.addBox(1.3f, 24.9f, -15.5f, 3, 3, 6);
		TuskLW3.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLW3, -0.3490659f, 0.0f, -0.1745329f);
		TuskLW4 = new ModelRenderer(this, 46, 164);
		TuskLW4.addBox(2.7f, 14.5f, -21.9f, 0, 7, 5);
		TuskLW4.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLW4, 0.1745329f, 0.0f, -0.1745329f);
		TuskLW5 = new ModelRenderer(this, 52, 192);
		TuskLW5.addBox(2.7f, 22.9f, -17.5f, 0, 7, 8);
		TuskLW5.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskLW5, -0.3490659f, 0.0f, -0.1745329f);
		TuskRW1 = new ModelRenderer(this, 56, 166);
		TuskRW1.addBox(-4.3f, 5.5f, -24.2f, 3, 3, 7);
		TuskRW1.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRW1, 0.6981317f, 0.0f, 0.1745329f);
		TuskRW2 = new ModelRenderer(this, 60, 158);
		TuskRW2.addBox(-4.29f, 16.5f, -21.9f, 3, 3, 5);
		TuskRW2.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRW2, 0.1745329f, 0.0f, 0.1745329f);
		TuskRW3 = new ModelRenderer(this, 58, 149);
		TuskRW3.addBox(-4.3f, 24.9f, -15.5f, 3, 3, 6);
		TuskRW3.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRW3, -0.3490659f, 0.0f, 0.1745329f);
		TuskRW4 = new ModelRenderer(this, 46, 157);
		TuskRW4.addBox(-2.8f, 14.5f, -21.9f, 0, 7, 5);
		TuskRW4.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRW4, 0.1745329f, 0.0f, 0.1745329f);
		TuskRW5 = new ModelRenderer(this, 52, 199);
		TuskRW5.addBox(-2.8f, 22.9f, -17.5f, 0, 7, 8);
		TuskRW5.setRotationPoint(0.0f, -10.0f, -16.5f);
		setRotation(TuskRW5, -0.3490659f, 0.0f, 0.1745329f);
		FortFloor1 = new ModelRenderer(this, 0, 176);
		FortFloor1.addBox(-0.5f, -20.0f, -6.0f, 1, 8, 12);
		FortFloor1.setRotationPoint(0.0f, -16.0f, 10.0f);
		setRotation(FortFloor1, 1.570796f, 0.0f, 1.570796f);
		FortFloor2 = new ModelRenderer(this, 0, 176);
		FortFloor2.addBox(-0.5f, -12.0f, -6.0f, 1, 8, 12);
		FortFloor2.setRotationPoint(0.0f, -16.0f, 10.0f);
		setRotation(FortFloor2, 1.570796f, 0.0f, 1.570796f);
		FortFloor3 = new ModelRenderer(this, 0, 176);
		FortFloor3.addBox(-0.5f, -4.0f, -6.0f, 1, 8, 12);
		FortFloor3.setRotationPoint(0.0f, -16.0f, 10.0f);
		setRotation(FortFloor3, 1.570796f, 0.0f, 1.570796f);
		FortBackWall = new ModelRenderer(this, 0, 176);
		FortBackWall.addBox(-5.0f, -6.2f, -6.0f, 1, 8, 12);
		FortBackWall.setRotationPoint(0.0f, -16.0f, 10.0f);
		setRotation(FortBackWall, 0.0f, 1.570796f, 0.0f);
		FortBackLeftWall = new ModelRenderer(this, 0, 176);
		FortBackLeftWall.addBox(6.0f, -6.0f, -7.0f, 1, 8, 12);
		FortBackLeftWall.setRotationPoint(0.0f, -16.0f, 10.0f);
		FortBackRightWall = new ModelRenderer(this, 0, 176);
		FortBackRightWall.addBox(-7.0f, -6.0f, -7.0f, 1, 8, 12);
		FortBackRightWall.setRotationPoint(0.0f, -16.0f, 10.0f);
		StorageUpLeft = new ModelRenderer(this, 76, 226);
		StorageUpLeft.addBox(6.5f, 1.0f, -14.0f, 5, 8, 10);
		StorageUpLeft.setRotationPoint(0.0f, -16.0f, 10.0f);
		setRotation(StorageUpLeft, 0.0f, 0.0f, -0.3839724f);
		StorageUpRight = new ModelRenderer(this, 76, 208);
		StorageUpRight.addBox(-11.5f, 1.0f, -14.0f, 5, 8, 10);
		StorageUpRight.setRotationPoint(0.0f, -16.0f, 10.0f);
		setRotation(StorageUpRight, 0.0f, 0.0f, 0.3839724f);
	}

	private void adjustAllRotationPoints(ModelRenderer target, ModelRenderer origin) {
		float distanceY = target.rotationPointY > origin.rotationPointY ? target.rotationPointY - origin.rotationPointY : origin.rotationPointY - target.rotationPointY;
		target.rotationPointY = origin.rotationPointY + MathHelper.sin(origin.rotateAngleX) * distanceY;
		target.rotationPointZ = origin.rotationPointZ - MathHelper.cos(origin.rotateAngleY) * (MathHelper.cos(origin.rotateAngleX) * distanceY);
		target.rotationPointX = origin.rotationPointX - MathHelper.sin(origin.rotateAngleY) * (MathHelper.cos(origin.rotateAngleX) * distanceY);
	}

	private void adjustXRotationPoints(ModelRenderer target, ModelRenderer origin) {
		float distance = target.rotationPointY - origin.rotationPointY;
		if (distance < 0.0f) {
			distance *= -1.0f;
		}
		target.rotationPointZ = origin.rotationPointZ + MathHelper.sin(origin.rotateAngleX) * distance;
		target.rotationPointY = origin.rotationPointY + MathHelper.cos(origin.rotateAngleX) * distance;
	}

	private void AdjustY(float f) {
		float yOff = f;
		Head.rotationPointY = yOff + -10.0f;
		Neck.rotationPointY = yOff + -8.0f;
		HeadBump.rotationPointY = yOff + -10.0f;
		Chin.rotationPointY = yOff + -10.0f;
		LowerLip.rotationPointY = yOff + -10.0f;
		Back.rotationPointY = yOff + -4.0f;
		LeftSmallEar.rotationPointY = yOff + -10.0f;
		LeftBigEar.rotationPointY = yOff + -10.0f;
		RightSmallEar.rotationPointY = yOff + -10.0f;
		RightBigEar.rotationPointY = yOff + -10.0f;
		Hump.rotationPointY = yOff + -13.0f;
		Body.rotationPointY = yOff + -2.0f;
		Skirt.rotationPointY = yOff + 8.0f;
		RightTuskA.rotationPointY = yOff + -10.0f;
		RightTuskB.rotationPointY = yOff + -10.0f;
		RightTuskC.rotationPointY = yOff + -10.0f;
		RightTuskD.rotationPointY = yOff + -10.0f;
		LeftTuskA.rotationPointY = yOff + -10.0f;
		LeftTuskB.rotationPointY = yOff + -10.0f;
		LeftTuskC.rotationPointY = yOff + -10.0f;
		LeftTuskD.rotationPointY = yOff + -10.0f;
		TrunkA.rotationPointY = yOff + -3.0f;
		TrunkB.rotationPointY = yOff + 5.5f;
		TrunkC.rotationPointY = yOff + 13.0f;
		TrunkD.rotationPointY = yOff + 16.0f;
		TrunkE.rotationPointY = yOff + 19.5f;
		FrontRightUpperLeg.rotationPointY = yOff + 4.0f;
		FrontRightLowerLeg.rotationPointY = yOff + 14.0f;
		FrontLeftUpperLeg.rotationPointY = yOff + 4.0f;
		FrontLeftLowerLeg.rotationPointY = yOff + 14.0f;
		BackRightUpperLeg.rotationPointY = yOff + 4.0f;
		BackRightLowerLeg.rotationPointY = yOff + 14.0f;
		BackLeftUpperLeg.rotationPointY = yOff + 4.0f;
		BackLeftLowerLeg.rotationPointY = yOff + 14.0f;
		TailRoot.rotationPointY = yOff + -8.0f;
		Tail.rotationPointY = yOff + -8.0f;
		TailPlush.rotationPointY = yOff + -8.0f;
		StorageRightBedroll.rotationPointY = yOff + -10.2f;
		StorageLeftBedroll.rotationPointY = yOff + -10.2f;
		StorageFrontRightChest.rotationPointY = yOff + -1.2f;
		StorageBackRightChest.rotationPointY = yOff + -1.2f;
		StorageFrontLeftChest.rotationPointY = yOff + -1.2f;
		StorageBackLeftChest.rotationPointY = yOff + -1.2f;
		StorageRightBlankets.rotationPointY = yOff + -10.2f;
		StorageLeftBlankets.rotationPointY = yOff + -10.2f;
		HarnessBlanket.rotationPointY = yOff + -13.2f;
		HarnessUpperBelt.rotationPointY = yOff + -2.0f;
		HarnessLowerBelt.rotationPointY = yOff + -2.0f;
		CabinPillow.rotationPointY = yOff + -16.0f;
		CabinLeftRail.rotationPointY = yOff + -23.0f;
		Cabin.rotationPointY = yOff + -35.0f;
		CabinRightRail.rotationPointY = yOff + -23.0f;
		CabinBackRail.rotationPointY = yOff + -23.0f;
		CabinRoof.rotationPointY = yOff + -34.0f;
		FortBackRightWall.rotationPointY = yOff + -16.0f;
		FortBackLeftWall.rotationPointY = yOff + -16.0f;
		FortBackWall.rotationPointY = yOff + -16.0f;
		FortNeckBeam.rotationPointY = yOff + -16.0f;
		FortBackBeam.rotationPointY = yOff + -16.0f;
		FortFloor1.rotationPointY = yOff + -16.0f;
		FortFloor2.rotationPointY = yOff + -16.0f;
		FortFloor3.rotationPointY = yOff + -16.0f;
		StorageUpLeft.rotationPointY = yOff + -16.0f;
		StorageUpRight.rotationPointY = yOff + -16.0f;
		TuskLD1.rotationPointY = yOff + -10.0f;
		TuskLD2.rotationPointY = yOff + -10.0f;
		TuskLD3.rotationPointY = yOff + -10.0f;
		TuskLD4.rotationPointY = yOff + -10.0f;
		TuskLD5.rotationPointY = yOff + -10.0f;
		TuskRD1.rotationPointY = yOff + -10.0f;
		TuskRD2.rotationPointY = yOff + -10.0f;
		TuskRD3.rotationPointY = yOff + -10.0f;
		TuskRD4.rotationPointY = yOff + -10.0f;
		TuskRD5.rotationPointY = yOff + -10.0f;
		TuskLI1.rotationPointY = yOff + -10.0f;
		TuskLI2.rotationPointY = yOff + -10.0f;
		TuskLI3.rotationPointY = yOff + -10.0f;
		TuskLI4.rotationPointY = yOff + -10.0f;
		TuskLI5.rotationPointY = yOff + -10.0f;
		TuskRI1.rotationPointY = yOff + -10.0f;
		TuskRI2.rotationPointY = yOff + -10.0f;
		TuskRI3.rotationPointY = yOff + -10.0f;
		TuskRI4.rotationPointY = yOff + -10.0f;
		TuskRI5.rotationPointY = yOff + -10.0f;
		TuskLW1.rotationPointY = yOff + -10.0f;
		TuskLW2.rotationPointY = yOff + -10.0f;
		TuskLW3.rotationPointY = yOff + -10.0f;
		TuskLW4.rotationPointY = yOff + -10.0f;
		TuskLW5.rotationPointY = yOff + -10.0f;
		TuskRW1.rotationPointY = yOff + -10.0f;
		TuskRW2.rotationPointY = yOff + -10.0f;
		TuskRW3.rotationPointY = yOff + -10.0f;
		TuskRW4.rotationPointY = yOff + -10.0f;
		TuskRW5.rotationPointY = yOff + -10.0f;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		byte tusks = 0;
		int type = 3;
		byte harness = 0;
		byte storage = 0;
		boolean sitting = false;
		boolean moveTail = false;
		this.setRotationAngles(f, f1, f2, f3, f4, f5, tusks, sitting, moveTail);
		switch (tusks) {
		case 0:
			LeftTuskB.render(f5);
			RightTuskB.render(f5);
			LeftTuskC.render(f5);
			RightTuskC.render(f5);
			LeftTuskD.render(f5);
			RightTuskD.render(f5);
			break;
		case 1:
			TuskLW1.render(f5);
			TuskLW2.render(f5);
			TuskLW3.render(f5);
			TuskLW4.render(f5);
			TuskLW5.render(f5);
			TuskRW1.render(f5);
			TuskRW2.render(f5);
			TuskRW3.render(f5);
			TuskRW4.render(f5);
			TuskRW5.render(f5);
			break;
		case 2:
			TuskLI1.render(f5);
			TuskLI2.render(f5);
			TuskLI3.render(f5);
			TuskLI4.render(f5);
			TuskLI5.render(f5);
			TuskRI1.render(f5);
			TuskRI2.render(f5);
			TuskRI3.render(f5);
			TuskRI4.render(f5);
			TuskRI5.render(f5);
			break;
		case 3:
			TuskLD1.render(f5);
			TuskLD2.render(f5);
			TuskLD3.render(f5);
			TuskLD4.render(f5);
			TuskLD5.render(f5);
			TuskRD1.render(f5);
			TuskRD2.render(f5);
			TuskRD3.render(f5);
			TuskRD4.render(f5);
			TuskRD5.render(f5);
			break;
		default:
			break;
		}
		if (type == 1) {
			LeftBigEar.render(f5);
			RightBigEar.render(f5);
		} else {
			LeftSmallEar.render(f5);
			RightSmallEar.render(f5);
		}
		if (type == 3 || type == 4) {
			HeadBump.render(f5);
			Skirt.render(f5);
		}
		if (harness >= 1) {
			HarnessBlanket.render(f5);
			HarnessUpperBelt.render(f5);
			HarnessLowerBelt.render(f5);
			if (type == 5) {
				Skirt.render(f5);
			}
		}
		if (harness == 3) {
			if (type == 5) {
				CabinPillow.render(f5);
				CabinLeftRail.render(f5);
				Cabin.render(f5);
				CabinRightRail.render(f5);
				CabinBackRail.render(f5);
				CabinRoof.render(f5);
			}
			if (type == 4) {
				FortBackRightWall.render(f5);
				FortBackLeftWall.render(f5);
				FortBackWall.render(f5);
				FortFloor1.render(f5);
				FortFloor2.render(f5);
				FortFloor3.render(f5);
				FortNeckBeam.render(f5);
				FortBackBeam.render(f5);
			}
		}
		if (storage >= 1) {
			StorageRightBedroll.render(f5);
			StorageFrontRightChest.render(f5);
			StorageBackRightChest.render(f5);
			StorageRightBlankets.render(f5);
		}
		if (storage >= 2) {
			StorageLeftBlankets.render(f5);
			StorageLeftBedroll.render(f5);
			StorageFrontLeftChest.render(f5);
			StorageBackLeftChest.render(f5);
		}
		if (storage >= 3) {
			StorageUpLeft.render(f5);
		}
		if (storage >= 4) {
			StorageUpRight.render(f5);
		}
		Head.render(f5);
		Neck.render(f5);
		Chin.render(f5);
		LowerLip.render(f5);
		Back.render(f5);
		Hump.render(f5);
		Body.render(f5);
		RightTuskA.render(f5);
		LeftTuskA.render(f5);
		TrunkA.render(f5);
		TrunkB.render(f5);
		TrunkC.render(f5);
		TrunkD.render(f5);
		TrunkE.render(f5);
		FrontRightUpperLeg.render(f5);
		FrontRightLowerLeg.render(f5);
		FrontLeftUpperLeg.render(f5);
		FrontLeftLowerLeg.render(f5);
		BackRightUpperLeg.render(f5);
		BackRightLowerLeg.render(f5);
		BackLeftUpperLeg.render(f5);
		BackLeftLowerLeg.render(f5);
		TailRoot.render(f5);
		Tail.render(f5);
		TailPlush.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, byte tusks, boolean sitting, boolean tail) {
		float RLegXRot = MathHelper.cos(f * 0.6662f + 3.141593f) * 0.8f * f1;
		float LLegXRot = MathHelper.cos(f * 0.6662f) * 0.8f * f1;
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
		AdjustY(f10);
		float TrunkXRot = f1 * 5.0f;
		HeadXRot = 0.0f;
		TrunkXRot = 0.0f;
		if (sitting) {
			HeadXRot = 0.0f;
			TrunkXRot = 0.0f;
		}
		Head.rotateAngleX = -10.0f / radianF + HeadXRot;
		HeadBump.rotateAngleY = Head.rotateAngleY = HeadYRot;
		HeadBump.rotateAngleX = Head.rotateAngleX;
		RightTuskA.rotateAngleY = HeadYRot;
		LeftTuskA.rotateAngleY = HeadYRot;
		RightTuskA.rotateAngleX = 70.0f / radianF + HeadXRot;
		LeftTuskA.rotateAngleX = 70.0f / radianF + HeadXRot;
		Chin.rotateAngleY = HeadYRot;
		Chin.rotateAngleX = 113.0f / radianF + HeadXRot;
		LowerLip.rotateAngleY = HeadYRot;
		LowerLip.rotateAngleX = 85.0f / radianF + HeadXRot;
		float EarF = 0.0f;
		float f2a = f2 % 100.0f;
		if (f2a > 60.0f && f2a < 90.0f) {
			EarF = MathHelper.cos(f2 * 0.5f) * 0.35f;
		}
		RightBigEar.rotateAngleY = 30.0f / radianF + HeadYRot + EarF;
		RightSmallEar.rotateAngleY = 30.0f / radianF + HeadYRot + EarF;
		LeftBigEar.rotateAngleY = -30.0f / radianF + HeadYRot - EarF;
		LeftSmallEar.rotateAngleY = -30.0f / radianF + HeadYRot - EarF;
		RightBigEar.rotateAngleX = -10.0f / radianF + HeadXRot;
		RightSmallEar.rotateAngleX = -10.0f / radianF + HeadXRot;
		LeftBigEar.rotateAngleX = -10.0f / radianF + HeadXRot;
		LeftSmallEar.rotateAngleX = -10.0f / radianF + HeadXRot;
		TrunkA.rotationPointZ = -22.5f;
		adjustAllRotationPoints(TrunkA, Head);
		TrunkA.rotateAngleY = HeadYRot;
		float TrunkARotX = 90.0f - TrunkXRot;
		if (TrunkARotX < 85.0f) {
			TrunkARotX = 85.0f;
		}
		TrunkA.rotateAngleX = TrunkARotX / radianF + HeadXRot;
		TrunkB.rotationPointZ = -22.5f;
		adjustAllRotationPoints(TrunkB, TrunkA);
		TrunkB.rotateAngleY = HeadYRot;
		TrunkB.rotateAngleX = (95.0f - TrunkXRot * 1.5f) / radianF + HeadXRot;
		TrunkC.rotationPointZ = -22.5f;
		adjustAllRotationPoints(TrunkC, TrunkB);
		TrunkC.rotateAngleY = HeadYRot;
		TrunkC.rotateAngleX = (110.0f - TrunkXRot * 3.0f) / radianF + HeadXRot;
		TrunkD.rotationPointZ = -21.5f;
		adjustAllRotationPoints(TrunkD, TrunkC);
		TrunkD.rotateAngleY = HeadYRot;
		TrunkD.rotateAngleX = (127.0f - TrunkXRot * 4.5f) / radianF + HeadXRot;
		TrunkE.rotationPointZ = -19.0f;
		adjustAllRotationPoints(TrunkE, TrunkD);
		TrunkE.rotateAngleY = HeadYRot;
		TrunkE.rotateAngleX = (145.0f - TrunkXRot * 6.0f) / radianF + HeadXRot;
		if (sitting) {
			FrontRightUpperLeg.rotateAngleX = -30.0f / radianF;
			FrontLeftUpperLeg.rotateAngleX = -30.0f / radianF;
			BackLeftUpperLeg.rotateAngleX = -30.0f / radianF;
			BackRightUpperLeg.rotateAngleX = -30.0f / radianF;
		} else {
			FrontRightUpperLeg.rotateAngleX = RLegXRot;
			FrontLeftUpperLeg.rotateAngleX = LLegXRot;
			BackLeftUpperLeg.rotateAngleX = RLegXRot;
			BackRightUpperLeg.rotateAngleX = LLegXRot;
		}
		adjustXRotationPoints(FrontRightLowerLeg, FrontRightUpperLeg);
		adjustXRotationPoints(BackRightLowerLeg, BackRightUpperLeg);
		adjustXRotationPoints(FrontLeftLowerLeg, FrontLeftUpperLeg);
		adjustXRotationPoints(BackLeftLowerLeg, BackLeftUpperLeg);
		if (sitting) {
			FrontLeftLowerLeg.rotateAngleX = 90.0f / radianF;
			FrontRightLowerLeg.rotateAngleX = 90.0f / radianF;
			BackLeftLowerLeg.rotateAngleX = 90.0f / radianF;
			BackRightLowerLeg.rotateAngleX = 90.0f / radianF;
		} else {
			float LLegXRotD = LLegXRot * 57.29578f;
			float RLegXRotD = RLegXRot * 57.29578f;
			if (LLegXRotD > 0.0f) {
				LLegXRotD *= 2.0f;
			}
			if (RLegXRotD > 0.0f) {
				RLegXRotD *= 2.0f;
			}
			FrontLeftLowerLeg.rotateAngleX = LLegXRotD / radianF;
			FrontRightLowerLeg.rotateAngleX = RLegXRotD / radianF;
			BackLeftLowerLeg.rotateAngleX = RLegXRotD / radianF;
			BackRightLowerLeg.rotateAngleX = LLegXRotD / radianF;
		}
		switch (tusks) {
		case 0:
			LeftTuskB.rotateAngleY = HeadYRot;
			LeftTuskC.rotateAngleY = HeadYRot;
			LeftTuskD.rotateAngleY = HeadYRot;
			RightTuskB.rotateAngleY = HeadYRot;
			RightTuskC.rotateAngleY = HeadYRot;
			RightTuskD.rotateAngleY = HeadYRot;
			LeftTuskB.rotateAngleX = 40.0f / radianF + HeadXRot;
			LeftTuskC.rotateAngleX = 10.0f / radianF + HeadXRot;
			LeftTuskD.rotateAngleX = -20.0f / radianF + HeadXRot;
			RightTuskB.rotateAngleX = 40.0f / radianF + HeadXRot;
			RightTuskC.rotateAngleX = 10.0f / radianF + HeadXRot;
			RightTuskD.rotateAngleX = -20.0f / radianF + HeadXRot;
			break;
		case 1:
			TuskLW1.rotateAngleY = HeadYRot;
			TuskLW2.rotateAngleY = HeadYRot;
			TuskLW3.rotateAngleY = HeadYRot;
			TuskLW4.rotateAngleY = HeadYRot;
			TuskLW5.rotateAngleY = HeadYRot;
			TuskRW1.rotateAngleY = HeadYRot;
			TuskRW2.rotateAngleY = HeadYRot;
			TuskRW3.rotateAngleY = HeadYRot;
			TuskRW4.rotateAngleY = HeadYRot;
			TuskRW5.rotateAngleY = HeadYRot;
			TuskLW1.rotateAngleX = 40.0f / radianF + HeadXRot;
			TuskLW2.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskLW3.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskLW4.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskLW5.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskRW1.rotateAngleX = 40.0f / radianF + HeadXRot;
			TuskRW2.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskRW3.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskRW4.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskRW5.rotateAngleX = -20.0f / radianF + HeadXRot;
			break;
		case 2:
			TuskLI1.rotateAngleY = HeadYRot;
			TuskLI2.rotateAngleY = HeadYRot;
			TuskLI3.rotateAngleY = HeadYRot;
			TuskLI4.rotateAngleY = HeadYRot;
			TuskLI5.rotateAngleY = HeadYRot;
			TuskRI1.rotateAngleY = HeadYRot;
			TuskRI2.rotateAngleY = HeadYRot;
			TuskRI3.rotateAngleY = HeadYRot;
			TuskRI4.rotateAngleY = HeadYRot;
			TuskRI5.rotateAngleY = HeadYRot;
			TuskLI1.rotateAngleX = 40.0f / radianF + HeadXRot;
			TuskLI2.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskLI3.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskLI4.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskLI5.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskRI1.rotateAngleX = 40.0f / radianF + HeadXRot;
			TuskRI2.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskRI3.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskRI4.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskRI5.rotateAngleX = -20.0f / radianF + HeadXRot;
			break;
		case 3:
			TuskLD1.rotateAngleY = HeadYRot;
			TuskLD2.rotateAngleY = HeadYRot;
			TuskLD3.rotateAngleY = HeadYRot;
			TuskLD4.rotateAngleY = HeadYRot;
			TuskLD5.rotateAngleY = HeadYRot;
			TuskRD1.rotateAngleY = HeadYRot;
			TuskRD2.rotateAngleY = HeadYRot;
			TuskRD3.rotateAngleY = HeadYRot;
			TuskRD4.rotateAngleY = HeadYRot;
			TuskRD5.rotateAngleY = HeadYRot;
			TuskLD1.rotateAngleX = 40.0f / radianF + HeadXRot;
			TuskLD2.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskLD3.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskLD4.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskLD5.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskRD1.rotateAngleX = 40.0f / radianF + HeadXRot;
			TuskRD2.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskRD3.rotateAngleX = -20.0f / radianF + HeadXRot;
			TuskRD4.rotateAngleX = 10.0f / radianF + HeadXRot;
			TuskRD5.rotateAngleX = -20.0f / radianF + HeadXRot;
			break;
		default:
			break;
		}
		StorageLeftBedroll.rotateAngleX = LLegXRot / 10.0f;
		StorageFrontLeftChest.rotateAngleX = LLegXRot / 5.0f;
		StorageBackLeftChest.rotateAngleX = LLegXRot / 5.0f;
		StorageRightBedroll.rotateAngleX = RLegXRot / 10.0f;
		StorageFrontRightChest.rotateAngleX = RLegXRot / 5.0f;
		StorageBackRightChest.rotateAngleX = RLegXRot / 5.0f;
		FortNeckBeam.rotateAngleZ = LLegXRot / 50.0f;
		FortBackBeam.rotateAngleZ = LLegXRot / 50.0f;
		FortBackRightWall.rotateAngleZ = LLegXRot / 50.0f;
		FortBackLeftWall.rotateAngleZ = LLegXRot / 50.0f;
		FortBackWall.rotateAngleX = 0.0f - LLegXRot / 50.0f;
		float tailMov = f1 * 0.9f;
		if (tailMov < 0.0f) {
			tailMov = 0.0f;
		}
		if (tail) {
			TailRoot.rotateAngleY = MathHelper.cos(f2 * 0.4f) * 1.3f;
			tailMov = 30.0f / radianF;
		} else {
			TailRoot.rotateAngleY = 0.0f;
		}
		TailRoot.rotateAngleX = 17.0f / radianF + tailMov;
		TailPlush.rotateAngleX = Tail.rotateAngleX = 6.5f / radianF + tailMov;
		Tail.rotateAngleY = TailPlush.rotateAngleY = TailRoot.rotateAngleY;
	}
}