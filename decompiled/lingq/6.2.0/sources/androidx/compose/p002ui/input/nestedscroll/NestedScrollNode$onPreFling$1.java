package androidx.compose.p002ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m4291f = "NestedScrollNode.kt", m4292l = {106, 107}, m4293m = "onPreFling-QWom1Mo", m4294v = 1)
final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f4077a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f4078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0320d f4079c;

    /* JADX INFO: renamed from: d */
    public int f4080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(C0320d c0320d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4079c = c0320d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4078b = obj;
        this.f4080d |= Integer.MIN_VALUE;
        return this.f4079c.mo1198p0(0L, this);
    }
}
