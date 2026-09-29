package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ui3;
import p000.xi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m4291f = "UpdatableAnimationState.kt", m4292l = {100, 151}, m4293m = "animateToZero", m4294v = 1)
final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public xi3 f2211a;

    /* JADX INFO: renamed from: b */
    public ui3 f2212b;

    /* JADX INFO: renamed from: c */
    public float f2213c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2214d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0119y f2215e;

    /* JADX INFO: renamed from: f */
    public int f2216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(C0119y c0119y, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2215e = c0119y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2214d = obj;
        this.f2216f |= Integer.MIN_VALUE;
        return this.f2215e.m951a(null, null, this);
    }
}
