package p367rh;

import android.support.v4.media.session.C0166e;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8793g {

    /* JADX INFO: renamed from: a */
    public final int f46640a;

    /* JADX INFO: renamed from: b */
    public final int f46641b;

    /* JADX INFO: renamed from: c */
    public final int f46642c;

    public C8793g(int i10, int i11, int i12) {
        this.f46640a = i10;
        this.f46641b = i11;
        this.f46642c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8793g)) {
            return false;
        }
        C8793g c8793g = (C8793g) obj;
        return this.f46640a == c8793g.f46640a && this.f46641b == c8793g.f46641b && this.f46642c == c8793g.f46642c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46642c) + C0009a.m16d(this.f46641b, Integer.hashCode(this.f46640a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoursesAndLessonsJoin(pk=");
        sb2.append(this.f46640a);
        sb2.append(", contentId=");
        sb2.append(this.f46641b);
        sb2.append(", courseOrder=");
        return C0166e.m768o(sb2, this.f46642c, ")");
    }
}
