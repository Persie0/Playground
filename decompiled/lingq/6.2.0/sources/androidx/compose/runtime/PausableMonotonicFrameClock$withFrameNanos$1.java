package androidx.compose.runtime;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.PausableMonotonicFrameClock", m4291f = "PausableMonotonicFrameClock.kt", m4292l = {61, 62}, m4293m = "withFrameNanos", m4294v = 1)
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public vi3 f3665a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3666b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0277e f3667c;

    /* JADX INFO: renamed from: d */
    public int f3668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(C0277e c0277e, Continuation continuation) {
        super(continuation);
        this.f3667c = c0277e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3666b = obj;
        this.f3668d |= Integer.MIN_VALUE;
        return this.f3667c.mo1250e(null, this);
    }
}
