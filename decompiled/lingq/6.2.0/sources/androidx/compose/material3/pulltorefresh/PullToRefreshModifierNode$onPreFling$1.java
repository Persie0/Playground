package androidx.compose.material3.pulltorefresh;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m4291f = "PullToRefresh.kt", m4292l = {354}, m4293m = "onPreFling-QWom1Mo", m4294v = 1)
final class PullToRefreshModifierNode$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f3588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0259b f3589b;

    /* JADX INFO: renamed from: c */
    public int f3590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPreFling$1(C0259b c0259b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3589b = c0259b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3588a = obj;
        this.f3590c |= Integer.MIN_VALUE;
        return this.f3589b.mo1198p0(0L, this);
    }
}
