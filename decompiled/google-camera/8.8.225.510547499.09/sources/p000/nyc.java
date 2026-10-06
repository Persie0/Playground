package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyc extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private Iterator f44995a;

    /* JADX INFO: renamed from: b */
    private ByteBuffer f44996b;

    /* JADX INFO: renamed from: c */
    private int f44997c = 0;

    /* JADX INFO: renamed from: d */
    private int f44998d;

    /* JADX INFO: renamed from: e */
    private int f44999e;

    /* JADX INFO: renamed from: f */
    private boolean f45000f;

    /* JADX INFO: renamed from: g */
    private byte[] f45001g;

    /* JADX INFO: renamed from: h */
    private int f45002h;

    /* JADX INFO: renamed from: i */
    private long f45003i;

    public nyc(Iterable iterable) {
        this.f44995a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f44997c++;
        }
        this.f44998d = -1;
        if (m18170b()) {
            return;
        }
        this.f44996b = nxz.f44987c;
        this.f44998d = 0;
        this.f44999e = 0;
        this.f45003i = 0L;
    }

    /* JADX INFO: renamed from: a */
    private final void m18169a(int i) {
        int i2 = this.f44999e + i;
        this.f44999e = i2;
        if (i2 == this.f44996b.limit()) {
            m18170b();
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m18170b() {
        this.f44998d++;
        if (!this.f44995a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f44995a.next();
        this.f44996b = byteBuffer;
        this.f44999e = byteBuffer.position();
        if (this.f44996b.hasArray()) {
            this.f45000f = true;
            this.f45001g = this.f44996b.array();
            this.f45002h = this.f44996b.arrayOffset();
        } else {
            this.f45000f = false;
            this.f45003i = oag.m18357e(this.f44996b);
            this.f45001g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f44998d == this.f44997c) {
            return -1;
        }
        if (this.f45000f) {
            int i = this.f45001g[this.f44999e + this.f45002h] & 255;
            m18169a(1);
            return i;
        }
        int iM18353a = oag.m18353a(((long) this.f44999e) + this.f45003i) & 255;
        m18169a(1);
        return iM18353a;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f44998d == this.f44997c) {
            return -1;
        }
        int iLimit = this.f44996b.limit();
        int i3 = this.f44999e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f45000f) {
            System.arraycopy(this.f45001g, i3 + this.f45002h, bArr, i, i2);
            m18169a(i2);
        } else {
            int iPosition = this.f44996b.position();
            this.f44996b.get(bArr, i, i2);
            m18169a(i2);
        }
        return i2;
    }
}
