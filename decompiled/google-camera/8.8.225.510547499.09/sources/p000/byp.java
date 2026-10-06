package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byp implements bqt {

    /* JADX INFO: renamed from: a */
    private final List f4777a;

    /* JADX INFO: renamed from: b */
    private final bqt f4778b;

    /* JADX INFO: renamed from: c */
    private final btg f4779c;

    public byp(List list, bqt bqtVar, btg btgVar) {
        this.f4777a = list;
        this.f4778b = bqtVar;
        this.f4779c = btgVar;
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f4778b.mo2930a(ByteBuffer.wrap(byteArray), i, i2, bqrVar);
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2931b(Object obj, bqr bqrVar) {
        return !((Boolean) bqrVar.m2927b(byo.f4776b)).booleanValue() && bzq.m3229B(this.f4777a, (InputStream) obj, this.f4779c) == ImageHeaderParser$ImageType.GIF;
    }
}
