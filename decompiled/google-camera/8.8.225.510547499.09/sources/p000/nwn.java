package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nwn extends nwq {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d */
    private final int f44836d;

    /* JADX INFO: renamed from: e */
    private final int f44837e;

    public nwn(byte[] bArr, int i, int i2) {
        super(bArr);
        m17796q(i, i + i2, bArr.length);
        this.f44836d = i;
        this.f44837e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // p000.nwq, p000.nwr
    /* JADX INFO: renamed from: a */
    public final byte mo17780a(int i) {
        m17803z(i, this.f44837e);
        return this.f44838a[this.f44836d + i];
    }

    @Override // p000.nwq, p000.nwr
    /* JADX INFO: renamed from: b */
    public final byte mo17781b(int i) {
        return this.f44838a[this.f44836d + i];
    }

    @Override // p000.nwq
    /* JADX INFO: renamed from: c */
    protected final int mo17782c() {
        return this.f44836d;
    }

    @Override // p000.nwq, p000.nwr
    /* JADX INFO: renamed from: d */
    public final int mo17783d() {
        return this.f44837e;
    }

    @Override // p000.nwq, p000.nwr
    /* JADX INFO: renamed from: e */
    protected final void mo17784e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f44838a, this.f44836d + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return nwr.m17802x(m17804A());
    }
}
