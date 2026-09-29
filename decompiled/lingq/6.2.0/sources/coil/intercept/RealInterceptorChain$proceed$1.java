package coil.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.y84;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.intercept.RealInterceptorChain", m4291f = "RealInterceptorChain.kt", m4292l = {32}, m4293m = "proceed")
final class RealInterceptorChain$proceed$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0863b f10548a;

    /* JADX INFO: renamed from: b */
    public y84 f10549b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10550c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0863b f10551d;

    /* JADX INFO: renamed from: e */
    public int f10552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(C0863b c0863b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10551d = c0863b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10550c = obj;
        this.f10552e |= Integer.MIN_VALUE;
        return this.f10551d.m4980b(null, this);
    }
}
