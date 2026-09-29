package p218k9;

import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import com.google.android.exoplayer2.C2416m;
import p479xa.C10129a;

/* JADX INFO: renamed from: k9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6637g {

    /* JADX INFO: renamed from: a */
    public final String f37617a;

    /* JADX INFO: renamed from: b */
    public final C2416m f37618b;

    /* JADX INFO: renamed from: c */
    public final C2416m f37619c;

    /* JADX INFO: renamed from: d */
    public final int f37620d;

    /* JADX INFO: renamed from: e */
    public final int f37621e;

    public C6637g(String str, C2416m c2416m, C2416m c2416m2, int i10, int i11) {
        C10129a.m18990b(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f37617a = str;
        c2416m.getClass();
        this.f37618b = c2416m;
        c2416m2.getClass();
        this.f37619c = c2416m2;
        this.f37620d = i10;
        this.f37621e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6637g.class != obj.getClass()) {
            return false;
        }
        C6637g c6637g = (C6637g) obj;
        return this.f37620d == c6637g.f37620d && this.f37621e == c6637g.f37621e && this.f37617a.equals(c6637g.f37617a) && this.f37618b.equals(c6637g.f37618b) && this.f37619c.equals(c6637g.f37619c);
    }

    public final int hashCode() {
        return this.f37619c.hashCode() + ((this.f37618b.hashCode() + C0166e.m758d(this.f37617a, (((this.f37620d + 527) * 31) + this.f37621e) * 31, 31)) * 31);
    }
}
