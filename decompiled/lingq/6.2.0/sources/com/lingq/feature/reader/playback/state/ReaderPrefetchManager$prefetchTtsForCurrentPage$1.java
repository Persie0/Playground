package com.lingq.feature.reader.playback.state;

import java.util.ArrayList;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.my5;
import p000.sca;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vqb;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.state.ReaderPrefetchManager$prefetchTtsForCurrentPage$1", m4291f = "ReaderPrefetchManager.kt", m4292l = {54}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPrefetchManager$prefetchTtsForCurrentPage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2468a f29807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f29808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPrefetchManager$prefetchTtsForCurrentPage$1(C2468a c2468a, Set set, Continuation continuation) {
        super(2, continuation);
        this.f29807b = c2468a;
        this.f29808c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPrefetchManager$prefetchTtsForCurrentPage$1(this.f29807b, this.f29808c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPrefetchManager$prefetchTtsForCurrentPage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29806a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2468a c2468a = this.f29807b;
        vqb vqbVar = c2468a.f29814a;
        String str = c2468a.f29817d;
        Set<xz7> set = this.f29808c;
        ArrayList arrayList = new ArrayList(v91.m23189q0(set, 10));
        for (xz7 xz7Var : set) {
            arrayList.add(new Pair(xz7Var.f69008e, xz7Var.f69013j));
        }
        this.f29806a = 1;
        Set setM22627s1 = u91.m22627s1(my5.m17154h(str, arrayList));
        if (!setM22627s1.isEmpty()) {
            ((sca) vqbVar.f65802b).mo8495y1(setM22627s1);
        }
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
