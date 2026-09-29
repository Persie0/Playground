package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y2b {
    private static final x2b Companion = new x2b();

    /* JADX INFO: renamed from: a */
    public final ArrayList f69194a;

    public y2b(ArrayList arrayList) {
        this.f69194a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24909a() {
        ArrayList<w2b> arrayList = this.f69194a;
        if (arrayList.isEmpty()) {
            return false;
        }
        for (w2b w2bVar : arrayList) {
            if (w2bVar.f66310a.equals("active") || w2bVar.f66310a.equals("trialing")) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2b) && this.f69194a.equals(((y2b) obj).f69194a);
    }

    public final int hashCode() {
        return this.f69194a.hashCode();
    }

    public final String toString() {
        return "Web2WaveSubscriptionStatus(subscriptions=" + this.f69194a + ")";
    }
}
