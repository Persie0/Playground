package p000;

import java.util.List;

/* JADX INFO: renamed from: vd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1061vd implements oju {

    /* JADX INFO: renamed from: a */
    private final C1064vg f47808a;

    /* JADX INFO: renamed from: b */
    private final C1062ve f47809b;

    /* JADX INFO: renamed from: c */
    private final int f47810c;

    public C1061vd(C1064vg c1064vg, C1062ve c1062ve, int i) {
        this.f47808a = c1064vg;
        this.f47809b = c1062ve;
        this.f47810c = i;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final Object get() {
        switch (this.f47810c) {
            case 0:
                C1062ve c1062ve = this.f47809b;
                return new C1077vt((C0948qz) c1062ve.f47822l.f3651a, (InterfaceC0953rd) c1062ve.f47812b.get(), (InterfaceC1083vz) this.f47809b.f47817g.get(), (InterfaceC1082vy) this.f47809b.f47817g.get(), (C1097wm) this.f47809b.f47818h.get(), (C1099wo) this.f47809b.f47820j.get(), (InterfaceC0946qx) this.f47809b.f47819i.get(), (C0861nt) this.f47809b.f47813c.get(), (C1093wi) this.f47809b.f47815e.get(), null);
            case 1:
                C1062ve c1062ve2 = this.f47809b;
                Object obj = c1062ve2.f47822l.f3651a;
                C1058va c1058va = (C1058va) c1062ve2.f47811a.get();
                c1058va.getClass();
                return c1058va.m19473a(((C0948qz) obj).f47514a);
            case 2:
                bbo bboVar = (bbo) this.f47808a.f47837k.get();
                C0796li c0796li = (C0796li) this.f47808a.f47840n.get();
                bboVar.getClass();
                c0796li.getClass();
                return bboVar.f2909c;
            case 3:
                drj drjVar = (drj) this.f47808a.f47828b.get();
                C1062ve c1062ve3 = this.f47809b;
                return new C1090wf(drjVar, (C0948qz) c1062ve3.f47822l.f3651a, (C0861nt) c1062ve3.f47813c.get(), (oqs) this.f47809b.f47814d.get(), (List) this.f47809b.f47816f.get(), null, null, null);
            case 4:
                return new C0861nt();
            case 5:
                drj drjVar2 = (drj) this.f47808a.f47828b.get();
                drjVar2.getClass();
                return oqv.m18925f(((oln) drjVar2.f12399e).plus(new oqr("CXCP-Graph")));
            case 6:
                C1062ve c1062ve4 = this.f47809b;
                Object obj2 = c1062ve4.f47822l.f3651a;
                C1093wi c1093wi = (C1093wi) c1062ve4.f47815e.get();
                c1093wi.getClass();
                List listM18669I = omn.m18669I(c1093wi);
                listM18669I.add(c1093wi);
                listM18669I.addAll(((C0948qz) obj2).f47521h);
                return listM18669I;
            case 7:
                return new C1093wi();
            case 8:
                return new C1097wm((InterfaceC0953rd) this.f47809b.f47812b.get(), (C0948qz) this.f47809b.f47822l.f3651a);
            case 9:
                return new C1099wo((C1097wm) this.f47809b.f47818h.get(), (InterfaceC0946qx) this.f47809b.f47819i.get(), (C1058va) this.f47808a.f47839m.get(), null);
            default:
                C1062ve c1062ve5 = this.f47809b;
                Object obj3 = c1062ve5.f47822l.f3651a;
                C1058va c1058va2 = (C1058va) c1062ve5.f47811a.get();
                C0796li c0796li2 = (C0796li) this.f47808a.f47840n.get();
                C1090wf c1090wf = (C1090wf) this.f47809b.f47817g.get();
                C1097wm c1097wm = (C1097wm) this.f47809b.f47818h.get();
                c1058va2.getClass();
                c0796li2.getClass();
                c1090wf.getClass();
                c1097wm.getClass();
                C1071vn c1071vn = (C1071vn) c1058va2.f47803b;
                c1071vn.f47855b = new C1058va((C0948qz) obj3, (InterfaceC1082vy) c1090wf, (InterfaceC0978sb) c1097wm);
                lkm.m15599z(c1071vn.f47855b, C1058va.class);
                InterfaceC0946qx interfaceC0946qx = (InterfaceC0946qx) new ljf((C1064vg) c1071vn.f47854a, (C1058va) c1071vn.f47855b).f38372d.get();
                interfaceC0946qx.getClass();
                return interfaceC0946qx;
        }
    }
}
