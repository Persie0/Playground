package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.core.domain.model.challenge.ChallengeProfile;
import com.lingq.core.domain.model.challenge.ChallengeProfile$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
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
public final /* synthetic */ class ChallengeRankingEntity$$serializer implements zk3 {
    public static final ChallengeRankingEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChallengeRankingEntity$$serializer challengeRankingEntity$$serializer = new ChallengeRankingEntity$$serializer();
        INSTANCE = challengeRankingEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.ChallengeRankingEntity", challengeRankingEntity$$serializer, 10);
        bg7Var.m3702k("challengeCode", false);
        bg7Var.m3702k("metric", false);
        bg7Var.m3702k("rank", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("profile", false);
        bg7Var.m3702k("score", true);
        bg7Var.m3702k("scoreBehindLeader", true);
        bg7Var.m3702k("isCompleted", true);
        bg7Var.m3702k("bookTitle", true);
        bg7Var.m3702k("bookLanguage", true);
        descriptor = bg7Var;
    }

    private ChallengeRankingEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM22059r = thb.m22059r(ChallengeProfile$$serializer.INSTANCE);
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, sk9Var, l84Var, sk9Var, kSerializerM22059r, l84Var, l84Var, lf0.f49579a, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChallengeRankingEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ChallengeRankingEntity challengeRankingEntity = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        ChallengeProfile challengeProfile = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    challengeProfile = (ChallengeProfile) df1VarMo4079b.mo4070D(serialDescriptor, 4, ChallengeProfile$$serializer.INSTANCE, challengeProfile);
                    i |= 16;
                    break;
                case 5:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return challengeRankingEntity;
            }
            challengeRankingEntity = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChallengeRankingEntity(i, strMo4097x, strMo4097x2, iMo4091q, strMo4097x3, challengeProfile, iMo4091q2, iMo4091q3, zMo4094v, strMo4097x4, strMo4097x5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChallengeRankingEntity challengeRankingEntity) {
        encoder.getClass();
        challengeRankingEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = challengeRankingEntity.f17082a;
        String str2 = challengeRankingEntity.f17091j;
        String str3 = challengeRankingEntity.f17090i;
        boolean z = challengeRankingEntity.f17089h;
        int i = challengeRankingEntity.f17088g;
        int i2 = challengeRankingEntity.f17087f;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, challengeRankingEntity.f17083b);
        mk9VarMo15606b.m16878v(2, challengeRankingEntity.f17084c, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, challengeRankingEntity.f17085d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, ChallengeProfile$$serializer.INSTANCE, challengeRankingEntity.f17086e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(5, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(6, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 7, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 8, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 9, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
