package com.lingq.core.domain.model.challenge;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
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
public final /* synthetic */ class ChallengeStats$$serializer implements zk3 {
    public static final ChallengeStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChallengeStats$$serializer challengeStats$$serializer = new ChallengeStats$$serializer();
        INSTANCE = challengeStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.challenge.ChallengeStats", challengeStats$$serializer, 8);
        bg7Var.m3702k("code", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("progress", false);
        bg7Var.m3702k("actual", false);
        bg7Var.m3702k("target", false);
        bg7Var.m3702k("is_managed", true);
        bg7Var.m3702k("is_timed", true);
        bg7Var.m3702k("is_displayed", true);
        descriptor = bg7Var;
    }

    private ChallengeStats$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(sk9Var);
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, kSerializerM22059r4, kSerializerM22059r5, lf0Var, lf0Var, lf0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChallengeStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ChallengeStats challengeStats = null;
        boolean z = true;
        int i = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        boolean zMo4094v3 = false;
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
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str5);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    zMo4094v3 = df1VarMo4079b.mo4094v(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return challengeStats;
            }
            challengeStats = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChallengeStats(i, str, str2, str3, str4, str5, zMo4094v, zMo4094v2, zMo4094v3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChallengeStats challengeStats) {
        encoder.getClass();
        challengeStats.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        sk9 sk9Var = sk9.f60959a;
        String str = challengeStats.f18897a;
        boolean z = challengeStats.f18904h;
        boolean z2 = challengeStats.f18903g;
        boolean z3 = challengeStats.f18902f;
        mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9Var, str);
        mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9Var, challengeStats.f18898b);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, challengeStats.f18899c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, challengeStats.f18900d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9Var, challengeStats.f18901e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z3) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 6, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 7, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
