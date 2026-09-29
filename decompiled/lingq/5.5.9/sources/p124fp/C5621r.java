package p124fp;

import dm.C5207g;
import java.io.IOException;
import java.nio.ByteBuffer;
import okio.ByteString;

/* JADX INFO: renamed from: fp.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C5621r implements InterfaceC5609f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5625v f34456a;

    /* JADX INFO: renamed from: b */
    public final C5608e f34457b;

    /* JADX INFO: renamed from: c */
    public boolean f34458c;

    public C5621r(InterfaceC5625v interfaceC5625v) {
        C5207g.m11111f(interfaceC5625v, "sink");
        this.f34456a = interfaceC5625v;
        this.f34457b = new C5608e();
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: D */
    public final InterfaceC5609f mo11927D(int i10) throws IOException {
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11963q1(i10);
        mo11944S();
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: M */
    public final InterfaceC5609f mo11937M(int i10) throws IOException {
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11954d1(i10);
        mo11944S();
        return this;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: O0 */
    public final long mo11940O0(InterfaceC5627x interfaceC5627x) throws IOException {
        long j10 = 0;
        while (true) {
            long jMo11924j0 = ((C5616m) interfaceC5627x).mo11924j0(this.f34457b, 8192L);
            if (jMo11924j0 == -1) {
                return j10;
            }
            j10 += jMo11924j0;
            mo11944S();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: S */
    public final InterfaceC5609f mo11944S() throws IOException {
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        C5608e c5608e = this.f34457b;
        long jM11972w = c5608e.m11972w();
        if (jM11972w > 0) {
            this.f34456a.mo11922k1(c5608e, jM11972w);
        }
        return this;
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: U0 */
    public final InterfaceC5609f mo11945U0(byte[] bArr) throws IOException {
        C5207g.m11111f(bArr, "source");
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        C5608e c5608e = this.f34457b;
        c5608e.getClass();
        c5608e.m11952c1(bArr, 0, bArr.length);
        mo11944S();
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC5609f mo11950Z0(ByteString byteString) throws IOException {
        C5207g.m11111f(byteString, "byteString");
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11949X0(byteString);
        mo11944S();
        return this;
    }

    @Override // p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC5625v interfaceC5625v = this.f34456a;
        if (this.f34458c) {
            return;
        }
        C5608e c5608e = this.f34457b;
        long j10 = c5608e.f34435b;
        if (j10 > 0) {
            interfaceC5625v.mo11922k1(c5608e, j10);
        }
        th = null;
        try {
            interfaceC5625v.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f34458c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: f */
    public final C5608e mo11956f() {
        return this.f34457b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f, p124fp.InterfaceC5625v, java.io.Flushable
    public final void flush() throws IOException {
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        C5608e c5608e = this.f34457b;
        long j10 = c5608e.f34435b;
        InterfaceC5625v interfaceC5625v = this.f34456a;
        if (j10 > 0) {
            interfaceC5625v.mo11922k1(c5608e, j10);
        }
        interfaceC5625v.flush();
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: g */
    public final C5628y mo11921g() {
        return this.f34456a.mo11921g();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f34458c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC5609f mo11957k0(String str) throws IOException {
        C5207g.m11111f(str, "string");
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11969t1(str);
        mo11944S();
        return this;
    }

    @Override // p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: k1 */
    public final void mo11922k1(C5608e c5608e, long j10) throws IOException {
        C5207g.m11111f(c5608e, "source");
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.mo11922k1(c5608e, j10);
        mo11944S();
    }

    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: s1 */
    public final InterfaceC5609f mo11967s1(long j10) throws IOException {
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11958l1(j10);
        mo11944S();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f34456a + ')';
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: v */
    public final InterfaceC5609f mo11970v(int i10) throws IOException {
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11965r1(i10);
        mo11944S();
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC5609f mo11971v0(byte[] bArr, int i10, int i11) throws IOException {
        C5207g.m11111f(bArr, "source");
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11952c1(bArr, i10, i11);
        mo11944S();
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        C5207g.m11111f(byteBuffer, "source");
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f34457b.write(byteBuffer);
        mo11944S();
        return iWrite;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC5609f mo11974x0(String str, int i10, int i11) throws IOException {
        C5207g.m11111f(str, "string");
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11977y1(str, i10, i11);
        mo11944S();
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.InterfaceC5609f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC5609f mo11978z0(long j10) throws IOException {
        if (!(!this.f34458c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f34457b.m11961p1(j10);
        mo11944S();
        return this;
    }
}
