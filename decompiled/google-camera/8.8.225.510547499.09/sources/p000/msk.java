package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msk implements msi {

    /* JADX INFO: renamed from: a */
    private static final msi f41548a = ffw.f21767m;

    /* JADX INFO: renamed from: b */
    private volatile msi f41549b;

    /* JADX INFO: renamed from: c */
    private Object f41550c;

    public msk(msi msiVar) {
        msiVar.getClass();
        this.f41549b = msiVar;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        msi msiVar = this.f41549b;
        msi msiVar2 = f41548a;
        if (msiVar != msiVar2) {
            synchronized (this) {
                if (this.f41549b != msiVar2) {
                    Object objMo6051a = this.f41549b.mo6051a();
                    this.f41550c = objMo6051a;
                    this.f41549b = msiVar2;
                    return objMo6051a;
                }
            }
        }
        return this.f41550c;
    }

    public final String toString() {
        Object obj = this.f41549b;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == f41548a) {
            obj = "<supplier that returned " + this.f41550c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
