package androidx.compose.p002ui.input.pointer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", m4291f = "SuspendingPointerInputFilter.kt", m4292l = {860}, m4293m = "withTimeoutOrNull", m4294v = 1)
final class C0325x2677a771<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0332f f4111b;

    /* JADX INFO: renamed from: c */
    public int f4112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0325x2677a771(C0332f c0332f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4111b = c0332f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4110a = obj;
        this.f4112c |= Integer.MIN_VALUE;
        return this.f4111b.m1477i(0L, null, this);
    }
}
