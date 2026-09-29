package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.NonTouchScrollingLogic", m4291f = "NonTouchScrollingLogic.kt", m4292l = {55}, m4293m = "userScroll$foundation", m4294v = 1)
final class NonTouchScrollingLogic$userScroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0107o f2013b;

    /* JADX INFO: renamed from: c */
    public int f2014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogic$userScroll$1(AbstractC0107o abstractC0107o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2013b = abstractC0107o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2012a = obj;
        this.f2014c |= Integer.MIN_VALUE;
        return this.f2013b.m900b(null, this);
    }
}
