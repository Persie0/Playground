package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class c01 implements v76 {
    public static final b01 Companion = new b01();

    /* JADX INFO: renamed from: a */
    public final String f9245a;

    public c01(String str) {
        this.f9245a = str;
    }

    public static final c01 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(c01.class.getClassLoader());
        if (!bundle.containsKey("email")) {
            C3386nv.m17626m("Required argument \"email\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("email");
        if (string != null) {
            return new c01(string);
        }
        C3386nv.m17626m("Argument \"email\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c01) && this.f9245a.equals(((c01) obj).f9245a);
    }

    public final int hashCode() {
        return this.f9245a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("CheckEmailFragmentArgs(email=", this.f9245a, ")");
    }
}
