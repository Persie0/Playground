package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2643e4 extends AbstractC2860u4 {

    /* JADX INFO: renamed from: a */
    public final Context f14167a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2588a5 f14168b;

    public C2643e4(Context context, InterfaceC2588a5 interfaceC2588a5) {
        this.f14167a = context;
        this.f14168b = interfaceC2588a5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2860u4
    /* JADX INFO: renamed from: a */
    public final Context mo7767a() {
        return this.f14167a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2860u4
    /* JADX INFO: renamed from: b */
    public final InterfaceC2588a5 mo7768b() {
        return this.f14168b;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r9.mo7768b() == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2860u4) {
            AbstractC2860u4 abstractC2860u4 = (AbstractC2860u4) obj;
            if (this.f14167a.equals(abstractC2860u4.mo7767a())) {
                InterfaceC2588a5 interfaceC2588a5 = this.f14168b;
                if (interfaceC2588a5 != null) {
                    if (interfaceC2588a5.equals(abstractC2860u4.mo7768b())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14167a.hashCode() ^ 1000003;
        InterfaceC2588a5 interfaceC2588a5 = this.f14168b;
        return (iHashCode * 1000003) ^ (interfaceC2588a5 == null ? 0 : interfaceC2588a5.hashCode());
    }

    public final String toString() {
        return C0166e.m766l("FlagsContext{context=", this.f14167a.toString(), ", hermeticFileOverrides=", String.valueOf(this.f14168b), "}");
    }
}
