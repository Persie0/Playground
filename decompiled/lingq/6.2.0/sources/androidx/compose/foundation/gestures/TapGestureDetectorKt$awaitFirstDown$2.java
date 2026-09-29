package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m4291f = "TapGestureDetector.kt", m4292l = {317}, m4293m = "awaitFirstDown", m4294v = 1)
final class TapGestureDetectorKt$awaitFirstDown$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f2108a;

    /* JADX INFO: renamed from: b */
    public PointerEventPass f2109b;

    /* JADX INFO: renamed from: c */
    public boolean f2110c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2111d;

    /* JADX INFO: renamed from: e */
    public int f2112e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2111d = obj;
        this.f2112e |= Integer.MIN_VALUE;
        return AbstractC0117w.m938a(null, false, null, this);
    }
}
