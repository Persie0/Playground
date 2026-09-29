package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sb4 {

    /* JADX INFO: renamed from: a */
    public final long f60620a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f60621b;

    public sb4(long j, ArrayList arrayList) {
        this.f60620a = j;
        this.f60621b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb4)) {
            return false;
        }
        sb4 sb4Var = (sb4) obj;
        return this.f60620a == sb4Var.f60620a && this.f60621b.equals(sb4Var.f60621b);
    }

    public final int hashCode() {
        return this.f60621b.hashCode() + (Long.hashCode(this.f60620a) * 31);
    }

    public final String toString() {
        return "IterableEmbeddedPlacement(placementId=" + this.f60620a + ", messages=" + this.f60621b + ")";
    }
}
