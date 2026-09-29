package com.lingq.core.network.api.result.worldcup;

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

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultCupMeSummary$$serializer implements zk3 {
    public static final ResultCupMeSummary$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupMeSummary$$serializer resultCupMeSummary$$serializer = new ResultCupMeSummary$$serializer();
        INSTANCE = resultCupMeSummary$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupMeSummary", resultCupMeSummary$$serializer, 2);
        bg7Var.m3702k("rank", true);
        bg7Var.m3702k("score", true);
        descriptor = bg7Var;
    }

    private ResultCupMeSummary$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{thb.m22059r(l84Var), l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupMeSummary deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        Integer num = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 0, l84.f49294a, num);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupMeSummary(i, iMo4091q, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupMeSummary resultCupMeSummary) {
        encoder.getClass();
        resultCupMeSummary.getClass();
        int i = resultCupMeSummary.f21779b;
        Integer num = resultCupMeSummary.f21778a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(1, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
