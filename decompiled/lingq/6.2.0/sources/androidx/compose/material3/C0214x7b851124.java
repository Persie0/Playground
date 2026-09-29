package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: renamed from: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m4291f = "SheetDefaults.kt", m4292l = {538}, m4293m = "onPreFling-QWom1Mo", m4294v = 1)
final class C0214x7b851124 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f3246a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0268y f3248c;

    /* JADX INFO: renamed from: d */
    public int f3249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214x7b851124(C0268y c0268y, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3248c = c0268y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3247b = obj;
        this.f3249d |= Integer.MIN_VALUE;
        return this.f3248c.mo1198p0(0L, this);
    }
}
