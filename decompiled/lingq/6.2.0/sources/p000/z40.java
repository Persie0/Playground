package p000;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;

/* JADX INFO: loaded from: classes.dex */
public final class z40 extends wj6 {

    /* JADX INFO: renamed from: a */
    public final NetworkConnectionInfo$NetworkType f70855a;

    /* JADX INFO: renamed from: b */
    public final NetworkConnectionInfo$MobileSubtype f70856b;

    public z40(NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType, NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype) {
        this.f70855a = networkConnectionInfo$NetworkType;
        this.f70856b = networkConnectionInfo$MobileSubtype;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wj6) {
            wj6 wj6Var = (wj6) obj;
            NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = this.f70855a;
            if (networkConnectionInfo$NetworkType != null ? networkConnectionInfo$NetworkType.equals(((z40) wj6Var).f70855a) : ((z40) wj6Var).f70855a == null) {
                NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = this.f70856b;
                if (networkConnectionInfo$MobileSubtype != null ? networkConnectionInfo$MobileSubtype.equals(((z40) wj6Var).f70856b) : ((z40) wj6Var).f70856b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = this.f70855a;
        int iHashCode = ((networkConnectionInfo$NetworkType == null ? 0 : networkConnectionInfo$NetworkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = this.f70856b;
        return iHashCode ^ (networkConnectionInfo$MobileSubtype != null ? networkConnectionInfo$MobileSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f70855a + ", mobileSubtype=" + this.f70856b + "}";
    }
}
