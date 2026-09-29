package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class in3 {

    /* JADX INFO: renamed from: a */
    public final Map f44302a;

    /* JADX INFO: renamed from: b */
    public final Map f44303b;

    public in3(Map map, Map map2) {
        this.f44302a = map;
        this.f44303b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in3)) {
            return false;
        }
        in3 in3Var = (in3) obj;
        return this.f44302a.equals(in3Var.f44302a) && this.f44303b.equals(in3Var.f44303b);
    }

    public final int hashCode() {
        return this.f44303b.hashCode() + (this.f44302a.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.f44302a + ", providerNameToReceivers=" + this.f44303b + ')';
    }
}
