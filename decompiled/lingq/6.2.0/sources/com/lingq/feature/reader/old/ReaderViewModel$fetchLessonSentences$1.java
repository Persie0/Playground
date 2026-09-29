package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Note;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.e83;
import p000.l83;
import p000.m83;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$fetchLessonSentences$1", m4291f = "ReaderViewModel.kt", m4292l = {1920, 1928}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$fetchLessonSentences$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28945b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$fetchLessonSentences$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$fetchLessonSentences$1$1", m4291f = "ReaderViewModel.kt", m4292l = {1925}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23941 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f28946a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23941(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28947b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23941(this.f28947b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C23941) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f28946a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2412n c2412n = this.f28947b;
                d65 d65Var = c2412n.f29394p;
                String strMo4589b2 = c2412n.f29340b.mo4589b2();
                int iM9332l3 = c2412n.m9332l3();
                this.f28946a = 1;
                if (((C1295k) d65Var).m7265W(iM9332l3, strMo4589b2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$fetchLessonSentences$1$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$fetchLessonSentences$1$2", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23952 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f28948a;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C23952 c23952 = new C23952(3, (Continuation) obj3);
            c23952.f28948a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c23952.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th = this.f28948a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            th.printStackTrace();
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$fetchLessonSentences$1$3 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$fetchLessonSentences$1$3", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23963 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28949a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23963(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28950b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23963 c23963 = new C23963(this.f28950b, continuation);
            c23963.f28949a = obj;
            return c23963;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23963 c23963 = (C23963) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23963.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f28949a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28950b;
            c2412n.f29305P0.m15571i(list);
            C3244l c3244l = c2412n.f29308Q0;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u91.m22630w0(((LessonTranslationSentence) it.next()).f19298g, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!vk9.m23391n0(((Note) obj2).f19333b)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((Note) it2.next()).f19333b);
            }
            c3244l.getClass();
            c3244l.m15572j(null, arrayList3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$fetchLessonSentences$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28945b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$fetchLessonSentences$1(this.f28945b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$fetchLessonSentences$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r1, r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28944a;
        C2412n c2412n = this.f28945b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        d65 d65Var = c2412n.f29394p;
        c2412n.f29340b.mo4589b2();
        int iM9332l3 = c2412n.m9332l3();
        this.f28944a = 1;
        obj = AbstractC3224d.m15536o(((C1295k) d65Var).f16498b.mo7487D0(iM9332l3));
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        l83 l83Var = new l83(new m83((c83) obj, new C23941(c2412n, null)), new C23952(3, null), 1);
        C23963 c23963 = new C23963(c2412n, null);
        this.f28944a = 2;
    }
}
