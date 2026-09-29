package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableState", m4291f = "AnchoredDraggable.kt", m4292l = {1204}, m4293m = "anchoredDrag", m4294v = 1)
final class AnchoredDraggableState$anchoredDrag$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f1830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0097e f1831b;

    /* JADX INFO: renamed from: c */
    public int f1832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$3(C0097e c0097e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1831b = c0097e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1830a = obj;
        this.f1832c |= Integer.MIN_VALUE;
        return this.f1831b.m848a(null, null, null, this);
    }
}
