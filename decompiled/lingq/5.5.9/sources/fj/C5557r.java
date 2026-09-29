package fj;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.commons.p053ui.UserImportDetailType;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: fj.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C5557r implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f34311a;

    /* JADX INFO: renamed from: b */
    public final boolean f34312b;

    /* JADX INFO: renamed from: c */
    public final UserImportDetailType f34313c;

    public C5557r(String str, boolean z10, UserImportDetailType userImportDetailType) {
        this.f34311a = str;
        this.f34312b = z10;
        this.f34313c = userImportDetailType;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public static final C5557r fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C5557r.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("isUrl")) {
            throw new IllegalArgumentException("Required argument \"isUrl\" is missing and does not have an android:defaultValue");
        }
        boolean z10 = bundle.getBoolean("isUrl");
        if (!bundle.containsKey("userImportDetailType")) {
            throw new IllegalArgumentException("Required argument \"userImportDetailType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(UserImportDetailType.class) && !Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            throw new UnsupportedOperationException(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        UserImportDetailType userImportDetailType = (UserImportDetailType) bundle.get("userImportDetailType");
        if (userImportDetailType != null) {
            return new C5557r(string, z10, userImportDetailType);
        }
        throw new IllegalArgumentException("Argument \"userImportDetailType\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5557r)) {
            return false;
        }
        C5557r c5557r = (C5557r) obj;
        return C5207g.m11106a(this.f34311a, c5557r.f34311a) && this.f34312b == c5557r.f34312b && this.f34313c == c5557r.f34313c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.f34311a.hashCode() * 31;
        boolean z10 = this.f34312b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f34313c.hashCode() + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        return "UserImportTextFragmentArgs(title=" + this.f34311a + ", isUrl=" + this.f34312b + ", userImportDetailType=" + this.f34313c + ")";
    }
}
