package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: zd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1169zd extends AbstractC1174zi {
    public C1169zd(C1152yn c1152yn) {
        super(c1152yn);
    }

    /* JADX INFO: renamed from: g */
    private final void m19772g(C1164yz c1164yz) {
        this.f48347i.f48314j.add(c1164yz);
        c1164yz.f48315k.add(this.f48347i);
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: b */
    public final void mo19726b() {
        C1152yn c1152yn = this.f48342d;
        if (c1152yn instanceof C1148yj) {
            C1164yz c1164yz = this.f48347i;
            c1164yz.f48306b = true;
            C1148yj c1148yj = (C1148yj) c1152yn;
            int i = c1148yj.f48142a;
            boolean z = c1148yj.f48143b;
            int i2 = 0;
            switch (i) {
                case 0:
                    c1164yz.f48316l = 4;
                    while (i2 < c1148yj.f48282at) {
                        C1152yn c1152yn2 = c1148yj.f48281as[i2];
                        if (z || c1152yn2.f48220ai != 8) {
                            C1164yz c1164yz2 = c1152yn2.f48234h.f48347i;
                            c1164yz2.f48314j.add(this.f48347i);
                            this.f48347i.f48315k.add(c1164yz2);
                        }
                        i2++;
                    }
                    m19772g(this.f48342d.f48234h.f48347i);
                    m19772g(this.f48342d.f48234h.f48348j);
                    break;
                case 1:
                    c1164yz.f48316l = 5;
                    while (i2 < c1148yj.f48282at) {
                        C1152yn c1152yn3 = c1148yj.f48281as[i2];
                        if (z || c1152yn3.f48220ai != 8) {
                            C1164yz c1164yz3 = c1152yn3.f48234h.f48348j;
                            c1164yz3.f48314j.add(this.f48347i);
                            this.f48347i.f48315k.add(c1164yz3);
                        }
                        i2++;
                    }
                    m19772g(this.f48342d.f48234h.f48347i);
                    m19772g(this.f48342d.f48234h.f48348j);
                    break;
                case 2:
                    c1164yz.f48316l = 6;
                    while (i2 < c1148yj.f48282at) {
                        C1152yn c1152yn4 = c1148yj.f48281as[i2];
                        if (z || c1152yn4.f48220ai != 8) {
                            C1164yz c1164yz4 = c1152yn4.f48235i.f48347i;
                            c1164yz4.f48314j.add(this.f48347i);
                            this.f48347i.f48315k.add(c1164yz4);
                        }
                        i2++;
                    }
                    m19772g(this.f48342d.f48235i.f48347i);
                    m19772g(this.f48342d.f48235i.f48348j);
                    break;
                case 3:
                    c1164yz.f48316l = 7;
                    while (i2 < c1148yj.f48282at) {
                        C1152yn c1152yn5 = c1148yj.f48281as[i2];
                        if (z || c1152yn5.f48220ai != 8) {
                            C1164yz c1164yz5 = c1152yn5.f48235i.f48348j;
                            c1164yz5.f48314j.add(this.f48347i);
                            this.f48347i.f48315k.add(c1164yz5);
                        }
                        i2++;
                    }
                    m19772g(this.f48342d.f48235i.f48347i);
                    m19772g(this.f48342d.f48235i.f48348j);
                    break;
            }
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: c */
    public final void mo19727c() {
        C1152yn c1152yn = this.f48342d;
        if (c1152yn instanceof C1148yj) {
            int i = ((C1148yj) c1152yn).f48142a;
            if (i == 0 || i == 1) {
                c1152yn.f48212aa = this.f48347i.f48310f;
            } else {
                c1152yn.f48213ab = this.f48347i.f48310f;
            }
        }
    }

    @Override // p000.AbstractC1174zi
    /* JADX INFO: renamed from: d */
    public final void mo19728d() {
        this.f48343e = null;
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
        C1148yj c1148yj = (C1148yj) this.f48342d;
        int i = c1148yj.f48142a;
        Iterator it = this.f48347i.f48315k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1164yz) it.next()).f48310f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f48347i.mo19740c(i3 + c1148yj.f48144c);
        } else {
            this.f48347i.mo19740c(i2 + c1148yj.f48144c);
        }
    }
}
