package com.amplitude.android.internal.compose;

import p000.C0845cf;
import p000.d16;
import p000.i16;
import p000.y64;
import p000.z91;

/* JADX INFO: loaded from: classes2.dex */
public final class AmpFrustrationIgnoreElement extends i16 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AmpFrustrationIgnoreElement);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0845cf();
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(false) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "ampIgnoreFrustrationAnalytics";
        z91 z91Var = y64Var.f69367c;
        Boolean bool = Boolean.FALSE;
        z91Var.m25511b(bool, "ignoreRageClick");
        z91Var.m25511b(bool, "ignoreDeadClick");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((C0845cf) d16Var).getClass();
    }

    public final String toString() {
        return "AmpFrustrationIgnoreElement(ignoreRageClick=false, ignoreDeadClick=false)";
    }
}
