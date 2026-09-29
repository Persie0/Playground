package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class upa {

    /* JADX INFO: renamed from: a */
    public final List f64195a;

    /* JADX INFO: renamed from: b */
    public final List f64196b;

    /* JADX INFO: renamed from: c */
    public final List f64197c;

    public upa(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f64195a = list;
        this.f64196b = list2;
        this.f64197c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upa)) {
            return false;
        }
        upa upaVar = (upa) obj;
        return fa4.m11650l(this.f64195a, upaVar.f64195a) && fa4.m11650l(this.f64196b, upaVar.f64196b) && fa4.m11650l(this.f64197c, upaVar.f64197c);
    }

    public final int hashCode() {
        return this.f64197c.hashCode() + ux5.m22979b(this.f64195a.hashCode() * 31, 31, this.f64196b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentData(sentenceParagraphs=");
        sb.append(this.f64195a);
        sb.append(", sentences=");
        sb.append(this.f64196b);
        sb.append(", translationSentences=");
        return hn1.m13356f(sb, this.f64197c, ")");
    }
}
