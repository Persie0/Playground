package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.rk2;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureNode", m4291f = "Draggable.kt", m4292l = {622}, m4293m = "processDragStop", m4294v = 1)
final class DragGestureNode$processDragStop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public rk2 f1945a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0103k f1947c;

    /* JADX INFO: renamed from: d */
    public int f1948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStop$1(AbstractC0103k abstractC0103k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1947c = abstractC0103k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1946b = obj;
        this.f1948d |= Integer.MIN_VALUE;
        return AbstractC0103k.m878e1(this.f1947c, null, this);
    }
}
