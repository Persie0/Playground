package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fi9 extends hi9 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f39152a;

    public fi9(ArrayList arrayList) {
        this.f39152a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi9) && this.f39152a.equals(((fi9) obj).f39152a);
    }

    public final int hashCode() {
        return this.f39152a.hashCode();
    }

    public final String toString() {
        return "Loading(stats=" + this.f39152a + ")";
    }
}
