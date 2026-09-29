package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.c32;
import p000.x44;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", m4291f = "SelectionGestures.kt", m4292l = {267, 294}, m4293m = "mouseSelection", m4294v = 1)
final class SelectionGesturesKt$mouseSelection$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f3003a;

    /* JADX INFO: renamed from: b */
    public x44 f3004b;

    /* JADX INFO: renamed from: c */
    public Ref$BooleanRef f3005c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f3006d;

    /* JADX INFO: renamed from: e */
    public int f3007e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3006d = obj;
        this.f3007e |= Integer.MIN_VALUE;
        return AbstractC0202c.m1098d(null, null, null, null, this);
    }
}
