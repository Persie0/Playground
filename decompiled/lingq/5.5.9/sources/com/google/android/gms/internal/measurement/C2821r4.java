package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2821r4 extends AbstractC2886w4 {
    public C2821r4(C2847t4 c2847t4, Double d10) {
        super(c2847t4, "measurement.test.double_flag", d10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2886w4
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo8154a(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.f14488b + ": " + str);
            return null;
        }
    }
}
