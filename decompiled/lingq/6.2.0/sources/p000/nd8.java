package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nd8 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f52624a;

    public nd8(ArrayList arrayList) {
        this.f52624a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd8) && this.f52624a.equals(((nd8) obj).f52624a);
    }

    public final int hashCode() {
        return this.f52624a.hashCode();
    }

    public final String toString() {
        return "ReviewMatchingState(pairs=" + this.f52624a + ")";
    }
}
