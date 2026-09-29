package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ForEachGestureKt", m4291f = "ForEachGesture.kt", m4292l = {84}, m4293m = "awaitAllPointersUp", m4294v = 1)
final class ForEachGestureKt$awaitAllPointersUp$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f1973a;

    /* JADX INFO: renamed from: b */
    public PointerEventPass f1974b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1975c;

    /* JADX INFO: renamed from: d */
    public int f1976d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1975c = obj;
        this.f1976d |= Integer.MIN_VALUE;
        return AbstractC0095c.m835j(null, null, this);
    }
}
