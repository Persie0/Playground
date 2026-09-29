package p474x5;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p236l6.C7283d;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10077b<Data> implements InterfaceC10090o<byte[], Data> {

    /* JADX INFO: renamed from: a */
    public final b<Data> f51132a;

    /* JADX INFO: renamed from: x5.b$a */
    public static class a implements InterfaceC10091p<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: x5.b$a$a, reason: collision with other inner class name */
        public class C10682a implements b<ByteBuffer> {
            @Override // p474x5.C10077b.b
            /* JADX INFO: renamed from: a */
            public final Class<ByteBuffer> mo18923a() {
                return ByteBuffer.class;
            }

            @Override // p474x5.C10077b.b
            /* JADX INFO: renamed from: b */
            public final ByteBuffer mo18924b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<byte[], ByteBuffer> mo18922c(C10094s c10094s) {
            return new C10077b(new C10682a());
        }
    }

    /* JADX INFO: renamed from: x5.b$b */
    public interface b<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo18923a();

        /* JADX INFO: renamed from: b */
        Data mo18924b(byte[] bArr);
    }

    /* JADX INFO: renamed from: x5.b$c */
    public static class c<Data> implements InterfaceC2097d<Data> {

        /* JADX INFO: renamed from: a */
        public final byte[] f51133a;

        /* JADX INFO: renamed from: b */
        public final b<Data> f51134b;

        public c(byte[] bArr, b<Data> bVar) {
            this.f51133a = bArr;
            this.f51134b = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<Data> mo6269a() {
            return this.f51134b.mo18923a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: d */
        public final DataSource mo6274d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super Data> aVar) {
            aVar.mo6278f(this.f51134b.mo18924b(this.f51133a));
        }
    }

    /* JADX INFO: renamed from: x5.b$d */
    public static class d implements InterfaceC10091p<byte[], InputStream> {

        /* JADX INFO: renamed from: x5.b$d$a */
        public class a implements b<InputStream> {
            @Override // p474x5.C10077b.b
            /* JADX INFO: renamed from: a */
            public final Class<InputStream> mo18923a() {
                return InputStream.class;
            }

            @Override // p474x5.C10077b.b
            /* JADX INFO: renamed from: b */
            public final InputStream mo18924b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<byte[], InputStream> mo18922c(C10094s c10094s) {
            return new C10077b(new a());
        }
    }

    public C10077b(b<Data> bVar) {
        this.f51132a = bVar;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(byte[] bArr) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(byte[] bArr, int i10, int i11, C8735e c8735e) {
        byte[] bArr2 = bArr;
        return new InterfaceC10090o.a(new C7283d(bArr2), new c(bArr2, this.f51132a));
    }
}
