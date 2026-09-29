package androidx.compose.foundation.lazy;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.LazyListState", m4291f = "LazyListState.kt", m4292l = {585}, m4293m = "animateScrollToItem", m4294v = 1)
final class LazyListState$animateScrollToItem$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0127b f2421b;

    /* JADX INFO: renamed from: c */
    public int f2422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$animateScrollToItem$1(C0127b c0127b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2421b = c0127b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2420a = obj;
        this.f2422c |= Integer.MIN_VALUE;
        return this.f2421b.m976f(0, 0, this);
    }
}
