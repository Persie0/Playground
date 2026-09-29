package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class p2d extends InputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55503a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55504b;

    public p2d(i72 i72Var) {
        this.f55504b = i72Var;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f55503a;
        Object obj = this.f55504b;
        switch (i3) {
            case 0:
                i72 i72Var = (i72) obj;
                try {
                    int iInflate = ((Inflater) i72Var.f43617b).inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (((Inflater) i72Var.f43617b).getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = ((Inflater) i72Var.f43617b).getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((ghb) obj).mo5378f(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f55503a) {
            case 1:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((ghb) this.f55504b).mo5379g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public p2d(i72 i72Var, ghb ghbVar) {
        this.f55504b = ghbVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f55503a) {
            case 0:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((ghb) this.f55504b).mo5378f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
