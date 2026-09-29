package com.lingq.core.network.api.requests;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class RequestTranslation$$serializer implements zk3 {
    public static final RequestTranslation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestTranslation$$serializer requestTranslation$$serializer = new RequestTranslation$$serializer();
        INSTANCE = requestTranslation$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestTranslation", requestTranslation$$serializer, 3);
        bg7Var.m3702k("text", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("type", true);
        descriptor = bg7Var;
    }

    private RequestTranslation$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestTranslation deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
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
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestTranslation(strMo4097x, i, strMo4097x2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestTranslation requestTranslation) {
        encoder.getClass();
        requestTranslation.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = requestTranslation.f20465a;
        String str2 = requestTranslation.f20467c;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, requestTranslation.f20466b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
