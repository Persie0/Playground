package p000;

import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;

/* JADX INFO: loaded from: classes.dex */
public final class u20 extends q31 {

    /* JADX INFO: renamed from: a */
    public final ClientInfo$ClientType f63261a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3573sg f63262b;

    public u20(ClientInfo$ClientType clientInfo$ClientType, r20 r20Var) {
        this.f63261a = clientInfo$ClientType;
        this.f63262b = r20Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q31) {
            q31 q31Var = (q31) obj;
            ClientInfo$ClientType clientInfo$ClientType = this.f63261a;
            if (clientInfo$ClientType != null ? clientInfo$ClientType.equals(((u20) q31Var).f63261a) : ((u20) q31Var).f63261a == null) {
                AbstractC3573sg abstractC3573sg = this.f63262b;
                if (abstractC3573sg != null ? abstractC3573sg.equals(((u20) q31Var).f63262b) : ((u20) q31Var).f63262b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo$ClientType clientInfo$ClientType = this.f63261a;
        int iHashCode = ((clientInfo$ClientType == null ? 0 : clientInfo$ClientType.hashCode()) ^ 1000003) * 1000003;
        AbstractC3573sg abstractC3573sg = this.f63262b;
        return iHashCode ^ (abstractC3573sg != null ? abstractC3573sg.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f63261a + ", androidClientInfo=" + this.f63262b + "}";
    }
}
