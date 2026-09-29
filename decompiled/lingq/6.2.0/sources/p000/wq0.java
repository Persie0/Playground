package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class wq0 implements v76 {
    public static final vq0 Companion = new vq0();

    /* JADX INFO: renamed from: a */
    public final String f67168a;

    /* JADX INFO: renamed from: b */
    public final String f67169b;

    /* JADX INFO: renamed from: c */
    public final String f67170c;

    public wq0(String str, String str2, String str3) {
        this.f67168a = str;
        this.f67169b = str2;
        this.f67170c = str3;
    }

    public static final wq0 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(wq0.class.getClassLoader());
        if (!bundle.containsKey("challengeCode")) {
            C3386nv.m17626m("Required argument \"challengeCode\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("challengeCode");
        if (string2 == null) {
            C3386nv.m17626m("Argument \"challengeCode\" is marked as non-null but was passed a null value.");
            return null;
        }
        String string3 = "";
        if (bundle.containsKey("challengeType")) {
            string = bundle.getString("challengeType");
            if (string == null) {
                C3386nv.m17626m("Argument \"challengeType\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        if (!bundle.containsKey("languageFromDeeplink") || (string3 = bundle.getString("languageFromDeeplink")) != null) {
            return new wq0(string2, string, string3);
        }
        C3386nv.m17626m("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq0)) {
            return false;
        }
        wq0 wq0Var = (wq0) obj;
        return this.f67168a.equals(wq0Var.f67168a) && this.f67169b.equals(wq0Var.f67169b) && this.f67170c.equals(wq0Var.f67170c);
    }

    public final int hashCode() {
        return this.f67170c.hashCode() + ux5.m22980c(this.f67168a.hashCode() * 31, this.f67169b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ChallengeDetailsFragmentArgs(challengeCode=", this.f67168a, ", challengeType=", this.f67169b, ", languageFromDeeplink="), this.f67170c, ")");
    }
}
