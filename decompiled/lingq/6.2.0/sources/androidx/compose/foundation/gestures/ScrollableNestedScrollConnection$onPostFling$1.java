package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", m4291f = "Scrollable.kt", m4292l = {999}, m4293m = "onPostFling-RZ2iAVY", m4294v = 1)
final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f2059a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0111s f2061c;

    /* JADX INFO: renamed from: d */
    public int f2062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(C0111s c0111s, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2061c = c0111s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2060b = obj;
        this.f2062d |= Integer.MIN_VALUE;
        return this.f2061c.mo919t(0L, 0L, this);
    }
}
