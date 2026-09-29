package androidx.compose.foundation.pager;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", m4291f = "LazyLayoutPager.kt", m4292l = {409}, m4293m = "performFling", m4294v = 1)
final class PagerWrapperFlingBehavior$performFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0151e f2658b;

    /* JADX INFO: renamed from: c */
    public int f2659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$1(C0151e c0151e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2658b = c0151e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2657a = obj;
        this.f2659c |= Integer.MIN_VALUE;
        return this.f2658b.mo862a(null, 0.0f, this);
    }
}
