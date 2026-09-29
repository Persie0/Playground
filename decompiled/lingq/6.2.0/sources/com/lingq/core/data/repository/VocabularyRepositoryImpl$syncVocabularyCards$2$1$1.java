package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.AbstractC1323k;
import com.lingq.core.database.entity.CardsAndLOTDJoin;
import com.lingq.core.domain.model.status.CardExtendedStatus;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.domain.model.vocabulary.VocabularySort;
import com.lingq.core.network.api.result.ResultVocabularyCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.joda.time.DateTime;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.bq1;
import p000.c32;
import p000.cl9;
import p000.d32;
import p000.ei8;
import p000.fa4;
import p000.fd7;
import p000.gd7;
import p000.go1;
import p000.hy3;
import p000.hyc;
import p000.i05;
import p000.io1;
import p000.l05;
import p000.l75;
import p000.m05;
import p000.p33;
import p000.pxa;
import p000.q05;
import p000.q0b;
import p000.r3a;
import p000.rxa;
import p000.ux5;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.wq1;
import p000.xfa;
import p000.y7d;
import p000.zn1;
import p000.zuc;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl$syncVocabularyCards$2$1$1", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {310, 326, 329, 336, 337, 340, 341, 344, 348, 352}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyRepositoryImpl$syncVocabularyCards$2$1$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f16395H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Ref$ObjectRef f16396I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f16397J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean f16398K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ String f16399L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ int f16400M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ int f16401N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ int f16402O;

    /* JADX INFO: renamed from: a */
    public List f16403a;

    /* JADX INFO: renamed from: b */
    public List f16404b;

    /* JADX INFO: renamed from: c */
    public List f16405c;

    /* JADX INFO: renamed from: d */
    public List f16406d;

    /* JADX INFO: renamed from: e */
    public Locale f16407e;

    /* JADX INFO: renamed from: f */
    public Set f16408f;

    /* JADX INFO: renamed from: g */
    public ArrayList f16409g;

    /* JADX INFO: renamed from: h */
    public int f16410h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f16411i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f16412j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f16413k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1308x f16414l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(String str, List list, boolean z, C1308x c1308x, String str2, Ref$ObjectRef ref$ObjectRef, int i, boolean z2, String str3, int i2, int i3, int i4, Continuation continuation) {
        super(1, continuation);
        this.f16411i = str;
        this.f16412j = list;
        this.f16413k = z;
        this.f16414l = c1308x;
        this.f16395H = str2;
        this.f16396I = ref$ObjectRef;
        this.f16397J = i;
        this.f16398K = z2;
        this.f16399L = str3;
        this.f16400M = i2;
        this.f16401N = i3;
        this.f16402O = i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new VocabularyRepositoryImpl$syncVocabularyCards$2$1$1(this.f16411i, this.f16412j, this.f16413k, this.f16414l, this.f16395H, this.f16396I, this.f16397J, this.f16398K, this.f16399L, this.f16400M, this.f16401N, this.f16402O, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((VocabularyRepositoryImpl$syncVocabularyCards$2$1$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x05c9 A[PHI: r2 r3 r4 r5 r6 r7 r12 r14 r15 r16 r18 r19 r21 r23 r24 r26 r32
      0x05c9: PHI (r2v42 kotlin.coroutines.intrinsics.CoroutineSingletons) = 
      (r2v2 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r2v40 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r2v43 kotlin.coroutines.intrinsics.CoroutineSingletons)
     binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r3v31 com.lingq.core.database.dao.k) = (r3v1 com.lingq.core.database.dao.k), (r3v60 com.lingq.core.database.dao.k), (r3v32 com.lingq.core.database.dao.k) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r4v23 java.util.List) = (r4v80 java.util.List), (r4v81 java.util.List), (r4v82 java.util.List) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r5v16 java.util.Locale) = (r5v2 java.util.Locale), (r5v14 java.util.Locale), (r5v17 java.util.Locale) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r6v29 java.util.List) = (r6v1 java.util.List), (r6v26 java.util.List), (r6v31 java.util.List) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r7v15 java.lang.String) = (r7v2 java.lang.String), (r7v14 java.lang.String), (r7v16 java.lang.String) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r12v18 java.lang.String) = (r12v1 java.lang.String), (r12v16 java.lang.String), (r12v19 java.lang.String) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r14v19 java.util.List) = (r14v1 java.util.List), (r14v16 java.util.List), (r14v21 java.util.List) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r15v14 java.util.List) = (r15v1 java.util.List), (r15v11 java.util.List), (r15v16 java.util.List) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r16v3 java.util.Set) = (r16v0 java.util.Set), (r16v1 java.util.Set), (r16v4 java.util.Set) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r18v4 java.util.List) = (r18v0 java.util.List), (r18v1 java.util.List), (r18v6 java.util.List) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r19v10 java.lang.String) = (r19v3 java.lang.String), (r9v0 java.lang.String), (r19v12 java.lang.String) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r21v6 com.lingq.core.data.repository.x) = 
      (r21v1 com.lingq.core.data.repository.x)
      (r21v4 com.lingq.core.data.repository.x)
      (r21v7 com.lingq.core.data.repository.x)
     binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r23v4 xfa) = (r23v0 xfa), (r23v2 xfa), (r23v5 xfa) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r24v4 int) = (r24v0 int), (r24v2 int), (r24v5 int) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r26v4 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r26v0 kotlin.jvm.internal.Ref$ObjectRef)
      (r12v0 kotlin.jvm.internal.Ref$ObjectRef)
      (r26v5 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x05c9: PHI (r32v4 java.util.Set) = (r32v0 java.util.Set), (r32v2 java.util.Set), (r32v5 java.util.Set) binds: [B:152:0x05ce, B:149:0x05c5, B:15:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0627 A[PHI: r2 r3 r4 r5 r6 r7 r8 r12 r14 r15 r16 r18 r19 r21 r23 r26 r28
      0x0627: PHI (r2v44 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r2v42 kotlin.coroutines.intrinsics.CoroutineSingletons), (r2v45 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r3v33 com.lingq.core.database.dao.k) = (r3v59 com.lingq.core.database.dao.k), (r3v34 com.lingq.core.database.dao.k) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r4v29 java.util.Set) = (r4v24 java.util.Set), (r4v46 java.util.Set) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r5v18 java.util.Locale) = (r5v16 java.util.Locale), (r5v19 java.util.Locale) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r6v32 java.util.List) = (r6v29 java.util.List), (r6v34 java.util.List) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r7v17 java.lang.String) = (r7v15 java.lang.String), (r7v20 java.lang.String) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r8v40 java.lang.Object) = (r8v39 java.lang.Object), (r8v50 java.lang.Object) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r12v20 java.lang.String) = (r12v18 java.lang.String), (r12v21 java.lang.String) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r14v22 java.util.List) = (r14v19 java.util.List), (r14v25 java.util.List) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r15v17 java.util.List) = (r15v14 java.util.List), (r15v20 java.util.List) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r16v5 java.util.Set) = (r16v3 java.util.Set), (r16v6 java.util.Set) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r18v7 java.util.List) = (r18v4 java.util.List), (r18v9 java.util.List) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r19v13 java.lang.String) = (r19v10 java.lang.String), (r19v14 java.lang.String) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r21v8 com.lingq.core.data.repository.x) = (r21v6 com.lingq.core.data.repository.x), (r21v9 com.lingq.core.data.repository.x) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r23v6 xfa) = (r23v4 xfa), (r23v7 xfa) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r26v6 kotlin.jvm.internal.Ref$ObjectRef) = (r26v4 kotlin.jvm.internal.Ref$ObjectRef), (r26v7 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r28v2 java.util.List) = (r28v4 java.util.List), (r28v3 java.util.List) binds: [B:154:0x0623, B:14:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x063a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0651  */
    /* JADX WARN: Code duplicated, block: B:167:0x0699  */
    /* JADX WARN: Code duplicated, block: B:170:0x069f  */
    /* JADX WARN: Code duplicated, block: B:174:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:177:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:180:0x0700  */
    /* JADX WARN: Code duplicated, block: B:184:0x0726 A[PHI: r2 r3 r4 r5 r6 r7 r9 r12 r14 r18 r21 r23 r26
      0x0726: PHI (r2v51 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r2v48 kotlin.coroutines.intrinsics.CoroutineSingletons), (r2v52 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r3v40 bq1) = (r3v54 bq1), (r3v41 bq1) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r4v57 java.util.Locale) = (r4v52 java.util.Locale), (r4v60 java.util.Locale) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r5v29 ??) = (r5v25 ??), (r5v35 ??) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r6v45 java.util.List) = (r6v40 java.util.List), (r6v47 java.util.List) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r7v30 java.lang.String) = (r7v25 java.lang.String), (r7v33 java.lang.String) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r9v16 java.util.List) = (r9v12 java.util.List), (r9v19 java.util.List) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r12v27 java.lang.String) = (r12v24 java.lang.String), (r12v28 java.lang.String) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r14v32 java.util.List) = (r14v30 java.util.List), (r14v33 java.util.List) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r18v17 java.util.List) = (r18v14 java.util.List), (r18v18 java.util.List) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r21v15 com.lingq.core.data.repository.x) = (r21v12 com.lingq.core.data.repository.x), (r21v16 com.lingq.core.data.repository.x) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r23v13 xfa) = (r23v10 xfa), (r23v14 xfa) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0726: PHI (r26v13 kotlin.jvm.internal.Ref$ObjectRef) = (r26v10 kotlin.jvm.internal.Ref$ObjectRef), (r26v14 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:182:0x0722, B:11:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x0752  */
    /* JADX WARN: Code duplicated, block: B:190:0x0758  */
    /* JADX WARN: Code duplicated, block: B:193:0x0764  */
    /* JADX WARN: Code duplicated, block: B:196:0x0790  */
    /* JADX WARN: Code duplicated, block: B:199:0x0796  */
    /* JADX WARN: Code duplicated, block: B:202:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:205:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:208:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:210:0x07d3 A[DONT_INVERT, PHI: r2 r3 r4 r7 r12 r18 r23
      0x07d3: PHI (r2v58 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r2v55 kotlin.coroutines.intrinsics.CoroutineSingletons), (r2v59 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:201:0x07a0, B:209:0x07d2] A[DONT_GENERATE, DONT_INLINE]
      0x07d3: PHI (r3v46 bq1) = (r3v51 bq1), (r3v52 bq1) binds: [B:201:0x07a0, B:209:0x07d2] A[DONT_GENERATE, DONT_INLINE]
      0x07d3: PHI (r4v69 java.util.Locale) = (r4v65 java.util.Locale), (r4v71 java.util.Locale) binds: [B:201:0x07a0, B:209:0x07d2] A[DONT_GENERATE, DONT_INLINE]
      0x07d3: PHI (r7v46 java.lang.String) = (r7v38 java.lang.String), (r7v47 java.lang.String) binds: [B:201:0x07a0, B:209:0x07d2] A[DONT_GENERATE, DONT_INLINE]
      0x07d3: PHI (r12v33 java.lang.String) = (r12v31 java.lang.String), (r12v34 java.lang.String) binds: [B:201:0x07a0, B:209:0x07d2] A[DONT_GENERATE, DONT_INLINE]
      0x07d3: PHI (r18v23 java.util.List) = (r18v21 java.util.List), (r18v24 java.util.List) binds: [B:201:0x07a0, B:209:0x07d2] A[DONT_GENERATE, DONT_INLINE]
      0x07d3: PHI (r23v19 xfa) = (r23v17 xfa), (r23v20 xfa) binds: [B:201:0x07a0, B:209:0x07d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:217:0x07f5 A[LOOP:0: B:215:0x07ef->B:217:0x07f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x0836  */
    /* JADX WARN: Code duplicated, block: B:226:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0634 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.ArrayList, java.util.List, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v35 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set set;
        List list;
        C1308x c1308x;
        AbstractC1323k abstractC1323k;
        int i;
        xfa xfaVar;
        CoroutineSingletons coroutineSingletons;
        Set set2;
        String str;
        AbstractC1323k abstractC1323k2;
        String str2;
        List list2;
        List list3;
        List list4;
        Locale locale;
        String str3;
        String str4;
        String strM24123s;
        String strM24118n;
        String strM24118n2;
        ArrayList arrayList;
        String str5;
        Object objM2861d;
        List list5;
        Object objM7516y0;
        List list6;
        Set set3;
        Object objM2861d2;
        List list7;
        AbstractC1323k abstractC1323k3;
        ArrayList arrayList2;
        Locale locale2;
        List list8;
        String str6;
        Object objM2861d3;
        ArrayList arrayList3;
        List list9;
        AbstractC1323k abstractC1323k4;
        Object objM2861d4;
        List list10;
        List list11;
        bq1 bq1Var;
        List list12;
        ?? r5;
        Object objMo4096w0;
        List list13;
        AbstractC1323k abstractC1323k5;
        bq1 bq1Var2;
        Object objM2861d5;
        Ref$ObjectRef ref$ObjectRef;
        bq1 bq1Var3;
        C1308x c1308x2;
        Object objM2861d6;
        Object objM2861d7;
        Locale locale3;
        bq1 bq1Var4;
        ArrayList arrayList4;
        Iterator it;
        Object objM2861d8;
        bq1 bq1Var5;
        C1308x c1308x3 = this.f16414l;
        AbstractC1323k abstractC1323k6 = c1308x3.f16569b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f16410h;
        int i3 = this.f16401N;
        List list14 = this.f16412j;
        String str7 = ")";
        String str8 = this.f16399L;
        String str9 = this.f16411i;
        Ref$ObjectRef ref$ObjectRef2 = this.f16396I;
        xfa xfaVar2 = xfa.f68157a;
        switch (i2) {
            case 0:
                set = null;
                AbstractC3193b.m15359b(obj);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                Locale localeForLanguageTag = Locale.forLanguageTag(str9);
                list = list14;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i4 = 0;
                for (Object obj2 : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    xfa xfaVar3 = xfaVar2;
                    ResultVocabularyCard resultVocabularyCard = (ResultVocabularyCard) obj2;
                    C1308x c1308x4 = c1308x3;
                    String str10 = resultVocabularyCard.f21675a;
                    localeForLanguageTag.getClass();
                    String strM23629f = vz1.m23629f(str9, vz1.m23610P(str10, localeForLanguageTag));
                    linkedHashSet.add(strM23629f);
                    int i6 = i3;
                    AbstractC1323k abstractC1323k7 = abstractC1323k6;
                    arrayList5.add(zuc.m25805m(resultVocabularyCard, strM23629f, y7d.m24985d(resultVocabularyCard.f21675a), resultVocabularyCard.f21685k));
                    arrayList6.add(new q0b(strM23629f, i6 + i4));
                    Object obj3 = ((VocabularySearchQuery) ref$ObjectRef2.f47718a).f19867i.f47624b;
                    if (obj3 != null) {
                        Integer num = (Integer) obj3;
                        arrayList7.add(new zn1(num != null ? num.intValue() : 0, strM23629f));
                    }
                    Object obj4 = ((VocabularySearchQuery) ref$ObjectRef2.f47718a).f19868j.f47624b;
                    if (obj4 != null) {
                        Integer num2 = (Integer) obj4;
                        arrayList8.add(new l75(num2 != null ? num2.intValue() : 0, strM23629f));
                    }
                    c1308x3 = c1308x4;
                    i4 = i5;
                    xfaVar2 = xfaVar3;
                    i3 = i6;
                    abstractC1323k6 = abstractC1323k7;
                }
                c1308x = c1308x3;
                abstractC1323k = abstractC1323k6;
                i = i3;
                xfaVar = xfaVar2;
                boolean z = this.f16413k;
                if (z) {
                    String string = vk9.m23376L0(this.f16395H).toString();
                    VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) ref$ObjectRef2.f47718a;
                    int i7 = vocabularySearchQuery.f19859a;
                    int i8 = vocabularySearchQuery.f19860b;
                    String roomColumnName = vocabularySearchQuery.f19863e.getRoomColumnName();
                    String columnName = ((VocabularySearchQuery) ref$ObjectRef2.f47718a).f19861c.getColumnName();
                    VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) ref$ObjectRef2.f47718a;
                    Integer num3 = (Integer) vocabularySearchQuery2.f19867i.f47624b;
                    Integer num4 = (Integer) vocabularySearchQuery2.f19868j.f47624b;
                    List list15 = vocabularySearchQuery2.f19865g;
                    int i9 = this.f16397J - 1;
                    this.f16403a = arrayList5;
                    this.f16404b = arrayList6;
                    this.f16405c = arrayList7;
                    this.f16406d = arrayList8;
                    this.f16407e = localeForLanguageTag;
                    this.f16408f = linkedHashSet;
                    this.f16410h = 1;
                    abstractC1323k.getClass();
                    String strM4839V = cl9.m4839V(string, "'", "''");
                    String strM14766a = (str8 == null || vk9.m23391n0(str8)) ? hy3.f43148E.m14766a(new DateTime()) : str8;
                    ArrayList arrayList9 = new ArrayList();
                    set2 = linkedHashSet;
                    String str11 = fa4.m11650l(roomColumnName, VocabularySort.AtoZ.getRoomColumnName()) ? "LEFT JOIN VocabularyOrderEntity ON CardEntity.termWithLanguage = VocabularyOrderEntity.termWithLanguage" : "";
                    String str12 = num3 != null ? ",CourseAndCardsJoin" : "";
                    String str13 = num4 != null ? ",LessonsAndCardsJoin" : "";
                    String str14 = (str8 == null || vk9.m23391n0(str8)) ? "" : ",CardsAndLOTDJoin";
                    CardStatus cardStatus = CardStatus.Known;
                    String str15 = str13;
                    if (i7 == cardStatus.getValue()) {
                        str3 = str14;
                        strM24123s = ux5.m22987j(CardStatus.Learned.getValue(), CardExtendedStatus.Known.getValue(), "AND (CardEntity.status == ", " AND CardEntity.extendedStatus == ", ")");
                        str4 = str11;
                    } else {
                        str3 = str14;
                        int value = cardStatus.getValue();
                        str4 = str11;
                        strM24123s = i8 == value ? wq1.m24123s(ux5.m22994q(i7, i8, "AND (CardEntity.status BETWEEN ", " AND ", " OR CardEntity.extendedStatus == "), CardExtendedStatus.Known.getValue(), ")") : wq1.m24123s(ux5.m22994q(i7, i8, "AND (CardEntity.status BETWEEN ", " AND ", " AND (CardEntity.extendedStatus = "), CardExtendedStatus.NotKnown.getValue(), " OR CardEntity.extendedStatus is null))");
                    }
                    if (strM4839V.length() <= 0) {
                        strM24118n = "";
                    } else if (fa4.m11650l(columnName, VocabularySearch.MeaningContaining.getColumnName())) {
                        strM24118n = wq1.m24118n("AND CardEntity.meaningTerms LIKE '%", strM4839V, "%'");
                    } else if (fa4.m11650l(columnName, VocabularySearch.StartsWith.getColumnName())) {
                        strM24118n = wq1.m24118n("AND CardEntity.term LIKE '", strM4839V, "%'");
                    } else if (fa4.m11650l(columnName, VocabularySearch.EndsWith.getColumnName())) {
                        strM24118n = wq1.m24118n("AND CardEntity.term LIKE '%", strM4839V, "'");
                    } else {
                        strM24118n = fa4.m11650l(columnName, VocabularySearch.PhraseContaining.getColumnName()) ? wq1.m24118n("AND CardEntity.fragment LIKE '%", strM4839V, "%'") : wq1.m24118n("AND CardEntity.term LIKE '%", strM4839V, "%'");
                    }
                    String str16 = this.f16398K ? "AND CardEntity.isPhrase = 1" : "";
                    if (z && (str8 == null || vk9.m23391n0(str8))) {
                        arrayList9.add(strM14766a);
                        strM24118n2 = "AND DATETIME(CardEntity.srsDueDate) <= DATETIME(?)";
                    } else {
                        strM24118n2 = (str8 == null || vk9.m23391n0(str8)) ? "" : wq1.m24118n("AND CardEntity.termWithLanguage = CardsAndLOTDJoin.termWithLanguage AND CardsAndLOTDJoin.lotd = \"", str8, "\"");
                    }
                    String str17 = num3 != null ? "AND CardEntity.termWithLanguage = CourseAndCardsJoin.termWithLanguage AND CourseAndCardsJoin.pk = " + num3 : "";
                    String str18 = num4 != null ? "AND CardEntity.termWithLanguage = LessonsAndCardsJoin.termWithLanguage AND LessonsAndCardsJoin.contentId = " + num4 : "";
                    List list16 = list15;
                    if (list16 == null || list16.isEmpty()) {
                        arrayList = arrayList9;
                        str5 = "";
                    } else {
                        Iterator it2 = list15.iterator();
                        str5 = "";
                        int i10 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                vz1.m23628e0();
                                throw null;
                            }
                            Iterator it3 = it2;
                            str5 = ((Object) str5) + (i10 == 0 ? "AND (" : "") + " CardEntity.tags LIKE '%" + ((String) next) + "%' " + ((i10 == vz1.m23602H(list15) || list15.size() <= 1) ? ")" : " OR ");
                            arrayList9 = arrayList9;
                            i10 = i11;
                            it2 = it3;
                        }
                        arrayList = arrayList9;
                    }
                    String strM24118n3 = (fa4.m11650l(roomColumnName, VocabularySort.Importance.getRoomColumnName()) || fa4.m11650l(roomColumnName, VocabularySort.CreationDate.getRoomColumnName())) ? wq1.m24118n("ORDER BY ", roomColumnName, " DESC") : fa4.m11650l(roomColumnName, VocabularySort.Status.getRoomColumnName()) ? "ORDER BY CardEntity.status ASC,CardEntity.importance DESC, CardEntity.term" : "ORDER BY CASE WHEN VocabularyOrderEntity.sortPosition IS NOT NULL THEN 0 ELSE 1 END, VocabularyOrderEntity.sortPosition ASC, CardEntity.term ASC";
                    int i12 = this.f16400M;
                    StringBuilder sbM23000w = ux5.m23000w("\n        SELECT CardEntity.id FROM CardEntity\n        ", str4, "\n        ", str12, "\n        ");
                    AbstractC3393o1.m17725C(sbM23000w, str15, "\n        ", str3, "\n        WHERE CardEntity.termWithLanguage LIKE '");
                    str2 = str9;
                    AbstractC3393o1.m17725C(sbM23000w, str2, "' || '\\_%' ESCAPE '\\'\n        ", strM24123s, "\n        ");
                    AbstractC3393o1.m17725C(sbM23000w, strM24118n, "\n        ", str16, "\n        ");
                    AbstractC3393o1.m17725C(sbM23000w, strM24118n2, "\n    ", str17, "\n    ");
                    AbstractC3393o1.m17725C(sbM23000w, str18, "\n    ", str5, "\n        ");
                    AbstractC3393o1.m17748w(i12, strM24118n3, "\n        LIMIT ", " OFFSET ", sbM23000w);
                    p33 p33Var = new p33(20, wq1.m24123s(sbM23000w, i9 * i12, "\n    "), arrayList.toArray());
                    TreeMap treeMap = ei8.f37291h;
                    p33 p33VarM11161a = hyc.m13591a(p33Var).m11161a();
                    objM2861d = AbstractC0758a.m2861d(new gd7((String) p33VarM11161a.f55513b, p33VarM11161a, 2), ((rxa) abstractC1323k).f60013K, this, true, true);
                    coroutineSingletons = coroutineSingletons2;
                    if (objM2861d != coroutineSingletons) {
                        list5 = arrayList5;
                        list2 = arrayList6;
                        list3 = arrayList7;
                        list4 = arrayList8;
                        locale = localeForLanguageTag;
                        this.f16403a = list5;
                        this.f16404b = list2;
                        this.f16405c = list3;
                        this.f16406d = list4;
                        this.f16407e = locale;
                        this.f16408f = set2;
                        this.f16410h = 2;
                        AbstractC1323k abstractC1323k8 = abstractC1323k;
                        str = str8;
                        objM7516y0 = abstractC1323k8.m7516y0(str, (List) objM2861d, this);
                        abstractC1323k2 = abstractC1323k8;
                        list6 = list5;
                        if (objM7516y0 != coroutineSingletons) {
                            List list17 = list6;
                            set3 = set2;
                            String strM22990m = ux5.m22990m(str2, "\\_%");
                            this.f16403a = list17;
                            this.f16404b = list2;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale;
                            this.f16408f = set3;
                            this.f16410h = 3;
                            objM2861d2 = AbstractC0758a.m2861d(new fd7(strM22990m, i, this.f16402O), ((rxa) abstractC1323k2).f60013K, this, true, false);
                            abstractC1323k3 = abstractC1323k2;
                            list7 = list17;
                            if (objM2861d2 != coroutineSingletons) {
                                arrayList2 = new ArrayList();
                                for (Object obj5 : (List) objM2861d2) {
                                    if (!set3.contains((String) obj5)) {
                                        arrayList2.add(obj5);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    locale2 = locale;
                                    list8 = list7;
                                    bq1Var = abstractC1323k3;
                                    list12 = list2;
                                    r5 = 0;
                                    this.f16403a = null;
                                    this.f16404b = list12;
                                    this.f16405c = list3;
                                    this.f16406d = list4;
                                    this.f16407e = locale2;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 6;
                                    objMo4096w0 = bq1Var.mo4096w0(list8, this);
                                    bq1Var2 = bq1Var;
                                    if (objMo4096w0 != coroutineSingletons) {
                                        this.f16403a = r5;
                                        this.f16404b = r5;
                                        this.f16405c = list3;
                                        this.f16406d = list4;
                                        this.f16407e = locale2;
                                        this.f16408f = r5;
                                        this.f16409g = r5;
                                        this.f16410h = 7;
                                        rxa rxaVar = (rxa) bq1Var2;
                                        objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar, list12, 1), rxaVar.f60013K, this, false, true);
                                        if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d5 = xfaVar;
                                        }
                                        if (objM2861d5 != coroutineSingletons) {
                                            ref$ObjectRef = ref$ObjectRef2;
                                            bq1Var3 = bq1Var2;
                                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                                c1308x2 = c1308x;
                                                io1 io1Var = c1308x2.f16570c;
                                                this.f16403a = null;
                                                this.f16404b = null;
                                                this.f16405c = null;
                                                this.f16406d = list4;
                                                this.f16407e = locale2;
                                                this.f16408f = null;
                                                this.f16409g = null;
                                                this.f16410h = 8;
                                                objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var, list3, 1), io1Var.f44343K, this, false, true);
                                                if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                    objM2861d6 = xfaVar;
                                                }
                                                if (objM2861d6 != coroutineSingletons) {
                                                }
                                            } else {
                                                c1308x2 = c1308x;
                                            }
                                            bq1Var4 = bq1Var3;
                                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                                if (str != null) {
                                                    List list18 = list;
                                                    int i13 = 10;
                                                    arrayList4 = new ArrayList(v91.m23189q0(list18, 10));
                                                    it = list18.iterator();
                                                    while (it.hasNext()) {
                                                        String str19 = ((ResultVocabularyCard) it.next()).f21675a;
                                                        locale2.getClass();
                                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str19, locale2)), str));
                                                    }
                                                    this.f16403a = null;
                                                    this.f16404b = null;
                                                    this.f16405c = null;
                                                    this.f16406d = null;
                                                    this.f16407e = null;
                                                    this.f16408f = null;
                                                    this.f16409g = null;
                                                    this.f16410h = 10;
                                                    rxa rxaVar2 = (rxa) bq1Var4;
                                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i13, rxaVar2, arrayList4), rxaVar2.f60013K, this, false, true);
                                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM2861d8 = xfaVar;
                                                    }
                                                    if (objM2861d8 == coroutineSingletons) {
                                                    }
                                                }
                                                return xfaVar;
                                            }
                                            AbstractC1320h abstractC1320h = c1308x2.f16571d;
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = locale2;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 9;
                                            q05 q05Var = (q05) abstractC1320h;
                                            objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var, list4, 6), q05Var.f57071K, this, false, true);
                                            if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d7 = xfaVar;
                                            }
                                            if (objM2861d7 != coroutineSingletons) {
                                                locale3 = locale2;
                                                bq1Var5 = bq1Var3;
                                                locale2 = locale3;
                                                bq1Var4 = bq1Var5;
                                                if (str != null) {
                                                    List list19 = list;
                                                    int i14 = 10;
                                                    arrayList4 = new ArrayList(v91.m23189q0(list19, 10));
                                                    it = list19.iterator();
                                                    while (it.hasNext()) {
                                                        String str110 = ((ResultVocabularyCard) it.next()).f21675a;
                                                        locale2.getClass();
                                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str110, locale2)), str));
                                                    }
                                                    this.f16403a = null;
                                                    this.f16404b = null;
                                                    this.f16405c = null;
                                                    this.f16406d = null;
                                                    this.f16407e = null;
                                                    this.f16408f = null;
                                                    this.f16409g = null;
                                                    this.f16410h = 10;
                                                    rxa rxaVar3 = (rxa) bq1Var4;
                                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i14, rxaVar3, arrayList4), rxaVar3.f60013K, this, false, true);
                                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM2861d8 = xfaVar;
                                                    }
                                                    if (objM2861d8 == coroutineSingletons) {
                                                    }
                                                }
                                                return xfaVar;
                                            }
                                        }
                                    }
                                } else {
                                    this.f16403a = list7;
                                    this.f16404b = list2;
                                    this.f16405c = list3;
                                    this.f16406d = list4;
                                    this.f16407e = locale;
                                    this.f16408f = set;
                                    this.f16409g = arrayList2;
                                    this.f16410h = 4;
                                    rxa rxaVar4 = (rxa) abstractC1323k3;
                                    rxaVar4.getClass();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("DELETE FROM CardEntity WHERE termWithLanguage IN (");
                                    str6 = str7;
                                    objM2861d3 = AbstractC0758a.m2861d(new m05(4, AbstractC3393o1.m17736k(str6, sb, arrayList2), arrayList2), rxaVar4.f60013K, this, false, true);
                                    if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d3 = xfaVar;
                                    }
                                    if (objM2861d3 != coroutineSingletons) {
                                        arrayList3 = arrayList2;
                                        list9 = list7;
                                        abstractC1323k4 = abstractC1323k3;
                                        this.f16403a = list9;
                                        this.f16404b = list2;
                                        this.f16405c = list3;
                                        this.f16406d = list4;
                                        this.f16407e = locale;
                                        this.f16408f = null;
                                        this.f16409g = null;
                                        this.f16410h = 5;
                                        rxa rxaVar5 = (rxa) abstractC1323k4;
                                        rxaVar5.getClass();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("DELETE FROM VocabularyOrderEntity WHERE termWithLanguage IN (");
                                        d32.m10005B(arrayList3.size(), sb2);
                                        sb2.append(str6);
                                        objM2861d4 = AbstractC0758a.m2861d(new l05(2, sb2.toString(), arrayList3), rxaVar5.f60013K, this, false, true);
                                        if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d4 = xfaVar;
                                        }
                                        if (objM2861d4 != coroutineSingletons) {
                                            locale2 = locale;
                                            list10 = list4;
                                            list11 = list3;
                                            abstractC1323k5 = abstractC1323k4;
                                            list13 = list9;
                                            list3 = list11;
                                            list8 = list13;
                                            list4 = list10;
                                            bq1Var = abstractC1323k5;
                                            list12 = list2;
                                            r5 = 0;
                                            this.f16403a = null;
                                            this.f16404b = list12;
                                            this.f16405c = list3;
                                            this.f16406d = list4;
                                            this.f16407e = locale2;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 6;
                                            objMo4096w0 = bq1Var.mo4096w0(list8, this);
                                            bq1Var2 = bq1Var;
                                            if (objMo4096w0 != coroutineSingletons) {
                                                this.f16403a = r5;
                                                this.f16404b = r5;
                                                this.f16405c = list3;
                                                this.f16406d = list4;
                                                this.f16407e = locale2;
                                                this.f16408f = r5;
                                                this.f16409g = r5;
                                                this.f16410h = 7;
                                                rxa rxaVar6 = (rxa) bq1Var2;
                                                objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar6, list12, 1), rxaVar6.f60013K, this, false, true);
                                                if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                    objM2861d5 = xfaVar;
                                                }
                                                if (objM2861d5 != coroutineSingletons) {
                                                    ref$ObjectRef = ref$ObjectRef2;
                                                    bq1Var3 = bq1Var2;
                                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                                        c1308x2 = c1308x;
                                                        io1 io1Var2 = c1308x2.f16570c;
                                                        this.f16403a = null;
                                                        this.f16404b = null;
                                                        this.f16405c = null;
                                                        this.f16406d = list4;
                                                        this.f16407e = locale2;
                                                        this.f16408f = null;
                                                        this.f16409g = null;
                                                        this.f16410h = 8;
                                                        objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var2, list3, 1), io1Var2.f44343K, this, false, true);
                                                        if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                            objM2861d6 = xfaVar;
                                                        }
                                                        if (objM2861d6 != coroutineSingletons) {
                                                        }
                                                    } else {
                                                        c1308x2 = c1308x;
                                                    }
                                                    bq1Var4 = bq1Var3;
                                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                                        if (str != null) {
                                                            List list110 = list;
                                                            int i15 = 10;
                                                            arrayList4 = new ArrayList(v91.m23189q0(list110, 10));
                                                            it = list110.iterator();
                                                            while (it.hasNext()) {
                                                                String str111 = ((ResultVocabularyCard) it.next()).f21675a;
                                                                locale2.getClass();
                                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str111, locale2)), str));
                                                            }
                                                            this.f16403a = null;
                                                            this.f16404b = null;
                                                            this.f16405c = null;
                                                            this.f16406d = null;
                                                            this.f16407e = null;
                                                            this.f16408f = null;
                                                            this.f16409g = null;
                                                            this.f16410h = 10;
                                                            rxa rxaVar7 = (rxa) bq1Var4;
                                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i15, rxaVar7, arrayList4), rxaVar7.f60013K, this, false, true);
                                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                                objM2861d8 = xfaVar;
                                                            }
                                                            if (objM2861d8 == coroutineSingletons) {
                                                            }
                                                        }
                                                        return xfaVar;
                                                    }
                                                    AbstractC1320h abstractC1320h2 = c1308x2.f16571d;
                                                    this.f16403a = null;
                                                    this.f16404b = null;
                                                    this.f16405c = null;
                                                    this.f16406d = null;
                                                    this.f16407e = locale2;
                                                    this.f16408f = null;
                                                    this.f16409g = null;
                                                    this.f16410h = 9;
                                                    q05 q05Var2 = (q05) abstractC1320h2;
                                                    objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var2, list4, 6), q05Var2.f57071K, this, false, true);
                                                    if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM2861d7 = xfaVar;
                                                    }
                                                    if (objM2861d7 != coroutineSingletons) {
                                                        locale3 = locale2;
                                                        bq1Var5 = bq1Var3;
                                                        locale2 = locale3;
                                                        bq1Var4 = bq1Var5;
                                                        if (str != null && !vk9.m23391n0(str)) {
                                                            List list111 = list;
                                                            int i16 = 10;
                                                            arrayList4 = new ArrayList(v91.m23189q0(list111, 10));
                                                            it = list111.iterator();
                                                            while (it.hasNext()) {
                                                                String str112 = ((ResultVocabularyCard) it.next()).f21675a;
                                                                locale2.getClass();
                                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str112, locale2)), str));
                                                            }
                                                            this.f16403a = null;
                                                            this.f16404b = null;
                                                            this.f16405c = null;
                                                            this.f16406d = null;
                                                            this.f16407e = null;
                                                            this.f16408f = null;
                                                            this.f16409g = null;
                                                            this.f16410h = 10;
                                                            rxa rxaVar8 = (rxa) bq1Var4;
                                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i16, rxaVar8, arrayList4), rxaVar8.f60013K, this, false, true);
                                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                                objM2861d8 = xfaVar;
                                                            }
                                                            if (objM2861d8 == coroutineSingletons) {
                                                            }
                                                        }
                                                        return xfaVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    coroutineSingletons = coroutineSingletons2;
                    set2 = linkedHashSet;
                    str7 = ")";
                    str = str8;
                    ref$ObjectRef2 = ref$ObjectRef2;
                    abstractC1323k2 = abstractC1323k;
                    str2 = str9;
                    list2 = arrayList6;
                    list3 = arrayList7;
                    list4 = arrayList8;
                    locale = localeForLanguageTag;
                    list6 = arrayList5;
                    List list112 = list6;
                    set3 = set2;
                    String strM22990m2 = ux5.m22990m(str2, "\\_%");
                    this.f16403a = list112;
                    this.f16404b = list2;
                    this.f16405c = list3;
                    this.f16406d = list4;
                    this.f16407e = locale;
                    this.f16408f = set3;
                    this.f16410h = 3;
                    objM2861d2 = AbstractC0758a.m2861d(new fd7(strM22990m2, i, this.f16402O), ((rxa) abstractC1323k2).f60013K, this, true, false);
                    abstractC1323k3 = abstractC1323k2;
                    list7 = list112;
                    if (objM2861d2 != coroutineSingletons) {
                        arrayList2 = new ArrayList();
                        while (r8.hasNext()) {
                            if (!set3.contains((String) obj5)) {
                                arrayList2.add(obj5);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            this.f16403a = list7;
                            this.f16404b = list2;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale;
                            this.f16408f = set;
                            this.f16409g = arrayList2;
                            this.f16410h = 4;
                            rxa rxaVar9 = (rxa) abstractC1323k3;
                            rxaVar9.getClass();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("DELETE FROM CardEntity WHERE termWithLanguage IN (");
                            str6 = str7;
                            objM2861d3 = AbstractC0758a.m2861d(new m05(4, AbstractC3393o1.m17736k(str6, sb3, arrayList2), arrayList2), rxaVar9.f60013K, this, false, true);
                            if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d3 = xfaVar;
                            }
                            if (objM2861d3 != coroutineSingletons) {
                                arrayList3 = arrayList2;
                                list9 = list7;
                                abstractC1323k4 = abstractC1323k3;
                                this.f16403a = list9;
                                this.f16404b = list2;
                                this.f16405c = list3;
                                this.f16406d = list4;
                                this.f16407e = locale;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 5;
                                rxa rxaVar10 = (rxa) abstractC1323k4;
                                rxaVar10.getClass();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("DELETE FROM VocabularyOrderEntity WHERE termWithLanguage IN (");
                                d32.m10005B(arrayList3.size(), sb4);
                                sb4.append(str6);
                                objM2861d4 = AbstractC0758a.m2861d(new l05(2, sb4.toString(), arrayList3), rxaVar10.f60013K, this, false, true);
                                if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d4 = xfaVar;
                                }
                                if (objM2861d4 != coroutineSingletons) {
                                    locale2 = locale;
                                    list10 = list4;
                                    list11 = list3;
                                    abstractC1323k5 = abstractC1323k4;
                                    list13 = list9;
                                    list3 = list11;
                                    list8 = list13;
                                    list4 = list10;
                                    bq1Var = abstractC1323k5;
                                    list12 = list2;
                                    r5 = 0;
                                    this.f16403a = null;
                                    this.f16404b = list12;
                                    this.f16405c = list3;
                                    this.f16406d = list4;
                                    this.f16407e = locale2;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 6;
                                    objMo4096w0 = bq1Var.mo4096w0(list8, this);
                                    bq1Var2 = bq1Var;
                                    if (objMo4096w0 != coroutineSingletons) {
                                        this.f16403a = r5;
                                        this.f16404b = r5;
                                        this.f16405c = list3;
                                        this.f16406d = list4;
                                        this.f16407e = locale2;
                                        this.f16408f = r5;
                                        this.f16409g = r5;
                                        this.f16410h = 7;
                                        rxa rxaVar11 = (rxa) bq1Var2;
                                        objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar11, list12, 1), rxaVar11.f60013K, this, false, true);
                                        if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d5 = xfaVar;
                                        }
                                        if (objM2861d5 != coroutineSingletons) {
                                            ref$ObjectRef = ref$ObjectRef2;
                                            bq1Var3 = bq1Var2;
                                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                                c1308x2 = c1308x;
                                                io1 io1Var3 = c1308x2.f16570c;
                                                this.f16403a = null;
                                                this.f16404b = null;
                                                this.f16405c = null;
                                                this.f16406d = list4;
                                                this.f16407e = locale2;
                                                this.f16408f = null;
                                                this.f16409g = null;
                                                this.f16410h = 8;
                                                objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var3, list3, 1), io1Var3.f44343K, this, false, true);
                                                if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                    objM2861d6 = xfaVar;
                                                }
                                                if (objM2861d6 != coroutineSingletons) {
                                                }
                                            } else {
                                                c1308x2 = c1308x;
                                            }
                                            bq1Var4 = bq1Var3;
                                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                                if (str != null) {
                                                    List list113 = list;
                                                    int i17 = 10;
                                                    arrayList4 = new ArrayList(v91.m23189q0(list113, 10));
                                                    it = list113.iterator();
                                                    while (it.hasNext()) {
                                                        String str113 = ((ResultVocabularyCard) it.next()).f21675a;
                                                        locale2.getClass();
                                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str113, locale2)), str));
                                                    }
                                                    this.f16403a = null;
                                                    this.f16404b = null;
                                                    this.f16405c = null;
                                                    this.f16406d = null;
                                                    this.f16407e = null;
                                                    this.f16408f = null;
                                                    this.f16409g = null;
                                                    this.f16410h = 10;
                                                    rxa rxaVar12 = (rxa) bq1Var4;
                                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i17, rxaVar12, arrayList4), rxaVar12.f60013K, this, false, true);
                                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM2861d8 = xfaVar;
                                                    }
                                                    if (objM2861d8 == coroutineSingletons) {
                                                    }
                                                }
                                                return xfaVar;
                                            }
                                            AbstractC1320h abstractC1320h3 = c1308x2.f16571d;
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = locale2;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 9;
                                            q05 q05Var3 = (q05) abstractC1320h3;
                                            objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var3, list4, 6), q05Var3.f57071K, this, false, true);
                                            if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d7 = xfaVar;
                                            }
                                            if (objM2861d7 != coroutineSingletons) {
                                                locale3 = locale2;
                                                bq1Var5 = bq1Var3;
                                                locale2 = locale3;
                                                bq1Var4 = bq1Var5;
                                                if (str != null) {
                                                    List list114 = list;
                                                    int i18 = 10;
                                                    arrayList4 = new ArrayList(v91.m23189q0(list114, 10));
                                                    it = list114.iterator();
                                                    while (it.hasNext()) {
                                                        String str114 = ((ResultVocabularyCard) it.next()).f21675a;
                                                        locale2.getClass();
                                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str114, locale2)), str));
                                                    }
                                                    this.f16403a = null;
                                                    this.f16404b = null;
                                                    this.f16405c = null;
                                                    this.f16406d = null;
                                                    this.f16407e = null;
                                                    this.f16408f = null;
                                                    this.f16409g = null;
                                                    this.f16410h = 10;
                                                    rxa rxaVar13 = (rxa) bq1Var4;
                                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i18, rxaVar13, arrayList4), rxaVar13.f60013K, this, false, true);
                                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM2861d8 = xfaVar;
                                                    }
                                                    if (objM2861d8 == coroutineSingletons) {
                                                    }
                                                }
                                                return xfaVar;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            locale2 = locale;
                            list8 = list7;
                            bq1Var = abstractC1323k3;
                            list12 = list2;
                            r5 = 0;
                            this.f16403a = null;
                            this.f16404b = list12;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale2;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 6;
                            objMo4096w0 = bq1Var.mo4096w0(list8, this);
                            bq1Var2 = bq1Var;
                            if (objMo4096w0 != coroutineSingletons) {
                                this.f16403a = r5;
                                this.f16404b = r5;
                                this.f16405c = list3;
                                this.f16406d = list4;
                                this.f16407e = locale2;
                                this.f16408f = r5;
                                this.f16409g = r5;
                                this.f16410h = 7;
                                rxa rxaVar14 = (rxa) bq1Var2;
                                objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar14, list12, 1), rxaVar14.f60013K, this, false, true);
                                if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d5 = xfaVar;
                                }
                                if (objM2861d5 != coroutineSingletons) {
                                    ref$ObjectRef = ref$ObjectRef2;
                                    bq1Var3 = bq1Var2;
                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                        c1308x2 = c1308x;
                                        io1 io1Var4 = c1308x2.f16570c;
                                        this.f16403a = null;
                                        this.f16404b = null;
                                        this.f16405c = null;
                                        this.f16406d = list4;
                                        this.f16407e = locale2;
                                        this.f16408f = null;
                                        this.f16409g = null;
                                        this.f16410h = 8;
                                        objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var4, list3, 1), io1Var4.f44343K, this, false, true);
                                        if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d6 = xfaVar;
                                        }
                                        if (objM2861d6 != coroutineSingletons) {
                                        }
                                    } else {
                                        c1308x2 = c1308x;
                                    }
                                    bq1Var4 = bq1Var3;
                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                        if (str != null) {
                                            List list115 = list;
                                            int i19 = 10;
                                            arrayList4 = new ArrayList(v91.m23189q0(list115, 10));
                                            it = list115.iterator();
                                            while (it.hasNext()) {
                                                String str115 = ((ResultVocabularyCard) it.next()).f21675a;
                                                locale2.getClass();
                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str115, locale2)), str));
                                            }
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = null;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 10;
                                            rxa rxaVar15 = (rxa) bq1Var4;
                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i19, rxaVar15, arrayList4), rxaVar15.f60013K, this, false, true);
                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d8 = xfaVar;
                                            }
                                            if (objM2861d8 == coroutineSingletons) {
                                            }
                                        }
                                        return xfaVar;
                                    }
                                    AbstractC1320h abstractC1320h4 = c1308x2.f16571d;
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = null;
                                    this.f16407e = locale2;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 9;
                                    q05 q05Var4 = (q05) abstractC1320h4;
                                    objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var4, list4, 6), q05Var4.f57071K, this, false, true);
                                    if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d7 = xfaVar;
                                    }
                                    if (objM2861d7 != coroutineSingletons) {
                                        locale3 = locale2;
                                        bq1Var5 = bq1Var3;
                                        locale2 = locale3;
                                        bq1Var4 = bq1Var5;
                                        if (str != null) {
                                            List list116 = list;
                                            int i110 = 10;
                                            arrayList4 = new ArrayList(v91.m23189q0(list116, 10));
                                            it = list116.iterator();
                                            while (it.hasNext()) {
                                                String str116 = ((ResultVocabularyCard) it.next()).f21675a;
                                                locale2.getClass();
                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str116, locale2)), str));
                                            }
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = null;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 10;
                                            rxa rxaVar16 = (rxa) bq1Var4;
                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i110, rxaVar16, arrayList4), rxaVar16.f60013K, this, false, true);
                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d8 = xfaVar;
                                            }
                                            if (objM2861d8 == coroutineSingletons) {
                                            }
                                        }
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                set = null;
                Set set4 = this.f16408f;
                locale = this.f16407e;
                list4 = this.f16406d;
                list3 = this.f16405c;
                list2 = this.f16404b;
                List list20 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                c1308x = c1308x3;
                abstractC1323k = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                i = i3;
                xfaVar = xfaVar2;
                set2 = set4;
                objM2861d = obj;
                list = list14;
                str2 = str9;
                list5 = list20;
                this.f16403a = list5;
                this.f16404b = list2;
                this.f16405c = list3;
                this.f16406d = list4;
                this.f16407e = locale;
                this.f16408f = set2;
                this.f16410h = 2;
                AbstractC1323k abstractC1323k9 = abstractC1323k;
                str = str8;
                objM7516y0 = abstractC1323k9.m7516y0(str, (List) objM2861d, this);
                abstractC1323k2 = abstractC1323k9;
                list6 = list5;
                if (objM7516y0 != coroutineSingletons) {
                    List list117 = list6;
                    set3 = set2;
                    String strM22990m3 = ux5.m22990m(str2, "\\_%");
                    this.f16403a = list117;
                    this.f16404b = list2;
                    this.f16405c = list3;
                    this.f16406d = list4;
                    this.f16407e = locale;
                    this.f16408f = set3;
                    this.f16410h = 3;
                    objM2861d2 = AbstractC0758a.m2861d(new fd7(strM22990m3, i, this.f16402O), ((rxa) abstractC1323k2).f60013K, this, true, false);
                    abstractC1323k3 = abstractC1323k2;
                    list7 = list117;
                    if (objM2861d2 != coroutineSingletons) {
                        arrayList2 = new ArrayList();
                        while (r8.hasNext()) {
                            if (!set3.contains((String) obj5)) {
                                arrayList2.add(obj5);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            this.f16403a = list7;
                            this.f16404b = list2;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale;
                            this.f16408f = set;
                            this.f16409g = arrayList2;
                            this.f16410h = 4;
                            rxa rxaVar17 = (rxa) abstractC1323k3;
                            rxaVar17.getClass();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("DELETE FROM CardEntity WHERE termWithLanguage IN (");
                            str6 = str7;
                            objM2861d3 = AbstractC0758a.m2861d(new m05(4, AbstractC3393o1.m17736k(str6, sb5, arrayList2), arrayList2), rxaVar17.f60013K, this, false, true);
                            if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d3 = xfaVar;
                            }
                            if (objM2861d3 != coroutineSingletons) {
                                arrayList3 = arrayList2;
                                list9 = list7;
                                abstractC1323k4 = abstractC1323k3;
                                this.f16403a = list9;
                                this.f16404b = list2;
                                this.f16405c = list3;
                                this.f16406d = list4;
                                this.f16407e = locale;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 5;
                                rxa rxaVar18 = (rxa) abstractC1323k4;
                                rxaVar18.getClass();
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("DELETE FROM VocabularyOrderEntity WHERE termWithLanguage IN (");
                                d32.m10005B(arrayList3.size(), sb6);
                                sb6.append(str6);
                                objM2861d4 = AbstractC0758a.m2861d(new l05(2, sb6.toString(), arrayList3), rxaVar18.f60013K, this, false, true);
                                if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d4 = xfaVar;
                                }
                                if (objM2861d4 != coroutineSingletons) {
                                    locale2 = locale;
                                    list10 = list4;
                                    list11 = list3;
                                    abstractC1323k5 = abstractC1323k4;
                                    list13 = list9;
                                    list3 = list11;
                                    list8 = list13;
                                    list4 = list10;
                                    bq1Var = abstractC1323k5;
                                    list12 = list2;
                                    r5 = 0;
                                    this.f16403a = null;
                                    this.f16404b = list12;
                                    this.f16405c = list3;
                                    this.f16406d = list4;
                                    this.f16407e = locale2;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 6;
                                    objMo4096w0 = bq1Var.mo4096w0(list8, this);
                                    bq1Var2 = bq1Var;
                                    if (objMo4096w0 != coroutineSingletons) {
                                        this.f16403a = r5;
                                        this.f16404b = r5;
                                        this.f16405c = list3;
                                        this.f16406d = list4;
                                        this.f16407e = locale2;
                                        this.f16408f = r5;
                                        this.f16409g = r5;
                                        this.f16410h = 7;
                                        rxa rxaVar19 = (rxa) bq1Var2;
                                        objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar19, list12, 1), rxaVar19.f60013K, this, false, true);
                                        if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d5 = xfaVar;
                                        }
                                        if (objM2861d5 != coroutineSingletons) {
                                            ref$ObjectRef = ref$ObjectRef2;
                                            bq1Var3 = bq1Var2;
                                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                                c1308x2 = c1308x;
                                                io1 io1Var5 = c1308x2.f16570c;
                                                this.f16403a = null;
                                                this.f16404b = null;
                                                this.f16405c = null;
                                                this.f16406d = list4;
                                                this.f16407e = locale2;
                                                this.f16408f = null;
                                                this.f16409g = null;
                                                this.f16410h = 8;
                                                objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var5, list3, 1), io1Var5.f44343K, this, false, true);
                                                if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                    objM2861d6 = xfaVar;
                                                }
                                                if (objM2861d6 != coroutineSingletons) {
                                                }
                                            } else {
                                                c1308x2 = c1308x;
                                            }
                                            bq1Var4 = bq1Var3;
                                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                                if (str != null) {
                                                    List list118 = list;
                                                    int i111 = 10;
                                                    arrayList4 = new ArrayList(v91.m23189q0(list118, 10));
                                                    it = list118.iterator();
                                                    while (it.hasNext()) {
                                                        String str117 = ((ResultVocabularyCard) it.next()).f21675a;
                                                        locale2.getClass();
                                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str117, locale2)), str));
                                                    }
                                                    this.f16403a = null;
                                                    this.f16404b = null;
                                                    this.f16405c = null;
                                                    this.f16406d = null;
                                                    this.f16407e = null;
                                                    this.f16408f = null;
                                                    this.f16409g = null;
                                                    this.f16410h = 10;
                                                    rxa rxaVar110 = (rxa) bq1Var4;
                                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i111, rxaVar110, arrayList4), rxaVar110.f60013K, this, false, true);
                                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM2861d8 = xfaVar;
                                                    }
                                                    if (objM2861d8 == coroutineSingletons) {
                                                    }
                                                }
                                                return xfaVar;
                                            }
                                            AbstractC1320h abstractC1320h5 = c1308x2.f16571d;
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = locale2;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 9;
                                            q05 q05Var5 = (q05) abstractC1320h5;
                                            objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var5, list4, 6), q05Var5.f57071K, this, false, true);
                                            if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d7 = xfaVar;
                                            }
                                            if (objM2861d7 != coroutineSingletons) {
                                                locale3 = locale2;
                                                bq1Var5 = bq1Var3;
                                                locale2 = locale3;
                                                bq1Var4 = bq1Var5;
                                                if (str != null) {
                                                    List list119 = list;
                                                    int i112 = 10;
                                                    arrayList4 = new ArrayList(v91.m23189q0(list119, 10));
                                                    it = list119.iterator();
                                                    while (it.hasNext()) {
                                                        String str118 = ((ResultVocabularyCard) it.next()).f21675a;
                                                        locale2.getClass();
                                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str118, locale2)), str));
                                                    }
                                                    this.f16403a = null;
                                                    this.f16404b = null;
                                                    this.f16405c = null;
                                                    this.f16406d = null;
                                                    this.f16407e = null;
                                                    this.f16408f = null;
                                                    this.f16409g = null;
                                                    this.f16410h = 10;
                                                    rxa rxaVar111 = (rxa) bq1Var4;
                                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i112, rxaVar111, arrayList4), rxaVar111.f60013K, this, false, true);
                                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                        objM2861d8 = xfaVar;
                                                    }
                                                    if (objM2861d8 == coroutineSingletons) {
                                                    }
                                                }
                                                return xfaVar;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            locale2 = locale;
                            list8 = list7;
                            bq1Var = abstractC1323k3;
                            list12 = list2;
                            r5 = 0;
                            this.f16403a = null;
                            this.f16404b = list12;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale2;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 6;
                            objMo4096w0 = bq1Var.mo4096w0(list8, this);
                            bq1Var2 = bq1Var;
                            if (objMo4096w0 != coroutineSingletons) {
                                this.f16403a = r5;
                                this.f16404b = r5;
                                this.f16405c = list3;
                                this.f16406d = list4;
                                this.f16407e = locale2;
                                this.f16408f = r5;
                                this.f16409g = r5;
                                this.f16410h = 7;
                                rxa rxaVar112 = (rxa) bq1Var2;
                                objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar112, list12, 1), rxaVar112.f60013K, this, false, true);
                                if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d5 = xfaVar;
                                }
                                if (objM2861d5 != coroutineSingletons) {
                                    ref$ObjectRef = ref$ObjectRef2;
                                    bq1Var3 = bq1Var2;
                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                        c1308x2 = c1308x;
                                        io1 io1Var6 = c1308x2.f16570c;
                                        this.f16403a = null;
                                        this.f16404b = null;
                                        this.f16405c = null;
                                        this.f16406d = list4;
                                        this.f16407e = locale2;
                                        this.f16408f = null;
                                        this.f16409g = null;
                                        this.f16410h = 8;
                                        objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var6, list3, 1), io1Var6.f44343K, this, false, true);
                                        if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d6 = xfaVar;
                                        }
                                        if (objM2861d6 != coroutineSingletons) {
                                        }
                                    } else {
                                        c1308x2 = c1308x;
                                    }
                                    bq1Var4 = bq1Var3;
                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                        if (str != null) {
                                            List list1110 = list;
                                            int i113 = 10;
                                            arrayList4 = new ArrayList(v91.m23189q0(list1110, 10));
                                            it = list1110.iterator();
                                            while (it.hasNext()) {
                                                String str119 = ((ResultVocabularyCard) it.next()).f21675a;
                                                locale2.getClass();
                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str119, locale2)), str));
                                            }
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = null;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 10;
                                            rxa rxaVar113 = (rxa) bq1Var4;
                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i113, rxaVar113, arrayList4), rxaVar113.f60013K, this, false, true);
                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d8 = xfaVar;
                                            }
                                            if (objM2861d8 == coroutineSingletons) {
                                            }
                                        }
                                        return xfaVar;
                                    }
                                    AbstractC1320h abstractC1320h6 = c1308x2.f16571d;
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = null;
                                    this.f16407e = locale2;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 9;
                                    q05 q05Var6 = (q05) abstractC1320h6;
                                    objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var6, list4, 6), q05Var6.f57071K, this, false, true);
                                    if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d7 = xfaVar;
                                    }
                                    if (objM2861d7 != coroutineSingletons) {
                                        locale3 = locale2;
                                        bq1Var5 = bq1Var3;
                                        locale2 = locale3;
                                        bq1Var4 = bq1Var5;
                                        if (str != null) {
                                            List list1111 = list;
                                            int i114 = 10;
                                            arrayList4 = new ArrayList(v91.m23189q0(list1111, 10));
                                            it = list1111.iterator();
                                            while (it.hasNext()) {
                                                String str1110 = ((ResultVocabularyCard) it.next()).f21675a;
                                                locale2.getClass();
                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1110, locale2)), str));
                                            }
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = null;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 10;
                                            rxa rxaVar114 = (rxa) bq1Var4;
                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i114, rxaVar114, arrayList4), rxaVar114.f60013K, this, false, true);
                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d8 = xfaVar;
                                            }
                                            if (objM2861d8 == coroutineSingletons) {
                                            }
                                        }
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                set = null;
                Set set5 = this.f16408f;
                locale = this.f16407e;
                list4 = this.f16406d;
                list3 = this.f16405c;
                list2 = this.f16404b;
                List list21 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                abstractC1323k2 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                c1308x = c1308x3;
                i = i3;
                str7 = ")";
                str = str8;
                ref$ObjectRef2 = ref$ObjectRef2;
                xfaVar = xfaVar2;
                set2 = set5;
                list = list14;
                str2 = str9;
                list6 = list21;
                List list1112 = list6;
                set3 = set2;
                String strM22990m4 = ux5.m22990m(str2, "\\_%");
                this.f16403a = list1112;
                this.f16404b = list2;
                this.f16405c = list3;
                this.f16406d = list4;
                this.f16407e = locale;
                this.f16408f = set3;
                this.f16410h = 3;
                objM2861d2 = AbstractC0758a.m2861d(new fd7(strM22990m4, i, this.f16402O), ((rxa) abstractC1323k2).f60013K, this, true, false);
                abstractC1323k3 = abstractC1323k2;
                list7 = list1112;
                if (objM2861d2 != coroutineSingletons) {
                    arrayList2 = new ArrayList();
                    while (r8.hasNext()) {
                        if (!set3.contains((String) obj5)) {
                            arrayList2.add(obj5);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f16403a = list7;
                        this.f16404b = list2;
                        this.f16405c = list3;
                        this.f16406d = list4;
                        this.f16407e = locale;
                        this.f16408f = set;
                        this.f16409g = arrayList2;
                        this.f16410h = 4;
                        rxa rxaVar115 = (rxa) abstractC1323k3;
                        rxaVar115.getClass();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("DELETE FROM CardEntity WHERE termWithLanguage IN (");
                        str6 = str7;
                        objM2861d3 = AbstractC0758a.m2861d(new m05(4, AbstractC3393o1.m17736k(str6, sb7, arrayList2), arrayList2), rxaVar115.f60013K, this, false, true);
                        if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d3 = xfaVar;
                        }
                        if (objM2861d3 != coroutineSingletons) {
                            arrayList3 = arrayList2;
                            list9 = list7;
                            abstractC1323k4 = abstractC1323k3;
                            this.f16403a = list9;
                            this.f16404b = list2;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 5;
                            rxa rxaVar116 = (rxa) abstractC1323k4;
                            rxaVar116.getClass();
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("DELETE FROM VocabularyOrderEntity WHERE termWithLanguage IN (");
                            d32.m10005B(arrayList3.size(), sb8);
                            sb8.append(str6);
                            objM2861d4 = AbstractC0758a.m2861d(new l05(2, sb8.toString(), arrayList3), rxaVar116.f60013K, this, false, true);
                            if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d4 = xfaVar;
                            }
                            if (objM2861d4 != coroutineSingletons) {
                                locale2 = locale;
                                list10 = list4;
                                list11 = list3;
                                abstractC1323k5 = abstractC1323k4;
                                list13 = list9;
                                list3 = list11;
                                list8 = list13;
                                list4 = list10;
                                bq1Var = abstractC1323k5;
                                list12 = list2;
                                r5 = 0;
                                this.f16403a = null;
                                this.f16404b = list12;
                                this.f16405c = list3;
                                this.f16406d = list4;
                                this.f16407e = locale2;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 6;
                                objMo4096w0 = bq1Var.mo4096w0(list8, this);
                                bq1Var2 = bq1Var;
                                if (objMo4096w0 != coroutineSingletons) {
                                    this.f16403a = r5;
                                    this.f16404b = r5;
                                    this.f16405c = list3;
                                    this.f16406d = list4;
                                    this.f16407e = locale2;
                                    this.f16408f = r5;
                                    this.f16409g = r5;
                                    this.f16410h = 7;
                                    rxa rxaVar117 = (rxa) bq1Var2;
                                    objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar117, list12, 1), rxaVar117.f60013K, this, false, true);
                                    if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d5 = xfaVar;
                                    }
                                    if (objM2861d5 != coroutineSingletons) {
                                        ref$ObjectRef = ref$ObjectRef2;
                                        bq1Var3 = bq1Var2;
                                        if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                            c1308x2 = c1308x;
                                            io1 io1Var7 = c1308x2.f16570c;
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = list4;
                                            this.f16407e = locale2;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 8;
                                            objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var7, list3, 1), io1Var7.f44343K, this, false, true);
                                            if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d6 = xfaVar;
                                            }
                                            if (objM2861d6 != coroutineSingletons) {
                                            }
                                        } else {
                                            c1308x2 = c1308x;
                                        }
                                        bq1Var4 = bq1Var3;
                                        if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                            if (str != null) {
                                                List list1113 = list;
                                                int i115 = 10;
                                                arrayList4 = new ArrayList(v91.m23189q0(list1113, 10));
                                                it = list1113.iterator();
                                                while (it.hasNext()) {
                                                    String str1111 = ((ResultVocabularyCard) it.next()).f21675a;
                                                    locale2.getClass();
                                                    arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1111, locale2)), str));
                                                }
                                                this.f16403a = null;
                                                this.f16404b = null;
                                                this.f16405c = null;
                                                this.f16406d = null;
                                                this.f16407e = null;
                                                this.f16408f = null;
                                                this.f16409g = null;
                                                this.f16410h = 10;
                                                rxa rxaVar118 = (rxa) bq1Var4;
                                                objM2861d8 = AbstractC0758a.m2861d(new r3a(i115, rxaVar118, arrayList4), rxaVar118.f60013K, this, false, true);
                                                if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                    objM2861d8 = xfaVar;
                                                }
                                                if (objM2861d8 == coroutineSingletons) {
                                                }
                                            }
                                            return xfaVar;
                                        }
                                        AbstractC1320h abstractC1320h7 = c1308x2.f16571d;
                                        this.f16403a = null;
                                        this.f16404b = null;
                                        this.f16405c = null;
                                        this.f16406d = null;
                                        this.f16407e = locale2;
                                        this.f16408f = null;
                                        this.f16409g = null;
                                        this.f16410h = 9;
                                        q05 q05Var7 = (q05) abstractC1320h7;
                                        objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var7, list4, 6), q05Var7.f57071K, this, false, true);
                                        if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d7 = xfaVar;
                                        }
                                        if (objM2861d7 != coroutineSingletons) {
                                            locale3 = locale2;
                                            bq1Var5 = bq1Var3;
                                            locale2 = locale3;
                                            bq1Var4 = bq1Var5;
                                            if (str != null) {
                                                List list1114 = list;
                                                int i116 = 10;
                                                arrayList4 = new ArrayList(v91.m23189q0(list1114, 10));
                                                it = list1114.iterator();
                                                while (it.hasNext()) {
                                                    String str1112 = ((ResultVocabularyCard) it.next()).f21675a;
                                                    locale2.getClass();
                                                    arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1112, locale2)), str));
                                                }
                                                this.f16403a = null;
                                                this.f16404b = null;
                                                this.f16405c = null;
                                                this.f16406d = null;
                                                this.f16407e = null;
                                                this.f16408f = null;
                                                this.f16409g = null;
                                                this.f16410h = 10;
                                                rxa rxaVar119 = (rxa) bq1Var4;
                                                objM2861d8 = AbstractC0758a.m2861d(new r3a(i116, rxaVar119, arrayList4), rxaVar119.f60013K, this, false, true);
                                                if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                    objM2861d8 = xfaVar;
                                                }
                                                if (objM2861d8 == coroutineSingletons) {
                                                }
                                            }
                                            return xfaVar;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        locale2 = locale;
                        list8 = list7;
                        bq1Var = abstractC1323k3;
                        list12 = list2;
                        r5 = 0;
                        this.f16403a = null;
                        this.f16404b = list12;
                        this.f16405c = list3;
                        this.f16406d = list4;
                        this.f16407e = locale2;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 6;
                        objMo4096w0 = bq1Var.mo4096w0(list8, this);
                        bq1Var2 = bq1Var;
                        if (objMo4096w0 != coroutineSingletons) {
                            this.f16403a = r5;
                            this.f16404b = r5;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale2;
                            this.f16408f = r5;
                            this.f16409g = r5;
                            this.f16410h = 7;
                            rxa rxaVar1110 = (rxa) bq1Var2;
                            objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar1110, list12, 1), rxaVar1110.f60013K, this, false, true);
                            if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d5 = xfaVar;
                            }
                            if (objM2861d5 != coroutineSingletons) {
                                ref$ObjectRef = ref$ObjectRef2;
                                bq1Var3 = bq1Var2;
                                if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                    c1308x2 = c1308x;
                                    io1 io1Var8 = c1308x2.f16570c;
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = list4;
                                    this.f16407e = locale2;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 8;
                                    objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var8, list3, 1), io1Var8.f44343K, this, false, true);
                                    if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d6 = xfaVar;
                                    }
                                    if (objM2861d6 != coroutineSingletons) {
                                    }
                                } else {
                                    c1308x2 = c1308x;
                                }
                                bq1Var4 = bq1Var3;
                                if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                    if (str != null) {
                                        List list1115 = list;
                                        int i117 = 10;
                                        arrayList4 = new ArrayList(v91.m23189q0(list1115, 10));
                                        it = list1115.iterator();
                                        while (it.hasNext()) {
                                            String str1113 = ((ResultVocabularyCard) it.next()).f21675a;
                                            locale2.getClass();
                                            arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1113, locale2)), str));
                                        }
                                        this.f16403a = null;
                                        this.f16404b = null;
                                        this.f16405c = null;
                                        this.f16406d = null;
                                        this.f16407e = null;
                                        this.f16408f = null;
                                        this.f16409g = null;
                                        this.f16410h = 10;
                                        rxa rxaVar1111 = (rxa) bq1Var4;
                                        objM2861d8 = AbstractC0758a.m2861d(new r3a(i117, rxaVar1111, arrayList4), rxaVar1111.f60013K, this, false, true);
                                        if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d8 = xfaVar;
                                        }
                                        if (objM2861d8 == coroutineSingletons) {
                                        }
                                    }
                                    return xfaVar;
                                }
                                AbstractC1320h abstractC1320h8 = c1308x2.f16571d;
                                this.f16403a = null;
                                this.f16404b = null;
                                this.f16405c = null;
                                this.f16406d = null;
                                this.f16407e = locale2;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 9;
                                q05 q05Var8 = (q05) abstractC1320h8;
                                objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var8, list4, 6), q05Var8.f57071K, this, false, true);
                                if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d7 = xfaVar;
                                }
                                if (objM2861d7 != coroutineSingletons) {
                                    locale3 = locale2;
                                    bq1Var5 = bq1Var3;
                                    locale2 = locale3;
                                    bq1Var4 = bq1Var5;
                                    if (str != null) {
                                        List list1116 = list;
                                        int i118 = 10;
                                        arrayList4 = new ArrayList(v91.m23189q0(list1116, 10));
                                        it = list1116.iterator();
                                        while (it.hasNext()) {
                                            String str1114 = ((ResultVocabularyCard) it.next()).f21675a;
                                            locale2.getClass();
                                            arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1114, locale2)), str));
                                        }
                                        this.f16403a = null;
                                        this.f16404b = null;
                                        this.f16405c = null;
                                        this.f16406d = null;
                                        this.f16407e = null;
                                        this.f16408f = null;
                                        this.f16409g = null;
                                        this.f16410h = 10;
                                        rxa rxaVar1112 = (rxa) bq1Var4;
                                        objM2861d8 = AbstractC0758a.m2861d(new r3a(i118, rxaVar1112, arrayList4), rxaVar1112.f60013K, this, false, true);
                                        if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d8 = xfaVar;
                                        }
                                        if (objM2861d8 == coroutineSingletons) {
                                        }
                                    }
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                set = null;
                set3 = this.f16408f;
                locale = this.f16407e;
                list4 = this.f16406d;
                List list22 = this.f16405c;
                List list23 = this.f16404b;
                List list24 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                abstractC1323k3 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                c1308x = c1308x3;
                list = list14;
                str7 = ")";
                ref$ObjectRef2 = ref$ObjectRef2;
                xfaVar = xfaVar2;
                list7 = list24;
                objM2861d2 = obj;
                str2 = str9;
                list2 = list23;
                list3 = list22;
                str = str8;
                arrayList2 = new ArrayList();
                while (r8.hasNext()) {
                    if (!set3.contains((String) obj5)) {
                        arrayList2.add(obj5);
                    }
                }
                if (arrayList2.isEmpty()) {
                    this.f16403a = list7;
                    this.f16404b = list2;
                    this.f16405c = list3;
                    this.f16406d = list4;
                    this.f16407e = locale;
                    this.f16408f = set;
                    this.f16409g = arrayList2;
                    this.f16410h = 4;
                    rxa rxaVar1113 = (rxa) abstractC1323k3;
                    rxaVar1113.getClass();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("DELETE FROM CardEntity WHERE termWithLanguage IN (");
                    str6 = str7;
                    objM2861d3 = AbstractC0758a.m2861d(new m05(4, AbstractC3393o1.m17736k(str6, sb9, arrayList2), arrayList2), rxaVar1113.f60013K, this, false, true);
                    if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d3 = xfaVar;
                    }
                    if (objM2861d3 != coroutineSingletons) {
                        arrayList3 = arrayList2;
                        list9 = list7;
                        abstractC1323k4 = abstractC1323k3;
                        this.f16403a = list9;
                        this.f16404b = list2;
                        this.f16405c = list3;
                        this.f16406d = list4;
                        this.f16407e = locale;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 5;
                        rxa rxaVar1114 = (rxa) abstractC1323k4;
                        rxaVar1114.getClass();
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("DELETE FROM VocabularyOrderEntity WHERE termWithLanguage IN (");
                        d32.m10005B(arrayList3.size(), sb10);
                        sb10.append(str6);
                        objM2861d4 = AbstractC0758a.m2861d(new l05(2, sb10.toString(), arrayList3), rxaVar1114.f60013K, this, false, true);
                        if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d4 = xfaVar;
                        }
                        if (objM2861d4 != coroutineSingletons) {
                            locale2 = locale;
                            list10 = list4;
                            list11 = list3;
                            abstractC1323k5 = abstractC1323k4;
                            list13 = list9;
                            list3 = list11;
                            list8 = list13;
                            list4 = list10;
                            bq1Var = abstractC1323k5;
                            list12 = list2;
                            r5 = 0;
                            this.f16403a = null;
                            this.f16404b = list12;
                            this.f16405c = list3;
                            this.f16406d = list4;
                            this.f16407e = locale2;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 6;
                            objMo4096w0 = bq1Var.mo4096w0(list8, this);
                            bq1Var2 = bq1Var;
                            if (objMo4096w0 != coroutineSingletons) {
                                this.f16403a = r5;
                                this.f16404b = r5;
                                this.f16405c = list3;
                                this.f16406d = list4;
                                this.f16407e = locale2;
                                this.f16408f = r5;
                                this.f16409g = r5;
                                this.f16410h = 7;
                                rxa rxaVar1115 = (rxa) bq1Var2;
                                objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar1115, list12, 1), rxaVar1115.f60013K, this, false, true);
                                if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d5 = xfaVar;
                                }
                                if (objM2861d5 != coroutineSingletons) {
                                    ref$ObjectRef = ref$ObjectRef2;
                                    bq1Var3 = bq1Var2;
                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                        c1308x2 = c1308x;
                                        io1 io1Var9 = c1308x2.f16570c;
                                        this.f16403a = null;
                                        this.f16404b = null;
                                        this.f16405c = null;
                                        this.f16406d = list4;
                                        this.f16407e = locale2;
                                        this.f16408f = null;
                                        this.f16409g = null;
                                        this.f16410h = 8;
                                        objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var9, list3, 1), io1Var9.f44343K, this, false, true);
                                        if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d6 = xfaVar;
                                        }
                                        if (objM2861d6 != coroutineSingletons) {
                                        }
                                    } else {
                                        c1308x2 = c1308x;
                                    }
                                    bq1Var4 = bq1Var3;
                                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                        if (str != null) {
                                            List list1117 = list;
                                            int i119 = 10;
                                            arrayList4 = new ArrayList(v91.m23189q0(list1117, 10));
                                            it = list1117.iterator();
                                            while (it.hasNext()) {
                                                String str1115 = ((ResultVocabularyCard) it.next()).f21675a;
                                                locale2.getClass();
                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1115, locale2)), str));
                                            }
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = null;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 10;
                                            rxa rxaVar1116 = (rxa) bq1Var4;
                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i119, rxaVar1116, arrayList4), rxaVar1116.f60013K, this, false, true);
                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d8 = xfaVar;
                                            }
                                            if (objM2861d8 == coroutineSingletons) {
                                            }
                                        }
                                        return xfaVar;
                                    }
                                    AbstractC1320h abstractC1320h9 = c1308x2.f16571d;
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = null;
                                    this.f16407e = locale2;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 9;
                                    q05 q05Var9 = (q05) abstractC1320h9;
                                    objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var9, list4, 6), q05Var9.f57071K, this, false, true);
                                    if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d7 = xfaVar;
                                    }
                                    if (objM2861d7 != coroutineSingletons) {
                                        locale3 = locale2;
                                        bq1Var5 = bq1Var3;
                                        locale2 = locale3;
                                        bq1Var4 = bq1Var5;
                                        if (str != null) {
                                            List list1118 = list;
                                            int i1110 = 10;
                                            arrayList4 = new ArrayList(v91.m23189q0(list1118, 10));
                                            it = list1118.iterator();
                                            while (it.hasNext()) {
                                                String str1116 = ((ResultVocabularyCard) it.next()).f21675a;
                                                locale2.getClass();
                                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1116, locale2)), str));
                                            }
                                            this.f16403a = null;
                                            this.f16404b = null;
                                            this.f16405c = null;
                                            this.f16406d = null;
                                            this.f16407e = null;
                                            this.f16408f = null;
                                            this.f16409g = null;
                                            this.f16410h = 10;
                                            rxa rxaVar1117 = (rxa) bq1Var4;
                                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i1110, rxaVar1117, arrayList4), rxaVar1117.f60013K, this, false, true);
                                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d8 = xfaVar;
                                            }
                                            if (objM2861d8 == coroutineSingletons) {
                                            }
                                        }
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    locale2 = locale;
                    list8 = list7;
                    bq1Var = abstractC1323k3;
                    list12 = list2;
                    r5 = 0;
                    this.f16403a = null;
                    this.f16404b = list12;
                    this.f16405c = list3;
                    this.f16406d = list4;
                    this.f16407e = locale2;
                    this.f16408f = null;
                    this.f16409g = null;
                    this.f16410h = 6;
                    objMo4096w0 = bq1Var.mo4096w0(list8, this);
                    bq1Var2 = bq1Var;
                    if (objMo4096w0 != coroutineSingletons) {
                        this.f16403a = r5;
                        this.f16404b = r5;
                        this.f16405c = list3;
                        this.f16406d = list4;
                        this.f16407e = locale2;
                        this.f16408f = r5;
                        this.f16409g = r5;
                        this.f16410h = 7;
                        rxa rxaVar1118 = (rxa) bq1Var2;
                        objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar1118, list12, 1), rxaVar1118.f60013K, this, false, true);
                        if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d5 = xfaVar;
                        }
                        if (objM2861d5 != coroutineSingletons) {
                            ref$ObjectRef = ref$ObjectRef2;
                            bq1Var3 = bq1Var2;
                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                c1308x2 = c1308x;
                                io1 io1Var10 = c1308x2.f16570c;
                                this.f16403a = null;
                                this.f16404b = null;
                                this.f16405c = null;
                                this.f16406d = list4;
                                this.f16407e = locale2;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 8;
                                objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var10, list3, 1), io1Var10.f44343K, this, false, true);
                                if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d6 = xfaVar;
                                }
                                if (objM2861d6 != coroutineSingletons) {
                                }
                            } else {
                                c1308x2 = c1308x;
                            }
                            bq1Var4 = bq1Var3;
                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                if (str != null) {
                                    List list1119 = list;
                                    int i1111 = 10;
                                    arrayList4 = new ArrayList(v91.m23189q0(list1119, 10));
                                    it = list1119.iterator();
                                    while (it.hasNext()) {
                                        String str1117 = ((ResultVocabularyCard) it.next()).f21675a;
                                        locale2.getClass();
                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1117, locale2)), str));
                                    }
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = null;
                                    this.f16407e = null;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 10;
                                    rxa rxaVar1119 = (rxa) bq1Var4;
                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i1111, rxaVar1119, arrayList4), rxaVar1119.f60013K, this, false, true);
                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d8 = xfaVar;
                                    }
                                    if (objM2861d8 == coroutineSingletons) {
                                    }
                                }
                                return xfaVar;
                            }
                            AbstractC1320h abstractC1320h10 = c1308x2.f16571d;
                            this.f16403a = null;
                            this.f16404b = null;
                            this.f16405c = null;
                            this.f16406d = null;
                            this.f16407e = locale2;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 9;
                            q05 q05Var10 = (q05) abstractC1320h10;
                            objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var10, list4, 6), q05Var10.f57071K, this, false, true);
                            if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d7 = xfaVar;
                            }
                            if (objM2861d7 != coroutineSingletons) {
                                locale3 = locale2;
                                bq1Var5 = bq1Var3;
                                locale2 = locale3;
                                bq1Var4 = bq1Var5;
                                if (str != null) {
                                    List list11110 = list;
                                    int i1112 = 10;
                                    arrayList4 = new ArrayList(v91.m23189q0(list11110, 10));
                                    it = list11110.iterator();
                                    while (it.hasNext()) {
                                        String str1118 = ((ResultVocabularyCard) it.next()).f21675a;
                                        locale2.getClass();
                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1118, locale2)), str));
                                    }
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = null;
                                    this.f16407e = null;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 10;
                                    rxa rxaVar11110 = (rxa) bq1Var4;
                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i1112, rxaVar11110, arrayList4), rxaVar11110.f60013K, this, false, true);
                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d8 = xfaVar;
                                    }
                                    if (objM2861d8 == coroutineSingletons) {
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                arrayList3 = this.f16409g;
                Set set6 = this.f16408f;
                locale = this.f16407e;
                List list25 = this.f16406d;
                List list26 = this.f16405c;
                List list27 = this.f16404b;
                List list28 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                abstractC1323k4 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                list2 = list27;
                list4 = list25;
                str = str8;
                str6 = ")";
                list9 = list28;
                list3 = list26;
                c1308x = c1308x3;
                list = list14;
                ref$ObjectRef2 = ref$ObjectRef2;
                xfaVar = xfaVar2;
                str2 = str9;
                this.f16403a = list9;
                this.f16404b = list2;
                this.f16405c = list3;
                this.f16406d = list4;
                this.f16407e = locale;
                this.f16408f = null;
                this.f16409g = null;
                this.f16410h = 5;
                rxa rxaVar11111 = (rxa) abstractC1323k4;
                rxaVar11111.getClass();
                StringBuilder sb11 = new StringBuilder();
                sb11.append("DELETE FROM VocabularyOrderEntity WHERE termWithLanguage IN (");
                d32.m10005B(arrayList3.size(), sb11);
                sb11.append(str6);
                objM2861d4 = AbstractC0758a.m2861d(new l05(2, sb11.toString(), arrayList3), rxaVar11111.f60013K, this, false, true);
                if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d4 = xfaVar;
                }
                if (objM2861d4 != coroutineSingletons) {
                    locale2 = locale;
                    list10 = list4;
                    list11 = list3;
                    abstractC1323k5 = abstractC1323k4;
                    list13 = list9;
                    list3 = list11;
                    list8 = list13;
                    list4 = list10;
                    bq1Var = abstractC1323k5;
                    list12 = list2;
                    r5 = 0;
                    this.f16403a = null;
                    this.f16404b = list12;
                    this.f16405c = list3;
                    this.f16406d = list4;
                    this.f16407e = locale2;
                    this.f16408f = null;
                    this.f16409g = null;
                    this.f16410h = 6;
                    objMo4096w0 = bq1Var.mo4096w0(list8, this);
                    bq1Var2 = bq1Var;
                    if (objMo4096w0 != coroutineSingletons) {
                        this.f16403a = r5;
                        this.f16404b = r5;
                        this.f16405c = list3;
                        this.f16406d = list4;
                        this.f16407e = locale2;
                        this.f16408f = r5;
                        this.f16409g = r5;
                        this.f16410h = 7;
                        rxa rxaVar11112 = (rxa) bq1Var2;
                        objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar11112, list12, 1), rxaVar11112.f60013K, this, false, true);
                        if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d5 = xfaVar;
                        }
                        if (objM2861d5 != coroutineSingletons) {
                            ref$ObjectRef = ref$ObjectRef2;
                            bq1Var3 = bq1Var2;
                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                                c1308x2 = c1308x;
                                io1 io1Var11 = c1308x2.f16570c;
                                this.f16403a = null;
                                this.f16404b = null;
                                this.f16405c = null;
                                this.f16406d = list4;
                                this.f16407e = locale2;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 8;
                                objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var11, list3, 1), io1Var11.f44343K, this, false, true);
                                if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d6 = xfaVar;
                                }
                                if (objM2861d6 != coroutineSingletons) {
                                }
                            } else {
                                c1308x2 = c1308x;
                            }
                            bq1Var4 = bq1Var3;
                            if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                                if (str != null) {
                                    List list11111 = list;
                                    int i1113 = 10;
                                    arrayList4 = new ArrayList(v91.m23189q0(list11111, 10));
                                    it = list11111.iterator();
                                    while (it.hasNext()) {
                                        String str1119 = ((ResultVocabularyCard) it.next()).f21675a;
                                        locale2.getClass();
                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str1119, locale2)), str));
                                    }
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = null;
                                    this.f16407e = null;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 10;
                                    rxa rxaVar11113 = (rxa) bq1Var4;
                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i1113, rxaVar11113, arrayList4), rxaVar11113.f60013K, this, false, true);
                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d8 = xfaVar;
                                    }
                                    if (objM2861d8 == coroutineSingletons) {
                                    }
                                }
                                return xfaVar;
                            }
                            AbstractC1320h abstractC1320h11 = c1308x2.f16571d;
                            this.f16403a = null;
                            this.f16404b = null;
                            this.f16405c = null;
                            this.f16406d = null;
                            this.f16407e = locale2;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 9;
                            q05 q05Var11 = (q05) abstractC1320h11;
                            objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var11, list4, 6), q05Var11.f57071K, this, false, true);
                            if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d7 = xfaVar;
                            }
                            if (objM2861d7 != coroutineSingletons) {
                                locale3 = locale2;
                                bq1Var5 = bq1Var3;
                                locale2 = locale3;
                                bq1Var4 = bq1Var5;
                                if (str != null) {
                                    List list11112 = list;
                                    int i1114 = 10;
                                    arrayList4 = new ArrayList(v91.m23189q0(list11112, 10));
                                    it = list11112.iterator();
                                    while (it.hasNext()) {
                                        String str11110 = ((ResultVocabularyCard) it.next()).f21675a;
                                        locale2.getClass();
                                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11110, locale2)), str));
                                    }
                                    this.f16403a = null;
                                    this.f16404b = null;
                                    this.f16405c = null;
                                    this.f16406d = null;
                                    this.f16407e = null;
                                    this.f16408f = null;
                                    this.f16409g = null;
                                    this.f16410h = 10;
                                    rxa rxaVar11114 = (rxa) bq1Var4;
                                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i1114, rxaVar11114, arrayList4), rxaVar11114.f60013K, this, false, true);
                                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d8 = xfaVar;
                                    }
                                    if (objM2861d8 == coroutineSingletons) {
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                Set set7 = this.f16408f;
                locale2 = this.f16407e;
                list10 = this.f16406d;
                list11 = this.f16405c;
                List list29 = this.f16404b;
                List list30 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                abstractC1323k5 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                c1308x = c1308x3;
                list2 = list29;
                list = list14;
                str = str8;
                ref$ObjectRef2 = ref$ObjectRef2;
                xfaVar = xfaVar2;
                str2 = str9;
                list13 = list30;
                list3 = list11;
                list8 = list13;
                list4 = list10;
                bq1Var = abstractC1323k5;
                list12 = list2;
                r5 = 0;
                this.f16403a = null;
                this.f16404b = list12;
                this.f16405c = list3;
                this.f16406d = list4;
                this.f16407e = locale2;
                this.f16408f = null;
                this.f16409g = null;
                this.f16410h = 6;
                objMo4096w0 = bq1Var.mo4096w0(list8, this);
                bq1Var2 = bq1Var;
                if (objMo4096w0 != coroutineSingletons) {
                    this.f16403a = r5;
                    this.f16404b = r5;
                    this.f16405c = list3;
                    this.f16406d = list4;
                    this.f16407e = locale2;
                    this.f16408f = r5;
                    this.f16409g = r5;
                    this.f16410h = 7;
                    rxa rxaVar11115 = (rxa) bq1Var2;
                    objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar11115, list12, 1), rxaVar11115.f60013K, this, false, true);
                    if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d5 = xfaVar;
                    }
                    if (objM2861d5 != coroutineSingletons) {
                        ref$ObjectRef = ref$ObjectRef2;
                        bq1Var3 = bq1Var2;
                        if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                            c1308x2 = c1308x;
                            io1 io1Var12 = c1308x2.f16570c;
                            this.f16403a = null;
                            this.f16404b = null;
                            this.f16405c = null;
                            this.f16406d = list4;
                            this.f16407e = locale2;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 8;
                            objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var12, list3, 1), io1Var12.f44343K, this, false, true);
                            if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d6 = xfaVar;
                            }
                            if (objM2861d6 != coroutineSingletons) {
                            }
                        } else {
                            c1308x2 = c1308x;
                        }
                        bq1Var4 = bq1Var3;
                        if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                            if (str != null) {
                                List list11113 = list;
                                int i1115 = 10;
                                arrayList4 = new ArrayList(v91.m23189q0(list11113, 10));
                                it = list11113.iterator();
                                while (it.hasNext()) {
                                    String str11111 = ((ResultVocabularyCard) it.next()).f21675a;
                                    locale2.getClass();
                                    arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11111, locale2)), str));
                                }
                                this.f16403a = null;
                                this.f16404b = null;
                                this.f16405c = null;
                                this.f16406d = null;
                                this.f16407e = null;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 10;
                                rxa rxaVar11116 = (rxa) bq1Var4;
                                objM2861d8 = AbstractC0758a.m2861d(new r3a(i1115, rxaVar11116, arrayList4), rxaVar11116.f60013K, this, false, true);
                                if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d8 = xfaVar;
                                }
                                if (objM2861d8 == coroutineSingletons) {
                                }
                            }
                            return xfaVar;
                        }
                        AbstractC1320h abstractC1320h12 = c1308x2.f16571d;
                        this.f16403a = null;
                        this.f16404b = null;
                        this.f16405c = null;
                        this.f16406d = null;
                        this.f16407e = locale2;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 9;
                        q05 q05Var12 = (q05) abstractC1320h12;
                        objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var12, list4, 6), q05Var12.f57071K, this, false, true);
                        if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d7 = xfaVar;
                        }
                        if (objM2861d7 != coroutineSingletons) {
                            locale3 = locale2;
                            bq1Var5 = bq1Var3;
                            locale2 = locale3;
                            bq1Var4 = bq1Var5;
                            if (str != null) {
                                List list11114 = list;
                                int i1116 = 10;
                                arrayList4 = new ArrayList(v91.m23189q0(list11114, 10));
                                it = list11114.iterator();
                                while (it.hasNext()) {
                                    String str11112 = ((ResultVocabularyCard) it.next()).f21675a;
                                    locale2.getClass();
                                    arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11112, locale2)), str));
                                }
                                this.f16403a = null;
                                this.f16404b = null;
                                this.f16405c = null;
                                this.f16406d = null;
                                this.f16407e = null;
                                this.f16408f = null;
                                this.f16409g = null;
                                this.f16410h = 10;
                                rxa rxaVar11117 = (rxa) bq1Var4;
                                objM2861d8 = AbstractC0758a.m2861d(new r3a(i1116, rxaVar11117, arrayList4), rxaVar11117.f60013K, this, false, true);
                                if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d8 = xfaVar;
                                }
                                if (objM2861d8 == coroutineSingletons) {
                                }
                            }
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                Set set8 = this.f16408f;
                locale2 = this.f16407e;
                list4 = this.f16406d;
                List list31 = this.f16405c;
                list12 = this.f16404b;
                List list32 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                bq1Var2 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                c1308x = c1308x3;
                list3 = list31;
                list = list14;
                str = str8;
                ref$ObjectRef2 = ref$ObjectRef2;
                xfaVar = xfaVar2;
                r5 = 0;
                str2 = str9;
                this.f16403a = r5;
                this.f16404b = r5;
                this.f16405c = list3;
                this.f16406d = list4;
                this.f16407e = locale2;
                this.f16408f = r5;
                this.f16409g = r5;
                this.f16410h = 7;
                rxa rxaVar11118 = (rxa) bq1Var2;
                objM2861d5 = AbstractC0758a.m2861d(new pxa(rxaVar11118, list12, 1), rxaVar11118.f60013K, this, false, true);
                if (objM2861d5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d5 = xfaVar;
                }
                if (objM2861d5 != coroutineSingletons) {
                    ref$ObjectRef = ref$ObjectRef2;
                    bq1Var3 = bq1Var2;
                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                        c1308x2 = c1308x;
                        io1 io1Var13 = c1308x2.f16570c;
                        this.f16403a = null;
                        this.f16404b = null;
                        this.f16405c = null;
                        this.f16406d = list4;
                        this.f16407e = locale2;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 8;
                        objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var13, list3, 1), io1Var13.f44343K, this, false, true);
                        if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d6 = xfaVar;
                        }
                        if (objM2861d6 != coroutineSingletons) {
                        }
                    } else {
                        c1308x2 = c1308x;
                    }
                    bq1Var4 = bq1Var3;
                    if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                        if (str != null) {
                            List list11115 = list;
                            int i1117 = 10;
                            arrayList4 = new ArrayList(v91.m23189q0(list11115, 10));
                            it = list11115.iterator();
                            while (it.hasNext()) {
                                String str11113 = ((ResultVocabularyCard) it.next()).f21675a;
                                locale2.getClass();
                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11113, locale2)), str));
                            }
                            this.f16403a = null;
                            this.f16404b = null;
                            this.f16405c = null;
                            this.f16406d = null;
                            this.f16407e = null;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 10;
                            rxa rxaVar11119 = (rxa) bq1Var4;
                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i1117, rxaVar11119, arrayList4), rxaVar11119.f60013K, this, false, true);
                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d8 = xfaVar;
                            }
                            if (objM2861d8 == coroutineSingletons) {
                            }
                        }
                        return xfaVar;
                    }
                    AbstractC1320h abstractC1320h13 = c1308x2.f16571d;
                    this.f16403a = null;
                    this.f16404b = null;
                    this.f16405c = null;
                    this.f16406d = null;
                    this.f16407e = locale2;
                    this.f16408f = null;
                    this.f16409g = null;
                    this.f16410h = 9;
                    q05 q05Var13 = (q05) abstractC1320h13;
                    objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var13, list4, 6), q05Var13.f57071K, this, false, true);
                    if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d7 = xfaVar;
                    }
                    if (objM2861d7 != coroutineSingletons) {
                        locale3 = locale2;
                        bq1Var5 = bq1Var3;
                        locale2 = locale3;
                        bq1Var4 = bq1Var5;
                        if (str != null) {
                            List list11116 = list;
                            int i1118 = 10;
                            arrayList4 = new ArrayList(v91.m23189q0(list11116, 10));
                            it = list11116.iterator();
                            while (it.hasNext()) {
                                String str11114 = ((ResultVocabularyCard) it.next()).f21675a;
                                locale2.getClass();
                                arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11114, locale2)), str));
                            }
                            this.f16403a = null;
                            this.f16404b = null;
                            this.f16405c = null;
                            this.f16406d = null;
                            this.f16407e = null;
                            this.f16408f = null;
                            this.f16409g = null;
                            this.f16410h = 10;
                            rxa rxaVar111110 = (rxa) bq1Var4;
                            objM2861d8 = AbstractC0758a.m2861d(new r3a(i1118, rxaVar111110, arrayList4), rxaVar111110.f60013K, this, false, true);
                            if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d8 = xfaVar;
                            }
                            if (objM2861d8 == coroutineSingletons) {
                            }
                        }
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 7:
                Set set9 = this.f16408f;
                locale2 = this.f16407e;
                list4 = this.f16406d;
                List list33 = this.f16405c;
                List list34 = this.f16404b;
                List list35 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                bq1Var3 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                c1308x = c1308x3;
                list3 = list33;
                list = list14;
                str = str8;
                ref$ObjectRef = ref$ObjectRef2;
                xfaVar = xfaVar2;
                str2 = str9;
                if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19867i.f47624b != null) {
                    c1308x2 = c1308x;
                    io1 io1Var14 = c1308x2.f16570c;
                    this.f16403a = null;
                    this.f16404b = null;
                    this.f16405c = null;
                    this.f16406d = list4;
                    this.f16407e = locale2;
                    this.f16408f = null;
                    this.f16409g = null;
                    this.f16410h = 8;
                    objM2861d6 = AbstractC0758a.m2861d(new go1(io1Var14, list3, 1), io1Var14.f44343K, this, false, true);
                    if (objM2861d6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d6 = xfaVar;
                    }
                    if (objM2861d6 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                c1308x2 = c1308x;
                bq1Var4 = bq1Var3;
                if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                    if (str != null) {
                        List list11117 = list;
                        int i1119 = 10;
                        arrayList4 = new ArrayList(v91.m23189q0(list11117, 10));
                        it = list11117.iterator();
                        while (it.hasNext()) {
                            String str11115 = ((ResultVocabularyCard) it.next()).f21675a;
                            locale2.getClass();
                            arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11115, locale2)), str));
                        }
                        this.f16403a = null;
                        this.f16404b = null;
                        this.f16405c = null;
                        this.f16406d = null;
                        this.f16407e = null;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 10;
                        rxa rxaVar111111 = (rxa) bq1Var4;
                        objM2861d8 = AbstractC0758a.m2861d(new r3a(i1119, rxaVar111111, arrayList4), rxaVar111111.f60013K, this, false, true);
                        if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d8 = xfaVar;
                        }
                        if (objM2861d8 == coroutineSingletons) {
                        }
                    }
                    return xfaVar;
                }
                AbstractC1320h abstractC1320h14 = c1308x2.f16571d;
                this.f16403a = null;
                this.f16404b = null;
                this.f16405c = null;
                this.f16406d = null;
                this.f16407e = locale2;
                this.f16408f = null;
                this.f16409g = null;
                this.f16410h = 9;
                q05 q05Var14 = (q05) abstractC1320h14;
                objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var14, list4, 6), q05Var14.f57071K, this, false, true);
                if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d7 = xfaVar;
                }
                if (objM2861d7 != coroutineSingletons) {
                    locale3 = locale2;
                    bq1Var5 = bq1Var3;
                    locale2 = locale3;
                    bq1Var4 = bq1Var5;
                    if (str != null) {
                        List list11118 = list;
                        int i11110 = 10;
                        arrayList4 = new ArrayList(v91.m23189q0(list11118, 10));
                        it = list11118.iterator();
                        while (it.hasNext()) {
                            String str11116 = ((ResultVocabularyCard) it.next()).f21675a;
                            locale2.getClass();
                            arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11116, locale2)), str));
                        }
                        this.f16403a = null;
                        this.f16404b = null;
                        this.f16405c = null;
                        this.f16406d = null;
                        this.f16407e = null;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 10;
                        rxa rxaVar111112 = (rxa) bq1Var4;
                        objM2861d8 = AbstractC0758a.m2861d(new r3a(i11110, rxaVar111112, arrayList4), rxaVar111112.f60013K, this, false, true);
                        if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d8 = xfaVar;
                        }
                        if (objM2861d8 == coroutineSingletons) {
                        }
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 8:
                Set set10 = this.f16408f;
                locale2 = this.f16407e;
                list4 = this.f16406d;
                List list36 = this.f16405c;
                List list37 = this.f16404b;
                List list38 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                bq1Var3 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                c1308x2 = c1308x3;
                list = list14;
                str = str8;
                ref$ObjectRef = ref$ObjectRef2;
                xfaVar = xfaVar2;
                str2 = str9;
                bq1Var4 = bq1Var3;
                if (((VocabularySearchQuery) ref$ObjectRef.f47718a).f19868j.f47624b == null) {
                    if (str != null) {
                        List list11119 = list;
                        int i11111 = 10;
                        arrayList4 = new ArrayList(v91.m23189q0(list11119, 10));
                        it = list11119.iterator();
                        while (it.hasNext()) {
                            String str11117 = ((ResultVocabularyCard) it.next()).f21675a;
                            locale2.getClass();
                            arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11117, locale2)), str));
                        }
                        this.f16403a = null;
                        this.f16404b = null;
                        this.f16405c = null;
                        this.f16406d = null;
                        this.f16407e = null;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 10;
                        rxa rxaVar111113 = (rxa) bq1Var4;
                        objM2861d8 = AbstractC0758a.m2861d(new r3a(i11111, rxaVar111113, arrayList4), rxaVar111113.f60013K, this, false, true);
                        if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d8 = xfaVar;
                        }
                        if (objM2861d8 == coroutineSingletons) {
                        }
                    }
                    return xfaVar;
                }
                AbstractC1320h abstractC1320h15 = c1308x2.f16571d;
                this.f16403a = null;
                this.f16404b = null;
                this.f16405c = null;
                this.f16406d = null;
                this.f16407e = locale2;
                this.f16408f = null;
                this.f16409g = null;
                this.f16410h = 9;
                q05 q05Var15 = (q05) abstractC1320h15;
                objM2861d7 = AbstractC0758a.m2861d(new i05(q05Var15, list4, 6), q05Var15.f57071K, this, false, true);
                if (objM2861d7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d7 = xfaVar;
                }
                if (objM2861d7 != coroutineSingletons) {
                    locale3 = locale2;
                    bq1Var5 = bq1Var3;
                    locale2 = locale3;
                    bq1Var4 = bq1Var5;
                    if (str != null) {
                        List list111110 = list;
                        int i11112 = 10;
                        arrayList4 = new ArrayList(v91.m23189q0(list111110, 10));
                        it = list111110.iterator();
                        while (it.hasNext()) {
                            String str11118 = ((ResultVocabularyCard) it.next()).f21675a;
                            locale2.getClass();
                            arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11118, locale2)), str));
                        }
                        this.f16403a = null;
                        this.f16404b = null;
                        this.f16405c = null;
                        this.f16406d = null;
                        this.f16407e = null;
                        this.f16408f = null;
                        this.f16409g = null;
                        this.f16410h = 10;
                        rxa rxaVar111114 = (rxa) bq1Var4;
                        objM2861d8 = AbstractC0758a.m2861d(new r3a(i11112, rxaVar111114, arrayList4), rxaVar111114.f60013K, this, false, true);
                        if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d8 = xfaVar;
                        }
                        if (objM2861d8 == coroutineSingletons) {
                        }
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 9:
                Set set11 = this.f16408f;
                locale3 = this.f16407e;
                List list39 = this.f16406d;
                List list40 = this.f16405c;
                List list41 = this.f16404b;
                List list42 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                bq1Var5 = abstractC1323k6;
                coroutineSingletons = coroutineSingletons2;
                list = list14;
                str = str8;
                str2 = str9;
                xfaVar = xfaVar2;
                locale2 = locale3;
                bq1Var4 = bq1Var5;
                if (str != null) {
                    List list111111 = list;
                    int i11113 = 10;
                    arrayList4 = new ArrayList(v91.m23189q0(list111111, 10));
                    it = list111111.iterator();
                    while (it.hasNext()) {
                        String str11119 = ((ResultVocabularyCard) it.next()).f21675a;
                        locale2.getClass();
                        arrayList4.add(new CardsAndLOTDJoin(vz1.m23629f(str2, vz1.m23610P(str11119, locale2)), str));
                    }
                    this.f16403a = null;
                    this.f16404b = null;
                    this.f16405c = null;
                    this.f16406d = null;
                    this.f16407e = null;
                    this.f16408f = null;
                    this.f16409g = null;
                    this.f16410h = 10;
                    rxa rxaVar111115 = (rxa) bq1Var4;
                    objM2861d8 = AbstractC0758a.m2861d(new r3a(i11113, rxaVar111115, arrayList4), rxaVar111115.f60013K, this, false, true);
                    if (objM2861d8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d8 = xfaVar;
                    }
                    if (objM2861d8 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfaVar;
            case 10:
                Set set12 = this.f16408f;
                List list43 = this.f16406d;
                List list44 = this.f16405c;
                List list45 = this.f16404b;
                List list46 = this.f16403a;
                AbstractC3193b.m15359b(obj);
                return xfaVar2;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
