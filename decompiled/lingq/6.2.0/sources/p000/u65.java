package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u65 {

    /* JADX INFO: renamed from: a */
    public final String f63489a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f63490b;

    /* JADX INFO: renamed from: c */
    public final boolean f63491c;

    /* JADX INFO: renamed from: d */
    public final boolean f63492d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f63493e;

    public u65(String str, ArrayList arrayList, boolean z, boolean z2, LinkedHashMap linkedHashMap) {
        this.f63489a = str;
        this.f63490b = arrayList;
        this.f63491c = z;
        this.f63492d = z2;
        this.f63493e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u65)) {
            return false;
        }
        u65 u65Var = (u65) obj;
        return this.f63489a.equals(u65Var.f63489a) && this.f63490b.equals(u65Var.f63490b) && this.f63491c == u65Var.f63491c && this.f63492d == u65Var.f63492d && this.f63493e.equals(u65Var.f63493e);
    }

    public final int hashCode() {
        return this.f63493e.hashCode() + g9a.m12428e(g9a.m12428e((this.f63490b.hashCode() + (this.f63489a.hashCode() * 31)) * 31, 31, this.f63491c), 31, this.f63492d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonTextData(fullText=");
        sb.append(this.f63489a);
        sb.append(", fullTextTokens=");
        sb.append(this.f63490b);
        sb.append(", isSentenceMode=");
        wq1.m24101A(sb, this.f63491c, ", showSpaces=", this.f63492d, ", imageUrlsBySentenceIndex=");
        sb.append(this.f63493e);
        sb.append(")");
        return sb.toString();
    }
}
