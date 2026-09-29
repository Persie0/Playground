package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pfd extends uhd {

    /* JADX INFO: renamed from: a */
    public final ArrayList f56078a;

    public pfd(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f56078a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static pfd m19120a(InputStream inputStream, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new pfd(inputStream, arrayList2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f56078a.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                ho2.m13383c();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            Iterator it = this.f56078a.iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
        }
        return i;
    }

    @Override // p000.uhd, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = ((FilterInputStream) this).in.read(bArr);
        if (i != -1) {
            Iterator it = this.f56078a.iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.f56078a.iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
        }
        return i3;
    }
}
