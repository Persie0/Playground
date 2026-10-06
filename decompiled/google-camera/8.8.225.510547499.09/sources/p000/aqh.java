package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqh {

    /* JADX INFO: renamed from: a */
    public final String f2131a;

    /* JADX INFO: renamed from: b */
    public final boolean f2132b;

    /* JADX INFO: renamed from: c */
    public final List f2133c;

    /* JADX INFO: renamed from: d */
    public List f2134d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public aqh(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f2131a = str;
        this.f2132b = z;
        this.f2133c = list;
        this.f2134d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f2134d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqh)) {
            return false;
        }
        aqh aqhVar = (aqh) obj;
        if (this.f2132b == aqhVar.f2132b && ooc.m18737c(this.f2133c, aqhVar.f2133c) && ooc.m18737c(this.f2134d, aqhVar.f2134d)) {
            return ook.m18766D(this.f2131a, "index_") ? ook.m18766D(aqhVar.f2131a, "index_") : ooc.m18737c(this.f2131a, aqhVar.f2131a);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((ook.m18766D(this.f2131a, "index_") ? -1184239155 : this.f2131a.hashCode()) * 31) + (this.f2132b ? 1 : 0)) * 31) + this.f2133c.hashCode()) * 31) + this.f2134d.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.f2131a + "', unique=" + this.f2132b + ", columns=" + this.f2133c + ", orders=" + this.f2134d + "'}";
    }
}
