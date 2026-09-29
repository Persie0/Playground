package p000;

import java.util.Map;

/* JADX INFO: renamed from: s6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3562s6 {

    /* JADX INFO: renamed from: a */
    public final Map f60395a;

    /* JADX INFO: renamed from: b */
    public final Map f60396b;

    /* JADX INFO: renamed from: c */
    public final Map f60397c;

    /* JADX INFO: renamed from: d */
    public final Map f60398d;

    public C3562s6(Map map, Map map2, Map map3, Map map4) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        this.f60395a = map;
        this.f60396b = map2;
        this.f60397c = map3;
        this.f60398d = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3562s6)) {
            return false;
        }
        C3562s6 c3562s6 = (C3562s6) obj;
        return fa4.m11650l(this.f60395a, c3562s6.f60395a) && fa4.m11650l(this.f60396b, c3562s6.f60396b) && fa4.m11650l(this.f60397c, c3562s6.f60397c) && fa4.m11650l(this.f60398d, c3562s6.f60398d);
    }

    public final int hashCode() {
        return this.f60398d.hashCode() + e65.m10869a(e65.m10869a(this.f60395a.hashCode() * 31, 31, this.f60396b), 31, this.f60397c);
    }

    public final String toString() {
        return "ActivityDetailData(autoplayTTS=" + this.f60395a + ", transliterationScripts=" + this.f60396b + ", shuffleCards=" + this.f60397c + ", backStatus=" + this.f60398d + ")";
    }
}
