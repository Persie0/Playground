package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msj implements Serializable, msi {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final msi f41545a;

    /* JADX INFO: renamed from: b */
    volatile transient boolean f41546b;

    /* JADX INFO: renamed from: c */
    transient Object f41547c;

    public msj(msi msiVar) {
        msiVar.getClass();
        this.f41545a = msiVar;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        if (!this.f41546b) {
            synchronized (this) {
                if (!this.f41546b) {
                    Object objMo6051a = this.f41545a.mo6051a();
                    this.f41547c = objMo6051a;
                    this.f41546b = true;
                    return objMo6051a;
                }
            }
        }
        return this.f41547c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f41546b) {
            obj = "<supplier that returned " + this.f41547c + ">";
        } else {
            obj = this.f41545a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
