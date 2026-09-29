package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ds4 implements uo7 {

    /* JADX INFO: renamed from: c */
    public static final Object f36157c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f36158a = f36157c;

    /* JADX INFO: renamed from: b */
    public volatile uo7 f36159b;

    public ds4(uo7 uo7Var) {
        this.f36159b = uo7Var;
    }

    @Override // p000.uo7
    public final Object get() {
        Object obj;
        Object obj2 = this.f36158a;
        Object obj3 = f36157c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f36158a;
                if (obj == obj3) {
                    obj = this.f36159b.get();
                    this.f36158a = obj;
                    this.f36159b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
