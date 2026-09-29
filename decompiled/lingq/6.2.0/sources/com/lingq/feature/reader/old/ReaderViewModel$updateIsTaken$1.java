package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$updateIsTaken$1", m4291f = "ReaderViewModel.kt", m4292l = {2220}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$updateIsTaken$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateIsTaken$1(C2412n c2412n, int i, Continuation continuation) {
        super(2, continuation);
        this.f29148b = c2412n;
        this.f29149c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$updateIsTaken$1(this.f29148b, this.f29149c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$updateIsTaken$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29147a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            d65 d65Var = this.f29148b.f29394p;
            this.f29147a = 1;
            if (((C1295k) d65Var).m7270b0(this.f29149c, true, this) == coroutineSingletons) {
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
