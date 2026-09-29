package p087e6;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.load.C2092a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import p003a2.C0009a;
import p258m6.C7488h;
import p258m6.C7492l;
import p332q5.C8496c;
import p332q5.C8497d;
import p332q5.C8498e;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9451b;
import p407u5.InterfaceC9452c;
import p525z5.C10444c;

/* JADX INFO: renamed from: e6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5372a implements InterfaceC8736f<ByteBuffer, C5374c> {

    /* JADX INFO: renamed from: f */
    public static final a f33747f = new a();

    /* JADX INFO: renamed from: g */
    public static final b f33748g = new b();

    /* JADX INFO: renamed from: a */
    public final Context f33749a;

    /* JADX INFO: renamed from: b */
    public final List<ImageHeaderParser> f33750b;

    /* JADX INFO: renamed from: c */
    public final b f33751c;

    /* JADX INFO: renamed from: d */
    public final a f33752d;

    /* JADX INFO: renamed from: e */
    public final C5373b f33753e;

    /* JADX INFO: renamed from: e6.a$a */
    public static class a {
    }

    /* JADX INFO: renamed from: e6.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque f33754a;

        public b() {
            char[] cArr = C7492l.f41383a;
            this.f33754a = new ArrayDeque(0);
        }
    }

    public C5372a(Context context, List<ImageHeaderParser> list, InterfaceC9452c interfaceC9452c, InterfaceC9451b interfaceC9451b) {
        a aVar = f33747f;
        this.f33749a = context.getApplicationContext();
        this.f33750b = list;
        this.f33752d = aVar;
        this.f33753e = new C5373b(interfaceC9452c, interfaceC9451b);
        this.f33751c = f33748g;
    }

    /* JADX INFO: renamed from: d */
    public static int m11544d(C8496c c8496c, int i10, int i11) {
        int iMin = Math.min(c8496c.f45710g / i11, c8496c.f45706c / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM25n = C0009a.m25n("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i10, "x");
            sbM25n.append(i11);
            sbM25n.append("], actual dimens: [");
            sbM25n.append(c8496c.f45706c);
            sbM25n.append("x");
            sbM25n.append(c8496c.f45710g);
            sbM25n.append("]");
            Log.v("BufferGifDecoder", sbM25n.toString());
        }
        return iMax;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<C5374c> mo68a(ByteBuffer byteBuffer, int i10, int i11, C8735e c8735e) throws IOException {
        C8497d c8497d;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f33751c;
        synchronized (bVar) {
            C8497d c8497d2 = (C8497d) bVar.f33754a.poll();
            if (c8497d2 == null) {
                c8497d2 = new C8497d();
            }
            c8497d = c8497d2;
            c8497d.f45717b = null;
            Arrays.fill(c8497d.f45716a, (byte) 0);
            c8497d.f45718c = new C8496c(0);
            c8497d.f45719d = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            c8497d.f45717b = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            c8497d.f45717b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            C5375d c5375dM11545c = m11545c(byteBuffer2, i10, i11, c8497d, c8735e);
            b bVar2 = this.f33751c;
            synchronized (bVar2) {
                try {
                    c8497d.f45717b = null;
                    c8497d.f45718c = null;
                    bVar2.f33754a.offer(c8497d);
                } finally {
                }
            }
            return c5375dM11545c;
        } catch (Throwable th2) {
            b bVar3 = this.f33751c;
            synchronized (bVar3) {
                try {
                    c8497d.f45717b = null;
                    c8497d.f45718c = null;
                    bVar3.f33754a.offer(c8497d);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(ByteBuffer byteBuffer, C8735e c8735e) throws IOException {
        return !((Boolean) c8735e.m16963c(C5379h.f33793b)).booleanValue() && C2092a.m6266b(this.f33750b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX INFO: renamed from: c */
    public final C5375d m11545c(ByteBuffer byteBuffer, int i10, int i11, C8497d c8497d, C8735e c8735e) {
        int i12 = C7488h.f41373b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C8496c c8496cM16589b = c8497d.m16589b();
            if (c8496cM16589b.f45705b > 0 && c8496cM16589b.f45704a == 0) {
                Bitmap.Config config = c8735e.m16963c(C5379h.f33792a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM11544d = m11544d(c8496cM16589b, i10, i11);
                a aVar = this.f33752d;
                C5373b c5373b = this.f33753e;
                aVar.getClass();
                C8498e c8498e = new C8498e(c5373b, c8496cM16589b, byteBuffer, iM11544d);
                c8498e.m16596i(config);
                c8498e.mo16583c();
                Bitmap bitmapMo16582b = c8498e.mo16582b();
                if (bitmapMo16582b == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C7488h.m14872a(jElapsedRealtimeNanos));
                    }
                    return null;
                }
                C5375d c5375d = new C5375d(new C5374c(new C5374c.a(new C5377f(ComponentCallbacks2C2080b.m6235a(this.f33749a), c8498e, i10, i11, C10444c.f52291b, bitmapMo16582b))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C7488h.m14872a(jElapsedRealtimeNanos));
                }
                return c5375d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C7488h.m14872a(jElapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C7488h.m14872a(jElapsedRealtimeNanos));
            }
            throw th2;
        }
    }
}
