package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m4291f = "TapGestureDetector.kt", m4292l = {236}, m4293m = "consumeUntilUp", m4294v = 1)
final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f2117a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2118b;

    /* JADX INFO: renamed from: c */
    public int f2119c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2118b = obj;
        this.f2119c |= Integer.MIN_VALUE;
        return AbstractC0117w.m940c(null, this);
    }
}
