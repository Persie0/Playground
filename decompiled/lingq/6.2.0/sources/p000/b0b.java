package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class b0b implements v76 {
    public static final a0b Companion = new a0b();

    /* JADX INFO: renamed from: a */
    public final String f7739a;

    /* JADX INFO: renamed from: b */
    public final String f7740b;

    public b0b(String str, String str2) {
        this.f7739a = str;
        this.f7740b = str2;
    }

    public static final b0b fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(b0b.class.getClassLoader());
        String string2 = "";
        if (bundle.containsKey("vocabularyLanguageFromDeeplink")) {
            string = bundle.getString("vocabularyLanguageFromDeeplink");
            if (string == null) {
                C3386nv.m17626m("Argument \"vocabularyLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        if (!bundle.containsKey("lotd") || (string2 = bundle.getString("lotd")) != null) {
            return new b0b(string, string2);
        }
        C3386nv.m17626m("Argument \"lotd\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0b)) {
            return false;
        }
        b0b b0bVar = (b0b) obj;
        return this.f7739a.equals(b0bVar.f7739a) && this.f7740b.equals(b0bVar.f7740b);
    }

    public final int hashCode() {
        return this.f7740b.hashCode() + (this.f7739a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("VocabularyFragmentArgs(vocabularyLanguageFromDeeplink=", this.f7739a, ", lotd=", this.f7740b, ")");
    }
}
