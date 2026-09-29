package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: renamed from: androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.BottomSheetKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1", m4291f = "BottomSheet.kt", m4292l = {253}, m4293m = "performFling", m4294v = 1)
final class C0208xe15114e2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f3132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0227e f3133b;

    /* JADX INFO: renamed from: c */
    public int f3134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208xe15114e2(C0227e c0227e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3133b = c0227e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3132a = obj;
        this.f3134c |= Integer.MIN_VALUE;
        return this.f3133b.mo862a(null, 0.0f, this);
    }
}
