package com.google.android.datatransport.cct.internal;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2341c extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: a */
    public final NetworkConnectionInfo.NetworkType f11773a;

    /* JADX INFO: renamed from: b */
    public final NetworkConnectionInfo.MobileSubtype f11774b;

    public C2341c(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f11773a = networkType;
        this.f11774b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    /* JADX INFO: renamed from: a */
    public final NetworkConnectionInfo.MobileSubtype mo6754a() {
        return this.f11774b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    /* JADX INFO: renamed from: b */
    public final NetworkConnectionInfo.NetworkType mo6755b() {
        return this.f11773a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        NetworkConnectionInfo.MobileSubtype mobileSubtype;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f11773a;
        if (networkType == null) {
            if (networkConnectionInfo.mo6755b() == null) {
                mobileSubtype = this.f11774b;
                if (mobileSubtype == null) {
                    if (networkConnectionInfo.mo6754a() == null) {
                        return true;
                    }
                } else if (mobileSubtype.equals(networkConnectionInfo.mo6754a())) {
                    return true;
                }
            }
        } else if (networkType.equals(networkConnectionInfo.mo6755b())) {
            mobileSubtype = this.f11774b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.mo6754a() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.mo6754a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        NetworkConnectionInfo.NetworkType networkType = this.f11773a;
        int iHashCode2 = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f11774b;
        if (mobileSubtype != null) {
            iHashCode = mobileSubtype.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f11773a + ", mobileSubtype=" + this.f11774b + "}";
    }
}
