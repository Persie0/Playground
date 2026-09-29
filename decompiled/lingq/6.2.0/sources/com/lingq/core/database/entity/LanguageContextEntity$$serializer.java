package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import com.lingq.core.domain.model.language.LanguageContextNotification$$serializer;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageContextEntity$$serializer implements zk3 {
    public static final LanguageContextEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageContextEntity$$serializer languageContextEntity$$serializer = new LanguageContextEntity$$serializer();
        INSTANCE = languageContextEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LanguageContextEntity", languageContextEntity$$serializer, 19);
        bg7Var.m3702k("code", true);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("url", false);
        bg7Var.m3702k("repetitionLingQs", true);
        bg7Var.m3702k("lotdDates", true);
        bg7Var.m3702k("emailNotifications", false);
        bg7Var.m3702k("siteNotifications", false);
        bg7Var.m3702k("isUseFeed", true);
        bg7Var.m3702k("intense", false);
        bg7Var.m3702k("streakGoal", true);
        bg7Var.m3702k("streakDays", false);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("supported", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("lastUsed", false);
        bg7Var.m3702k("knownWords", false);
        bg7Var.m3702k("grammarResourceSlug", false);
        bg7Var.m3702k("feedLevels", true);
        bg7Var.m3702k("scheduledForDeletion", true);
        descriptor = bg7Var;
    }

    private LanguageContextEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LanguageContextEntity.f17148t;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        LanguageContextNotification$$serializer languageContextNotification$$serializer = LanguageContextNotification$$serializer.INSTANCE;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{sk9Var, l84Var, thb.m22059r(sk9Var), l84Var, cs4VarArr[4].getValue(), thb.m22059r(languageContextNotification$$serializer), thb.m22059r(languageContextNotification$$serializer), thb.m22059r(lf0Var), thb.m22059r(sk9Var), thb.m22059r(l84Var), l84Var, cs4VarArr[11].getValue(), thb.m22059r(lf0Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r((KSerializer) cs4VarArr[17].getValue()), thb.m22059r(lf0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageContextEntity deserialize(Decoder decoder) {
        int i;
        LanguageContextNotification languageContextNotification;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LanguageContextEntity.f17148t;
        Boolean bool = null;
        List list = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Boolean bool2 = null;
        int i2 = 0;
        String str3 = null;
        Integer num2 = null;
        List list2 = null;
        String str4 = null;
        Boolean bool3 = null;
        LanguageContextNotification languageContextNotification2 = null;
        LanguageContextNotification languageContextNotification3 = null;
        boolean z = true;
        int iMo4091q = 0;
        String strMo4097x = null;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        String str5 = null;
        List list3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    bool = bool;
                    languageContextNotification3 = languageContextNotification3;
                    z = false;
                    languageContextNotification3 = languageContextNotification3;
                    bool = bool;
                    break;
                case 0:
                    languageContextNotification = languageContextNotification2;
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i2 |= 1;
                    languageContextNotification2 = languageContextNotification;
                    languageContextNotification3 = languageContextNotification3;
                    bool = bool;
                    break;
                case 1:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i2 |= 2;
                    languageContextNotification2 = languageContextNotification2;
                    bool = bool;
                    break;
                case 2:
                    languageContextNotification = languageContextNotification2;
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str5);
                    i2 |= 4;
                    languageContextNotification2 = languageContextNotification;
                    languageContextNotification3 = languageContextNotification3;
                    bool = bool;
                    break;
                case 3:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i2 |= 8;
                    languageContextNotification2 = languageContextNotification2;
                    bool = bool;
                    break;
                case 4:
                    languageContextNotification = languageContextNotification2;
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list3);
                    i2 |= 16;
                    languageContextNotification2 = languageContextNotification;
                    languageContextNotification3 = languageContextNotification3;
                    bool = bool;
                    break;
                case 5:
                    bool = bool;
                    languageContextNotification3 = languageContextNotification3;
                    languageContextNotification2 = (LanguageContextNotification) df1VarMo4079b.mo4070D(serialDescriptor, 5, LanguageContextNotification$$serializer.INSTANCE, languageContextNotification2);
                    i2 |= 32;
                    languageContextNotification3 = languageContextNotification3;
                    bool = bool;
                    break;
                case 6:
                    languageContextNotification3 = (LanguageContextNotification) df1VarMo4079b.mo4070D(serialDescriptor, 6, LanguageContextNotification$$serializer.INSTANCE, languageContextNotification3);
                    i2 |= 64;
                    languageContextNotification2 = languageContextNotification2;
                    bool = bool;
                    break;
                case 7:
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    bool2 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 7, lf0.f49579a, bool2);
                    i2 |= 128;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 8:
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str);
                    i2 |= 256;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 9:
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 9, l84.f49294a, num);
                    i2 |= 512;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 10:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 10);
                    i2 |= 1024;
                    languageContextNotification2 = languageContextNotification2;
                    break;
                case 11:
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list);
                    i2 |= 2048;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 12:
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 12, lf0.f49579a, bool);
                    i2 |= 4096;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 13:
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 13, sk9.f60959a, str2);
                    i2 |= 8192;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 14:
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 14, sk9.f60959a, str3);
                    i2 |= 16384;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 15:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 15, l84.f49294a, num2);
                    i = 32768;
                    i2 |= i;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 16:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 16, sk9.f60959a, str4);
                    i = 65536;
                    i2 |= i;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 17:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list2);
                    i = 131072;
                    i2 |= i;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                case 18:
                    bool3 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 18, lf0.f49579a, bool3);
                    i = 262144;
                    i2 |= i;
                    languageContextNotification2 = languageContextNotification2;
                    languageContextNotification3 = languageContextNotification3;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        Boolean bool4 = bool;
        String str6 = str5;
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LanguageContextEntity(i2, strMo4097x, iMo4091q2, str6, iMo4091q3, list3, languageContextNotification2, languageContextNotification3, bool2, str, num, iMo4091q, list, bool4, str2, str3, num2, str4, list2, bool3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageContextEntity languageContextEntity) {
        encoder.getClass();
        languageContextEntity.getClass();
        int i = languageContextEntity.f17150b;
        String str = languageContextEntity.f17149a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LanguageContextEntity.f17148t;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(1, i, serialDescriptor);
        }
        sk9 sk9Var = sk9.f60959a;
        String str2 = languageContextEntity.f17151c;
        Boolean bool = languageContextEntity.f17167s;
        List list = languageContextEntity.f17166r;
        List list2 = languageContextEntity.f17160l;
        Integer num = languageContextEntity.f17158j;
        Boolean bool2 = languageContextEntity.f17156h;
        List list3 = languageContextEntity.f17153e;
        int i2 = languageContextEntity.f17152d;
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, str2);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(3, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list3, new ArrayList())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list3);
        }
        LanguageContextNotification$$serializer languageContextNotification$$serializer = LanguageContextNotification$$serializer.INSTANCE;
        mk9VarMo15606b.m16880x(serialDescriptor, 5, languageContextNotification$$serializer, languageContextEntity.f17154f);
        mk9VarMo15606b.m16880x(serialDescriptor, 6, languageContextNotification$$serializer, languageContextEntity.f17155g);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(bool2, Boolean.FALSE)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, lf0.f49579a, bool2);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9Var, languageContextEntity.f17157i);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, l84.f49294a, num);
        }
        mk9VarMo15606b.m16878v(10, languageContextEntity.f17159k, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list2, new ArrayList())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list2);
        }
        lf0 lf0Var = lf0.f49579a;
        mk9VarMo15606b.m16880x(serialDescriptor, 12, lf0Var, languageContextEntity.f17161m);
        mk9VarMo15606b.m16880x(serialDescriptor, 13, sk9Var, languageContextEntity.f17162n);
        mk9VarMo15606b.m16880x(serialDescriptor, 14, sk9Var, languageContextEntity.f17163o);
        mk9VarMo15606b.m16880x(serialDescriptor, 15, l84.f49294a, languageContextEntity.f17164p);
        mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9Var, languageContextEntity.f17165q);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, new ArrayList())) {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, lf0Var, bool);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
