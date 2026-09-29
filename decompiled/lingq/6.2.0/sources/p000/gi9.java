package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gi9 extends hi9 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f40856a;

    public gi9(ArrayList arrayList) {
        this.f40856a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi9) && this.f40856a.equals(((gi9) obj).f40856a);
    }

    public final int hashCode() {
        return this.f40856a.hashCode();
    }

    public final String toString() {
        return "Success(stats=" + this.f40856a + ")";
    }
}
