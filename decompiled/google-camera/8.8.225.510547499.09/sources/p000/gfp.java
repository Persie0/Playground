package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gfp implements ilf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ get f24597a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24598b;

    public /* synthetic */ gfp(gfo gfoVar, int i) {
        this.f24598b = i;
        this.f24597a = gfoVar;
    }

    public /* synthetic */ gfp(gfq gfqVar, int i) {
        this.f24598b = i;
        this.f24597a = gfqVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    @Override // p000.ilf
    /* JADX INFO: renamed from: q */
    public final void mo4159q(ilk ilkVar, hzj hzjVar) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 10000;
        switch (this.f24598b) {
            case 0:
                get getVar = this.f24597a;
                ilk ilkVar2 = ilk.PORTRAIT;
                ikw ikwVar = ikw.UNINITIALIZED;
                gfc gfcVar = gfc.UNKNOWN;
                switch (ilkVar.ordinal()) {
                    case 1:
                        i = 7500;
                        break;
                    case 2:
                        i = 2500;
                        break;
                    default:
                        i = 0;
                        break;
                }
                gfq gfqVar = (gfq) getVar;
                int level = gfqVar.f24599a.getLevel();
                if (level != 10000) {
                    if (level == 0) {
                        i3 = level;
                    } else if (i == 7500) {
                        gfqVar.f24599a.setLevel(10000);
                        gfqVar.f24600b.setLevel(10000);
                        i4 = i;
                    } else {
                        level = 0;
                    }
                    if (i3 == 7500 || i != 0) {
                        i4 = i;
                    }
                } else if (i == 2500) {
                    gfqVar.f24599a.setLevel(0);
                    gfqVar.f24600b.setLevel(0);
                    i4 = 2500;
                    level = 10000;
                } else {
                    level = 10000;
                    if (level == 0) {
                        i3 = level;
                    } else if (i == 7500) {
                        gfqVar.f24599a.setLevel(10000);
                        gfqVar.f24600b.setLevel(10000);
                        i4 = i;
                    } else {
                        level = 0;
                    }
                    if (i3 == 7500) {
                        i4 = i;
                    } else {
                        i4 = i;
                    }
                }
                int iAbs = Math.abs(i4 - level);
                if (iAbs <= 2500 && iAbs != 0) {
                    gfq.m9184o(i4, gfqVar.f24599a);
                    gfq.m9184o(i4, gfqVar.f24600b);
                } else {
                    gfqVar.f24599a.setLevel(i4);
                    gfqVar.f24600b.setLevel(i4);
                }
                break;
            default:
                get getVar2 = this.f24597a;
                ilk ilkVar3 = ilk.PORTRAIT;
                ikw ikwVar2 = ikw.UNINITIALIZED;
                gfc gfcVar2 = gfc.UNKNOWN;
                switch (ilkVar.ordinal()) {
                    case 1:
                        i2 = 7500;
                        break;
                    case 2:
                        i2 = 2500;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                gfo gfoVar = (gfo) getVar2;
                int level2 = gfoVar.f24588a.getLevel();
                if (level2 != 10000) {
                    if (level2 == 0) {
                        i3 = level2;
                    } else if (i2 == 7500) {
                        gfoVar.f24588a.setLevel(10000);
                        gfoVar.f24589b.setLevel(10000);
                        i4 = i2;
                    } else {
                        level2 = 0;
                    }
                    if (i3 == 7500 || i2 != 0) {
                        i4 = i2;
                    }
                } else if (i2 == 2500) {
                    gfoVar.f24588a.setLevel(0);
                    gfoVar.f24589b.setLevel(0);
                    i4 = 2500;
                    level2 = 10000;
                } else {
                    level2 = 10000;
                    if (level2 == 0) {
                        i3 = level2;
                    } else if (i2 == 7500) {
                        gfoVar.f24588a.setLevel(10000);
                        gfoVar.f24589b.setLevel(10000);
                        i4 = i2;
                    } else {
                        level2 = 0;
                    }
                    if (i3 == 7500) {
                        i4 = i2;
                    } else {
                        i4 = i2;
                    }
                }
                int iAbs2 = Math.abs(i4 - level2);
                if (iAbs2 <= 2500 && iAbs2 != 0) {
                    gfo.m9183o(i4, gfoVar.f24588a);
                    gfo.m9183o(i4, gfoVar.f24589b);
                } else {
                    gfoVar.f24588a.setLevel(i4);
                    gfoVar.f24589b.setLevel(i4);
                }
                break;
        }
    }
}
