package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lry extends lsp {

    /* JADX INFO: renamed from: a */
    private final List f39109a;

    public lry(OutputStream outputStream, List list) {
        super(outputStream);
        this.f39109a = list;
        lij.m15448r(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f39109a.iterator();
        while (it.hasNext()) {
            ((lta) it.next()).close();
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        Iterator it = this.f39109a.iterator();
        while (it.hasNext()) {
            ((lta) it.next()).m15955a();
        }
    }

    @Override // p000.lsp, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        for (lta ltaVar : this.f39109a) {
            int length = bArr.length;
            ltaVar.m15955a();
        }
    }

    @Override // p000.lsp, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.f39109a.iterator();
        while (it.hasNext()) {
            ((lta) it.next()).m15955a();
        }
    }
}
