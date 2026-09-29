package p087e6;

import android.util.Log;
import com.bumptech.glide.load.C2092a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: e6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5380i implements InterfaceC8736f<InputStream, C5374c> {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f33794a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8736f<ByteBuffer, C5374c> f33795b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9451b f33796c;

    public C5380i(List list, C5372a c5372a, InterfaceC9451b interfaceC9451b) {
        this.f33794a = list;
        this.f33795b = c5372a;
        this.f33796c = interfaceC9451b;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<C5374c> mo68a(InputStream inputStream, int i10, int i11, C8735e c8735e) throws IOException {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i12 = inputStream2.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f33795b.mo68a(ByteBuffer.wrap(byteArray), i10, i11, c8735e);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(InputStream inputStream, C8735e c8735e) throws IOException {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) c8735e.m16963c(C5379h.f33793b)).booleanValue()) {
            if (C2092a.m6267c(this.f33796c, inputStream2, this.f33794a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
