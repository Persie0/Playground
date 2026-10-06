package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsg {

    /* JADX INFO: renamed from: a */
    private OutputStream f39132a;

    /* JADX INFO: renamed from: b */
    private lsn f39133b;

    /* JADX INFO: renamed from: a */
    public final void m15946a(List list) {
        OutputStream outputStream = (OutputStream) mkv.m16515W(list);
        if (outputStream instanceof lsn) {
            this.f39133b = (lsn) outputStream;
            this.f39132a = (OutputStream) list.get(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15947b() throws IOException {
        if (this.f39133b == null) {
            throw new lsl("Cannot sync underlying stream");
        }
        this.f39132a.flush();
        this.f39133b.f39137a.getFD().sync();
    }
}
