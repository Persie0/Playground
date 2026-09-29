package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class af0 implements v76 {
    public static final ze0 Companion = new ze0();

    /* JADX INFO: renamed from: a */
    public final boolean f567a;

    /* JADX INFO: renamed from: b */
    public final boolean f568b;

    /* JADX INFO: renamed from: c */
    public final int f569c;

    public af0(int i, boolean z, boolean z2) {
        this.f567a = z;
        this.f568b = z2;
        this.f569c = i;
    }

    public static final af0 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(af0.class.getClassLoader());
        if (!bundle.containsKey("isJoined")) {
            C3386nv.m17626m("Required argument \"isJoined\" is missing and does not have an android:defaultValue");
            return null;
        }
        return new af0(bundle.containsKey("replaceBookId") ? bundle.getInt("replaceBookId") : -1, bundle.getBoolean("isJoined"), bundle.containsKey("multiBookEnabled") ? bundle.getBoolean("multiBookEnabled") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return this.f567a == af0Var.f567a && this.f568b == af0Var.f568b && this.f569c == af0Var.f569c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f569c) + g9a.m12428e(Boolean.hashCode(this.f567a) * 31, 31, this.f568b);
    }

    public final String toString() {
        return wq1.m24123s(hn1.m13357g("BookChallengeChooserParentFragmentArgs(isJoined=", ", multiBookEnabled=", ", replaceBookId=", this.f567a, this.f568b), this.f569c, ")");
    }
}
