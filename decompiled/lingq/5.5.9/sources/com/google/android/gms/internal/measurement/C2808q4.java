package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2808q4 extends AbstractC2886w4 {
    public C2808q4(C2847t4 c2847t4, String str, Boolean bool) {
        super(c2847t4, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2886w4
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo8154a(String str) {
        if (C2615c4.f14081b.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (C2615c4.f14082c.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f14488b + ": " + str);
        return null;
    }
}
