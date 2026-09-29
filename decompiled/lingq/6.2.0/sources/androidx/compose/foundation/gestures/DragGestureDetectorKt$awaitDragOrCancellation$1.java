package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4291f = "DragGestureDetector.kt", m4292l = {1135}, m4293m = "awaitDragOrCancellation-rnUCldI", m4294v = 1)
final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f1873a;

    /* JADX INFO: renamed from: b */
    public Ref$LongRef f1874b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1875c;

    /* JADX INFO: renamed from: d */
    public int f1876d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1875c = obj;
        this.f1876d |= Integer.MIN_VALUE;
        return AbstractC0102j.m866a(null, 0L, this);
    }
}
