package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pra extends qra {

    /* JADX INFO: renamed from: a */
    public final int f56732a;

    /* JADX INFO: renamed from: b */
    public final int f56733b;

    public pra(int i, int i2) {
        this.f56732a = i;
        this.f56733b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pra)) {
            return false;
        }
        pra praVar = (pra) obj;
        return this.f56732a == praVar.f56732a && this.f56733b == praVar.f56733b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56733b) + (Integer.hashCode(this.f56732a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f56732a, this.f56733b, "VisibleParagraphsChanged(firstVisible=", ", lastVisible=", ")");
    }
}
