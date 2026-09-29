package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m4291f = "TapGestureDetector.kt", m4292l = {410}, m4293m = "waitForLongPress", m4294v = 1)
final class TapGestureDetectorKt$waitForLongPress$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f2186a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2187b;

    /* JADX INFO: renamed from: c */
    public int f2188c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2187b = obj;
        this.f2188c |= Integer.MIN_VALUE;
        return AbstractC0117w.m946i(null, null, this);
    }
}
