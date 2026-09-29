package p007a6;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p258m6.C7481a;
import p287o3.C7913a;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: a6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0037p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser.ImageType mo165a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public final ImageHeaderParser.ImageType mo166b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public final int mo167c(InputStream inputStream, InterfaceC9451b interfaceC9451b) throws Throwable {
        C7913a c7913a = new C7913a(inputStream);
        C7913a.c cVarM15697c = c7913a.m15697c("Orientation");
        int iM15724f = 1;
        if (cVarM15697c != null) {
            try {
                iM15724f = cVarM15697c.m15724f(c7913a.f43119f);
            } catch (NumberFormatException unused) {
            }
        }
        if (iM15724f == 0) {
            return -1;
        }
        return iM15724f;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: d */
    public final int mo168d(ByteBuffer byteBuffer, InterfaceC9451b interfaceC9451b) throws IOException {
        AtomicReference<byte[]> atomicReference = C7481a.f41356a;
        return mo167c(new C7481a.a(byteBuffer), interfaceC9451b);
    }
}
