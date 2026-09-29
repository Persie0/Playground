package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class us0 implements v76 {
    public static final ts0 Companion = new ts0();

    /* JADX INFO: renamed from: a */
    public final String f64280a;

    public us0(String str) {
        this.f64280a = str;
    }

    public static final us0 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(us0.class.getClassLoader());
        if (bundle.containsKey("languageFromDeeplink")) {
            string = bundle.getString("languageFromDeeplink");
            if (string == null) {
                C3386nv.m17626m("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new us0(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us0) && this.f64280a.equals(((us0) obj).f64280a);
    }

    public final int hashCode() {
        return this.f64280a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ChallengesFragmentArgs(languageFromDeeplink=", this.f64280a, ")");
    }
}
