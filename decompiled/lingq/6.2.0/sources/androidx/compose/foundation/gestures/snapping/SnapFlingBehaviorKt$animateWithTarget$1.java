package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C0817bn;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m4291f = "SnapFlingBehavior.kt", m4292l = {349}, m4293m = "animateWithTarget", m4294v = 1)
final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public float f2337a;

    /* JADX INFO: renamed from: b */
    public float f2338b;

    /* JADX INFO: renamed from: c */
    public C0817bn f2339c;

    /* JADX INFO: renamed from: d */
    public Ref$FloatRef f2340d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2341e;

    /* JADX INFO: renamed from: f */
    public int f2342f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2341e = obj;
        this.f2342f |= Integer.MIN_VALUE;
        return AbstractC0113b.m925b(null, 0.0f, 0.0f, null, null, null, this);
    }
}
