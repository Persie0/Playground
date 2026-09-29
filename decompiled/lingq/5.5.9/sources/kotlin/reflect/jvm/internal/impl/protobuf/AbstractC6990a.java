package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6990a implements InterfaceC6997h {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a */
    public static abstract class a<BuilderType extends a> implements InterfaceC6997h.a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C10647a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f39507a;

            public C10647a(int i10, ByteArrayInputStream byteArrayInputStream) {
                super(byteArrayInputStream);
                this.f39507a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.f39507a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f39507a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f39507a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f39507a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f39507a -= i13;
                }
                return i13;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f39507a));
                if (jSkip >= 0) {
                    this.f39507a = (int) (((long) this.f39507a) - jSkip);
                }
                return jSkip;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo13788Q(C6992c c6992c, C6993d c6993d) throws IOException;
    }
}
