package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqf {

    /* JADX INFO: renamed from: a */
    public final String f2122a;

    /* JADX INFO: renamed from: b */
    public final String f2123b;

    /* JADX INFO: renamed from: c */
    public final String f2124c;

    /* JADX INFO: renamed from: d */
    public final List f2125d;

    /* JADX INFO: renamed from: e */
    public final List f2126e;

    public aqf(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f2122a = str;
        this.f2123b = str2;
        this.f2124c = str3;
        this.f2125d = list;
        this.f2126e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqf)) {
            return false;
        }
        aqf aqfVar = (aqf) obj;
        if (ooc.m18737c(this.f2122a, aqfVar.f2122a) && ooc.m18737c(this.f2123b, aqfVar.f2123b) && ooc.m18737c(this.f2124c, aqfVar.f2124c) && ooc.m18737c(this.f2125d, aqfVar.f2125d)) {
            return ooc.m18737c(this.f2126e, aqfVar.f2126e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f2122a.hashCode() * 31) + this.f2123b.hashCode()) * 31) + this.f2124c.hashCode()) * 31) + this.f2125d.hashCode()) * 31) + this.f2126e.hashCode();
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f2122a + "', onDelete='" + this.f2123b + " +', onUpdate='" + this.f2124c + "', columnNames=" + this.f2125d + ", referenceColumnNames=" + this.f2126e + '}';
    }
}
