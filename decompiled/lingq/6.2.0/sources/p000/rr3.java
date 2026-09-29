package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rr3 implements iy2, jy2, yr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59737a;

    /* JADX INFO: renamed from: b */
    public long f59738b;

    /* JADX INFO: renamed from: c */
    public final Object f59739c;

    public rr3(iy2 iy2Var, long j) {
        this.f59737a = 2;
        this.f59739c = iy2Var;
        bna.m3969q(iy2Var.getPosition() >= j);
        this.f59738b = j;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: a */
    public boolean mo13074a(byte[] bArr, int i, int i2, boolean z) {
        return ((iy2) this.f59739c).mo13074a(bArr, 0, i2, z);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: c */
    public boolean mo13075c(int i, boolean z) {
        return ((iy2) this.f59739c).mo13075c(i, true);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: d */
    public boolean mo13076d(byte[] bArr, int i, int i2, boolean z) {
        return ((iy2) this.f59739c).mo13076d(bArr, i, i2, z);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: e */
    public long mo13077e() {
        return ((iy2) this.f59739c).mo13077e() - this.f59738b;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: f */
    public void mo13078f(int i) {
        ((iy2) this.f59739c).mo13078f(i);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: g */
    public int mo13079g(byte[] bArr, int i, int i2) {
        return ((iy2) this.f59739c).mo13079g(bArr, i, i2);
    }

    @Override // p000.iy2
    public long getLength() {
        return ((iy2) this.f59739c).getLength() - this.f59738b;
    }

    @Override // p000.iy2
    public long getPosition() {
        return ((iy2) this.f59739c).getPosition() - this.f59738b;
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: i */
    public void mo13080i() {
        ((iy2) this.f59739c).mo13080i();
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: j */
    public void mo2551j() {
        ((jy2) this.f59739c).mo2551j();
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: k */
    public void mo13082k(int i) {
        ((iy2) this.f59739c).mo13082k(i);
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        switch (this.f59737a) {
            case 4:
                ekd ekdVar = (ekd) this.f59739c;
                ekdVar.f37402b.set(this.f59738b);
                break;
            default:
                ekd ekdVar2 = (ekd) this.f59739c;
                ekdVar2.f37402b.set(this.f59738b);
                break;
        }
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: n */
    public n8a mo2555n(int i, int i2) {
        return ((jy2) this.f59739c).mo2555n(i, i2);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: o */
    public void mo13085o(byte[] bArr, int i, int i2) {
        ((iy2) this.f59739c).mo13085o(bArr, i, i2);
    }

    @Override // p000.iy2
    /* JADX INFO: renamed from: p */
    public int mo13086p() {
        return ((iy2) this.f59739c).mo13086p();
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: q */
    public void mo2558q(st8 st8Var) {
        ((jy2) this.f59739c).mo2558q(new xg9(this, st8Var, st8Var));
    }

    /* JADX INFO: renamed from: r */
    public qr3 m20758r() {
        or3 or3Var = new or3(0);
        while (true) {
            String strM20759s = m20759s();
            if (strM20759s.length() == 0) {
                return or3Var.m18309w();
            }
            or3Var.m18306l(strM20759s);
        }
    }

    @Override // p000.h02
    public int read(byte[] bArr, int i, int i2) {
        return ((iy2) this.f59739c).read(bArr, i, i2);
    }

    @Override // p000.iy2
    public void readFully(byte[] bArr, int i, int i2) {
        ((iy2) this.f59739c).readFully(bArr, i, i2);
    }

    /* JADX INFO: renamed from: s */
    public String m20759s() {
        String strMo457D = ((hj0) this.f59739c).mo457D(this.f59738b);
        this.f59738b -= (long) strMo457D.length();
        return strMo457D;
    }

    public /* synthetic */ rr3(Object obj, long j, int i) {
        this.f59737a = i;
        this.f59739c = obj;
        this.f59738b = j;
    }

    public rr3(e18 e18Var) {
        this.f59737a = 0;
        e18Var.getClass();
        this.f59739c = e18Var;
        this.f59738b = 262144L;
    }

    public /* synthetic */ rr3(long j, Object obj, int i) {
        this.f59737a = i;
        this.f59738b = j;
        this.f59739c = obj;
    }
}
