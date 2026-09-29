package p255m3;

import java.nio.ByteBuffer;
import p338qd.C8573r0;

/* JADX INFO: renamed from: m3.c */
/* JADX INFO: loaded from: classes.dex */
public class C7477c {

    /* JADX INFO: renamed from: a */
    public int f41324a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f41325b;

    /* JADX INFO: renamed from: c */
    public int f41326c;

    /* JADX INFO: renamed from: d */
    public int f41327d;

    public C7477c() {
        if (C8573r0.f45971h == null) {
            C8573r0.f45971h = new C8573r0(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m14859a(int i10) {
        if (i10 < this.f41327d) {
            return this.f41325b.getShort(this.f41326c + i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m14860b(int i10, ByteBuffer byteBuffer) {
        this.f41325b = byteBuffer;
        if (byteBuffer == null) {
            this.f41324a = 0;
            this.f41326c = 0;
            this.f41327d = 0;
        } else {
            this.f41324a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f41326c = i11;
            this.f41327d = this.f41325b.getShort(i11);
        }
    }
}
