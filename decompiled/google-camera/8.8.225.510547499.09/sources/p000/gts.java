package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gts {

    /* JADX INFO: renamed from: a */
    public final long f26386a;

    /* JADX INFO: renamed from: b */
    public final mrm f26387b;

    /* JADX INFO: renamed from: c */
    public final float f26388c;

    /* JADX INFO: renamed from: d */
    public final mrm f26389d;

    /* JADX INFO: renamed from: e */
    public final float f26390e;

    /* JADX INFO: renamed from: f */
    public final mrm f26391f;

    /* JADX INFO: renamed from: g */
    public final mrm f26392g;

    public gts(occ occVar, boolean z) {
        mrm mrmVarM16829i;
        mrm mrmVarM16829i2;
        float f;
        mrm mrmVarM16829i3;
        ktz ktzVar = odn.f45633j;
        occVar.m18121e(ktzVar);
        Object objM18028k = occVar.f44976l.m18028k((nxp) ktzVar.f37201d);
        if (objM18028k == null) {
            objM18028k = ktzVar.f37199b;
        } else {
            ktzVar.m14855g(objM18028k);
        }
        odn odnVar = (odn) objM18028k;
        boolean z2 = ((occVar.f45432a & 128) == 0 || z) ? false : true;
        this.f26386a = (int) occVar.f45440i;
        this.f26387b = z2 ? mrm.m16829i(Long.valueOf(occVar.f45441j)) : mqu.f41450a;
        this.f26388c = odnVar.f45638d;
        float f2 = odnVar.f45639e;
        float f3 = odnVar.f45640f;
        if ((odnVar.f45635a & 1) != 0) {
            odk odkVar = odnVar.f45636b;
            mrmVarM16829i = mrm.m16829i(mws.m17095j((odkVar == null ? odk.f45626b : odkVar).f45628a));
        } else {
            mrmVarM16829i = mqu.f41450a;
        }
        this.f26392g = mrmVarM16829i;
        if ((odnVar.f45635a & 2) != 0) {
            odk odkVar2 = odnVar.f45637c;
            mrmVarM16829i2 = mrm.m16829i(mws.m17095j((odkVar2 == null ? odk.f45626b : odkVar2).f45628a));
        } else {
            mrmVarM16829i2 = mqu.f41450a;
        }
        this.f26391f = mrmVarM16829i2;
        boolean z3 = (odnVar.f45635a & 64) != 0;
        if (z3) {
            odo odoVar = odnVar.f45642h;
            f = (odoVar == null ? odo.f45645d : odoVar).f45649c;
        } else {
            f = 0.0f;
        }
        this.f26390e = f;
        if (z3) {
            odo odoVar2 = odnVar.f45642h;
            mrmVarM16829i3 = mrm.m16829i(mws.m17095j((odoVar2 == null ? odo.f45645d : odoVar2).f45648b));
        } else {
            mrmVarM16829i3 = mqu.f41450a;
        }
        this.f26389d = mrmVarM16829i3;
    }
}
