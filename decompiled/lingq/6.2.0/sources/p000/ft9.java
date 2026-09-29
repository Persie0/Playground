package p000;

/* JADX INFO: loaded from: classes.dex */
final class ft9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final zi3 f39632b;

    public ft9(zi3 zi3Var) {
        this.f39632b = zi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft9) {
            return this.f39632b == ((ft9) obj).f39632b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new ht9(this.f39632b);
    }

    public final int hashCode() {
        return this.f39632b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "TextContextMenuGestures";
        y64Var.f69367c.m25511b(this.f39632b, "onPreShowContextMenu");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((ht9) d16Var).f42932L = this.f39632b;
    }
}
