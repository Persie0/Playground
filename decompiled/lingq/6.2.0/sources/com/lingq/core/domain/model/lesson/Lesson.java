package com.lingq.core.domain.model.lesson;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wf1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Lesson {
    public static final C1436a Companion = new C1436a();

    /* JADX INFO: renamed from: L */
    public static final cs4[] f19130L;

    /* JADX INFO: renamed from: A */
    public final int f19131A;

    /* JADX INFO: renamed from: B */
    public final LessonPromotedCourse f19132B;

    /* JADX INFO: renamed from: C */
    public final List f19133C;

    /* JADX INFO: renamed from: D */
    public final LessonReference f19134D;

    /* JADX INFO: renamed from: E */
    public final LessonReference f19135E;

    /* JADX INFO: renamed from: F */
    public final String f19136F;

    /* JADX INFO: renamed from: G */
    public final LessonSimplifiedOf f19137G;

    /* JADX INFO: renamed from: H */
    public final LessonSimplifiedOf f19138H;

    /* JADX INFO: renamed from: I */
    public final LessonMetadata f19139I;

    /* JADX INFO: renamed from: J */
    public final String f19140J;

    /* JADX INFO: renamed from: K */
    public final String f19141K;

    /* JADX INFO: renamed from: a */
    public final int f19142a;

    /* JADX INFO: renamed from: b */
    public final String f19143b;

    /* JADX INFO: renamed from: c */
    public final String f19144c;

    /* JADX INFO: renamed from: d */
    public final String f19145d;

    /* JADX INFO: renamed from: e */
    public final String f19146e;

    /* JADX INFO: renamed from: f */
    public final String f19147f;

    /* JADX INFO: renamed from: g */
    public final int f19148g;

    /* JADX INFO: renamed from: h */
    public final int f19149h;

    /* JADX INFO: renamed from: i */
    public final String f19150i;

    /* JADX INFO: renamed from: j */
    public final LessonSentencesTranslation f19151j;

    /* JADX INFO: renamed from: k */
    public final Integer f19152k;

    /* JADX INFO: renamed from: l */
    public final Integer f19153l;

    /* JADX INFO: renamed from: m */
    public final boolean f19154m;

    /* JADX INFO: renamed from: n */
    public final int f19155n;

    /* JADX INFO: renamed from: o */
    public final List f19156o;

    /* JADX INFO: renamed from: p */
    public final String f19157p;

    /* JADX INFO: renamed from: q */
    public final String f19158q;

    /* JADX INFO: renamed from: r */
    public final String f19159r;

    /* JADX INFO: renamed from: s */
    public final int f19160s;

    /* JADX INFO: renamed from: t */
    public final Boolean f19161t;

    /* JADX INFO: renamed from: u */
    public final String f19162u;

    /* JADX INFO: renamed from: v */
    public final boolean f19163v;

    /* JADX INFO: renamed from: w */
    public final String f19164w;

    /* JADX INFO: renamed from: x */
    public final boolean f19165x;

    /* JADX INFO: renamed from: y */
    public final boolean f19166y;

    /* JADX INFO: renamed from: z */
    public final boolean f19167z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19130L = new cs4[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(19)), null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(20)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Lesson(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, int i5, String str6, LessonSentencesTranslation lessonSentencesTranslation, Integer num, Integer num2, boolean z, int i6, List list, String str7, String str8, String str9, int i7, Boolean bool, String str10, boolean z2, String str11, boolean z3, boolean z4, boolean z5, int i8, LessonPromotedCourse lessonPromotedCourse, List list2, LessonReference lessonReference, LessonReference lessonReference2, String str12, LessonSimplifiedOf lessonSimplifiedOf, LessonSimplifiedOf lessonSimplifiedOf2, LessonMetadata lessonMetadata, String str13, String str14) {
        if (6029312 != (i & 6029312)) {
            n3c.m17203a(new int[]{i, i2}, new int[]{6029312, 0}, Lesson$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f19142a = 0;
        } else {
            this.f19142a = i3;
        }
        if ((i & 2) == 0) {
            this.f19143b = "";
        } else {
            this.f19143b = str;
        }
        if ((i & 4) == 0) {
            this.f19144c = "";
        } else {
            this.f19144c = str2;
        }
        if ((i & 8) == 0) {
            this.f19145d = "";
        } else {
            this.f19145d = str3;
        }
        if ((i & 16) == 0) {
            this.f19146e = "";
        } else {
            this.f19146e = str4;
        }
        if ((i & 32) == 0) {
            this.f19147f = "";
        } else {
            this.f19147f = str5;
        }
        if ((i & 64) == 0) {
            this.f19148g = 0;
        } else {
            this.f19148g = i4;
        }
        if ((i & 128) == 0) {
            this.f19149h = 0;
        } else {
            this.f19149h = i5;
        }
        if ((i & 256) == 0) {
            this.f19150i = "";
        } else {
            this.f19150i = str6;
        }
        if ((i & 512) == 0) {
            this.f19151j = null;
        } else {
            this.f19151j = lessonSentencesTranslation;
        }
        if ((i & 1024) == 0) {
            this.f19152k = 0;
        } else {
            this.f19152k = num;
        }
        if ((i & 2048) == 0) {
            this.f19153l = 0;
        } else {
            this.f19153l = num2;
        }
        if ((i & 4096) == 0) {
            this.f19154m = false;
        } else {
            this.f19154m = z;
        }
        if ((i & 8192) == 0) {
            this.f19155n = 0;
        } else {
            this.f19155n = i6;
        }
        int i9 = i & 16384;
        EmptyList emptyList = EmptyList.f47638a;
        if (i9 == 0) {
            this.f19156o = emptyList;
        } else {
            this.f19156o = list;
        }
        if ((32768 & i) == 0) {
            this.f19157p = "";
        } else {
            this.f19157p = str7;
        }
        if ((65536 & i) == 0) {
            this.f19158q = "";
        } else {
            this.f19158q = str8;
        }
        if ((131072 & i) == 0) {
            this.f19159r = "";
        } else {
            this.f19159r = str9;
        }
        this.f19160s = i7;
        this.f19161t = bool;
        this.f19162u = str10;
        if ((2097152 & i) == 0) {
            this.f19163v = false;
        } else {
            this.f19163v = z2;
        }
        this.f19164w = str11;
        this.f19165x = (8388608 & i) == 0 ? true : z3;
        if ((16777216 & i) == 0) {
            this.f19166y = false;
        } else {
            this.f19166y = z4;
        }
        if ((33554432 & i) == 0) {
            this.f19167z = false;
        } else {
            this.f19167z = z5;
        }
        if ((67108864 & i) == 0) {
            this.f19131A = 0;
        } else {
            this.f19131A = i8;
        }
        if ((134217728 & i) == 0) {
            this.f19132B = null;
        } else {
            this.f19132B = lessonPromotedCourse;
        }
        if ((268435456 & i) == 0) {
            this.f19133C = emptyList;
        } else {
            this.f19133C = list2;
        }
        if ((536870912 & i) == 0) {
            this.f19134D = null;
        } else {
            this.f19134D = lessonReference;
        }
        if ((1073741824 & i) == 0) {
            this.f19135E = null;
        } else {
            this.f19135E = lessonReference2;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.f19136F = null;
        } else {
            this.f19136F = str12;
        }
        if ((i2 & 1) == 0) {
            this.f19137G = null;
        } else {
            this.f19137G = lessonSimplifiedOf;
        }
        if ((i2 & 2) == 0) {
            this.f19138H = null;
        } else {
            this.f19138H = lessonSimplifiedOf2;
        }
        if ((i2 & 4) == 0) {
            this.f19139I = null;
        } else {
            this.f19139I = lessonMetadata;
        }
        if ((i2 & 8) == 0) {
            this.f19140J = "";
        } else {
            this.f19140J = str13;
        }
        if ((i2 & 16) == 0) {
            this.f19141K = null;
        } else {
            this.f19141K = str14;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8027a() {
        return this.f19142a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lesson)) {
            return false;
        }
        Lesson lesson = (Lesson) obj;
        return this.f19142a == lesson.f19142a && fa4.m11650l(this.f19143b, lesson.f19143b) && fa4.m11650l(this.f19144c, lesson.f19144c) && fa4.m11650l(this.f19145d, lesson.f19145d) && fa4.m11650l(this.f19146e, lesson.f19146e) && fa4.m11650l(this.f19147f, lesson.f19147f) && this.f19148g == lesson.f19148g && this.f19149h == lesson.f19149h && fa4.m11650l(this.f19150i, lesson.f19150i) && fa4.m11650l(this.f19151j, lesson.f19151j) && fa4.m11650l(this.f19152k, lesson.f19152k) && fa4.m11650l(this.f19153l, lesson.f19153l) && this.f19154m == lesson.f19154m && this.f19155n == lesson.f19155n && fa4.m11650l(this.f19156o, lesson.f19156o) && fa4.m11650l(this.f19157p, lesson.f19157p) && fa4.m11650l(this.f19158q, lesson.f19158q) && fa4.m11650l(this.f19159r, lesson.f19159r) && this.f19160s == lesson.f19160s && fa4.m11650l(this.f19161t, lesson.f19161t) && fa4.m11650l(this.f19162u, lesson.f19162u) && this.f19163v == lesson.f19163v && fa4.m11650l(this.f19164w, lesson.f19164w) && this.f19165x == lesson.f19165x && this.f19166y == lesson.f19166y && this.f19167z == lesson.f19167z && this.f19131A == lesson.f19131A && fa4.m11650l(this.f19132B, lesson.f19132B) && fa4.m11650l(this.f19133C, lesson.f19133C) && fa4.m11650l(this.f19134D, lesson.f19134D) && fa4.m11650l(this.f19135E, lesson.f19135E) && fa4.m11650l(this.f19136F, lesson.f19136F) && fa4.m11650l(this.f19137G, lesson.f19137G) && fa4.m11650l(this.f19138H, lesson.f19138H) && fa4.m11650l(this.f19139I, lesson.f19139I) && fa4.m11650l(this.f19140J, lesson.f19140J) && fa4.m11650l(this.f19141K, lesson.f19141K);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f19142a) * 31, this.f19143b, 31);
        String str = this.f19144c;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19145d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19146e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19147f;
        int iM24106b = wq1.m24106b(this.f19149h, wq1.m24106b(this.f19148g, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        String str5 = this.f19150i;
        int iHashCode4 = (iM24106b + (str5 == null ? 0 : str5.hashCode())) * 31;
        LessonSentencesTranslation lessonSentencesTranslation = this.f19151j;
        int iHashCode5 = (iHashCode4 + (lessonSentencesTranslation == null ? 0 : lessonSentencesTranslation.hashCode())) * 31;
        Integer num = this.f19152k;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19153l;
        int iM22979b = ux5.m22979b(wq1.m24106b(this.f19155n, g9a.m12428e((iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f19154m), 31), 31, this.f19156o);
        String str6 = this.f19157p;
        int iHashCode7 = (iM22979b + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f19158q;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f19159r;
        int iM24106b2 = wq1.m24106b(this.f19160s, (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31, 31);
        Boolean bool = this.f19161t;
        int iHashCode9 = (iM24106b2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.f19162u;
        int iM12428e = g9a.m12428e((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.f19163v);
        String str10 = this.f19164w;
        int iM24106b3 = wq1.m24106b(this.f19131A, g9a.m12428e(g9a.m12428e(g9a.m12428e((iM12428e + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.f19165x), 31, this.f19166y), 31, this.f19167z), 31);
        LessonPromotedCourse lessonPromotedCourse = this.f19132B;
        int iHashCode10 = (iM24106b3 + (lessonPromotedCourse == null ? 0 : lessonPromotedCourse.hashCode())) * 31;
        List list = this.f19133C;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        LessonReference lessonReference = this.f19134D;
        int iHashCode12 = (iHashCode11 + (lessonReference == null ? 0 : lessonReference.hashCode())) * 31;
        LessonReference lessonReference2 = this.f19135E;
        int iHashCode13 = (iHashCode12 + (lessonReference2 == null ? 0 : lessonReference2.hashCode())) * 31;
        String str11 = this.f19136F;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        LessonSimplifiedOf lessonSimplifiedOf = this.f19137G;
        int iHashCode15 = (iHashCode14 + (lessonSimplifiedOf == null ? 0 : lessonSimplifiedOf.hashCode())) * 31;
        LessonSimplifiedOf lessonSimplifiedOf2 = this.f19138H;
        int iHashCode16 = (iHashCode15 + (lessonSimplifiedOf2 == null ? 0 : lessonSimplifiedOf2.hashCode())) * 31;
        LessonMetadata lessonMetadata = this.f19139I;
        int iHashCode17 = (iHashCode16 + (lessonMetadata == null ? 0 : lessonMetadata.hashCode())) * 31;
        String str12 = this.f19140J;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f19141K;
        return iHashCode18 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f19142a, "Lesson(id=", ", title=", this.f19143b, ", description=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19144c, ", originalImageUrl=", this.f19145d, ", imageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19146e, ", audioUrl=", this.f19147f, ", duration=");
        hn1.m13360j(this.f19148g, this.f19149h, ", collectionId=", ", collectionTitle=", sbM22995r);
        sbM22995r.append(this.f19150i);
        sbM22995r.append(", translation=");
        sbM22995r.append(this.f19151j);
        sbM22995r.append(", previousLessonId=");
        e65.m10883o(sbM22995r, this.f19152k, ", nextLessonId=", this.f19153l, ", isCompleted=");
        hn1.m13373w(sbM22995r, this.f19154m, ", progressDownloaded=", this.f19155n, ", translationSentence=");
        wq1.m24130z(", mediaImageUrl=", this.f19157p, ", mediaTitle=", sbM22995r, this.f19156o);
        AbstractC3393o1.m17725C(sbM22995r, this.f19158q, ", level=", this.f19159r, ", newWordsCount=");
        sbM22995r.append(this.f19160s);
        sbM22995r.append(", isTaken=");
        sbM22995r.append(this.f19161t);
        sbM22995r.append(", videoUrl=");
        ux5.m22976C(this.f19162u, ", audioPending=", ", sharedByName=", sbM22995r, this.f19163v);
        ux5.m22976C(this.f19164w, ", isProtected=", ", canEditSentence=", sbM22995r, this.f19165x);
        wq1.m24101A(sbM22995r, this.f19166y, ", isCanEdit=", this.f19167z, ", price=");
        sbM22995r.append(this.f19131A);
        sbM22995r.append(", promotedCourse=");
        sbM22995r.append(this.f19132B);
        sbM22995r.append(", tags=");
        sbM22995r.append(this.f19133C);
        sbM22995r.append(", nextLesson=");
        sbM22995r.append(this.f19134D);
        sbM22995r.append(", previousLesson=");
        sbM22995r.append(this.f19135E);
        sbM22995r.append(", isLocked=");
        sbM22995r.append(this.f19136F);
        sbM22995r.append(", simplifiedTo=");
        sbM22995r.append(this.f19137G);
        sbM22995r.append(", simplifiedBy=");
        sbM22995r.append(this.f19138H);
        sbM22995r.append(", metadata=");
        sbM22995r.append(this.f19139I);
        sbM22995r.append(", status=");
        sbM22995r.append(this.f19140J);
        sbM22995r.append(", lastOpenTime=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f19141K, ")");
    }

    public Lesson(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, LessonSentencesTranslation lessonSentencesTranslation, Integer num, Integer num2, boolean z, int i4, ArrayList arrayList, String str7, String str8, String str9, int i5, Boolean bool, String str10, boolean z2, String str11, boolean z3, boolean z4, boolean z5, int i6, LessonPromotedCourse lessonPromotedCourse, List list, LessonReference lessonReference, LessonReference lessonReference2, String str12, LessonSimplifiedOf lessonSimplifiedOf, LessonSimplifiedOf lessonSimplifiedOf2, LessonMetadata lessonMetadata, String str13, String str14) {
        this.f19142a = i;
        this.f19143b = str;
        this.f19144c = str2;
        this.f19145d = str3;
        this.f19146e = str4;
        this.f19147f = str5;
        this.f19148g = i2;
        this.f19149h = i3;
        this.f19150i = str6;
        this.f19151j = lessonSentencesTranslation;
        this.f19152k = num;
        this.f19153l = num2;
        this.f19154m = z;
        this.f19155n = i4;
        this.f19156o = arrayList;
        this.f19157p = str7;
        this.f19158q = str8;
        this.f19159r = str9;
        this.f19160s = i5;
        this.f19161t = bool;
        this.f19162u = str10;
        this.f19163v = z2;
        this.f19164w = str11;
        this.f19165x = z3;
        this.f19166y = z4;
        this.f19167z = z5;
        this.f19131A = i6;
        this.f19132B = lessonPromotedCourse;
        this.f19133C = list;
        this.f19134D = lessonReference;
        this.f19135E = lessonReference2;
        this.f19136F = str12;
        this.f19137G = lessonSimplifiedOf;
        this.f19138H = lessonSimplifiedOf2;
        this.f19139I = lessonMetadata;
        this.f19140J = str13;
        this.f19141K = str14;
    }
}
