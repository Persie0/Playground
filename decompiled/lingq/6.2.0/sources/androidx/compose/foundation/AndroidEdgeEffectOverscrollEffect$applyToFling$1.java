package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", m4291f = "AndroidOverscroll.android.kt", m4292l = {693, 725}, m4293m = "applyToFling-BMRW4eQ", m4294v = 1)
final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f1644a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0077c f1646c;

    /* JADX INFO: renamed from: d */
    public int f1647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(C0077c c0077c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1646c = c0077c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1645b = obj;
        this.f1647d |= Integer.MIN_VALUE;
        return this.f1646c.m806b(0L, null, this);
    }
}
