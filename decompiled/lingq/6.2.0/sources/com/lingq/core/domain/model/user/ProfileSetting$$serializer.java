package com.lingq.core.domain.model.user;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ProfileSetting$$serializer implements zk3 {
    public static final ProfileSetting$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProfileSetting$$serializer profileSetting$$serializer = new ProfileSetting$$serializer();
        INSTANCE = profileSetting$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.user.ProfileSetting", profileSetting$$serializer, 9);
        bg7Var.m3702k("flashcard", true);
        bg7Var.m3702k("reverse_flashcard", true);
        bg7Var.m3702k("cloze", true);
        bg7Var.m3702k("dictation", true);
        bg7Var.m3702k("multiple", true);
        bg7Var.m3702k("unscramble", true);
        bg7Var.m3702k("mix_and_match", true);
        bg7Var.m3702k("speaking", true);
        bg7Var.m3702k("test_cards_limit", true);
        descriptor = bg7Var;
    }

    private ProfileSetting$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        ProfileSettingType$$serializer profileSettingType$$serializer = ProfileSettingType$$serializer.INSTANCE;
        return new KSerializer[]{thb.m22059r(profileSettingType$$serializer), thb.m22059r(profileSettingType$$serializer), thb.m22059r(profileSettingType$$serializer), thb.m22059r(profileSettingType$$serializer), thb.m22059r(profileSettingType$$serializer), thb.m22059r(profileSettingType$$serializer), thb.m22059r(profileSettingType$$serializer), thb.m22059r(profileSettingType$$serializer), thb.m22059r(l84.f49294a)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.lingq.core.domain.model.user.ProfileSettingType, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlinx.serialization.KSerializer
    public final ProfileSetting deserialize(Decoder decoder) {
        ?? r1;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ProfileSetting profileSetting = null;
        boolean z = true;
        ProfileSettingType profileSettingType = null;
        ProfileSettingType profileSettingType2 = null;
        ProfileSettingType profileSettingType3 = null;
        ProfileSettingType profileSettingType4 = null;
        ProfileSettingType profileSettingType5 = null;
        ProfileSettingType profileSettingType6 = null;
        ProfileSettingType profileSettingType7 = null;
        ProfileSettingType profileSettingType8 = null;
        Integer num = null;
        int i = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    profileSettingType = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 0, ProfileSettingType$$serializer.INSTANCE, profileSettingType);
                    i |= 1;
                    break;
                case 1:
                    profileSettingType2 = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 1, ProfileSettingType$$serializer.INSTANCE, profileSettingType2);
                    i |= 2;
                    break;
                case 2:
                    profileSettingType3 = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 2, ProfileSettingType$$serializer.INSTANCE, profileSettingType3);
                    i |= 4;
                    break;
                case 3:
                    profileSettingType4 = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 3, ProfileSettingType$$serializer.INSTANCE, profileSettingType4);
                    i |= 8;
                    break;
                case 4:
                    profileSettingType5 = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 4, ProfileSettingType$$serializer.INSTANCE, profileSettingType5);
                    i |= 16;
                    break;
                case 5:
                    profileSettingType6 = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 5, ProfileSettingType$$serializer.INSTANCE, profileSettingType6);
                    i |= 32;
                    break;
                case 6:
                    profileSettingType7 = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 6, ProfileSettingType$$serializer.INSTANCE, profileSettingType7);
                    i |= 64;
                    break;
                case 7:
                    profileSettingType8 = (ProfileSettingType) df1VarMo4079b.mo4070D(serialDescriptor, 7, ProfileSettingType$$serializer.INSTANCE, profileSettingType8);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 8, l84.f49294a, num);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return profileSetting;
            }
            profileSetting = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        ProfileSetting profileSetting2 = new ProfileSetting();
        if ((i & 1) == 0) {
            r1 = 0;
            profileSetting2.f19691a = null;
        } else {
            r1 = 0;
            profileSetting2.f19691a = profileSettingType;
        }
        if ((i & 2) == 0) {
            profileSetting2.f19692b = r1;
        } else {
            profileSetting2.f19692b = profileSettingType2;
        }
        if ((i & 4) == 0) {
            profileSetting2.f19693c = r1;
        } else {
            profileSetting2.f19693c = profileSettingType3;
        }
        if ((i & 8) == 0) {
            profileSetting2.f19694d = r1;
        } else {
            profileSetting2.f19694d = profileSettingType4;
        }
        if ((i & 16) == 0) {
            profileSetting2.f19695e = r1;
        } else {
            profileSetting2.f19695e = profileSettingType5;
        }
        if ((i & 32) == 0) {
            profileSetting2.f19696f = r1;
        } else {
            profileSetting2.f19696f = profileSettingType6;
        }
        if ((i & 64) == 0) {
            profileSetting2.f19697g = r1;
        } else {
            profileSetting2.f19697g = profileSettingType7;
        }
        if ((i & 128) == 0) {
            profileSetting2.f19698h = r1;
        } else {
            profileSetting2.f19698h = profileSettingType8;
        }
        if ((i & 256) == 0) {
            profileSetting2.f19699i = r1;
            return profileSetting2;
        }
        profileSetting2.f19699i = num;
        return profileSetting2;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ProfileSetting profileSetting) {
        encoder.getClass();
        profileSetting.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19691a != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19691a);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19692b != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19692b);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19693c != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19693c);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19694d != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19694d);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19695e != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19695e);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19696f != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19696f);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19697g != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19697g);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19698h != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, ProfileSettingType$$serializer.INSTANCE, profileSetting.f19698h);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || profileSetting.f19699i != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, profileSetting.f19699i);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
