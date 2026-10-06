package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gmd implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f25583a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f25584b;

    public /* synthetic */ gmd(glu gluVar, int i) {
        this.f25584b = i;
        this.f25583a = gluVar;
    }

    public /* synthetic */ gmd(gme gmeVar, int i) {
        this.f25584b = i;
        this.f25583a = gmeVar;
    }

    public /* synthetic */ gmd(gvu gvuVar, int i) {
        this.f25584b = i;
        this.f25583a = gvuVar;
    }

    public /* synthetic */ gmd(gwd gwdVar, int i) {
        this.f25584b = i;
        this.f25583a = gwdVar;
    }

    public /* synthetic */ gmd(hbg hbgVar, int i) {
        this.f25584b = i;
        this.f25583a = hbgVar;
    }

    public /* synthetic */ gmd(hdk hdkVar, int i) {
        this.f25584b = i;
        this.f25583a = hdkVar;
    }

    public /* synthetic */ gmd(hdz hdzVar, int i) {
        this.f25584b = i;
        this.f25583a = hdzVar;
    }

    public /* synthetic */ gmd(hfu hfuVar, int i) {
        this.f25584b = i;
        this.f25583a = hfuVar;
    }

    public /* synthetic */ gmd(hgk hgkVar, int i) {
        this.f25584b = i;
        this.f25583a = hgkVar;
    }

    public /* synthetic */ gmd(kfk kfkVar, int i) {
        this.f25584b = i;
        this.f25583a = kfkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kfk] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        Object[] objArr = 0;
        switch (this.f25584b) {
            case 0:
                List list = (List) obj;
                ((gme) this.f25583a).f25585a.mo3415bf(gmg.m9511a(((Integer) list.get(0)).intValue(), mws.m17098m(Float.valueOf(((Float) list.get(1)).floatValue()), Float.valueOf(0.0f))));
                return;
            case 1:
                List list2 = (List) obj;
                glu gluVar = (glu) this.f25583a;
                gluVar.f25539d.mo3415bf(gluVar.m9457a(((Float) list2.get(0)).floatValue(), ((Float) list2.get(1)).floatValue()));
                return;
            case 2:
                gmz.m9535c(this.f25583a, gmz.m9534b((fxi) obj));
                return;
            case 3:
                Object obj2 = this.f25583a;
                ikw ikwVar = (ikw) obj;
                synchronized (((gvu) obj2).f26534g) {
                    ((gvu) obj2).f26528a = ikwVar;
                    ((gvu) obj2).m9803b(ikwVar);
                    break;
                }
                return;
            case 4:
                Object obj3 = this.f25583a;
                dci dciVar = (dci) obj;
                synchronized (((gvu) obj3).f26534g) {
                    ((gvu) obj3).f26531d = dciVar.m5924b();
                    ((gvu) obj3).f26530c = true;
                    if (((gvu) obj3).f26532e.hasCallbacks(((gvu) obj3).f26538k)) {
                        ((gvu) obj3).f26532e.removeCallbacks(((gvu) obj3).f26538k);
                    }
                    ((gvu) obj3).m9803b(((gvu) obj3).f26528a);
                    break;
                }
                return;
            case 5:
                ((gwd) this.f25583a).m9851c();
                return;
            case 6:
                ((gwd) this.f25583a).m9851c();
                return;
            case 7:
                ((gwd) this.f25583a).m9851c();
                return;
            case 8:
                ((gwd) this.f25583a).m9851c();
                return;
            case 9:
                gwd gwdVar = (gwd) this.f25583a;
                gwdVar.f26575b = ((dci) obj).f10511c.mo14558k() == kmq.f36557a;
                gwdVar.m9851c();
                return;
            case 10:
                ((hbg) this.f25583a).m10084c();
                return;
            case 11:
                ((hbg) this.f25583a).m10084c();
                return;
            case 12:
                ((hbg) this.f25583a).m10084c();
                return;
            case 13:
                ((hbg) this.f25583a).m10084c();
                return;
            case 14:
                ((hbg) this.f25583a).m10084c();
                return;
            case 15:
                ((hdk) this.f25583a).m10122h(new hdb((gzp) obj, 3));
                return;
            case 16:
                ((hdk) this.f25583a).m10122h(new hdb((Boolean) obj, 4));
                return;
            case 17:
                Object obj4 = this.f25583a;
                ikw ikwVar2 = (ikw) obj;
                jvd.m13538a();
                hdk hdkVar = (hdk) obj4;
                if (hdkVar.f27339o.equals(ikwVar2)) {
                    return;
                }
                hdkVar.f27339o = ikwVar2;
                hdkVar.m10122h(new hdb(hdkVar, (int) (objArr == true ? 1 : 0)));
                return;
            case 18:
                ((hdz) this.f25583a).m10134b(hdy.f27406e, !((Boolean) obj).booleanValue());
                return;
            case 19:
                ((hgk) this.f25583a).mo10201j();
                return;
            default:
                Object obj5 = this.f25583a;
                if (((Boolean) obj).booleanValue()) {
                    ((hfu) obj5).m10215j(hgn.MARS_ENABLED);
                    return;
                } else {
                    ((hfu) obj5).m10216k(hgn.MARS_ENABLED);
                    return;
                }
        }
    }
}
