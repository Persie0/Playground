package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultTtsUtterance$GeneratedLanguage$$serializer implements zk3 {
    public static final ResultTtsUtterance$GeneratedLanguage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultTtsUtterance$GeneratedLanguage$$serializer resultTtsUtterance$GeneratedLanguage$$serializer = new ResultTtsUtterance$GeneratedLanguage$$serializer();
        INSTANCE = resultTtsUtterance$GeneratedLanguage$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultTtsUtterance.GeneratedLanguage", resultTtsUtterance$GeneratedLanguage$$serializer, 4);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("code", true);
        bg7Var.m3702k("title", true);
        descriptor = bg7Var;
    }

    private ResultTtsUtterance$GeneratedLanguage$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, thb.m22059r(sk9Var), sk9Var, thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultTtsUtterance.GeneratedLanguage deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        String strMo4097x = null;
        String str2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            } else if (iMo10319A == 2) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str2);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultTtsUtterance.GeneratedLanguage(i, iMo4091q, str, strMo4097x, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultTtsUtterance.GeneratedLanguage generatedLanguage) {
        encoder.getClass();
        generatedLanguage.getClass();
        String str = generatedLanguage.f21645d;
        String str2 = generatedLanguage.f21644c;
        String str3 = generatedLanguage.f21643b;
        int i = generatedLanguage.f21642a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
