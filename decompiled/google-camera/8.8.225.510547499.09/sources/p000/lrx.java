package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lrx extends lso {

    /* JADX INFO: renamed from: a */
    private final List f39108a;

    public lrx(InputStream inputStream, List list) {
        super(inputStream);
        this.f39108a = list;
        lij.m15448r(true, "Input was null", new Object[0]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f39108a.iterator();
        while (it.hasNext()) {
            ((lsz) it.next()).close();
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        if (i != -1) {
            Iterator it = this.f39108a.iterator();
            while (it.hasNext()) {
                ((lsz) it.next()).m15951a();
            }
        }
        return i;
    }

    @Override // p000.lso, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.in.read(bArr);
        if (i != -1) {
            Iterator it = this.f39108a.iterator();
            while (it.hasNext()) {
                ((lsz) it.next()).m15951a();
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.f39108a.iterator();
            while (it.hasNext()) {
                ((lsz) it.next()).m15951a();
            }
        }
        return i3;
    }
}
