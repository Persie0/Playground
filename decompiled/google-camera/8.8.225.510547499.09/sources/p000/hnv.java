package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum hnv {
    COLD(6),
    NORMAL(1),
    HEAT_LIGHT(7),
    HEAT_MODERATE(8),
    HEAT_SEVERE(2),
    HEAT_CRITICAL(3),
    HEAT_EMERGENCY(4),
    HEAT_SHUTDOWN(9),
    UNKNOWN(5);


    /* JADX INFO: renamed from: j */
    public final int f28545j;

    hnv(int i) {
        this.f28545j = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10520a(hnv hnvVar) {
        hnv hnvVar2 = UNKNOWN;
        return (this == hnvVar2 || hnvVar == hnvVar2 || ordinal() < hnvVar.ordinal()) ? false : true;
    }
}
