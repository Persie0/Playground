package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m4291f = "AnchoredDraggable.kt", m4292l = {1414}, m4293m = "animateToWithDecay", m4294v = 1)
final class AnchoredDraggableKt$animateToWithDecay$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public float f1780a;

    /* JADX INFO: renamed from: b */
    public Ref$FloatRef f1781b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1782c;

    /* JADX INFO: renamed from: d */
    public int f1783d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1782c = obj;
        this.f1783d |= Integer.MIN_VALUE;
        return AbstractC0095c.m833h(null, null, 0.0f, null, null, this);
    }
}
