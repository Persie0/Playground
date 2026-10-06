package p000;

/* JADX INFO: renamed from: zc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1168zc extends AbstractC1174zi {
    public C1168zc(C1152yn c1152yn) {
        super(c1152yn);
        c1152yn.f48234h.mo19728d();
        c1152yn.f48235i.mo19728d();
        this.f48345g = ((C1155yq) c1152yn).f48276as;
    }

    /* JADX INFO: renamed from: g */
    private final void m19771g(C1164yz c1164yz) {
        this.f48347i.f48314j.add(c1164yz);
        c1164yz.f48315k.add(this.f48347i);
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: b */
    public final void mo19726b() {
        C1152yn c1152yn = this.f48342d;
        C1155yq c1155yq = (C1155yq) c1152yn;
        int i = c1155yq.f48278b;
        int i2 = c1155yq.f48279c;
        float f = c1155yq.f48275a;
        if (c1155yq.f48276as == 1) {
            if (i != -1) {
                this.f48347i.f48315k.add(c1152yn.f48206V.f48234h.f48347i);
                this.f48342d.f48206V.f48234h.f48347i.f48314j.add(this.f48347i);
                this.f48347i.f48309e = i;
            } else if (i2 != -1) {
                this.f48347i.f48315k.add(c1152yn.f48206V.f48234h.f48348j);
                this.f48342d.f48206V.f48234h.f48348j.f48314j.add(this.f48347i);
                this.f48347i.f48309e = -i2;
            } else {
                C1164yz c1164yz = this.f48347i;
                c1164yz.f48306b = true;
                c1164yz.f48315k.add(c1152yn.f48206V.f48234h.f48348j);
                this.f48342d.f48206V.f48234h.f48348j.f48314j.add(this.f48347i);
            }
            m19771g(this.f48342d.f48234h.f48347i);
            m19771g(this.f48342d.f48234h.f48348j);
            return;
        }
        if (i != -1) {
            this.f48347i.f48315k.add(c1152yn.f48206V.f48235i.f48347i);
            this.f48342d.f48206V.f48235i.f48347i.f48314j.add(this.f48347i);
            this.f48347i.f48309e = i;
        } else if (i2 != -1) {
            this.f48347i.f48315k.add(c1152yn.f48206V.f48235i.f48348j);
            this.f48342d.f48206V.f48235i.f48348j.f48314j.add(this.f48347i);
            this.f48347i.f48309e = -i2;
        } else {
            C1164yz c1164yz2 = this.f48347i;
            c1164yz2.f48306b = true;
            c1164yz2.f48315k.add(c1152yn.f48206V.f48235i.f48348j);
            this.f48342d.f48206V.f48235i.f48348j.f48314j.add(this.f48347i);
        }
        m19771g(this.f48342d.f48235i.f48347i);
        m19771g(this.f48342d.f48235i.f48348j);
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: c */
    public final void mo19727c() {
        C1152yn c1152yn = this.f48342d;
        if (((C1155yq) c1152yn).f48276as == 1) {
            c1152yn.f48212aa = this.f48347i.f48310f;
        } else {
            c1152yn.f48213ab = this.f48347i.f48310f;
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: d */
    public final void mo19728d() {
        this.f48347i.m19739b();
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: e */
    public final boolean mo19729e() {
        return false;
    }

    @Override // p000.AbstractC1174zi, p000.InterfaceC1162yx
    /* JADX INFO: renamed from: f */
    public final void mo19730f() {
        C1164yz c1164yz = this.f48347i;
        if (c1164yz.f48307c && !c1164yz.f48313i) {
            this.f48347i.mo19740c((int) ((((C1164yz) c1164yz.f48315k.get(0)).f48310f * ((C1155yq) this.f48342d).f48275a) + 0.5f));
        }
    }
}
