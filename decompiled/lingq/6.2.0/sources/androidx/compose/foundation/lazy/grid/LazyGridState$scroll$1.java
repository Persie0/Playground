package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.grid.LazyGridState", m4291f = "LazyGridState.kt", m4292l = {518, 520}, m4293m = "scroll", m4294v = 1)
final class LazyGridState$scroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public MutatePriority f2460a;

    /* JADX INFO: renamed from: b */
    public SuspendLambda f2461b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2462c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0129b f2463d;

    /* JADX INFO: renamed from: e */
    public int f2464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scroll$1(C0129b c0129b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2463d = c0129b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2462c = obj;
        this.f2464e |= Integer.MIN_VALUE;
        return this.f2463d.mo864c(null, null, this);
    }
}
