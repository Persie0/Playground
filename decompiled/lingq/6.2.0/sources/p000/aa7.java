package p000;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class aa7 {

    /* JADX INFO: renamed from: a */
    public final t63 f425a;

    static {
        new SparseBooleanArray();
        bna.m3987z(!false);
        uma.m22828w(0);
    }

    public aa7(t63 t63Var) {
        this.f425a = t63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aa7) {
            return this.f425a.equals(((aa7) obj).f425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f425a.f61911a.hashCode();
    }
}
