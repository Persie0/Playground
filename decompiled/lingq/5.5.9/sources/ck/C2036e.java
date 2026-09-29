package ck;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ck.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2036e implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f10485a;

    /* JADX INFO: renamed from: b */
    public final int f10486b;

    public C2036e(String str, int i10) {
        this.f10485a = str;
        this.f10486b = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C2036e fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C2036e.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("viewKey")) {
            return new C2036e(string, bundle.getInt("viewKey"));
        }
        throw new IllegalArgumentException("Required argument \"viewKey\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2036e)) {
            return false;
        }
        C2036e c2036e = (C2036e) obj;
        return C5207g.m11106a(this.f10485a, c2036e.f10485a) && this.f10486b == c2036e.f10486b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10486b) + (this.f10485a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsEditFragmentArgs(title=" + this.f10485a + ", viewKey=" + this.f10486b + ")";
    }
}
