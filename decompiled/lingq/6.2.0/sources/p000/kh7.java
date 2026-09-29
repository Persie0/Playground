package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kh7 extends jh7 {

    /* JADX INFO: renamed from: c */
    public final Object f47300c;

    public kh7(int i) {
        super(i);
        this.f47300c = new Object();
    }

    @Override // p000.jh7
    /* JADX INFO: renamed from: a */
    public final Object mo14458a() {
        Object objMo14458a;
        synchronized (this.f47300c) {
            objMo14458a = super.mo14458a();
        }
        return objMo14458a;
    }

    @Override // p000.jh7
    /* JADX INFO: renamed from: c */
    public final boolean mo14460c(Object obj) {
        boolean zMo14460c;
        synchronized (this.f47300c) {
            zMo14460c = super.mo14460c(obj);
        }
        return zMo14460c;
    }
}
