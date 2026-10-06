package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqi implements bqm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f4185a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4186b;

    public bqi(InputStream inputStream, int i) {
        this.f4186b = i;
        this.f4185a = inputStream;
    }

    public bqi(ByteBuffer byteBuffer, int i) {
        this.f4186b = i;
        this.f4185a = byteBuffer;
    }

    @Override // p000.bqm
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo2920a(bqh bqhVar) throws IOException {
        switch (this.f4186b) {
            case 0:
                try {
                    return bqhVar.mo2919d((ByteBuffer) this.f4185a);
                } finally {
                    cav.m3364c((ByteBuffer) this.f4185a);
                }
            default:
                try {
                    return bqhVar.mo2918c((InputStream) this.f4185a);
                } finally {
                    ((InputStream) this.f4185a).reset();
                }
        }
    }
}
