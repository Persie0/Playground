package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqi {

    /* JADX INFO: renamed from: a */
    public final String f2135a;

    /* JADX INFO: renamed from: b */
    public final Map f2136b;

    /* JADX INFO: renamed from: c */
    public final Set f2137c;

    /* JADX INFO: renamed from: d */
    public final Set f2138d;

    public aqi(String str, Map map, Set set, Set set2) {
        this.f2135a = str;
        this.f2136b = map;
        this.f2137c = set;
        this.f2138d = set2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqi)) {
            return false;
        }
        aqi aqiVar = (aqi) obj;
        if (!ooc.m18737c(this.f2135a, aqiVar.f2135a) || !ooc.m18737c(this.f2136b, aqiVar.f2136b) || !ooc.m18737c(this.f2137c, aqiVar.f2137c)) {
            return false;
        }
        Set set2 = this.f2138d;
        if (set2 == null || (set = aqiVar.f2138d) == null) {
            return true;
        }
        return ooc.m18737c(set2, set);
    }

    public final int hashCode() {
        return (((this.f2135a.hashCode() * 31) + this.f2136b.hashCode()) * 31) + this.f2137c.hashCode();
    }

    public final String toString() {
        return "TableInfo{name='" + this.f2135a + "', columns=" + this.f2136b + ", foreignKeys=" + this.f2137c + ", indices=" + this.f2138d + '}';
    }
}
