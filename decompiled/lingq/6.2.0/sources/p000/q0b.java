package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q0b {

    /* JADX INFO: renamed from: a */
    public final String f57109a;

    /* JADX INFO: renamed from: b */
    public final int f57110b;

    public q0b(String str, int i) {
        this.f57109a = str;
        this.f57110b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m19591a() {
        return this.f57110b;
    }

    /* JADX INFO: renamed from: b */
    public final String m19592b() {
        return this.f57109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0b)) {
            return false;
        }
        q0b q0bVar = (q0b) obj;
        return this.f57109a.equals(q0bVar.f57109a) && this.f57110b == q0bVar.f57110b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57110b) + (this.f57109a.hashCode() * 31);
    }

    public final String toString() {
        return "VocabularyOrderEntity(termWithLanguage=" + this.f57109a + ", sortPosition=" + this.f57110b + ")";
    }
}
