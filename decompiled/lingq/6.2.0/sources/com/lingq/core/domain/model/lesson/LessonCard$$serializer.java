package com.lingq.core.domain.model.lesson;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.collections.EmptyList;
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
public final /* synthetic */ class LessonCard$$serializer implements zk3 {
    public static final LessonCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonCard$$serializer lessonCard$$serializer = new LessonCard$$serializer();
        INSTANCE = lessonCard$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonCard", lessonCard$$serializer, 28);
        bg7Var.m3702k("term", false);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("gTags", true);
        bg7Var.m3702k("termWithLanguage", true);
        bg7Var.m3702k("isPhrase", false);
        bg7Var.m3702k("meanings", true);
        bg7Var.m3702k("importance", true);
        bg7Var.m3702k("fragment", true);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("status", false);
        bg7Var.m3702k("extendedStatus", true);
        bg7Var.m3702k("lastReviewedCorrect", true);
        bg7Var.m3702k("srsDueDate", true);
        bg7Var.m3702k("notes", true);
        bg7Var.m3702k("audio", true);
        bg7Var.m3702k("meaningTerms", true);
        bg7Var.m3702k("words", true);
        bg7Var.m3702k("hiragana", true);
        bg7Var.m3702k("romaji", true);
        bg7Var.m3702k("pinyin", true);
        bg7Var.m3702k("hant", true);
        bg7Var.m3702k("hans", true);
        bg7Var.m3702k("jyutping", true);
        bg7Var.m3702k("chunk", true);
        bg7Var.m3702k("furigana", true);
        bg7Var.m3702k("latin", true);
        bg7Var.m3702k("creationDate", true);
        descriptor = bg7Var;
    }

    private LessonCard$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LessonCard.f19175C;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, cs4VarArr[1].getValue(), cs4VarArr[2].getValue(), sk9Var, lf0.f49579a, cs4VarArr[5].getValue(), l84Var, thb.m22059r(sk9Var), l84Var, thb.m22059r(sk9Var), l84Var, thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r((KSerializer) cs4VarArr[17].getValue()), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonCard deserialize(Decoder decoder) {
        int i;
        String str;
        int i2;
        String str2;
        int i3;
        int i4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LessonCard.f19175C;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        List list = null;
        String str14 = null;
        String str15 = null;
        int iMo4091q = 0;
        int i5 = 1;
        boolean z = true;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String str16 = null;
        String str17 = null;
        Integer num = null;
        String str18 = null;
        String str19 = null;
        int i6 = 0;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        boolean zMo4094v = false;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    i = i6;
                    str7 = str7;
                    str12 = str12;
                    int i7 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i7;
                    str3 = str3;
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    str7 = str7;
                    i = i6 | 1;
                    str12 = str12;
                    int i8 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i8;
                    str3 = str3;
                    break;
                case 1:
                    str = str7;
                    i5 = i5;
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, i5, (KSerializer) cs4VarArr[i5].getValue(), list2);
                    i = i6 | 2;
                    str7 = str;
                    str12 = str12;
                    int i9 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i9;
                    str3 = str3;
                    break;
                case 2:
                    str = str7;
                    int i10 = i5;
                    i = i6 | 4;
                    i5 = i10;
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list3);
                    str7 = str;
                    str12 = str12;
                    int i11 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i11;
                    str3 = str3;
                    break;
                case 3:
                    str3 = str3;
                    str7 = str7;
                    str12 = str12;
                    int i12 = i6;
                    str4 = str4;
                    i2 = i12 | 8;
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i13 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i13;
                    str3 = str3;
                    break;
                case 4:
                    str2 = str12;
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 4);
                    i3 = i6 | 16;
                    str12 = str2;
                    i = i3;
                    int i14 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i14;
                    str3 = str3;
                    break;
                case 5:
                    str = str7;
                    int i15 = i5;
                    i = i6 | 32;
                    i5 = i15;
                    list4 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list4);
                    str7 = str;
                    str12 = str12;
                    int i16 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i16;
                    str3 = str3;
                    break;
                case 6:
                    str3 = str3;
                    str7 = str7;
                    str12 = str12;
                    int i17 = i6;
                    str4 = str4;
                    i2 = i17 | 64;
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i18 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i18;
                    str3 = str3;
                    break;
                case 7:
                    str = str7;
                    int i19 = i5;
                    i = i6 | 128;
                    i5 = i19;
                    str16 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str16);
                    str7 = str;
                    str12 = str12;
                    int i110 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i110;
                    str3 = str3;
                    break;
                case 8:
                    str3 = str3;
                    str7 = str7;
                    str12 = str12;
                    int i20 = i6;
                    str4 = str4;
                    i2 = i20 | 256;
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 8);
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i111 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i111;
                    str3 = str3;
                    break;
                case 9:
                    str = str7;
                    int i21 = i5;
                    i = i6 | 512;
                    i5 = i21;
                    str17 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str17);
                    str7 = str;
                    str12 = str12;
                    int i112 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i112;
                    str3 = str3;
                    break;
                case 10:
                    str2 = str12;
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 10);
                    i3 = i6 | 1024;
                    str12 = str2;
                    i = i3;
                    int i113 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i113;
                    str3 = str3;
                    break;
                case 11:
                    str = str7;
                    int i22 = i5;
                    i = i6 | 2048;
                    i5 = i22;
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 11, l84.f49294a, num);
                    str7 = str;
                    str12 = str12;
                    int i114 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i114;
                    str3 = str3;
                    break;
                case 12:
                    str3 = str3;
                    str2 = str12;
                    int i23 = i6;
                    str4 = str4;
                    i3 = i23 | 4096;
                    str18 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 12, sk9.f60959a, str18);
                    str7 = str7;
                    str12 = str2;
                    i = i3;
                    int i115 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i115;
                    str3 = str3;
                    break;
                case 13:
                    str = str7;
                    int i24 = i5;
                    i = i6 | 8192;
                    i5 = i24;
                    str19 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 13, sk9.f60959a, str19);
                    str7 = str;
                    str12 = str12;
                    int i116 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i116;
                    str3 = str3;
                    break;
                case 14:
                    str2 = str12;
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 14, sk9.f60959a, str7);
                    i3 = i6 | 16384;
                    str12 = str2;
                    i = i3;
                    int i117 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i117;
                    str3 = str3;
                    break;
                case 15:
                    str3 = str3;
                    str12 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 15, sk9.f60959a, str12);
                    i3 = i6 | 32768;
                    str4 = str4;
                    i5 = i5;
                    str7 = str7;
                    i = i3;
                    int i118 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i118;
                    str3 = str3;
                    break;
                case 16:
                    str13 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 16, sk9.f60959a, str13);
                    i4 = 65536;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i119 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i119;
                    str3 = str3;
                    break;
                case 17:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list);
                    i4 = 131072;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1110 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1110;
                    str3 = str3;
                    break;
                case 18:
                    str14 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 18, sk9.f60959a, str14);
                    i4 = 262144;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1111 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1111;
                    str3 = str3;
                    break;
                case 19:
                    str8 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 19, sk9.f60959a, str8);
                    i4 = 524288;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1112 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1112;
                    str3 = str3;
                    break;
                case 20:
                    str10 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 20, sk9.f60959a, str10);
                    i4 = 1048576;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1113 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1113;
                    str3 = str3;
                    break;
                case 21:
                    str11 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 21, sk9.f60959a, str11);
                    i4 = 2097152;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1114 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1114;
                    str3 = str3;
                    break;
                case 22:
                    str15 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 22, sk9.f60959a, str15);
                    i4 = 4194304;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1115 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1115;
                    str3 = str3;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 23, sk9.f60959a, str6);
                    i4 = 8388608;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1116 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1116;
                    str3 = str3;
                    break;
                case 24:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 24, sk9.f60959a, str5);
                    i4 = 16777216;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1117 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1117;
                    str3 = str3;
                    break;
                case 25:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 25, sk9.f60959a, str4);
                    i4 = 33554432;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1118 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1118;
                    str3 = str3;
                    break;
                case 26:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 26, sk9.f60959a, str3);
                    i4 = 67108864;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i1119 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i1119;
                    str3 = str3;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str9 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 27, sk9.f60959a, str9);
                    i4 = 134217728;
                    i2 = i6 | i4;
                    str3 = str3;
                    str4 = str4;
                    i5 = i5;
                    str12 = str12;
                    i = i2;
                    str7 = str7;
                    int i11110 = i;
                    i5 = i5;
                    str4 = str4;
                    i6 = i11110;
                    str3 = str3;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        String str20 = str7;
        String str21 = str12;
        int i25 = i6;
        String str22 = str4;
        df1VarMo4079b.mo4086j(serialDescriptor);
        List list5 = list;
        int i26 = iMo4091q;
        String str23 = str17;
        String str24 = str11;
        int i27 = iMo4091q3;
        String str25 = str13;
        Integer num2 = num;
        String str26 = str15;
        return new LessonCard(i25, iMo4091q2, i27, i26, num2, strMo4097x, strMo4097x2, str16, str23, str18, str19, str20, str21, str25, str14, str8, str10, str24, str26, str6, str5, str22, str3, str9, list2, list3, list4, list5, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01df  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:112:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0203  */
    /* JADX WARN: Code duplicated, block: B:117:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0215  */
    /* JADX WARN: Code duplicated, block: B:122:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0227  */
    /* JADX WARN: Code duplicated, block: B:127:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0239  */
    /* JADX WARN: Code duplicated, block: B:132:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x024b  */
    /* JADX WARN: Code duplicated, block: B:137:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x025d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01cd  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonCard lessonCard) {
        String str;
        String str2;
        List list;
        encoder.getClass();
        lessonCard.getClass();
        String str3 = lessonCard.f19177B;
        String str4 = lessonCard.f19176A;
        String str5 = lessonCard.f19203z;
        String str6 = lessonCard.f19202y;
        String str7 = lessonCard.f19201x;
        String str8 = lessonCard.f19200w;
        String str9 = lessonCard.f19199v;
        String str10 = lessonCard.f19198u;
        String str11 = lessonCard.f19197t;
        String str12 = lessonCard.f19196s;
        List list2 = lessonCard.f19195r;
        String str13 = lessonCard.f19194q;
        String str14 = lessonCard.f19193p;
        String str15 = lessonCard.f19192o;
        String str16 = lessonCard.f19191n;
        String str17 = lessonCard.f19190m;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LessonCard.f19175C;
        String str18 = lessonCard.f19178a;
        Integer num = lessonCard.f19189l;
        String str19 = lessonCard.f19187j;
        int i = lessonCard.f19186i;
        String str20 = lessonCard.f19185h;
        int i2 = lessonCard.f19184g;
        List list3 = lessonCard.f19183f;
        String str21 = lessonCard.f19181d;
        List list4 = lessonCard.f19180c;
        List list5 = lessonCard.f19179b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str18);
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list5, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list4, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str21, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 3, str21);
        }
        mk9VarMo15606b.m16873q(serialDescriptor, 4, lessonCard.f19182e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list3, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(6, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str20, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str20);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(8, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str19 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str19);
        }
        mk9VarMo15606b.m16878v(10, lessonCard.f19188k, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num == null || num.intValue() != -1) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str17 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, sk9.f60959a, str17);
        }
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            str = str16;
            if (!fa4.m11650l(str, "")) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str2 = str15;
                if (!fa4.m11650l(str2, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor) || str14 != null) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str14);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor) || str13 != null) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str13);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list = list2;
                    if (!fa4.m11650l(list, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str12 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str11 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str10 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str9 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str8 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str7 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list = list2;
                mk9VarMo15606b.m16880x(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str2 = str15;
            mk9VarMo15606b.m16880x(serialDescriptor, 14, sk9.f60959a, str2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str14);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str14);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str13);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str13);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list = list2;
                if (!fa4.m11650l(list, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list = list2;
            mk9VarMo15606b.m16880x(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        str = str16;
        mk9VarMo15606b.m16880x(serialDescriptor, 13, sk9.f60959a, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            str2 = str15;
            if (!fa4.m11650l(str2, "")) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str14);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str14);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str13);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str13);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list = list2;
                if (!fa4.m11650l(list, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list = list2;
            mk9VarMo15606b.m16880x(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        str2 = str15;
        mk9VarMo15606b.m16880x(serialDescriptor, 14, sk9.f60959a, str2);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str14);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str14);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str13);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str13);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            list = list2;
            if (!fa4.m11650l(list, emptyList)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list = list2;
        mk9VarMo15606b.m16880x(serialDescriptor, 17, (KSerializer) cs4VarArr[17].getValue(), list);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9.f60959a, str12);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9.f60959a, str11);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9.f60959a, str10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9.f60959a, str9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9.f60959a, str8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9.f60959a, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 26, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9.f60959a, str3);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
