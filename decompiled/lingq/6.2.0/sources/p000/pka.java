package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class pka implements v76 {
    public static final oka Companion = new oka();

    /* JADX INFO: renamed from: a */
    public final UserImportSourceType f56382a;

    /* JADX INFO: renamed from: b */
    public final String f56383b;

    /* JADX INFO: renamed from: c */
    public final String f56384c;

    /* JADX INFO: renamed from: d */
    public final String f56385d;

    /* JADX INFO: renamed from: e */
    public final boolean f56386e;

    public pka(UserImportSourceType userImportSourceType, String str, String str2, String str3, boolean z) {
        this.f56382a = userImportSourceType;
        this.f56383b = str;
        this.f56384c = str2;
        this.f56385d = str3;
        this.f56386e = z;
    }

    public static final pka fromBundle(Bundle bundle) {
        String str;
        String str2;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(pka.class.getClassLoader());
        String string = "";
        if (bundle.containsKey("url")) {
            String string2 = bundle.getString("url");
            if (string2 == null) {
                C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value.");
                return null;
            }
            str = string2;
        } else {
            str = "";
        }
        if (bundle.containsKey("title")) {
            String string3 = bundle.getString("title");
            if (string3 == null) {
                C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value.");
                return null;
            }
            str2 = string3;
        } else {
            str2 = "";
        }
        if (bundle.containsKey("fileUri") && (string = bundle.getString("fileUri")) == null) {
            C3386nv.m17626m("Argument \"fileUri\" is marked as non-null but was passed a null value.");
            return null;
        }
        String str3 = string;
        boolean z = bundle.containsKey("fromExternal") ? bundle.getBoolean("fromExternal") : false;
        if (!bundle.containsKey("type")) {
            C3386nv.m17626m("Required argument \"type\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(UserImportSourceType.class) && !Serializable.class.isAssignableFrom(UserImportSourceType.class)) {
            C3386nv.m17636w(UserImportSourceType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        UserImportSourceType userImportSourceType = (UserImportSourceType) bundle.get("type");
        if (userImportSourceType != null) {
            return new pka(userImportSourceType, str, str2, str3, z);
        }
        C3386nv.m17626m("Argument \"type\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pka)) {
            return false;
        }
        pka pkaVar = (pka) obj;
        return this.f56382a == pkaVar.f56382a && this.f56383b.equals(pkaVar.f56383b) && this.f56384c.equals(pkaVar.f56384c) && this.f56385d.equals(pkaVar.f56385d) && this.f56386e == pkaVar.f56386e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56386e) + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f56382a.hashCode() * 31, this.f56383b, 31), this.f56384c, 31), this.f56385d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserImportFragmentArgs(type=");
        sb.append(this.f56382a);
        sb.append(", url=");
        sb.append(this.f56383b);
        sb.append(", title=");
        AbstractC3393o1.m17725C(sb, this.f56384c, ", fileUri=", this.f56385d, ", fromExternal=");
        return AbstractC3393o1.m17740o(sb, this.f56386e, ")");
    }
}
