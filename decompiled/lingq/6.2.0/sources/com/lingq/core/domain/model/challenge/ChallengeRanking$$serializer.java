package com.lingq.core.domain.model.challenge;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.n3c;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChallengeRanking$$serializer implements zk3 {
    public static final ChallengeRanking$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChallengeRanking$$serializer challengeRanking$$serializer = new ChallengeRanking$$serializer();
        INSTANCE = challengeRanking$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.challenge.ChallengeRanking", challengeRanking$$serializer, 6);
        bg7Var.m3702k("rank", true);
        bg7Var.m3702k("score", true);
        bg7Var.m3702k("scoreBehindLeader", true);
        bg7Var.m3702k("profile", false);
        bg7Var.m3702k("bookTitle", true);
        bg7Var.m3702k("bookLanguage", true);
        descriptor = bg7Var;
    }

    private ChallengeRanking$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM22059r = thb.m22059r(ChallengeProfile$$serializer.INSTANCE);
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, l84Var, l84Var, kSerializerM22059r, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChallengeRanking deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        ChallengeProfile challengeProfile = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
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
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    challengeProfile = (ChallengeProfile) df1VarMo4079b.mo4070D(serialDescriptor, 3, ChallengeProfile$$serializer.INSTANCE, challengeProfile);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        if (8 != (i & 8)) {
            n3c.m17204b(i, 8, INSTANCE.getDescriptor());
            throw null;
        }
        ChallengeRanking challengeRanking = new ChallengeRanking();
        if ((i & 1) == 0) {
            challengeRanking.f18891a = 0;
        } else {
            challengeRanking.f18891a = iMo4091q;
        }
        if ((i & 2) == 0) {
            challengeRanking.f18892b = 0;
        } else {
            challengeRanking.f18892b = iMo4091q2;
        }
        if ((i & 4) == 0) {
            challengeRanking.f18893c = 0;
        } else {
            challengeRanking.f18893c = iMo4091q3;
        }
        challengeRanking.f18894d = challengeProfile;
        if ((i & 16) == 0) {
            challengeRanking.f18895e = "";
        } else {
            challengeRanking.f18895e = strMo4097x;
        }
        if ((i & 32) == 0) {
            challengeRanking.f18896f = "";
            return challengeRanking;
        }
        challengeRanking.f18896f = strMo4097x2;
        return challengeRanking;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChallengeRanking challengeRanking) {
        encoder.getClass();
        challengeRanking.getClass();
        int i = challengeRanking.f18893c;
        int i2 = challengeRanking.f18892b;
        int i3 = challengeRanking.f18891a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(0, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(1, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(2, i, serialDescriptor);
        }
        ChallengeProfile$$serializer challengeProfile$$serializer = ChallengeProfile$$serializer.INSTANCE;
        ChallengeProfile challengeProfile = challengeRanking.f18894d;
        String str = challengeRanking.f18896f;
        String str2 = challengeRanking.f18895e;
        mk9VarMo15606b.m16880x(serialDescriptor, 3, challengeProfile$$serializer, challengeProfile);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 4, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 5, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
