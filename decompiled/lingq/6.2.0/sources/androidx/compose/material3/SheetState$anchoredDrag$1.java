package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SheetState", m4291f = "SheetDefaults.kt", m4292l = {302}, m4293m = "anchoredDrag$material3", m4294v = 1)
final class SheetState$anchoredDrag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$FloatRef f3250a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0269z f3252c;

    /* JADX INFO: renamed from: d */
    public int f3253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$anchoredDrag$1(C0269z c0269z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3252c = c0269z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3251b = obj;
        this.f3253d |= Integer.MIN_VALUE;
        return this.f3252c.m1213a(null, 0.0f, this);
    }
}
