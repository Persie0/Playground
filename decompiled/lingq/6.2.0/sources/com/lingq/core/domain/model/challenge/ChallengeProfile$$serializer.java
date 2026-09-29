package com.lingq.core.domain.model.challenge;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChallengeProfile$$serializer implements zk3 {
    public static final ChallengeProfile$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChallengeProfile$$serializer challengeProfile$$serializer = new ChallengeProfile$$serializer();
        INSTANCE = challengeProfile$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.challenge.ChallengeProfile", challengeProfile$$serializer, 8);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("username", false);
        bg7Var.m3702k("description", false);
        bg7Var.m3702k("blogUrl", true);
        bg7Var.m3702k("activityIndex", true);
        bg7Var.m3702k("deleted", true);
        bg7Var.m3702k("photo", false);
        bg7Var.m3702k("role", true);
        descriptor = bg7Var;
    }

    private ChallengeProfile$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(sk9Var);
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, l84Var, lf0.f49579a, kSerializerM22059r4, kSerializerM22059r5};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChallengeProfile deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ChallengeProfile challengeProfile = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str4);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str5);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return challengeProfile;
            }
            challengeProfile = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChallengeProfile(i, iMo4091q, str, str2, str3, iMo4091q2, zMo4094v, str4, str5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChallengeProfile challengeProfile) {
        encoder.getClass();
        challengeProfile.getClass();
        int i = challengeProfile.f18883a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        sk9 sk9Var = sk9.f60959a;
        String str = challengeProfile.f18884b;
        String str2 = challengeProfile.f18890h;
        boolean z = challengeProfile.f18888f;
        int i2 = challengeProfile.f18887e;
        String str3 = challengeProfile.f18886d;
        mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9Var, str);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, challengeProfile.f18885c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9Var, challengeProfile.f18889g);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9Var, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
