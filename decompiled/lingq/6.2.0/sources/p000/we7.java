package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class we7 implements ze7 {

    /* JADX INFO: renamed from: a */
    public final boolean f66724a;

    /* JADX INFO: renamed from: b */
    public final boolean f66725b;

    /* JADX INFO: renamed from: c */
    public final boolean f66726c;

    public we7(boolean z, boolean z2, boolean z3) {
        this.f66724a = z;
        this.f66725b = z2;
        this.f66726c = z3;
    }

    @Override // p000.ze7
    /* JADX INFO: renamed from: a */
    public final boolean mo23857a() {
        return this.f66724a;
    }

    @Override // p000.ze7
    /* JADX INFO: renamed from: b */
    public final boolean mo23858b() {
        return this.f66726c;
    }

    @Override // p000.ze7
    /* JADX INFO: renamed from: c */
    public final boolean mo23859c() {
        return this.f66725b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we7)) {
            return false;
        }
        we7 we7Var = (we7) obj;
        return this.f66724a == we7Var.f66724a && this.f66725b == we7Var.f66725b && this.f66726c == we7Var.f66726c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66726c) + g9a.m12428e(Boolean.hashCode(this.f66724a) * 31, 31, this.f66725b);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(hn1.m13357g("Empty(showArchiveConfirmation=", ", canArchivePlaylist=", ", showArchiveError=", this.f66724a, this.f66725b), this.f66726c, ")");
    }
}
