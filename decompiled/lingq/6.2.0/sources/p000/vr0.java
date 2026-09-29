package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class vr0 implements v76 {
    public static final ur0 Companion = new ur0();

    /* JADX INFO: renamed from: a */
    public final String f65821a;

    /* JADX INFO: renamed from: b */
    public final String f65822b;

    public vr0(String str, String str2) {
        this.f65821a = str;
        this.f65822b = str2;
    }

    public static final vr0 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(vr0.class.getClassLoader());
        if (!bundle.containsKey("challengeCode")) {
            C3386nv.m17626m("Required argument \"challengeCode\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("challengeCode");
        if (string == null) {
            C3386nv.m17626m("Argument \"challengeCode\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("title")) {
            C3386nv.m17626m("Required argument \"title\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("title");
        if (string2 != null) {
            return new vr0(string, string2);
        }
        C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return this.f65821a.equals(vr0Var.f65821a) && this.f65822b.equals(vr0Var.f65822b);
    }

    public final int hashCode() {
        return this.f65822b.hashCode() + (this.f65821a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ChallengeShareFragmentArgs(challengeCode=", this.f65821a, ", title=", this.f65822b, ")");
    }
}
