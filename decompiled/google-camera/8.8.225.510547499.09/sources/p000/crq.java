package p000;

import java.io.OutputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crq extends PipedInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    private final crx f9159a;

    /* JADX INFO: renamed from: b */
    private final nax f9160b;

    public crq(int i, int i2) {
        super(i2);
        this.f9159a = new crx(i, i2);
        this.f9160b = new nax();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized khb m5424a(ByteBuffer byteBuffer, int i) {
        nax naxVar = this.f9160b;
        Object obj = naxVar.f41919a;
        if (obj == null) {
            naxVar.f41919a = new byte[i];
        } else if (((byte[]) obj).length != i) {
            naxVar.f41919a = new byte[i];
        }
        Object obj2 = naxVar.f41919a;
        int i2 = read((byte[]) obj2, 0, ((byte[]) obj2).length);
        if (i2 <= 0) {
            return null;
        }
        long jM5443a = this.f9159a.m5443a(i2);
        byteBuffer.put((byte[]) obj2, 0, i2);
        return new khb(lej.m15248a(byteBuffer, i2, jM5443a));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5425b(khb khbVar) {
        byte[] bArrArray = khbVar.m14238c().array();
        int iM14236a = khbVar.m14236a();
        int i = 0;
        while (iM14236a > 0) {
            int i2 = i + 1;
            receive(bArrArray[i]);
            notifyAll();
            int i3 = iM14236a - 1;
            if (this.in > this.out) {
                int iMin = Math.min(i3, this.buffer.length - this.in);
                System.arraycopy(bArrArray, i2, this.buffer, this.in, iMin);
                this.in += iMin;
                i2 += iMin;
                i3 -= iMin;
                if (this.in == this.buffer.length) {
                    this.in = 0;
                }
                if (i3 == 0) {
                    break;
                }
            }
            int iMin2 = Math.min(i3, this.out - this.in);
            System.arraycopy(bArrArray, i2, this.buffer, this.in, iMin2);
            this.in += iMin2;
            iM14236a = i3 - iMin2;
            i = i2 + iMin2;
        }
        this.f9159a.m5444b(khbVar.m14237b(), khbVar.m14236a());
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
