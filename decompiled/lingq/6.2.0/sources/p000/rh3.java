package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class rh3 implements v76 {
    public static final qh3 Companion = new qh3();

    /* JADX INFO: renamed from: a */
    public final String f59263a;

    /* JADX INFO: renamed from: b */
    public final boolean f59264b;

    /* JADX INFO: renamed from: c */
    public final String f59265c;

    public rh3(String str, String str2, boolean z) {
        this.f59263a = str;
        this.f59264b = z;
        this.f59265c = str2;
    }

    public static final rh3 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(rh3.class.getClassLoader());
        if (!bundle.containsKey("attemptedAction")) {
            C3386nv.m17626m("Required argument \"attemptedAction\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("attemptedAction");
        if (string2 == null) {
            C3386nv.m17626m("Argument \"attemptedAction\" is marked as non-null but was passed a null value.");
            return null;
        }
        boolean z = bundle.containsKey("isPlusDefault") ? bundle.getBoolean("isPlusDefault") : false;
        if (bundle.containsKey("offer")) {
            string = bundle.getString("offer");
            if (string == null) {
                C3386nv.m17626m("Argument \"offer\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new rh3(string2, string, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh3)) {
            return false;
        }
        rh3 rh3Var = (rh3) obj;
        return this.f59263a.equals(rh3Var.f59263a) && this.f59264b == rh3Var.f59264b && this.f59265c.equals(rh3Var.f59265c);
    }

    public final int hashCode() {
        return this.f59265c.hashCode() + g9a.m12428e(this.f59263a.hashCode() * 31, 31, this.f59264b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeTrialFragmentArgs(attemptedAction=");
        sb.append(this.f59263a);
        sb.append(", isPlusDefault=");
        sb.append(this.f59264b);
        sb.append(", offer=");
        return AbstractC3393o1.m17738m(sb, this.f59265c, ")");
    }
}
