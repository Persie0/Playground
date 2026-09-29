package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vpa {

    /* JADX INFO: renamed from: a */
    public final Map f65769a;

    /* JADX INFO: renamed from: b */
    public final Map f65770b;

    /* JADX INFO: renamed from: c */
    public final Map f65771c;

    public vpa(Map map, Map map2, Map map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.f65769a = map;
        this.f65770b = map2;
        this.f65771c = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpa)) {
            return false;
        }
        vpa vpaVar = (vpa) obj;
        return fa4.m11650l(this.f65769a, vpaVar.f65769a) && fa4.m11650l(this.f65770b, vpaVar.f65770b) && fa4.m11650l(this.f65771c, vpaVar.f65771c);
    }

    public final int hashCode() {
        return this.f65771c.hashCode() + e65.m10869a(this.f65769a.hashCode() * 31, 31, this.f65770b);
    }

    public final String toString() {
        return "VocabularyData(wordsMap=" + this.f65769a + ", cardsMap=" + this.f65770b + ", phrasesMap=" + this.f65771c + ")";
    }
}
