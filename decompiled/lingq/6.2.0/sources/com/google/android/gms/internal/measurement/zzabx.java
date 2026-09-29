package com.google.android.gms.internal.measurement;

import p000.C3386nv;
import p000.yhb;

/* JADX INFO: loaded from: classes.dex */
public enum zzabx implements yhb {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    private final int zzf;

    zzabx(int i) {
        this.zzf = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // p000.yhb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzf;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }
}
