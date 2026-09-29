package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class yia implements v76 {
    public static final xia Companion = new xia();

    /* JADX INFO: renamed from: a */
    public final String f69880a;

    /* JADX INFO: renamed from: b */
    public final String f69881b;

    /* JADX INFO: renamed from: c */
    public final boolean f69882c;

    public yia(String str, String str2, boolean z) {
        this.f69880a = str;
        this.f69881b = str2;
        this.f69882c = z;
    }

    public static final yia fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(yia.class.getClassLoader());
        if (!bundle.containsKey("attemptedAction")) {
            C3386nv.m17626m("Required argument \"attemptedAction\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("attemptedAction");
        if (string2 == null) {
            C3386nv.m17626m("Argument \"attemptedAction\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (bundle.containsKey("offer")) {
            string = bundle.getString("offer");
            if (string == null) {
                C3386nv.m17626m("Argument \"offer\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new yia(string2, string, bundle.containsKey("plusDefault") ? bundle.getBoolean("plusDefault") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yia)) {
            return false;
        }
        yia yiaVar = (yia) obj;
        return this.f69880a.equals(yiaVar.f69880a) && this.f69881b.equals(yiaVar.f69881b) && this.f69882c == yiaVar.f69882c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69882c) + ux5.m22980c(this.f69880a.hashCode() * 31, this.f69881b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m23000w("UpgradeTestFragmentArgs(attemptedAction=", this.f69880a, ", offer=", this.f69881b, ", plusDefault="), this.f69882c, ")");
    }
}
