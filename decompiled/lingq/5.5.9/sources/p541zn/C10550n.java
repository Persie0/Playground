package p541zn;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import mn.C7645b;
import p248ln.C7404e;

/* JADX INFO: renamed from: zn.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C10550n<T> {

    /* JADX INFO: renamed from: a */
    public final T f52603a;

    /* JADX INFO: renamed from: b */
    public final T f52604b;

    /* JADX INFO: renamed from: c */
    public final String f52605c;

    /* JADX INFO: renamed from: d */
    public final C7645b f52606d;

    /* JADX WARN: Multi-variable type inference failed */
    public C10550n(C7404e c7404e, C7404e c7404e2, String str, C7645b c7645b) {
        C5207g.m11111f(str, "filePath");
        C5207g.m11111f(c7645b, "classId");
        this.f52603a = c7404e;
        this.f52604b = c7404e2;
        this.f52605c = str;
        this.f52606d = c7645b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10550n)) {
            return false;
        }
        C10550n c10550n = (C10550n) obj;
        if (C5207g.m11106a(this.f52603a, c10550n.f52603a) && C5207g.m11106a(this.f52604b, c10550n.f52604b) && C5207g.m11106a(this.f52605c, c10550n.f52605c) && C5207g.m11106a(this.f52606d, c10550n.f52606d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        T t10 = this.f52603a;
        int iHashCode2 = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f52604b;
        if (t11 != null) {
            iHashCode = t11.hashCode();
        }
        return this.f52606d.hashCode() + C0166e.m758d(this.f52605c, (iHashCode2 + iHashCode) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f52603a + ", expectedVersion=" + this.f52604b + ", filePath=" + this.f52605c + ", classId=" + this.f52606d + ')';
    }
}
