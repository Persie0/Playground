package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2795p4 extends AbstractC2886w4 {
    public C2795p4(C2847t4 c2847t4, String str, Long l10) {
        super(c2847t4, str, l10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2886w4
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo8154a(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f14488b + ": " + str);
            return null;
        }
    }
}
