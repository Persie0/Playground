package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aef extends aee {

    /* JADX INFO: renamed from: a */
    private final Object f251a;

    public aef(int i) {
        super(i);
        this.f251a = new Object();
    }

    @Override // p000.aee, p000.aed
    /* JADX INFO: renamed from: a */
    public final Object mo320a() {
        Object objMo320a;
        synchronized (this.f251a) {
            objMo320a = super.mo320a();
        }
        return objMo320a;
    }

    @Override // p000.aee, p000.aed
    /* JADX INFO: renamed from: b */
    public final boolean mo321b(Object obj) {
        boolean zMo321b;
        synchronized (this.f251a) {
            zMo321b = super.mo321b(obj);
        }
        return zMo321b;
    }
}
