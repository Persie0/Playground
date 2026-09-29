package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.kg7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m4291f = "DragGestureDetector.kt", m4292l = {1055}, m4293m = "awaitLongPressOrCancellation-rnUCldI", m4294v = 1)
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public kg7 f1877a;

    /* JADX INFO: renamed from: b */
    public Ref$ObjectRef f1878b;

    /* JADX INFO: renamed from: c */
    public Ref$BooleanRef f1879c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f1880d;

    /* JADX INFO: renamed from: e */
    public int f1881e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1880d = obj;
        this.f1881e |= Integer.MIN_VALUE;
        return AbstractC0102j.m867b(null, 0L, this);
    }
}
