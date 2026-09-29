package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m4291f = "ScrollExtensions.kt", m4292l = {83}, m4293m = "scrollBy", m4294v = 1)
final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$FloatRef f2044a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2045b;

    /* JADX INFO: renamed from: c */
    public int f2046c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2045b = obj;
        this.f2046c |= Integer.MIN_VALUE;
        return AbstractC0095c.m837l(null, 0.0f, this);
    }
}
