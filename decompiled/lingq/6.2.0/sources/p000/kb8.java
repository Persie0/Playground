package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kb8 extends nb8 implements eg8 {

    /* JADX INFO: renamed from: a */
    public final v0b f46978a;

    /* JADX INFO: renamed from: b */
    public final String f46979b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f46980c;

    public kb8(v0b v0bVar, String str, ArrayList arrayList) {
        str.getClass();
        this.f46978a = v0bVar;
        this.f46979b = str;
        this.f46980c = arrayList;
    }

    @Override // p000.eg8
    /* JADX INFO: renamed from: a */
    public final v0b mo10270a() {
        return this.f46978a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb8)) {
            return false;
        }
        kb8 kb8Var = (kb8) obj;
        return this.f46978a.equals(kb8Var.f46978a) && fa4.m11650l(this.f46979b, kb8Var.f46979b) && this.f46980c.equals(kb8Var.f46980c);
    }

    public final int hashCode() {
        return this.f46980c.hashCode() + ux5.m22980c(this.f46978a.hashCode() * 31, this.f46979b, 31);
    }

    public final String toString() {
        return "MultiChoiceReverseActivity(cardVocabulary=" + this.f46978a + ", correctAnswer=" + this.f46979b + ", cards=" + this.f46980c + ")";
    }
}
