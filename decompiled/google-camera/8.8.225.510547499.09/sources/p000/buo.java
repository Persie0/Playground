package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class buo implements bum {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4495a;

    public buo(int i) {
        this.f4495a = i;
    }

    @Override // p000.bum
    /* JADX INFO: renamed from: a */
    public final Class mo3081a() {
        switch (this.f4495a) {
            case 0:
                return InputStream.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // p000.bum
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo3082b(byte[] bArr) {
        switch (this.f4495a) {
            case 0:
                return new ByteArrayInputStream(bArr);
            default:
                return ByteBuffer.wrap(bArr);
        }
    }
}
