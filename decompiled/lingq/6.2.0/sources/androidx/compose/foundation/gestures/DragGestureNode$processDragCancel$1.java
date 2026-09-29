package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureNode", m4291f = "Draggable.kt", m4292l = {630}, m4293m = "processDragCancel", m4294v = 1)
final class DragGestureNode$processDragCancel$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f1937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0103k f1938b;

    /* JADX INFO: renamed from: c */
    public int f1939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragCancel$1(AbstractC0103k abstractC0103k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1938b = abstractC0103k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1937a = obj;
        this.f1939c |= Integer.MIN_VALUE;
        return AbstractC0103k.m876c1(this.f1938b, this);
    }
}
