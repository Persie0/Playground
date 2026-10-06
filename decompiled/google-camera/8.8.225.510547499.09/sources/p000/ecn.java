package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecn implements hjk {

    /* JADX INFO: renamed from: a */
    public static final nbh f13383a = nbh.m17259h("com/google/android/apps/camera/hdrplus/HdrPlusPrewarmBehavior");

    /* JADX INFO: renamed from: b */
    public final oju f13384b;

    /* JADX INFO: renamed from: c */
    public final dhv f13385c;

    /* JADX INFO: renamed from: d */
    public final kbz f13386d;

    /* JADX INFO: renamed from: e */
    public final mrm f13387e;

    /* JADX INFO: renamed from: f */
    public final mrm f13388f;

    /* JADX INFO: renamed from: g */
    private final nps f13389g;

    public ecn(oju ojuVar, dhv dhvVar, kbz kbzVar, mrm mrmVar, mrm mrmVar2, nps npsVar) {
        this.f13384b = ojuVar;
        this.f13385c = dhvVar;
        this.f13386d = kbzVar;
        this.f13387e = mrmVar;
        this.f13388f = mrmVar2;
        this.f13389g = npsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jvh.m13562j(this.f13389g, new cis(this, 7), not.INSTANCE);
    }
}
