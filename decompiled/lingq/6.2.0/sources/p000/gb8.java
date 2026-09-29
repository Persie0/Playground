package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gb8 extends nb8 implements eg8 {

    /* JADX INFO: renamed from: a */
    public final v0b f40502a;

    public gb8(v0b v0bVar) {
        v0bVar.getClass();
        this.f40502a = v0bVar;
    }

    @Override // p000.eg8
    /* JADX INFO: renamed from: a */
    public final v0b mo10270a() {
        return this.f40502a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb8) && fa4.m11650l(this.f40502a, ((gb8) obj).f40502a);
    }

    public final int hashCode() {
        return this.f40502a.hashCode();
    }

    public final String toString() {
        return "FlashcardActivity(cardVocabulary=" + this.f40502a + ")";
    }
}
