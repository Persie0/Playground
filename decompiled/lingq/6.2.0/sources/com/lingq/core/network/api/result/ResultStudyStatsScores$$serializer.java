package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultStudyStatsScores$$serializer implements zk3 {
    public static final ResultStudyStatsScores$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultStudyStatsScores$$serializer resultStudyStatsScores$$serializer = new ResultStudyStatsScores$$serializer();
        INSTANCE = resultStudyStatsScores$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultStudyStatsScores", resultStudyStatsScores$$serializer, 4);
        bg7Var.m3702k("date", true);
        bg7Var.m3702k("dayOfWeek", true);
        bg7Var.m3702k("score", true);
        bg7Var.m3702k("activityLevel", true);
        descriptor = bg7Var;
    }

    private ResultStudyStatsScores$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84.f49294a, thb.m22059r(ResultActivityLevel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultStudyStatsScores deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        String str2 = null;
        ResultActivityLevel resultActivityLevel = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i |= 1;
            } else if (iMo10319A == 1) {
                str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str2);
                i |= 2;
            } else if (iMo10319A == 2) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                resultActivityLevel = (ResultActivityLevel) df1VarMo4079b.mo4070D(serialDescriptor, 3, ResultActivityLevel$$serializer.INSTANCE, resultActivityLevel);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultStudyStatsScores(i, str, str2, iMo4091q, resultActivityLevel);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultStudyStatsScores resultStudyStatsScores) {
        encoder.getClass();
        resultStudyStatsScores.getClass();
        ResultActivityLevel resultActivityLevel = resultStudyStatsScores.f21542d;
        int i = resultStudyStatsScores.f21541c;
        String str = resultStudyStatsScores.f21540b;
        String str2 = resultStudyStatsScores.f21539a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(2, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || resultActivityLevel != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, ResultActivityLevel$$serializer.INSTANCE, resultActivityLevel);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
