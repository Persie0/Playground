package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su9 implements k73, hj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ui3 f61447a;

    public su9(ui3 ui3Var) {
        this.f61447a = ui3Var;
    }

    @Override // p000.k73
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float mo169a() {
        return ((Number) this.f61447a.mo0a()).floatValue();
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: b */
    public final xi3 mo13293b() {
        return this.f61447a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k73) || !(obj instanceof hj3)) {
            return false;
        }
        return fa4.m11650l(this.f61447a, ((hj3) obj).mo13293b());
    }

    public final int hashCode() {
        return this.f61447a.hashCode();
    }
}
