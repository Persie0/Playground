package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ula implements v76 {
    public static final tla Companion = new tla();

    /* JADX INFO: renamed from: a */
    public final String f64049a;

    /* JADX INFO: renamed from: b */
    public final String f64050b;

    /* JADX INFO: renamed from: c */
    public final String f64051c;

    public ula(String str, String str2, String str3) {
        this.f64049a = str;
        this.f64050b = str2;
        this.f64051c = str3;
    }

    public static final ula fromBundle(Bundle bundle) {
        String string;
        String string2;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(ula.class.getClassLoader());
        String string3 = "";
        if (bundle.containsKey("url")) {
            string = bundle.getString("url");
            if (string == null) {
                C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        if (bundle.containsKey("title")) {
            string2 = bundle.getString("title");
            if (string2 == null) {
                C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string2 = "";
        }
        if (!bundle.containsKey("fileUri") || (string3 = bundle.getString("fileUri")) != null) {
            return new ula(string, string2, string3);
        }
        C3386nv.m17626m("Argument \"fileUri\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ula)) {
            return false;
        }
        ula ulaVar = (ula) obj;
        return this.f64049a.equals(ulaVar.f64049a) && this.f64050b.equals(ulaVar.f64050b) && this.f64051c.equals(ulaVar.f64051c);
    }

    public final int hashCode() {
        return this.f64051c.hashCode() + ux5.m22980c(this.f64049a.hashCode() * 31, this.f64050b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("UserImportTypeFragmentArgs(url=", this.f64049a, ", title=", this.f64050b, ", fileUri="), this.f64051c, ")");
    }
}
