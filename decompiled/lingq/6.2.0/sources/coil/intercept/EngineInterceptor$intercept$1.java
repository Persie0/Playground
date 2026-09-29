package coil.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.intercept.EngineInterceptor", m4291f = "EngineInterceptor.kt", m4292l = {75}, m4293m = "intercept")
final class EngineInterceptor$intercept$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0862a f10523a;

    /* JADX INFO: renamed from: b */
    public C0863b f10524b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10525c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0862a f10526d;

    /* JADX INFO: renamed from: e */
    public int f10527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$1(C0862a c0862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10526d = c0862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10525c = obj;
        this.f10527e |= Integer.MIN_VALUE;
        return this.f10526d.mo4977a(null, this);
    }
}
