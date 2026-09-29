package p000;

import java.io.FilterInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class uhd extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return ((FilterInputStream) this).in.read(bArr);
    }
}
