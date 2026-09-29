package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$updateStreak$1", m4291f = "ReaderViewModel.kt", m4292l = {2293}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$updateStreak$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f29160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateStreak$1(C2412n c2412n, Continuation continuation) {
        super(1, continuation);
        this.f29161b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderViewModel$updateStreak$1(this.f29161b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderViewModel$updateStreak$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29160a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2412n c2412n = this.f29161b;
                oo4 oo4Var = c2412n.f29406t;
                String strMo4589b2 = c2412n.f29340b.mo4589b2();
                this.f29160a = 1;
                if (((C1294j) oo4Var).m7233g(strMo4589b2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
