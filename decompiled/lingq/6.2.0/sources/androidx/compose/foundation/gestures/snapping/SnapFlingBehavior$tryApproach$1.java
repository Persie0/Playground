package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", m4291f = "SnapFlingBehavior.kt", m4292l = {174}, m4293m = "tryApproach", m4294v = 1)
final class SnapFlingBehavior$tryApproach$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2329a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0112a f2330b;

    /* JADX INFO: renamed from: c */
    public int f2331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$tryApproach$1(C0112a c0112a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2330b = c0112a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2329a = obj;
        this.f2331c |= Integer.MIN_VALUE;
        return C0112a.m921b(this.f2330b, null, 0.0f, 0.0f, null, this);
    }
}
