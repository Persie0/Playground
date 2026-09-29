package com.lingq.feature.reader.playback.state;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ox7;
import p000.u91;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.state.ReaderPrefetchManager$start$2", m4291f = "ReaderPrefetchManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPrefetchManager$start$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2468a f29813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPrefetchManager$start$2(C2468a c2468a, Continuation continuation) {
        super(2, continuation);
        this.f29813b = c2468a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderPrefetchManager$start$2 readerPrefetchManager$start$2 = new ReaderPrefetchManager$start$2(this.f29813b, continuation);
        readerPrefetchManager$start$2.f29812a = obj;
        return readerPrefetchManager$start$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderPrefetchManager$start$2 readerPrefetchManager$start$2 = (ReaderPrefetchManager$start$2) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerPrefetchManager$start$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f29812a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) pair.f47623a;
        int iIntValue = ((Number) pair.f47624b).intValue();
        if (iIntValue >= 0 && iIntValue < list.size()) {
            C2468a c2468a = this.f29813b;
            LinkedHashSet linkedHashSet = c2468a.f29816c;
            if (!vk9.m23391n0(c2468a.f29817d) && !linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                Set setM22627s1 = u91.m22627s1(((ox7) list.get(iIntValue)).f55132e);
                if (!setM22627s1.isEmpty()) {
                    wfb.m23926u(c2468a.f29815b, null, null, new ReaderPrefetchManager$prefetchTtsForCurrentPage$1(c2468a, setM22627s1, null), 3);
                    linkedHashSet.add(Integer.valueOf(iIntValue));
                }
            }
        }
        return xfa.f68157a;
    }
}
