package p027b6;

import com.bumptech.glide.load.data.InterfaceC2098e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: b6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1321a implements InterfaceC2098e<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f8074a;

    /* JADX INFO: renamed from: b6.a$a */
    public static class a implements InterfaceC2098e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: a */
        public final Class<ByteBuffer> mo4885a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC2098e<ByteBuffer> mo4886b(ByteBuffer byteBuffer) {
            return new C1321a(byteBuffer);
        }
    }

    public C1321a(ByteBuffer byteBuffer) {
        this.f8074a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2098e
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo4883a() throws IOException {
        ByteBuffer byteBuffer = this.f8074a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2098e
    /* JADX INFO: renamed from: b */
    public final void mo4884b() {
    }
}
