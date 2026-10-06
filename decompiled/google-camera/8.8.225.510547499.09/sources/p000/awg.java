package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awg extends awf {

    /* JADX INFO: renamed from: a */
    private final Object f2579a;

    public awg(Object obj) {
        this.f2579a = obj;
    }

    @Override // p000.awf
    /* JADX INFO: renamed from: a */
    public final awf mo2072a(String str, oni oniVar) {
        return ((Boolean) oniVar.mo1803a(this.f2579a)).booleanValue() ? this : new awe(this.f2579a, str);
    }

    @Override // p000.awf
    /* JADX INFO: renamed from: b */
    public final Object mo2073b() {
        return this.f2579a;
    }
}
