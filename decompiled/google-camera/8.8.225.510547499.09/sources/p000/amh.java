package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amh extends alr {

    /* JADX INFO: renamed from: a */
    public static final alt f691a = new amg(0);

    /* JADX INFO: renamed from: b */
    public final C1118xg f692b = new C1118xg();

    /* JADX INFO: renamed from: c */
    public boolean f693c = false;

    /* JADX INFO: renamed from: a */
    public final ame m943a(int i) {
        return (ame) C1119xh.m19566a(this.f692b, i);
    }

    /* JADX INFO: renamed from: b */
    final void m944b() {
        this.f693c = false;
    }

    @Override // p000.alr
    /* JADX INFO: renamed from: d */
    public final void mo923d() {
        int iM19563b = this.f692b.m19563b();
        for (int i = 0; i < iM19563b; i++) {
            ((ame) this.f692b.m19564c(i)).m941j();
        }
        C1118xg c1118xg = this.f692b;
        int i2 = c1118xg.f48008d;
        Object[] objArr = c1118xg.f48007c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c1118xg.f48008d = 0;
        c1118xg.f48005a = false;
    }
}
