package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nel {

    /* JADX INFO: renamed from: a */
    public final int f42144a;

    /* JADX INFO: renamed from: b */
    public final ncj f42145b;

    protected nel(ncj ncjVar, int i) {
        if (ncjVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i >= 0) {
            this.f42144a = i;
            this.f42145b = ncjVar;
        } else {
            throw new IllegalArgumentException("invalid index: " + i);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17417a(nem nemVar, Object obj);
}
