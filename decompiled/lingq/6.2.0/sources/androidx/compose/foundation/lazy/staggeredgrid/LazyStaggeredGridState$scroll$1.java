package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", m4291f = "LazyStaggeredGridState.kt", m4292l = {282, 284}, m4293m = "scroll", m4294v = 1)
final class LazyStaggeredGridState$scroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public MutatePriority f2581a;

    /* JADX INFO: renamed from: b */
    public SuspendLambda f2582b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2583c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0144d f2584d;

    /* JADX INFO: renamed from: e */
    public int f2585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scroll$1(C0144d c0144d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2584d = c0144d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2583c = obj;
        this.f2585e |= Integer.MIN_VALUE;
        return this.f2584d.mo864c(null, null, this);
    }
}
