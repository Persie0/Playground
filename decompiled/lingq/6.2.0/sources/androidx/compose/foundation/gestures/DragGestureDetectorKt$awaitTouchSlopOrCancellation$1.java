package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p000.c32;
import p000.kg7;
import p000.s01;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4291f = "DragGestureDetector.kt", m4292l = {1148, 1189}, m4293m = "awaitTouchSlopOrCancellation-jO51t88", m4294v = 1)
final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public zi3 f1889a;

    /* JADX INFO: renamed from: b */
    public C0332f f1890b;

    /* JADX INFO: renamed from: c */
    public Ref$LongRef f1891c;

    /* JADX INFO: renamed from: d */
    public s01 f1892d;

    /* JADX INFO: renamed from: e */
    public kg7 f1893e;

    /* JADX INFO: renamed from: f */
    public float f1894f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f1895g;

    /* JADX INFO: renamed from: h */
    public int f1896h;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1895g = obj;
        this.f1896h |= Integer.MIN_VALUE;
        return AbstractC0102j.m868c(null, 0L, null, this);
    }
}
