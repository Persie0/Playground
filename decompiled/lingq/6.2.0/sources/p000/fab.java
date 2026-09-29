package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class fab implements v76 {
    public static final eab Companion = new eab();

    /* JADX INFO: renamed from: a */
    public final String f38746a;

    public fab(String str) {
        this.f38746a = str;
    }

    public static final fab fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(fab.class.getClassLoader());
        if (!bundle.containsKey("url")) {
            C3386nv.m17626m("Required argument \"url\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("url");
        if (string != null) {
            return new fab(string);
        }
        C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fab) && this.f38746a.equals(((fab) obj).f38746a);
    }

    public final int hashCode() {
        return this.f38746a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("YearInReviewFragmentArgs(url=", this.f38746a, ")");
    }
}
