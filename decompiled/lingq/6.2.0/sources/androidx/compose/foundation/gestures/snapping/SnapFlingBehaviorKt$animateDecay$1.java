package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C0817bn;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m4291f = "SnapFlingBehavior.kt", m4292l = {308}, m4293m = "animateDecay", m4294v = 1)
final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public float f2332a;

    /* JADX INFO: renamed from: b */
    public C0817bn f2333b;

    /* JADX INFO: renamed from: c */
    public Ref$FloatRef f2334c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2335d;

    /* JADX INFO: renamed from: e */
    public int f2336e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2335d = obj;
        this.f2336e |= Integer.MIN_VALUE;
        return AbstractC0113b.m924a(null, 0.0f, null, null, null, this);
    }
}
