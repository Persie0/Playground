package com.google.android.play.core.review;

import android.app.PendingIntent;
import p000.AbstractC3393o1;
import p000.C3386nv;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends ReviewInfo {

    /* JADX INFO: renamed from: a */
    public final PendingIntent f13363a;

    /* JADX INFO: renamed from: b */
    public final boolean f13364b;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            C3386nv.m17635v("Null pendingIntent");
            throw null;
        }
        this.f13363a = pendingIntent;
        this.f13364b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            zza zzaVar = (zza) ((ReviewInfo) obj);
            if (this.f13363a.equals(zzaVar.f13363a) && this.f13364b == zzaVar.f13364b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f13364b ? 1237 : 1231) ^ ((this.f13363a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(AbstractC3393o1.m17742q("ReviewInfo{pendingIntent=", this.f13363a.toString(), ", isNoOp="), this.f13364b, "}");
    }
}
