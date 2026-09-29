package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0059a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.e83;
import p000.gq6;
import p000.un1;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0204e implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0059a f3072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f3073b;

    public C0204e(un1 un1Var, C0059a c0059a) {
        this.f3072a = c0059a;
        this.f3073b = un1Var;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        long j = ((gq6) obj).f41189a;
        C0059a c0059a = this.f3072a;
        long j2 = ((gq6) c0059a.m745d()).f41189a & 9223372034707292159L;
        xfa xfaVar = xfa.f68157a;
        if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((gq6) c0059a.m745d()).f41189a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
            Object objM747f = c0059a.m747f(new gq6(j), continuation);
            return objM747f == CoroutineSingletons.COROUTINE_SUSPENDED ? objM747f : xfaVar;
        }
        wfb.m23926u(this.f3073b, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(c0059a, j, null), 3);
        return xfaVar;
    }
}
