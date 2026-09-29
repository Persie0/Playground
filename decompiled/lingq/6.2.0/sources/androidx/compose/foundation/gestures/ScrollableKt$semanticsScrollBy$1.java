package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollableKt", m4291f = "Scrollable.kt", m4292l = {1123}, m4293m = "semanticsScrollBy-d-4ec7I", m4294v = 1)
final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0116v f2050a;

    /* JADX INFO: renamed from: b */
    public Ref$FloatRef f2051b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2052c;

    /* JADX INFO: renamed from: d */
    public int f2053d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2052c = obj;
        this.f2053d |= Integer.MIN_VALUE;
        return AbstractC0110r.m917a(null, 0L, this);
    }
}
