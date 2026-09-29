package com.lingq.core.domain.model.language;

import com.android.installreferrer.api.InstallReferrerClient;
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
public final /* synthetic */ class Language$$serializer implements zk3 {
    public static final Language$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Language$$serializer language$$serializer = new Language$$serializer();
        INSTANCE = language$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.Language", language$$serializer, 20);
        bg7Var.m3702k("code", true);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("supported", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("lastUsed", true);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("dictionaryLocaleActive", true);
        bg7Var.m3702k("grammarResourceSlug", true);
        bg7Var.m3702k("studyStats", false);
        bg7Var.m3702k("intense", false);
        bg7Var.m3702k("streakGoal", true);
        bg7Var.m3702k("streakDays", true);
        bg7Var.m3702k("repetitionLingQs", true);
        bg7Var.m3702k("emailLotd", true);
        bg7Var.m3702k("siteLotd", true);
        bg7Var.m3702k("feedLevels", true);
        bg7Var.m3702k("lotdDates", true);
        bg7Var.m3702k("scheduledForDeletion", true);
        descriptor = bg7Var;
    }

    private Language$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = Language.f19023u;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{sk9Var, l84Var, thb.m22059r(sk9Var), cs4VarArr[3].getValue(), lf0Var, sk9Var, thb.m22059r(sk9Var), l84Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(LanguageStudyStats$$serializer.INSTANCE), thb.m22059r(sk9Var), thb.m22059r(l84Var), l84Var, l84Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r((KSerializer) cs4VarArr[17].getValue()), cs4VarArr[18].getValue(), thb.m22059r(lf0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Language deserialize(Decoder decoder) {
        int i;
        List list;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = Language.f19023u;
        Integer num = null;
        String str = null;
        LanguageStudyStats languageStudyStats = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        String str5 = null;
        List list2 = null;
        String str6 = null;
        List list3 = null;
        List list4 = null;
        Boolean bool = null;
        String str7 = null;
        int iMo4091q = 0;
        boolean z = true;
        String strMo4097x = null;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        boolean zMo4094v = false;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    list = list3;
                    z = false;
                    list3 = list;
                    num = num;
                    break;
                case 0:
                    list = list3;
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i2 |= 1;
                    str6 = str6;
                    list3 = list;
                    num = num;
                    break;
                case 1:
                    num = num;
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i2 |= 2;
                    str6 = str6;
                    num = num;
                    break;
                case 2:
                    list = list3;
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str6);
                    i2 |= 4;
                    list3 = list;
                    num = num;
                    break;
                case 3:
                    num = num;
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list3);
                    i2 |= 8;
                    str6 = str6;
                    num = num;
                    break;
                case 4:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 4);
                    i2 |= 16;
                    str6 = str6;
                    break;
                case 5:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i2 |= 32;
                    str6 = str6;
                    break;
                case 6:
                    str6 = str6;
                    list3 = list3;
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str7);
                    i2 |= 64;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 7:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i2 |= 128;
                    str6 = str6;
                    break;
                case 8:
                    str6 = str6;
                    list3 = list3;
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str4);
                    i2 |= 256;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 9:
                    str6 = str6;
                    list3 = list3;
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str2);
                    i2 |= 512;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 10:
                    str6 = str6;
                    list3 = list3;
                    languageStudyStats = (LanguageStudyStats) df1VarMo4079b.mo4070D(serialDescriptor, 10, LanguageStudyStats$$serializer.INSTANCE, languageStudyStats);
                    i2 |= 1024;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 11:
                    str6 = str6;
                    list3 = list3;
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 11, sk9.f60959a, str);
                    i2 |= 2048;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 12:
                    str6 = str6;
                    list3 = list3;
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 12, l84.f49294a, num);
                    i2 |= 4096;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 13:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 13);
                    i2 |= 8192;
                    str6 = str6;
                    break;
                case 14:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 14);
                    i2 |= 16384;
                    str6 = str6;
                    break;
                case 15:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 15, sk9.f60959a, str3);
                    i = 32768;
                    i2 |= i;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 16:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 16, sk9.f60959a, str5);
                    i = 65536;
                    i2 |= i;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 17:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list2);
                    i = 131072;
                    i2 |= i;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 18:
                    list4 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 18, (KSerializer) cs4VarArr[18].getValue(), list4);
                    i = 262144;
                    i2 |= i;
                    str6 = str6;
                    list3 = list3;
                    break;
                case 19:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 19, lf0.f49579a, bool);
                    i = 524288;
                    i2 |= i;
                    str6 = str6;
                    list3 = list3;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        Boolean bool2 = bool;
        return new Language(i2, strMo4097x, iMo4091q2, str6, list3, zMo4094v, strMo4097x2, str7, iMo4091q, str4, str2, languageStudyStats, str, num, iMo4091q3, iMo4091q4, str3, str5, list2, list4, bool2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:96:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x0185  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Language language) {
        List list;
        List list2;
        Boolean bool;
        encoder.getClass();
        language.getClass();
        Boolean bool2 = language.f19043t;
        List list3 = language.f19042s;
        List list4 = language.f19041r;
        String str = language.f19040q;
        String str2 = language.f19033j;
        String str3 = language.f19032i;
        int i = language.f19031h;
        String str4 = language.f19030g;
        String str5 = language.f19029f;
        boolean z = language.f19028e;
        List list5 = language.f19027d;
        String str6 = language.f19026c;
        int i2 = language.f19025b;
        String str7 = language.f19024a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = Language.f19023u;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str7, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(1, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str6, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list5, new ArrayList())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 4, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str5, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 5, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str4, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(7, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str2);
        }
        LanguageStudyStats$$serializer languageStudyStats$$serializer = LanguageStudyStats$$serializer.INSTANCE;
        LanguageStudyStats languageStudyStats = language.f19034k;
        String str8 = language.f19039p;
        int i3 = language.f19038o;
        int i4 = language.f19037n;
        Integer num = language.f19036m;
        mk9VarMo15606b.m16880x(serialDescriptor, 10, languageStudyStats$$serializer, languageStudyStats);
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 11, sk9Var, language.f19035l);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
            mk9VarMo15606b.m16878v(13, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(14, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str8, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9Var, str8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9Var, str);
        }
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            list = list4;
            if (!fa4.m11650l(list, new ArrayList())) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                if (!fa4.m11650l(list2, new ArrayList())) {
                }
                list2 = list3;
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    bool = bool2;
                    if (!fa4.m11650l(bool, Boolean.FALSE)) {
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                bool = bool2;
                mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, bool);
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list3;
            list2 = list3;
            mk9VarMo15606b.m16881y(serialDescriptor, 18, (KSerializer) cs4VarArr[18].getValue(), list2);
            list2 = list3;
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool = bool2;
                if (!fa4.m11650l(bool, Boolean.FALSE)) {
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool = bool2;
            mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, bool);
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list = list4;
        mk9VarMo15606b.m16880x(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            if (!fa4.m11650l(list2, new ArrayList())) {
            }
            list2 = list3;
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                bool = bool2;
                if (!fa4.m11650l(bool, Boolean.FALSE)) {
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            bool = bool2;
            mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, bool);
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list2 = list3;
        list2 = list3;
        mk9VarMo15606b.m16881y(serialDescriptor, 18, (KSerializer) cs4VarArr[18].getValue(), list2);
        list2 = list3;
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            bool = bool2;
            if (!fa4.m11650l(bool, Boolean.FALSE)) {
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        bool = bool2;
        mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, bool);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
