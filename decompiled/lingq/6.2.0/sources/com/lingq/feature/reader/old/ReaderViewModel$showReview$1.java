package com.lingq.feature.reader.old;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$showReview$1", m4291f = "ReaderViewModel.kt", m4292l = {2406}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$showReview$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29076a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$showReview$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29077b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$showReview$1(this.f29077b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$showReview$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29076a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29076a = 1;
            if (AbstractC3208a.m15437d(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C2412n c2412n = this.f29077b;
        AbstractC1263a.m7047b(lda.m16103C(c2412n), c2412n.f29301O, "update streak", new ReaderViewModel$updateStreak$1(c2412n, null));
        C3211a c3211a = c2412n.f29285I1;
        xfa xfaVar = xfa.f68157a;
        c3211a.mo4677k(xfaVar);
        return xfaVar;
    }
}
