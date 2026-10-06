package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqd {

    /* JADX INFO: renamed from: a */
    public static final String[] f2111a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX INFO: renamed from: b */
    public final String f2112b = "ResourceFts";

    /* JADX INFO: renamed from: c */
    public final Set f2113c;

    /* JADX INFO: renamed from: d */
    public final Set f2114d;

    public aqd(Set set, Set set2) {
        this.f2113c = set;
        this.f2114d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqd)) {
            return false;
        }
        aqd aqdVar = (aqd) obj;
        if (ooc.m18737c(this.f2112b, aqdVar.f2112b) && ooc.m18737c(this.f2113c, aqdVar.f2113c)) {
            return ooc.m18737c(this.f2114d, aqdVar.f2114d);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2112b.hashCode() * 31) + this.f2113c.hashCode()) * 31) + this.f2114d.hashCode();
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.f2112b + "', columns=" + this.f2113c + ", options=" + this.f2114d + "'}";
    }
}
