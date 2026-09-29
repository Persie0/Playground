package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jb8 extends nb8 implements eg8 {

    /* JADX INFO: renamed from: a */
    public final v0b f45381a;

    /* JADX INFO: renamed from: b */
    public final String f45382b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f45383c;

    public jb8(v0b v0bVar, String str, ArrayList arrayList) {
        this.f45381a = v0bVar;
        this.f45382b = str;
        this.f45383c = arrayList;
    }

    @Override // p000.eg8
    /* JADX INFO: renamed from: a */
    public final v0b mo10270a() {
        return this.f45381a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb8)) {
            return false;
        }
        jb8 jb8Var = (jb8) obj;
        return this.f45381a.equals(jb8Var.f45381a) && this.f45382b.equals(jb8Var.f45382b) && this.f45383c.equals(jb8Var.f45383c);
    }

    public final int hashCode() {
        return this.f45383c.hashCode() + ux5.m22980c(this.f45381a.hashCode() * 31, this.f45382b, 31);
    }

    public final String toString() {
        return "MultiChoiceActivity(cardVocabulary=" + this.f45381a + ", correctAnswer=" + this.f45382b + ", meanings=" + this.f45383c + ")";
    }
}
