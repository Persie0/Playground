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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageToLearn$$serializer implements zk3 {
    public static final LanguageToLearn$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageToLearn$$serializer languageToLearn$$serializer = new LanguageToLearn$$serializer();
        INSTANCE = languageToLearn$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.LanguageToLearn", languageToLearn$$serializer, 8);
        bg7Var.m3702k("code", false);
        bg7Var.m3702k("supported", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("dictionaryLocaleActive", true);
        bg7Var.m3702k("lastUsed", true);
        bg7Var.m3702k("scheduledForDeletion", true);
        descriptor = bg7Var;
    }

    private LanguageToLearn$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        lf0 lf0Var = lf0.f49579a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, lf0Var, sk9Var, l84Var, l84Var, kSerializerM22059r, kSerializerM22059r2, lf0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageToLearn deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        LanguageToLearn languageToLearn = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str2);
                    i |= 64;
                    break;
                case 7:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return languageToLearn;
            }
            languageToLearn = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LanguageToLearn(i, iMo4091q, iMo4091q2, strMo4097x, strMo4097x2, str, str2, zMo4094v, zMo4094v2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageToLearn languageToLearn) {
        encoder.getClass();
        languageToLearn.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = languageToLearn.f19113a;
        boolean z = languageToLearn.f19120h;
        String str2 = languageToLearn.f19119g;
        String str3 = languageToLearn.f19118f;
        int i = languageToLearn.f19117e;
        int i2 = languageToLearn.f19116d;
        String str4 = languageToLearn.f19115c;
        boolean z2 = languageToLearn.f19114b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 1, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str4, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(3, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(4, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 7, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
