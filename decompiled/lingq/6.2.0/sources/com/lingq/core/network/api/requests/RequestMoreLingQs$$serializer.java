package com.lingq.core.network.api.requests;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.rk5;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class RequestMoreLingQs$$serializer implements zk3 {
    public static final RequestMoreLingQs$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestMoreLingQs$$serializer requestMoreLingQs$$serializer = new RequestMoreLingQs$$serializer();
        INSTANCE = requestMoreLingQs$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestMoreLingQs", requestMoreLingQs$$serializer, 3);
        bg7Var.m3702k("amount", false);
        bg7Var.m3702k("timestamp", false);
        bg7Var.m3702k("signature", false);
        descriptor = bg7Var;
    }

    private RequestMoreLingQs$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l84.f49294a, rk5.f59434a, sk9.f60959a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestMoreLingQs deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        long jMo4085i = 0;
        String strMo4097x = null;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                jMo4085i = df1VarMo4079b.mo4085i(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestMoreLingQs(i, jMo4085i, strMo4097x, iMo4091q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestMoreLingQs requestMoreLingQs) {
        encoder.getClass();
        requestMoreLingQs.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, requestMoreLingQs.f20404a, serialDescriptor);
        mk9VarMo15606b.m16879w(serialDescriptor, 1, requestMoreLingQs.f20405b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, requestMoreLingQs.f20406c);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
