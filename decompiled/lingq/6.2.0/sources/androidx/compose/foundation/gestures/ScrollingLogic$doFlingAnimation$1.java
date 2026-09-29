package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollingLogic", m4291f = "Scrollable.kt", m4292l = {879}, m4293m = "doFlingAnimation-QWom1Mo", m4294v = 1)
final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$LongRef f2088a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2089b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0116v f2090c;

    /* JADX INFO: renamed from: d */
    public int f2091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(C0116v c0116v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2090c = c0116v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2089b = obj;
        this.f2091d |= Integer.MIN_VALUE;
        return this.f2090c.m929a(0L, this);
    }
}
