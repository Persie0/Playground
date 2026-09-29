package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tfd extends xhd {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62239a;

    public tfd(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f62239a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static tfd m22027a(OutputStream outputStream, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new tfd(outputStream, arrayList2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f62239a.iterator();
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

    @Override // p000.xhd, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f62239a.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ho2.m13383c();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.f62239a.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }

    @Override // p000.xhd, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.f62239a.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }
}
