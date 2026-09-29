package com.lingq.core.domain.model.challenge;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.Language$$serializer;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
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
public final /* synthetic */ class ChallengeJoinedStats$$serializer implements zk3 {
    public static final ChallengeJoinedStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChallengeJoinedStats$$serializer challengeJoinedStats$$serializer = new ChallengeJoinedStats$$serializer();
        INSTANCE = challengeJoinedStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.challenge.ChallengeJoinedStats", challengeJoinedStats$$serializer, 14);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("status", false);
        bg7Var.m3702k("start_date", false);
        bg7Var.m3702k("end_date", false);
        bg7Var.m3702k("signup_datetime", false);
        bg7Var.m3702k("rank", true);
        bg7Var.m3702k("profile", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("activity_index", true);
        bg7Var.m3702k("is_completed", true);
        bg7Var.m3702k("membership_ptr_id", true);
        bg7Var.m3702k("lingqs", true);
        bg7Var.m3702k("context", true);
        bg7Var.m3702k("stats", false);
        descriptor = bg7Var;
    }

    private ChallengeJoinedStats$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ChallengeJoinedStats.f18868o;
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(ChallengeProfile$$serializer.INSTANCE);
        KSerializer kSerializerM22059r6 = thb.m22059r(Language$$serializer.INSTANCE);
        KSerializer kSerializerM22059r7 = thb.m22059r((KSerializer) cs4VarArr[13].getValue());
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, kSerializerM22059r4, l84Var, kSerializerM22059r5, kSerializerM22059r6, l84Var, lf0.f49579a, l84Var, l84Var, l84Var, kSerializerM22059r7};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChallengeJoinedStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ChallengeJoinedStats.f18868o;
        List list = null;
        boolean z = true;
        Language language = null;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int iMo4091q2 = 0;
        ChallengeProfile challengeProfile = null;
        int iMo4091q3 = 0;
        boolean zMo4094v = false;
        int iMo4091q4 = 0;
        int iMo4091q5 = 0;
        int iMo4091q6 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
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
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str4);
                    i |= 16;
                    break;
                case 5:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    challengeProfile = (ChallengeProfile) df1VarMo4079b.mo4070D(serialDescriptor, 6, ChallengeProfile$$serializer.INSTANCE, challengeProfile);
                    i |= 64;
                    break;
                case 7:
                    language = (Language) df1VarMo4079b.mo4070D(serialDescriptor, 7, Language$$serializer.INSTANCE, language);
                    i |= 128;
                    break;
                case 8:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    iMo4091q6 = df1VarMo4079b.mo4091q(serialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list);
                    i |= 8192;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChallengeJoinedStats(i, iMo4091q, str, str2, str3, str4, iMo4091q2, challengeProfile, language, iMo4091q3, zMo4094v, iMo4091q4, iMo4091q5, iMo4091q6, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChallengeJoinedStats challengeJoinedStats) {
        encoder.getClass();
        challengeJoinedStats.getClass();
        int i = challengeJoinedStats.f18869a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ChallengeJoinedStats.f18868o;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        sk9 sk9Var = sk9.f60959a;
        String str = challengeJoinedStats.f18870b;
        int i2 = challengeJoinedStats.f18881m;
        int i3 = challengeJoinedStats.f18880l;
        int i4 = challengeJoinedStats.f18879k;
        boolean z = challengeJoinedStats.f18878j;
        int i5 = challengeJoinedStats.f18877i;
        int i6 = challengeJoinedStats.f18874f;
        mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9Var, str);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, challengeJoinedStats.f18871c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, challengeJoinedStats.f18872d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9Var, challengeJoinedStats.f18873e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i6 != 0) {
            mk9VarMo15606b.m16878v(5, i6, serialDescriptor);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 6, ChallengeProfile$$serializer.INSTANCE, challengeJoinedStats.f18875g);
        mk9VarMo15606b.m16880x(serialDescriptor, 7, Language$$serializer.INSTANCE, challengeJoinedStats.f18876h);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
            mk9VarMo15606b.m16878v(8, i5, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 9, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
            mk9VarMo15606b.m16878v(10, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(11, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(12, i2, serialDescriptor);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), challengeJoinedStats.f18882n);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
