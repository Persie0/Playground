package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m4291f = "TapGestureDetector.kt", m4292l = {378, 392}, m4293m = "waitForUpOrCancellation", m4294v = 1)
final class TapGestureDetectorKt$waitForUpOrCancellation$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f2193a;

    /* JADX INFO: renamed from: b */
    public PointerEventPass f2194b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2195c;

    /* JADX INFO: renamed from: d */
    public int f2196d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2195c = obj;
        this.f2196d |= Integer.MIN_VALUE;
        return AbstractC0117w.m947j(null, null, this);
    }
}
