package com.lingq.core.domain.model.language;

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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class DictionaryData$$serializer implements zk3 {
    public static final DictionaryData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DictionaryData$$serializer dictionaryData$$serializer = new DictionaryData$$serializer();
        INSTANCE = dictionaryData$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.DictionaryData", dictionaryData$$serializer, 13);
        bg7Var.m3702k("id", false);
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

    private DictionaryData$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, sk9Var, l84Var, sk9Var, sk9Var, lf0.f49579a, sk9Var, sk9Var, sk9Var, sk9Var, sk9Var, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DictionaryData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
        String strMo4097x6 = null;
        String strMo4097x7 = null;
        String strMo4097x8 = null;
        String strMo4097x9 = null;
        String strMo4097x10 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    strMo4097x6 = df1VarMo4079b.mo4097x(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    strMo4097x7 = df1VarMo4079b.mo4097x(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    strMo4097x8 = df1VarMo4079b.mo4097x(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    strMo4097x9 = df1VarMo4079b.mo4097x(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    strMo4097x10 = df1VarMo4079b.mo4097x(serialDescriptor, 12);
                    i |= 4096;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new DictionaryData(i, iMo4091q, strMo4097x, iMo4091q2, strMo4097x2, strMo4097x3, zMo4094v, strMo4097x4, strMo4097x5, strMo4097x6, strMo4097x7, strMo4097x8, strMo4097x9, strMo4097x10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DictionaryData dictionaryData) {
        encoder.getClass();
        dictionaryData.getClass();
        String str = dictionaryData.f19020m;
        String str2 = dictionaryData.f19019l;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = dictionaryData.f19008a;
        String str3 = dictionaryData.f19018k;
        String str4 = dictionaryData.f19017j;
        String str5 = dictionaryData.f19016i;
        String str6 = dictionaryData.f19015h;
        String str7 = dictionaryData.f19014g;
        boolean z = dictionaryData.f19013f;
        String str8 = dictionaryData.f19012e;
        String str9 = dictionaryData.f19011d;
        int i2 = dictionaryData.f19010c;
        String str10 = dictionaryData.f19009b;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str10, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != -1) {
            mk9VarMo15606b.m16878v(2, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str9, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 3, str9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str8, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 4, str8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str7, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 6, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str6, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 7, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str5, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 8, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str4, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 9, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 10, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 11, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 12, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
