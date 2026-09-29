package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
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
public final /* synthetic */ class ResultTtsUtterance$Generated$$serializer implements zk3 {
    public static final ResultTtsUtterance$Generated$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultTtsUtterance$Generated$$serializer resultTtsUtterance$Generated$$serializer = new ResultTtsUtterance$Generated$$serializer();
        INSTANCE = resultTtsUtterance$Generated$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultTtsUtterance.Generated", resultTtsUtterance$Generated$$serializer, 11);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("language", true);
        bg7Var.m3702k("app_name", true);
        bg7Var.m3702k("voice", true);
        bg7Var.m3702k("voice_type", true);
        bg7Var.m3702k("text", true);
        bg7Var.m3702k("audio", true);
        bg7Var.m3702k("ctime", true);
        bg7Var.m3702k("ftime", true);
        bg7Var.m3702k("fixed", true);
        bg7Var.m3702k("db", true);
        descriptor = bg7Var;
    }

    private ResultTtsUtterance$Generated$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, ResultTtsUtterance$GeneratedLanguage$$serializer.INSTANCE, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), sk9Var, sk9Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultTtsUtterance.Generated deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        int i = 0;
        int iMo4091q = 0;
        ResultTtsUtterance.GeneratedLanguage generatedLanguage = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String str7 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    generatedLanguage = (ResultTtsUtterance.GeneratedLanguage) df1VarMo4079b.mo4073G(serialDescriptor, 1, ResultTtsUtterance$GeneratedLanguage$$serializer.INSTANCE, generatedLanguage);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str5);
                    i |= 8;
                    break;
                case 4:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str6);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str7);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str3);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str2);
                    i |= 512;
                    break;
                case 10:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 10, sk9.f60959a, str);
                    i |= 1024;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
            z = z;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultTtsUtterance.Generated(i, iMo4091q, generatedLanguage, str4, str5, str6, strMo4097x, strMo4097x2, str7, str3, str2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultTtsUtterance.Generated generated) {
        encoder.getClass();
        generated.getClass();
        String str = generated.f21641k;
        String str2 = generated.f21640j;
        String str3 = generated.f21639i;
        String str4 = generated.f21638h;
        String str5 = generated.f21637g;
        String str6 = generated.f21636f;
        String str7 = generated.f21635e;
        String str8 = generated.f21634d;
        String str9 = generated.f21633c;
        ResultTtsUtterance.GeneratedLanguage generatedLanguage = generated.f21632b;
        int i = generated.f21631a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(generatedLanguage, new ResultTtsUtterance.GeneratedLanguage())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 1, ResultTtsUtterance$GeneratedLanguage$$serializer.INSTANCE, generatedLanguage);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str9 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str8 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str7 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str6, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 5, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str5, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 6, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
