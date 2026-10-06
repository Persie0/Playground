package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jxo {
    MPEG_4(2, 0, krd.MPEG4),
    WEBM(9, 1, krd.WEBM),
    THREE_GPP(1, 2, krd.THREE_GPP);


    /* JADX INFO: renamed from: d */
    public final int f35065d;

    /* JADX INFO: renamed from: e */
    public final int f35066e;

    /* JADX INFO: renamed from: f */
    public final krd f35067f;

    jxo(int i, int i2, krd krdVar) {
        this.f35065d = i;
        this.f35066e = i2;
        this.f35067f = krdVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13659a(jyg jygVar) {
        int i = jygVar.f35164e;
        return i == 2 || i == 1;
    }
}
