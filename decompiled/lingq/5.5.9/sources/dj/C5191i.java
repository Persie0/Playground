package dj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: dj.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5191i implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f33230a;

    /* JADX INFO: renamed from: b */
    public final String f33231b;

    public C5191i() {
        this("", "");
    }

    public C5191i(String str, String str2) {
        C5207g.m11111f(str, "vocabularyLanguageFromDeeplink");
        C5207g.m11111f(str2, "lotd");
        this.f33230a = str;
        this.f33231b = str2;
    }

    public static final C5191i fromBundle(Bundle bundle) {
        String string;
        String string2 = "";
        if (C0166e.m778y(bundle, "bundle", C5191i.class, "vocabularyLanguageFromDeeplink")) {
            string = bundle.getString("vocabularyLanguageFromDeeplink");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"vocabularyLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = string2;
        }
        if (bundle.containsKey("lotd") && (string2 = bundle.getString("lotd")) == null) {
            throw new IllegalArgumentException("Argument \"lotd\" is marked as non-null but was passed a null value.");
        }
        return new C5191i(string, string2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5191i)) {
            return false;
        }
        C5191i c5191i = (C5191i) obj;
        if (C5207g.m11106a(this.f33230a, c5191i.f33230a) && C5207g.m11106a(this.f33231b, c5191i.f33231b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33231b.hashCode() + (this.f33230a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VocabularyFragmentArgs(vocabularyLanguageFromDeeplink=");
        sb2.append(this.f33230a);
        sb2.append(", lotd=");
        return C0009a.m23l(sb2, this.f33231b, ")");
    }
}
