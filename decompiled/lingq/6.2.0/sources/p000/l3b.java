package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l3b implements v76 {
    public static final k3b Companion = new k3b();

    /* JADX INFO: renamed from: a */
    public final String f48996a;

    /* JADX INFO: renamed from: b */
    public final String f48997b;

    /* JADX INFO: renamed from: c */
    public final String f48998c;

    public l3b(String str, String str2, String str3) {
        this.f48996a = str;
        this.f48997b = str2;
        this.f48998c = str3;
    }

    public static final l3b fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(l3b.class.getClassLoader());
        if (!bundle.containsKey("url")) {
            C3386nv.m17626m("Required argument \"url\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("url");
        if (string != null) {
            return new l3b(string, bundle.containsKey("grammarOpenedPath") ? bundle.getString("grammarOpenedPath") : null, bundle.containsKey("title") ? bundle.getString("title") : null);
        }
        C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3b)) {
            return false;
        }
        l3b l3bVar = (l3b) obj;
        return this.f48996a.equals(l3bVar.f48996a) && fa4.m11650l(this.f48997b, l3bVar.f48997b) && fa4.m11650l(this.f48998c, l3bVar.f48998c);
    }

    public final int hashCode() {
        int iHashCode = this.f48996a.hashCode() * 31;
        String str = this.f48997b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48998c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("WebViewFragmentArgs(url=", this.f48996a, ", grammarOpenedPath=", this.f48997b, ", title="), this.f48998c, ")");
    }
}
