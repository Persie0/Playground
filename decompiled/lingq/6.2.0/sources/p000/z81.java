package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class z81 implements v76 {
    public static final y81 Companion = new y81();

    /* JADX INFO: renamed from: a */
    public final int f71040a;

    /* JADX INFO: renamed from: b */
    public final String f71041b;

    /* JADX INFO: renamed from: c */
    public final String f71042c;

    public z81(String str, int i, String str2) {
        this.f71040a = i;
        this.f71041b = str;
        this.f71042c = str2;
    }

    public static final z81 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(z81.class.getClassLoader());
        if (!bundle.containsKey("courseId")) {
            C3386nv.m17626m("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i = bundle.getInt("courseId");
        if (!bundle.containsKey("courseTitle")) {
            C3386nv.m17626m("Required argument \"courseTitle\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("courseTitle");
        if (string == null) {
            C3386nv.m17626m("Argument \"courseTitle\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("shelfCode")) {
            C3386nv.m17626m("Required argument \"shelfCode\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("shelfCode");
        if (string2 != null) {
            return new z81(string, i, string2);
        }
        C3386nv.m17626m("Argument \"shelfCode\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z81)) {
            return false;
        }
        z81 z81Var = (z81) obj;
        return this.f71040a == z81Var.f71040a && this.f71041b.equals(z81Var.f71041b) && this.f71042c.equals(z81Var.f71042c);
    }

    public final int hashCode() {
        return this.f71042c.hashCode() + ux5.m22980c(Integer.hashCode(this.f71040a) * 31, this.f71041b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f71040a, "CollectionPlaylistFragmentArgs(courseId=", ", courseTitle=", this.f71041b, ", shelfCode="), this.f71042c, ")");
    }
}
