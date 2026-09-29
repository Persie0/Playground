package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4291f = "SelectionGestures.kt", m4292l = {340}, m4293m = "awaitDown", m4294v = 1)
final class SelectionGesturesKt$awaitDown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f2995a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2996b;

    /* JADX INFO: renamed from: c */
    public int f2997c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2996b = obj;
        this.f2997c |= Integer.MIN_VALUE;
        return AbstractC0202c.m1095a(null, this);
    }
}
