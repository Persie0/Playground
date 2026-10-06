package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ndm {

    /* JADX INFO: renamed from: a */
    public final ner f42052a;

    /* JADX INFO: renamed from: b */
    public final String f42053b;

    public ndm(ner nerVar, String str) {
        nea.m17397k(nerVar, "parser");
        this.f42052a = nerVar;
        nea.m17397k(str, "message");
        this.f42053b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ndm) {
            ndm ndmVar = (ndm) obj;
            if (this.f42052a.equals(ndmVar.f42052a) && this.f42053b.equals(ndmVar.f42053b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42052a.hashCode() ^ this.f42053b.hashCode();
    }
}
