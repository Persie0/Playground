package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hb8 extends nb8 implements eg8 {

    /* JADX INFO: renamed from: a */
    public final v0b f42137a;

    public hb8(v0b v0bVar) {
        v0bVar.getClass();
        this.f42137a = v0bVar;
    }

    @Override // p000.eg8
    /* JADX INFO: renamed from: a */
    public final v0b mo10270a() {
        return this.f42137a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb8) && fa4.m11650l(this.f42137a, ((hb8) obj).f42137a);
    }

    public final int hashCode() {
        return this.f42137a.hashCode();
    }

    public final String toString() {
        return "FlashcardReverseActivity(cardVocabulary=" + this.f42137a + ")";
    }
}
