package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class eb8 extends nb8 implements eg8 {

    /* JADX INFO: renamed from: a */
    public final v0b f36981a;

    /* JADX INFO: renamed from: b */
    public final String f36982b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f36983c;

    public eb8(v0b v0bVar, String str, ArrayList arrayList) {
        str.getClass();
        this.f36981a = v0bVar;
        this.f36982b = str;
        this.f36983c = arrayList;
    }

    @Override // p000.eg8
    /* JADX INFO: renamed from: a */
    public final v0b mo10270a() {
        return this.f36981a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb8)) {
            return false;
        }
        eb8 eb8Var = (eb8) obj;
        return this.f36981a.equals(eb8Var.f36981a) && fa4.m11650l(this.f36982b, eb8Var.f36982b) && this.f36983c.equals(eb8Var.f36983c);
    }

    public final int hashCode() {
        return this.f36983c.hashCode() + ux5.m22980c(this.f36981a.hashCode() * 31, this.f36982b, 31);
    }

    public final String toString() {
        return "DictationActivity(cardVocabulary=" + this.f36981a + ", correctAnswer=" + this.f36982b + ", cards=" + this.f36983c + ")";
    }
}
