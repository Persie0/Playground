package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ot6 implements v76 {
    public static final nt6 Companion = new nt6();

    /* JADX INFO: renamed from: a */
    public final String f54966a;

    /* JADX INFO: renamed from: b */
    public final String f54967b;

    /* JADX INFO: renamed from: c */
    public final boolean f54968c;

    public ot6(String str, String str2, boolean z) {
        this.f54966a = str;
        this.f54967b = str2;
        this.f54968c = z;
    }

    public static final ot6 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(ot6.class.getClassLoader());
        String string2 = "";
        if (bundle.containsKey("username")) {
            string = bundle.getString("username");
            if (string == null) {
                C3386nv.m17626m("Argument \"username\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        if (!bundle.containsKey("password") || (string2 = bundle.getString("password")) != null) {
            return new ot6(string, string2, bundle.containsKey("isSocial") ? bundle.getBoolean("isSocial") : false);
        }
        C3386nv.m17626m("Argument \"password\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot6)) {
            return false;
        }
        ot6 ot6Var = (ot6) obj;
        return this.f54966a.equals(ot6Var.f54966a) && this.f54967b.equals(ot6Var.f54967b) && this.f54968c == ot6Var.f54968c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54968c) + ux5.m22980c(this.f54966a.hashCode() * 31, this.f54967b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m23000w("OnboardingEndFragmentArgs(username=", this.f54966a, ", password=", this.f54967b, ", isSocial="), this.f54968c, ")");
    }
}
