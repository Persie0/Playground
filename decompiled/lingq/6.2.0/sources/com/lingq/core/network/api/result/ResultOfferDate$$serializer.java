package com.lingq.core.network.api.result;

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
public final /* synthetic */ class ResultOfferDate$$serializer implements zk3 {
    public static final ResultOfferDate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultOfferDate$$serializer resultOfferDate$$serializer = new ResultOfferDate$$serializer();
        INSTANCE = resultOfferDate$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultOfferDate", resultOfferDate$$serializer, 4);
        bg7Var.m3702k("start", false);
        bg7Var.m3702k("end", false);
        bg7Var.m3702k("countdown", true);
        bg7Var.m3702k("countdown_ended", true);
        descriptor = bg7Var;
    }

    private ResultOfferDate$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, thb.m22059r(sk9Var), lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultOfferDate deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultOfferDate(i, strMo4097x, strMo4097x2, str, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultOfferDate resultOfferDate) {
        encoder.getClass();
        resultOfferDate.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = resultOfferDate.f21384a;
        boolean z = resultOfferDate.f21387d;
        String str2 = resultOfferDate.f21386c;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, resultOfferDate.f21385b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 3, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
