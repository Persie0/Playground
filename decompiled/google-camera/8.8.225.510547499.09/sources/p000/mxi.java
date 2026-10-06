package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mxi extends mwi {

    /* JADX INFO: renamed from: d */
    Object[] f41762d;

    /* JADX INFO: renamed from: e */
    private int f41763e;

    public mxi() {
        super(4);
    }

    @Override // p000.mwi
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void mo17072d(Object obj) {
        obj.getClass();
        if (this.f41762d != null) {
            int iM17131B = mxk.m17131B(this.f41725b);
            Object[] objArr = this.f41762d;
            int length = objArr.length;
            if (iM17131B <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iM16522ad = mkv.m16522ad(iHashCode);
                while (true) {
                    Object[] objArr2 = this.f41762d;
                    int i = iM16522ad & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f41763e += iHashCode;
                        super.m17071c(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iM16522ad = i + 1;
                    }
                }
            }
        }
        this.f41762d = null;
        super.m17071c(obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m17129h(Iterable iterable) {
        iterable.getClass();
        if (this.f41762d == null) {
            super.m17073e(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo17072d(it.next());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m17130i(mxi mxiVar) {
        if (this.f41762d == null) {
            m17070b(mxiVar.f41724a, mxiVar.f41725b);
            return;
        }
        for (int i = 0; i < mxiVar.f41725b; i++) {
            Object obj = mxiVar.f41724a[i];
            obj.getClass();
            mo17072d(obj);
        }
    }

    public mxi(byte[] bArr) {
        super(4);
        this.f41762d = new Object[mxk.m17131B(4)];
    }

    /* JADX INFO: renamed from: f */
    public mxk mo17127f() {
        mxk mxkVarM17133E;
        int i = this.f41725b;
        switch (i) {
            case 0:
                return mzx.f41874a;
            case 1:
                Object obj = this.f41724a[0];
                obj.getClass();
                return mxk.m17136H(obj);
            default:
                if (this.f41762d == null || mxk.m17131B(i) != this.f41762d.length) {
                    mxkVarM17133E = mxk.m17133E(this.f41725b, this.f41724a);
                    this.f41725b = mxkVarM17133E.size();
                } else {
                    int i2 = this.f41725b;
                    Object[] objArr = this.f41724a;
                    Object[] objArrCopyOf = mxk.m17142N(i2, objArr.length) ? Arrays.copyOf(objArr, i2) : objArr;
                    int i3 = this.f41763e;
                    Object[] objArr2 = this.f41762d;
                    mxkVarM17133E = new mzx(objArrCopyOf, i3, objArr2, objArr2.length - 1, this.f41725b);
                }
                this.f41726c = true;
                this.f41762d = null;
                return mxkVarM17133E;
        }
    }
}
