package com.lingq.core.data.repository;

import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.CourseDeleteRoseWorker;
import com.lingq.core.data.workers.CourseGiveRoseWorker;
import com.lingq.core.data.workers.CourseSubscribeWorker;
import com.lingq.core.data.workers.CourseUnsubscribeWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.C1316d;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.network.api.result.ResultLibraryItem;
import com.lingq.core.network.api.result.ResultVocabularyCourse;
import com.lingq.core.network.api.result.Results;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c83;
import p000.h0a;
import p000.hi8;
import p000.io1;
import p000.jd0;
import p000.ld0;
import p000.lda;
import p000.md0;
import p000.od0;
import p000.pya;
import p000.rm5;
import p000.s91;
import p000.sm5;
import p000.t70;
import p000.tx6;
import p000.u85;
import p000.um5;
import p000.ux6;
import p000.v91;
import p000.xfa;
import p000.xj1;
import p000.xm5;
import p000.xo1;
import p000.yo1;
import p000.zj6;
import p000.zo1;

/* JADX INFO: renamed from: com.lingq.core.data.repository.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1290f implements xo1 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16473a;

    /* JADX INFO: renamed from: b */
    public final io1 f16474b;

    /* JADX INFO: renamed from: c */
    public final C1316d f16475c;

    /* JADX INFO: renamed from: d */
    public final C1321i f16476d;

    /* JADX INFO: renamed from: e */
    public final zo1 f16477e;

    /* JADX INFO: renamed from: f */
    public final od0 f16478f;

    /* JADX INFO: renamed from: g */
    public final C0773b f16479g;

    public C1290f(LingQDatabase lingQDatabase, io1 io1Var, C1316d c1316d, C1321i c1321i, zo1 zo1Var, od0 od0Var, C0773b c0773b) {
        lingQDatabase.getClass();
        io1Var.getClass();
        c1316d.getClass();
        c1321i.getClass();
        zo1Var.getClass();
        od0Var.getClass();
        c0773b.getClass();
        this.f16473a = lingQDatabase;
        this.f16474b = io1Var;
        this.f16475c = c1316d;
        this.f16476d = c1321i;
        this.f16477e = zo1Var;
        this.f16478f = od0Var;
        this.f16479g = c0773b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Serializable m7177a(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        CourseRepositoryImpl$fetchBookCourses$1 courseRepositoryImpl$fetchBookCourses$1;
        if (continuationImpl instanceof CourseRepositoryImpl$fetchBookCourses$1) {
            courseRepositoryImpl$fetchBookCourses$1 = (CourseRepositoryImpl$fetchBookCourses$1) continuationImpl;
            int i = courseRepositoryImpl$fetchBookCourses$1.f15029c;
            if ((i & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$fetchBookCourses$1.f15029c = i - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$fetchBookCourses$1 = new CourseRepositoryImpl$fetchBookCourses$1(this, continuationImpl);
            }
        } else {
            courseRepositoryImpl$fetchBookCourses$1 = new CourseRepositoryImpl$fetchBookCourses$1(this, continuationImpl);
        }
        CourseRepositoryImpl$fetchBookCourses$1 courseRepositoryImpl$fetchBookCourses$2 = courseRepositoryImpl$fetchBookCourses$1;
        Object objM25711f = courseRepositoryImpl$fetchBookCourses$2.f15027a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = courseRepositoryImpl$fetchBookCourses$2.f15029c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM25711f);
            courseRepositoryImpl$fetchBookCourses$2.f15029c = 1;
            objM25711f = this.f16477e.m25711f(str, str3, str2, 1, 100, courseRepositoryImpl$fetchBookCourses$2);
            if (objM25711f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM25711f);
        }
        List list = ((Results) objM25711f).f21739d;
        if (list == null) {
            return EmptyList.f47638a;
        }
        List<ResultVocabularyCourse> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (ResultVocabularyCourse resultVocabularyCourse : list2) {
            arrayList.add(new pya(resultVocabularyCourse.m8400a(), resultVocabularyCourse.m8401b()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[Catch: Exception -> 0x00a4, PHI: r2 r6 r13 r14
      0x0064: PHI (r2v3 java.util.List) = (r2v2 java.util.List), (r2v5 java.util.List) binds: [B:23:0x0061, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r6v2 java.lang.Object) = (r6v1 java.lang.Object), (r6v6 java.lang.Object) binds: [B:23:0x0061, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v4 java.lang.String) binds: [B:23:0x0061, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r14v5 int) = (r14v4 int), (r14v7 int) binds: [B:23:0x0061, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00a4, blocks: (B:13:0x002b, B:18:0x003e, B:25:0x0064, B:27:0x006a, B:28:0x0073, B:30:0x0079, B:31:0x008a, B:32:0x008c, B:34:0x0090, B:22:0x0050, B:35:0x0093, B:21:0x0049), top: B:41:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:13:0x002b, B:18:0x003e, B:25:0x0064, B:27:0x006a, B:28:0x0073, B:30:0x0079, B:31:0x008a, B:32:0x008c, B:34:0x0090, B:22:0x0050, B:35:0x0093, B:21:0x0049), top: B:41:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[Catch: Exception -> 0x00a4, LOOP:0: B:28:0x0073->B:30:0x0079, LOOP_END, TryCatch #0 {Exception -> 0x00a4, blocks: (B:13:0x002b, B:18:0x003e, B:25:0x0064, B:27:0x006a, B:28:0x0073, B:30:0x0079, B:31:0x008a, B:32:0x008c, B:34:0x0090, B:22:0x0050, B:35:0x0093, B:21:0x0049), top: B:41:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:13:0x002b, B:18:0x003e, B:25:0x0064, B:27:0x006a, B:28:0x0073, B:30:0x0079, B:31:0x008a, B:32:0x008c, B:34:0x0090, B:22:0x0050, B:35:0x0093, B:21:0x0049), top: B:41:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m7178b(java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.lingq.core.data.repository.CourseRepositoryImpl$fetchCollectionSubscriptions$1
            if (r0 == 0) goto L13
            r0 = r14
            com.lingq.core.data.repository.CourseRepositoryImpl$fetchCollectionSubscriptions$1 r0 = (com.lingq.core.data.repository.CourseRepositoryImpl$fetchCollectionSubscriptions$1) r0
            int r1 = r0.f15035f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15035f = r1
            goto L18
        L13:
            com.lingq.core.data.repository.CourseRepositoryImpl$fetchCollectionSubscriptions$1 r0 = new com.lingq.core.data.repository.CourseRepositoryImpl$fetchCollectionSubscriptions$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f15033d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f15035f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            java.util.List r12 = r0.f15031b
            java.util.List r12 = (java.util.List) r12
            kotlin.AbstractC3193b.m15359b(r14)     // Catch: java.lang.Exception -> La4
            goto La4
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r12)
            return r3
        L36:
            int r13 = r0.f15032c
            java.util.List r2 = r0.f15031b
            java.util.List r2 = (java.util.List) r2
            java.lang.String r6 = r0.f15030a
            kotlin.AbstractC3193b.m15359b(r14)     // Catch: java.lang.Exception -> La4
            r11 = r14
            r14 = r13
            r13 = r6
            r6 = r11
            goto L64
        L46:
            kotlin.AbstractC3193b.m15359b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Exception -> La4
            r14.<init>()     // Catch: java.lang.Exception -> La4
            r2 = r14
            r14 = r5
        L50:
            zo1 r6 = r12.f16477e     // Catch: java.lang.Exception -> La4
            r0.f15030a = r13     // Catch: java.lang.Exception -> La4
            r7 = r2
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> La4
            r0.f15031b = r7     // Catch: java.lang.Exception -> La4
            r0.f15032c = r14     // Catch: java.lang.Exception -> La4
            r0.f15035f = r5     // Catch: java.lang.Exception -> La4
            java.lang.Object r6 = r6.m25713h(r13, r14, r0)     // Catch: java.lang.Exception -> La4
            if (r6 != r1) goto L64
            goto La3
        L64:
            com.lingq.core.network.api.result.Results r6 = (com.lingq.core.network.api.result.Results) r6     // Catch: java.lang.Exception -> La4
            java.util.List r7 = r6.f21739d     // Catch: java.lang.Exception -> La4
            if (r7 == 0) goto L8c
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Exception -> La4
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> La4
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> La4
        L73:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Exception -> La4
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Exception -> La4
            com.lingq.core.network.api.result.ResultCollectionSubscription r9 = (com.lingq.core.network.api.result.ResultCollectionSubscription) r9     // Catch: java.lang.Exception -> La4
            s91 r10 = new s91     // Catch: java.lang.Exception -> La4
            int r9 = r9.f20783a     // Catch: java.lang.Exception -> La4
            r10.<init>(r9, r13)     // Catch: java.lang.Exception -> La4
            r8.add(r10)     // Catch: java.lang.Exception -> La4
            goto L73
        L8a:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> La4
        L8c:
            java.lang.String r6 = r6.f21737b     // Catch: java.lang.Exception -> La4
            if (r6 == 0) goto L93
            int r14 = r14 + 1
            goto L50
        L93:
            com.lingq.core.database.dao.d r12 = r12.f16475c     // Catch: java.lang.Exception -> La4
            r0.f15030a = r3     // Catch: java.lang.Exception -> La4
            r0.f15031b = r3     // Catch: java.lang.Exception -> La4
            r0.f15032c = r14     // Catch: java.lang.Exception -> La4
            r0.f15035f = r4     // Catch: java.lang.Exception -> La4
            java.lang.Object r12 = r12.m7466y0(r13, r2, r0)     // Catch: java.lang.Exception -> La4
            if (r12 != r1) goto La4
        La3:
            return r1
        La4:
            xfa r12 = p000.xfa.f68157a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1290f.m7178b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7179c(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        CourseRepositoryImpl$fetchCourse$1 courseRepositoryImpl$fetchCourse$1;
        ResultLibraryItem resultLibraryItem;
        ResultLibraryItem resultLibraryItem2;
        if (continuationImpl instanceof CourseRepositoryImpl$fetchCourse$1) {
            courseRepositoryImpl$fetchCourse$1 = (CourseRepositoryImpl$fetchCourse$1) continuationImpl;
            int i2 = courseRepositoryImpl$fetchCourse$1.f15040e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$fetchCourse$1.f15040e = i2 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$fetchCourse$1 = new CourseRepositoryImpl$fetchCourse$1(this, continuationImpl);
            }
        } else {
            courseRepositoryImpl$fetchCourse$1 = new CourseRepositoryImpl$fetchCourse$1(this, continuationImpl);
        }
        Object objM25706a = courseRepositoryImpl$fetchCourse$1.f15038c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = courseRepositoryImpl$fetchCourse$1.f15040e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM25706a);
            Integer num = new Integer(i);
            courseRepositoryImpl$fetchCourse$1.f15037b = i;
            courseRepositoryImpl$fetchCourse$1.f15040e = 1;
            objM25706a = this.f16477e.m25706a(str, num, courseRepositoryImpl$fetchCourse$1);
            if (objM25706a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = courseRepositoryImpl$fetchCourse$1.f15037b;
            AbstractC3193b.m15359b(objM25706a);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            resultLibraryItem2 = courseRepositoryImpl$fetchCourse$1.f15036a;
            AbstractC3193b.m15359b(objM25706a);
        }
        lda.m16122h(((Number) objM25706a).longValue());
        resultLibraryItem = resultLibraryItem2;
        return new Integer(resultLibraryItem != null ? 1 : 0);
        resultLibraryItem = (ResultLibraryItem) objM25706a;
        if (resultLibraryItem != null) {
            u85 u85VarM17121g0 = AbstractC3352my.m17121g0(resultLibraryItem, 0);
            courseRepositoryImpl$fetchCourse$1.f15036a = resultLibraryItem;
            courseRepositoryImpl$fetchCourse$1.f15037b = i;
            courseRepositoryImpl$fetchCourse$1.f15040e = 2;
            objM25706a = this.f16474b.mo4095v0(u85VarM17121g0, courseRepositoryImpl$fetchCourse$1);
            if (objM25706a != coroutineSingletons) {
                resultLibraryItem2 = resultLibraryItem;
                lda.m16122h(((Number) objM25706a).longValue());
                resultLibraryItem = resultLibraryItem2;
            }
            return coroutineSingletons;
        }
        return new Integer(resultLibraryItem != null ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m7180d(String str, ContinuationImpl continuationImpl) throws Throwable {
        CourseRepositoryImpl$fetchVocabularyCourses$1 courseRepositoryImpl$fetchVocabularyCourses$1;
        String str2;
        Results results;
        Results results2;
        List list;
        int size;
        if (continuationImpl instanceof CourseRepositoryImpl$fetchVocabularyCourses$1) {
            courseRepositoryImpl$fetchVocabularyCourses$1 = (CourseRepositoryImpl$fetchVocabularyCourses$1) continuationImpl;
            int i = courseRepositoryImpl$fetchVocabularyCourses$1.f15045e;
            if ((i & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$fetchVocabularyCourses$1.f15045e = i - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$fetchVocabularyCourses$1 = new CourseRepositoryImpl$fetchVocabularyCourses$1(this, continuationImpl);
            }
        } else {
            courseRepositoryImpl$fetchVocabularyCourses$1 = new CourseRepositoryImpl$fetchVocabularyCourses$1(this, continuationImpl);
        }
        CourseRepositoryImpl$fetchVocabularyCourses$1 courseRepositoryImpl$fetchVocabularyCourses$2 = courseRepositoryImpl$fetchVocabularyCourses$1;
        Object objM25708c = courseRepositoryImpl$fetchVocabularyCourses$2.f15043c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = courseRepositoryImpl$fetchVocabularyCourses$2.f15045e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM25708c);
            courseRepositoryImpl$fetchVocabularyCourses$2.f15041a = str;
            courseRepositoryImpl$fetchVocabularyCourses$2.f15045e = 1;
            objM25708c = this.f16477e.m25708c(str, 1, 50, "collection", "my_lessons", courseRepositoryImpl$fetchVocabularyCourses$2);
            if (objM25708c != coroutineSingletons) {
                str2 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = courseRepositoryImpl$fetchVocabularyCourses$2.f15041a;
            AbstractC3193b.m15359b(objM25708c);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            results2 = courseRepositoryImpl$fetchVocabularyCourses$2.f15042b;
            AbstractC3193b.m15359b(objM25708c);
        }
        results = results2;
        list = results.f21739d;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        return new Integer(size);
        results = (Results) objM25708c;
        List list2 = results.f21739d;
        if (list2 != null) {
            CourseRepositoryImpl$fetchVocabularyCourses$2$1 courseRepositoryImpl$fetchVocabularyCourses$2$1 = new CourseRepositoryImpl$fetchVocabularyCourses$2$1(list2, this, str2, null);
            courseRepositoryImpl$fetchVocabularyCourses$2.f15041a = null;
            courseRepositoryImpl$fetchVocabularyCourses$2.f15042b = results;
            courseRepositoryImpl$fetchVocabularyCourses$2.f15045e = 2;
            if (AbstractC0747e.m2849b(this.f16473a, courseRepositoryImpl$fetchVocabularyCourses$2$1, courseRepositoryImpl$fetchVocabularyCourses$2) != coroutineSingletons) {
                results2 = results;
                results = results2;
            }
            return coroutineSingletons;
        }
        list = results.f21739d;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        return new Integer(size);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[PHI: r8
      0x0068: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:23:0x0054, B:25:0x0065, B:17:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m7181e(String str, ContinuationImpl continuationImpl) throws Throwable {
        CourseRepositoryImpl$loadMyCourses$1 courseRepositoryImpl$loadMyCourses$1;
        Object objM2861d;
        if (continuationImpl instanceof CourseRepositoryImpl$loadMyCourses$1) {
            courseRepositoryImpl$loadMyCourses$1 = (CourseRepositoryImpl$loadMyCourses$1) continuationImpl;
            int i = courseRepositoryImpl$loadMyCourses$1.f15054d;
            if ((i & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$loadMyCourses$1.f15054d = i - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$loadMyCourses$1 = new CourseRepositoryImpl$loadMyCourses$1(this, continuationImpl);
            }
        } else {
            courseRepositoryImpl$loadMyCourses$1 = new CourseRepositoryImpl$loadMyCourses$1(this, continuationImpl);
        }
        Object objM25715j = courseRepositoryImpl$loadMyCourses$1.f15052b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = courseRepositoryImpl$loadMyCourses$1.f15054d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM25715j);
            courseRepositoryImpl$loadMyCourses$1.f15051a = str;
            courseRepositoryImpl$loadMyCourses$1.f15054d = 1;
            objM25715j = this.f16477e.m25715j(str, courseRepositoryImpl$loadMyCourses$1);
            if (objM25715j != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = courseRepositoryImpl$loadMyCourses$1.f15051a;
            AbstractC3193b.m15359b(objM25715j);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM25715j);
                    return objM25715j;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = courseRepositoryImpl$loadMyCourses$1.f15051a;
            AbstractC3193b.m15359b(objM25715j);
        }
        courseRepositoryImpl$loadMyCourses$1.f15051a = null;
        courseRepositoryImpl$loadMyCourses$1.f15054d = 3;
        objM2861d = AbstractC0758a.m2861d(new t70(str, 14), this.f16474b.f44343K, courseRepositoryImpl$loadMyCourses$1, true, false);
        if (objM2861d == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM2861d;
        List list = ((Results) objM25715j).f21739d;
        if (list != null) {
            CourseRepositoryImpl$loadMyCourses$2$1 courseRepositoryImpl$loadMyCourses$2$1 = new CourseRepositoryImpl$loadMyCourses$2$1(list, this, str, null);
            courseRepositoryImpl$loadMyCourses$1.f15051a = str;
            courseRepositoryImpl$loadMyCourses$1.f15054d = 2;
            if (AbstractC0747e.m2849b(this.f16473a, courseRepositoryImpl$loadMyCourses$2$1, courseRepositoryImpl$loadMyCourses$1) != coroutineSingletons) {
                courseRepositoryImpl$loadMyCourses$1.f15051a = null;
                courseRepositoryImpl$loadMyCourses$1.f15054d = 3;
                objM2861d = AbstractC0758a.m2861d(new t70(str, 14), this.f16474b.f44343K, courseRepositoryImpl$loadMyCourses$1, true, false);
                if (objM2861d == coroutineSingletons) {
                    return objM2861d;
                }
            }
        } else {
            courseRepositoryImpl$loadMyCourses$1.f15051a = null;
            courseRepositoryImpl$loadMyCourses$1.f15054d = 3;
            objM2861d = AbstractC0758a.m2861d(new t70(str, 14), this.f16474b.f44343K, courseRepositoryImpl$loadMyCourses$1, true, false);
            if (objM2861d == coroutineSingletons) {
                return objM2861d;
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: f */
    public final c83 m7182f(int i) {
        String value = LibraryItemType.Content.getValue();
        io1 io1Var = this.f16474b;
        io1Var.getClass();
        value.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(io1Var.f44343K, true, new String[]{"LibraryDataEntity", "CoursesAndLessonsJoin"}, new ld0(i, value, 5)));
    }

    /* JADX INFO: renamed from: g */
    public final c83 m7183g(String str) {
        str.getClass();
        C1316d c1316d = this.f16475c;
        c1316d.getClass();
        return AbstractC3224d.m15536o(new yo1(AbstractC3584sr.m21590A(c1316d.f17012K, false, new String[]{"CollectionSubscriptionEntity"}, new jd0(str, 4)), 0));
    }

    /* JADX INFO: renamed from: h */
    public final c83 m7184h(String str) {
        String value = LibraryItemType.Collection.getValue();
        io1 io1Var = this.f16474b;
        io1Var.getClass();
        str.getClass();
        value.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(io1Var.f44343K, true, new String[]{"LibraryDataEntity", "CoursesAndLanguageJoin"}, new md0(value, 9, str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7185i(String str, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        CourseRepositoryImpl$setArchived$1 courseRepositoryImpl$setArchived$1;
        if (continuationImpl instanceof CourseRepositoryImpl$setArchived$1) {
            courseRepositoryImpl$setArchived$1 = (CourseRepositoryImpl$setArchived$1) continuationImpl;
            int i2 = courseRepositoryImpl$setArchived$1.f15064c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$setArchived$1.f15064c = i2 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$setArchived$1 = new CourseRepositoryImpl$setArchived$1(this, continuationImpl);
            }
        } else {
            courseRepositoryImpl$setArchived$1 = new CourseRepositoryImpl$setArchived$1(this, continuationImpl);
        }
        Object objM25709d = courseRepositoryImpl$setArchived$1.f15062a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = courseRepositoryImpl$setArchived$1.f15064c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM25709d);
                zo1 zo1Var = this.f16477e;
                if (z) {
                    courseRepositoryImpl$setArchived$1.f15064c = 1;
                    objM25709d = zo1Var.m25707b(str, i, courseRepositoryImpl$setArchived$1);
                    if (objM25709d == coroutineSingletons) {
                    }
                } else {
                    courseRepositoryImpl$setArchived$1.f15064c = 2;
                    objM25709d = zo1Var.m25709d(str, i, courseRepositoryImpl$setArchived$1);
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                AbstractC3193b.m15359b(objM25709d);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM25709d);
            }
            return new xm5(xfa.f68157a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "CourseRepository: setArchived failed - " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e2 A[LOOP:1: B:30:0x00e0->B:31:0x00e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0165 A[LOOP:0: B:38:0x0163->B:39:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: j */
    public final Object m7186j(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        CourseRepositoryImpl$updateCourseLike$1 courseRepositoryImpl$updateCourseLike$1;
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        Pair[] pairArr;
        hi8 hi8Var;
        int i4;
        Pair[] pairArr2;
        hi8 hi8Var2;
        int i5;
        int i6 = i;
        if (continuationImpl instanceof CourseRepositoryImpl$updateCourseLike$1) {
            courseRepositoryImpl$updateCourseLike$1 = (CourseRepositoryImpl$updateCourseLike$1) continuationImpl;
            int i7 = courseRepositoryImpl$updateCourseLike$1.f15069e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$updateCourseLike$1.f15069e = i7 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$updateCourseLike$1 = new CourseRepositoryImpl$updateCourseLike$1(this, continuationImpl);
            }
        } else {
            courseRepositoryImpl$updateCourseLike$1 = new CourseRepositoryImpl$updateCourseLike$1(this, continuationImpl);
        }
        Object objM7506D0 = courseRepositoryImpl$updateCourseLike$1.f15067c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = courseRepositoryImpl$updateCourseLike$1.f15069e;
        C0773b c0773b = this.f16479g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C1321i c1321i = this.f16476d;
        if (i8 == 0) {
            AbstractC3193b.m15359b(objM7506D0);
            String value = LibraryItemType.Collection.getValue();
            str2 = str;
            courseRepositoryImpl$updateCourseLike$1.f15066b = str2;
            courseRepositoryImpl$updateCourseLike$1.f15065a = i6;
            courseRepositoryImpl$updateCourseLike$1.f15069e = 1;
            objM7506D0 = c1321i.m7506D0(i6, value, courseRepositoryImpl$updateCourseLike$1);
            if (objM7506D0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                i3 = courseRepositoryImpl$updateCourseLike$1.f15065a;
                str4 = courseRepositoryImpl$updateCourseLike$1.f15066b;
                AbstractC3193b.m15359b(objM7506D0);
                xj1 xj1Var = new xj1();
                xj1Var.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var = (tx6) ((tx6) new tx6(CourseDeleteRoseWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var.m24557a());
                pairArr = new Pair[]{new Pair("language", str4), new Pair("collectionId", Integer.valueOf(i3))};
                hi8Var = new hi8(10);
                for (i4 = 0; i4 < 2; i4++) {
                    Pair pair = pairArr[i4];
                    hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
                }
                c0773b.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
                return xfa.f68157a;
            }
            if (i8 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = courseRepositoryImpl$updateCourseLike$1.f15065a;
            str3 = courseRepositoryImpl$updateCourseLike$1.f15066b;
            AbstractC3193b.m15359b(objM7506D0);
            xj1 xj1Var2 = new xj1();
            xj1Var2.m24558b(NetworkType.CONNECTED);
            tx6 tx6Var2 = (tx6) ((tx6) new tx6(CourseGiveRoseWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var2.m24557a());
            pairArr2 = new Pair[]{new Pair("language", str3), new Pair("collectionId", Integer.valueOf(i2))};
            hi8Var2 = new hi8(10);
            for (i5 = 0; i5 < 2; i5++) {
                Pair pair2 = pairArr2[i5];
                hi8Var2.m13287x(pair2.f47624b, (String) pair2.f47623a);
            }
            c0773b.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var2.m13282k())).m15004a());
            return xfa.f68157a;
        }
        i6 = courseRepositoryImpl$updateCourseLike$1.f15065a;
        str2 = courseRepositoryImpl$updateCourseLike$1.f15066b;
        AbstractC3193b.m15359b(objM7506D0);
        LibraryCounterEntity libraryCounterEntity = (LibraryCounterEntity) objM7506D0;
        if (libraryCounterEntity != null) {
            int i9 = libraryCounterEntity.f17365i;
            if (libraryCounterEntity.f17359c) {
                LibraryCounterEntity libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity, false, null, null, false, i9 - 1, 261883);
                courseRepositoryImpl$updateCourseLike$1.f15066b = str2;
                courseRepositoryImpl$updateCourseLike$1.f15065a = i6;
                courseRepositoryImpl$updateCourseLike$1.f15069e = 2;
                if (c1321i.m7510I0(libraryCounterEntityM7760a, courseRepositoryImpl$updateCourseLike$1) != coroutineSingletons) {
                    i3 = i6;
                    str4 = str2;
                    xj1 xj1Var3 = new xj1();
                    xj1Var3.m24558b(NetworkType.CONNECTED);
                    tx6 tx6Var3 = (tx6) ((tx6) new tx6(CourseDeleteRoseWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var3.m24557a());
                    pairArr = new Pair[]{new Pair("language", str4), new Pair("collectionId", Integer.valueOf(i3))};
                    hi8Var = new hi8(10);
                    while (i4 < 2) {
                        Pair pair3 = pairArr[i4];
                        hi8Var.m13287x(pair3.f47624b, (String) pair3.f47623a);
                    }
                    c0773b.m2912a((ux6) ((tx6) tx6Var3.m15008g(hi8Var.m13282k())).m15004a());
                }
            } else {
                LibraryCounterEntity libraryCounterEntityM7760a2 = LibraryCounterEntity.m7760a(libraryCounterEntity, true, null, null, false, i9 + 1, 261883);
                courseRepositoryImpl$updateCourseLike$1.f15066b = str2;
                courseRepositoryImpl$updateCourseLike$1.f15065a = i6;
                courseRepositoryImpl$updateCourseLike$1.f15069e = 3;
                if (c1321i.m7510I0(libraryCounterEntityM7760a2, courseRepositoryImpl$updateCourseLike$1) != coroutineSingletons) {
                    i2 = i6;
                    str3 = str2;
                    xj1 xj1Var4 = new xj1();
                    xj1Var4.m24558b(NetworkType.CONNECTED);
                    tx6 tx6Var4 = (tx6) ((tx6) new tx6(CourseGiveRoseWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var4.m24557a());
                    pairArr2 = new Pair[]{new Pair("language", str3), new Pair("collectionId", Integer.valueOf(i2))};
                    hi8Var2 = new hi8(10);
                    while (i5 < 2) {
                        Pair pair4 = pairArr2[i5];
                        hi8Var2.m13287x(pair4.f47624b, (String) pair4.f47623a);
                    }
                    c0773b.m2912a((ux6) ((tx6) tx6Var4.m15008g(hi8Var2.m13282k())).m15004a());
                }
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00da A[LOOP:1: B:31:0x00d8->B:32:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0150 A[LOOP:0: B:40:0x014e->B:41:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: k */
    public final Object m7187k(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        CourseRepositoryImpl$updateCourseSubscription$1 courseRepositoryImpl$updateCourseSubscription$1;
        int i2;
        String str2;
        int i3;
        String str3;
        Pair[] pairArr;
        hi8 hi8Var;
        Pair[] pairArr2;
        hi8 hi8Var2;
        int i4 = i;
        String str4 = str;
        if (continuationImpl instanceof CourseRepositoryImpl$updateCourseSubscription$1) {
            courseRepositoryImpl$updateCourseSubscription$1 = (CourseRepositoryImpl$updateCourseSubscription$1) continuationImpl;
            int i5 = courseRepositoryImpl$updateCourseSubscription$1.f15074e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                courseRepositoryImpl$updateCourseSubscription$1.f15074e = i5 - Integer.MIN_VALUE;
            } else {
                courseRepositoryImpl$updateCourseSubscription$1 = new CourseRepositoryImpl$updateCourseSubscription$1(this, continuationImpl);
            }
        } else {
            courseRepositoryImpl$updateCourseSubscription$1 = new CourseRepositoryImpl$updateCourseSubscription$1(this, continuationImpl);
        }
        Object objM2861d = courseRepositoryImpl$updateCourseSubscription$1.f15072c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = courseRepositoryImpl$updateCourseSubscription$1.f15074e;
        C0773b c0773b = this.f16479g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xfa xfaVar = xfa.f68157a;
        C1316d c1316d = this.f16475c;
        int i7 = 3;
        int i8 = 0;
        if (i6 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            courseRepositoryImpl$updateCourseSubscription$1.f15071b = str4;
            courseRepositoryImpl$updateCourseSubscription$1.f15070a = i4;
            courseRepositoryImpl$updateCourseSubscription$1.f15074e = 1;
            objM2861d = AbstractC0758a.m2861d(new ld0(i4, str4, i7), c1316d.f17012K, courseRepositoryImpl$updateCourseSubscription$1, true, false);
            if (objM2861d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                i3 = courseRepositoryImpl$updateCourseSubscription$1.f15070a;
                str3 = courseRepositoryImpl$updateCourseSubscription$1.f15071b;
                AbstractC3193b.m15359b(objM2861d);
                xj1 xj1Var = new xj1();
                xj1Var.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var = (tx6) ((tx6) new tx6(CourseUnsubscribeWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var.m24557a());
                pairArr = new Pair[]{new Pair("language", str3), new Pair("collectionId", Integer.valueOf(i3))};
                hi8Var = new hi8(10);
                while (i8 < 2) {
                    Pair pair = pairArr[i8];
                    hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
                    i8++;
                }
                c0773b.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
                return xfaVar;
            }
            if (i6 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = courseRepositoryImpl$updateCourseSubscription$1.f15070a;
            str2 = courseRepositoryImpl$updateCourseSubscription$1.f15071b;
            AbstractC3193b.m15359b(objM2861d);
            xj1 xj1Var2 = new xj1();
            xj1Var2.m24558b(NetworkType.CONNECTED);
            tx6 tx6Var2 = (tx6) ((tx6) new tx6(CourseSubscribeWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var2.m24557a());
            pairArr2 = new Pair[]{new Pair("language", str2), new Pair("collectionId", Integer.valueOf(i2))};
            hi8Var2 = new hi8(10);
            while (i8 < 2) {
                Pair pair2 = pairArr2[i8];
                hi8Var2.m13287x(pair2.f47624b, (String) pair2.f47623a);
                i8++;
            }
            c0773b.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var2.m13282k())).m15004a());
            return xfaVar;
        }
        i4 = courseRepositoryImpl$updateCourseSubscription$1.f15070a;
        str4 = courseRepositoryImpl$updateCourseSubscription$1.f15071b;
        AbstractC3193b.m15359b(objM2861d);
        if (((Boolean) objM2861d).booleanValue()) {
            courseRepositoryImpl$updateCourseSubscription$1.f15071b = str4;
            courseRepositoryImpl$updateCourseSubscription$1.f15070a = i4;
            courseRepositoryImpl$updateCourseSubscription$1.f15074e = 2;
            Object objM2861d2 = AbstractC0758a.m2861d(new ld0(i4, str4, 4), c1316d.f17012K, courseRepositoryImpl$updateCourseSubscription$1, false, true);
            if (objM2861d2 != coroutineSingletons) {
                objM2861d2 = xfaVar;
            }
            if (objM2861d2 != coroutineSingletons) {
                i3 = i4;
                str3 = str4;
                xj1 xj1Var3 = new xj1();
                xj1Var3.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var3 = (tx6) ((tx6) new tx6(CourseUnsubscribeWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var3.m24557a());
                pairArr = new Pair[]{new Pair("language", str3), new Pair("collectionId", Integer.valueOf(i3))};
                hi8Var = new hi8(10);
                while (i8 < 2) {
                    Pair pair3 = pairArr[i8];
                    hi8Var.m13287x(pair3.f47624b, (String) pair3.f47623a);
                    i8++;
                }
                c0773b.m2912a((ux6) ((tx6) tx6Var3.m15008g(hi8Var.m13282k())).m15004a());
                return xfaVar;
            }
        } else {
            s91 s91Var = new s91(i4, str4);
            courseRepositoryImpl$updateCourseSubscription$1.f15071b = str4;
            courseRepositoryImpl$updateCourseSubscription$1.f15070a = i4;
            courseRepositoryImpl$updateCourseSubscription$1.f15074e = 3;
            if (c1316d.mo4095v0(s91Var, courseRepositoryImpl$updateCourseSubscription$1) != coroutineSingletons) {
                i2 = i4;
                str2 = str4;
                xj1 xj1Var4 = new xj1();
                xj1Var4.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var4 = (tx6) ((tx6) new tx6(CourseSubscribeWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, timeUnit)).m15006e(xj1Var4.m24557a());
                pairArr2 = new Pair[]{new Pair("language", str2), new Pair("collectionId", Integer.valueOf(i2))};
                hi8Var2 = new hi8(10);
                while (i8 < 2) {
                    Pair pair4 = pairArr2[i8];
                    hi8Var2.m13287x(pair4.f47624b, (String) pair4.f47623a);
                    i8++;
                }
                c0773b.m2912a((ux6) ((tx6) tx6Var4.m15008g(hi8Var2.m13282k())).m15004a());
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
