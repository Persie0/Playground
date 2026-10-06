package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bpw extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bpx f4124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpw(bpx bpxVar, int i) {
        super(i);
        this.f4124a = bpxVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, this.f4124a.f4125a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
