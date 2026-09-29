package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", m4291f = "AnchoredDraggable.kt", m4292l = {459, 462}, m4293m = "fling", m4294v = 1)
final class AnchoredDraggableNode$fling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$FloatRef f1811a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0096d f1813c;

    /* JADX INFO: renamed from: d */
    public int f1814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$1(C0096d c0096d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1813c = c0096d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1812b = obj;
        this.f1814d |= Integer.MIN_VALUE;
        return C0096d.m839u1(this.f1813c, 0.0f, this);
    }
}
