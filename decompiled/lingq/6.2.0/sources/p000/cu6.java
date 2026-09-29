package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class cu6 implements v76 {
    public static final bu6 Companion = new bu6();

    /* JADX INFO: renamed from: a */
    public final String f34547a;

    public cu6(String str) {
        this.f34547a = str;
    }

    public static final cu6 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(cu6.class.getClassLoader());
        if (bundle.containsKey("authCode")) {
            string = bundle.getString("authCode");
            if (string == null) {
                C3386nv.m17626m("Argument \"authCode\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new cu6(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu6) && this.f34547a.equals(((cu6) obj).f34547a);
    }

    public final int hashCode() {
        return this.f34547a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnboardingLoginFragmentArgs(authCode=", this.f34547a, ")");
    }
}
