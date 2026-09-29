package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fb8 extends nb8 implements eg8 {

    /* JADX INFO: renamed from: a */
    public final v0b f38797a;

    /* JADX INFO: renamed from: b */
    public final String f38798b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f38799c;

    public fb8(v0b v0bVar, String str, ArrayList arrayList) {
        this.f38797a = v0bVar;
        this.f38798b = str;
        this.f38799c = arrayList;
    }

    @Override // p000.eg8
    /* JADX INFO: renamed from: a */
    public final v0b mo10270a() {
        return this.f38797a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb8)) {
            return false;
        }
        fb8 fb8Var = (fb8) obj;
        return this.f38797a.equals(fb8Var.f38797a) && this.f38798b.equals(fb8Var.f38798b) && this.f38799c.equals(fb8Var.f38799c);
    }

    public final int hashCode() {
        return this.f38799c.hashCode() + ux5.m22980c(this.f38797a.hashCode() * 31, this.f38798b, 31);
    }

    public final String toString() {
        return "DictationReverseActivity(cardVocabulary=" + this.f38797a + ", correctAnswer=" + this.f38798b + ", meanings=" + this.f38799c + ")";
    }
}
