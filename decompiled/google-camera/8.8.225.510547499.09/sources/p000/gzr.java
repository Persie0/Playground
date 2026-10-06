package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gzr {
    RES_1080P,
    RES_2160P;

    /* JADX INFO: renamed from: b */
    public static mrm m10021b(jxp jxpVar) {
        gzk gzkVar = gzk.ON;
        jxp jxpVar2 = jxp.RES_UNKNOWN;
        switch (jxpVar.ordinal()) {
            case 8:
                return mrm.m16829i(RES_1080P);
            case 9:
            default:
                return mqu.f41450a;
            case 10:
                return mrm.m16829i(RES_2160P);
        }
    }
}
