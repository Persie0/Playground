package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import p000.lda;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends Exception {

    /* JADX INFO: renamed from: a */
    public final ConnectionResult f11742a;

    public zzaf(ConnectionResult connectionResult) {
        lda.m16124j("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.f11637b == 0 || connectionResult.f11638c == null) ? false : true);
        this.f11742a = connectionResult;
    }
}
