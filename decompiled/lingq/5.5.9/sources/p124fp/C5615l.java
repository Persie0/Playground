package p124fp;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: fp.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C5615l implements InterfaceC5627x {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5610g f34445a;

    /* JADX INFO: renamed from: b */
    public final Inflater f34446b;

    /* JADX INFO: renamed from: c */
    public int f34447c;

    /* JADX INFO: renamed from: d */
    public boolean f34448d;

    public C5615l(C5622s c5622s, Inflater inflater) {
        this.f34445a = c5622s;
        this.f34446b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f34448d) {
            return;
        }
        this.f34446b.end();
        this.f34448d = true;
        this.f34445a.close();
    }

    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: g */
    public final C5628y mo11923g() {
        return this.f34445a.mo11923g();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p124fp.InterfaceC5627x
    /* JADX INFO: renamed from: j0 */
    public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
        InterfaceC5610g interfaceC5610g;
        long j11;
        C5207g.m11111f(c5608e, "sink");
        do {
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(C0166e.m763i("byteCount < 0: ", j10).toString());
            }
            if (!(!this.f34448d)) {
                throw new IllegalStateException("closed".toString());
            }
            interfaceC5610g = this.f34445a;
            Inflater inflater = this.f34446b;
            if (j10 != 0) {
                try {
                    C5623t c5623tM11947W0 = c5608e.m11947W0(1);
                    int iMin = (int) Math.min(j10, 8192 - c5623tM11947W0.f34465c);
                    if (inflater.needsInput() && !interfaceC5610g.mo11936L()) {
                        C5623t c5623t = interfaceC5610g.mo11956f().f34434a;
                        C5207g.m11108c(c5623t);
                        int i10 = c5623t.f34465c;
                        int i11 = c5623t.f34464b;
                        int i12 = i10 - i11;
                        this.f34447c = i12;
                        inflater.setInput(c5623t.f34463a, i11, i12);
                    }
                    int iInflate = inflater.inflate(c5623tM11947W0.f34463a, c5623tM11947W0.f34465c, iMin);
                    int i13 = this.f34447c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f34447c -= remaining;
                        interfaceC5610g.skip(remaining);
                    }
                    if (iInflate > 0) {
                        c5623tM11947W0.f34465c += iInflate;
                        j11 = iInflate;
                        c5608e.f34435b += j11;
                    } else if (c5623tM11947W0.f34464b == c5623tM11947W0.f34465c) {
                        c5608e.f34434a = c5623tM11947W0.m12002a();
                        C5624u.m12006a(c5623tM11947W0);
                    }
                    if (j11 > 0) {
                        return j11;
                    }
                    if (inflater.finished() && !inflater.needsDictionary()) {
                    }
                    return -1L;
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            j11 = 0;
            if (j11 > 0) {
                return j11;
            }
            if (inflater.finished()) {
                return -1L;
            }
        } while (!interfaceC5610g.mo11936L());
        throw new EOFException("source exhausted prematurely");
    }
}
