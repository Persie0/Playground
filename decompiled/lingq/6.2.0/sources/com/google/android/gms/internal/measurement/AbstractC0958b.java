package com.google.android.gms.internal.measurement;

import p000.C3386nv;
import p000.hhb;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0958b {
    /* JADX INFO: renamed from: a */
    public static final zzacr m5359a(hhb hhbVar, byte[] bArr) {
        if (hhbVar.m13276x() > 0) {
            C3386nv.m17633t("Did not write as much data as expected.");
            return null;
        }
        if (hhbVar.m13276x() >= 0) {
            return new zzacq(bArr);
        }
        C3386nv.m17633t("Wrote more data than expected.");
        return null;
    }
}
