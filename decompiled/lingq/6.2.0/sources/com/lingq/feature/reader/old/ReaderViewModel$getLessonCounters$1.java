package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.wfb;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$getLessonCounters$1", m4291f = "ReaderViewModel.kt", m4292l = {2524}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$getLessonCounters$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28952b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f28953c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$getLessonCounters$1$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$getLessonCounters$1$2", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23972 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28954a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28955b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23972(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28955b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23972 c23972 = new C23972(this.f28955b, continuation);
            c23972.f28954a = obj;
            return c23972;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23972 c23972 = (C23972) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23972.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f28954a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (!list.isEmpty()) {
                C3244l c3244l = this.f28955b.f29389n0;
                List listM22622n1 = u91.m22622n1(list);
                c3244l.getClass();
                c3244l.m15572j(null, listM22622n1);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$getLessonCounters$1(C2412n c2412n, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f28952b = c2412n;
        this.f28953c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$getLessonCounters$1(this.f28952b, this.f28953c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$getLessonCounters$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28951a;
        ArrayList arrayList = this.f28953c;
        C2412n c2412n = this.f28952b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            y95 y95Var = c2412n.f29412v;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Pair(new Integer(((Number) it.next()).intValue()), LibraryItemType.Content.getValue()));
            }
            c83 c83VarM7317l = ((C1296l) y95Var).m7317l(arrayList2);
            C23972 c23972 = new C23972(c2412n, null);
            this.f28951a = 1;
            if (AbstractC3224d.m15529h(c83VarM7317l, c23972, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        wfb.m23926u(c2412n.f29304P, null, null, new ReaderViewModel$updateCounterForLesson$1(c2412n, arrayList, null), 3);
        return xfa.f68157a;
    }
}
