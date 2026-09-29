package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.AbstractC0278f;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.qc9;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0188b {

    /* JADX INFO: renamed from: a */
    public final boolean f2944a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f2945b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public final qc9 f2946c = AbstractC0278f.m1256f(0.0f);

    public C0188b(boolean z) {
        this.f2944a = z;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1090a(Continuation continuation) {
        Object objM23649s = vz1.m23649s(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }
}
