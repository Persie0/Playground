package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.navigation.model.ImportDataNavArg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class zu3 implements v76 {
    public static final yu3 Companion = new yu3();

    /* JADX INFO: renamed from: a */
    public final String f72172a;

    /* JADX INFO: renamed from: b */
    public final ImportDataNavArg f72173b;

    /* JADX INFO: renamed from: c */
    public final int f72174c;

    public zu3(String str, ImportDataNavArg importDataNavArg, int i) {
        this.f72172a = str;
        this.f72173b = importDataNavArg;
        this.f72174c = i;
    }

    public static final zu3 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(zu3.class.getClassLoader());
        ImportDataNavArg importDataNavArg = null;
        if (bundle.containsKey("languageFromDeeplink")) {
            string = bundle.getString("languageFromDeeplink");
            if (string == null) {
                C3386nv.m17626m("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        if (bundle.containsKey("shareData")) {
            if (!Parcelable.class.isAssignableFrom(ImportDataNavArg.class) && !Serializable.class.isAssignableFrom(ImportDataNavArg.class)) {
                C3386nv.m17636w(ImportDataNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            importDataNavArg = (ImportDataNavArg) bundle.get("shareData");
        }
        return new zu3(string, importDataNavArg, bundle.containsKey("currentTrack") ? bundle.getInt("currentTrack") : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu3)) {
            return false;
        }
        zu3 zu3Var = (zu3) obj;
        return this.f72172a.equals(zu3Var.f72172a) && fa4.m11650l(this.f72173b, zu3Var.f72173b) && this.f72174c == zu3Var.f72174c;
    }

    public final int hashCode() {
        int iHashCode = this.f72172a.hashCode() * 31;
        ImportDataNavArg importDataNavArg = this.f72173b;
        return Integer.hashCode(this.f72174c) + ((iHashCode + (importDataNavArg == null ? 0 : importDataNavArg.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeFragmentArgs(languageFromDeeplink=");
        sb.append(this.f72172a);
        sb.append(", shareData=");
        sb.append(this.f72173b);
        sb.append(", currentTrack=");
        return wq1.m24123s(sb, this.f72174c, ")");
    }
}
