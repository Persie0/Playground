package androidx.compose.material3.pulltorefresh;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m4291f = "PullToRefresh.kt", m4292l = {401}, m4293m = "onRelease", m4294v = 1)
final class PullToRefreshModifierNode$onRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public float f3591a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3592b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0259b f3593c;

    /* JADX INFO: renamed from: d */
    public int f3594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onRelease$1(C0259b c0259b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3593c = c0259b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3592b = obj;
        this.f3594d |= Integer.MIN_VALUE;
        return this.f3593c.m1195g1(0.0f, this);
    }
}
