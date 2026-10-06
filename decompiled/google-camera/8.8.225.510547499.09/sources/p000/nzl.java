package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzl extends nwr {

    /* JADX INFO: renamed from: a */
    public static final int[] f45075a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d */
    public final int f45076d;

    /* JADX INFO: renamed from: e */
    public final nwr f45077e;

    /* JADX INFO: renamed from: f */
    public final nwr f45078f;

    /* JADX INFO: renamed from: g */
    public final int f45079g;

    /* JADX INFO: renamed from: h */
    private final int f45080h;

    public nzl(nwr nwrVar, nwr nwrVar2) {
        this.f45077e = nwrVar;
        this.f45078f = nwrVar2;
        int iMo17783d = nwrVar.mo17783d();
        this.f45080h = iMo17783d;
        this.f45076d = iMo17783d + nwrVar2.mo17783d();
        this.f45079g = Math.max(nwrVar.mo17785f(), nwrVar2.mo17785f()) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m18266c(int i) {
        int[] iArr = f45075a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: g */
    public static nwr m18267g(nwr nwrVar, nwr nwrVar2) {
        int iMo17783d = nwrVar.mo17783d();
        int iMo17783d2 = nwrVar2.mo17783d();
        byte[] bArr = new byte[iMo17783d + iMo17783d2];
        nwrVar.m17805B(bArr, 0, iMo17783d);
        nwrVar2.m17805B(bArr, iMo17783d, iMo17783d2);
        return nwr.m17802x(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(VCYBIzY.fEVjkZwQeCqyGQt);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: a */
    public final byte mo17780a(int i) {
        m17803z(i, this.f45076d);
        return mo17781b(i);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: b */
    public final byte mo17781b(int i) {
        int i2 = this.f45080h;
        return i < i2 ? this.f45077e.mo17781b(i) : this.f45078f.mo17781b(i - i2);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: d */
    public final int mo17783d() {
        return this.f45076d;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: e */
    protected final void mo17784e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f45080h;
        if (i4 <= i5) {
            this.f45077e.mo17784e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f45078f.mo17784e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.f45077e.mo17784e(bArr, i, i2, i6);
            this.f45078f.mo17784e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // p000.nwr
    public final boolean equals(Object obj) {
        nwp nwpVarM18265a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nwr)) {
            return false;
        }
        nwr nwrVar = (nwr) obj;
        if (this.f45076d != nwrVar.mo17783d()) {
            return false;
        }
        if (this.f45076d == 0) {
            return true;
        }
        int i = this.f44840c;
        int i2 = nwrVar.f44840c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        nzk nzkVar = new nzk(this);
        nwp nwpVarM18265a2 = nzkVar.next();
        nzk nzkVar2 = new nzk(nwrVar);
        nwp nwpVarM18265a3 = nzkVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int iD = nwpVarM18265a2.mo17783d() - i3;
            int iD2 = nwpVarM18265a3.mo17783d() - i4;
            int iMin = Math.min(iD, iD2);
            if (!(i3 == 0 ? nwpVarM18265a2.mo17786g(nwpVarM18265a3, i4, iMin) : nwpVarM18265a3.mo17786g(nwpVarM18265a2, i3, iMin))) {
                return false;
            }
            i5 += iMin;
            int i6 = this.f45076d;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                nwpVarM18265a = nzkVar.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
            if (iMin == iD2) {
                nwpVarM18265a2 = nwpVarM18265a2;
                nwpVarM18265a2 = nwpVarM18265a;
                nwpVarM18265a3 = nzkVar2.next();
                i4 = 0;
            } else {
                nwpVarM18265a2 = nwpVarM18265a2;
                nwpVarM18265a2 = nwpVarM18265a;
                i4 += iMin;
            }
        }
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: f */
    protected final int mo17785f() {
        return this.f45079g;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: h */
    public final boolean mo17787h() {
        return this.f45076d >= m18266c(this.f45079g);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: i */
    protected final int mo17788i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f45080h;
        if (i4 <= i5) {
            return this.f45077e.mo17788i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f45078f.mo17788i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f45078f.mo17788i(this.f45077e.mo17788i(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.nwr, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: j */
    protected final int mo17789j(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f45080h;
        if (i4 <= i5) {
            return this.f45077e.mo17789j(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f45078f.mo17789j(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f45078f.mo17789j(this.f45077e.mo17789j(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: k */
    public final nwr mo17790k(int i, int i2) {
        int iQ = m17796q(i, i2, this.f45076d);
        if (iQ == 0) {
            return nwr.f44839b;
        }
        if (iQ == this.f45076d) {
            return this;
        }
        int i3 = this.f45080h;
        if (i2 <= i3) {
            return this.f45077e.mo17790k(i, i2);
        }
        if (i >= i3) {
            return this.f45078f.mo17790k(i - i3, i2 - i3);
        }
        nwr nwrVar = this.f45077e;
        return new nzl(nwrVar.mo17790k(i, nwrVar.mo17783d()), this.f45078f.mo17790k(0, i2 - this.f45080h));
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: l */
    public final nww mo17791l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        nzk nzkVar = new nzk(this);
        while (nzkVar.hasNext()) {
            arrayList.add(nzkVar.next().mo17793n());
        }
        int i = nww.f44875d;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new nwt(arrayList, iRemaining) : nww.m17876I(new nyc(arrayList));
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: m */
    protected final String mo17792m(Charset charset) {
        return new String(m17804A(), charset);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: n */
    public final ByteBuffer mo17793n() {
        throw null;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: o */
    public final void mo17794o(nwk nwkVar) {
        this.f45077e.mo17794o(nwkVar);
        this.f45078f.mo17794o(nwkVar);
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: p */
    public final boolean mo17795p() {
        int iMo17789j = this.f45077e.mo17789j(0, 0, this.f45080h);
        nwr nwrVar = this.f45078f;
        return nwrVar.mo17789j(iMo17789j, 0, nwrVar.mo17783d()) == 0;
    }

    @Override // p000.nwr
    /* JADX INFO: renamed from: r */
    public final nwo iterator() {
        return new nzj(this);
    }

    Object writeReplace() {
        return nwr.m17802x(m17804A());
    }
}
