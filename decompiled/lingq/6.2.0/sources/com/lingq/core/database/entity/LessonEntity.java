package com.lingq.core.database.entity;

import com.lingq.core.domain.model.lesson.LessonMetadata;
import com.lingq.core.domain.model.lesson.LessonPromotedCourse;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.LessonSimplifiedOf;
import com.lingq.core.domain.model.lesson.LessonUserCompleted;
import com.lingq.core.domain.model.lesson.LessonUserLiked;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.b25;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wf1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonEntity {
    public static final C1360s Companion = new C1360s();

    /* JADX INFO: renamed from: I0 */
    public static final cs4[] f17239I0;

    /* JADX INFO: renamed from: A */
    public final String f17240A;

    /* JADX INFO: renamed from: A0 */
    public final List f17241A0;

    /* JADX INFO: renamed from: B */
    public final String f17242B;

    /* JADX INFO: renamed from: B0 */
    public final Boolean f17243B0;

    /* JADX INFO: renamed from: C */
    public final String f17244C;

    /* JADX INFO: renamed from: C0 */
    public final LessonPromotedCourse f17245C0;

    /* JADX INFO: renamed from: D */
    public final Integer f17246D;

    /* JADX INFO: renamed from: D0 */
    public final String f17247D0;

    /* JADX INFO: renamed from: E */
    public final Integer f17248E;

    /* JADX INFO: renamed from: E0 */
    public final LessonSimplifiedOf f17249E0;

    /* JADX INFO: renamed from: F */
    public final LessonReference f17250F;

    /* JADX INFO: renamed from: F0 */
    public final LessonSimplifiedOf f17251F0;

    /* JADX INFO: renamed from: G */
    public final LessonReference f17252G;

    /* JADX INFO: renamed from: G0 */
    public final LessonMetadata f17253G0;

    /* JADX INFO: renamed from: H */
    public final double f17254H;

    /* JADX INFO: renamed from: H0 */
    public final String f17255H0;

    /* JADX INFO: renamed from: I */
    public final double f17256I;

    /* JADX INFO: renamed from: J */
    public final boolean f17257J;

    /* JADX INFO: renamed from: K */
    public final int f17258K;

    /* JADX INFO: renamed from: L */
    public final int f17259L;

    /* JADX INFO: renamed from: M */
    public final boolean f17260M;

    /* JADX INFO: renamed from: N */
    public final String f17261N;

    /* JADX INFO: renamed from: O */
    public final int f17262O;

    /* JADX INFO: renamed from: P */
    public final boolean f17263P;

    /* JADX INFO: renamed from: Q */
    public final double f17264Q;

    /* JADX INFO: renamed from: R */
    public final String f17265R;

    /* JADX INFO: renamed from: S */
    public final boolean f17266S;

    /* JADX INFO: renamed from: T */
    public final String f17267T;

    /* JADX INFO: renamed from: U */
    public final String f17268U;

    /* JADX INFO: renamed from: V */
    public final String f17269V;

    /* JADX INFO: renamed from: W */
    public final String f17270W;

    /* JADX INFO: renamed from: X */
    public final int f17271X;

    /* JADX INFO: renamed from: Y */
    public final Integer f17272Y;

    /* JADX INFO: renamed from: Z */
    public final String f17273Z;

    /* JADX INFO: renamed from: a */
    public final int f17274a;

    /* JADX INFO: renamed from: a0 */
    public final String f17275a0;

    /* JADX INFO: renamed from: b */
    public final String f17276b;

    /* JADX INFO: renamed from: b0 */
    public final String f17277b0;

    /* JADX INFO: renamed from: c */
    public final String f17278c;

    /* JADX INFO: renamed from: c0 */
    public final String f17279c0;

    /* JADX INFO: renamed from: d */
    public final int f17280d;

    /* JADX INFO: renamed from: d0 */
    public final String f17281d0;

    /* JADX INFO: renamed from: e */
    public final String f17282e;

    /* JADX INFO: renamed from: e0 */
    public final String f17283e0;

    /* JADX INFO: renamed from: f */
    public final String f17284f;

    /* JADX INFO: renamed from: f0 */
    public final String f17285f0;

    /* JADX INFO: renamed from: g */
    public final String f17286g;

    /* JADX INFO: renamed from: g0 */
    public final String f17287g0;

    /* JADX INFO: renamed from: h */
    public final String f17288h;

    /* JADX INFO: renamed from: h0 */
    public final boolean f17289h0;

    /* JADX INFO: renamed from: i */
    public final String f17290i;

    /* JADX INFO: renamed from: i0 */
    public final boolean f17291i0;

    /* JADX INFO: renamed from: j */
    public final int f17292j;

    /* JADX INFO: renamed from: j0 */
    public final boolean f17293j0;

    /* JADX INFO: renamed from: k */
    public final String f17294k;

    /* JADX INFO: renamed from: k0 */
    public final boolean f17295k0;

    /* JADX INFO: renamed from: l */
    public final String f17296l;

    /* JADX INFO: renamed from: l0 */
    public final int f17297l0;

    /* JADX INFO: renamed from: m */
    public final String f17298m;

    /* JADX INFO: renamed from: m0 */
    public final int f17299m0;

    /* JADX INFO: renamed from: n */
    public final int f17300n;

    /* JADX INFO: renamed from: n0 */
    public final String f17301n0;

    /* JADX INFO: renamed from: o */
    public final int f17302o;

    /* JADX INFO: renamed from: o0 */
    public final List f17303o0;

    /* JADX INFO: renamed from: p */
    public final int f17304p;

    /* JADX INFO: renamed from: p0 */
    public final int f17305p0;

    /* JADX INFO: renamed from: q */
    public final double f17306q;

    /* JADX INFO: renamed from: q0 */
    public final Float f17307q0;

    /* JADX INFO: renamed from: r */
    public final double f17308r;

    /* JADX INFO: renamed from: r0 */
    public final List f17309r0;

    /* JADX INFO: renamed from: s */
    public final int f17310s;

    /* JADX INFO: renamed from: s0 */
    public final String f17311s0;

    /* JADX INFO: renamed from: t */
    public final String f17312t;

    /* JADX INFO: renamed from: t0 */
    public final String f17313t0;

    /* JADX INFO: renamed from: u */
    public final LessonUserLiked f17314u;

    /* JADX INFO: renamed from: u0 */
    public final String f17315u0;

    /* JADX INFO: renamed from: v */
    public final LessonUserCompleted f17316v;

    /* JADX INFO: renamed from: v0 */
    public final Boolean f17317v0;

    /* JADX INFO: renamed from: w */
    public final LessonSentencesTranslation f17318w;

    /* JADX INFO: renamed from: w0 */
    public final double f17319w0;

    /* JADX INFO: renamed from: x */
    public final List f17320x;

    /* JADX INFO: renamed from: x0 */
    public final int f17321x0;

    /* JADX INFO: renamed from: y */
    public final List f17322y;

    /* JADX INFO: renamed from: y0 */
    public final String f17323y0;

    /* JADX INFO: renamed from: z */
    public final String f17324z;

    /* JADX INFO: renamed from: z0 */
    public final Boolean f17325z0;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17239I0 = new cs4[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(28)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(29)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(0)), null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(1)), null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(2)), null, null, null, null, null, null, null};
    }

    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public /* synthetic */ LessonEntity(int r18, int r19, int r20, int r21, java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, int r35, int r36, double r37, double r39, int r41, java.lang.String r42, com.lingq.core.domain.model.lesson.LessonUserLiked r43, com.lingq.core.domain.model.lesson.LessonUserCompleted r44, com.lingq.core.domain.model.lesson.LessonSentencesTranslation r45, java.util.List r46, java.util.List r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.Integer r52, java.lang.Integer r53, com.lingq.core.domain.model.lesson.LessonReference r54, com.lingq.core.domain.model.lesson.LessonReference r55, double r56, double r58, boolean r60, int r61, int r62, boolean r63, java.lang.String r64, int r65, boolean r66, double r67, java.lang.String r69, boolean r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, int r75, java.lang.Integer r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, boolean r85, boolean r86, boolean r87, boolean r88, int r89, int r90, java.lang.String r91, java.util.List r92, int r93, java.lang.Float r94, java.util.List r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.Boolean r99, double r100, int r102, java.lang.String r103, java.lang.Boolean r104, java.util.List r105, java.lang.Boolean r106, com.lingq.core.domain.model.lesson.LessonPromotedCourse r107, java.lang.String r108, com.lingq.core.domain.model.lesson.LessonSimplifiedOf r109, com.lingq.core.domain.model.lesson.LessonSimplifiedOf r110, com.lingq.core.domain.model.lesson.LessonMetadata r111, java.lang.String r112) {
        /*
            Method dump skipped, instruction units count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.database.entity.LessonEntity.<init>(int, int, int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, int, int, double, double, int, java.lang.String, com.lingq.core.domain.model.lesson.LessonUserLiked, com.lingq.core.domain.model.lesson.LessonUserCompleted, com.lingq.core.domain.model.lesson.LessonSentencesTranslation, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.lingq.core.domain.model.lesson.LessonReference, com.lingq.core.domain.model.lesson.LessonReference, double, double, boolean, int, int, boolean, java.lang.String, int, boolean, double, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, int, java.lang.String, java.util.List, int, java.lang.Float, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, double, int, java.lang.String, java.lang.Boolean, java.util.List, java.lang.Boolean, com.lingq.core.domain.model.lesson.LessonPromotedCourse, java.lang.String, com.lingq.core.domain.model.lesson.LessonSimplifiedOf, com.lingq.core.domain.model.lesson.LessonSimplifiedOf, com.lingq.core.domain.model.lesson.LessonMetadata, java.lang.String):void");
    }

    /* JADX INFO: renamed from: a */
    public static LessonEntity m7642a(LessonEntity lessonEntity, String str, int i, int i2, double d, double d2, int i3, boolean z, Boolean bool, String str2, int i4, int i5, int i6) {
        int i7 = lessonEntity.f17274a;
        String str3 = lessonEntity.f17276b;
        String str4 = lessonEntity.f17278c;
        int i8 = lessonEntity.f17280d;
        String str5 = lessonEntity.f17282e;
        String str6 = lessonEntity.f17284f;
        String str7 = lessonEntity.f17286g;
        String str8 = lessonEntity.f17288h;
        String str9 = (i4 & 256) != 0 ? lessonEntity.f17290i : str;
        int i9 = (i4 & 512) != 0 ? lessonEntity.f17292j : i;
        String str10 = str9;
        String str11 = lessonEntity.f17294k;
        int i10 = i9;
        String str12 = lessonEntity.f17296l;
        String str13 = lessonEntity.f17298m;
        int i11 = lessonEntity.f17300n;
        int i12 = lessonEntity.f17302o;
        int i13 = (i4 & 32768) != 0 ? lessonEntity.f17304p : i2;
        double d3 = lessonEntity.f17306q;
        double d4 = lessonEntity.f17308r;
        int i14 = i13;
        int i15 = lessonEntity.f17310s;
        String str14 = lessonEntity.f17312t;
        LessonUserLiked lessonUserLiked = lessonEntity.f17314u;
        LessonUserCompleted lessonUserCompleted = lessonEntity.f17316v;
        LessonSentencesTranslation lessonSentencesTranslation = lessonEntity.f17318w;
        List list = lessonEntity.f17320x;
        List list2 = lessonEntity.f17322y;
        String str15 = lessonEntity.f17324z;
        String str16 = lessonEntity.f17240A;
        String str17 = lessonEntity.f17242B;
        String str18 = lessonEntity.f17244C;
        Integer num = lessonEntity.f17246D;
        Integer num2 = lessonEntity.f17248E;
        LessonReference lessonReference = lessonEntity.f17250F;
        LessonReference lessonReference2 = lessonEntity.f17252G;
        double d5 = (i5 & 2) != 0 ? lessonEntity.f17254H : d;
        double d6 = (i5 & 4) != 0 ? lessonEntity.f17256I : d2;
        boolean z2 = (i5 & 8) != 0 ? lessonEntity.f17257J : true;
        int i16 = lessonEntity.f17258K;
        int i17 = (i5 & 32) != 0 ? lessonEntity.f17259L : i3;
        boolean z3 = (i5 & 64) != 0 ? lessonEntity.f17260M : z;
        String str19 = lessonEntity.f17261N;
        int i18 = lessonEntity.f17262O;
        boolean z4 = lessonEntity.f17263P;
        double d7 = lessonEntity.f17264Q;
        String str20 = lessonEntity.f17265R;
        boolean z5 = lessonEntity.f17266S;
        String str21 = lessonEntity.f17267T;
        String str22 = lessonEntity.f17268U;
        String str23 = lessonEntity.f17269V;
        String str24 = lessonEntity.f17270W;
        int i19 = lessonEntity.f17271X;
        Integer num3 = lessonEntity.f17272Y;
        String str25 = lessonEntity.f17273Z;
        String str26 = lessonEntity.f17275a0;
        String str27 = lessonEntity.f17277b0;
        String str28 = lessonEntity.f17279c0;
        String str29 = lessonEntity.f17281d0;
        String str30 = lessonEntity.f17283e0;
        String str31 = lessonEntity.f17285f0;
        String str32 = lessonEntity.f17287g0;
        boolean z6 = lessonEntity.f17289h0;
        boolean z7 = lessonEntity.f17291i0;
        boolean z8 = lessonEntity.f17293j0;
        boolean z9 = lessonEntity.f17295k0;
        int i20 = lessonEntity.f17297l0;
        int i21 = lessonEntity.f17299m0;
        String str33 = lessonEntity.f17301n0;
        List list3 = lessonEntity.f17303o0;
        int i22 = lessonEntity.f17305p0;
        Float f = lessonEntity.f17307q0;
        List list4 = lessonEntity.f17309r0;
        String str34 = lessonEntity.f17311s0;
        String str35 = lessonEntity.f17313t0;
        String str36 = lessonEntity.f17315u0;
        Boolean bool2 = lessonEntity.f17317v0;
        double d8 = lessonEntity.f17319w0;
        int i23 = lessonEntity.f17321x0;
        String str37 = lessonEntity.f17323y0;
        Boolean bool3 = (i6 & 8192) != 0 ? lessonEntity.f17325z0 : bool;
        List list5 = lessonEntity.f17241A0;
        Boolean bool4 = lessonEntity.f17243B0;
        LessonPromotedCourse lessonPromotedCourse = lessonEntity.f17245C0;
        String str38 = (i6 & 131072) != 0 ? lessonEntity.f17247D0 : str2;
        LessonSimplifiedOf lessonSimplifiedOf = lessonEntity.f17249E0;
        LessonSimplifiedOf lessonSimplifiedOf2 = lessonEntity.f17251F0;
        LessonMetadata lessonMetadata = lessonEntity.f17253G0;
        String str39 = lessonEntity.f17255H0;
        str3.getClass();
        list.getClass();
        list2.getClass();
        list4.getClass();
        str37.getClass();
        return new LessonEntity(i7, str3, str4, i8, str5, str6, str7, str8, str10, i10, str11, str12, str13, i11, i12, i14, d3, d4, i15, str14, lessonUserLiked, lessonUserCompleted, lessonSentencesTranslation, list, list2, str15, str16, str17, str18, num, num2, lessonReference, lessonReference2, d5, d6, z2, i16, i17, z3, str19, i18, z4, d7, str20, z5, str21, str22, str23, str24, i19, num3, str25, str26, str27, str28, str29, str30, str31, str32, z6, z7, z8, z9, i20, i21, str33, list3, i22, f, list4, str34, str35, str36, bool2, d8, i23, str37, bool3, list5, bool4, lessonPromotedCourse, str38, lessonSimplifiedOf, lessonSimplifiedOf2, lessonMetadata, str39);
    }

    /* JADX INFO: renamed from: A */
    public final int m7643A() {
        return this.f17297l0;
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m7644A0() {
        return this.f17291i0;
    }

    /* JADX INFO: renamed from: B */
    public final String m7645B() {
        return this.f17301n0;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m7646B0() {
        return this.f17257J;
    }

    /* JADX INFO: renamed from: C */
    public final double m7647C() {
        return this.f17256I;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m7648C0() {
        return this.f17266S;
    }

    /* JADX INFO: renamed from: D */
    public final String m7649D() {
        return this.f17311s0;
    }

    /* JADX INFO: renamed from: D0 */
    public final String m7650D0() {
        return this.f17247D0;
    }

    /* JADX INFO: renamed from: E */
    public final String m7651E() {
        return this.f17313t0;
    }

    /* JADX INFO: renamed from: E0 */
    public final Boolean m7652E0() {
        return this.f17317v0;
    }

    /* JADX INFO: renamed from: F */
    public final LessonMetadata m7653F() {
        return this.f17253G0;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m7654F0() {
        return this.f17295k0;
    }

    /* JADX INFO: renamed from: G */
    public final int m7655G() {
        return this.f17321x0;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m7656G0() {
        return this.f17260M;
    }

    /* JADX INFO: renamed from: H */
    public final int m7657H() {
        return this.f17258K;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m7658H0() {
        return this.f17289h0;
    }

    /* JADX INFO: renamed from: I */
    public final LessonReference m7659I() {
        return this.f17250F;
    }

    /* JADX INFO: renamed from: I0 */
    public final Boolean m7660I0() {
        return this.f17325z0;
    }

    /* JADX INFO: renamed from: J */
    public final Integer m7661J() {
        return this.f17248E;
    }

    /* JADX INFO: renamed from: K */
    public final String m7662K() {
        return this.f17270W;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m7663L() {
        return this.f17263P;
    }

    /* JADX INFO: renamed from: M */
    public final String m7664M() {
        return this.f17277b0;
    }

    /* JADX INFO: renamed from: N */
    public final String m7665N() {
        return this.f17298m;
    }

    /* JADX INFO: renamed from: O */
    public final double m7666O() {
        return this.f17264Q;
    }

    /* JADX INFO: renamed from: P */
    public final int m7667P() {
        return this.f17280d;
    }

    /* JADX INFO: renamed from: Q */
    public final LessonReference m7668Q() {
        return this.f17252G;
    }

    /* JADX INFO: renamed from: R */
    public final Integer m7669R() {
        return this.f17246D;
    }

    /* JADX INFO: renamed from: S */
    public final int m7670S() {
        return this.f17262O;
    }

    /* JADX INFO: renamed from: T */
    public final String m7671T() {
        return this.f17267T;
    }

    /* JADX INFO: renamed from: U */
    public final Float m7672U() {
        return this.f17307q0;
    }

    /* JADX INFO: renamed from: V */
    public final int m7673V() {
        return this.f17305p0;
    }

    /* JADX INFO: renamed from: W */
    public final String m7674W() {
        return this.f17275a0;
    }

    /* JADX INFO: renamed from: X */
    public final Integer m7675X() {
        return this.f17272Y;
    }

    /* JADX INFO: renamed from: Y */
    public final String m7676Y() {
        return this.f17279c0;
    }

    /* JADX INFO: renamed from: Z */
    public final String m7677Z() {
        return this.f17273Z;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m7678a0() {
        return this.f17315u0;
    }

    /* JADX INFO: renamed from: b */
    public final List m7679b() {
        return this.f17322y;
    }

    /* JADX INFO: renamed from: b0 */
    public final String m7680b0() {
        return this.f17286g;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m7681c() {
        return this.f17243B0;
    }

    /* JADX INFO: renamed from: c0 */
    public final double m7682c0() {
        return this.f17254H;
    }

    /* JADX INFO: renamed from: d */
    public final double m7683d() {
        return this.f17308r;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m7684d0() {
        return this.f17304p;
    }

    /* JADX INFO: renamed from: e */
    public final String m7685e() {
        return this.f17290i;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m7686e0() {
        return this.f17281d0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonEntity)) {
            return false;
        }
        LessonEntity lessonEntity = (LessonEntity) obj;
        return this.f17274a == lessonEntity.f17274a && fa4.m11650l(this.f17276b, lessonEntity.f17276b) && fa4.m11650l(this.f17278c, lessonEntity.f17278c) && this.f17280d == lessonEntity.f17280d && fa4.m11650l(this.f17282e, lessonEntity.f17282e) && fa4.m11650l(this.f17284f, lessonEntity.f17284f) && fa4.m11650l(this.f17286g, lessonEntity.f17286g) && fa4.m11650l(this.f17288h, lessonEntity.f17288h) && fa4.m11650l(this.f17290i, lessonEntity.f17290i) && this.f17292j == lessonEntity.f17292j && fa4.m11650l(this.f17294k, lessonEntity.f17294k) && fa4.m11650l(this.f17296l, lessonEntity.f17296l) && fa4.m11650l(this.f17298m, lessonEntity.f17298m) && this.f17300n == lessonEntity.f17300n && this.f17302o == lessonEntity.f17302o && this.f17304p == lessonEntity.f17304p && Double.compare(this.f17306q, lessonEntity.f17306q) == 0 && Double.compare(this.f17308r, lessonEntity.f17308r) == 0 && this.f17310s == lessonEntity.f17310s && fa4.m11650l(this.f17312t, lessonEntity.f17312t) && fa4.m11650l(this.f17314u, lessonEntity.f17314u) && fa4.m11650l(this.f17316v, lessonEntity.f17316v) && fa4.m11650l(this.f17318w, lessonEntity.f17318w) && fa4.m11650l(this.f17320x, lessonEntity.f17320x) && fa4.m11650l(this.f17322y, lessonEntity.f17322y) && fa4.m11650l(this.f17324z, lessonEntity.f17324z) && fa4.m11650l(this.f17240A, lessonEntity.f17240A) && fa4.m11650l(this.f17242B, lessonEntity.f17242B) && fa4.m11650l(this.f17244C, lessonEntity.f17244C) && fa4.m11650l(this.f17246D, lessonEntity.f17246D) && fa4.m11650l(this.f17248E, lessonEntity.f17248E) && fa4.m11650l(this.f17250F, lessonEntity.f17250F) && fa4.m11650l(this.f17252G, lessonEntity.f17252G) && Double.compare(this.f17254H, lessonEntity.f17254H) == 0 && Double.compare(this.f17256I, lessonEntity.f17256I) == 0 && this.f17257J == lessonEntity.f17257J && this.f17258K == lessonEntity.f17258K && this.f17259L == lessonEntity.f17259L && this.f17260M == lessonEntity.f17260M && fa4.m11650l(this.f17261N, lessonEntity.f17261N) && this.f17262O == lessonEntity.f17262O && this.f17263P == lessonEntity.f17263P && Double.compare(this.f17264Q, lessonEntity.f17264Q) == 0 && fa4.m11650l(this.f17265R, lessonEntity.f17265R) && this.f17266S == lessonEntity.f17266S && fa4.m11650l(this.f17267T, lessonEntity.f17267T) && fa4.m11650l(this.f17268U, lessonEntity.f17268U) && fa4.m11650l(this.f17269V, lessonEntity.f17269V) && fa4.m11650l(this.f17270W, lessonEntity.f17270W) && this.f17271X == lessonEntity.f17271X && fa4.m11650l(this.f17272Y, lessonEntity.f17272Y) && fa4.m11650l(this.f17273Z, lessonEntity.f17273Z) && fa4.m11650l(this.f17275a0, lessonEntity.f17275a0) && fa4.m11650l(this.f17277b0, lessonEntity.f17277b0) && fa4.m11650l(this.f17279c0, lessonEntity.f17279c0) && fa4.m11650l(this.f17281d0, lessonEntity.f17281d0) && fa4.m11650l(this.f17283e0, lessonEntity.f17283e0) && fa4.m11650l(this.f17285f0, lessonEntity.f17285f0) && fa4.m11650l(this.f17287g0, lessonEntity.f17287g0) && this.f17289h0 == lessonEntity.f17289h0 && this.f17291i0 == lessonEntity.f17291i0 && this.f17293j0 == lessonEntity.f17293j0 && this.f17295k0 == lessonEntity.f17295k0 && this.f17297l0 == lessonEntity.f17297l0 && this.f17299m0 == lessonEntity.f17299m0 && fa4.m11650l(this.f17301n0, lessonEntity.f17301n0) && fa4.m11650l(this.f17303o0, lessonEntity.f17303o0) && this.f17305p0 == lessonEntity.f17305p0 && fa4.m11650l(this.f17307q0, lessonEntity.f17307q0) && fa4.m11650l(this.f17309r0, lessonEntity.f17309r0) && fa4.m11650l(this.f17311s0, lessonEntity.f17311s0) && fa4.m11650l(this.f17313t0, lessonEntity.f17313t0) && fa4.m11650l(this.f17315u0, lessonEntity.f17315u0) && fa4.m11650l(this.f17317v0, lessonEntity.f17317v0) && Double.compare(this.f17319w0, lessonEntity.f17319w0) == 0 && this.f17321x0 == lessonEntity.f17321x0 && fa4.m11650l(this.f17323y0, lessonEntity.f17323y0) && fa4.m11650l(this.f17325z0, lessonEntity.f17325z0) && fa4.m11650l(this.f17241A0, lessonEntity.f17241A0) && fa4.m11650l(this.f17243B0, lessonEntity.f17243B0) && fa4.m11650l(this.f17245C0, lessonEntity.f17245C0) && fa4.m11650l(this.f17247D0, lessonEntity.f17247D0) && fa4.m11650l(this.f17249E0, lessonEntity.f17249E0) && fa4.m11650l(this.f17251F0, lessonEntity.f17251F0) && fa4.m11650l(this.f17253G0, lessonEntity.f17253G0) && fa4.m11650l(this.f17255H0, lessonEntity.f17255H0);
    }

    /* JADX INFO: renamed from: f */
    public final int m7687f() {
        return this.f17299m0;
    }

    /* JADX INFO: renamed from: f0 */
    public final String m7688f0() {
        return this.f17285f0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7689g() {
        return this.f17293j0;
    }

    /* JADX INFO: renamed from: g0 */
    public final String m7690g0() {
        return this.f17283e0;
    }

    /* JADX INFO: renamed from: h */
    public final int m7691h() {
        return this.f17259L;
    }

    /* JADX INFO: renamed from: h0 */
    public final String m7692h0() {
        return this.f17287g0;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f17274a) * 31, this.f17276b, 31);
        String str = this.f17278c;
        int iM24106b = wq1.m24106b(this.f17280d, (iM22980c + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f17282e;
        int iHashCode = (iM24106b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17284f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17286g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17288h;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17290i;
        int iM24106b2 = wq1.m24106b(this.f17292j, (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.f17294k;
        int iHashCode5 = (iM24106b2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f17296l;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f17298m;
        int iM24106b3 = wq1.m24106b(this.f17310s, g9a.m12424a(this.f17308r, g9a.m12424a(this.f17306q, wq1.m24106b(this.f17304p, wq1.m24106b(this.f17302o, wq1.m24106b(this.f17300n, (iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str10 = this.f17312t;
        int iHashCode7 = (iM24106b3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        LessonUserLiked lessonUserLiked = this.f17314u;
        int iHashCode8 = (iHashCode7 + (lessonUserLiked == null ? 0 : lessonUserLiked.hashCode())) * 31;
        LessonUserCompleted lessonUserCompleted = this.f17316v;
        int iHashCode9 = (iHashCode8 + (lessonUserCompleted == null ? 0 : lessonUserCompleted.hashCode())) * 31;
        LessonSentencesTranslation lessonSentencesTranslation = this.f17318w;
        int iM22979b = ux5.m22979b(ux5.m22979b((iHashCode9 + (lessonSentencesTranslation == null ? 0 : lessonSentencesTranslation.hashCode())) * 31, 31, this.f17320x), 31, this.f17322y);
        String str11 = this.f17324z;
        int iHashCode10 = (iM22979b + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f17240A;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f17242B;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f17244C;
        int iHashCode13 = (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.f17246D;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17248E;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        LessonReference lessonReference = this.f17250F;
        int iHashCode16 = (iHashCode15 + (lessonReference == null ? 0 : lessonReference.hashCode())) * 31;
        LessonReference lessonReference2 = this.f17252G;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f17259L, wq1.m24106b(this.f17258K, g9a.m12428e(g9a.m12424a(this.f17256I, g9a.m12424a(this.f17254H, (iHashCode16 + (lessonReference2 == null ? 0 : lessonReference2.hashCode())) * 31, 31), 31), 31, this.f17257J), 31), 31), 31, this.f17260M);
        String str15 = this.f17261N;
        int iM12424a = g9a.m12424a(this.f17264Q, g9a.m12428e(wq1.m24106b(this.f17262O, (iM12428e + (str15 == null ? 0 : str15.hashCode())) * 31, 31), 31, this.f17263P), 31);
        String str16 = this.f17265R;
        int iM12428e2 = g9a.m12428e((iM12424a + (str16 == null ? 0 : str16.hashCode())) * 31, 31, this.f17266S);
        String str17 = this.f17267T;
        int iHashCode17 = (iM12428e2 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f17268U;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f17269V;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f17270W;
        int iM24106b4 = wq1.m24106b(this.f17271X, (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31, 31);
        Integer num3 = this.f17272Y;
        int iHashCode20 = (iM24106b4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str21 = this.f17273Z;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f17275a0;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f17277b0;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f17279c0;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f17281d0;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f17283e0;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.f17285f0;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.f17287g0;
        int iM24106b5 = wq1.m24106b(this.f17299m0, wq1.m24106b(this.f17297l0, g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31, 31, this.f17289h0), 31, this.f17291i0), 31, this.f17293j0), 31, this.f17295k0), 31), 31);
        String str29 = this.f17301n0;
        int iHashCode28 = (iM24106b5 + (str29 == null ? 0 : str29.hashCode())) * 31;
        List list = this.f17303o0;
        int iM24106b6 = wq1.m24106b(this.f17305p0, (iHashCode28 + (list == null ? 0 : list.hashCode())) * 31, 31);
        Float f = this.f17307q0;
        int iM22979b2 = ux5.m22979b((iM24106b6 + (f == null ? 0 : f.hashCode())) * 31, 31, this.f17309r0);
        String str30 = this.f17311s0;
        int iHashCode29 = (iM22979b2 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.f17313t0;
        int iHashCode30 = (iHashCode29 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.f17315u0;
        int iHashCode31 = (iHashCode30 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Boolean bool = this.f17317v0;
        int iM22980c2 = ux5.m22980c(wq1.m24106b(this.f17321x0, g9a.m12424a(this.f17319w0, (iHashCode31 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), this.f17323y0, 31);
        Boolean bool2 = this.f17325z0;
        int iHashCode32 = (iM22980c2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list2 = this.f17241A0;
        int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.f17243B0;
        int iHashCode34 = (iHashCode33 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        LessonPromotedCourse lessonPromotedCourse = this.f17245C0;
        int iHashCode35 = (iHashCode34 + (lessonPromotedCourse == null ? 0 : lessonPromotedCourse.hashCode())) * 31;
        String str33 = this.f17247D0;
        int iHashCode36 = (iHashCode35 + (str33 == null ? 0 : str33.hashCode())) * 31;
        LessonSimplifiedOf lessonSimplifiedOf = this.f17249E0;
        int iHashCode37 = (iHashCode36 + (lessonSimplifiedOf == null ? 0 : lessonSimplifiedOf.hashCode())) * 31;
        LessonSimplifiedOf lessonSimplifiedOf2 = this.f17251F0;
        int iHashCode38 = (iHashCode37 + (lessonSimplifiedOf2 == null ? 0 : lessonSimplifiedOf2.hashCode())) * 31;
        LessonMetadata lessonMetadata = this.f17253G0;
        int iHashCode39 = (iHashCode38 + (lessonMetadata == null ? 0 : lessonMetadata.hashCode())) * 31;
        String str34 = this.f17255H0;
        return iHashCode39 + (str34 != null ? str34.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m7693i() {
        return this.f17324z;
    }

    /* JADX INFO: renamed from: i0 */
    public final String m7694i0() {
        return this.f17296l;
    }

    /* JADX INFO: renamed from: j */
    public final int m7695j() {
        return this.f17310s;
    }

    /* JADX INFO: renamed from: j0 */
    public final LessonSimplifiedOf m7696j0() {
        return this.f17251F0;
    }

    /* JADX INFO: renamed from: k */
    public final String m7697k() {
        return this.f17312t;
    }

    /* JADX INFO: renamed from: k0 */
    public final LessonSimplifiedOf m7698k0() {
        return this.f17249E0;
    }

    /* JADX INFO: renamed from: l */
    public final String m7699l() {
        return this.f17284f;
    }

    /* JADX INFO: renamed from: l0 */
    public final String m7700l0() {
        return this.f17242B;
    }

    /* JADX INFO: renamed from: m */
    public final double m7701m() {
        return this.f17319w0;
    }

    /* JADX INFO: renamed from: m0 */
    public final String m7702m0() {
        return this.f17240A;
    }

    /* JADX INFO: renamed from: n */
    public final int m7703n() {
        return this.f17292j;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m7704n0() {
        return this.f17244C;
    }

    /* JADX INFO: renamed from: o */
    public final String m7705o() {
        return this.f17269V;
    }

    /* JADX INFO: renamed from: o0 */
    public final String m7706o0() {
        return this.f17294k;
    }

    /* JADX INFO: renamed from: p */
    public final List m7707p() {
        return this.f17241A0;
    }

    /* JADX INFO: renamed from: p0 */
    public final List m7708p0() {
        return this.f17303o0;
    }

    /* JADX INFO: renamed from: q */
    public final String m7709q() {
        return this.f17261N;
    }

    /* JADX INFO: renamed from: q0 */
    public final String m7710q0() {
        return this.f17282e;
    }

    /* JADX INFO: renamed from: r */
    public final int m7711r() {
        return this.f17274a;
    }

    /* JADX INFO: renamed from: r0 */
    public final LessonSentencesTranslation m7712r0() {
        return this.f17318w;
    }

    /* JADX INFO: renamed from: s */
    public final String m7713s() {
        return this.f17288h;
    }

    /* JADX INFO: renamed from: s0 */
    public final List m7714s0() {
        return this.f17309r0;
    }

    /* JADX INFO: renamed from: t */
    public final String m7715t() {
        return this.f17255H0;
    }

    /* JADX INFO: renamed from: t0 */
    public final List m7716t0() {
        return this.f17320x;
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17274a, "LessonEntity(id=", ", type=", this.f17276b, ", url=");
        AbstractC3393o1.m17748w(this.f17280d, this.f17278c, ", pos=", ", title=", sbM22995r);
        AbstractC3393o1.m17725C(sbM22995r, this.f17282e, ", description=", this.f17284f, ", pubDate=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17286g, ", imageUrl=", this.f17288h, ", audioUrl=");
        AbstractC3393o1.m17748w(this.f17292j, this.f17290i, ", duration=", ", status=", sbM22995r);
        AbstractC3393o1.m17725C(sbM22995r, this.f17294k, ", sharedDate=", this.f17296l, ", originalUrl=");
        AbstractC3393o1.m17748w(this.f17300n, this.f17298m, ", wordCount=", ", uniqueWordCount=", sbM22995r);
        hn1.m13360j(this.f17302o, this.f17304p, ", rosesCount=", ", lessonRating=", sbM22995r);
        sbM22995r.append(this.f17306q);
        hn1.m13370t(sbM22995r, ", audioRating=", this.f17308r, ", collectionId=");
        hn1.m13361k(this.f17310s, ", collectionTitle=", this.f17312t, ", lastUserLiked=", sbM22995r);
        sbM22995r.append(this.f17314u);
        sbM22995r.append(", lastUserCompleted=");
        sbM22995r.append(this.f17316v);
        sbM22995r.append(", translation=");
        sbM22995r.append(this.f17318w);
        sbM22995r.append(", transliteration=");
        sbM22995r.append(this.f17320x);
        sbM22995r.append(", altScript=");
        wq1.m24130z(", classicUrl=", this.f17324z, ", sourceType=", sbM22995r, this.f17322y);
        AbstractC3393o1.m17725C(sbM22995r, this.f17240A, ", sourceName=", this.f17242B, ", sourceUrl=");
        hn1.m13371u(sbM22995r, this.f17244C, ", previousLessonId=", this.f17246D, ", nextLessonId=");
        sbM22995r.append(this.f17248E);
        sbM22995r.append(", nextLesson=");
        sbM22995r.append(this.f17250F);
        sbM22995r.append(", previousLesson=");
        sbM22995r.append(this.f17252G);
        sbM22995r.append(", readTimes=");
        sbM22995r.append(this.f17254H);
        hn1.m13370t(sbM22995r, ", listenTimes=", this.f17256I, ", isCompleted=");
        hn1.m13373w(sbM22995r, this.f17257J, ", newWordsCount=", this.f17258K, ", cardsCount=");
        hn1.m13368r(sbM22995r, this.f17259L, ", isRoseGiven=", this.f17260M, ", giveRoseUrl=");
        AbstractC3393o1.m17748w(this.f17262O, this.f17261N, ", price=", ", opened=", sbM22995r);
        sbM22995r.append(this.f17263P);
        sbM22995r.append(", percentCompleted=");
        sbM22995r.append(this.f17264Q);
        sbM22995r.append(", lastRoseReceived=");
        sbM22995r.append(this.f17265R);
        sbM22995r.append(", isFavorite=");
        sbM22995r.append(this.f17266S);
        AbstractC3393o1.m17725C(sbM22995r, ", printUrl=", this.f17267T, ", videoUrl=", this.f17268U);
        AbstractC3393o1.m17725C(sbM22995r, ", exercises=", this.f17269V, ", notes=", this.f17270W);
        sbM22995r.append(", viewsCount=");
        sbM22995r.append(this.f17271X);
        sbM22995r.append(", providerId=");
        sbM22995r.append(this.f17272Y);
        AbstractC3393o1.m17725C(sbM22995r, ", providerName=", this.f17273Z, ", providerDescription=", this.f17275a0);
        AbstractC3393o1.m17725C(sbM22995r, ", originalImageUrl=", this.f17277b0, ", providerImageUrl=", this.f17279c0);
        AbstractC3393o1.m17725C(sbM22995r, ", sharedById=", this.f17281d0, ", sharedByName=", this.f17283e0);
        AbstractC3393o1.m17725C(sbM22995r, ", sharedByImageUrl=", this.f17285f0, ", sharedByRole=", this.f17287g0);
        sbM22995r.append(", isSharedByIsFriend=");
        sbM22995r.append(this.f17289h0);
        sbM22995r.append(", isCanEdit=");
        sbM22995r.append(this.f17291i0);
        sbM22995r.append(", canEditSentence=");
        sbM22995r.append(this.f17293j0);
        sbM22995r.append(", isProtected=");
        sbM22995r.append(this.f17295k0);
        wq1.m24127w(this.f17297l0, this.f17299m0, ", lessonVotes=", ", audioVotes=", sbM22995r);
        sbM22995r.append(", level=");
        sbM22995r.append(this.f17301n0);
        sbM22995r.append(", tags=");
        sbM22995r.append(this.f17303o0);
        sbM22995r.append(", progressDownloaded=");
        sbM22995r.append(this.f17305p0);
        sbM22995r.append(", progress=");
        sbM22995r.append(this.f17307q0);
        sbM22995r.append(", translationSentence=");
        sbM22995r.append(this.f17309r0);
        sbM22995r.append(", mediaImageUrl=");
        sbM22995r.append(this.f17311s0);
        AbstractC3393o1.m17725C(sbM22995r, ", mediaTitle=", this.f17313t0, ", ptime=", this.f17315u0);
        sbM22995r.append(", isPinned=");
        sbM22995r.append(this.f17317v0);
        sbM22995r.append(", difficulty=");
        sbM22995r.append(this.f17319w0);
        sbM22995r.append(", newWords=");
        sbM22995r.append(this.f17321x0);
        sbM22995r.append(", lessonPreview=");
        sbM22995r.append(this.f17323y0);
        sbM22995r.append(", isTaken=");
        sbM22995r.append(this.f17325z0);
        sbM22995r.append(", folders=");
        sbM22995r.append(this.f17241A0);
        sbM22995r.append(", audioPending=");
        sbM22995r.append(this.f17243B0);
        sbM22995r.append(", lessonPromotedCourse=");
        sbM22995r.append(this.f17245C0);
        sbM22995r.append(", isLocked=");
        sbM22995r.append(this.f17247D0);
        sbM22995r.append(", simplifiedTo=");
        sbM22995r.append(this.f17249E0);
        sbM22995r.append(", simplifiedBy=");
        sbM22995r.append(this.f17251F0);
        sbM22995r.append(", metadata=");
        sbM22995r.append(this.f17253G0);
        sbM22995r.append(", lastOpenTime=");
        sbM22995r.append(this.f17255H0);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    /* JADX INFO: renamed from: u */
    public final String m7717u() {
        return this.f17265R;
    }

    /* JADX INFO: renamed from: u0 */
    public final String m7718u0() {
        return this.f17276b;
    }

    /* JADX INFO: renamed from: v */
    public final LessonUserCompleted m7719v() {
        return this.f17316v;
    }

    /* JADX INFO: renamed from: v0 */
    public final int m7720v0() {
        return this.f17302o;
    }

    /* JADX INFO: renamed from: w */
    public final LessonUserLiked m7721w() {
        return this.f17314u;
    }

    /* JADX INFO: renamed from: w0 */
    public final String m7722w0() {
        return this.f17278c;
    }

    /* JADX INFO: renamed from: x */
    public final String m7723x() {
        return this.f17323y0;
    }

    /* JADX INFO: renamed from: x0 */
    public final String m7724x0() {
        return this.f17268U;
    }

    /* JADX INFO: renamed from: y */
    public final LessonPromotedCourse m7725y() {
        return this.f17245C0;
    }

    /* JADX INFO: renamed from: y0 */
    public final int m7726y0() {
        return this.f17271X;
    }

    /* JADX INFO: renamed from: z */
    public final double m7727z() {
        return this.f17306q;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m7728z0() {
        return this.f17300n;
    }

    public LessonEntity(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, int i3, String str8, String str9, String str10, int i4, int i5, int i6, double d, double d2, int i7, String str11, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonSentencesTranslation lessonSentencesTranslation, List list, List list2, String str12, String str13, String str14, String str15, Integer num, Integer num2, LessonReference lessonReference, LessonReference lessonReference2, double d3, double d4, boolean z, int i8, int i9, boolean z2, String str16, int i10, boolean z3, double d5, String str17, boolean z4, String str18, String str19, String str20, String str21, int i11, Integer num3, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, boolean z5, boolean z6, boolean z7, boolean z8, int i12, int i13, String str30, List list3, int i14, Float f, List list4, String str31, String str32, String str33, Boolean bool, double d6, int i15, String str34, Boolean bool2, List list5, Boolean bool3, LessonPromotedCourse lessonPromotedCourse, String str35, LessonSimplifiedOf lessonSimplifiedOf, LessonSimplifiedOf lessonSimplifiedOf2, LessonMetadata lessonMetadata, String str36) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list4.getClass();
        str34.getClass();
        this.f17274a = i;
        this.f17276b = str;
        this.f17278c = str2;
        this.f17280d = i2;
        this.f17282e = str3;
        this.f17284f = str4;
        this.f17286g = str5;
        this.f17288h = str6;
        this.f17290i = str7;
        this.f17292j = i3;
        this.f17294k = str8;
        this.f17296l = str9;
        this.f17298m = str10;
        this.f17300n = i4;
        this.f17302o = i5;
        this.f17304p = i6;
        this.f17306q = d;
        this.f17308r = d2;
        this.f17310s = i7;
        this.f17312t = str11;
        this.f17314u = lessonUserLiked;
        this.f17316v = lessonUserCompleted;
        this.f17318w = lessonSentencesTranslation;
        this.f17320x = list;
        this.f17322y = list2;
        this.f17324z = str12;
        this.f17240A = str13;
        this.f17242B = str14;
        this.f17244C = str15;
        this.f17246D = num;
        this.f17248E = num2;
        this.f17250F = lessonReference;
        this.f17252G = lessonReference2;
        this.f17254H = d3;
        this.f17256I = d4;
        this.f17257J = z;
        this.f17258K = i8;
        this.f17259L = i9;
        this.f17260M = z2;
        this.f17261N = str16;
        this.f17262O = i10;
        this.f17263P = z3;
        this.f17264Q = d5;
        this.f17265R = str17;
        this.f17266S = z4;
        this.f17267T = str18;
        this.f17268U = str19;
        this.f17269V = str20;
        this.f17270W = str21;
        this.f17271X = i11;
        this.f17272Y = num3;
        this.f17273Z = str22;
        this.f17275a0 = str23;
        this.f17277b0 = str24;
        this.f17279c0 = str25;
        this.f17281d0 = str26;
        this.f17283e0 = str27;
        this.f17285f0 = str28;
        this.f17287g0 = str29;
        this.f17289h0 = z5;
        this.f17291i0 = z6;
        this.f17293j0 = z7;
        this.f17295k0 = z8;
        this.f17297l0 = i12;
        this.f17299m0 = i13;
        this.f17301n0 = str30;
        this.f17303o0 = list3;
        this.f17305p0 = i14;
        this.f17307q0 = f;
        this.f17309r0 = list4;
        this.f17311s0 = str31;
        this.f17313t0 = str32;
        this.f17315u0 = str33;
        this.f17317v0 = bool;
        this.f17319w0 = d6;
        this.f17321x0 = i15;
        this.f17323y0 = str34;
        this.f17325z0 = bool2;
        this.f17241A0 = list5;
        this.f17243B0 = bool3;
        this.f17245C0 = lessonPromotedCourse;
        this.f17247D0 = str35;
        this.f17249E0 = lessonSimplifiedOf;
        this.f17251F0 = lessonSimplifiedOf2;
        this.f17253G0 = lessonMetadata;
        this.f17255H0 = str36;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LessonEntity(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, int i4, int i5, int i6, double d, double d2, int i7, String str10, LessonUserLiked lessonUserLiked, LessonUserCompleted lessonUserCompleted, LessonSentencesTranslation lessonSentencesTranslation, String str11, String str12, String str13, String str14, Integer num, Integer num2, LessonReference lessonReference, LessonReference lessonReference2, double d3, double d4, boolean z, int i8, int i9, boolean z2, String str15, int i10, boolean z3, double d5, String str16, boolean z4, String str17, String str18, String str19, String str20, int i11, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, boolean z5, boolean z6, boolean z7, int i12, int i13, String str29, List list, Boolean bool, double d6, Boolean bool2, List list2, Boolean bool3, LessonPromotedCourse lessonPromotedCourse, String str30, LessonSimplifiedOf lessonSimplifiedOf, LessonSimplifiedOf lessonSimplifiedOf2, LessonMetadata lessonMetadata, String str31, int i14, int i15, int i16) {
        int i17 = (i14 & 8) != 0 ? 0 : i2;
        int i18 = (i14 & 8192) != 0 ? 0 : i4;
        int i19 = (i14 & 16384) != 0 ? 0 : i5;
        int i20 = (i14 & 32768) != 0 ? 0 : i6;
        double d7 = (i14 & 65536) != 0 ? 0.0d : d;
        double d8 = (i14 & 131072) != 0 ? 0.0d : d2;
        int i21 = (i14 & 262144) != 0 ? 0 : i7;
        LessonUserLiked lessonUserLiked2 = (i14 & 1048576) != 0 ? null : lessonUserLiked;
        LessonUserCompleted lessonUserCompleted2 = (i14 & 2097152) != 0 ? null : lessonUserCompleted;
        LessonSentencesTranslation lessonSentencesTranslation2 = (4194304 & i14) != 0 ? null : lessonSentencesTranslation;
        Integer num3 = (i14 & 536870912) != 0 ? 0 : num;
        Integer num4 = (i14 & 1073741824) != 0 ? 0 : num2;
        LessonReference lessonReference3 = (i14 & Integer.MIN_VALUE) != 0 ? null : lessonReference;
        LessonReference lessonReference4 = (i15 & 1) != 0 ? null : lessonReference2;
        double d9 = (i15 & 2) != 0 ? 0.0d : d3;
        double d10 = (i15 & 4) != 0 ? 0.0d : d4;
        boolean z8 = (i15 & 8) != 0 ? false : z;
        int i22 = (i15 & 16) != 0 ? 0 : i8;
        int i23 = (i15 & 32) != 0 ? 0 : i9;
        boolean z9 = (i15 & 64) != 0 ? false : z2;
        int i24 = (i15 & 256) != 0 ? 0 : i10;
        boolean z10 = (i15 & 512) != 0 ? false : z3;
        double d11 = (i15 & 1024) != 0 ? 0.0d : d5;
        boolean z11 = (i15 & 4096) != 0 ? false : z4;
        int i25 = (i15 & 131072) != 0 ? 0 : i11;
        String str32 = (8388608 & i15) != 0 ? null : str25;
        String str33 = (67108864 & i15) != 0 ? null : str28;
        boolean z12 = (134217728 & i15) != 0 ? false : z5;
        boolean z13 = (268435456 & i15) != 0 ? false : z6;
        boolean z14 = (i15 & 536870912) != 0 ? false : z7;
        boolean z15 = (i15 & 1073741824) != 0;
        int i26 = (i15 & Integer.MIN_VALUE) != 0 ? 0 : i12;
        int i27 = (i16 & 1) != 0 ? 0 : i13;
        int i28 = i16 & 4;
        EmptyList emptyList = EmptyList.f47638a;
        this(i, "content", str, i17, str2, str3, str4, str5, str6, i3, str7, str8, str9, i18, i19, i20, d7, d8, i21, str10, lessonUserLiked2, lessonUserCompleted2, lessonSentencesTranslation2, emptyList, emptyList, str11, str12, str13, str14, num3, num4, lessonReference3, lessonReference4, d9, d10, z8, i22, i23, z9, str15, i24, z10, d11, str16, z11, str17, str18, str19, str20, i25, 0, str21, str22, str23, str24, str32, str26, str27, str33, z12, z13, z14, z15, i26, i27, str29, i28 != 0 ? emptyList : list, 0, null, emptyList, null, null, null, bool, (i16 & 1024) != 0 ? 0.0d : d6, 0, "", (i16 & 8192) != 0 ? null : bool2, (i16 & 16384) != 0 ? emptyList : list2, (i16 & 32768) != 0 ? Boolean.FALSE : bool3, (i16 & 65536) != 0 ? null : lessonPromotedCourse, (i16 & 131072) != 0 ? null : str30, (i16 & 262144) != 0 ? null : lessonSimplifiedOf, (524288 & i16) != 0 ? null : lessonSimplifiedOf2, (i16 & 1048576) != 0 ? null : lessonMetadata, (i16 & 2097152) != 0 ? null : str31);
    }
}
