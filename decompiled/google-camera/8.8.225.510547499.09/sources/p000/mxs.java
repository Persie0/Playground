package p000;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxs implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final Comparator f41777a;

    /* JADX INFO: renamed from: b */
    final Object[] f41778b;

    public mxs(Comparator comparator, Object[] objArr) {
        this.f41777a = comparator;
        this.f41778b = objArr;
    }

    Object readResolve() {
        mxr mxrVar = new mxr(this.f41777a);
        Object[] objArr = this.f41778b;
        if (mxrVar.f41762d != null) {
            for (Object obj : objArr) {
                mxrVar.mo17072d(obj);
            }
        } else {
            mxrVar.m17070b(objArr, objArr.length);
        }
        return mxrVar.mo17127f();
    }
}
