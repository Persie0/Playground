package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.LazyListState", m4291f = "LazyListState.kt", m4292l = {464, 466}, m4293m = "scroll", m4294v = 1)
final class LazyListState$scroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public MutatePriority f2428a;

    /* JADX INFO: renamed from: b */
    public SuspendLambda f2429b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2430c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0127b f2431d;

    /* JADX INFO: renamed from: e */
    public int f2432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scroll$1(C0127b c0127b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2431d = c0127b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2430c = obj;
        this.f2432e |= Integer.MIN_VALUE;
        return this.f2431d.mo864c(null, null, this);
    }
}
