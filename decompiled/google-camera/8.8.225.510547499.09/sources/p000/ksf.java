package p000;

import com.google.common.p019io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksf implements ksg {

    /* JADX INFO: renamed from: a */
    private final InputStream f37113a;

    public ksf(InputStream inputStream) {
        this.f37113a = inputStream;
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: a */
    public final int mo14791a() {
        return this.f37113a.read();
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: b */
    public final void mo14792b(int i) throws IOException {
        ByteStreams.skipFully(this.f37113a, i);
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: c */
    public final mom mo14793c(int i, int i2) {
        byte[] bArr = new byte[i];
        return new mom(bArr, i2, 0, ByteStreams.read(this.f37113a, bArr, 0, i));
    }

    @Override // p000.ksg
    /* JADX INFO: renamed from: d */
    public final mom mo14794d() {
        byte[] byteArray = ByteStreams.toByteArray(this.f37113a);
        return new mom(byteArray, 218, 0, byteArray.length);
    }
}
