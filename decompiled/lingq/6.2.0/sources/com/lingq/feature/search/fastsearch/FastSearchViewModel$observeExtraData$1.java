package com.lingq.feature.search.fastsearch;

import com.lingq.core.domain.model.library.FastSearchType;
import com.lingq.core.domain.model.library.LibraryFastSearch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.fa4;
import p000.lda;
import p000.u91;
import p000.v91;
import p000.vz2;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$observeExtraData$1", m4291f = "FastSearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$observeExtraData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$observeExtraData$1(C2768b c2768b, Continuation continuation) {
        super(2, continuation);
        this.f32859b = c2768b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FastSearchViewModel$observeExtraData$1 fastSearchViewModel$observeExtraData$1 = new FastSearchViewModel$observeExtraData$1(this.f32859b, continuation);
        fastSearchViewModel$observeExtraData$1.f32858a = obj;
        return fastSearchViewModel$observeExtraData$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FastSearchViewModel$observeExtraData$1 fastSearchViewModel$observeExtraData$1 = (FastSearchViewModel$observeExtraData$1) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fastSearchViewModel$observeExtraData$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        List list = (List) this.f32858a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2768b c2768b = this.f32859b;
        C3244l c3244l = c2768b.f32892p;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (fa4.m11650l(((LibraryFastSearch) obj2).f19396c, FastSearchType.Shelf.getValue())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LibraryFastSearch) it.next()).f19394a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((vz2) c3244l.getValue()).f66125h.containsKey((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        Iterator it2 = u91.m22622n1(u91.m22626r1(arrayList3)).iterator();
        while (it2.hasNext()) {
            wfb.m23926u(lda.m16103C(c2768b), c2768b.f32890n, null, new FastSearchViewModel$prefetchShelves$1$1(c2768b, (String) it2.next(), null), 2);
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, vz2.m23657a((vz2) value, null, false, false, null, null, null, list, null, null, 447)));
        return xfa.f68157a;
    }
}
