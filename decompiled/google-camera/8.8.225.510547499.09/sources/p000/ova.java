package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ova {

    /* JADX INFO: renamed from: a */
    private static final oni f46623a = ouz.f46613a;

    /* JADX INFO: renamed from: b */
    private static final onm f46624b = olx.f46276e;

    /* JADX INFO: renamed from: a */
    public static final our m19084a(our ourVar) {
        ourVar.getClass();
        if (ourVar instanceof ovt) {
            return ourVar;
        }
        oni oniVar = f46623a;
        onm onmVar = f46624b;
        if (ourVar instanceof ouq) {
            ouq ouqVar = (ouq) ourVar;
            if (ouqVar.f46591a == oniVar && ouqVar.f46592b == onmVar) {
                return ourVar;
            }
        }
        return new ouq(ourVar, oniVar, onmVar);
    }
}
