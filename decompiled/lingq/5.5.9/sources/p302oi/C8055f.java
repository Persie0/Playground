package p302oi;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.imports.ImportData;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: oi.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8055f implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final ImportData f43744a;

    /* JADX INFO: renamed from: b */
    public final String f43745b;

    public C8055f() {
        this(null, "");
    }

    public C8055f(ImportData importData, String str) {
        C5207g.m11111f(str, "languageFromDeeplink");
        this.f43744a = importData;
        this.f43745b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C8055f fromBundle(Bundle bundle) {
        ImportData importData;
        String string;
        if (C0166e.m778y(bundle, "bundle", C8055f.class, "shareData")) {
            if (!Parcelable.class.isAssignableFrom(ImportData.class) && !Serializable.class.isAssignableFrom(ImportData.class)) {
                throw new UnsupportedOperationException(ImportData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            importData = (ImportData) bundle.get("shareData");
        } else {
            importData = null;
        }
        if (bundle.containsKey("languageFromDeeplink")) {
            string = bundle.getString("languageFromDeeplink");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C8055f(importData, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8055f)) {
            return false;
        }
        C8055f c8055f = (C8055f) obj;
        return C5207g.m11106a(this.f43744a, c8055f.f43744a) && C5207g.m11106a(this.f43745b, c8055f.f43745b);
    }

    public final int hashCode() {
        ImportData importData = this.f43744a;
        return this.f43745b.hashCode() + ((importData == null ? 0 : importData.hashCode()) * 31);
    }

    public final String toString() {
        return "StartFragmentArgs(shareData=" + this.f43744a + ", languageFromDeeplink=" + this.f43745b + ")";
    }
}
