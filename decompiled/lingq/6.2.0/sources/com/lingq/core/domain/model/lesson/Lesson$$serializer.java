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
public final /* synthetic */ class Lesson$$serializer implements zk3 {
    public static final Lesson$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Lesson$$serializer lesson$$serializer = new Lesson$$serializer();
        INSTANCE = lesson$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.Lesson", lesson$$serializer, 37);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("description", true);
        bg7Var.m3702k("originalImageUrl", true);
        bg7Var.m3702k("imageUrl", true);
        bg7Var.m3702k("audioUrl", true);
        bg7Var.m3702k("duration", true);
        bg7Var.m3702k("collectionId", true);
        bg7Var.m3702k("collectionTitle", true);
        bg7Var.m3702k("translation", true);
        bg7Var.m3702k("previousLessonId", true);
        bg7Var.m3702k("nextLessonId", true);
        bg7Var.m3702k("isCompleted", true);
        bg7Var.m3702k("progressDownloaded", true);
        bg7Var.m3702k("translationSentence", true);
        bg7Var.m3702k("mediaImageUrl", true);
        bg7Var.m3702k("mediaTitle", true);
        bg7Var.m3702k("level", true);
        bg7Var.m3702k("newWordsCount", false);
        bg7Var.m3702k("isTaken", false);
        bg7Var.m3702k("videoUrl", false);
        bg7Var.m3702k("audioPending", true);
        bg7Var.m3702k("sharedByName", false);
        bg7Var.m3702k("isProtected", true);
        bg7Var.m3702k("canEditSentence", true);
        bg7Var.m3702k("isCanEdit", true);
        bg7Var.m3702k("price", true);
        bg7Var.m3702k("promotedCourse", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("nextLesson", true);
        bg7Var.m3702k("previousLesson", true);
        bg7Var.m3702k("isLocked", true);
        bg7Var.m3702k("simplifiedTo", true);
        bg7Var.m3702k("simplifiedBy", true);
        bg7Var.m3702k("metadata", true);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("lastOpenTime", true);
        descriptor = bg7Var;
    }

    private Lesson$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = Lesson.f19130L;
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        lf0 lf0Var = lf0.f49579a;
        LessonReference$$serializer lessonReference$$serializer = LessonReference$$serializer.INSTANCE;
        LessonSimplifiedOf$$serializer lessonSimplifiedOf$$serializer = LessonSimplifiedOf$$serializer.INSTANCE;
        return new KSerializer[]{l84Var, sk9Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84Var, l84Var, thb.m22059r(sk9Var), thb.m22059r(LessonSentencesTranslation$$serializer.INSTANCE), thb.m22059r(l84Var), thb.m22059r(l84Var), lf0Var, l84Var, cs4VarArr[14].getValue(), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84Var, thb.m22059r(lf0Var), thb.m22059r(sk9Var), lf0Var, thb.m22059r(sk9Var), lf0Var, lf0Var, lf0Var, l84Var, thb.m22059r(LessonPromotedCourse$$serializer.INSTANCE), thb.m22059r((KSerializer) cs4VarArr[28].getValue()), thb.m22059r(lessonReference$$serializer), thb.m22059r(lessonReference$$serializer), thb.m22059r(sk9Var), thb.m22059r(lessonSimplifiedOf$$serializer), thb.m22059r(lessonSimplifiedOf$$serializer), thb.m22059r(LessonMetadata$$serializer.INSTANCE), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Lesson deserialize(Decoder decoder) {
        int i;
        List list;
        int i2;
        int i3;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = Lesson.f19130L;
        LessonMetadata lessonMetadata = null;
        LessonSimplifiedOf lessonSimplifiedOf = null;
        String str = null;
        LessonReference lessonReference = null;
        String str2 = null;
        LessonReference lessonReference2 = null;
        LessonSimplifiedOf lessonSimplifiedOf2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        LessonPromotedCourse lessonPromotedCourse = null;
        List list2 = null;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean z = true;
        int i6 = 0;
        boolean zMo4094v = false;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        String strMo4097x = null;
        String str7 = null;
        String str8 = null;
        int iMo4091q5 = 0;
        String str9 = null;
        String str10 = null;
        boolean zMo4094v2 = false;
        String str11 = null;
        boolean zMo4094v3 = false;
        boolean zMo4094v4 = false;
        boolean zMo4094v5 = false;
        int iMo4091q6 = 0;
        LessonSentencesTranslation lessonSentencesTranslation = null;
        Integer num = null;
        Integer num2 = null;
        int i7 = 0;
        List list3 = null;
        String str12 = null;
        String str13 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    i = i7;
                    z = false;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    i7 = i;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 0:
                    i = i7 | 1;
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    i7 = i;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 1:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i8 = i7;
                    list3 = list3;
                    i = i8 | 2;
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    i7 = i;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 2:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i9 = i7;
                    i7 = i9 | 4;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str7);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 3:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i10 = i7;
                    i7 = i10 | 8;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    str8 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str8);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 4:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i11 = i7;
                    i7 = i11 | 16;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    str9 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str9);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 5:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i12 = i7;
                    i7 = i12 | 32;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    str10 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str10);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 6:
                    int i13 = i7;
                    list = list3;
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i2 = i13 | 64;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    str4 = str4;
                    list3 = list;
                    i7 = i2;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 7:
                    int i14 = i7;
                    list = list3;
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i2 = i14 | 128;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    str4 = str4;
                    list3 = list;
                    i7 = i2;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 8:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i15 = i7;
                    i7 = i15 | 256;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    str11 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str11);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 9:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i16 = i7;
                    i7 = i16 | 512;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    lessonSentencesTranslation = (LessonSentencesTranslation) df1VarMo4079b.mo4070D(serialDescriptor, 9, LessonSentencesTranslation$$serializer.INSTANCE, lessonSentencesTranslation);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 10:
                    lessonMetadata = lessonMetadata;
                    str4 = str4;
                    bool = bool;
                    int i17 = i7;
                    i7 = i17 | 1024;
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    list3 = list3;
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 10, l84.f49294a, num);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 11:
                    int i18 = i7;
                    list = list3;
                    i2 = i18 | 2048;
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 11, l84.f49294a, num2);
                    lessonSimplifiedOf = lessonSimplifiedOf;
                    str4 = str4;
                    list3 = list;
                    i7 = i2;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 12:
                    str4 = str4;
                    bool = bool;
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 12);
                    i3 = i7 | 4096;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 13:
                    str4 = str4;
                    bool = bool;
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 13);
                    i3 = i7 | 8192;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 14:
                    str4 = str4;
                    bool = bool;
                    i3 = i7 | 16384;
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list3);
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 15:
                    str4 = str4;
                    bool = bool;
                    i3 = i7 | 32768;
                    str12 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 15, sk9.f60959a, str12);
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 16:
                    bool = bool;
                    str4 = str4;
                    i3 = i7 | 65536;
                    str13 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 16, sk9.f60959a, str13);
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 17:
                    lessonMetadata = lessonMetadata;
                    bool = bool;
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 17, sk9.f60959a, str4);
                    i7 |= 131072;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 18:
                    str4 = str4;
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 18);
                    i3 = i7 | 262144;
                    bool = bool;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 19:
                    str4 = str4;
                    lessonMetadata = lessonMetadata;
                    i7 |= 524288;
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 19, lf0.f49579a, bool);
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 20:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 20, sk9.f60959a, str5);
                    i4 = 1048576;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 21:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 21);
                    i4 = 2097152;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 22:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 22, sk9.f60959a, str6);
                    i4 = 4194304;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    zMo4094v3 = df1VarMo4079b.mo4094v(serialDescriptor, 23);
                    i4 = 8388608;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 24:
                    zMo4094v4 = df1VarMo4079b.mo4094v(serialDescriptor, 24);
                    i4 = 16777216;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 25:
                    zMo4094v5 = df1VarMo4079b.mo4094v(serialDescriptor, 25);
                    i4 = 33554432;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 26:
                    iMo4091q6 = df1VarMo4079b.mo4091q(serialDescriptor, 26);
                    i4 = 67108864;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    lessonPromotedCourse = (LessonPromotedCourse) df1VarMo4079b.mo4070D(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    i4 = 134217728;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 28:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    i4 = 268435456;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 29:
                    lessonReference2 = (LessonReference) df1VarMo4079b.mo4070D(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    i4 = 536870912;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 30:
                    lessonReference = (LessonReference) df1VarMo4079b.mo4070D(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    i4 = 1073741824;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 31, sk9.f60959a, str);
                    i4 = Integer.MIN_VALUE;
                    i3 = i7 | i4;
                    i7 = i3;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 32:
                    lessonSimplifiedOf = (LessonSimplifiedOf) df1VarMo4079b.mo4070D(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    i5 = i6 | 1;
                    lessonMetadata = lessonMetadata;
                    i6 = i5;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 33:
                    lessonSimplifiedOf2 = (LessonSimplifiedOf) df1VarMo4079b.mo4070D(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    i5 = i6 | 2;
                    lessonMetadata = lessonMetadata;
                    i6 = i5;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case 34:
                    lessonMetadata = (LessonMetadata) df1VarMo4079b.mo4070D(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    i5 = i6 | 4;
                    lessonMetadata = lessonMetadata;
                    i6 = i5;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 35, sk9.f60959a, str2);
                    i5 = i6 | 8;
                    lessonMetadata = lessonMetadata;
                    i6 = i5;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 36, sk9.f60959a, str3);
                    i5 = i6 | 16;
                    lessonMetadata = lessonMetadata;
                    i6 = i5;
                    str4 = str4;
                    bool = bool;
                    lessonMetadata = lessonMetadata;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        String str14 = str4;
        Boolean bool2 = bool;
        int i19 = i7;
        List list4 = list3;
        LessonSimplifiedOf lessonSimplifiedOf3 = lessonSimplifiedOf;
        String str15 = str7;
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new Lesson(i19, i6, iMo4091q4, strMo4097x, str15, str8, str9, str10, iMo4091q, iMo4091q2, str11, lessonSentencesTranslation, num, num2, zMo4094v, iMo4091q3, list4, str12, str13, str14, iMo4091q5, bool2, str5, zMo4094v2, str6, zMo4094v3, zMo4094v4, zMo4094v5, iMo4091q6, lessonPromotedCourse, list2, lessonReference2, lessonReference, str, lessonSimplifiedOf3, lessonSimplifiedOf2, lessonMetadata, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0203  */
    /* JADX WARN: Code duplicated, block: B:118:0x0217  */
    /* JADX WARN: Code duplicated, block: B:119:0x021a  */
    /* JADX WARN: Code duplicated, block: B:125:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x023d  */
    /* JADX WARN: Code duplicated, block: B:135:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x024d  */
    /* JADX WARN: Code duplicated, block: B:140:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x025d  */
    /* JADX WARN: Code duplicated, block: B:144:0x026c  */
    /* JADX WARN: Code duplicated, block: B:145:0x026f  */
    /* JADX WARN: Code duplicated, block: B:151:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x028d  */
    /* JADX WARN: Code duplicated, block: B:156:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x029f  */
    /* JADX WARN: Code duplicated, block: B:161:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:187:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x030d  */
    /* JADX WARN: Code duplicated, block: B:95:0x019d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Lesson lesson) {
        List list;
        String str;
        String str2;
        String str3;
        sk9 sk9Var;
        boolean z;
        List list2;
        String str4;
        encoder.getClass();
        lesson.getClass();
        String str5 = lesson.f19141K;
        String str6 = lesson.f19140J;
        LessonMetadata lessonMetadata = lesson.f19139I;
        LessonSimplifiedOf lessonSimplifiedOf = lesson.f19138H;
        LessonSimplifiedOf lessonSimplifiedOf2 = lesson.f19137G;
        String str7 = lesson.f19136F;
        LessonReference lessonReference = lesson.f19135E;
        LessonReference lessonReference2 = lesson.f19134D;
        List list3 = lesson.f19133C;
        LessonPromotedCourse lessonPromotedCourse = lesson.f19132B;
        int i = lesson.f19131A;
        boolean z2 = lesson.f19167z;
        boolean z3 = lesson.f19166y;
        boolean z4 = lesson.f19165x;
        boolean z5 = lesson.f19163v;
        String str8 = lesson.f19159r;
        String str9 = lesson.f19158q;
        String str10 = lesson.f19157p;
        List list4 = lesson.f19156o;
        int i2 = lesson.f19155n;
        boolean z6 = lesson.f19154m;
        Integer num = lesson.f19153l;
        Integer num2 = lesson.f19152k;
        LessonSentencesTranslation lessonSentencesTranslation = lesson.f19151j;
        String str11 = lesson.f19150i;
        int i3 = lesson.f19149h;
        int i4 = lesson.f19148g;
        String str12 = lesson.f19147f;
        String str13 = lesson.f19146e;
        String str14 = lesson.f19145d;
        String str15 = lesson.f19144c;
        String str16 = lesson.f19143b;
        int i5 = lesson.f19142a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = Lesson.f19130L;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
            mk9VarMo15606b.m16878v(0, i5, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str16, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str16);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str15, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str15);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str14, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str14);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str13, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str13);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str12, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str12);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
            mk9VarMo15606b.m16878v(6, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(7, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str11, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str11);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonSentencesTranslation != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, LessonSentencesTranslation$$serializer.INSTANCE, lessonSentencesTranslation);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 == null || num2.intValue() != 0) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num == null || num.intValue() != 0) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z6) {
            mk9VarMo15606b.m16873q(serialDescriptor, 12, z6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(13, i2, serialDescriptor);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (!zM16872B) {
            list = list4;
            if (!fa4.m11650l(list, emptyList)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str = str10;
                if (!fa4.m11650l(str, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str2 = str9;
                    if (!fa4.m11650l(str2, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        if (!fa4.m11650l(str3, "")) {
                        }
                        str3 = str8;
                        mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                        mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                        sk9Var = sk9.f60959a;
                        mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                        if (mk9VarMo15606b.m16872B(serialDescriptor) || z5) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                        }
                        mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            z = z4;
                            if (!z) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || z3) {
                                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
                                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
                                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonPromotedCourse != null) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                list2 = list3;
                                if (!fa4.m11650l(list2, emptyList)) {
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonReference2 != null) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonReference != null) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor) || str7 != null) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonSimplifiedOf2 != null) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonSimplifiedOf != null) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonMetadata != null) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    str4 = str6;
                                    if (!fa4.m11650l(str4, "")) {
                                    }
                                    if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
                                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                    }
                                    mk9VarMo15606b.m16871A(serialDescriptor);
                                }
                                str4 = str6;
                                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                } else {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                }
                                mk9VarMo15606b.m16871A(serialDescriptor);
                            }
                            list2 = list3;
                            mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                str4 = str6;
                                if (!fa4.m11650l(str4, "")) {
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                } else {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                }
                                mk9VarMo15606b.m16871A(serialDescriptor);
                            }
                            str4 = str6;
                            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        z = z4;
                        mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        } else {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            list2 = list3;
                            if (!fa4.m11650l(list2, emptyList)) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                str4 = str6;
                                if (!fa4.m11650l(str4, "")) {
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                } else {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                }
                                mk9VarMo15606b.m16871A(serialDescriptor);
                            }
                            str4 = str6;
                            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        list2 = list3;
                        mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str3 = str8;
                    str3 = str8;
                    mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
                    str3 = str8;
                    mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                    sk9Var = sk9.f60959a;
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    }
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        z = z4;
                        if (!z) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        } else {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            list2 = list3;
                            if (!fa4.m11650l(list2, emptyList)) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                str4 = str6;
                                if (!fa4.m11650l(str4, "")) {
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                } else {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                }
                                mk9VarMo15606b.m16871A(serialDescriptor);
                            }
                            str4 = str6;
                            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        list2 = list3;
                        mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    z = z4;
                    mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str2 = str9;
                mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    if (!fa4.m11650l(str3, "")) {
                    }
                    str3 = str8;
                    mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                    sk9Var = sk9.f60959a;
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    }
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        z = z4;
                        if (!z) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        } else {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            list2 = list3;
                            if (!fa4.m11650l(list2, emptyList)) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                str4 = str6;
                                if (!fa4.m11650l(str4, "")) {
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                } else {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                }
                                mk9VarMo15606b.m16871A(serialDescriptor);
                            }
                            str4 = str6;
                            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        list2 = list3;
                        mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    z = z4;
                    mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str3 = str8;
                str3 = str8;
                mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
                str3 = str8;
                mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                sk9Var = sk9.f60959a;
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                }
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    z = z4;
                    if (!z) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                z = z4;
                mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str = str10;
            mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str2 = str9;
                if (!fa4.m11650l(str2, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    if (!fa4.m11650l(str3, "")) {
                    }
                    str3 = str8;
                    mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                    sk9Var = sk9.f60959a;
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    }
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        z = z4;
                        if (!z) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        } else {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            list2 = list3;
                            if (!fa4.m11650l(list2, emptyList)) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                str4 = str6;
                                if (!fa4.m11650l(str4, "")) {
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                } else {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                }
                                mk9VarMo15606b.m16871A(serialDescriptor);
                            }
                            str4 = str6;
                            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        list2 = list3;
                        mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    z = z4;
                    mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str3 = str8;
                str3 = str8;
                mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
                str3 = str8;
                mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                sk9Var = sk9.f60959a;
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                }
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    z = z4;
                    if (!z) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                z = z4;
                mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str2 = str9;
            mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                if (!fa4.m11650l(str3, "")) {
                }
                str3 = str8;
                mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                sk9Var = sk9.f60959a;
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                }
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    z = z4;
                    if (!z) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                z = z4;
                mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str3 = str8;
            str3 = str8;
            mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
            str3 = str8;
            mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
            mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
            sk9Var = sk9.f60959a;
            mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            }
            mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                z = z4;
                if (!z) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            z = z4;
            mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list2 = list3;
                if (!fa4.m11650l(list2, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list3;
            mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str4 = str6;
                if (!fa4.m11650l(str4, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str4 = str6;
            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list = list4;
        mk9VarMo15606b.m16881y(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            str = str10;
            if (!fa4.m11650l(str, "")) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str2 = str9;
                if (!fa4.m11650l(str2, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    if (!fa4.m11650l(str3, "")) {
                    }
                    str3 = str8;
                    mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                    mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                    sk9Var = sk9.f60959a;
                    mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                    }
                    mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        z = z4;
                        if (!z) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        } else {
                            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        } else {
                            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            list2 = list3;
                            if (!fa4.m11650l(list2, emptyList)) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                str4 = str6;
                                if (!fa4.m11650l(str4, "")) {
                                }
                                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                } else {
                                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                                }
                                mk9VarMo15606b.m16871A(serialDescriptor);
                            }
                            str4 = str6;
                            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        list2 = list3;
                        mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    z = z4;
                    mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str3 = str8;
                str3 = str8;
                mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
                str3 = str8;
                mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                sk9Var = sk9.f60959a;
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                }
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    z = z4;
                    if (!z) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                z = z4;
                mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str2 = str9;
            mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                if (!fa4.m11650l(str3, "")) {
                }
                str3 = str8;
                mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                sk9Var = sk9.f60959a;
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                }
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    z = z4;
                    if (!z) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                z = z4;
                mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str3 = str8;
            str3 = str8;
            mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
            str3 = str8;
            mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
            mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
            sk9Var = sk9.f60959a;
            mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            }
            mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                z = z4;
                if (!z) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            z = z4;
            mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list2 = list3;
                if (!fa4.m11650l(list2, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list3;
            mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str4 = str6;
                if (!fa4.m11650l(str4, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str4 = str6;
            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        str = str10;
        mk9VarMo15606b.m16880x(serialDescriptor, 15, sk9.f60959a, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            str2 = str9;
            if (!fa4.m11650l(str2, "")) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                if (!fa4.m11650l(str3, "")) {
                }
                str3 = str8;
                mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
                mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
                sk9Var = sk9.f60959a;
                mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
                }
                mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    z = z4;
                    if (!z) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    } else {
                        mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    } else {
                        mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        list2 = list3;
                        if (!fa4.m11650l(list2, emptyList)) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            str4 = str6;
                            if (!fa4.m11650l(str4, "")) {
                            }
                            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            } else {
                                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                            }
                            mk9VarMo15606b.m16871A(serialDescriptor);
                        }
                        str4 = str6;
                        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    list2 = list3;
                    mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                z = z4;
                mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str3 = str8;
            str3 = str8;
            mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
            str3 = str8;
            mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
            mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
            sk9Var = sk9.f60959a;
            mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            }
            mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                z = z4;
                if (!z) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            z = z4;
            mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list2 = list3;
                if (!fa4.m11650l(list2, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list3;
            mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str4 = str6;
                if (!fa4.m11650l(str4, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str4 = str6;
            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        str2 = str9;
        mk9VarMo15606b.m16880x(serialDescriptor, 16, sk9.f60959a, str2);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            if (!fa4.m11650l(str3, "")) {
            }
            str3 = str8;
            mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
            mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
            sk9Var = sk9.f60959a;
            mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
            }
            mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                z = z4;
                if (!z) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                } else {
                    mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                } else {
                    mk9VarMo15606b.m16878v(26, i, serialDescriptor);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list2 = list3;
                    if (!fa4.m11650l(list2, emptyList)) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        str4 = str6;
                        if (!fa4.m11650l(str4, "")) {
                        }
                        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        } else {
                            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                        }
                        mk9VarMo15606b.m16871A(serialDescriptor);
                    }
                    str4 = str6;
                    mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list2 = list3;
                mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            z = z4;
            mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list2 = list3;
                if (!fa4.m11650l(list2, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list3;
            mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str4 = str6;
                if (!fa4.m11650l(str4, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str4 = str6;
            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        str3 = str8;
        str3 = str8;
        mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9.f60959a, str3);
        str3 = str8;
        mk9VarMo15606b.m16878v(18, lesson.f19160s, serialDescriptor);
        mk9VarMo15606b.m16880x(serialDescriptor, 19, lf0.f49579a, lesson.f19161t);
        sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, lesson.f19162u);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
        } else {
            mk9VarMo15606b.m16873q(serialDescriptor, 21, z5);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, lesson.f19164w);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            z = z4;
            if (!z) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            } else {
                mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            } else {
                mk9VarMo15606b.m16878v(26, i, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list2 = list3;
                if (!fa4.m11650l(list2, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    str4 = str6;
                    if (!fa4.m11650l(str4, "")) {
                    }
                    if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    } else {
                        mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                str4 = str6;
                mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list3;
            mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str4 = str6;
                if (!fa4.m11650l(str4, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str4 = str6;
            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        z = z4;
        mk9VarMo15606b.m16873q(serialDescriptor, 23, z);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
        } else {
            mk9VarMo15606b.m16873q(serialDescriptor, 24, z3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
        } else {
            mk9VarMo15606b.m16873q(serialDescriptor, 25, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(26, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 27, LessonPromotedCourse$$serializer.INSTANCE, lessonPromotedCourse);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            list2 = list3;
            if (!fa4.m11650l(list2, emptyList)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                str4 = str6;
                if (!fa4.m11650l(str4, "")) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                } else {
                    mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            str4 = str6;
            mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list2 = list3;
        mk9VarMo15606b.m16880x(serialDescriptor, 28, (KSerializer) cs4VarArr[28].getValue(), list2);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 29, LessonReference$$serializer.INSTANCE, lessonReference2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 30, LessonReference$$serializer.INSTANCE, lessonReference);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 31, sk9Var, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 32, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 33, LessonSimplifiedOf$$serializer.INSTANCE, lessonSimplifiedOf);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 34, LessonMetadata$$serializer.INSTANCE, lessonMetadata);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            str4 = str6;
            if (!fa4.m11650l(str4, "")) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            } else {
                mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        str4 = str6;
        mk9VarMo15606b.m16880x(serialDescriptor, 35, sk9Var, str4);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 36, sk9Var, str5);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
