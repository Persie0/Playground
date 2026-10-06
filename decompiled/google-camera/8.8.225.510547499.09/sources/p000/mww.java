package p000;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class mww implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final Object f41744a;

    /* JADX INFO: renamed from: b */
    private final Object f41745b;

    public mww(mwx mwxVar) {
        Object[] objArr = new Object[mwxVar.size()];
        Object[] objArr2 = new Object[mwxVar.size()];
        naz nazVarListIterator = mwxVar.entrySet().listIterator();
        int i = 0;
        while (nazVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) nazVarListIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f41744a = objArr;
        this.f41745b = objArr2;
    }

    /* JADX INFO: renamed from: a */
    public mwt mo17061a(int i) {
        return new mwt(i);
    }

    final Object readResolve() {
        Object obj = this.f41744a;
        if (obj instanceof mxk) {
            mxk mxkVar = (mxk) obj;
            mwj mwjVar = (mwj) this.f41745b;
            mwt mwtVarMo17061a = mo17061a(mxkVar.size());
            naz nazVarListIterator = mxkVar.listIterator();
            naz nazVarListIterator2 = mwjVar.listIterator();
            while (nazVarListIterator.hasNext()) {
                mwtVarMo17061a.mo17110e(nazVarListIterator.next(), nazVarListIterator2.next());
            }
            return mwtVarMo17061a.mo17059b();
        }
        Object obj2 = this.f41745b;
        Object[] objArr = (Object[]) obj;
        mwt mwtVarMo17061a2 = mo17061a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            mwtVarMo17061a2.mo17110e(objArr[i], ((Object[]) obj2)[i]);
        }
        return mwtVarMo17061a2.mo17059b();
    }
}
