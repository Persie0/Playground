package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.pager.PagerState", m4291f = "PagerState.kt", m4292l = {691, 696}, m4293m = "scroll$suspendImpl", m4294v = 1)
final class PagerState$scroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC0150d f2648a;

    /* JADX INFO: renamed from: b */
    public MutatePriority f2649b;

    /* JADX INFO: renamed from: c */
    public SuspendLambda f2650c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2651d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0150d f2652e;

    /* JADX INFO: renamed from: f */
    public int f2653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scroll$1(AbstractC0150d abstractC0150d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2652e = abstractC0150d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2651d = obj;
        this.f2653f |= Integer.MIN_VALUE;
        return AbstractC0150d.m1030t(this.f2652e, null, null, this);
    }
}
