package p124fp;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: fp.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C5614k implements InterfaceC5627x {

    /* JADX INFO: renamed from: a */
    public byte f34440a;

    /* JADX INFO: renamed from: b */
    public final C5622s f34441b;

    /* JADX INFO: renamed from: c */
    public final Inflater f34442c;

    /* JADX INFO: renamed from: d */
    public final C5615l f34443d;

    /* JADX INFO: renamed from: e */
    public final CRC32 f34444e;

    public C5614k(InterfaceC5627x interfaceC5627x) {
        C5207g.m11111f(interfaceC5627x, "source");
        C5622s c5622s = new C5622s(interfaceC5627x);
        this.f34441b = c5622s;
        Inflater inflater = new Inflater(true);
        this.f34442c = inflater;
        this.f34443d = new C5615l(c5622s, inflater);
        this.f34444e = new CRC32();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m11987a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(C0166e.m770q(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11988b(C5608e c5608e, long j10, long j11) {
        C5623t c5623t = c5608e.f34434a;
        C5207g.m11108c(c5623t);
        while (true) {
            int i10 = c5623t.f34465c;
            int i11 = c5623t.f34464b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            c5623t = c5623t.f34468f;
            C5207g.m11108c(c5623t);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) c5623t.f34464b) + j10);
            int iMin = (int) Math.min(c5623t.f34465c - i12, j11);
            this.f34444e.update(c5623t.f34463a, i12, iMin);
            j11 -= (long) iMin;
            c5623t = c5623t.f34468f;
            C5207g.m11108c(c5623t);
            j10 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34443d.close();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return this.f34441b.mo11923g();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
        C5622s c5622s;
        long j11;
        C5207g.m11111f(c5608e, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        byte b10 = this.f34440a;
        CRC32 crc32 = this.f34444e;
        C5622s c5622s2 = this.f34441b;
        if (b10 == 0) {
            c5622s2.mo11960o1(10L);
            C5608e c5608e2 = c5622s2.f34460b;
            byte bM11930G = c5608e2.m11930G(3L);
            boolean z10 = ((bM11930G >> 1) & 1) == 1;
            if (z10) {
                m11988b(c5622s2.f34460b, 0L, 10L);
            }
            m11987a("ID1ID2", 8075, c5622s2.readShort());
            c5622s2.skip(8L);
            if (((bM11930G >> 2) & 1) == 1) {
                c5622s2.mo11960o1(2L);
                if (z10) {
                    m11988b(c5622s2.f34460b, 0L, 2L);
                }
                int i10 = c5608e2.readShort() & 65535;
                long j12 = (short) (((i10 & 255) << 8) | ((i10 & 65280) >>> 8));
                c5622s2.mo11960o1(j12);
                if (z10) {
                    m11988b(c5622s2.f34460b, 0L, j12);
                    j11 = j12;
                } else {
                    j11 = j12;
                }
                c5622s2.skip(j11);
            }
            if (((bM11930G >> 3) & 1) == 1) {
                c5622s = c5622s2;
                long jM11999a = c5622s2.m11999a((byte) 0, 0L, Long.MAX_VALUE);
                if (jM11999a == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    m11988b(c5622s.f34460b, 0L, jM11999a + 1);
                }
                c5622s.skip(jM11999a + 1);
            } else {
                c5622s = c5622s2;
            }
            if (((bM11930G >> 4) & 1) == 1) {
                long jM11999a2 = c5622s.m11999a((byte) 0, 0L, Long.MAX_VALUE);
                if (jM11999a2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    m11988b(c5622s.f34460b, 0L, jM11999a2 + 1);
                }
                c5622s.skip(jM11999a2 + 1);
            }
            if (z10) {
                c5622s.mo11960o1(2L);
                int i11 = c5608e2.readShort() & 65535;
                m11987a("FHCRC", (short) (((i11 & 255) << 8) | ((i11 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f34440a = (byte) 1;
        } else {
            c5622s = c5622s2;
        }
        if (this.f34440a == 1) {
            long j13 = c5608e.f34435b;
            long jMo11924j0 = this.f34443d.mo11924j0(c5608e, j10);
            if (jMo11924j0 != -1) {
                m11988b(c5608e, j13, jMo11924j0);
                return jMo11924j0;
            }
            this.f34440a = (byte) 2;
        }
        if (this.f34440a != 2) {
            return -1L;
        }
        m11987a("CRC", c5622s.m12001l(), (int) crc32.getValue());
        m11987a("ISIZE", c5622s.m12001l(), (int) this.f34442c.getBytesWritten());
        this.f34440a = (byte) 3;
        if (c5622s.mo11936L()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
