package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import cc.InterfaceC1799d5;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2805q1 extends AbstractBinderC2869v0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1799d5 f14397a;

    public BinderC2805q1(InterfaceC1799d5 interfaceC1799d5) {
        this.f14397a = interfaceC1799d5;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2882w0
    /* JADX INFO: renamed from: L */
    public final void mo8157L(long j10, Bundle bundle, String str, String str2) {
        this.f14397a.mo5571a(j10, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2882w0
    /* JADX INFO: renamed from: a */
    public final int mo8158a() {
        return System.identityHashCode(this.f14397a);
    }
}
