package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62739a;

    public tq8(ArrayList arrayList) {
        this.f62739a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq8) && this.f62739a.equals(((tq8) obj).f62739a);
    }

    public final int hashCode() {
        return this.f62739a.hashCode();
    }

    public final String toString() {
        return "HeaderSelectable(tabs=" + this.f62739a + ")";
    }
}
