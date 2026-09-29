package p000;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class te7 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62195a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f62196b;

    public te7(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        this.f62195a = arrayList;
        this.f62196b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te7)) {
            return false;
        }
        te7 te7Var = (te7) obj;
        return this.f62195a.equals(te7Var.f62195a) && this.f62196b.equals(te7Var.f62196b);
    }

    public final int hashCode() {
        return this.f62196b.hashCode() + (this.f62195a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistStructure(items=" + this.f62195a + ", lessonIds=" + this.f62196b + ")";
    }
}
