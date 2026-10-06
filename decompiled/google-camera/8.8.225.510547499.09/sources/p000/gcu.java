package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gcu implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24241a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24242b;

    public /* synthetic */ gcu(gdc gdcVar, int i) {
        this.f24242b = i;
        this.f24241a = gdcVar;
    }

    public /* synthetic */ gcu(geg gegVar, int i) {
        this.f24242b = i;
        this.f24241a = gegVar;
    }

    public /* synthetic */ gcu(geh gehVar, int i) {
        this.f24242b = i;
        this.f24241a = gehVar;
    }

    public /* synthetic */ gcu(geo geoVar, int i) {
        this.f24242b = i;
        this.f24241a = geoVar;
    }

    public /* synthetic */ gcu(ges gesVar, int i) {
        this.f24242b = i;
        this.f24241a = gesVar;
    }

    public /* synthetic */ gcu(gfa gfaVar, int i) {
        this.f24242b = i;
        this.f24241a = gfaVar;
    }

    public /* synthetic */ gcu(ghq ghqVar, int i) {
        this.f24242b = i;
        this.f24241a = ghqVar;
    }

    public /* synthetic */ gcu(ghy ghyVar, int i) {
        this.f24242b = i;
        this.f24241a = ghyVar;
    }

    public /* synthetic */ gcu(jwf jwfVar, int i) {
        this.f24242b = i;
        this.f24241a = jwfVar;
    }

    public /* synthetic */ gcu(jww jwwVar, int i) {
        this.f24242b = i;
        this.f24241a = jwwVar;
    }

    public /* synthetic */ gcu(kfk kfkVar, int i) {
        this.f24242b = i;
        this.f24241a = kfkVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jww] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        switch (this.f24242b) {
            case 0:
                Object obj2 = this.f24241a;
                gdb gdbVar = gcv.f24243a;
                if (((Boolean) obj).booleanValue()) {
                    jxd jxdVar = (jxd) obj2;
                    if (((gdb) jxdVar.mo3831be()).equals(gdb.OFF)) {
                        jxdVar.mo3415bf(gdb.AUTO);
                    }
                }
                break;
            case 1:
                ?? r0 = this.f24241a;
                gdb gdbVar2 = gcv.f24243a;
                if (((gdb) obj).equals(gdb.OFF) && ((Boolean) r0.mo3831be()).booleanValue()) {
                    r0.mo3415bf(Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                ((geg) this.f24241a).m9092f(((dci) obj).m5923a());
                break;
            case 3:
                ((geh) this.f24241a).f24380d.mo4224g((ikw) obj);
                break;
            case 4:
                ((geo) this.f24241a).mo9129o(true, null);
                break;
            case 5:
                Object obj3 = this.f24241a;
                gfc gfcVar = (gfc) ((mzq) ges.f24425b).f41853c.get((gzp) obj);
                if (gfcVar != null) {
                    ((ges) obj3).f24431h.m9208f(gfcVar);
                }
                break;
            case 6:
                ((ges) this.f24241a).m9144b();
                break;
            case 7:
                this.f24241a.mo9129o(false, gev.IMAGE_ASPECT_RATIO);
                break;
            case 8:
                this.f24241a.mo9129o(false, gev.IMAGE_ASPECT_RATIO);
                break;
            case 9:
                this.f24241a.mo9129o(false, gev.IMAGE_ASPECT_RATIO_IMMERSIVE);
                break;
            case 10:
                ?? r1 = this.f24241a;
                nbh nbhVar = gfy.f24631a;
                if (ikw.PHOTO.equals(r1.mo9115b())) {
                    r1.mo9129o(false, gev.HDR);
                }
                break;
            case 11:
                ?? r2 = this.f24241a;
                nbh nbhVar2 = gfy.f24631a;
                r2.mo9129o(false, gev.BACK_PHOTO_FLASH);
                break;
            case 12:
                ?? r3 = this.f24241a;
                nbh nbhVar3 = gfy.f24631a;
                if (r3.mo9115b().equals(ikw.TIME_LAPSE)) {
                    r3.mo9129o(false, gev.VIDEO_RESOLUTION);
                }
                break;
            case 13:
                ?? r4 = this.f24241a;
                nbh nbhVar4 = gfy.f24631a;
                r4.mo9129o(true, gev.f24452l);
                break;
            case 14:
                ?? r5 = this.f24241a;
                nbh nbhVar5 = gfy.f24631a;
                r5.mo9129o(false, gev.f24463w);
                break;
            case 15:
                ?? r6 = this.f24241a;
                nbh nbhVar6 = gfy.f24631a;
                if (r6.mo9115b().equals(ikw.VIDEO)) {
                    r6.mo9129o(false, gev.VIDEO_RESOLUTION);
                }
                break;
            case 16:
                ?? r7 = this.f24241a;
                nbh nbhVar7 = gfy.f24631a;
                r7.mo9129o(false, gev.VIDEO_RESOLUTION);
                break;
            case 17:
                ?? r8 = this.f24241a;
                if (((Boolean) obj).booleanValue()) {
                    r8.mo14126m(false, true, false);
                }
                break;
            case 18:
                ((jwf) this.f24241a).mo3415bf(((gzk) obj) == gzk.ON ? gss.CONTINUOUS_PICTURE : gss.OFF);
                break;
            case 19:
                Object obj4 = this.f24241a;
                if (!((Boolean) obj).booleanValue()) {
                    ((ghq) obj4).m9258c();
                } else {
                    ((ghq) obj4).f24788b.m13585b();
                }
                break;
            default:
                Object obj5 = this.f24241a;
                hsg hsgVar = (hsg) obj;
                if (hsgVar.m10694c() && hsgVar.f29403a != hsa.f29385a && hsgVar.f29408f != 1) {
                    ghy ghyVar = (ghy) obj5;
                    if (!((Boolean) ghyVar.f24836b.mo3831be()).booleanValue()) {
                        if (!ghyVar.f24847m.mo6184l(dhu.f11209k) || !((Boolean) ((jwf) ghyVar.f24853s.f3651a).f34942d).booleanValue()) {
                            ghyVar.m9266e(ghyVar.m9263b(hsgVar), true ^ ((Boolean) ((jwf) ghyVar.f24850p.f12398d).f34942d).booleanValue(), hsgVar.f29403a != hsa.GYRO, false);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
