package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
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
public final /* synthetic */ class ResultOffer$$serializer implements zk3 {
    public static final ResultOffer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultOffer$$serializer resultOffer$$serializer = new ResultOffer$$serializer();
        INSTANCE = resultOffer$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultOffer", resultOffer$$serializer, 17);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("code", false);
        bg7Var.m3702k("type", true);
        bg7Var.m3702k("visibility", true);
        bg7Var.m3702k("date", false);
        bg7Var.m3702k("coupon", false);
        bg7Var.m3702k("tier", true);
        bg7Var.m3702k("event", true);
        bg7Var.m3702k("discount", true);
        bg7Var.m3702k("countdown", true);
        bg7Var.m3702k("is_active", true);
        bg7Var.m3702k("cta_text", true);
        bg7Var.m3702k("offer_code_url", false);
        bg7Var.m3702k("accent_color", false);
        bg7Var.m3702k("trial_header", true);
        bg7Var.m3702k("banners", false);
        descriptor = bg7Var;
    }

    private ResultOffer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultOffer.f21358r;
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{l84Var, sk9Var, sk9Var, thb.m22059r(sk9Var), sk9Var, ResultOfferDate$$serializer.INSTANCE, ResultOfferCoupon$$serializer.INSTANCE, thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), lf0Var, lf0Var, thb.m22059r(sk9Var), ResultOfferUrl$$serializer.INSTANCE, ResultOfferAccentColor$$serializer.INSTANCE, thb.m22059r(sk9Var), cs4VarArr[16].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultOffer deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultOffer.f21358r;
        ResultOfferUrl resultOfferUrl = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ResultOfferAccentColor resultOfferAccentColor = null;
        Integer num = null;
        int i2 = 0;
        String str4 = null;
        List list = null;
        String strMo4097x = null;
        String str5 = null;
        String strMo4097x2 = null;
        ResultOfferDate resultOfferDate = null;
        ResultOfferCoupon resultOfferCoupon = null;
        boolean z = true;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        int iMo4091q = 0;
        String strMo4097x3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    strMo4097x2 = strMo4097x2;
                    z = false;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 0:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i2 |= 1;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 1:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i2 |= 2;
                    strMo4097x = strMo4097x;
                    break;
                case 2:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i2 |= 4;
                    break;
                case 3:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str5);
                    i2 |= 8;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 4:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i2 |= 16;
                    strMo4097x = strMo4097x;
                    break;
                case 5:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    resultOfferDate = (ResultOfferDate) df1VarMo4079b.mo4073G(serialDescriptor, 5, ResultOfferDate$$serializer.INSTANCE, resultOfferDate);
                    i2 |= 32;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 6:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    resultOfferCoupon = (ResultOfferCoupon) df1VarMo4079b.mo4073G(serialDescriptor, 6, ResultOfferCoupon$$serializer.INSTANCE, resultOfferCoupon);
                    i2 |= 64;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 7:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 7, l84.f49294a, num);
                    i2 |= 128;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 8:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str3);
                    i2 |= 256;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 9:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str2);
                    i2 |= 512;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 10:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 10);
                    i2 |= 1024;
                    strMo4097x = strMo4097x;
                    break;
                case 11:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 11);
                    i2 |= 2048;
                    strMo4097x = strMo4097x;
                    break;
                case 12:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 12, sk9.f60959a, str);
                    i2 |= 4096;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 13:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    resultOfferUrl = (ResultOfferUrl) df1VarMo4079b.mo4073G(serialDescriptor, 13, ResultOfferUrl$$serializer.INSTANCE, resultOfferUrl);
                    i2 |= 8192;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 14:
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    resultOfferAccentColor = (ResultOfferAccentColor) df1VarMo4079b.mo4073G(serialDescriptor, 14, ResultOfferAccentColor$$serializer.INSTANCE, resultOfferAccentColor);
                    i2 |= 16384;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 15:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 15, sk9.f60959a, str4);
                    i = 32768;
                    i2 |= i;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                case 16:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 16, (KSerializer) cs4VarArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    strMo4097x = strMo4097x;
                    strMo4097x2 = strMo4097x2;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultOffer(i2, iMo4091q, strMo4097x3, strMo4097x, str5, strMo4097x2, resultOfferDate, resultOfferCoupon, num, str3, str2, zMo4094v, zMo4094v2, str, resultOfferUrl, resultOfferAccentColor, str4, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultOffer resultOffer) {
        encoder.getClass();
        resultOffer.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultOffer.f21358r;
        int i = resultOffer.f21359a;
        String str = resultOffer.f21374p;
        String str2 = resultOffer.f21371m;
        boolean z = resultOffer.f21370l;
        boolean z2 = resultOffer.f21369k;
        String str3 = resultOffer.f21368j;
        String str4 = resultOffer.f21367i;
        Integer num = resultOffer.f21366h;
        String str5 = resultOffer.f21363e;
        String str6 = resultOffer.f21362d;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, resultOffer.f21360b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, resultOffer.f21361c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str5, "Public")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 4, str5);
        }
        mk9VarMo15606b.m16881y(serialDescriptor, 5, ResultOfferDate$$serializer.INSTANCE, resultOffer.f21364f);
        mk9VarMo15606b.m16881y(serialDescriptor, 6, ResultOfferCoupon$$serializer.INSTANCE, resultOffer.f21365g);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 10, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 11, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, sk9.f60959a, str2);
        }
        mk9VarMo15606b.m16881y(serialDescriptor, 13, ResultOfferUrl$$serializer.INSTANCE, resultOffer.f21372n);
        mk9VarMo15606b.m16881y(serialDescriptor, 14, ResultOfferAccentColor$$serializer.INSTANCE, resultOffer.f21373o);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16881y(serialDescriptor, 16, (KSerializer) cs4VarArr[16].getValue(), resultOffer.f21375q);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
