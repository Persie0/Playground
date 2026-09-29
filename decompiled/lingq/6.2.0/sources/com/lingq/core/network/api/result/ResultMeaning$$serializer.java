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

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultMeaning$$serializer implements zk3 {
    public static final ResultMeaning$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultMeaning$$serializer resultMeaning$$serializer = new ResultMeaning$$serializer();
        INSTANCE = resultMeaning$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultMeaning", resultMeaning$$serializer, 10);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("locale", true);
        bg7Var.m3702k("text", true);
        bg7Var.m3702k("term_id", true);
        bg7Var.m3702k("popularity", true);
        bg7Var.m3702k("flagged", true);
        bg7Var.m3702k("detected_locale", true);
        bg7Var.m3702k("creator_id", true);
        bg7Var.m3702k("is_google_translate", true);
        bg7Var.m3702k("word_id", true);
        descriptor = bg7Var;
    }

    private ResultMeaning$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(l84Var);
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{l84Var, kSerializerM22059r, kSerializerM22059r2, l84Var, l84Var, lf0Var, kSerializerM22059r3, kSerializerM22059r4, lf0Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultMeaning deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ResultMeaning resultMeaning = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        int iMo4091q4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
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
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str3);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 7, l84.f49294a, num);
                    i |= 128;
                    break;
                case 8:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultMeaning;
            }
            resultMeaning = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultMeaning(i, iMo4091q, str, str2, iMo4091q2, iMo4091q3, zMo4094v, str3, num, zMo4094v2, iMo4091q4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultMeaning resultMeaning) {
        encoder.getClass();
        resultMeaning.getClass();
        int i = resultMeaning.f21325j;
        boolean z = resultMeaning.f21324i;
        Integer num = resultMeaning.f21323h;
        String str = resultMeaning.f21322g;
        boolean z2 = resultMeaning.f21321f;
        int i2 = resultMeaning.f21320e;
        int i3 = resultMeaning.f21319d;
        String str2 = resultMeaning.f21318c;
        String str3 = resultMeaning.f21317b;
        int i4 = resultMeaning.f21316a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
            mk9VarMo15606b.m16878v(0, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(3, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 8, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(9, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
