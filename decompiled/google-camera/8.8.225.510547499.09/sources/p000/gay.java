package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gay implements gaw {

    /* JADX INFO: renamed from: a */
    public final gyh f24054a;

    /* JADX INFO: renamed from: b */
    private final jvd f24055b;

    /* JADX INFO: renamed from: c */
    private final Object f24056c = new Object();

    /* JADX INFO: renamed from: d */
    private final jfs f24057d = new jfs((byte[]) null, (byte[]) null);

    public gay(gyh gyhVar, jvd jvdVar) {
        this.f24054a = gyhVar;
        this.f24055b = jvdVar;
    }

    @Override // p000.gaw
    /* JADX INFO: renamed from: a */
    public final void mo9016a(imv imvVar, float f) {
        synchronized (this.f24056c) {
            this.f24055b.execute(new euw(this, this.f24057d.m13115y(imvVar, f), 3));
        }
    }
}
