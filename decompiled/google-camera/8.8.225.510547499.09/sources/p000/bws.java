package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bws implements bwr {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4664a;

    /* JADX INFO: renamed from: b */
    private final Object f4665b;

    public bws(InputStream inputStream, int i) {
        this.f4664a = i;
        this.f4665b = inputStream;
    }

    public bws(ByteBuffer byteBuffer, int i) {
        this.f4664a = i;
        this.f4665b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // p000.bwr
    /* JADX INFO: renamed from: a */
    public final int mo3133a() {
        switch (this.f4664a) {
            case 0:
                break;
        }
        return (mo3136d() << 8) | mo3136d();
    }

    @Override // p000.bwr
    /* JADX INFO: renamed from: c */
    public final long mo3135c(long j) throws IOException {
        switch (this.f4664a) {
            case 0:
                if (j < 0) {
                    return 0L;
                }
                long j2 = j;
                while (j2 > 0) {
                    long jSkip = ((InputStream) this.f4665b).skip(j2);
                    if (jSkip > 0) {
                        j2 -= jSkip;
                    } else {
                        if (((InputStream) this.f4665b).read() == -1) {
                            return j - j2;
                        }
                        j2--;
                    }
                }
                return j - j2;
            default:
                int iMin = (int) Math.min(((ByteBuffer) this.f4665b).remaining(), j);
                ByteBuffer byteBuffer = (ByteBuffer) this.f4665b;
                byteBuffer.position(byteBuffer.position() + iMin);
                return iMin;
        }
    }

    @Override // p000.bwr
    /* JADX INFO: renamed from: b */
    public final int mo3134b(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        switch (this.f4664a) {
            case 0:
                int i3 = 0;
                while (i2 < i) {
                    i3 = ((InputStream) this.f4665b).read(bArr, i2, i - i2);
                    if (i3 == -1) {
                        if (i2 == 0 || i3 != -1) {
                            return i2;
                        }
                        throw new bwq();
                    }
                    i2 += i3;
                }
                if (i2 == 0) {
                }
                return i2;
            default:
                int iMin = Math.min(i, ((ByteBuffer) this.f4665b).remaining());
                if (iMin == 0) {
                    return -1;
                }
                ((ByteBuffer) this.f4665b).get(bArr, 0, iMin);
                return iMin;
        }
    }

    @Override // p000.bwr
    /* JADX INFO: renamed from: d */
    public final short mo3136d() throws IOException {
        switch (this.f4664a) {
            case 0:
                int i = ((InputStream) this.f4665b).read();
                if (i != -1) {
                    return (short) i;
                }
                throw new bwq();
            default:
                if (((ByteBuffer) this.f4665b).remaining() > 0) {
                    return (short) (((ByteBuffer) this.f4665b).get() & 255);
                }
                throw new bwq();
        }
    }
}
