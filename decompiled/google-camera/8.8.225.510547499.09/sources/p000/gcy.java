package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gcy {
    AUTO("auto", 2),
    OFF("off", 1),
    ON("on", 3);


    /* JADX INFO: renamed from: d */
    public final String f24251d;

    /* JADX INFO: renamed from: e */
    public final int f24252e;

    gcy(String str, int i) {
        this.f24251d = str;
        this.f24252e = i;
    }

    /* JADX INFO: renamed from: a */
    public static gcy m9066a(String str, gcy gcyVar) {
        str.getClass();
        gcy gcyVar2 = AUTO;
        if (gcyVar2.f24251d.equals(str)) {
            return gcyVar2;
        }
        gcy gcyVar3 = OFF;
        if (gcyVar3.f24251d.equals(str)) {
            return gcyVar3;
        }
        gcy gcyVar4 = ON;
        return gcyVar4.f24251d.equals(str) ? gcyVar4 : gcyVar;
    }
}
