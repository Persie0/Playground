package com.lingq.core.data.repository;

import android.os.Bundle;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedMeaningType;
import com.lingq.core.analytics.data.modules.ChatEngagedDataType;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.data.workers.CardCreateWorker;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.LessonAndCardsFromJoin;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.status.CardExtendedStatus;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.ak1;
import p000.c32;
import p000.g9a;
import p000.gk6;
import p000.hi8;
import p000.hm5;
import p000.i05;
import p000.k7b;
import p000.l75;
import p000.nm7;
import p000.o7b;
import p000.p7b;
import p000.q05;
import p000.qm7;
import p000.r3a;
import p000.t7d;
import p000.tx6;
import p000.u91;
import p000.un0;
import p000.ux6;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.wq1;
import p000.wv0;
import p000.xfa;
import p000.y02;
import p000.y15;
import p000.y7d;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl$insertCard$2", m4291f = "CardRepositoryImpl.kt", m4292l = {178, 184, 214, 248, 250, 252, 256, 258, 259, 268}, m4293m = "invokeSuspend", m4294v = 2)
final class CardRepositoryImpl$insertCard$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: H */
    public String f14664H;

    /* JADX INFO: renamed from: I */
    public int f14665I;

    /* JADX INFO: renamed from: J */
    public int f14666J;

    /* JADX INFO: renamed from: K */
    public int f14667K;

    /* JADX INFO: renamed from: L */
    public int f14668L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C1287c f14669M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ TokenMeaning f14670N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Ref$BooleanRef f14671O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ String f14672P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ String f14673Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ int f14674R;

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ String f14675S;

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ String f14676T;

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ int f14677U;

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ String f14678V;

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ boolean f14679W;

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean f14680X;

    /* JADX INFO: renamed from: a */
    public String f14681a;

    /* JADX INFO: renamed from: b */
    public String f14682b;

    /* JADX INFO: renamed from: c */
    public String f14683c;

    /* JADX INFO: renamed from: d */
    public Ref$IntRef f14684d;

    /* JADX INFO: renamed from: e */
    public ArrayList f14685e;

    /* JADX INFO: renamed from: f */
    public ArrayList f14686f;

    /* JADX INFO: renamed from: g */
    public CardEntity f14687g;

    /* JADX INFO: renamed from: h */
    public ProfileAccount f14688h;

    /* JADX INFO: renamed from: i */
    public Bundle f14689i;

    /* JADX INFO: renamed from: j */
    public LessonEntity f14690j;

    /* JADX INFO: renamed from: k */
    public Object f14691k;

    /* JADX INFO: renamed from: l */
    public String f14692l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertCard$2(C1287c c1287c, TokenMeaning tokenMeaning, Ref$BooleanRef ref$BooleanRef, String str, String str2, int i, String str3, String str4, int i2, String str5, boolean z, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.f14669M = c1287c;
        this.f14670N = tokenMeaning;
        this.f14671O = ref$BooleanRef;
        this.f14672P = str;
        this.f14673Q = str2;
        this.f14674R = i;
        this.f14675S = str3;
        this.f14676T = str4;
        this.f14677U = i2;
        this.f14678V = str5;
        this.f14679W = z;
        this.f14680X = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepositoryImpl$insertCard$2(this.f14669M, this.f14670N, this.f14671O, this.f14672P, this.f14673Q, this.f14674R, this.f14675S, this.f14676T, this.f14677U, this.f14678V, this.f14679W, this.f14680X, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CardRepositoryImpl$insertCard$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0536  */
    /* JADX WARN: Code duplicated, block: B:102:0x0550  */
    /* JADX WARN: Code duplicated, block: B:104:0x0563  */
    /* JADX WARN: Code duplicated, block: B:105:0x056e  */
    /* JADX WARN: Code duplicated, block: B:109:0x05f4 A[LOOP:0: B:108:0x05f2->B:109:0x05f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0624  */
    /* JADX WARN: Code duplicated, block: B:114:0x062c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0638  */
    /* JADX WARN: Code duplicated, block: B:117:0x063b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0648  */
    /* JADX WARN: Code duplicated, block: B:121:0x064b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0663  */
    /* JADX WARN: Code duplicated, block: B:21:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:23:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:25:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0202  */
    /* JADX WARN: Code duplicated, block: B:32:0x0235  */
    /* JADX WARN: Code duplicated, block: B:34:0x023c  */
    /* JADX WARN: Code duplicated, block: B:37:0x024f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0260  */
    /* JADX WARN: Code duplicated, block: B:43:0x0292  */
    /* JADX WARN: Code duplicated, block: B:46:0x0298  */
    /* JADX WARN: Code duplicated, block: B:48:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0337  */
    /* JADX WARN: Code duplicated, block: B:61:0x035c A[PHI: r2 r4 r5 r6 r22 r23 r24 r35 r36
      0x035c: PHI (r2v19 int) = (r2v17 int), (r2v20 int) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r4v19 com.lingq.core.database.entity.CardEntity) = (r4v16 com.lingq.core.database.entity.CardEntity), (r4v21 com.lingq.core.database.entity.CardEntity) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r5v21 java.lang.Object) = (r5v20 java.lang.Object), (r5v23 java.lang.Object) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r6v24 int) = (r6v22 int), (r6v25 int) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r22v13 y15) = (r22v10 y15), (r22v15 y15) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r23v10 wv0) = (r23v8 wv0), (r23v11 wv0) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r24v9 java.lang.String) = (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r35v6 java.lang.String) = (r35v4 java.lang.String), (r35v7 java.lang.String) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x035c: PHI (r36v6 java.lang.String) = (r36v4 java.lang.String), (r36v7 java.lang.String) binds: [B:59:0x0358, B:11:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x038a A[PHI: r2 r4 r5 r6 r22 r23 r24 r35 r36
      0x038a: PHI (r2v21 int) = (r2v19 int), (r2v22 int) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r4v22 com.lingq.core.database.entity.CardEntity) = (r4v19 com.lingq.core.database.entity.CardEntity), (r4v25 com.lingq.core.database.entity.CardEntity) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r5v24 com.lingq.core.domain.model.user.ProfileAccount) = (r5v22 com.lingq.core.domain.model.user.ProfileAccount), (r5v25 com.lingq.core.domain.model.user.ProfileAccount) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r6v26 int) = (r6v24 int), (r6v27 int) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r22v16 y15) = (r22v13 y15), (r22v18 y15) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r23v12 wv0) = (r23v10 wv0), (r23v14 wv0) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r24v11 java.lang.String) = (r24v9 java.lang.String), (r24v12 java.lang.String) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r35v8 java.lang.String) = (r35v6 java.lang.String), (r35v9 java.lang.String) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r36v8 java.lang.String) = (r36v6 java.lang.String), (r36v9 java.lang.String) binds: [B:62:0x0386, B:10:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x03b1 A[PHI: r2 r4 r5 r6 r12 r13 r22 r23 r24 r35 r36
      0x03b1: PHI (r2v23 int) = (r2v21 int), (r2v25 int) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r4v26 com.lingq.core.database.entity.CardEntity) = (r4v22 com.lingq.core.database.entity.CardEntity), (r4v30 com.lingq.core.database.entity.CardEntity) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r5v26 com.lingq.core.domain.model.user.ProfileAccount) = (r5v24 com.lingq.core.domain.model.user.ProfileAccount), (r5v27 com.lingq.core.domain.model.user.ProfileAccount) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r6v28 int) = (r6v26 int), (r6v29 int) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r12v14 android.os.Bundle) = (r12v13 android.os.Bundle), (r12v15 android.os.Bundle) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r13v7 java.lang.Object) = (r13v6 java.lang.Object), (r13v11 java.lang.Object) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r22v19 y15) = (r22v16 y15), (r22v21 y15) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r23v15 wv0) = (r23v12 wv0), (r23v17 wv0) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r24v13 java.lang.String) = (r24v11 java.lang.String), (r24v14 java.lang.String) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r35v10 java.lang.String) = (r35v8 java.lang.String), (r35v11 java.lang.String) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r36v10 java.lang.String) = (r36v8 java.lang.String), (r36v11 java.lang.String) binds: [B:65:0x03ad, B:9:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x040a  */
    /* JADX WARN: Code duplicated, block: B:76:0x044c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0494  */
    /* JADX WARN: Code duplicated, block: B:83:0x0499  */
    /* JADX WARN: Code duplicated, block: B:85:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:88:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0502  */
    /* JADX WARN: Code duplicated, block: B:94:0x0508  */
    /* JADX WARN: Code duplicated, block: B:95:0x0512  */
    /* JADX WARN: Code duplicated, block: B:98:0x0521  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15541t;
        String str;
        String str2;
        String str3;
        String str4;
        Object objM2861d;
        String str5;
        String str6;
        p7b p7bVar;
        String strM24118n;
        Ref$IntRef ref$IntRef;
        ArrayList arrayList;
        String str7;
        ArrayList arrayList2;
        String str8;
        int i;
        String str9;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Ref$IntRef ref$IntRef2;
        Object objM2861d2;
        String str10;
        ArrayList arrayList5;
        int value;
        int value2;
        int value3;
        int i2;
        CardEntity cardEntity;
        un0 un0Var;
        int i3;
        Object objM15541t2;
        ProfileAccount profileAccount;
        Bundle bundle;
        Object objMo7500z0;
        LessonEntity lessonEntity;
        C1287c c1287c;
        String str11;
        String str12;
        String str13;
        LessonEntity lessonEntityM7642a;
        LessonEntity lessonEntity2;
        C1287c c1287c2;
        String str14;
        int i4;
        AbstractC1320h abstractC1320h;
        List listM23604J;
        int i5;
        CardEntity cardEntity2;
        LessonEntity lessonEntity3;
        Object objM2861d3;
        ProfileAccount profileAccount2;
        String str15;
        Bundle bundle2;
        String str16;
        TokenMeaning tokenMeaning;
        y15 y15Var;
        String str17;
        Pair[] pairArr;
        hi8 hi8Var;
        int i6;
        String str18;
        String str19;
        Integer num;
        C1287c c1287c3 = this.f14669M;
        wv0 wv0Var = c1287c3.f16463l;
        AbstractC1320h abstractC1320h2 = c1287c3.f16455d;
        o7b o7bVar = c1287c3.f16454c;
        y15 y15Var2 = c1287c3.f16462k;
        hm5 hm5Var = c1287c3.f16461j;
        nm7 nm7Var = c1287c3.f16458g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.f14668L;
        String str20 = "Lesson level";
        xfa xfaVar = xfa.f68157a;
        String str21 = this.f14672P;
        int i8 = this.f14677U;
        String str22 = this.f14675S;
        String str23 = this.f14673Q;
        TokenMeaning tokenMeaning2 = this.f14670N;
        switch (i7) {
            case 0:
                AbstractC3193b.m15359b(obj);
                qm7 qm7Var = ((C1369b) nm7Var).f18480m;
                this.f14668L = 1;
                objM15541t = AbstractC3224d.m15541t(qm7Var, this);
                if (objM15541t != coroutineSingletons) {
                    str = ((Profile) objM15541t).f19667p;
                    str2 = tokenMeaning2.f19596c;
                    str3 = tokenMeaning2.f19595b;
                    if (str3 != null) {
                        str3 = null;
                    } else if (vk9.m23391n0(str3)) {
                        str3 = str;
                    }
                    this.f14671O.f47713a = tokenMeaning2.f19602i;
                    this.f14681a = str2;
                    this.f14682b = str3;
                    this.f14668L = 2;
                    str4 = str3;
                    objM2861d = AbstractC0758a.m2861d(new k7b(str21, o7bVar, 0), o7bVar.f53957K, this, true, false);
                    if (objM2861d != coroutineSingletons) {
                        str5 = str4;
                        str6 = str2;
                        p7bVar = (p7b) objM2861d;
                        strM24118n = wq1.m24118n("/", str23, "/");
                        ref$IntRef = new Ref$IntRef();
                        arrayList = new ArrayList();
                        str7 = "Lesson language";
                        arrayList2 = new ArrayList();
                        str8 = "Lesson name";
                        int i9 = tokenMeaning2.f19594a;
                        int i10 = tokenMeaning2.f19598e;
                        boolean z = tokenMeaning2.f19599f;
                        String str24 = tokenMeaning2.f19600g;
                        boolean z2 = tokenMeaning2.f19602i;
                        if (p7bVar != null) {
                            i = p7bVar.f55709c;
                        } else {
                            i = tokenMeaning2.f19603j;
                        }
                        arrayList2.add(new TokenMeaning(i9, str5, str6, i10, z, str24, z2, i, 8));
                        if (p7bVar != null) {
                            p7bVar.m18946i(WordStatus.Card.getValue());
                            ref$IntRef.f47716a = p7bVar.f55710d;
                            if (this.f14679W) {
                                arrayList.addAll(p7bVar.f55712f);
                            }
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = strM24118n;
                            this.f14684d = ref$IntRef;
                            this.f14685e = arrayList;
                            this.f14686f = arrayList2;
                            this.f14687g = null;
                            this.f14665I = 0;
                            this.f14668L = 3;
                            ref$IntRef2 = ref$IntRef;
                            objM2861d2 = AbstractC0758a.m2861d(new r3a(16, o7bVar, p7bVar), o7bVar.f53957K, this, false, true);
                            if (objM2861d2 != coroutineSingletons) {
                                objM2861d2 = xfaVar;
                            }
                            if (objM2861d2 != coroutineSingletons) {
                                str10 = strM24118n;
                                arrayList5 = arrayList;
                                str9 = str10;
                                arrayList3 = arrayList5;
                                arrayList4 = arrayList2;
                                ref$IntRef = ref$IntRef2;
                                value = CardStatus.Known.getValue();
                                value2 = this.f14674R;
                                if (value2 == value) {
                                    value2 = CardStatus.Learned.getValue();
                                    value3 = CardExtendedStatus.Known.getValue();
                                } else {
                                    value3 = CardExtendedStatus.NotKnown.getValue();
                                }
                                i2 = value2;
                                cardEntity = new CardEntity(this.f14675S, this.f14672P, 0, str9, this.f14676T, i2, new Integer(value3), null, null, null, null, ref$IntRef.f47716a, arrayList4, arrayList3, null, null, null, null, null, null, null, null, null, null, y7d.m24985d(str22), y02.m24804b(), 67018752);
                                un0Var = c1287c3.f16453b;
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14665I = i2;
                                this.f14666J = value3;
                                this.f14668L = 4;
                                if (un0Var.mo4095v0(cardEntity, this) != coroutineSingletons) {
                                    i3 = i2;
                                    qm7 qm7Var2 = ((C1369b) nm7Var).f18481n;
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity;
                                    this.f14665I = i3;
                                    this.f14666J = value3;
                                    this.f14668L = 5;
                                    objM15541t2 = AbstractC3224d.m15541t(qm7Var2, this);
                                    if (objM15541t2 != coroutineSingletons) {
                                        profileAccount = (ProfileAccount) objM15541t2;
                                        profileAccount.f19685i++;
                                        this.f14681a = null;
                                        this.f14682b = null;
                                        this.f14683c = null;
                                        this.f14684d = null;
                                        this.f14685e = null;
                                        this.f14686f = null;
                                        this.f14687g = cardEntity;
                                        this.f14688h = profileAccount;
                                        this.f14665I = i3;
                                        this.f14666J = value3;
                                        this.f14668L = 6;
                                        if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                                            bundle = new Bundle();
                                            this.f14681a = null;
                                            this.f14682b = null;
                                            this.f14683c = null;
                                            this.f14684d = null;
                                            this.f14685e = null;
                                            this.f14686f = null;
                                            this.f14687g = cardEntity;
                                            this.f14688h = profileAccount;
                                            this.f14689i = bundle;
                                            this.f14665I = i3;
                                            this.f14666J = value3;
                                            this.f14668L = 7;
                                            objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                                            if (objMo7500z0 != coroutineSingletons) {
                                                lessonEntity = (LessonEntity) objMo7500z0;
                                                if (lessonEntity != null) {
                                                    lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                                    lessonEntity2 = lessonEntity;
                                                    this.f14681a = null;
                                                    this.f14682b = null;
                                                    this.f14683c = null;
                                                    this.f14684d = null;
                                                    this.f14685e = null;
                                                    this.f14686f = null;
                                                    this.f14687g = cardEntity;
                                                    this.f14688h = profileAccount;
                                                    this.f14689i = bundle;
                                                    this.f14690j = lessonEntity2;
                                                    this.f14691k = c1287c3;
                                                    this.f14692l = str21;
                                                    this.f14664H = str23;
                                                    this.f14665I = i3;
                                                    this.f14666J = value3;
                                                    this.f14667K = 0;
                                                    this.f14668L = 8;
                                                    if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                                        c1287c2 = c1287c3;
                                                        c1287c = c1287c2;
                                                        str14 = str23;
                                                        i4 = 0;
                                                        abstractC1320h = c1287c2.f16455d;
                                                        listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                                        this.f14681a = null;
                                                        this.f14682b = null;
                                                        this.f14683c = null;
                                                        this.f14684d = null;
                                                        this.f14685e = null;
                                                        this.f14686f = null;
                                                        this.f14687g = cardEntity;
                                                        this.f14688h = profileAccount;
                                                        this.f14689i = bundle;
                                                        this.f14690j = lessonEntity2;
                                                        this.f14691k = c1287c2;
                                                        this.f14692l = str21;
                                                        this.f14664H = str14;
                                                        this.f14665I = i3;
                                                        this.f14666J = value3;
                                                        this.f14667K = i4;
                                                        this.f14668L = 9;
                                                        if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                                            i5 = i3;
                                                            cardEntity2 = cardEntity;
                                                            lessonEntity3 = lessonEntity2;
                                                            AbstractC1320h abstractC1320h3 = c1287c2.f16455d;
                                                            List listM23604J2 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                                            this.f14681a = null;
                                                            this.f14682b = null;
                                                            this.f14683c = null;
                                                            this.f14684d = null;
                                                            this.f14685e = null;
                                                            this.f14686f = null;
                                                            this.f14687g = cardEntity2;
                                                            this.f14688h = profileAccount;
                                                            this.f14689i = bundle;
                                                            this.f14690j = lessonEntity3;
                                                            this.f14691k = str14;
                                                            this.f14692l = null;
                                                            this.f14664H = null;
                                                            this.f14665I = i5;
                                                            this.f14666J = value3;
                                                            this.f14667K = i4;
                                                            this.f14668L = 10;
                                                            q05 q05Var = (q05) abstractC1320h3;
                                                            objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var, listM23604J2, 5), q05Var.f57071K, this, false, true);
                                                            if (objM2861d3 != coroutineSingletons) {
                                                                objM2861d3 = xfaVar;
                                                            }
                                                            if (objM2861d3 != coroutineSingletons) {
                                                                profileAccount2 = profileAccount;
                                                                str15 = str14;
                                                                bundle2 = bundle;
                                                                bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                                                str13 = str8;
                                                                bundle2.putString(str13, lessonEntity3.f17282e);
                                                                String strM15223q = AbstractC3184kh.m15223q(str15);
                                                                str12 = str7;
                                                                bundle2.putString(str12, strM15223q);
                                                                str11 = str20;
                                                                bundle2.putString(str11, lessonEntity3.f17301n0);
                                                                bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                                                bundle2.putString("Course name", lessonEntity3.f17312t);
                                                                lessonEntity = lessonEntity3;
                                                                cardEntity = cardEntity2;
                                                                bundle = bundle2;
                                                                profileAccount = profileAccount2;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c1287c = c1287c3;
                                                    str23 = str23;
                                                    tokenMeaning2 = tokenMeaning2;
                                                    i8 = i8;
                                                    str11 = str20;
                                                    str12 = str7;
                                                    str13 = str8;
                                                }
                                                str16 = this.f14678V;
                                                if (!vk9.m23391n0(str16)) {
                                                    bundle.putString("lingq created location", str16);
                                                }
                                                bundle.putInt("nth lingq created", profileAccount.f19685i);
                                                if (t7d.m21898c(tokenMeaning2)) {
                                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                                    tokenMeaning = tokenMeaning2;
                                                } else {
                                                    tokenMeaning = tokenMeaning2;
                                                    if (tokenMeaning.f19594a == 0) {
                                                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                                    } else {
                                                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                                    }
                                                }
                                                if (profileAccount.f19685i <= 200) {
                                                    ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                                                }
                                                if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                                    wv0 wv0Var2 = wv0Var;
                                                    wv0Var2.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                                    wv0Var2.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                                } else {
                                                    y15Var = y15Var2;
                                                    y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                                    if (t7d.m21898c(tokenMeaning)) {
                                                        y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                                    } else {
                                                        y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                                    }
                                                    y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                                }
                                                NetworkType networkType = NetworkType.NOT_REQUIRED;
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                NetworkType networkType2 = NetworkType.CONNECTED;
                                                networkType2.getClass();
                                                ak1 ak1Var = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
                                                tx6 tx6Var = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                                                tx6Var.f46873c.f55781j = ak1Var;
                                                str17 = str23;
                                                pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                                                hi8Var = new hi8(10);
                                                for (i6 = 0; i6 < 3; i6++) {
                                                    Pair pair = pairArr[i6];
                                                    hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
                                                }
                                                c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
                                                if (vk9.m23380c0(str22, " ", false) || vk9.m23380c0(str22, "-", false)) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putInt("Lesson ID", i8);
                                                    if (lessonEntity != null) {
                                                        str18 = lessonEntity.f17282e;
                                                    } else {
                                                        str18 = null;
                                                    }
                                                    bundle3.putString(str13, str18);
                                                    bundle3.putString(str12, AbstractC3184kh.m15223q(str17));
                                                    if (lessonEntity != null) {
                                                        str19 = lessonEntity.f17301n0;
                                                    } else {
                                                        str19 = null;
                                                    }
                                                    bundle3.putString(str11, str19);
                                                    bundle3.putBoolean("is related phrase", this.f14680X);
                                                    ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle3);
                                                }
                                                num = profileAccount.f19684h;
                                                if (num != null && profileAccount.f19685i >= num.intValue()) {
                                                    ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                                                }
                                                return xfaVar;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            str9 = strM24118n;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            value = CardStatus.Known.getValue();
                            value2 = this.f14674R;
                            if (value2 == value) {
                                value2 = CardStatus.Learned.getValue();
                                value3 = CardExtendedStatus.Known.getValue();
                            } else {
                                value3 = CardExtendedStatus.NotKnown.getValue();
                            }
                            i2 = value2;
                            cardEntity = new CardEntity(this.f14675S, this.f14672P, 0, str9, this.f14676T, i2, new Integer(value3), null, null, null, null, ref$IntRef.f47716a, arrayList4, arrayList3, null, null, null, null, null, null, null, null, null, null, y7d.m24985d(str22), y02.m24804b(), 67018752);
                            un0Var = c1287c3.f16453b;
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14665I = i2;
                            this.f14666J = value3;
                            this.f14668L = 4;
                            if (un0Var.mo4095v0(cardEntity, this) != coroutineSingletons) {
                                i3 = i2;
                                qm7 qm7Var3 = ((C1369b) nm7Var).f18481n;
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14665I = i3;
                                this.f14666J = value3;
                                this.f14668L = 5;
                                objM15541t2 = AbstractC3224d.m15541t(qm7Var3, this);
                                if (objM15541t2 != coroutineSingletons) {
                                    profileAccount = (ProfileAccount) objM15541t2;
                                    profileAccount.f19685i++;
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity;
                                    this.f14688h = profileAccount;
                                    this.f14665I = i3;
                                    this.f14666J = value3;
                                    this.f14668L = 6;
                                    if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                                        bundle = new Bundle();
                                        this.f14681a = null;
                                        this.f14682b = null;
                                        this.f14683c = null;
                                        this.f14684d = null;
                                        this.f14685e = null;
                                        this.f14686f = null;
                                        this.f14687g = cardEntity;
                                        this.f14688h = profileAccount;
                                        this.f14689i = bundle;
                                        this.f14665I = i3;
                                        this.f14666J = value3;
                                        this.f14668L = 7;
                                        objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                                        if (objMo7500z0 != coroutineSingletons) {
                                            lessonEntity = (LessonEntity) objMo7500z0;
                                            if (lessonEntity != null) {
                                                lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                                lessonEntity2 = lessonEntity;
                                                this.f14681a = null;
                                                this.f14682b = null;
                                                this.f14683c = null;
                                                this.f14684d = null;
                                                this.f14685e = null;
                                                this.f14686f = null;
                                                this.f14687g = cardEntity;
                                                this.f14688h = profileAccount;
                                                this.f14689i = bundle;
                                                this.f14690j = lessonEntity2;
                                                this.f14691k = c1287c3;
                                                this.f14692l = str21;
                                                this.f14664H = str23;
                                                this.f14665I = i3;
                                                this.f14666J = value3;
                                                this.f14667K = 0;
                                                this.f14668L = 8;
                                                if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                                    c1287c2 = c1287c3;
                                                    c1287c = c1287c2;
                                                    str14 = str23;
                                                    i4 = 0;
                                                    abstractC1320h = c1287c2.f16455d;
                                                    listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                                    this.f14681a = null;
                                                    this.f14682b = null;
                                                    this.f14683c = null;
                                                    this.f14684d = null;
                                                    this.f14685e = null;
                                                    this.f14686f = null;
                                                    this.f14687g = cardEntity;
                                                    this.f14688h = profileAccount;
                                                    this.f14689i = bundle;
                                                    this.f14690j = lessonEntity2;
                                                    this.f14691k = c1287c2;
                                                    this.f14692l = str21;
                                                    this.f14664H = str14;
                                                    this.f14665I = i3;
                                                    this.f14666J = value3;
                                                    this.f14667K = i4;
                                                    this.f14668L = 9;
                                                    if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                                        i5 = i3;
                                                        cardEntity2 = cardEntity;
                                                        lessonEntity3 = lessonEntity2;
                                                        AbstractC1320h abstractC1320h4 = c1287c2.f16455d;
                                                        List listM23604J3 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                                        this.f14681a = null;
                                                        this.f14682b = null;
                                                        this.f14683c = null;
                                                        this.f14684d = null;
                                                        this.f14685e = null;
                                                        this.f14686f = null;
                                                        this.f14687g = cardEntity2;
                                                        this.f14688h = profileAccount;
                                                        this.f14689i = bundle;
                                                        this.f14690j = lessonEntity3;
                                                        this.f14691k = str14;
                                                        this.f14692l = null;
                                                        this.f14664H = null;
                                                        this.f14665I = i5;
                                                        this.f14666J = value3;
                                                        this.f14667K = i4;
                                                        this.f14668L = 10;
                                                        q05 q05Var2 = (q05) abstractC1320h4;
                                                        objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var2, listM23604J3, 5), q05Var2.f57071K, this, false, true);
                                                        if (objM2861d3 != coroutineSingletons) {
                                                            objM2861d3 = xfaVar;
                                                        }
                                                        if (objM2861d3 != coroutineSingletons) {
                                                            profileAccount2 = profileAccount;
                                                            str15 = str14;
                                                            bundle2 = bundle;
                                                            bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                                            str13 = str8;
                                                            bundle2.putString(str13, lessonEntity3.f17282e);
                                                            String strM15223q2 = AbstractC3184kh.m15223q(str15);
                                                            str12 = str7;
                                                            bundle2.putString(str12, strM15223q2);
                                                            str11 = str20;
                                                            bundle2.putString(str11, lessonEntity3.f17301n0);
                                                            bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                                            bundle2.putString("Course name", lessonEntity3.f17312t);
                                                            lessonEntity = lessonEntity3;
                                                            cardEntity = cardEntity2;
                                                            bundle = bundle2;
                                                            profileAccount = profileAccount2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                c1287c = c1287c3;
                                                str23 = str23;
                                                tokenMeaning2 = tokenMeaning2;
                                                i8 = i8;
                                                str11 = str20;
                                                str12 = str7;
                                                str13 = str8;
                                            }
                                            str16 = this.f14678V;
                                            if (!vk9.m23391n0(str16)) {
                                                bundle.putString("lingq created location", str16);
                                            }
                                            bundle.putInt("nth lingq created", profileAccount.f19685i);
                                            if (t7d.m21898c(tokenMeaning2)) {
                                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                                tokenMeaning = tokenMeaning2;
                                            } else {
                                                tokenMeaning = tokenMeaning2;
                                                if (tokenMeaning.f19594a == 0) {
                                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                                } else {
                                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                                }
                                            }
                                            if (profileAccount.f19685i <= 200) {
                                                ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                                            }
                                            if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                                wv0 wv0Var3 = wv0Var;
                                                wv0Var3.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                                wv0Var3.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                            } else {
                                                y15Var = y15Var2;
                                                y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                                if (t7d.m21898c(tokenMeaning)) {
                                                    y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                                } else {
                                                    y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                                }
                                                y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                            }
                                            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            NetworkType networkType4 = NetworkType.CONNECTED;
                                            networkType4.getClass();
                                            ak1 ak1Var2 = new ak1(new gk6(null), networkType4, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet2));
                                            tx6 tx6Var2 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                                            tx6Var2.f46873c.f55781j = ak1Var2;
                                            str17 = str23;
                                            pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                                            hi8Var = new hi8(10);
                                            while (i6 < 3) {
                                                Pair pair2 = pairArr[i6];
                                                hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                                            }
                                            c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
                                            if (vk9.m23380c0(str22, " ", false)) {
                                                Bundle bundle4 = new Bundle();
                                                bundle4.putInt("Lesson ID", i8);
                                                if (lessonEntity != null) {
                                                    str18 = lessonEntity.f17282e;
                                                } else {
                                                    str18 = null;
                                                }
                                                bundle4.putString(str13, str18);
                                                bundle4.putString(str12, AbstractC3184kh.m15223q(str17));
                                                if (lessonEntity != null) {
                                                    str19 = lessonEntity.f17301n0;
                                                } else {
                                                    str19 = null;
                                                }
                                                bundle4.putString(str11, str19);
                                                bundle4.putBoolean("is related phrase", this.f14680X);
                                                ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle4);
                                            } else {
                                                Bundle bundle5 = new Bundle();
                                                bundle5.putInt("Lesson ID", i8);
                                                if (lessonEntity != null) {
                                                    str18 = lessonEntity.f17282e;
                                                } else {
                                                    str18 = null;
                                                }
                                                bundle5.putString(str13, str18);
                                                bundle5.putString(str12, AbstractC3184kh.m15223q(str17));
                                                if (lessonEntity != null) {
                                                    str19 = lessonEntity.f17301n0;
                                                } else {
                                                    str19 = null;
                                                }
                                                bundle5.putString(str11, str19);
                                                bundle5.putBoolean("is related phrase", this.f14680X);
                                                ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle5);
                                            }
                                            num = profileAccount.f19684h;
                                            if (num != null) {
                                                ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                                            }
                                            return xfaVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(obj);
                objM15541t = obj;
                str = ((Profile) objM15541t).f19667p;
                str2 = tokenMeaning2.f19596c;
                str3 = tokenMeaning2.f19595b;
                if (str3 != null) {
                    str3 = null;
                } else if (vk9.m23391n0(str3)) {
                    str3 = str;
                }
                this.f14671O.f47713a = tokenMeaning2.f19602i;
                this.f14681a = str2;
                this.f14682b = str3;
                this.f14668L = 2;
                str4 = str3;
                objM2861d = AbstractC0758a.m2861d(new k7b(str21, o7bVar, 0), o7bVar.f53957K, this, true, false);
                if (objM2861d != coroutineSingletons) {
                    str5 = str4;
                    str6 = str2;
                    p7bVar = (p7b) objM2861d;
                    strM24118n = wq1.m24118n("/", str23, "/");
                    ref$IntRef = new Ref$IntRef();
                    arrayList = new ArrayList();
                    str7 = "Lesson language";
                    arrayList2 = new ArrayList();
                    str8 = "Lesson name";
                    int i11 = tokenMeaning2.f19594a;
                    int i12 = tokenMeaning2.f19598e;
                    boolean z3 = tokenMeaning2.f19599f;
                    String str25 = tokenMeaning2.f19600g;
                    boolean z4 = tokenMeaning2.f19602i;
                    if (p7bVar != null) {
                        i = p7bVar.f55709c;
                    } else {
                        i = tokenMeaning2.f19603j;
                    }
                    arrayList2.add(new TokenMeaning(i11, str5, str6, i12, z3, str25, z4, i, 8));
                    if (p7bVar != null) {
                        p7bVar.m18946i(WordStatus.Card.getValue());
                        ref$IntRef.f47716a = p7bVar.f55710d;
                        if (this.f14679W) {
                            arrayList.addAll(p7bVar.f55712f);
                        }
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = strM24118n;
                        this.f14684d = ref$IntRef;
                        this.f14685e = arrayList;
                        this.f14686f = arrayList2;
                        this.f14687g = null;
                        this.f14665I = 0;
                        this.f14668L = 3;
                        ref$IntRef2 = ref$IntRef;
                        objM2861d2 = AbstractC0758a.m2861d(new r3a(16, o7bVar, p7bVar), o7bVar.f53957K, this, false, true);
                        if (objM2861d2 != coroutineSingletons) {
                            objM2861d2 = xfaVar;
                        }
                        if (objM2861d2 != coroutineSingletons) {
                            str10 = strM24118n;
                            arrayList5 = arrayList;
                            str9 = str10;
                            arrayList3 = arrayList5;
                            arrayList4 = arrayList2;
                            ref$IntRef = ref$IntRef2;
                            value = CardStatus.Known.getValue();
                            value2 = this.f14674R;
                            if (value2 == value) {
                                value2 = CardStatus.Learned.getValue();
                                value3 = CardExtendedStatus.Known.getValue();
                            } else {
                                value3 = CardExtendedStatus.NotKnown.getValue();
                            }
                            i2 = value2;
                            cardEntity = new CardEntity(this.f14675S, this.f14672P, 0, str9, this.f14676T, i2, new Integer(value3), null, null, null, null, ref$IntRef.f47716a, arrayList4, arrayList3, null, null, null, null, null, null, null, null, null, null, y7d.m24985d(str22), y02.m24804b(), 67018752);
                            un0Var = c1287c3.f16453b;
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14665I = i2;
                            this.f14666J = value3;
                            this.f14668L = 4;
                            if (un0Var.mo4095v0(cardEntity, this) != coroutineSingletons) {
                                i3 = i2;
                                qm7 qm7Var4 = ((C1369b) nm7Var).f18481n;
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14665I = i3;
                                this.f14666J = value3;
                                this.f14668L = 5;
                                objM15541t2 = AbstractC3224d.m15541t(qm7Var4, this);
                                if (objM15541t2 != coroutineSingletons) {
                                    profileAccount = (ProfileAccount) objM15541t2;
                                    profileAccount.f19685i++;
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity;
                                    this.f14688h = profileAccount;
                                    this.f14665I = i3;
                                    this.f14666J = value3;
                                    this.f14668L = 6;
                                    if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                                        bundle = new Bundle();
                                        this.f14681a = null;
                                        this.f14682b = null;
                                        this.f14683c = null;
                                        this.f14684d = null;
                                        this.f14685e = null;
                                        this.f14686f = null;
                                        this.f14687g = cardEntity;
                                        this.f14688h = profileAccount;
                                        this.f14689i = bundle;
                                        this.f14665I = i3;
                                        this.f14666J = value3;
                                        this.f14668L = 7;
                                        objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                                        if (objMo7500z0 != coroutineSingletons) {
                                            lessonEntity = (LessonEntity) objMo7500z0;
                                            if (lessonEntity != null) {
                                                lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                                lessonEntity2 = lessonEntity;
                                                this.f14681a = null;
                                                this.f14682b = null;
                                                this.f14683c = null;
                                                this.f14684d = null;
                                                this.f14685e = null;
                                                this.f14686f = null;
                                                this.f14687g = cardEntity;
                                                this.f14688h = profileAccount;
                                                this.f14689i = bundle;
                                                this.f14690j = lessonEntity2;
                                                this.f14691k = c1287c3;
                                                this.f14692l = str21;
                                                this.f14664H = str23;
                                                this.f14665I = i3;
                                                this.f14666J = value3;
                                                this.f14667K = 0;
                                                this.f14668L = 8;
                                                if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                                    c1287c2 = c1287c3;
                                                    c1287c = c1287c2;
                                                    str14 = str23;
                                                    i4 = 0;
                                                    abstractC1320h = c1287c2.f16455d;
                                                    listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                                    this.f14681a = null;
                                                    this.f14682b = null;
                                                    this.f14683c = null;
                                                    this.f14684d = null;
                                                    this.f14685e = null;
                                                    this.f14686f = null;
                                                    this.f14687g = cardEntity;
                                                    this.f14688h = profileAccount;
                                                    this.f14689i = bundle;
                                                    this.f14690j = lessonEntity2;
                                                    this.f14691k = c1287c2;
                                                    this.f14692l = str21;
                                                    this.f14664H = str14;
                                                    this.f14665I = i3;
                                                    this.f14666J = value3;
                                                    this.f14667K = i4;
                                                    this.f14668L = 9;
                                                    if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                                        i5 = i3;
                                                        cardEntity2 = cardEntity;
                                                        lessonEntity3 = lessonEntity2;
                                                        AbstractC1320h abstractC1320h5 = c1287c2.f16455d;
                                                        List listM23604J4 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                                        this.f14681a = null;
                                                        this.f14682b = null;
                                                        this.f14683c = null;
                                                        this.f14684d = null;
                                                        this.f14685e = null;
                                                        this.f14686f = null;
                                                        this.f14687g = cardEntity2;
                                                        this.f14688h = profileAccount;
                                                        this.f14689i = bundle;
                                                        this.f14690j = lessonEntity3;
                                                        this.f14691k = str14;
                                                        this.f14692l = null;
                                                        this.f14664H = null;
                                                        this.f14665I = i5;
                                                        this.f14666J = value3;
                                                        this.f14667K = i4;
                                                        this.f14668L = 10;
                                                        q05 q05Var3 = (q05) abstractC1320h5;
                                                        objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var3, listM23604J4, 5), q05Var3.f57071K, this, false, true);
                                                        if (objM2861d3 != coroutineSingletons) {
                                                            objM2861d3 = xfaVar;
                                                        }
                                                        if (objM2861d3 != coroutineSingletons) {
                                                            profileAccount2 = profileAccount;
                                                            str15 = str14;
                                                            bundle2 = bundle;
                                                            bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                                            str13 = str8;
                                                            bundle2.putString(str13, lessonEntity3.f17282e);
                                                            String strM15223q3 = AbstractC3184kh.m15223q(str15);
                                                            str12 = str7;
                                                            bundle2.putString(str12, strM15223q3);
                                                            str11 = str20;
                                                            bundle2.putString(str11, lessonEntity3.f17301n0);
                                                            bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                                            bundle2.putString("Course name", lessonEntity3.f17312t);
                                                            lessonEntity = lessonEntity3;
                                                            cardEntity = cardEntity2;
                                                            bundle = bundle2;
                                                            profileAccount = profileAccount2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                c1287c = c1287c3;
                                                str23 = str23;
                                                tokenMeaning2 = tokenMeaning2;
                                                i8 = i8;
                                                str11 = str20;
                                                str12 = str7;
                                                str13 = str8;
                                            }
                                            str16 = this.f14678V;
                                            if (!vk9.m23391n0(str16)) {
                                                bundle.putString("lingq created location", str16);
                                            }
                                            bundle.putInt("nth lingq created", profileAccount.f19685i);
                                            if (t7d.m21898c(tokenMeaning2)) {
                                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                                tokenMeaning = tokenMeaning2;
                                            } else {
                                                tokenMeaning = tokenMeaning2;
                                                if (tokenMeaning.f19594a == 0) {
                                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                                } else {
                                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                                }
                                            }
                                            if (profileAccount.f19685i <= 200) {
                                                ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                                            }
                                            if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                                wv0 wv0Var4 = wv0Var;
                                                wv0Var4.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                                wv0Var4.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                            } else {
                                                y15Var = y15Var2;
                                                y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                                if (t7d.m21898c(tokenMeaning)) {
                                                    y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                                } else {
                                                    y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                                }
                                                y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                            }
                                            NetworkType networkType5 = NetworkType.NOT_REQUIRED;
                                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                            NetworkType networkType6 = NetworkType.CONNECTED;
                                            networkType6.getClass();
                                            ak1 ak1Var3 = new ak1(new gk6(null), networkType6, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet3));
                                            tx6 tx6Var3 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                                            tx6Var3.f46873c.f55781j = ak1Var3;
                                            str17 = str23;
                                            pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                                            hi8Var = new hi8(10);
                                            while (i6 < 3) {
                                                Pair pair3 = pairArr[i6];
                                                hi8Var.m13287x(pair3.f47624b, (String) pair3.f47623a);
                                            }
                                            c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var3.m15008g(hi8Var.m13282k())).m15004a());
                                            if (vk9.m23380c0(str22, " ", false)) {
                                                Bundle bundle6 = new Bundle();
                                                bundle6.putInt("Lesson ID", i8);
                                                if (lessonEntity != null) {
                                                    str18 = lessonEntity.f17282e;
                                                } else {
                                                    str18 = null;
                                                }
                                                bundle6.putString(str13, str18);
                                                bundle6.putString(str12, AbstractC3184kh.m15223q(str17));
                                                if (lessonEntity != null) {
                                                    str19 = lessonEntity.f17301n0;
                                                } else {
                                                    str19 = null;
                                                }
                                                bundle6.putString(str11, str19);
                                                bundle6.putBoolean("is related phrase", this.f14680X);
                                                ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle6);
                                            } else {
                                                Bundle bundle7 = new Bundle();
                                                bundle7.putInt("Lesson ID", i8);
                                                if (lessonEntity != null) {
                                                    str18 = lessonEntity.f17282e;
                                                } else {
                                                    str18 = null;
                                                }
                                                bundle7.putString(str13, str18);
                                                bundle7.putString(str12, AbstractC3184kh.m15223q(str17));
                                                if (lessonEntity != null) {
                                                    str19 = lessonEntity.f17301n0;
                                                } else {
                                                    str19 = null;
                                                }
                                                bundle7.putString(str11, str19);
                                                bundle7.putBoolean("is related phrase", this.f14680X);
                                                ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle7);
                                            }
                                            num = profileAccount.f19684h;
                                            if (num != null) {
                                                ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                                            }
                                            return xfaVar;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str9 = strM24118n;
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        value = CardStatus.Known.getValue();
                        value2 = this.f14674R;
                        if (value2 == value) {
                            value2 = CardStatus.Learned.getValue();
                            value3 = CardExtendedStatus.Known.getValue();
                        } else {
                            value3 = CardExtendedStatus.NotKnown.getValue();
                        }
                        i2 = value2;
                        cardEntity = new CardEntity(this.f14675S, this.f14672P, 0, str9, this.f14676T, i2, new Integer(value3), null, null, null, null, ref$IntRef.f47716a, arrayList4, arrayList3, null, null, null, null, null, null, null, null, null, null, y7d.m24985d(str22), y02.m24804b(), 67018752);
                        un0Var = c1287c3.f16453b;
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = null;
                        this.f14684d = null;
                        this.f14685e = null;
                        this.f14686f = null;
                        this.f14687g = cardEntity;
                        this.f14665I = i2;
                        this.f14666J = value3;
                        this.f14668L = 4;
                        if (un0Var.mo4095v0(cardEntity, this) != coroutineSingletons) {
                            i3 = i2;
                            qm7 qm7Var5 = ((C1369b) nm7Var).f18481n;
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14665I = i3;
                            this.f14666J = value3;
                            this.f14668L = 5;
                            objM15541t2 = AbstractC3224d.m15541t(qm7Var5, this);
                            if (objM15541t2 != coroutineSingletons) {
                                profileAccount = (ProfileAccount) objM15541t2;
                                profileAccount.f19685i++;
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14688h = profileAccount;
                                this.f14665I = i3;
                                this.f14666J = value3;
                                this.f14668L = 6;
                                if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                                    bundle = new Bundle();
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity;
                                    this.f14688h = profileAccount;
                                    this.f14689i = bundle;
                                    this.f14665I = i3;
                                    this.f14666J = value3;
                                    this.f14668L = 7;
                                    objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                                    if (objMo7500z0 != coroutineSingletons) {
                                        lessonEntity = (LessonEntity) objMo7500z0;
                                        if (lessonEntity != null) {
                                            lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                            lessonEntity2 = lessonEntity;
                                            this.f14681a = null;
                                            this.f14682b = null;
                                            this.f14683c = null;
                                            this.f14684d = null;
                                            this.f14685e = null;
                                            this.f14686f = null;
                                            this.f14687g = cardEntity;
                                            this.f14688h = profileAccount;
                                            this.f14689i = bundle;
                                            this.f14690j = lessonEntity2;
                                            this.f14691k = c1287c3;
                                            this.f14692l = str21;
                                            this.f14664H = str23;
                                            this.f14665I = i3;
                                            this.f14666J = value3;
                                            this.f14667K = 0;
                                            this.f14668L = 8;
                                            if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                                c1287c2 = c1287c3;
                                                c1287c = c1287c2;
                                                str14 = str23;
                                                i4 = 0;
                                                abstractC1320h = c1287c2.f16455d;
                                                listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                                this.f14681a = null;
                                                this.f14682b = null;
                                                this.f14683c = null;
                                                this.f14684d = null;
                                                this.f14685e = null;
                                                this.f14686f = null;
                                                this.f14687g = cardEntity;
                                                this.f14688h = profileAccount;
                                                this.f14689i = bundle;
                                                this.f14690j = lessonEntity2;
                                                this.f14691k = c1287c2;
                                                this.f14692l = str21;
                                                this.f14664H = str14;
                                                this.f14665I = i3;
                                                this.f14666J = value3;
                                                this.f14667K = i4;
                                                this.f14668L = 9;
                                                if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                                    i5 = i3;
                                                    cardEntity2 = cardEntity;
                                                    lessonEntity3 = lessonEntity2;
                                                    AbstractC1320h abstractC1320h6 = c1287c2.f16455d;
                                                    List listM23604J5 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                                    this.f14681a = null;
                                                    this.f14682b = null;
                                                    this.f14683c = null;
                                                    this.f14684d = null;
                                                    this.f14685e = null;
                                                    this.f14686f = null;
                                                    this.f14687g = cardEntity2;
                                                    this.f14688h = profileAccount;
                                                    this.f14689i = bundle;
                                                    this.f14690j = lessonEntity3;
                                                    this.f14691k = str14;
                                                    this.f14692l = null;
                                                    this.f14664H = null;
                                                    this.f14665I = i5;
                                                    this.f14666J = value3;
                                                    this.f14667K = i4;
                                                    this.f14668L = 10;
                                                    q05 q05Var4 = (q05) abstractC1320h6;
                                                    objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var4, listM23604J5, 5), q05Var4.f57071K, this, false, true);
                                                    if (objM2861d3 != coroutineSingletons) {
                                                        objM2861d3 = xfaVar;
                                                    }
                                                    if (objM2861d3 != coroutineSingletons) {
                                                        profileAccount2 = profileAccount;
                                                        str15 = str14;
                                                        bundle2 = bundle;
                                                        bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                                        str13 = str8;
                                                        bundle2.putString(str13, lessonEntity3.f17282e);
                                                        String strM15223q4 = AbstractC3184kh.m15223q(str15);
                                                        str12 = str7;
                                                        bundle2.putString(str12, strM15223q4);
                                                        str11 = str20;
                                                        bundle2.putString(str11, lessonEntity3.f17301n0);
                                                        bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                                        bundle2.putString("Course name", lessonEntity3.f17312t);
                                                        lessonEntity = lessonEntity3;
                                                        cardEntity = cardEntity2;
                                                        bundle = bundle2;
                                                        profileAccount = profileAccount2;
                                                    }
                                                }
                                            }
                                        } else {
                                            c1287c = c1287c3;
                                            str23 = str23;
                                            tokenMeaning2 = tokenMeaning2;
                                            i8 = i8;
                                            str11 = str20;
                                            str12 = str7;
                                            str13 = str8;
                                        }
                                        str16 = this.f14678V;
                                        if (!vk9.m23391n0(str16)) {
                                            bundle.putString("lingq created location", str16);
                                        }
                                        bundle.putInt("nth lingq created", profileAccount.f19685i);
                                        if (t7d.m21898c(tokenMeaning2)) {
                                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                            tokenMeaning = tokenMeaning2;
                                        } else {
                                            tokenMeaning = tokenMeaning2;
                                            if (tokenMeaning.f19594a == 0) {
                                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                            } else {
                                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                            }
                                        }
                                        if (profileAccount.f19685i <= 200) {
                                            ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                                        }
                                        if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                            wv0 wv0Var5 = wv0Var;
                                            wv0Var5.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                            wv0Var5.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                        } else {
                                            y15Var = y15Var2;
                                            y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                            if (t7d.m21898c(tokenMeaning)) {
                                                y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                            } else {
                                                y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                            }
                                            y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                        }
                                        NetworkType networkType7 = NetworkType.NOT_REQUIRED;
                                        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                        NetworkType networkType8 = NetworkType.CONNECTED;
                                        networkType8.getClass();
                                        ak1 ak1Var4 = new ak1(new gk6(null), networkType8, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet4));
                                        tx6 tx6Var4 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                                        tx6Var4.f46873c.f55781j = ak1Var4;
                                        str17 = str23;
                                        pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                                        hi8Var = new hi8(10);
                                        while (i6 < 3) {
                                            Pair pair4 = pairArr[i6];
                                            hi8Var.m13287x(pair4.f47624b, (String) pair4.f47623a);
                                        }
                                        c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var4.m15008g(hi8Var.m13282k())).m15004a());
                                        if (vk9.m23380c0(str22, " ", false)) {
                                            Bundle bundle8 = new Bundle();
                                            bundle8.putInt("Lesson ID", i8);
                                            if (lessonEntity != null) {
                                                str18 = lessonEntity.f17282e;
                                            } else {
                                                str18 = null;
                                            }
                                            bundle8.putString(str13, str18);
                                            bundle8.putString(str12, AbstractC3184kh.m15223q(str17));
                                            if (lessonEntity != null) {
                                                str19 = lessonEntity.f17301n0;
                                            } else {
                                                str19 = null;
                                            }
                                            bundle8.putString(str11, str19);
                                            bundle8.putBoolean("is related phrase", this.f14680X);
                                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle8);
                                        } else {
                                            Bundle bundle9 = new Bundle();
                                            bundle9.putInt("Lesson ID", i8);
                                            if (lessonEntity != null) {
                                                str18 = lessonEntity.f17282e;
                                            } else {
                                                str18 = null;
                                            }
                                            bundle9.putString(str13, str18);
                                            bundle9.putString(str12, AbstractC3184kh.m15223q(str17));
                                            if (lessonEntity != null) {
                                                str19 = lessonEntity.f17301n0;
                                            } else {
                                                str19 = null;
                                            }
                                            bundle9.putString(str11, str19);
                                            bundle9.putBoolean("is related phrase", this.f14680X);
                                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle9);
                                        }
                                        num = profileAccount.f19684h;
                                        if (num != null) {
                                            ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
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
                String str26 = this.f14682b;
                String str27 = this.f14681a;
                AbstractC3193b.m15359b(obj);
                str6 = str27;
                str5 = str26;
                objM2861d = obj;
                y15Var2 = y15Var2;
                p7bVar = (p7b) objM2861d;
                strM24118n = wq1.m24118n("/", str23, "/");
                ref$IntRef = new Ref$IntRef();
                arrayList = new ArrayList();
                str7 = "Lesson language";
                arrayList2 = new ArrayList();
                str8 = "Lesson name";
                int i13 = tokenMeaning2.f19594a;
                int i14 = tokenMeaning2.f19598e;
                boolean z5 = tokenMeaning2.f19599f;
                String str28 = tokenMeaning2.f19600g;
                boolean z6 = tokenMeaning2.f19602i;
                if (p7bVar != null) {
                    i = p7bVar.f55709c;
                } else {
                    i = tokenMeaning2.f19603j;
                }
                arrayList2.add(new TokenMeaning(i13, str5, str6, i14, z5, str28, z6, i, 8));
                if (p7bVar != null) {
                    p7bVar.m18946i(WordStatus.Card.getValue());
                    ref$IntRef.f47716a = p7bVar.f55710d;
                    if (this.f14679W) {
                        arrayList.addAll(p7bVar.f55712f);
                    }
                    this.f14681a = null;
                    this.f14682b = null;
                    this.f14683c = strM24118n;
                    this.f14684d = ref$IntRef;
                    this.f14685e = arrayList;
                    this.f14686f = arrayList2;
                    this.f14687g = null;
                    this.f14665I = 0;
                    this.f14668L = 3;
                    ref$IntRef2 = ref$IntRef;
                    objM2861d2 = AbstractC0758a.m2861d(new r3a(16, o7bVar, p7bVar), o7bVar.f53957K, this, false, true);
                    if (objM2861d2 != coroutineSingletons) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 != coroutineSingletons) {
                        str10 = strM24118n;
                        arrayList5 = arrayList;
                        str9 = str10;
                        arrayList3 = arrayList5;
                        arrayList4 = arrayList2;
                        ref$IntRef = ref$IntRef2;
                        value = CardStatus.Known.getValue();
                        value2 = this.f14674R;
                        if (value2 == value) {
                            value2 = CardStatus.Learned.getValue();
                            value3 = CardExtendedStatus.Known.getValue();
                        } else {
                            value3 = CardExtendedStatus.NotKnown.getValue();
                        }
                        i2 = value2;
                        cardEntity = new CardEntity(this.f14675S, this.f14672P, 0, str9, this.f14676T, i2, new Integer(value3), null, null, null, null, ref$IntRef.f47716a, arrayList4, arrayList3, null, null, null, null, null, null, null, null, null, null, y7d.m24985d(str22), y02.m24804b(), 67018752);
                        un0Var = c1287c3.f16453b;
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = null;
                        this.f14684d = null;
                        this.f14685e = null;
                        this.f14686f = null;
                        this.f14687g = cardEntity;
                        this.f14665I = i2;
                        this.f14666J = value3;
                        this.f14668L = 4;
                        if (un0Var.mo4095v0(cardEntity, this) != coroutineSingletons) {
                            i3 = i2;
                            qm7 qm7Var6 = ((C1369b) nm7Var).f18481n;
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14665I = i3;
                            this.f14666J = value3;
                            this.f14668L = 5;
                            objM15541t2 = AbstractC3224d.m15541t(qm7Var6, this);
                            if (objM15541t2 != coroutineSingletons) {
                                profileAccount = (ProfileAccount) objM15541t2;
                                profileAccount.f19685i++;
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14688h = profileAccount;
                                this.f14665I = i3;
                                this.f14666J = value3;
                                this.f14668L = 6;
                                if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                                    bundle = new Bundle();
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity;
                                    this.f14688h = profileAccount;
                                    this.f14689i = bundle;
                                    this.f14665I = i3;
                                    this.f14666J = value3;
                                    this.f14668L = 7;
                                    objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                                    if (objMo7500z0 != coroutineSingletons) {
                                        lessonEntity = (LessonEntity) objMo7500z0;
                                        if (lessonEntity != null) {
                                            lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                            lessonEntity2 = lessonEntity;
                                            this.f14681a = null;
                                            this.f14682b = null;
                                            this.f14683c = null;
                                            this.f14684d = null;
                                            this.f14685e = null;
                                            this.f14686f = null;
                                            this.f14687g = cardEntity;
                                            this.f14688h = profileAccount;
                                            this.f14689i = bundle;
                                            this.f14690j = lessonEntity2;
                                            this.f14691k = c1287c3;
                                            this.f14692l = str21;
                                            this.f14664H = str23;
                                            this.f14665I = i3;
                                            this.f14666J = value3;
                                            this.f14667K = 0;
                                            this.f14668L = 8;
                                            if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                                c1287c2 = c1287c3;
                                                c1287c = c1287c2;
                                                str14 = str23;
                                                i4 = 0;
                                                abstractC1320h = c1287c2.f16455d;
                                                listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                                this.f14681a = null;
                                                this.f14682b = null;
                                                this.f14683c = null;
                                                this.f14684d = null;
                                                this.f14685e = null;
                                                this.f14686f = null;
                                                this.f14687g = cardEntity;
                                                this.f14688h = profileAccount;
                                                this.f14689i = bundle;
                                                this.f14690j = lessonEntity2;
                                                this.f14691k = c1287c2;
                                                this.f14692l = str21;
                                                this.f14664H = str14;
                                                this.f14665I = i3;
                                                this.f14666J = value3;
                                                this.f14667K = i4;
                                                this.f14668L = 9;
                                                if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                                    i5 = i3;
                                                    cardEntity2 = cardEntity;
                                                    lessonEntity3 = lessonEntity2;
                                                    AbstractC1320h abstractC1320h7 = c1287c2.f16455d;
                                                    List listM23604J6 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                                    this.f14681a = null;
                                                    this.f14682b = null;
                                                    this.f14683c = null;
                                                    this.f14684d = null;
                                                    this.f14685e = null;
                                                    this.f14686f = null;
                                                    this.f14687g = cardEntity2;
                                                    this.f14688h = profileAccount;
                                                    this.f14689i = bundle;
                                                    this.f14690j = lessonEntity3;
                                                    this.f14691k = str14;
                                                    this.f14692l = null;
                                                    this.f14664H = null;
                                                    this.f14665I = i5;
                                                    this.f14666J = value3;
                                                    this.f14667K = i4;
                                                    this.f14668L = 10;
                                                    q05 q05Var5 = (q05) abstractC1320h7;
                                                    objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var5, listM23604J6, 5), q05Var5.f57071K, this, false, true);
                                                    if (objM2861d3 != coroutineSingletons) {
                                                        objM2861d3 = xfaVar;
                                                    }
                                                    if (objM2861d3 != coroutineSingletons) {
                                                        profileAccount2 = profileAccount;
                                                        str15 = str14;
                                                        bundle2 = bundle;
                                                        bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                                        str13 = str8;
                                                        bundle2.putString(str13, lessonEntity3.f17282e);
                                                        String strM15223q5 = AbstractC3184kh.m15223q(str15);
                                                        str12 = str7;
                                                        bundle2.putString(str12, strM15223q5);
                                                        str11 = str20;
                                                        bundle2.putString(str11, lessonEntity3.f17301n0);
                                                        bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                                        bundle2.putString("Course name", lessonEntity3.f17312t);
                                                        lessonEntity = lessonEntity3;
                                                        cardEntity = cardEntity2;
                                                        bundle = bundle2;
                                                        profileAccount = profileAccount2;
                                                    }
                                                }
                                            }
                                        } else {
                                            c1287c = c1287c3;
                                            str23 = str23;
                                            tokenMeaning2 = tokenMeaning2;
                                            i8 = i8;
                                            str11 = str20;
                                            str12 = str7;
                                            str13 = str8;
                                        }
                                        str16 = this.f14678V;
                                        if (!vk9.m23391n0(str16)) {
                                            bundle.putString("lingq created location", str16);
                                        }
                                        bundle.putInt("nth lingq created", profileAccount.f19685i);
                                        if (t7d.m21898c(tokenMeaning2)) {
                                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                            tokenMeaning = tokenMeaning2;
                                        } else {
                                            tokenMeaning = tokenMeaning2;
                                            if (tokenMeaning.f19594a == 0) {
                                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                            } else {
                                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                            }
                                        }
                                        if (profileAccount.f19685i <= 200) {
                                            ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                                        }
                                        if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                            wv0 wv0Var6 = wv0Var;
                                            wv0Var6.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                            wv0Var6.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                        } else {
                                            y15Var = y15Var2;
                                            y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                            if (t7d.m21898c(tokenMeaning)) {
                                                y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                            } else {
                                                y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                            }
                                            y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                        }
                                        NetworkType networkType9 = NetworkType.NOT_REQUIRED;
                                        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                                        NetworkType networkType10 = NetworkType.CONNECTED;
                                        networkType10.getClass();
                                        ak1 ak1Var5 = new ak1(new gk6(null), networkType10, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet5));
                                        tx6 tx6Var5 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                                        tx6Var5.f46873c.f55781j = ak1Var5;
                                        str17 = str23;
                                        pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                                        hi8Var = new hi8(10);
                                        while (i6 < 3) {
                                            Pair pair5 = pairArr[i6];
                                            hi8Var.m13287x(pair5.f47624b, (String) pair5.f47623a);
                                        }
                                        c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var5.m15008g(hi8Var.m13282k())).m15004a());
                                        if (vk9.m23380c0(str22, " ", false)) {
                                            Bundle bundle10 = new Bundle();
                                            bundle10.putInt("Lesson ID", i8);
                                            if (lessonEntity != null) {
                                                str18 = lessonEntity.f17282e;
                                            } else {
                                                str18 = null;
                                            }
                                            bundle10.putString(str13, str18);
                                            bundle10.putString(str12, AbstractC3184kh.m15223q(str17));
                                            if (lessonEntity != null) {
                                                str19 = lessonEntity.f17301n0;
                                            } else {
                                                str19 = null;
                                            }
                                            bundle10.putString(str11, str19);
                                            bundle10.putBoolean("is related phrase", this.f14680X);
                                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle10);
                                        } else {
                                            Bundle bundle11 = new Bundle();
                                            bundle11.putInt("Lesson ID", i8);
                                            if (lessonEntity != null) {
                                                str18 = lessonEntity.f17282e;
                                            } else {
                                                str18 = null;
                                            }
                                            bundle11.putString(str13, str18);
                                            bundle11.putString(str12, AbstractC3184kh.m15223q(str17));
                                            if (lessonEntity != null) {
                                                str19 = lessonEntity.f17301n0;
                                            } else {
                                                str19 = null;
                                            }
                                            bundle11.putString(str11, str19);
                                            bundle11.putBoolean("is related phrase", this.f14680X);
                                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle11);
                                        }
                                        num = profileAccount.f19684h;
                                        if (num != null) {
                                            ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                                        }
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str9 = strM24118n;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    value = CardStatus.Known.getValue();
                    value2 = this.f14674R;
                    if (value2 == value) {
                        value2 = CardStatus.Learned.getValue();
                        value3 = CardExtendedStatus.Known.getValue();
                    } else {
                        value3 = CardExtendedStatus.NotKnown.getValue();
                    }
                    i2 = value2;
                    cardEntity = new CardEntity(this.f14675S, this.f14672P, 0, str9, this.f14676T, i2, new Integer(value3), null, null, null, null, ref$IntRef.f47716a, arrayList4, arrayList3, null, null, null, null, null, null, null, null, null, null, y7d.m24985d(str22), y02.m24804b(), 67018752);
                    un0Var = c1287c3.f16453b;
                    this.f14681a = null;
                    this.f14682b = null;
                    this.f14683c = null;
                    this.f14684d = null;
                    this.f14685e = null;
                    this.f14686f = null;
                    this.f14687g = cardEntity;
                    this.f14665I = i2;
                    this.f14666J = value3;
                    this.f14668L = 4;
                    if (un0Var.mo4095v0(cardEntity, this) != coroutineSingletons) {
                        i3 = i2;
                        qm7 qm7Var7 = ((C1369b) nm7Var).f18481n;
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = null;
                        this.f14684d = null;
                        this.f14685e = null;
                        this.f14686f = null;
                        this.f14687g = cardEntity;
                        this.f14665I = i3;
                        this.f14666J = value3;
                        this.f14668L = 5;
                        objM15541t2 = AbstractC3224d.m15541t(qm7Var7, this);
                        if (objM15541t2 != coroutineSingletons) {
                            profileAccount = (ProfileAccount) objM15541t2;
                            profileAccount.f19685i++;
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14688h = profileAccount;
                            this.f14665I = i3;
                            this.f14666J = value3;
                            this.f14668L = 6;
                            if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                                bundle = new Bundle();
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14688h = profileAccount;
                                this.f14689i = bundle;
                                this.f14665I = i3;
                                this.f14666J = value3;
                                this.f14668L = 7;
                                objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                                if (objMo7500z0 != coroutineSingletons) {
                                    lessonEntity = (LessonEntity) objMo7500z0;
                                    if (lessonEntity != null) {
                                        lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                        lessonEntity2 = lessonEntity;
                                        this.f14681a = null;
                                        this.f14682b = null;
                                        this.f14683c = null;
                                        this.f14684d = null;
                                        this.f14685e = null;
                                        this.f14686f = null;
                                        this.f14687g = cardEntity;
                                        this.f14688h = profileAccount;
                                        this.f14689i = bundle;
                                        this.f14690j = lessonEntity2;
                                        this.f14691k = c1287c3;
                                        this.f14692l = str21;
                                        this.f14664H = str23;
                                        this.f14665I = i3;
                                        this.f14666J = value3;
                                        this.f14667K = 0;
                                        this.f14668L = 8;
                                        if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                            c1287c2 = c1287c3;
                                            c1287c = c1287c2;
                                            str14 = str23;
                                            i4 = 0;
                                            abstractC1320h = c1287c2.f16455d;
                                            listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                            this.f14681a = null;
                                            this.f14682b = null;
                                            this.f14683c = null;
                                            this.f14684d = null;
                                            this.f14685e = null;
                                            this.f14686f = null;
                                            this.f14687g = cardEntity;
                                            this.f14688h = profileAccount;
                                            this.f14689i = bundle;
                                            this.f14690j = lessonEntity2;
                                            this.f14691k = c1287c2;
                                            this.f14692l = str21;
                                            this.f14664H = str14;
                                            this.f14665I = i3;
                                            this.f14666J = value3;
                                            this.f14667K = i4;
                                            this.f14668L = 9;
                                            if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                                i5 = i3;
                                                cardEntity2 = cardEntity;
                                                lessonEntity3 = lessonEntity2;
                                                AbstractC1320h abstractC1320h8 = c1287c2.f16455d;
                                                List listM23604J7 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                                this.f14681a = null;
                                                this.f14682b = null;
                                                this.f14683c = null;
                                                this.f14684d = null;
                                                this.f14685e = null;
                                                this.f14686f = null;
                                                this.f14687g = cardEntity2;
                                                this.f14688h = profileAccount;
                                                this.f14689i = bundle;
                                                this.f14690j = lessonEntity3;
                                                this.f14691k = str14;
                                                this.f14692l = null;
                                                this.f14664H = null;
                                                this.f14665I = i5;
                                                this.f14666J = value3;
                                                this.f14667K = i4;
                                                this.f14668L = 10;
                                                q05 q05Var6 = (q05) abstractC1320h8;
                                                objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var6, listM23604J7, 5), q05Var6.f57071K, this, false, true);
                                                if (objM2861d3 != coroutineSingletons) {
                                                    objM2861d3 = xfaVar;
                                                }
                                                if (objM2861d3 != coroutineSingletons) {
                                                    profileAccount2 = profileAccount;
                                                    str15 = str14;
                                                    bundle2 = bundle;
                                                    bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                                    str13 = str8;
                                                    bundle2.putString(str13, lessonEntity3.f17282e);
                                                    String strM15223q6 = AbstractC3184kh.m15223q(str15);
                                                    str12 = str7;
                                                    bundle2.putString(str12, strM15223q6);
                                                    str11 = str20;
                                                    bundle2.putString(str11, lessonEntity3.f17301n0);
                                                    bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                                    bundle2.putString("Course name", lessonEntity3.f17312t);
                                                    lessonEntity = lessonEntity3;
                                                    cardEntity = cardEntity2;
                                                    bundle = bundle2;
                                                    profileAccount = profileAccount2;
                                                }
                                            }
                                        }
                                    } else {
                                        c1287c = c1287c3;
                                        str23 = str23;
                                        tokenMeaning2 = tokenMeaning2;
                                        i8 = i8;
                                        str11 = str20;
                                        str12 = str7;
                                        str13 = str8;
                                    }
                                    str16 = this.f14678V;
                                    if (!vk9.m23391n0(str16)) {
                                        bundle.putString("lingq created location", str16);
                                    }
                                    bundle.putInt("nth lingq created", profileAccount.f19685i);
                                    if (t7d.m21898c(tokenMeaning2)) {
                                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                        tokenMeaning = tokenMeaning2;
                                    } else {
                                        tokenMeaning = tokenMeaning2;
                                        if (tokenMeaning.f19594a == 0) {
                                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                        } else {
                                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                        }
                                    }
                                    if (profileAccount.f19685i <= 200) {
                                        ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                                    }
                                    if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                        wv0 wv0Var7 = wv0Var;
                                        wv0Var7.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                        wv0Var7.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                    } else {
                                        y15Var = y15Var2;
                                        y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                        if (t7d.m21898c(tokenMeaning)) {
                                            y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                        } else {
                                            y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                        }
                                        y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                    }
                                    NetworkType networkType11 = NetworkType.NOT_REQUIRED;
                                    LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                                    NetworkType networkType12 = NetworkType.CONNECTED;
                                    networkType12.getClass();
                                    ak1 ak1Var6 = new ak1(new gk6(null), networkType12, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet6));
                                    tx6 tx6Var6 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                                    tx6Var6.f46873c.f55781j = ak1Var6;
                                    str17 = str23;
                                    pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                                    hi8Var = new hi8(10);
                                    while (i6 < 3) {
                                        Pair pair6 = pairArr[i6];
                                        hi8Var.m13287x(pair6.f47624b, (String) pair6.f47623a);
                                    }
                                    c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var6.m15008g(hi8Var.m13282k())).m15004a());
                                    if (vk9.m23380c0(str22, " ", false)) {
                                        Bundle bundle12 = new Bundle();
                                        bundle12.putInt("Lesson ID", i8);
                                        if (lessonEntity != null) {
                                            str18 = lessonEntity.f17282e;
                                        } else {
                                            str18 = null;
                                        }
                                        bundle12.putString(str13, str18);
                                        bundle12.putString(str12, AbstractC3184kh.m15223q(str17));
                                        if (lessonEntity != null) {
                                            str19 = lessonEntity.f17301n0;
                                        } else {
                                            str19 = null;
                                        }
                                        bundle12.putString(str11, str19);
                                        bundle12.putBoolean("is related phrase", this.f14680X);
                                        ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle12);
                                    } else {
                                        Bundle bundle13 = new Bundle();
                                        bundle13.putInt("Lesson ID", i8);
                                        if (lessonEntity != null) {
                                            str18 = lessonEntity.f17282e;
                                        } else {
                                            str18 = null;
                                        }
                                        bundle13.putString(str13, str18);
                                        bundle13.putString(str12, AbstractC3184kh.m15223q(str17));
                                        if (lessonEntity != null) {
                                            str19 = lessonEntity.f17301n0;
                                        } else {
                                            str19 = null;
                                        }
                                        bundle13.putString(str11, str19);
                                        bundle13.putBoolean("is related phrase", this.f14680X);
                                        ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle13);
                                    }
                                    num = profileAccount.f19684h;
                                    if (num != null) {
                                        ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                                    }
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                ArrayList arrayList6 = this.f14686f;
                arrayList5 = this.f14685e;
                Ref$IntRef ref$IntRef3 = this.f14684d;
                str10 = this.f14683c;
                AbstractC3193b.m15359b(obj);
                str20 = "Lesson level";
                str7 = "Lesson language";
                str8 = "Lesson name";
                arrayList2 = arrayList6;
                ref$IntRef2 = ref$IntRef3;
                wv0Var = wv0Var;
                y15Var2 = y15Var2;
                str9 = str10;
                arrayList3 = arrayList5;
                arrayList4 = arrayList2;
                ref$IntRef = ref$IntRef2;
                value = CardStatus.Known.getValue();
                value2 = this.f14674R;
                if (value2 == value) {
                    value2 = CardStatus.Learned.getValue();
                    value3 = CardExtendedStatus.Known.getValue();
                } else {
                    value3 = CardExtendedStatus.NotKnown.getValue();
                }
                i2 = value2;
                cardEntity = new CardEntity(this.f14675S, this.f14672P, 0, str9, this.f14676T, i2, new Integer(value3), null, null, null, null, ref$IntRef.f47716a, arrayList4, arrayList3, null, null, null, null, null, null, null, null, null, null, y7d.m24985d(str22), y02.m24804b(), 67018752);
                un0Var = c1287c3.f16453b;
                this.f14681a = null;
                this.f14682b = null;
                this.f14683c = null;
                this.f14684d = null;
                this.f14685e = null;
                this.f14686f = null;
                this.f14687g = cardEntity;
                this.f14665I = i2;
                this.f14666J = value3;
                this.f14668L = 4;
                if (un0Var.mo4095v0(cardEntity, this) != coroutineSingletons) {
                    i3 = i2;
                    qm7 qm7Var8 = ((C1369b) nm7Var).f18481n;
                    this.f14681a = null;
                    this.f14682b = null;
                    this.f14683c = null;
                    this.f14684d = null;
                    this.f14685e = null;
                    this.f14686f = null;
                    this.f14687g = cardEntity;
                    this.f14665I = i3;
                    this.f14666J = value3;
                    this.f14668L = 5;
                    objM15541t2 = AbstractC3224d.m15541t(qm7Var8, this);
                    if (objM15541t2 != coroutineSingletons) {
                        profileAccount = (ProfileAccount) objM15541t2;
                        profileAccount.f19685i++;
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = null;
                        this.f14684d = null;
                        this.f14685e = null;
                        this.f14686f = null;
                        this.f14687g = cardEntity;
                        this.f14688h = profileAccount;
                        this.f14665I = i3;
                        this.f14666J = value3;
                        this.f14668L = 6;
                        if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                            bundle = new Bundle();
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14688h = profileAccount;
                            this.f14689i = bundle;
                            this.f14665I = i3;
                            this.f14666J = value3;
                            this.f14668L = 7;
                            objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                            if (objMo7500z0 != coroutineSingletons) {
                                lessonEntity = (LessonEntity) objMo7500z0;
                                if (lessonEntity != null) {
                                    lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                    lessonEntity2 = lessonEntity;
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity;
                                    this.f14688h = profileAccount;
                                    this.f14689i = bundle;
                                    this.f14690j = lessonEntity2;
                                    this.f14691k = c1287c3;
                                    this.f14692l = str21;
                                    this.f14664H = str23;
                                    this.f14665I = i3;
                                    this.f14666J = value3;
                                    this.f14667K = 0;
                                    this.f14668L = 8;
                                    if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                        c1287c2 = c1287c3;
                                        c1287c = c1287c2;
                                        str14 = str23;
                                        i4 = 0;
                                        abstractC1320h = c1287c2.f16455d;
                                        listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                        this.f14681a = null;
                                        this.f14682b = null;
                                        this.f14683c = null;
                                        this.f14684d = null;
                                        this.f14685e = null;
                                        this.f14686f = null;
                                        this.f14687g = cardEntity;
                                        this.f14688h = profileAccount;
                                        this.f14689i = bundle;
                                        this.f14690j = lessonEntity2;
                                        this.f14691k = c1287c2;
                                        this.f14692l = str21;
                                        this.f14664H = str14;
                                        this.f14665I = i3;
                                        this.f14666J = value3;
                                        this.f14667K = i4;
                                        this.f14668L = 9;
                                        if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                            i5 = i3;
                                            cardEntity2 = cardEntity;
                                            lessonEntity3 = lessonEntity2;
                                            AbstractC1320h abstractC1320h9 = c1287c2.f16455d;
                                            List listM23604J8 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                            this.f14681a = null;
                                            this.f14682b = null;
                                            this.f14683c = null;
                                            this.f14684d = null;
                                            this.f14685e = null;
                                            this.f14686f = null;
                                            this.f14687g = cardEntity2;
                                            this.f14688h = profileAccount;
                                            this.f14689i = bundle;
                                            this.f14690j = lessonEntity3;
                                            this.f14691k = str14;
                                            this.f14692l = null;
                                            this.f14664H = null;
                                            this.f14665I = i5;
                                            this.f14666J = value3;
                                            this.f14667K = i4;
                                            this.f14668L = 10;
                                            q05 q05Var7 = (q05) abstractC1320h9;
                                            objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var7, listM23604J8, 5), q05Var7.f57071K, this, false, true);
                                            if (objM2861d3 != coroutineSingletons) {
                                                objM2861d3 = xfaVar;
                                            }
                                            if (objM2861d3 != coroutineSingletons) {
                                                profileAccount2 = profileAccount;
                                                str15 = str14;
                                                bundle2 = bundle;
                                                bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                                str13 = str8;
                                                bundle2.putString(str13, lessonEntity3.f17282e);
                                                String strM15223q7 = AbstractC3184kh.m15223q(str15);
                                                str12 = str7;
                                                bundle2.putString(str12, strM15223q7);
                                                str11 = str20;
                                                bundle2.putString(str11, lessonEntity3.f17301n0);
                                                bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                                bundle2.putString("Course name", lessonEntity3.f17312t);
                                                lessonEntity = lessonEntity3;
                                                cardEntity = cardEntity2;
                                                bundle = bundle2;
                                                profileAccount = profileAccount2;
                                            }
                                        }
                                    }
                                } else {
                                    c1287c = c1287c3;
                                    str23 = str23;
                                    tokenMeaning2 = tokenMeaning2;
                                    i8 = i8;
                                    str11 = str20;
                                    str12 = str7;
                                    str13 = str8;
                                }
                                str16 = this.f14678V;
                                if (!vk9.m23391n0(str16)) {
                                    bundle.putString("lingq created location", str16);
                                }
                                bundle.putInt("nth lingq created", profileAccount.f19685i);
                                if (t7d.m21898c(tokenMeaning2)) {
                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                    tokenMeaning = tokenMeaning2;
                                } else {
                                    tokenMeaning = tokenMeaning2;
                                    if (tokenMeaning.f19594a == 0) {
                                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                    } else {
                                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                    }
                                }
                                if (profileAccount.f19685i <= 200) {
                                    ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                                }
                                if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                    wv0 wv0Var8 = wv0Var;
                                    wv0Var8.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                    wv0Var8.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                } else {
                                    y15Var = y15Var2;
                                    y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                    if (t7d.m21898c(tokenMeaning)) {
                                        y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                    } else {
                                        y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                    }
                                    y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                                }
                                NetworkType networkType13 = NetworkType.NOT_REQUIRED;
                                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                                NetworkType networkType14 = NetworkType.CONNECTED;
                                networkType14.getClass();
                                ak1 ak1Var7 = new ak1(new gk6(null), networkType14, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet7));
                                tx6 tx6Var7 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                                tx6Var7.f46873c.f55781j = ak1Var7;
                                str17 = str23;
                                pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                                hi8Var = new hi8(10);
                                while (i6 < 3) {
                                    Pair pair7 = pairArr[i6];
                                    hi8Var.m13287x(pair7.f47624b, (String) pair7.f47623a);
                                }
                                c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var7.m15008g(hi8Var.m13282k())).m15004a());
                                if (vk9.m23380c0(str22, " ", false)) {
                                    Bundle bundle14 = new Bundle();
                                    bundle14.putInt("Lesson ID", i8);
                                    if (lessonEntity != null) {
                                        str18 = lessonEntity.f17282e;
                                    } else {
                                        str18 = null;
                                    }
                                    bundle14.putString(str13, str18);
                                    bundle14.putString(str12, AbstractC3184kh.m15223q(str17));
                                    if (lessonEntity != null) {
                                        str19 = lessonEntity.f17301n0;
                                    } else {
                                        str19 = null;
                                    }
                                    bundle14.putString(str11, str19);
                                    bundle14.putBoolean("is related phrase", this.f14680X);
                                    ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle14);
                                } else {
                                    Bundle bundle15 = new Bundle();
                                    bundle15.putInt("Lesson ID", i8);
                                    if (lessonEntity != null) {
                                        str18 = lessonEntity.f17282e;
                                    } else {
                                        str18 = null;
                                    }
                                    bundle15.putString(str13, str18);
                                    bundle15.putString(str12, AbstractC3184kh.m15223q(str17));
                                    if (lessonEntity != null) {
                                        str19 = lessonEntity.f17301n0;
                                    } else {
                                        str19 = null;
                                    }
                                    bundle15.putString(str11, str19);
                                    bundle15.putBoolean("is related phrase", this.f14680X);
                                    ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle15);
                                }
                                num = profileAccount.f19684h;
                                if (num != null) {
                                    ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                                }
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                int i15 = this.f14666J;
                i3 = this.f14665I;
                cardEntity = this.f14687g;
                AbstractC3193b.m15359b(obj);
                wv0Var = wv0Var;
                str20 = "Lesson level";
                str7 = "Lesson language";
                str8 = "Lesson name";
                value3 = i15;
                y15Var2 = y15Var2;
                qm7 qm7Var9 = ((C1369b) nm7Var).f18481n;
                this.f14681a = null;
                this.f14682b = null;
                this.f14683c = null;
                this.f14684d = null;
                this.f14685e = null;
                this.f14686f = null;
                this.f14687g = cardEntity;
                this.f14665I = i3;
                this.f14666J = value3;
                this.f14668L = 5;
                objM15541t2 = AbstractC3224d.m15541t(qm7Var9, this);
                if (objM15541t2 != coroutineSingletons) {
                    profileAccount = (ProfileAccount) objM15541t2;
                    profileAccount.f19685i++;
                    this.f14681a = null;
                    this.f14682b = null;
                    this.f14683c = null;
                    this.f14684d = null;
                    this.f14685e = null;
                    this.f14686f = null;
                    this.f14687g = cardEntity;
                    this.f14688h = profileAccount;
                    this.f14665I = i3;
                    this.f14666J = value3;
                    this.f14668L = 6;
                    if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                        bundle = new Bundle();
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = null;
                        this.f14684d = null;
                        this.f14685e = null;
                        this.f14686f = null;
                        this.f14687g = cardEntity;
                        this.f14688h = profileAccount;
                        this.f14689i = bundle;
                        this.f14665I = i3;
                        this.f14666J = value3;
                        this.f14668L = 7;
                        objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                        if (objMo7500z0 != coroutineSingletons) {
                            lessonEntity = (LessonEntity) objMo7500z0;
                            if (lessonEntity != null) {
                                lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                                lessonEntity2 = lessonEntity;
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14688h = profileAccount;
                                this.f14689i = bundle;
                                this.f14690j = lessonEntity2;
                                this.f14691k = c1287c3;
                                this.f14692l = str21;
                                this.f14664H = str23;
                                this.f14665I = i3;
                                this.f14666J = value3;
                                this.f14667K = 0;
                                this.f14668L = 8;
                                if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                    c1287c2 = c1287c3;
                                    c1287c = c1287c2;
                                    str14 = str23;
                                    i4 = 0;
                                    abstractC1320h = c1287c2.f16455d;
                                    listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity;
                                    this.f14688h = profileAccount;
                                    this.f14689i = bundle;
                                    this.f14690j = lessonEntity2;
                                    this.f14691k = c1287c2;
                                    this.f14692l = str21;
                                    this.f14664H = str14;
                                    this.f14665I = i3;
                                    this.f14666J = value3;
                                    this.f14667K = i4;
                                    this.f14668L = 9;
                                    if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                        i5 = i3;
                                        cardEntity2 = cardEntity;
                                        lessonEntity3 = lessonEntity2;
                                        AbstractC1320h abstractC1320h10 = c1287c2.f16455d;
                                        List listM23604J9 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                        this.f14681a = null;
                                        this.f14682b = null;
                                        this.f14683c = null;
                                        this.f14684d = null;
                                        this.f14685e = null;
                                        this.f14686f = null;
                                        this.f14687g = cardEntity2;
                                        this.f14688h = profileAccount;
                                        this.f14689i = bundle;
                                        this.f14690j = lessonEntity3;
                                        this.f14691k = str14;
                                        this.f14692l = null;
                                        this.f14664H = null;
                                        this.f14665I = i5;
                                        this.f14666J = value3;
                                        this.f14667K = i4;
                                        this.f14668L = 10;
                                        q05 q05Var8 = (q05) abstractC1320h10;
                                        objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var8, listM23604J9, 5), q05Var8.f57071K, this, false, true);
                                        if (objM2861d3 != coroutineSingletons) {
                                            objM2861d3 = xfaVar;
                                        }
                                        if (objM2861d3 != coroutineSingletons) {
                                            profileAccount2 = profileAccount;
                                            str15 = str14;
                                            bundle2 = bundle;
                                            bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                            str13 = str8;
                                            bundle2.putString(str13, lessonEntity3.f17282e);
                                            String strM15223q8 = AbstractC3184kh.m15223q(str15);
                                            str12 = str7;
                                            bundle2.putString(str12, strM15223q8);
                                            str11 = str20;
                                            bundle2.putString(str11, lessonEntity3.f17301n0);
                                            bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                            bundle2.putString("Course name", lessonEntity3.f17312t);
                                            lessonEntity = lessonEntity3;
                                            cardEntity = cardEntity2;
                                            bundle = bundle2;
                                            profileAccount = profileAccount2;
                                        }
                                    }
                                }
                            } else {
                                c1287c = c1287c3;
                                str23 = str23;
                                tokenMeaning2 = tokenMeaning2;
                                i8 = i8;
                                str11 = str20;
                                str12 = str7;
                                str13 = str8;
                            }
                            str16 = this.f14678V;
                            if (!vk9.m23391n0(str16)) {
                                bundle.putString("lingq created location", str16);
                            }
                            bundle.putInt("nth lingq created", profileAccount.f19685i);
                            if (t7d.m21898c(tokenMeaning2)) {
                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                                tokenMeaning = tokenMeaning2;
                            } else {
                                tokenMeaning = tokenMeaning2;
                                if (tokenMeaning.f19594a == 0) {
                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                                } else {
                                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                                }
                            }
                            if (profileAccount.f19685i <= 200) {
                                ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                            }
                            if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                                wv0 wv0Var9 = wv0Var;
                                wv0Var9.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                                wv0Var9.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                            } else {
                                y15Var = y15Var2;
                                y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                                if (t7d.m21898c(tokenMeaning)) {
                                    y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                                } else {
                                    y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                                }
                                y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                            }
                            NetworkType networkType15 = NetworkType.NOT_REQUIRED;
                            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                            NetworkType networkType16 = NetworkType.CONNECTED;
                            networkType16.getClass();
                            ak1 ak1Var8 = new ak1(new gk6(null), networkType16, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet8));
                            tx6 tx6Var8 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                            tx6Var8.f46873c.f55781j = ak1Var8;
                            str17 = str23;
                            pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                            hi8Var = new hi8(10);
                            while (i6 < 3) {
                                Pair pair8 = pairArr[i6];
                                hi8Var.m13287x(pair8.f47624b, (String) pair8.f47623a);
                            }
                            c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var8.m15008g(hi8Var.m13282k())).m15004a());
                            if (vk9.m23380c0(str22, " ", false)) {
                                Bundle bundle16 = new Bundle();
                                bundle16.putInt("Lesson ID", i8);
                                if (lessonEntity != null) {
                                    str18 = lessonEntity.f17282e;
                                } else {
                                    str18 = null;
                                }
                                bundle16.putString(str13, str18);
                                bundle16.putString(str12, AbstractC3184kh.m15223q(str17));
                                if (lessonEntity != null) {
                                    str19 = lessonEntity.f17301n0;
                                } else {
                                    str19 = null;
                                }
                                bundle16.putString(str11, str19);
                                bundle16.putBoolean("is related phrase", this.f14680X);
                                ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle16);
                            } else {
                                Bundle bundle17 = new Bundle();
                                bundle17.putInt("Lesson ID", i8);
                                if (lessonEntity != null) {
                                    str18 = lessonEntity.f17282e;
                                } else {
                                    str18 = null;
                                }
                                bundle17.putString(str13, str18);
                                bundle17.putString(str12, AbstractC3184kh.m15223q(str17));
                                if (lessonEntity != null) {
                                    str19 = lessonEntity.f17301n0;
                                } else {
                                    str19 = null;
                                }
                                bundle17.putString(str11, str19);
                                bundle17.putBoolean("is related phrase", this.f14680X);
                                ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle17);
                            }
                            num = profileAccount.f19684h;
                            if (num != null) {
                                ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                            }
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                int i16 = this.f14666J;
                i3 = this.f14665I;
                cardEntity = this.f14687g;
                AbstractC3193b.m15359b(obj);
                wv0Var = wv0Var;
                str20 = "Lesson level";
                str7 = "Lesson language";
                str8 = "Lesson name";
                value3 = i16;
                y15Var2 = y15Var2;
                objM15541t2 = obj;
                profileAccount = (ProfileAccount) objM15541t2;
                profileAccount.f19685i++;
                this.f14681a = null;
                this.f14682b = null;
                this.f14683c = null;
                this.f14684d = null;
                this.f14685e = null;
                this.f14686f = null;
                this.f14687g = cardEntity;
                this.f14688h = profileAccount;
                this.f14665I = i3;
                this.f14666J = value3;
                this.f14668L = 6;
                if (((C1369b) nm7Var).m7921h(profileAccount, this) != coroutineSingletons) {
                    bundle = new Bundle();
                    this.f14681a = null;
                    this.f14682b = null;
                    this.f14683c = null;
                    this.f14684d = null;
                    this.f14685e = null;
                    this.f14686f = null;
                    this.f14687g = cardEntity;
                    this.f14688h = profileAccount;
                    this.f14689i = bundle;
                    this.f14665I = i3;
                    this.f14666J = value3;
                    this.f14668L = 7;
                    objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                    if (objMo7500z0 != coroutineSingletons) {
                        lessonEntity = (LessonEntity) objMo7500z0;
                        if (lessonEntity != null) {
                            lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                            lessonEntity2 = lessonEntity;
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14688h = profileAccount;
                            this.f14689i = bundle;
                            this.f14690j = lessonEntity2;
                            this.f14691k = c1287c3;
                            this.f14692l = str21;
                            this.f14664H = str23;
                            this.f14665I = i3;
                            this.f14666J = value3;
                            this.f14667K = 0;
                            this.f14668L = 8;
                            if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                                c1287c2 = c1287c3;
                                c1287c = c1287c2;
                                str14 = str23;
                                i4 = 0;
                                abstractC1320h = c1287c2.f16455d;
                                listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity;
                                this.f14688h = profileAccount;
                                this.f14689i = bundle;
                                this.f14690j = lessonEntity2;
                                this.f14691k = c1287c2;
                                this.f14692l = str21;
                                this.f14664H = str14;
                                this.f14665I = i3;
                                this.f14666J = value3;
                                this.f14667K = i4;
                                this.f14668L = 9;
                                if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                    i5 = i3;
                                    cardEntity2 = cardEntity;
                                    lessonEntity3 = lessonEntity2;
                                    AbstractC1320h abstractC1320h11 = c1287c2.f16455d;
                                    List listM23604J10 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                    this.f14681a = null;
                                    this.f14682b = null;
                                    this.f14683c = null;
                                    this.f14684d = null;
                                    this.f14685e = null;
                                    this.f14686f = null;
                                    this.f14687g = cardEntity2;
                                    this.f14688h = profileAccount;
                                    this.f14689i = bundle;
                                    this.f14690j = lessonEntity3;
                                    this.f14691k = str14;
                                    this.f14692l = null;
                                    this.f14664H = null;
                                    this.f14665I = i5;
                                    this.f14666J = value3;
                                    this.f14667K = i4;
                                    this.f14668L = 10;
                                    q05 q05Var9 = (q05) abstractC1320h11;
                                    objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var9, listM23604J10, 5), q05Var9.f57071K, this, false, true);
                                    if (objM2861d3 != coroutineSingletons) {
                                        objM2861d3 = xfaVar;
                                    }
                                    if (objM2861d3 != coroutineSingletons) {
                                        profileAccount2 = profileAccount;
                                        str15 = str14;
                                        bundle2 = bundle;
                                        bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                        str13 = str8;
                                        bundle2.putString(str13, lessonEntity3.f17282e);
                                        String strM15223q9 = AbstractC3184kh.m15223q(str15);
                                        str12 = str7;
                                        bundle2.putString(str12, strM15223q9);
                                        str11 = str20;
                                        bundle2.putString(str11, lessonEntity3.f17301n0);
                                        bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                        bundle2.putString("Course name", lessonEntity3.f17312t);
                                        lessonEntity = lessonEntity3;
                                        cardEntity = cardEntity2;
                                        bundle = bundle2;
                                        profileAccount = profileAccount2;
                                    }
                                }
                            }
                        } else {
                            c1287c = c1287c3;
                            str23 = str23;
                            tokenMeaning2 = tokenMeaning2;
                            i8 = i8;
                            str11 = str20;
                            str12 = str7;
                            str13 = str8;
                        }
                        str16 = this.f14678V;
                        if (!vk9.m23391n0(str16)) {
                            bundle.putString("lingq created location", str16);
                        }
                        bundle.putInt("nth lingq created", profileAccount.f19685i);
                        if (t7d.m21898c(tokenMeaning2)) {
                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                            tokenMeaning = tokenMeaning2;
                        } else {
                            tokenMeaning = tokenMeaning2;
                            if (tokenMeaning.f19594a == 0) {
                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                            } else {
                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                            }
                        }
                        if (profileAccount.f19685i <= 200) {
                            ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                        }
                        if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                            wv0 wv0Var10 = wv0Var;
                            wv0Var10.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                            wv0Var10.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                        } else {
                            y15Var = y15Var2;
                            y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                            if (t7d.m21898c(tokenMeaning)) {
                                y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                            } else {
                                y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                            }
                            y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                        }
                        NetworkType networkType17 = NetworkType.NOT_REQUIRED;
                        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                        NetworkType networkType18 = NetworkType.CONNECTED;
                        networkType18.getClass();
                        ak1 ak1Var9 = new ak1(new gk6(null), networkType18, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet9));
                        tx6 tx6Var9 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                        tx6Var9.f46873c.f55781j = ak1Var9;
                        str17 = str23;
                        pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                        hi8Var = new hi8(10);
                        while (i6 < 3) {
                            Pair pair9 = pairArr[i6];
                            hi8Var.m13287x(pair9.f47624b, (String) pair9.f47623a);
                        }
                        c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var9.m15008g(hi8Var.m13282k())).m15004a());
                        if (vk9.m23380c0(str22, " ", false)) {
                            Bundle bundle18 = new Bundle();
                            bundle18.putInt("Lesson ID", i8);
                            if (lessonEntity != null) {
                                str18 = lessonEntity.f17282e;
                            } else {
                                str18 = null;
                            }
                            bundle18.putString(str13, str18);
                            bundle18.putString(str12, AbstractC3184kh.m15223q(str17));
                            if (lessonEntity != null) {
                                str19 = lessonEntity.f17301n0;
                            } else {
                                str19 = null;
                            }
                            bundle18.putString(str11, str19);
                            bundle18.putBoolean("is related phrase", this.f14680X);
                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle18);
                        } else {
                            Bundle bundle19 = new Bundle();
                            bundle19.putInt("Lesson ID", i8);
                            if (lessonEntity != null) {
                                str18 = lessonEntity.f17282e;
                            } else {
                                str18 = null;
                            }
                            bundle19.putString(str13, str18);
                            bundle19.putString(str12, AbstractC3184kh.m15223q(str17));
                            if (lessonEntity != null) {
                                str19 = lessonEntity.f17301n0;
                            } else {
                                str19 = null;
                            }
                            bundle19.putString(str11, str19);
                            bundle19.putBoolean("is related phrase", this.f14680X);
                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle19);
                        }
                        num = profileAccount.f19684h;
                        if (num != null) {
                            ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                        }
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 6:
                int i17 = this.f14666J;
                i3 = this.f14665I;
                ProfileAccount profileAccount3 = this.f14688h;
                cardEntity = this.f14687g;
                AbstractC3193b.m15359b(obj);
                y15Var2 = y15Var2;
                profileAccount = profileAccount3;
                wv0Var = wv0Var;
                str20 = "Lesson level";
                str7 = "Lesson language";
                str8 = "Lesson name";
                value3 = i17;
                bundle = new Bundle();
                this.f14681a = null;
                this.f14682b = null;
                this.f14683c = null;
                this.f14684d = null;
                this.f14685e = null;
                this.f14686f = null;
                this.f14687g = cardEntity;
                this.f14688h = profileAccount;
                this.f14689i = bundle;
                this.f14665I = i3;
                this.f14666J = value3;
                this.f14668L = 7;
                objMo7500z0 = abstractC1320h2.mo7500z0(i8, this);
                if (objMo7500z0 != coroutineSingletons) {
                    lessonEntity = (LessonEntity) objMo7500z0;
                    if (lessonEntity != null) {
                        lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                        lessonEntity2 = lessonEntity;
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = null;
                        this.f14684d = null;
                        this.f14685e = null;
                        this.f14686f = null;
                        this.f14687g = cardEntity;
                        this.f14688h = profileAccount;
                        this.f14689i = bundle;
                        this.f14690j = lessonEntity2;
                        this.f14691k = c1287c3;
                        this.f14692l = str21;
                        this.f14664H = str23;
                        this.f14665I = i3;
                        this.f14666J = value3;
                        this.f14667K = 0;
                        this.f14668L = 8;
                        if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                            c1287c2 = c1287c3;
                            c1287c = c1287c2;
                            str14 = str23;
                            i4 = 0;
                            abstractC1320h = c1287c2.f16455d;
                            listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity;
                            this.f14688h = profileAccount;
                            this.f14689i = bundle;
                            this.f14690j = lessonEntity2;
                            this.f14691k = c1287c2;
                            this.f14692l = str21;
                            this.f14664H = str14;
                            this.f14665I = i3;
                            this.f14666J = value3;
                            this.f14667K = i4;
                            this.f14668L = 9;
                            if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                                i5 = i3;
                                cardEntity2 = cardEntity;
                                lessonEntity3 = lessonEntity2;
                                AbstractC1320h abstractC1320h12 = c1287c2.f16455d;
                                List listM23604J11 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                                this.f14681a = null;
                                this.f14682b = null;
                                this.f14683c = null;
                                this.f14684d = null;
                                this.f14685e = null;
                                this.f14686f = null;
                                this.f14687g = cardEntity2;
                                this.f14688h = profileAccount;
                                this.f14689i = bundle;
                                this.f14690j = lessonEntity3;
                                this.f14691k = str14;
                                this.f14692l = null;
                                this.f14664H = null;
                                this.f14665I = i5;
                                this.f14666J = value3;
                                this.f14667K = i4;
                                this.f14668L = 10;
                                q05 q05Var10 = (q05) abstractC1320h12;
                                objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var10, listM23604J11, 5), q05Var10.f57071K, this, false, true);
                                if (objM2861d3 != coroutineSingletons) {
                                    objM2861d3 = xfaVar;
                                }
                                if (objM2861d3 != coroutineSingletons) {
                                    profileAccount2 = profileAccount;
                                    str15 = str14;
                                    bundle2 = bundle;
                                    bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                    str13 = str8;
                                    bundle2.putString(str13, lessonEntity3.f17282e);
                                    String strM15223q10 = AbstractC3184kh.m15223q(str15);
                                    str12 = str7;
                                    bundle2.putString(str12, strM15223q10);
                                    str11 = str20;
                                    bundle2.putString(str11, lessonEntity3.f17301n0);
                                    bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                    bundle2.putString("Course name", lessonEntity3.f17312t);
                                    lessonEntity = lessonEntity3;
                                    cardEntity = cardEntity2;
                                    bundle = bundle2;
                                    profileAccount = profileAccount2;
                                }
                            }
                        }
                    } else {
                        c1287c = c1287c3;
                        str23 = str23;
                        tokenMeaning2 = tokenMeaning2;
                        i8 = i8;
                        str11 = str20;
                        str12 = str7;
                        str13 = str8;
                    }
                    str16 = this.f14678V;
                    if (!vk9.m23391n0(str16)) {
                        bundle.putString("lingq created location", str16);
                    }
                    bundle.putInt("nth lingq created", profileAccount.f19685i);
                    if (t7d.m21898c(tokenMeaning2)) {
                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                        tokenMeaning = tokenMeaning2;
                    } else {
                        tokenMeaning = tokenMeaning2;
                        if (tokenMeaning.f19594a == 0) {
                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                        } else {
                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                        }
                    }
                    if (profileAccount.f19685i <= 200) {
                        ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                    }
                    if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                        wv0 wv0Var11 = wv0Var;
                        wv0Var11.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                        wv0Var11.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                    } else {
                        y15Var = y15Var2;
                        y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                        if (t7d.m21898c(tokenMeaning)) {
                            y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                        } else {
                            y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                        }
                        y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                    }
                    NetworkType networkType19 = NetworkType.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                    NetworkType networkType110 = NetworkType.CONNECTED;
                    networkType110.getClass();
                    ak1 ak1Var10 = new ak1(new gk6(null), networkType110, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet10));
                    tx6 tx6Var10 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                    tx6Var10.f46873c.f55781j = ak1Var10;
                    str17 = str23;
                    pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                    hi8Var = new hi8(10);
                    while (i6 < 3) {
                        Pair pair10 = pairArr[i6];
                        hi8Var.m13287x(pair10.f47624b, (String) pair10.f47623a);
                    }
                    c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var10.m15008g(hi8Var.m13282k())).m15004a());
                    if (vk9.m23380c0(str22, " ", false)) {
                        Bundle bundle110 = new Bundle();
                        bundle110.putInt("Lesson ID", i8);
                        if (lessonEntity != null) {
                            str18 = lessonEntity.f17282e;
                        } else {
                            str18 = null;
                        }
                        bundle110.putString(str13, str18);
                        bundle110.putString(str12, AbstractC3184kh.m15223q(str17));
                        if (lessonEntity != null) {
                            str19 = lessonEntity.f17301n0;
                        } else {
                            str19 = null;
                        }
                        bundle110.putString(str11, str19);
                        bundle110.putBoolean("is related phrase", this.f14680X);
                        ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle110);
                    } else {
                        Bundle bundle111 = new Bundle();
                        bundle111.putInt("Lesson ID", i8);
                        if (lessonEntity != null) {
                            str18 = lessonEntity.f17282e;
                        } else {
                            str18 = null;
                        }
                        bundle111.putString(str13, str18);
                        bundle111.putString(str12, AbstractC3184kh.m15223q(str17));
                        if (lessonEntity != null) {
                            str19 = lessonEntity.f17301n0;
                        } else {
                            str19 = null;
                        }
                        bundle111.putString(str11, str19);
                        bundle111.putBoolean("is related phrase", this.f14680X);
                        ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle111);
                    }
                    num = profileAccount.f19684h;
                    if (num != null) {
                        ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 7:
                int i18 = this.f14666J;
                i3 = this.f14665I;
                Bundle bundle20 = this.f14689i;
                ProfileAccount profileAccount4 = this.f14688h;
                cardEntity = this.f14687g;
                AbstractC3193b.m15359b(obj);
                str20 = "Lesson level";
                str7 = "Lesson language";
                str8 = "Lesson name";
                bundle = bundle20;
                objMo7500z0 = obj;
                y15Var2 = y15Var2;
                profileAccount = profileAccount4;
                wv0Var = wv0Var;
                value3 = i18;
                lessonEntity = (LessonEntity) objMo7500z0;
                if (lessonEntity != null) {
                    lessonEntityM7642a = LessonEntity.m7642a(lessonEntity, null, 0, 0, 0.0d, 0.0d, lessonEntity.f17259L + 1, false, null, null, -1, -33, 4194303);
                    lessonEntity2 = lessonEntity;
                    this.f14681a = null;
                    this.f14682b = null;
                    this.f14683c = null;
                    this.f14684d = null;
                    this.f14685e = null;
                    this.f14686f = null;
                    this.f14687g = cardEntity;
                    this.f14688h = profileAccount;
                    this.f14689i = bundle;
                    this.f14690j = lessonEntity2;
                    this.f14691k = c1287c3;
                    this.f14692l = str21;
                    this.f14664H = str23;
                    this.f14665I = i3;
                    this.f14666J = value3;
                    this.f14667K = 0;
                    this.f14668L = 8;
                    if (abstractC1320h2.mo4095v0(lessonEntityM7642a, this) != coroutineSingletons) {
                        c1287c2 = c1287c3;
                        c1287c = c1287c2;
                        str14 = str23;
                        i4 = 0;
                        abstractC1320h = c1287c2.f16455d;
                        listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                        this.f14681a = null;
                        this.f14682b = null;
                        this.f14683c = null;
                        this.f14684d = null;
                        this.f14685e = null;
                        this.f14686f = null;
                        this.f14687g = cardEntity;
                        this.f14688h = profileAccount;
                        this.f14689i = bundle;
                        this.f14690j = lessonEntity2;
                        this.f14691k = c1287c2;
                        this.f14692l = str21;
                        this.f14664H = str14;
                        this.f14665I = i3;
                        this.f14666J = value3;
                        this.f14667K = i4;
                        this.f14668L = 9;
                        if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                            i5 = i3;
                            cardEntity2 = cardEntity;
                            lessonEntity3 = lessonEntity2;
                            AbstractC1320h abstractC1320h13 = c1287c2.f16455d;
                            List listM23604J12 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                            this.f14681a = null;
                            this.f14682b = null;
                            this.f14683c = null;
                            this.f14684d = null;
                            this.f14685e = null;
                            this.f14686f = null;
                            this.f14687g = cardEntity2;
                            this.f14688h = profileAccount;
                            this.f14689i = bundle;
                            this.f14690j = lessonEntity3;
                            this.f14691k = str14;
                            this.f14692l = null;
                            this.f14664H = null;
                            this.f14665I = i5;
                            this.f14666J = value3;
                            this.f14667K = i4;
                            this.f14668L = 10;
                            q05 q05Var11 = (q05) abstractC1320h13;
                            objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var11, listM23604J12, 5), q05Var11.f57071K, this, false, true);
                            if (objM2861d3 != coroutineSingletons) {
                                objM2861d3 = xfaVar;
                            }
                            if (objM2861d3 != coroutineSingletons) {
                                profileAccount2 = profileAccount;
                                str15 = str14;
                                bundle2 = bundle;
                                bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                                str13 = str8;
                                bundle2.putString(str13, lessonEntity3.f17282e);
                                String strM15223q11 = AbstractC3184kh.m15223q(str15);
                                str12 = str7;
                                bundle2.putString(str12, strM15223q11);
                                str11 = str20;
                                bundle2.putString(str11, lessonEntity3.f17301n0);
                                bundle2.putInt("Course ID", lessonEntity3.f17310s);
                                bundle2.putString("Course name", lessonEntity3.f17312t);
                                lessonEntity = lessonEntity3;
                                cardEntity = cardEntity2;
                                bundle = bundle2;
                                profileAccount = profileAccount2;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                c1287c = c1287c3;
                str23 = str23;
                tokenMeaning2 = tokenMeaning2;
                i8 = i8;
                str11 = str20;
                str12 = str7;
                str13 = str8;
                str16 = this.f14678V;
                if (!vk9.m23391n0(str16)) {
                    bundle.putString("lingq created location", str16);
                }
                bundle.putInt("nth lingq created", profileAccount.f19685i);
                if (t7d.m21898c(tokenMeaning2)) {
                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                    tokenMeaning = tokenMeaning2;
                } else {
                    tokenMeaning = tokenMeaning2;
                    if (tokenMeaning.f19594a == 0) {
                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                    } else {
                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                    }
                }
                if (profileAccount.f19685i <= 200) {
                    ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                }
                if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                    wv0 wv0Var12 = wv0Var;
                    wv0Var12.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                    wv0Var12.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                } else {
                    y15Var = y15Var2;
                    y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                    if (t7d.m21898c(tokenMeaning)) {
                        y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                    } else {
                        y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                    }
                    y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                }
                NetworkType networkType111 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet11 = new LinkedHashSet();
                NetworkType networkType112 = NetworkType.CONNECTED;
                networkType112.getClass();
                ak1 ak1Var11 = new ak1(new gk6(null), networkType112, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet11));
                tx6 tx6Var11 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                tx6Var11.f46873c.f55781j = ak1Var11;
                str17 = str23;
                pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                hi8Var = new hi8(10);
                while (i6 < 3) {
                    Pair pair11 = pairArr[i6];
                    hi8Var.m13287x(pair11.f47624b, (String) pair11.f47623a);
                }
                c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var11.m15008g(hi8Var.m13282k())).m15004a());
                if (vk9.m23380c0(str22, " ", false)) {
                    Bundle bundle112 = new Bundle();
                    bundle112.putInt("Lesson ID", i8);
                    if (lessonEntity != null) {
                        str18 = lessonEntity.f17282e;
                    } else {
                        str18 = null;
                    }
                    bundle112.putString(str13, str18);
                    bundle112.putString(str12, AbstractC3184kh.m15223q(str17));
                    if (lessonEntity != null) {
                        str19 = lessonEntity.f17301n0;
                    } else {
                        str19 = null;
                    }
                    bundle112.putString(str11, str19);
                    bundle112.putBoolean("is related phrase", this.f14680X);
                    ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle112);
                } else {
                    Bundle bundle113 = new Bundle();
                    bundle113.putInt("Lesson ID", i8);
                    if (lessonEntity != null) {
                        str18 = lessonEntity.f17282e;
                    } else {
                        str18 = null;
                    }
                    bundle113.putString(str13, str18);
                    bundle113.putString(str12, AbstractC3184kh.m15223q(str17));
                    if (lessonEntity != null) {
                        str19 = lessonEntity.f17301n0;
                    } else {
                        str19 = null;
                    }
                    bundle113.putString(str11, str19);
                    bundle113.putBoolean("is related phrase", this.f14680X);
                    ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle113);
                }
                num = profileAccount.f19684h;
                if (num != null) {
                    ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                }
                return xfaVar;
            case 8:
                int i19 = this.f14667K;
                int i20 = this.f14666J;
                i3 = this.f14665I;
                String str29 = this.f14664H;
                String str30 = this.f14692l;
                C1287c c1287c4 = (C1287c) this.f14691k;
                LessonEntity lessonEntity4 = this.f14690j;
                Bundle bundle21 = this.f14689i;
                ProfileAccount profileAccount5 = this.f14688h;
                CardEntity cardEntity3 = this.f14687g;
                AbstractC3193b.m15359b(obj);
                wv0Var = wv0Var;
                value3 = i20;
                cardEntity = cardEntity3;
                c1287c2 = c1287c4;
                str7 = "Lesson language";
                str8 = "Lesson name";
                i4 = i19;
                lessonEntity2 = lessonEntity4;
                str14 = str29;
                str20 = "Lesson level";
                str21 = str30;
                bundle = bundle21;
                c1287c = c1287c3;
                y15Var2 = y15Var2;
                profileAccount = profileAccount5;
                abstractC1320h = c1287c2.f16455d;
                listM23604J = vz1.m23604J(new l75(lessonEntity2.f17274a, str21));
                this.f14681a = null;
                this.f14682b = null;
                this.f14683c = null;
                this.f14684d = null;
                this.f14685e = null;
                this.f14686f = null;
                this.f14687g = cardEntity;
                this.f14688h = profileAccount;
                this.f14689i = bundle;
                this.f14690j = lessonEntity2;
                this.f14691k = c1287c2;
                this.f14692l = str21;
                this.f14664H = str14;
                this.f14665I = i3;
                this.f14666J = value3;
                this.f14667K = i4;
                this.f14668L = 9;
                if (abstractC1320h.mo7491H0(listM23604J, this) != coroutineSingletons) {
                    i5 = i3;
                    cardEntity2 = cardEntity;
                    lessonEntity3 = lessonEntity2;
                    AbstractC1320h abstractC1320h14 = c1287c2.f16455d;
                    List listM23604J13 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                    this.f14681a = null;
                    this.f14682b = null;
                    this.f14683c = null;
                    this.f14684d = null;
                    this.f14685e = null;
                    this.f14686f = null;
                    this.f14687g = cardEntity2;
                    this.f14688h = profileAccount;
                    this.f14689i = bundle;
                    this.f14690j = lessonEntity3;
                    this.f14691k = str14;
                    this.f14692l = null;
                    this.f14664H = null;
                    this.f14665I = i5;
                    this.f14666J = value3;
                    this.f14667K = i4;
                    this.f14668L = 10;
                    q05 q05Var12 = (q05) abstractC1320h14;
                    objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var12, listM23604J13, 5), q05Var12.f57071K, this, false, true);
                    if (objM2861d3 != coroutineSingletons) {
                        objM2861d3 = xfaVar;
                    }
                    if (objM2861d3 != coroutineSingletons) {
                        profileAccount2 = profileAccount;
                        str15 = str14;
                        bundle2 = bundle;
                        bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                        str13 = str8;
                        bundle2.putString(str13, lessonEntity3.f17282e);
                        String strM15223q12 = AbstractC3184kh.m15223q(str15);
                        str12 = str7;
                        bundle2.putString(str12, strM15223q12);
                        str11 = str20;
                        bundle2.putString(str11, lessonEntity3.f17301n0);
                        bundle2.putInt("Course ID", lessonEntity3.f17310s);
                        bundle2.putString("Course name", lessonEntity3.f17312t);
                        lessonEntity = lessonEntity3;
                        cardEntity = cardEntity2;
                        bundle = bundle2;
                        profileAccount = profileAccount2;
                        str16 = this.f14678V;
                        if (!vk9.m23391n0(str16)) {
                            bundle.putString("lingq created location", str16);
                        }
                        bundle.putInt("nth lingq created", profileAccount.f19685i);
                        if (t7d.m21898c(tokenMeaning2)) {
                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                            tokenMeaning = tokenMeaning2;
                        } else {
                            tokenMeaning = tokenMeaning2;
                            if (tokenMeaning.f19594a == 0) {
                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                            } else {
                                bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                            }
                        }
                        if (profileAccount.f19685i <= 200) {
                            ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                        }
                        if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                            wv0 wv0Var13 = wv0Var;
                            wv0Var13.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                            wv0Var13.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                        } else {
                            y15Var = y15Var2;
                            y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                            if (t7d.m21898c(tokenMeaning)) {
                                y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                            } else {
                                y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                            }
                            y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                        }
                        NetworkType networkType113 = NetworkType.NOT_REQUIRED;
                        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
                        NetworkType networkType114 = NetworkType.CONNECTED;
                        networkType114.getClass();
                        ak1 ak1Var12 = new ak1(new gk6(null), networkType114, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet12));
                        tx6 tx6Var12 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                        tx6Var12.f46873c.f55781j = ak1Var12;
                        str17 = str23;
                        pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                        hi8Var = new hi8(10);
                        while (i6 < 3) {
                            Pair pair12 = pairArr[i6];
                            hi8Var.m13287x(pair12.f47624b, (String) pair12.f47623a);
                        }
                        c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var12.m15008g(hi8Var.m13282k())).m15004a());
                        if (vk9.m23380c0(str22, " ", false)) {
                            Bundle bundle114 = new Bundle();
                            bundle114.putInt("Lesson ID", i8);
                            if (lessonEntity != null) {
                                str18 = lessonEntity.f17282e;
                            } else {
                                str18 = null;
                            }
                            bundle114.putString(str13, str18);
                            bundle114.putString(str12, AbstractC3184kh.m15223q(str17));
                            if (lessonEntity != null) {
                                str19 = lessonEntity.f17301n0;
                            } else {
                                str19 = null;
                            }
                            bundle114.putString(str11, str19);
                            bundle114.putBoolean("is related phrase", this.f14680X);
                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle114);
                        } else {
                            Bundle bundle115 = new Bundle();
                            bundle115.putInt("Lesson ID", i8);
                            if (lessonEntity != null) {
                                str18 = lessonEntity.f17282e;
                            } else {
                                str18 = null;
                            }
                            bundle115.putString(str13, str18);
                            bundle115.putString(str12, AbstractC3184kh.m15223q(str17));
                            if (lessonEntity != null) {
                                str19 = lessonEntity.f17301n0;
                            } else {
                                str19 = null;
                            }
                            bundle115.putString(str11, str19);
                            bundle115.putBoolean("is related phrase", this.f14680X);
                            ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle115);
                        }
                        num = profileAccount.f19684h;
                        if (num != null) {
                            ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                        }
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 9:
                int i21 = this.f14667K;
                int i22 = this.f14666J;
                int i23 = this.f14665I;
                String str31 = this.f14664H;
                String str32 = this.f14692l;
                C1287c c1287c5 = (C1287c) this.f14691k;
                LessonEntity lessonEntity5 = this.f14690j;
                Bundle bundle22 = this.f14689i;
                ProfileAccount profileAccount6 = this.f14688h;
                CardEntity cardEntity4 = this.f14687g;
                AbstractC3193b.m15359b(obj);
                c1287c = c1287c3;
                i5 = i23;
                cardEntity2 = cardEntity4;
                c1287c2 = c1287c5;
                wv0Var = wv0Var;
                value3 = i22;
                lessonEntity3 = lessonEntity5;
                str20 = "Lesson level";
                bundle = bundle22;
                str7 = "Lesson language";
                str8 = "Lesson name";
                i4 = i21;
                i8 = i8;
                str14 = str31;
                str21 = str32;
                y15Var2 = y15Var2;
                profileAccount = profileAccount6;
                AbstractC1320h abstractC1320h15 = c1287c2.f16455d;
                List listM23604J14 = vz1.m23604J(new LessonAndCardsFromJoin(lessonEntity3.f17274a, str21));
                this.f14681a = null;
                this.f14682b = null;
                this.f14683c = null;
                this.f14684d = null;
                this.f14685e = null;
                this.f14686f = null;
                this.f14687g = cardEntity2;
                this.f14688h = profileAccount;
                this.f14689i = bundle;
                this.f14690j = lessonEntity3;
                this.f14691k = str14;
                this.f14692l = null;
                this.f14664H = null;
                this.f14665I = i5;
                this.f14666J = value3;
                this.f14667K = i4;
                this.f14668L = 10;
                q05 q05Var13 = (q05) abstractC1320h15;
                objM2861d3 = AbstractC0758a.m2861d(new i05(q05Var13, listM23604J14, 5), q05Var13.f57071K, this, false, true);
                if (objM2861d3 != coroutineSingletons) {
                    objM2861d3 = xfaVar;
                }
                if (objM2861d3 != coroutineSingletons) {
                    profileAccount2 = profileAccount;
                    str15 = str14;
                    bundle2 = bundle;
                    bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                    str13 = str8;
                    bundle2.putString(str13, lessonEntity3.f17282e);
                    String strM15223q13 = AbstractC3184kh.m15223q(str15);
                    str12 = str7;
                    bundle2.putString(str12, strM15223q13);
                    str11 = str20;
                    bundle2.putString(str11, lessonEntity3.f17301n0);
                    bundle2.putInt("Course ID", lessonEntity3.f17310s);
                    bundle2.putString("Course name", lessonEntity3.f17312t);
                    lessonEntity = lessonEntity3;
                    cardEntity = cardEntity2;
                    bundle = bundle2;
                    profileAccount = profileAccount2;
                    str16 = this.f14678V;
                    if (!vk9.m23391n0(str16)) {
                        bundle.putString("lingq created location", str16);
                    }
                    bundle.putInt("nth lingq created", profileAccount.f19685i);
                    if (t7d.m21898c(tokenMeaning2)) {
                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                        tokenMeaning = tokenMeaning2;
                    } else {
                        tokenMeaning = tokenMeaning2;
                        if (tokenMeaning.f19594a == 0) {
                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                        } else {
                            bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                        }
                    }
                    if (profileAccount.f19685i <= 200) {
                        ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                    }
                    if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                        wv0 wv0Var14 = wv0Var;
                        wv0Var14.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                        wv0Var14.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                    } else {
                        y15Var = y15Var2;
                        y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                        if (t7d.m21898c(tokenMeaning)) {
                            y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                        } else {
                            y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                        }
                        y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                    }
                    NetworkType networkType115 = NetworkType.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet13 = new LinkedHashSet();
                    NetworkType networkType116 = NetworkType.CONNECTED;
                    networkType116.getClass();
                    ak1 ak1Var13 = new ak1(new gk6(null), networkType116, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet13));
                    tx6 tx6Var13 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                    tx6Var13.f46873c.f55781j = ak1Var13;
                    str17 = str23;
                    pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                    hi8Var = new hi8(10);
                    while (i6 < 3) {
                        Pair pair13 = pairArr[i6];
                        hi8Var.m13287x(pair13.f47624b, (String) pair13.f47623a);
                    }
                    c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var13.m15008g(hi8Var.m13282k())).m15004a());
                    if (vk9.m23380c0(str22, " ", false)) {
                        Bundle bundle116 = new Bundle();
                        bundle116.putInt("Lesson ID", i8);
                        if (lessonEntity != null) {
                            str18 = lessonEntity.f17282e;
                        } else {
                            str18 = null;
                        }
                        bundle116.putString(str13, str18);
                        bundle116.putString(str12, AbstractC3184kh.m15223q(str17));
                        if (lessonEntity != null) {
                            str19 = lessonEntity.f17301n0;
                        } else {
                            str19 = null;
                        }
                        bundle116.putString(str11, str19);
                        bundle116.putBoolean("is related phrase", this.f14680X);
                        ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle116);
                    } else {
                        Bundle bundle117 = new Bundle();
                        bundle117.putInt("Lesson ID", i8);
                        if (lessonEntity != null) {
                            str18 = lessonEntity.f17282e;
                        } else {
                            str18 = null;
                        }
                        bundle117.putString(str13, str18);
                        bundle117.putString(str12, AbstractC3184kh.m15223q(str17));
                        if (lessonEntity != null) {
                            str19 = lessonEntity.f17301n0;
                        } else {
                            str19 = null;
                        }
                        bundle117.putString(str11, str19);
                        bundle117.putBoolean("is related phrase", this.f14680X);
                        ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle117);
                    }
                    num = profileAccount.f19684h;
                    if (num != null) {
                        ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 10:
                str15 = (String) this.f14691k;
                lessonEntity3 = this.f14690j;
                bundle2 = this.f14689i;
                profileAccount2 = this.f14688h;
                cardEntity2 = this.f14687g;
                AbstractC3193b.m15359b(obj);
                c1287c = c1287c3;
                wv0Var = wv0Var;
                y15Var2 = y15Var2;
                str23 = str23;
                tokenMeaning2 = tokenMeaning2;
                i8 = i8;
                str20 = "Lesson level";
                str7 = "Lesson language";
                str8 = "Lesson name";
                bundle2.putInt("Lesson ID", lessonEntity3.f17274a);
                str13 = str8;
                bundle2.putString(str13, lessonEntity3.f17282e);
                String strM15223q14 = AbstractC3184kh.m15223q(str15);
                str12 = str7;
                bundle2.putString(str12, strM15223q14);
                str11 = str20;
                bundle2.putString(str11, lessonEntity3.f17301n0);
                bundle2.putInt("Course ID", lessonEntity3.f17310s);
                bundle2.putString("Course name", lessonEntity3.f17312t);
                lessonEntity = lessonEntity3;
                cardEntity = cardEntity2;
                bundle = bundle2;
                profileAccount = profileAccount2;
                str16 = this.f14678V;
                if (!vk9.m23391n0(str16)) {
                    bundle.putString("lingq created location", str16);
                }
                bundle.putInt("nth lingq created", profileAccount.f19685i);
                if (t7d.m21898c(tokenMeaning2)) {
                    bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Cwt.getValue());
                    tokenMeaning = tokenMeaning2;
                } else {
                    tokenMeaning = tokenMeaning2;
                    if (tokenMeaning.f19594a == 0) {
                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Manual.getValue());
                    } else {
                        bundle.putString("hint type", LqAnalyticsValues$LingQCreatedMeaningType.Popular.getValue());
                    }
                }
                if (profileAccount.f19685i <= 200) {
                    ((C1240a) hm5Var).m7025f("Lingq created", bundle);
                }
                if (str16.equals(LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue())) {
                    wv0 wv0Var15 = wv0Var;
                    wv0Var15.mo8922a1(ChatEngagedDataType.LingqsCreated, new Integer(1));
                    wv0Var15.mo8922a1(ChatEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                } else {
                    y15Var = y15Var2;
                    y15Var.mo49u1(LessonEngagedDataType.LingqsCreated, new Integer(1));
                    if (t7d.m21898c(tokenMeaning)) {
                        y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
                    } else {
                        y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
                    }
                    y15Var.mo49u1(LessonEngagedDataType.NthLingqsCreated, new Integer(profileAccount.f19685i));
                }
                NetworkType networkType117 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet14 = new LinkedHashSet();
                NetworkType networkType118 = NetworkType.CONNECTED;
                networkType118.getClass();
                ak1 ak1Var14 = new ak1(new gk6(null), networkType118, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet14));
                tx6 tx6Var14 = (tx6) new tx6(CardCreateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                tx6Var14.f46873c.f55781j = ak1Var14;
                str17 = str23;
                pairArr = new Pair[]{new Pair("language", str17), new Pair("term", cardEntity.f17054a), new Pair("lessonId", Integer.valueOf(i8))};
                hi8Var = new hi8(10);
                while (i6 < 3) {
                    Pair pair14 = pairArr[i6];
                    hi8Var.m13287x(pair14.f47624b, (String) pair14.f47623a);
                }
                c1287c.f16460i.m2912a((ux6) ((tx6) tx6Var14.m15008g(hi8Var.m13282k())).m15004a());
                if (vk9.m23380c0(str22, " ", false)) {
                    Bundle bundle118 = new Bundle();
                    bundle118.putInt("Lesson ID", i8);
                    if (lessonEntity != null) {
                        str18 = lessonEntity.f17282e;
                    } else {
                        str18 = null;
                    }
                    bundle118.putString(str13, str18);
                    bundle118.putString(str12, AbstractC3184kh.m15223q(str17));
                    if (lessonEntity != null) {
                        str19 = lessonEntity.f17301n0;
                    } else {
                        str19 = null;
                    }
                    bundle118.putString(str11, str19);
                    bundle118.putBoolean("is related phrase", this.f14680X);
                    ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle118);
                } else {
                    Bundle bundle119 = new Bundle();
                    bundle119.putInt("Lesson ID", i8);
                    if (lessonEntity != null) {
                        str18 = lessonEntity.f17282e;
                    } else {
                        str18 = null;
                    }
                    bundle119.putString(str13, str18);
                    bundle119.putString(str12, AbstractC3184kh.m15223q(str17));
                    if (lessonEntity != null) {
                        str19 = lessonEntity.f17301n0;
                    } else {
                        str19 = null;
                    }
                    bundle119.putString(str11, str19);
                    bundle119.putBoolean("is related phrase", this.f14680X);
                    ((C1240a) hm5Var).m7025f("Phrase lingq created", bundle119);
                }
                num = profileAccount.f19684h;
                if (num != null) {
                    ((C1240a) hm5Var).m7025f("Lingqs limit hit", g9a.m12429f("Client", "android"));
                }
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
