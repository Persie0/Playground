package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
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
public final /* synthetic */ class ResultDictionaryData$$serializer implements zk3 {
    public static final ResultDictionaryData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultDictionaryData$$serializer resultDictionaryData$$serializer = new ResultDictionaryData$$serializer();
        INSTANCE = resultDictionaryData$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultDictionaryData", resultDictionaryData$$serializer, 13);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("name", true);
        bg7Var.m3702k("order", true);
        bg7Var.m3702k("url_trans", true);
        bg7Var.m3702k("url_def", true);
        bg7Var.m3702k("popup_window", true);
        bg7Var.m3702k("langTo", true);
        bg7Var.m3702k("var1", true);
        bg7Var.m3702k("var2", true);
        bg7Var.m3702k("var3", true);
        bg7Var.m3702k("var4", true);
        bg7Var.m3702k("var5", true);
        bg7Var.m3702k("override_url", true);
        descriptor = bg7Var;
    }

    private ResultDictionaryData$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r6 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r7 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r8 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r9 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r10 = thb.m22059r(sk9Var);
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, kSerializerM22059r, l84Var, kSerializerM22059r2, kSerializerM22059r3, lf0.f49579a, kSerializerM22059r4, kSerializerM22059r5, kSerializerM22059r6, kSerializerM22059r7, kSerializerM22059r8, kSerializerM22059r9, kSerializerM22059r10};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultDictionaryData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int iMo4091q = 0;
        String str6 = null;
        int iMo4091q2 = 0;
        String str7 = null;
        String str8 = null;
        boolean zMo4094v = false;
        String str9 = null;
        String str10 = null;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    iMo4091q = iMo4091q;
                    break;
                case 0:
                    iMo4091q2 = iMo4091q2;
                    i |= 1;
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    iMo4091q2 = iMo4091q2;
                    break;
                case 1:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str6);
                    i |= 2;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 2:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    iMo4091q = iMo4091q;
                    break;
                case 3:
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str7);
                    i |= 8;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 4:
                    str8 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str8);
                    i |= 16;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    iMo4091q = iMo4091q;
                    break;
                case 6:
                    str9 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str9);
                    i |= 64;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 7:
                    str10 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str10);
                    i |= 128;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 8:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str5);
                    i |= 256;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 9:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str3);
                    i |= 512;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 10:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 10, sk9.f60959a, str2);
                    i |= 1024;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 11:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 11, sk9.f60959a, str);
                    i |= 2048;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 12:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 12, sk9.f60959a, str4);
                    i |= 4096;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultDictionaryData(i, iMo4091q, str6, iMo4091q2, str7, str8, zMo4094v, str9, str10, str5, str3, str2, str, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultDictionaryData resultDictionaryData) {
        encoder.getClass();
        resultDictionaryData.getClass();
        String str = resultDictionaryData.f20837m;
        String str2 = resultDictionaryData.f20836l;
        String str3 = resultDictionaryData.f20835k;
        String str4 = resultDictionaryData.f20834j;
        String str5 = resultDictionaryData.f20833i;
        String str6 = resultDictionaryData.f20832h;
        String str7 = resultDictionaryData.f20831g;
        boolean z = resultDictionaryData.f20830f;
        String str8 = resultDictionaryData.f20829e;
        String str9 = resultDictionaryData.f20828d;
        int i = resultDictionaryData.f20827c;
        String str10 = resultDictionaryData.f20826b;
        int i2 = resultDictionaryData.f20825a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(0, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str10 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != -1) {
            mk9VarMo15606b.m16878v(2, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str9 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str8 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str7 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
