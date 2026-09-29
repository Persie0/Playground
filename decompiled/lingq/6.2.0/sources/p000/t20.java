package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t20 extends vb0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f61761a;

    public t20(ArrayList arrayList) {
        this.f61761a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb0)) {
            return false;
        }
        return this.f61761a.equals(((t20) ((vb0) obj)).f61761a);
    }

    public final int hashCode() {
        return this.f61761a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f61761a + "}";
    }
}
