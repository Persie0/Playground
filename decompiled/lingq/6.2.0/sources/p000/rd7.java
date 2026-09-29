package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rd7 implements td7 {

    /* JADX INFO: renamed from: a */
    public final ud7 f59116a;

    /* JADX INFO: renamed from: b */
    public final List f59117b;

    public rd7(ud7 ud7Var, List list) {
        this.f59116a = ud7Var;
        this.f59117b = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m20588a() {
        return this.f59117b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd7)) {
            return false;
        }
        rd7 rd7Var = (rd7) obj;
        return this.f59116a.equals(rd7Var.f59116a) && this.f59117b.equals(rd7Var.f59117b);
    }

    public final int hashCode() {
        return this.f59117b.hashCode() + (this.f59116a.hashCode() * 31);
    }

    public final String toString() {
        return "Course(course=" + this.f59116a + ", lessons=" + this.f59117b + ")";
    }
}
