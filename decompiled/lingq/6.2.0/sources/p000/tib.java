package p000;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class tib extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62351a;

    /* JADX INFO: renamed from: b */
    public long f62352b;

    public /* synthetic */ tib(int i) {
        this.f62351a = i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        int length2;
        int i4;
        int length3;
        int i5;
        switch (this.f62351a) {
            case 0:
                if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
                    this.f62352b += (long) i2;
                } else {
                    v63.m23128b();
                }
                break;
            case 1:
                if (i >= 0 && i <= (length2 = bArr.length) && i2 >= 0 && (i4 = i + i2) <= length2 && i4 >= 0) {
                    this.f62352b += (long) i2;
                } else {
                    v63.m23128b();
                }
                break;
            default:
                if (i >= 0 && i <= (length3 = bArr.length) && i2 >= 0 && (i5 = i + i2) <= length3 && i5 >= 0) {
                    this.f62352b += (long) i2;
                } else {
                    v63.m23128b();
                }
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f62351a) {
            case 0:
                this.f62352b += (long) bArr.length;
                break;
            case 1:
                this.f62352b += (long) bArr.length;
                break;
            default:
                this.f62352b += (long) bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f62351a) {
            case 0:
                this.f62352b++;
                break;
            case 1:
                this.f62352b++;
                break;
            default:
                this.f62352b++;
                break;
        }
    }
}
