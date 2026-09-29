package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", m4291f = "AnchoredDraggable.kt", m4292l = {1583}, m4293m = "emit", m4294v = 1)
final class AnchoredDraggableKt$restartable$2$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f1803a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0094b f1805c;

    /* JADX INFO: renamed from: d */
    public int f1806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2$1$emit$1(C0094b c0094b, Continuation continuation) {
        super(continuation);
        this.f1805c = c0094b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1804b = obj;
        this.f1806d |= Integer.MIN_VALUE;
        return this.f1805c.emit(null, this);
    }
}
