package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class te2 extends ue2 {

    /* JADX INFO: renamed from: a */
    public final List f62188a;

    /* JADX INFO: renamed from: b */
    public final String f62189b;

    public te2(List list, String str) {
        list.getClass();
        str.getClass();
        this.f62188a = list;
        this.f62189b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te2)) {
            return false;
        }
        te2 te2Var = (te2) obj;
        return fa4.m11650l(this.f62188a, te2Var.f62188a) && fa4.m11650l(this.f62189b, te2Var.f62189b);
    }

    public final int hashCode() {
        return this.f62189b.hashCode() + (this.f62188a.hashCode() * 31);
    }

    public final String toString() {
        return "Filter(languages=" + this.f62188a + ", selectedLocale=" + this.f62189b + ")";
    }
}
