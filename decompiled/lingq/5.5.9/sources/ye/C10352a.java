package ye;

import java.io.OutputStream;

/* JADX INFO: renamed from: ye.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10352a extends OutputStream {

    /* JADX INFO: renamed from: a */
    public long f52060a = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f52060a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f52060a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f52060a += (long) i11;
    }
}
