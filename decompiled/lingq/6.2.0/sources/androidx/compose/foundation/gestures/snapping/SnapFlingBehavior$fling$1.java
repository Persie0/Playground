package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m4291f = "SnapFlingBehavior.kt", m4292l = {114}, m4293m = "fling", m4294v = 1)
final class SnapFlingBehavior$fling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public vi3 f2316a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2317b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0112a f2318c;

    /* JADX INFO: renamed from: d */
    public int f2319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$1(C0112a c0112a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2318c = c0112a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2317b = obj;
        this.f2319d |= Integer.MIN_VALUE;
        return this.f2318c.m922c(null, 0.0f, null, this);
    }
}
