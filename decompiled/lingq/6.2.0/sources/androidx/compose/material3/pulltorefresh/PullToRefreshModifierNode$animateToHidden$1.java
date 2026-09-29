package androidx.compose.material3.pulltorefresh;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m4291f = "PullToRefresh.kt", m4292l = {440}, m4293m = "animateToHidden", m4294v = 1)
final class PullToRefreshModifierNode$animateToHidden$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f3578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0259b f3579b;

    /* JADX INFO: renamed from: c */
    public int f3580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$animateToHidden$1(C0259b c0259b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3579b = c0259b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3578a = obj;
        this.f3580c |= Integer.MIN_VALUE;
        return this.f3579b.m1192d1(this);
    }
}
