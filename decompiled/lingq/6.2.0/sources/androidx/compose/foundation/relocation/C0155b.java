package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.C0098f;
import androidx.compose.p002ui.node.AbstractC0362l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.aq4;
import p000.d16;
import p000.e28;
import p000.hi0;
import p000.r60;
import p000.te1;
import p000.ui3;
import p000.vz1;
import p000.xfa;
import p000.yp4;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0155b extends d16 implements hi0, yp4 {

    /* JADX INFO: renamed from: J */
    public C0098f f2722J;

    /* JADX INFO: renamed from: K */
    public boolean f2723K;

    /* JADX INFO: renamed from: Z0 */
    public static final e28 m1047Z0(C0155b c0155b, AbstractC0362l abstractC0362l, ui3 ui3Var) {
        e28 e28Var;
        if (c0155b.f34836I && c0155b.f2723K) {
            AbstractC0362l abstractC0362lM21978K = te1.m21978K(c0155b);
            if (!abstractC0362l.mo1543f1().f34836I) {
                abstractC0362l = null;
            }
            if (abstractC0362l != null && (e28Var = (e28) ui3Var.mo0a()) != null) {
                return e28Var.m10810k(abstractC0362lM21978K.mo1670Q(abstractC0362l, false).m10805f());
            }
        }
        return null;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.hi0
    /* JADX INFO: renamed from: m0 */
    public final Object mo1048m0(AbstractC0362l abstractC0362l, ui3 ui3Var, ContinuationImpl continuationImpl) {
        Object objM23649s = vz1.m23649s(new BringIntoViewResponderNode$bringIntoView$2(this, abstractC0362l, ui3Var, new r60(this, abstractC0362l, ui3Var, 1), null), continuationImpl);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    @Override // p000.yp4
    /* JADX INFO: renamed from: q */
    public final void mo1049q(aq4 aq4Var) {
        this.f2723K = true;
    }
}
