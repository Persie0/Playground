package androidx.compose.p002ui.input.pointer;

import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.pg9;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", m4291f = "SuspendingPointerInputFilter.kt", m4292l = {890}, m4293m = "withTimeout", m4294v = 1)
final class C0323x647a7347<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public pg9 f4103a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f4104b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0332f f4105c;

    /* JADX INFO: renamed from: d */
    public int f4106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323x647a7347(C0332f c0332f, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.f4105c = c0332f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4104b = obj;
        this.f4106d |= Integer.MIN_VALUE;
        return this.f4105c.m1476g(0L, null, this);
    }
}
