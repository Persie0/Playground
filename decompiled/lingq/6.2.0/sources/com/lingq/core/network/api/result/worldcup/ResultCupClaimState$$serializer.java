package com.lingq.core.network.api.result.worldcup;

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

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultCupClaimState$$serializer implements zk3 {
    public static final ResultCupClaimState$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupClaimState$$serializer resultCupClaimState$$serializer = new ResultCupClaimState$$serializer();
        INSTANCE = resultCupClaimState$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupClaimState", resultCupClaimState$$serializer, 2);
        bg7Var.m3702k("claimed", true);
        bg7Var.m3702k("claimed_at", true);
        descriptor = bg7Var;
    }

    private ResultCupClaimState$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lf0.f49579a, thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupClaimState deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zMo4094v = false;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupClaimState(str, i, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupClaimState resultCupClaimState) {
        encoder.getClass();
        resultCupClaimState.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        ResultCupClaimState.m8413c(resultCupClaimState, mk9VarMo15606b, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
