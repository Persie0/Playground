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
public final /* synthetic */ class ResultLanguage$$serializer implements zk3 {
    public static final ResultLanguage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultLanguage$$serializer resultLanguage$$serializer = new ResultLanguage$$serializer();
        INSTANCE = resultLanguage$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultLanguage", resultLanguage$$serializer, 9);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("code", true);
        bg7Var.m3702k("supported", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("lastUsed", true);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("dictionaryLocaleActive", true);
        bg7Var.m3702k("grammarResourceSlug", true);
        bg7Var.m3702k("scheduledForDeletion", true);
        descriptor = bg7Var;
    }

    private ResultLanguage$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        KSerializer kSerializerM22059r = thb.m22059r(l84Var);
        sk9 sk9Var = sk9.f60959a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{kSerializerM22059r, sk9Var, thb.m22059r(lf0Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(lf0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultLanguage deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ResultLanguage resultLanguage = null;
        boolean z = true;
        Boolean bool = null;
        Integer num = null;
        String strMo4097x = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 0, l84.f49294a, num);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bool2 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 2, lf0.f49579a, bool2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str2);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 5, l84.f49294a, num2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str4);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 8, lf0.f49579a, bool);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultLanguage;
            }
            resultLanguage = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultLanguage(i, num, strMo4097x, bool2, str, str2, num2, str3, str4, bool);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultLanguage resultLanguage) {
        encoder.getClass();
        resultLanguage.getClass();
        Boolean bool = resultLanguage.f20871i;
        String str = resultLanguage.f20870h;
        String str2 = resultLanguage.f20869g;
        Integer num = resultLanguage.f20868f;
        String str3 = resultLanguage.f20867e;
        String str4 = resultLanguage.f20866d;
        Boolean bool2 = resultLanguage.f20865c;
        String str5 = resultLanguage.f20864b;
        Integer num2 = resultLanguage.f20863a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str5, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, lf0.f49579a, bool2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, lf0.f49579a, bool);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
