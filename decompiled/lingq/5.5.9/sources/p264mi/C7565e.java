package p264mi;

import dm.C5207g;

/* JADX INFO: renamed from: mi.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7565e {

    /* JADX INFO: renamed from: a */
    public final int f41689a;

    /* JADX INFO: renamed from: b */
    public final String f41690b;

    public C7565e() {
        this(null, 0);
    }

    public C7565e(String str, int i10) {
        this.f41689a = i10;
        this.f41690b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7565e)) {
            return false;
        }
        C7565e c7565e = (C7565e) obj;
        return this.f41689a == c7565e.f41689a && C5207g.m11106a(this.f41690b, c7565e.f41690b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f41689a) * 31;
        String str = this.f41690b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VocabularyFilterLesson(id=" + this.f41689a + ", title=" + this.f41690b + ")";
    }
}
