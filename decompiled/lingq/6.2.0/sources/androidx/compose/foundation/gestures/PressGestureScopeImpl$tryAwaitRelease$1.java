package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m4291f = "TapGestureDetector.kt", m4292l = {515}, m4293m = "tryAwaitRelease", m4294v = 1)
final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0108p f2034b;

    /* JADX INFO: renamed from: c */
    public int f2035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(C0108p c0108p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2034b = c0108p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2033a = obj;
        this.f2035c |= Integer.MIN_VALUE;
        return this.f2034b.m911f(this);
    }
}
