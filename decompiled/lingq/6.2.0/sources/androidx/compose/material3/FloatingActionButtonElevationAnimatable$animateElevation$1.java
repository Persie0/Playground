package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.q84;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", m4291f = "FloatingActionButton.kt", m4292l = {1410}, m4293m = "animateElevation", m4294v = 1)
final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public q84 f3193a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3194b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0256o f3195c;

    /* JADX INFO: renamed from: d */
    public int f3196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$animateElevation$1(C0256o c0256o, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3195c = c0256o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3194b = obj;
        this.f3196d |= Integer.MIN_VALUE;
        return this.f3195c.m1184a(null, this);
    }
}
