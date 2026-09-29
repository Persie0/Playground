package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v08 {

    /* JADX INFO: renamed from: a */
    public final Map f64662a;

    /* JADX INFO: renamed from: b */
    public final Map f64663b;

    /* JADX INFO: renamed from: c */
    public final int f64664c;

    /* JADX INFO: renamed from: d */
    public final int f64665d;

    /* JADX INFO: renamed from: e */
    public final int f64666e;

    public v08(Map map, Map map2, int i, int i2, int i3) {
        map.getClass();
        map2.getClass();
        this.f64662a = map;
        this.f64663b = map2;
        this.f64664c = i;
        this.f64665d = i2;
        this.f64666e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v08)) {
            return false;
        }
        v08 v08Var = (v08) obj;
        return fa4.m11650l(this.f64662a, v08Var.f64662a) && fa4.m11650l(this.f64663b, v08Var.f64663b) && this.f64664c == v08Var.f64664c && this.f64665d == v08Var.f64665d && this.f64666e == v08Var.f64666e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64666e) + wq1.m24106b(this.f64665d, wq1.m24106b(this.f64664c, e65.m10869a(this.f64662a.hashCode() * 31, 31, this.f64663b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderVocabularyState(highlightsByPage=");
        sb.append(this.f64662a);
        sb.append(", sentenceVocabularyByPage=");
        sb.append(this.f64663b);
        sb.append(", lingqCount=");
        hn1.m13360j(this.f64664c, this.f64665d, ", newWordsCount=", ", cardsDueCount=", sb);
        return wq1.m24123s(sb, this.f64666e, ")");
    }
}
