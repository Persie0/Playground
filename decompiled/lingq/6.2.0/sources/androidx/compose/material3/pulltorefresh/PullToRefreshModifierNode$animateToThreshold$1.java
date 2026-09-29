package androidx.compose.material3.pulltorefresh;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m4291f = "PullToRefresh.kt", m4292l = {427}, m4293m = "animateToThreshold", m4294v = 1)
final class PullToRefreshModifierNode$animateToThreshold$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f3581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0259b f3582b;

    /* JADX INFO: renamed from: c */
    public int f3583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$animateToThreshold$1(C0259b c0259b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3582b = c0259b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3581a = obj;
        this.f3583c |= Integer.MIN_VALUE;
        return C0259b.m1191c1(this.f3582b, this);
    }
}
