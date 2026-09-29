package com.lingq.feature.review;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.review.ReviewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.joda.time.DateTime;
import p000.C3386nv;
import p000.C3540rl;
import p000.ao0;
import p000.bj3;
import p000.c32;
import p000.fa4;
import p000.hy3;
import p000.id8;
import p000.lda;
import p000.n83;
import p000.nn1;
import p000.og8;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$3", m4291f = "ReviewViewModel.kt", m4292l = {270}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31828b;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$3$1", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26281 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Language f31829a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ boolean f31830b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ boolean f31831c;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
            C26281 c26281 = new C26281(4, (Continuation) obj4);
            c26281.f31829a = (Language) obj;
            c26281.f31830b = zBooleanValue;
            c26281.f31831c = zBooleanValue2;
            return c26281.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Language language = this.f31829a;
            boolean z = this.f31830b;
            boolean z2 = this.f31831c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return new Triple(language, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$3$2 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$3$2", m4291f = "ReviewViewModel.kt", m4292l = {273, 277}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26292 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public boolean f31832a;

        /* JADX INFO: renamed from: b */
        public boolean f31833b;

        /* JADX INFO: renamed from: c */
        public int f31834c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f31835d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C2758f f31836e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26292(C2758f c2758f, Continuation continuation) {
            super(2, continuation);
            this.f31836e = c2758f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26292 c26292 = new C26292(this.f31836e, continuation);
            c26292.f31835d = obj;
            return c26292;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C26292) create((Triple) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009f  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[LOOP:1: B:37:0x00df->B:39:0x00e5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:43:0x0106 A[LOOP:2: B:41:0x0100->B:43:0x0106, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:53:0x00ce A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:56:0x00aa A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
        
            if (r0.f32506b.mo4576F1(r13, r12) == r4) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            boolean z2;
            List list;
            ArrayList arrayList;
            Iterator it;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Iterator it2;
            String str;
            int iCompareTo;
            C2758f c2758f = this.f31836e;
            nn1 nn1Var = c2758f.f32513i;
            id8 id8Var = c2758f.f32516l;
            Triple triple = (Triple) this.f31835d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f31834c;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Language language = (Language) triple.f47633a;
                boolean zBooleanValue = ((Boolean) triple.f47634b).booleanValue();
                boolean zBooleanValue2 = ((Boolean) triple.f47635c).booleanValue();
                og8 og8Var = c2758f.f32514j;
                Set set = og8Var.f54320a;
                og8Var.f54320a = EmptySet.f47640a;
                List listM22622n1 = u91.m22622n1(set);
                if (!vk9.m23391n0(id8Var.f43983f) && !fa4.m11650l(language.f19024a, id8Var.f43983f)) {
                    String str2 = id8Var.f43983f;
                    this.f31835d = null;
                    this.f31832a = zBooleanValue;
                    this.f31833b = zBooleanValue2;
                    this.f31834c = 1;
                } else if (listM22622n1.isEmpty()) {
                    int i2 = id8Var.f43978a;
                    if (i2 != -1) {
                        ao0 ao0Var = c2758f.f32510f;
                        this.f31835d = null;
                        this.f31832a = zBooleanValue;
                        this.f31833b = zBooleanValue2;
                        this.f31834c = 2;
                        obj = ((C1287c) ao0Var).m7117g(i2, this);
                        if (obj != coroutineSingletons) {
                            z = zBooleanValue2;
                            z2 = zBooleanValue;
                            list = (List) obj;
                            if (id8Var.f43979b == ReviewType.SrsDue) {
                                arrayList3 = new ArrayList();
                                for (Object obj2 : list) {
                                    str = ((LessonCard) obj2).f19191n;
                                    if (str != null) {
                                        iCompareTo = str.compareTo(hy3.f43148E.m14766a(new DateTime()));
                                    } else {
                                        iCompareTo = 0;
                                    }
                                    if (iCompareTo < 0) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                arrayList2 = new ArrayList(v91.m23189q0(arrayList3, 10));
                                it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((LessonCard) it2.next()).f19178a);
                                }
                            } else {
                                List list2 = list;
                                arrayList = new ArrayList(v91.m23189q0(list2, 10));
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((LessonCard) it.next()).f19178a);
                                }
                                arrayList2 = arrayList;
                            }
                            C2758f.m9605Y2(c2758f, u91.m22627s1(arrayList2), z2, z);
                        }
                        return coroutineSingletons;
                    }
                    if (id8Var.f43984g != null) {
                        wfb.m23926u(lda.m16103C(c2758f), nn1Var, null, new ReviewViewModel$fetchLotdCards$1(c2758f, zBooleanValue, zBooleanValue2, null), 2);
                    } else {
                        wfb.m23926u(lda.m16103C(c2758f), nn1Var, null, new ReviewViewModel$fetchCards$1(c2758f, zBooleanValue, zBooleanValue2, null), 2);
                    }
                } else {
                    C2758f.m9605Y2(c2758f, u91.m22627s1(listM22622n1), zBooleanValue, zBooleanValue2);
                }
            } else if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.f31833b;
                z2 = this.f31832a;
                AbstractC3193b.m15359b(obj);
                list = (List) obj;
                if (id8Var.f43979b == ReviewType.SrsDue) {
                    arrayList3 = new ArrayList();
                    while (r13.hasNext()) {
                        str = ((LessonCard) obj2).f19191n;
                        if (str != null) {
                            iCompareTo = str.compareTo(hy3.f43148E.m14766a(new DateTime()));
                        } else {
                            iCompareTo = 0;
                        }
                        if (iCompareTo < 0) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(v91.m23189q0(arrayList3, 10));
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((LessonCard) it2.next()).f19178a);
                    }
                } else {
                    List list3 = list;
                    arrayList = new ArrayList(v91.m23189q0(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((LessonCard) it.next()).f19178a);
                    }
                    arrayList2 = arrayList;
                }
                C2758f.m9605Y2(c2758f, u91.m22627s1(arrayList2), z2, z);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$3(C2758f c2758f, Continuation continuation) {
        super(2, continuation);
        this.f31828b = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$3(this.f31828b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31827a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2758f c2758f = this.f31828b;
            n83 n83VarM15532k = AbstractC3224d.m15532k(new C3540rl(c2758f.f32506b.mo4572B0(), 5), new C3540rl(c2758f.f32490I, 5), c2758f.f32500S, new C26281(4, null));
            C26292 c26292 = new C26292(c2758f, null);
            this.f31827a = 1;
            if (AbstractC3224d.m15529h(n83VarM15532k, c26292, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
