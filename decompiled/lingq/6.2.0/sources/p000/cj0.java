package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 extends AbstractC0003a1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10157c = 1;

    /* JADX INFO: renamed from: d */
    public final Object f10158d;

    public cj0(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.f10158d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f10157c;
        Object obj = this.f10158d;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    uk9.m22784s();
                    return null;
                }
                int i2 = this.f41a;
                this.f41a = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.f41a++;
                    return obj;
                }
                uk9.m22784s();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f10157c;
        Object obj = this.f10158d;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    uk9.m22784s();
                    return null;
                }
                int i2 = this.f41a - 1;
                this.f41a = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.f41a--;
                    return obj;
                }
                uk9.m22784s();
                return null;
        }
    }

    public cj0(Object obj, int i) {
        super(i, 1);
        this.f10158d = obj;
    }
}
