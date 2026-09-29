package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import p000.ij6;
import p000.lgc;
import p000.wq1;
import p000.z3c;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0997h {
    protected transient int zza;

    /* JADX INFO: renamed from: a */
    public abstract void mo5529a(z3c z3cVar);

    /* JADX INFO: renamed from: b */
    public final byte[] m5530b() {
        try {
            int iMo5532d = mo5532d();
            byte[] bArr = new byte[iMo5532d];
            z3c z3cVar = new z3c(iMo5532d, bArr);
            mo5529a(z3cVar);
            if (iMo5532d - z3cVar.f70848d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            ij6.m13958p(wq1.m24118n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo5531c(lgc lgcVar);

    /* JADX INFO: renamed from: d */
    public abstract int mo5532d();
}
