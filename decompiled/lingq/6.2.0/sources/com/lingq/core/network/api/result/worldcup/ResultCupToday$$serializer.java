package com.lingq.core.network.api.result.worldcup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultCupToday$$serializer implements zk3 {
    public static final ResultCupToday$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupToday$$serializer resultCupToday$$serializer = new ResultCupToday$$serializer();
        INSTANCE = resultCupToday$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupToday", resultCupToday$$serializer, 3);
        bg7Var.m3702k("date", true);
        bg7Var.m3702k("prize", true);
        bg7Var.m3702k("claim", true);
        descriptor = bg7Var;
    }

    private ResultCupToday$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, thb.m22059r(ResultCupPrize$$serializer.INSTANCE), thb.m22059r(ResultCupClaimState$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupToday deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        ResultCupPrize resultCupPrize = null;
        ResultCupClaimState resultCupClaimState = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                resultCupPrize = (ResultCupPrize) df1VarMo4079b.mo4070D(serialDescriptor, 1, ResultCupPrize$$serializer.INSTANCE, resultCupPrize);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                resultCupClaimState = (ResultCupClaimState) df1VarMo4079b.mo4070D(serialDescriptor, 2, ResultCupClaimState$$serializer.INSTANCE, resultCupClaimState);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupToday(i, strMo4097x, resultCupPrize, resultCupClaimState);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupToday resultCupToday) {
        encoder.getClass();
        resultCupToday.getClass();
        ResultCupClaimState resultCupClaimState = resultCupToday.f21828c;
        ResultCupPrize resultCupPrize = resultCupToday.f21827b;
        String str = resultCupToday.f21826a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || resultCupPrize != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, ResultCupPrize$$serializer.INSTANCE, resultCupPrize);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || resultCupClaimState != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, ResultCupClaimState$$serializer.INSTANCE, resultCupClaimState);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
