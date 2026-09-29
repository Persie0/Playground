package androidx.compose.foundation.pager;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bg9;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.pager.PagerState", m4291f = "PagerState.kt", m4292l = {663, 670}, m4293m = "animateScrollToPage", m4294v = 1)
final class PagerState$animateScrollToPage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f2635a;

    /* JADX INFO: renamed from: b */
    public bg9 f2636b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2637c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0150d f2638d;

    /* JADX INFO: renamed from: e */
    public int f2639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$1(AbstractC0150d abstractC0150d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2638d = abstractC0150d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2637c = obj;
        this.f2639e |= Integer.MIN_VALUE;
        return this.f2638d.m1032f(0, null, this);
    }
}
