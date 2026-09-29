package p000;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class t63 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f61911a;

    public t63(SparseBooleanArray sparseBooleanArray) {
        this.f61911a = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t63) {
            return this.f61911a.equals(((t63) obj).f61911a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61911a.hashCode();
    }
}
