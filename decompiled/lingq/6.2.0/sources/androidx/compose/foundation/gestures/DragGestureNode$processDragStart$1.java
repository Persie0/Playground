package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.qk2;
import p000.xk2;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureNode", m4291f = "Draggable.kt", m4292l = {612, 615}, m4293m = "processDragStart", m4294v = 1)
final class DragGestureNode$processDragStart$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public qk2 f1940a;

    /* JADX INFO: renamed from: b */
    public xk2 f1941b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1942c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0103k f1943d;

    /* JADX INFO: renamed from: e */
    public int f1944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStart$1(AbstractC0103k abstractC0103k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1943d = abstractC0103k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1942c = obj;
        this.f1944e |= Integer.MIN_VALUE;
        return AbstractC0103k.m877d1(this.f1943d, null, this);
    }
}
