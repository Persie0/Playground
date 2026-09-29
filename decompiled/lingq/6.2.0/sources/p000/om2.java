package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class om2 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54567a;

    /* JADX INFO: renamed from: b */
    public int f54568b;

    /* JADX INFO: renamed from: c */
    public final Object f54569c;

    public om2(pm2 pm2Var) {
        this.f54567a = 0;
        this.f54569c = pm2Var.f56462a.iterator();
        this.f54568b = pm2Var.f56463b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f54567a;
        Object obj = this.f54569c;
        switch (i) {
            case 0:
                Iterator it = (Iterator) obj;
                while (this.f54568b > 0 && it.hasNext()) {
                    it.next();
                    this.f54568b--;
                }
                return it.hasNext();
            case 1:
                return this.f54568b > 0;
            case 2:
                return this.f54568b < ((byte[]) obj).length;
            case 3:
                return this.f54568b < ((int[]) obj).length;
            case 4:
                return this.f54568b < ((long[]) obj).length;
            default:
                return this.f54568b < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f54567a;
        Object obj = this.f54569c;
        switch (i) {
            case 0:
                Iterator it = (Iterator) obj;
                while (this.f54568b > 0 && it.hasNext()) {
                    it.next();
                    this.f54568b--;
                }
                return it.next();
            case 1:
                xs2 xs2Var = (xs2) obj;
                int i2 = xs2Var.f8504c;
                int i3 = this.f54568b;
                this.f54568b = i3 - 1;
                return xs2Var.f8506e[i2 - i3];
            case 2:
                int i4 = this.f54568b;
                byte[] bArr = (byte[]) obj;
                if (i4 < bArr.length) {
                    this.f54568b = i4 + 1;
                    return new eea(bArr[i4]);
                }
                uk9.m22775i(String.valueOf(i4));
                return null;
            case 3:
                int i5 = this.f54568b;
                int[] iArr = (int[]) obj;
                if (i5 < iArr.length) {
                    this.f54568b = i5 + 1;
                    return new jea(iArr[i5]);
                }
                uk9.m22775i(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.f54568b;
                long[] jArr = (long[]) obj;
                if (i6 < jArr.length) {
                    this.f54568b = i6 + 1;
                    return new oea(jArr[i6]);
                }
                uk9.m22775i(String.valueOf(i6));
                return null;
            default:
                int i7 = this.f54568b;
                short[] sArr = (short[]) obj;
                if (i7 < sArr.length) {
                    this.f54568b = i7 + 1;
                    return new vea(sArr[i7]);
                }
                uk9.m22775i(String.valueOf(i7));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f54567a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public om2(xs2 xs2Var) {
        this.f54567a = 1;
        this.f54569c = xs2Var;
        this.f54568b = xs2Var.f8504c;
    }

    public /* synthetic */ om2(Object obj, int i) {
        this.f54567a = i;
        this.f54569c = obj;
    }
}
