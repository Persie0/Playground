package cc;

import java.io.IOException;
import java.util.Map;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.n3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1887n3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1878m3 f10026a;

    /* JADX INFO: renamed from: b */
    public final int f10027b;

    /* JADX INFO: renamed from: c */
    public final Throwable f10028c;

    /* JADX INFO: renamed from: d */
    public final byte[] f10029d;

    /* JADX INFO: renamed from: e */
    public final String f10030e;

    /* JADX INFO: renamed from: f */
    public final Map f10031f;

    public /* synthetic */ RunnableC1887n3(String str, InterfaceC1878m3 interfaceC1878m3, int i10, IOException iOException, byte[] bArr, Map map) {
        C6272i.m12915i(interfaceC1878m3);
        this.f10026a = interfaceC1878m3;
        this.f10027b = i10;
        this.f10028c = iOException;
        this.f10029d = bArr;
        this.f10030e = str;
        this.f10031f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10026a.mo5573b(this.f10030e, this.f10027b, this.f10028c, this.f10029d, this.f10031f);
    }
}
