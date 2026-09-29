package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.LessonBookmarkEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LessonsSimplifiedJoin;
import com.lingq.core.domain.model.lesson.LessonMetadata;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.LessonSimplifiedOf;
import com.lingq.core.domain.model.lesson.LessonStatus;
import com.lingq.core.domain.model.lesson.LessonUserCompleted;
import com.lingq.core.domain.model.lesson.LessonUserLiked;
import com.lingq.core.network.api.result.ResultLessonBookmark;
import com.lingq.core.network.api.result.ResultLessonMediaSource;
import com.lingq.core.network.api.result.ResultLessonMetadata;
import com.lingq.core.network.api.result.ResultLessonReference;
import com.lingq.core.network.api.result.ResultLessonSentencesTranslation;
import com.lingq.core.network.api.result.ResultLessonText;
import com.lingq.core.network.api.result.ResultLessonUserCompleted;
import com.lingq.core.network.api.result.ResultLessonUserLiked;
import com.lingq.core.network.api.result.ResultSentence;
import com.lingq.core.network.api.result.ResultSimplified;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.c32;
import p000.d98;
import p000.esc;
import p000.fa4;
import p000.j65;
import p000.mv0;
import p000.q05;
import p000.u91;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl$storeLessonTextData$2", m4291f = "LessonRepositoryImpl.kt", m4292l = {472, 476, 479, 487, 490, 503, 509}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonRepositoryImpl$storeLessonTextData$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public LessonEntity f15511a;

    /* JADX INFO: renamed from: b */
    public int f15512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ResultLessonText f15513c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15514d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f15515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$storeLessonTextData$2(ResultLessonText resultLessonText, C1295k c1295k, int i, Continuation continuation) {
        super(1, continuation);
        this.f15513c = resultLessonText;
        this.f15514d = c1295k;
        this.f15515e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonRepositoryImpl$storeLessonTextData$2(this.f15513c, this.f15514d, this.f15515e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonRepositoryImpl$storeLessonTextData$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:128:0x0342 A[PHI: r1 r94 r95 r96
      0x0342: PHI (r1v6 com.lingq.core.database.entity.LessonEntity) = 
      (r1v4 com.lingq.core.database.entity.LessonEntity)
      (r1v4 com.lingq.core.database.entity.LessonEntity)
      (r1v4 com.lingq.core.database.entity.LessonEntity)
      (r1v4 com.lingq.core.database.entity.LessonEntity)
      (r1v21 com.lingq.core.database.entity.LessonEntity)
     binds: [B:102:0x02ef, B:104:0x02f5, B:124:0x0334, B:126:0x033f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0342: PHI (r94v11 java.lang.Throwable) = 
      (r94v9 java.lang.Throwable)
      (r94v9 java.lang.Throwable)
      (r94v9 java.lang.Throwable)
      (r94v9 java.lang.Throwable)
      (r94v12 java.lang.Throwable)
     binds: [B:102:0x02ef, B:104:0x02f5, B:124:0x0334, B:126:0x033f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0342: PHI (r95v11 boolean) = (r95v9 boolean), (r95v9 boolean), (r95v9 boolean), (r95v9 boolean), (r95v12 boolean) binds: [B:102:0x02ef, B:104:0x02f5, B:124:0x0334, B:126:0x033f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0342: PHI (r96v11 xfa) = (r96v9 xfa), (r96v9 xfa), (r96v9 xfa), (r96v9 xfa), (r96v12 xfa) binds: [B:102:0x02ef, B:104:0x02f5, B:124:0x0334, B:126:0x033f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0346  */
    /* JADX WARN: Code duplicated, block: B:132:0x035f  */
    /* JADX WARN: Code duplicated, block: B:138:0x037a  */
    /* JADX WARN: Code duplicated, block: B:148:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x023d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0243 A[PHI: r4 r9 r94 r96
      0x0243: PHI (r4v66 com.lingq.core.database.entity.LessonEntity) = (r4v64 com.lingq.core.database.entity.LessonEntity), (r4v67 com.lingq.core.database.entity.LessonEntity) binds: [B:63:0x023f, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r9v4 int) = (r9v3 int), (r9v11 int) binds: [B:63:0x023f, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r94v3 java.lang.Throwable) = (r94v1 java.lang.Throwable), (r94v4 java.lang.Throwable) binds: [B:63:0x023f, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r96v3 xfa) = (r5v0 xfa), (r96v4 xfa) binds: [B:63:0x023f, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x024c  */
    /* JADX WARN: Code duplicated, block: B:70:0x025d  */
    /* JADX WARN: Code duplicated, block: B:73:0x027d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0285  */
    /* JADX WARN: Code duplicated, block: B:77:0x0291  */
    /* JADX WARN: Code duplicated, block: B:78:0x0294  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x02be A[PHI: r4 r94 r95 r96
      0x02be: PHI (r4v68 com.lingq.core.database.entity.LessonEntity) = (r4v66 com.lingq.core.database.entity.LessonEntity), (r4v69 com.lingq.core.database.entity.LessonEntity) binds: [B:86:0x02ba, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r94v5 java.lang.Throwable) = (r94v3 java.lang.Throwable), (r94v6 java.lang.Throwable) binds: [B:86:0x02ba, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r95v5 boolean) = (r95v1 boolean), (r95v6 boolean) binds: [B:86:0x02ba, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r96v5 xfa) = (r96v3 xfa), (r96v6 xfa) binds: [B:86:0x02ba, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d3 A[PHI: r4 r94 r95 r96
      0x02d3: PHI (r4v70 com.lingq.core.database.entity.LessonEntity) = 
      (r4v68 com.lingq.core.database.entity.LessonEntity)
      (r4v68 com.lingq.core.database.entity.LessonEntity)
      (r4v71 com.lingq.core.database.entity.LessonEntity)
     binds: [B:89:0x02c0, B:91:0x02cf, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r94v7 java.lang.Throwable) = (r94v5 java.lang.Throwable), (r94v5 java.lang.Throwable), (r94v8 java.lang.Throwable) binds: [B:89:0x02c0, B:91:0x02cf, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r95v7 boolean) = (r95v5 boolean), (r95v5 boolean), (r95v8 boolean) binds: [B:89:0x02c0, B:91:0x02cf, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r96v7 xfa) = (r96v5 xfa), (r96v5 xfa), (r96v8 xfa) binds: [B:89:0x02c0, B:91:0x02cf, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        LessonEntity lessonEntity;
        int i;
        Object objM2861d;
        Ref$IntRef ref$IntRef;
        List list;
        boolean z;
        List arrayList;
        Iterator it;
        ArrayList arrayList2;
        int i2;
        int i3;
        boolean z2;
        ResultLessonBookmark resultLessonBookmark;
        LessonBookmarkEntity lessonBookmarkEntityM11329a;
        C1321i c1321i;
        LessonEntity lessonEntity2;
        ResultLessonSentencesTranslation resultLessonSentencesTranslation;
        Object obj2;
        Collection collection;
        LessonSimplifiedOf lessonSimplifiedOf;
        LessonsSimplifiedJoin lessonsSimplifiedJoin;
        boolean z3;
        C1295k c1295k = this.f15514d;
        AbstractC1320h abstractC1320h = c1295k.f16498b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.f15512b;
        xfa xfaVar = xfa.f68157a;
        ResultLessonText resultLessonText = this.f15513c;
        int i5 = this.f15515e;
        switch (i4) {
            case 0:
                AbstractC3193b.m15359b(obj);
                resultLessonText.getClass();
                int i6 = resultLessonText.f21147a;
                String str = resultLessonText.f21149b;
                int i7 = resultLessonText.f21151c;
                String str2 = resultLessonText.f21153d;
                String str3 = resultLessonText.f21155e;
                String str4 = resultLessonText.f21157f;
                th = null;
                String str5 = resultLessonText.f21159g;
                String str6 = resultLessonText.f21161h;
                int i8 = resultLessonText.f21163i;
                String str7 = resultLessonText.f21165j;
                String str8 = resultLessonText.f21167k;
                String str9 = resultLessonText.f21169l;
                int i9 = resultLessonText.f21171m;
                int i10 = resultLessonText.f21173n;
                int i11 = resultLessonText.f21179q;
                double d = resultLessonText.f21181r;
                double d2 = resultLessonText.f21183s;
                int i12 = resultLessonText.f21185t;
                String str10 = resultLessonText.f21187u;
                ResultLessonUserLiked resultLessonUserLiked = resultLessonText.f21190x;
                LessonUserLiked lessonUserLiked = resultLessonUserLiked == null ? null : new LessonUserLiked(resultLessonUserLiked.f21209a, resultLessonUserLiked.f21210b);
                ResultLessonUserCompleted resultLessonUserCompleted = resultLessonText.f21191y;
                LessonUserCompleted lessonUserCompleted = resultLessonUserCompleted == null ? null : new LessonUserCompleted(resultLessonUserCompleted.f21206a, resultLessonUserCompleted.f21207b);
                ResultLessonSentencesTranslation resultLessonSentencesTranslation2 = resultLessonText.f21192z;
                LessonSentencesTranslation lessonSentencesTranslation = resultLessonSentencesTranslation2 == null ? null : new LessonSentencesTranslation(resultLessonSentencesTranslation2.f21109a, resultLessonSentencesTranslation2.f21110b);
                String str11 = resultLessonText.f21121A;
                ResultLessonMediaSource resultLessonMediaSource = resultLessonText.f21122B;
                String str12 = resultLessonMediaSource != null ? resultLessonMediaSource.f21090a : null;
                String str13 = resultLessonMediaSource != null ? resultLessonMediaSource.f21091b : null;
                String str14 = resultLessonMediaSource != null ? resultLessonMediaSource.f21092c : null;
                Integer num = resultLessonText.f21123C;
                Integer num2 = resultLessonText.f21124D;
                double d3 = resultLessonText.f21125E;
                double d4 = resultLessonText.f21126F;
                boolean z4 = resultLessonText.f21127G;
                int i13 = resultLessonText.f21128H;
                int i14 = resultLessonText.f21129I;
                boolean z5 = resultLessonText.f21130J;
                String str15 = resultLessonText.f21131K;
                int i15 = resultLessonText.f21132L;
                boolean z6 = resultLessonText.f21133M;
                double d5 = resultLessonText.f21134N;
                String str16 = resultLessonText.f21135O;
                String str17 = resultLessonText.f21150b0;
                boolean z7 = resultLessonText.f21136P;
                String str18 = resultLessonText.f21137Q;
                String str19 = resultLessonText.f21138R;
                String str20 = resultLessonText.f21139S;
                String str21 = resultLessonText.f21140T;
                int i16 = resultLessonText.f21141U;
                String str22 = resultLessonText.f21143W;
                String str23 = resultLessonText.f21144X;
                String str24 = resultLessonText.f21146Z;
                String str25 = resultLessonText.f21152c0;
                boolean z8 = resultLessonText.f21156e0;
                boolean z9 = resultLessonText.f21158f0;
                boolean z10 = resultLessonText.f21160g0;
                int i17 = resultLessonText.f21162h0;
                int i18 = resultLessonText.f21164i0;
                String str26 = resultLessonText.f21166j0;
                List list2 = resultLessonText.f21168k0;
                String str27 = resultLessonText.f21145Y;
                boolean z11 = resultLessonText.f21170l0;
                String str28 = resultLessonText.f21148a0;
                String str29 = resultLessonText.f21154d0;
                ResultLessonReference resultLessonReference = resultLessonText.f21172m0;
                LessonReference lessonReferenceM11333e = resultLessonReference != null ? esc.m11333e(resultLessonReference) : null;
                ResultLessonReference resultLessonReference2 = resultLessonText.f21174n0;
                LessonReference lessonReferenceM11333e2 = resultLessonReference2 != null ? esc.m11333e(resultLessonReference2) : null;
                String str30 = resultLessonText.f21176o0;
                ResultSimplified resultSimplified = resultLessonText.f21178p0;
                LessonSimplifiedOf lessonSimplifiedOfM11334f = resultSimplified != null ? esc.m11334f(resultSimplified) : null;
                ResultSimplified resultSimplified2 = resultLessonText.f21180q0;
                LessonSimplifiedOf lessonSimplifiedOfM11334f2 = resultSimplified2 != null ? esc.m11334f(resultSimplified2) : null;
                ResultLessonMetadata resultLessonMetadata = resultLessonText.f21182r0;
                LessonEntity lessonEntity3 = new LessonEntity(i6, str, i7, str2, str3, str4, str5, str6, i8, str7, str8, str9, i9, i10, i11, d, d2, i12, str10, lessonUserLiked, lessonUserCompleted, lessonSentencesTranslation, str11, str12, str13, str14, num, num2, lessonReferenceM11333e, lessonReferenceM11333e2, d3, d4, z4, i13, i14, z5, str15, i15, z6, d5, str16, z7, str18, str19, str20, str21, i16, str22, str23, str27, str24, str28, str17, str25, str29, z8, z9, z10, i17, i18, str26, list2, Boolean.FALSE, 0.0d, null, null, Boolean.valueOf(z11), esc.m11332d(resultLessonText.f21186t0), str30, lessonSimplifiedOfM11334f, lessonSimplifiedOfM11334f2, resultLessonMetadata != null ? new LessonMetadata(resultLessonMetadata.f21093a, resultLessonMetadata.f21094b, resultLessonMetadata.f21095c) : null, resultLessonText.f21184s0, 25165826, 262144, 28696);
                this.f15511a = lessonEntity3;
                this.f15512b = 1;
                if (abstractC1320h.mo4095v0(lessonEntity3, this) != coroutineSingletons) {
                    lessonEntity = lessonEntity3;
                    this.f15511a = lessonEntity;
                    this.f15512b = 2;
                    i = 0;
                    objM2861d = AbstractC0758a.m2861d(new mv0(i5, 8), ((q05) abstractC1320h).f57071K, this, false, true);
                    if (objM2861d != coroutineSingletons) {
                    }
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                        ref$IntRef = new Ref$IntRef();
                        list = resultLessonText.f21188v;
                        if (list != null) {
                            arrayList = new ArrayList();
                            it = list.iterator();
                            while (it.hasNext()) {
                                List list3 = ((d98) it.next()).f35220a;
                                arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
                                i2 = i;
                                for (Object obj3 : list3) {
                                    i3 = i2 + 1;
                                    if (i2 < 0) {
                                        vz1.m23628e0();
                                        throw th;
                                    }
                                    ResultSentence resultSentence = (ResultSentence) obj3;
                                    int i19 = ref$IntRef.f47716a + 1;
                                    ref$IntRef.f47716a = i19;
                                    if (i2 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    arrayList2.add(esc.m11331c(resultSentence, i5, i19, z2));
                                    i2 = i3;
                                }
                                u91.m22630w0(arrayList2, arrayList);
                                i = 0;
                            }
                            z = true;
                        } else {
                            z = true;
                            arrayList = EmptyList.f47638a;
                        }
                        this.f15511a = lessonEntity;
                        this.f15512b = 3;
                        if (abstractC1320h.mo7490G0(arrayList, this) != coroutineSingletons) {
                            resultLessonBookmark = resultLessonText.f21189w;
                            if (resultLessonBookmark != null) {
                                lessonBookmarkEntityM11329a = esc.m11329a(resultLessonBookmark, i5);
                                this.f15511a = lessonEntity;
                                this.f15512b = 4;
                                if (abstractC1320h.mo7489F0(lessonBookmarkEntityM11329a, this) != coroutineSingletons) {
                                    c1321i = c1295k.f16501e;
                                    this.f15511a = lessonEntity;
                                    this.f15512b = 5;
                                    if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                                        lessonEntity2 = lessonEntity;
                                        resultLessonSentencesTranslation = resultLessonText.f21192z;
                                        if (resultLessonSentencesTranslation != null) {
                                            obj2 = resultLessonSentencesTranslation.f21110b;
                                        } else {
                                            obj2 = th;
                                        }
                                        collection = (Collection) obj2;
                                        if (collection != null || collection.isEmpty()) {
                                            lessonSimplifiedOf = lessonEntity2.f17249E0;
                                            if (lessonSimplifiedOf != null) {
                                                return xfaVar;
                                            }
                                            String str31 = lessonSimplifiedOf.f19264a;
                                            Integer num3 = new Integer(lessonSimplifiedOf.f19266c);
                                            if (!fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue()) || fa4.m11650l(str31, LessonStatus.INACESSIBLE_I.getValue()) || fa4.m11650l(str31, LessonStatus.INACESSIBLE.getValue())) {
                                                z3 = z;
                                            } else {
                                                z3 = false;
                                            }
                                            lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num3, z3);
                                            this.f15511a = th;
                                            this.f15512b = 7;
                                            if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                                return xfaVar;
                                            }
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            int i20 = 0;
                                            for (Object obj4 : (Iterable) obj2) {
                                                int i21 = i20 + 1;
                                                if (i20 < 0) {
                                                    vz1.m23628e0();
                                                    throw th;
                                                }
                                                String str32 = (String) obj4;
                                                Object j65Var = (str32 == null || vk9.m23391n0(str32)) ? th : new j65(i5, str32, i21);
                                                if (j65Var != null) {
                                                    arrayList3.add(j65Var);
                                                }
                                                i20 = i21;
                                            }
                                            if (arrayList3.isEmpty()) {
                                                lessonSimplifiedOf = lessonEntity2.f17249E0;
                                                if (lessonSimplifiedOf != null) {
                                                    return xfaVar;
                                                }
                                                String str33 = lessonSimplifiedOf.f19264a;
                                                Integer num4 = new Integer(lessonSimplifiedOf.f19266c);
                                                if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                                    z3 = z;
                                                } else {
                                                    z3 = z;
                                                }
                                                lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num4, z3);
                                                this.f15511a = th;
                                                this.f15512b = 7;
                                                if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                                    return xfaVar;
                                                }
                                            } else {
                                                this.f15511a = lessonEntity2;
                                                this.f15512b = 6;
                                                if (abstractC1320h.mo7498O0(arrayList3, this) != coroutineSingletons) {
                                                    lessonSimplifiedOf = lessonEntity2.f17249E0;
                                                    if (lessonSimplifiedOf != null) {
                                                        return xfaVar;
                                                    }
                                                    String str34 = lessonSimplifiedOf.f19264a;
                                                    Integer num5 = new Integer(lessonSimplifiedOf.f19266c);
                                                    if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                                        z3 = z;
                                                    } else {
                                                        z3 = z;
                                                    }
                                                    lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num5, z3);
                                                    this.f15511a = th;
                                                    this.f15512b = 7;
                                                    if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                                        return xfaVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c1321i = c1295k.f16501e;
                                this.f15511a = lessonEntity;
                                this.f15512b = 5;
                                if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                                    lessonEntity2 = lessonEntity;
                                    resultLessonSentencesTranslation = resultLessonText.f21192z;
                                    if (resultLessonSentencesTranslation != null) {
                                        obj2 = resultLessonSentencesTranslation.f21110b;
                                    } else {
                                        obj2 = th;
                                    }
                                    collection = (Collection) obj2;
                                    if (collection != null) {
                                        lessonSimplifiedOf = lessonEntity2.f17249E0;
                                        if (lessonSimplifiedOf != null) {
                                            return xfaVar;
                                        }
                                        String str35 = lessonSimplifiedOf.f19264a;
                                        Integer num6 = new Integer(lessonSimplifiedOf.f19266c);
                                        if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                            z3 = z;
                                        } else {
                                            z3 = z;
                                        }
                                        lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num6, z3);
                                        this.f15511a = th;
                                        this.f15512b = 7;
                                        if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                            return xfaVar;
                                        }
                                    } else {
                                        lessonSimplifiedOf = lessonEntity2.f17249E0;
                                        if (lessonSimplifiedOf != null) {
                                            return xfaVar;
                                        }
                                        String str36 = lessonSimplifiedOf.f19264a;
                                        Integer num7 = new Integer(lessonSimplifiedOf.f19266c);
                                        if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                            z3 = z;
                                        } else {
                                            z3 = z;
                                        }
                                        lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num7, z3);
                                        this.f15511a = th;
                                        this.f15512b = 7;
                                        if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                            return xfaVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                objM2861d = xfaVar;
                return coroutineSingletons;
            case 1:
                lessonEntity = this.f15511a;
                AbstractC3193b.m15359b(obj);
                th = null;
                this.f15511a = lessonEntity;
                this.f15512b = 2;
                i = 0;
                objM2861d = AbstractC0758a.m2861d(new mv0(i5, 8), ((q05) abstractC1320h).f57071K, this, false, true);
                if (objM2861d != coroutineSingletons) {
                }
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                    ref$IntRef = new Ref$IntRef();
                    list = resultLessonText.f21188v;
                    if (list != null) {
                        arrayList = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                            List list4 = ((d98) it.next()).f35220a;
                            arrayList2 = new ArrayList(v91.m23189q0(list4, 10));
                            i2 = i;
                            while (r11.hasNext()) {
                                i3 = i2 + 1;
                                if (i2 < 0) {
                                    vz1.m23628e0();
                                    throw th;
                                }
                                ResultSentence resultSentence2 = (ResultSentence) obj3;
                                int i110 = ref$IntRef.f47716a + 1;
                                ref$IntRef.f47716a = i110;
                                if (i2 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                arrayList2.add(esc.m11331c(resultSentence2, i5, i110, z2));
                                i2 = i3;
                            }
                            u91.m22630w0(arrayList2, arrayList);
                            i = 0;
                        }
                        z = true;
                    } else {
                        z = true;
                        arrayList = EmptyList.f47638a;
                    }
                    this.f15511a = lessonEntity;
                    this.f15512b = 3;
                    if (abstractC1320h.mo7490G0(arrayList, this) != coroutineSingletons) {
                        resultLessonBookmark = resultLessonText.f21189w;
                        if (resultLessonBookmark != null) {
                            lessonBookmarkEntityM11329a = esc.m11329a(resultLessonBookmark, i5);
                            this.f15511a = lessonEntity;
                            this.f15512b = 4;
                            if (abstractC1320h.mo7489F0(lessonBookmarkEntityM11329a, this) != coroutineSingletons) {
                                c1321i = c1295k.f16501e;
                                this.f15511a = lessonEntity;
                                this.f15512b = 5;
                                if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                                    lessonEntity2 = lessonEntity;
                                    resultLessonSentencesTranslation = resultLessonText.f21192z;
                                    if (resultLessonSentencesTranslation != null) {
                                        obj2 = resultLessonSentencesTranslation.f21110b;
                                    } else {
                                        obj2 = th;
                                    }
                                    collection = (Collection) obj2;
                                    if (collection != null) {
                                        lessonSimplifiedOf = lessonEntity2.f17249E0;
                                        if (lessonSimplifiedOf != null) {
                                            return xfaVar;
                                        }
                                        String str37 = lessonSimplifiedOf.f19264a;
                                        Integer num8 = new Integer(lessonSimplifiedOf.f19266c);
                                        if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                            z3 = z;
                                        } else {
                                            z3 = z;
                                        }
                                        lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num8, z3);
                                        this.f15511a = th;
                                        this.f15512b = 7;
                                        if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                            return xfaVar;
                                        }
                                    } else {
                                        lessonSimplifiedOf = lessonEntity2.f17249E0;
                                        if (lessonSimplifiedOf != null) {
                                            return xfaVar;
                                        }
                                        String str38 = lessonSimplifiedOf.f19264a;
                                        Integer num9 = new Integer(lessonSimplifiedOf.f19266c);
                                        if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                            z3 = z;
                                        } else {
                                            z3 = z;
                                        }
                                        lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num9, z3);
                                        this.f15511a = th;
                                        this.f15512b = 7;
                                        if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                            return xfaVar;
                                        }
                                    }
                                }
                            }
                        } else {
                            c1321i = c1295k.f16501e;
                            this.f15511a = lessonEntity;
                            this.f15512b = 5;
                            if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                                lessonEntity2 = lessonEntity;
                                resultLessonSentencesTranslation = resultLessonText.f21192z;
                                if (resultLessonSentencesTranslation != null) {
                                    obj2 = resultLessonSentencesTranslation.f21110b;
                                } else {
                                    obj2 = th;
                                }
                                collection = (Collection) obj2;
                                if (collection != null) {
                                    lessonSimplifiedOf = lessonEntity2.f17249E0;
                                    if (lessonSimplifiedOf != null) {
                                        return xfaVar;
                                    }
                                    String str39 = lessonSimplifiedOf.f19264a;
                                    Integer num10 = new Integer(lessonSimplifiedOf.f19266c);
                                    if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                        z3 = z;
                                    } else {
                                        z3 = z;
                                    }
                                    lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num10, z3);
                                    this.f15511a = th;
                                    this.f15512b = 7;
                                    if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                } else {
                                    lessonSimplifiedOf = lessonEntity2.f17249E0;
                                    if (lessonSimplifiedOf != null) {
                                        return xfaVar;
                                    }
                                    String str310 = lessonSimplifiedOf.f19264a;
                                    Integer num11 = new Integer(lessonSimplifiedOf.f19266c);
                                    if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                        z3 = z;
                                    } else {
                                        z3 = z;
                                    }
                                    lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num11, z3);
                                    this.f15511a = th;
                                    this.f15512b = 7;
                                    if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                objM2861d = xfaVar;
                return coroutineSingletons;
            case 2:
                lessonEntity = this.f15511a;
                AbstractC3193b.m15359b(obj);
                xfaVar = xfaVar;
                th = null;
                i = 0;
                objM2861d = xfaVar;
                ref$IntRef = new Ref$IntRef();
                list = resultLessonText.f21188v;
                if (list != null) {
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        List list5 = ((d98) it.next()).f35220a;
                        arrayList2 = new ArrayList(v91.m23189q0(list5, 10));
                        i2 = i;
                        while (r11.hasNext()) {
                            i3 = i2 + 1;
                            if (i2 < 0) {
                                vz1.m23628e0();
                                throw th;
                            }
                            ResultSentence resultSentence3 = (ResultSentence) obj3;
                            int i111 = ref$IntRef.f47716a + 1;
                            ref$IntRef.f47716a = i111;
                            if (i2 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList2.add(esc.m11331c(resultSentence3, i5, i111, z2));
                            i2 = i3;
                        }
                        u91.m22630w0(arrayList2, arrayList);
                        i = 0;
                    }
                    z = true;
                } else {
                    z = true;
                    arrayList = EmptyList.f47638a;
                }
                this.f15511a = lessonEntity;
                this.f15512b = 3;
                if (abstractC1320h.mo7490G0(arrayList, this) != coroutineSingletons) {
                    resultLessonBookmark = resultLessonText.f21189w;
                    if (resultLessonBookmark != null) {
                        lessonBookmarkEntityM11329a = esc.m11329a(resultLessonBookmark, i5);
                        this.f15511a = lessonEntity;
                        this.f15512b = 4;
                        if (abstractC1320h.mo7489F0(lessonBookmarkEntityM11329a, this) != coroutineSingletons) {
                            c1321i = c1295k.f16501e;
                            this.f15511a = lessonEntity;
                            this.f15512b = 5;
                            if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                                lessonEntity2 = lessonEntity;
                                resultLessonSentencesTranslation = resultLessonText.f21192z;
                                if (resultLessonSentencesTranslation != null) {
                                    obj2 = resultLessonSentencesTranslation.f21110b;
                                } else {
                                    obj2 = th;
                                }
                                collection = (Collection) obj2;
                                if (collection != null) {
                                    lessonSimplifiedOf = lessonEntity2.f17249E0;
                                    if (lessonSimplifiedOf != null) {
                                        return xfaVar;
                                    }
                                    String str311 = lessonSimplifiedOf.f19264a;
                                    Integer num12 = new Integer(lessonSimplifiedOf.f19266c);
                                    if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                        z3 = z;
                                    } else {
                                        z3 = z;
                                    }
                                    lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num12, z3);
                                    this.f15511a = th;
                                    this.f15512b = 7;
                                    if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                } else {
                                    lessonSimplifiedOf = lessonEntity2.f17249E0;
                                    if (lessonSimplifiedOf != null) {
                                        return xfaVar;
                                    }
                                    String str312 = lessonSimplifiedOf.f19264a;
                                    Integer num13 = new Integer(lessonSimplifiedOf.f19266c);
                                    if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                        z3 = z;
                                    } else {
                                        z3 = z;
                                    }
                                    lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num13, z3);
                                    this.f15511a = th;
                                    this.f15512b = 7;
                                    if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    } else {
                        c1321i = c1295k.f16501e;
                        this.f15511a = lessonEntity;
                        this.f15512b = 5;
                        if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                            lessonEntity2 = lessonEntity;
                            resultLessonSentencesTranslation = resultLessonText.f21192z;
                            if (resultLessonSentencesTranslation != null) {
                                obj2 = resultLessonSentencesTranslation.f21110b;
                            } else {
                                obj2 = th;
                            }
                            collection = (Collection) obj2;
                            if (collection != null) {
                                lessonSimplifiedOf = lessonEntity2.f17249E0;
                                if (lessonSimplifiedOf != null) {
                                    return xfaVar;
                                }
                                String str313 = lessonSimplifiedOf.f19264a;
                                Integer num14 = new Integer(lessonSimplifiedOf.f19266c);
                                if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                    z3 = z;
                                } else {
                                    z3 = z;
                                }
                                lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num14, z3);
                                this.f15511a = th;
                                this.f15512b = 7;
                                if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            } else {
                                lessonSimplifiedOf = lessonEntity2.f17249E0;
                                if (lessonSimplifiedOf != null) {
                                    return xfaVar;
                                }
                                String str314 = lessonSimplifiedOf.f19264a;
                                Integer num15 = new Integer(lessonSimplifiedOf.f19266c);
                                if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                    z3 = z;
                                } else {
                                    z3 = z;
                                }
                                lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num15, z3);
                                this.f15511a = th;
                                this.f15512b = 7;
                                if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                objM2861d = xfaVar;
                return coroutineSingletons;
            case 3:
                lessonEntity = this.f15511a;
                AbstractC3193b.m15359b(obj);
                xfaVar = xfaVar;
                th = null;
                z = true;
                resultLessonBookmark = resultLessonText.f21189w;
                if (resultLessonBookmark != null) {
                    lessonBookmarkEntityM11329a = esc.m11329a(resultLessonBookmark, i5);
                    this.f15511a = lessonEntity;
                    this.f15512b = 4;
                    if (abstractC1320h.mo7489F0(lessonBookmarkEntityM11329a, this) != coroutineSingletons) {
                        c1321i = c1295k.f16501e;
                        this.f15511a = lessonEntity;
                        this.f15512b = 5;
                        if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                            lessonEntity2 = lessonEntity;
                            resultLessonSentencesTranslation = resultLessonText.f21192z;
                            if (resultLessonSentencesTranslation != null) {
                                obj2 = resultLessonSentencesTranslation.f21110b;
                            } else {
                                obj2 = th;
                            }
                            collection = (Collection) obj2;
                            if (collection != null) {
                                lessonSimplifiedOf = lessonEntity2.f17249E0;
                                if (lessonSimplifiedOf != null) {
                                    return xfaVar;
                                }
                                String str315 = lessonSimplifiedOf.f19264a;
                                Integer num16 = new Integer(lessonSimplifiedOf.f19266c);
                                if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                    z3 = z;
                                } else {
                                    z3 = z;
                                }
                                lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num16, z3);
                                this.f15511a = th;
                                this.f15512b = 7;
                                if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            } else {
                                lessonSimplifiedOf = lessonEntity2.f17249E0;
                                if (lessonSimplifiedOf != null) {
                                    return xfaVar;
                                }
                                String str316 = lessonSimplifiedOf.f19264a;
                                Integer num17 = new Integer(lessonSimplifiedOf.f19266c);
                                if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                    z3 = z;
                                } else {
                                    z3 = z;
                                }
                                lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num17, z3);
                                this.f15511a = th;
                                this.f15512b = 7;
                                if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                } else {
                    c1321i = c1295k.f16501e;
                    this.f15511a = lessonEntity;
                    this.f15512b = 5;
                    if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                        lessonEntity2 = lessonEntity;
                        resultLessonSentencesTranslation = resultLessonText.f21192z;
                        if (resultLessonSentencesTranslation != null) {
                            obj2 = resultLessonSentencesTranslation.f21110b;
                        } else {
                            obj2 = th;
                        }
                        collection = (Collection) obj2;
                        if (collection != null) {
                            lessonSimplifiedOf = lessonEntity2.f17249E0;
                            if (lessonSimplifiedOf != null) {
                                return xfaVar;
                            }
                            String str317 = lessonSimplifiedOf.f19264a;
                            Integer num18 = new Integer(lessonSimplifiedOf.f19266c);
                            if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                z3 = z;
                            } else {
                                z3 = z;
                            }
                            lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num18, z3);
                            this.f15511a = th;
                            this.f15512b = 7;
                            if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                return xfaVar;
                            }
                        } else {
                            lessonSimplifiedOf = lessonEntity2.f17249E0;
                            if (lessonSimplifiedOf != null) {
                                return xfaVar;
                            }
                            String str318 = lessonSimplifiedOf.f19264a;
                            Integer num19 = new Integer(lessonSimplifiedOf.f19266c);
                            if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                                z3 = z;
                            } else {
                                z3 = z;
                            }
                            lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num19, z3);
                            this.f15511a = th;
                            this.f15512b = 7;
                            if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    }
                }
                objM2861d = xfaVar;
                return coroutineSingletons;
            case 4:
                lessonEntity = this.f15511a;
                AbstractC3193b.m15359b(obj);
                xfaVar = xfaVar;
                th = null;
                z = true;
                c1321i = c1295k.f16501e;
                this.f15511a = lessonEntity;
                this.f15512b = 5;
                if (c1321i.m7511J0(i5, this) != coroutineSingletons) {
                    lessonEntity2 = lessonEntity;
                    resultLessonSentencesTranslation = resultLessonText.f21192z;
                    if (resultLessonSentencesTranslation != null) {
                        obj2 = resultLessonSentencesTranslation.f21110b;
                    } else {
                        obj2 = th;
                    }
                    collection = (Collection) obj2;
                    if (collection != null) {
                        lessonSimplifiedOf = lessonEntity2.f17249E0;
                        if (lessonSimplifiedOf != null) {
                            return xfaVar;
                        }
                        String str319 = lessonSimplifiedOf.f19264a;
                        Integer num110 = new Integer(lessonSimplifiedOf.f19266c);
                        if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num110, z3);
                        this.f15511a = th;
                        this.f15512b = 7;
                        if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    } else {
                        lessonSimplifiedOf = lessonEntity2.f17249E0;
                        if (lessonSimplifiedOf != null) {
                            return xfaVar;
                        }
                        String str3110 = lessonSimplifiedOf.f19264a;
                        Integer num111 = new Integer(lessonSimplifiedOf.f19266c);
                        if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num111, z3);
                        this.f15511a = th;
                        this.f15512b = 7;
                        if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                objM2861d = xfaVar;
                return coroutineSingletons;
            case 5:
                lessonEntity2 = this.f15511a;
                AbstractC3193b.m15359b(obj);
                xfaVar = xfaVar;
                th = null;
                z = true;
                resultLessonSentencesTranslation = resultLessonText.f21192z;
                if (resultLessonSentencesTranslation != null) {
                    obj2 = resultLessonSentencesTranslation.f21110b;
                } else {
                    obj2 = th;
                }
                collection = (Collection) obj2;
                if (collection != null) {
                    lessonSimplifiedOf = lessonEntity2.f17249E0;
                    if (lessonSimplifiedOf != null) {
                        return xfaVar;
                    }
                    String str3111 = lessonSimplifiedOf.f19264a;
                    Integer num112 = new Integer(lessonSimplifiedOf.f19266c);
                    if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                        z3 = z;
                    } else {
                        z3 = z;
                    }
                    lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num112, z3);
                    this.f15511a = th;
                    this.f15512b = 7;
                    if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                } else {
                    lessonSimplifiedOf = lessonEntity2.f17249E0;
                    if (lessonSimplifiedOf != null) {
                        return xfaVar;
                    }
                    String str3112 = lessonSimplifiedOf.f19264a;
                    Integer num113 = new Integer(lessonSimplifiedOf.f19266c);
                    if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                        z3 = z;
                    } else {
                        z3 = z;
                    }
                    lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num113, z3);
                    this.f15511a = th;
                    this.f15512b = 7;
                    if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                }
                objM2861d = xfaVar;
                return coroutineSingletons;
            case 6:
                lessonEntity2 = this.f15511a;
                AbstractC3193b.m15359b(obj);
                xfaVar = xfaVar;
                th = null;
                z = true;
                lessonSimplifiedOf = lessonEntity2.f17249E0;
                if (lessonSimplifiedOf != null) {
                    return xfaVar;
                }
                String str3113 = lessonSimplifiedOf.f19264a;
                Integer num114 = new Integer(lessonSimplifiedOf.f19266c);
                if (fa4.m11650l(lessonSimplifiedOf.f19265b, LessonProcessingStatus.AI.getValue())) {
                    z3 = z;
                } else {
                    z3 = z;
                }
                lessonsSimplifiedJoin = new LessonsSimplifiedJoin(i5, num114, z3);
                this.f15511a = th;
                this.f15512b = 7;
                if (abstractC1320h.mo7492I0(lessonsSimplifiedJoin, this) == coroutineSingletons) {
                    return xfaVar;
                }
                objM2861d = xfaVar;
                return coroutineSingletons;
            case 7:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
