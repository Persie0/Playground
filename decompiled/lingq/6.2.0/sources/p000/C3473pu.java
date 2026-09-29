package p000;

/* JADX INFO: renamed from: pu */
/* JADX INFO: loaded from: classes3.dex */
public final class C3473pu {

    /* JADX INFO: renamed from: a */
    public final boolean f56790a;

    /* JADX INFO: renamed from: b */
    public final boolean f56791b;

    /* JADX INFO: renamed from: c */
    public final boolean f56792c;

    public C3473pu(boolean z, boolean z2, boolean z3) {
        this.f56790a = z;
        this.f56791b = z2;
        this.f56792c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3473pu)) {
            return false;
        }
        C3473pu c3473pu = (C3473pu) obj;
        return this.f56790a == c3473pu.f56790a && this.f56791b == c3473pu.f56791b && this.f56792c == c3473pu.f56792c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56792c) + g9a.m12428e(Boolean.hashCode(this.f56790a) * 31, 31, this.f56791b);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(hn1.m13357g("ArchiveState(showConfirmation=", ", showError=", ", canArchive=", this.f56790a, this.f56791b), this.f56792c, ")");
    }
}
