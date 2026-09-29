package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.q */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2565q extends AbstractBinderC2564p {

    /* JADX INFO: renamed from: c */
    public final byte[] f13992c;

    public BinderC2565q(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f13992c = bArr;
    }

    @Override // com.google.android.gms.common.AbstractBinderC2564p
    /* JADX INFO: renamed from: h0 */
    public final byte[] mo7616h0() {
        return this.f13992c;
    }
}
