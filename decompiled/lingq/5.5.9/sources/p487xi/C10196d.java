package p487xi;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: xi.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10196d implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f51563a;

    /* JADX INFO: renamed from: b */
    public final String f51564b;

    /* JADX INFO: renamed from: c */
    public final int f51565c;

    /* JADX INFO: renamed from: d */
    public final String f51566d;

    /* JADX INFO: renamed from: e */
    public final float f51567e;

    public C10196d(String str, String str2, int i10, String str3, float f3) {
        this.f51563a = str;
        this.f51564b = str2;
        this.f51565c = i10;
        this.f51566d = str3;
        this.f51567e = f3;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public static final C10196d fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C10196d.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("stat")) {
            throw new IllegalArgumentException("Required argument \"stat\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("stat");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"stat\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("numberOfFields")) {
            throw new IllegalArgumentException("Required argument \"numberOfFields\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("numberOfFields");
        if (!bundle.containsKey("interval")) {
            throw new IllegalArgumentException("Required argument \"interval\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("interval");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"interval\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("progress")) {
            return new C10196d(string, string2, i10, string3, bundle.getFloat("progress"));
        }
        throw new IllegalArgumentException("Required argument \"progress\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10196d)) {
            return false;
        }
        C10196d c10196d = (C10196d) obj;
        return C5207g.m11106a(this.f51563a, c10196d.f51563a) && C5207g.m11106a(this.f51564b, c10196d.f51564b) && this.f51565c == c10196d.f51565c && C5207g.m11106a(this.f51566d, c10196d.f51566d) && Float.compare(this.f51567e, c10196d.f51567e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f51567e) + C0166e.m758d(this.f51566d, C0009a.m16d(this.f51565c, C0166e.m758d(this.f51564b, this.f51563a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "LanguageProgressUpdateFragmentArgs(title=" + this.f51563a + ", stat=" + this.f51564b + ", numberOfFields=" + this.f51565c + ", interval=" + this.f51566d + ", progress=" + this.f51567e + ")";
    }
}
