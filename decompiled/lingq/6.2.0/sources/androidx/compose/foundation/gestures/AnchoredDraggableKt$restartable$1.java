package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m4291f = "AnchoredDraggable.kt", m4292l = {1578}, m4293m = "restartable", m4294v = 1)
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f1793a;

    /* JADX INFO: renamed from: b */
    public int f1794b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1793a = obj;
        this.f1794b |= Integer.MIN_VALUE;
        return AbstractC0095c.m828c(null, null, this);
    }
}
