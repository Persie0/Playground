package androidx.compose.p002ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m4291f = "NestedScrollNode.kt", m4292l = {113, 118}, m4293m = "onPostFling-RZ2iAVY", m4294v = 1)
final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f4072a;

    /* JADX INFO: renamed from: b */
    public long f4073b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f4074c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0320d f4075d;

    /* JADX INFO: renamed from: e */
    public int f4076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(C0320d c0320d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4075d = c0320d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4074c = obj;
        this.f4076e |= Integer.MIN_VALUE;
        return this.f4075d.mo919t(0L, 0L, this);
    }
}
