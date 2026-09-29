package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultMilestoneStats$$serializer implements zk3 {
    public static final ResultMilestoneStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultMilestoneStats$$serializer resultMilestoneStats$$serializer = new ResultMilestoneStats$$serializer();
        INSTANCE = resultMilestoneStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultMilestoneStats", resultMilestoneStats$$serializer, 3);
        bg7Var.m3702k("known_words", true);
        bg7Var.m3702k("lingqs", true);
        bg7Var.m3702k("daily_score", true);
        descriptor = bg7Var;
    }

    private ResultMilestoneStats$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, l84Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultMilestoneStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        ResultMilestoneStats resultMilestoneStats = new ResultMilestoneStats();
        if ((i & 1) == 0) {
            resultMilestoneStats.f21330a = 0;
        } else {
            resultMilestoneStats.f21330a = iMo4091q;
        }
        if ((i & 2) == 0) {
            resultMilestoneStats.f21331b = 0;
        } else {
            resultMilestoneStats.f21331b = iMo4091q2;
        }
        if ((i & 4) == 0) {
            resultMilestoneStats.f21332c = 0;
            return resultMilestoneStats;
        }
        resultMilestoneStats.f21332c = iMo4091q3;
        return resultMilestoneStats;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultMilestoneStats resultMilestoneStats) {
        encoder.getClass();
        resultMilestoneStats.getClass();
        int i = resultMilestoneStats.f21332c;
        int i2 = resultMilestoneStats.f21331b;
        int i3 = resultMilestoneStats.f21330a;
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
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
