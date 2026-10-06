package p000;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mxn extends mwt {

    /* JADX INFO: renamed from: d */
    private transient Object[] f41768d;

    /* JADX INFO: renamed from: e */
    private transient Object[] f41769e;

    /* JADX INFO: renamed from: f */
    private final Comparator f41770f;

    public mxn(Comparator comparator) {
        comparator.getClass();
        this.f41770f = comparator;
        this.f41768d = new Object[4];
        this.f41769e = new Object[4];
    }

    @Override // p000.mwt
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void mo17110e(Object obj, Object obj2) {
        int i = this.f41741b + 1;
        int length = this.f41768d.length;
        if (i > length) {
            int iM17068a = mwi.m17068a(length, i);
            this.f41768d = Arrays.copyOf(this.f41768d, iM17068a);
            this.f41769e = Arrays.copyOf(this.f41769e, iM17068a);
        }
        lku.m15653g(obj, obj2);
        Object[] objArr = this.f41768d;
        int i2 = this.f41741b;
        objArr[i2] = obj;
        this.f41769e[i2] = obj2;
        this.f41741b = i2 + 1;
    }

    @Override // p000.mwt
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mxp mo17059b() {
        int i = this.f41741b;
        switch (i) {
            case 0:
                return mxp.m17147h(this.f41770f);
            case 1:
                Comparator comparator = this.f41770f;
                Object obj = this.f41768d[0];
                obj.getClass();
                Object obj2 = this.f41769e[0];
                obj2.getClass();
                return new mxp(new mzy(mws.m17097l(obj), comparator), mws.m17097l(obj2));
            default:
                Object[] objArrCopyOf = Arrays.copyOf(this.f41768d, i);
                Arrays.sort(objArrCopyOf, this.f41770f);
                Object[] objArr = new Object[this.f41741b];
                for (int i2 = 0; i2 < this.f41741b; i2++) {
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (this.f41770f.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                            throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i3] + " and " + objArrCopyOf[i2]);
                        }
                    }
                    Object obj3 = this.f41768d[i2];
                    obj3.getClass();
                    int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f41770f);
                    Object obj4 = this.f41769e[i2];
                    obj4.getClass();
                    objArr[iBinarySearch] = obj4;
                }
                return new mxp(new mzy(mws.m17092g(objArrCopyOf), this.f41770f), mws.m17092g(objArr));
        }
    }
}
