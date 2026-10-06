package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mwt {

    /* JADX INFO: renamed from: a */
    Object[] f41740a;

    /* JADX INFO: renamed from: b */
    int f41741b;

    /* JADX INFO: renamed from: c */
    C1058va f41742c;

    public mwt() {
        this(4);
    }

    /* JADX INFO: renamed from: a */
    private final mwx m17107a(boolean z) {
        C1058va c1058va;
        C1058va c1058va2;
        if (z && (c1058va2 = this.f41742c) != null) {
            throw c1058va2.m19465D();
        }
        mzw mzwVarM17192h = mzw.m17192h(this.f41741b, this.f41740a, this);
        if (!z || (c1058va = this.f41742c) == null) {
            return mzwVarM17192h;
        }
        throw c1058va.m19465D();
    }

    /* JADX INFO: renamed from: c */
    private final void m17108c(int i) {
        Object[] objArr = this.f41740a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f41740a = Arrays.copyOf(objArr, mwi.m17068a(length, i2));
        }
    }

    /* JADX INFO: renamed from: b */
    public mwx mo17059b() {
        return m17107a(true);
    }

    /* JADX INFO: renamed from: d */
    public final mwx m17109d() {
        return m17107a(false);
    }

    /* JADX INFO: renamed from: e */
    public void mo17110e(Object obj, Object obj2) {
        m17108c(this.f41741b + 1);
        lku.m15653g(obj, obj2);
        Object[] objArr = this.f41740a;
        int i = this.f41741b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f41741b = i + 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m17111f(Iterable iterable) {
        if (iterable instanceof Collection) {
            m17108c(this.f41741b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mo17110e(entry.getKey(), entry.getValue());
        }
    }

    public mwt(int i) {
        this.f41740a = new Object[i + i];
        this.f41741b = 0;
    }
}
