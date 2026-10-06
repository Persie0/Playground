package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knc extends kpu {

    /* JADX INFO: renamed from: a */
    public final Object f36584a;

    /* JADX INFO: renamed from: b */
    public int f36585b;

    public knc(kpz kpzVar) {
        super(kpzVar);
        this.f36584a = new Object();
        this.f36585b = 0;
    }

    /* JADX INFO: renamed from: j */
    private final kpw m14588j(kpw kpwVar) {
        if (kpwVar == null) {
            return null;
        }
        this.f36585b++;
        return new knb(this, kpwVar);
    }

    @Override // p000.kpu, p000.kpz
    /* JADX INFO: renamed from: f */
    public final kpw mo14511f() {
        synchronized (this.f36584a) {
            if (this.f36585b == mo14508c()) {
                return null;
            }
            return m14588j(super.mo14511f());
        }
    }

    @Override // p000.kpu, p000.kpz
    /* JADX INFO: renamed from: g */
    public final kpw mo14512g() {
        synchronized (this.f36584a) {
            if (this.f36585b == mo14508c()) {
                return null;
            }
            return m14588j(super.mo14512g());
        }
    }
}
