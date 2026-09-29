package p007a6;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.C2096c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p258m6.C7488h;
import p258m6.C7492l;
import p356r5.C8734d;
import p356r5.C8735e;
import p356r5.InterfaceC8737g;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: a6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0023b implements InterfaceC8737g<Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final C8734d<Integer> f18b = C8734d.m16962a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c */
    public static final C8734d<Bitmap.CompressFormat> f19c = new C8734d<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C8734d.f46326e);

    /* JADX INFO: renamed from: a */
    public final InterfaceC9451b f20a;

    public C0023b(InterfaceC9451b interfaceC9451b) {
        this.f20a = interfaceC9451b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p356r5.InterfaceC8731a
    /* JADX INFO: renamed from: e */
    public final boolean mo70e(Object obj, File file, C8735e c8735e) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z10;
        Bitmap bitmap = (Bitmap) ((InterfaceC9207m) obj).get();
        C8734d<Bitmap.CompressFormat> c8734d = f19c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c8735e.m16963c(c8734d);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i10 = C7488h.f41373b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c8735e.m16963c(f18b)).intValue();
        OutputStream c2096c = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    InterfaceC9451b interfaceC9451b = this.f20a;
                    if (interfaceC9451b != null) {
                        try {
                            c2096c = new C2096c(fileOutputStream, interfaceC9451b);
                        } catch (IOException e10) {
                            e = e10;
                            c2096c = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (c2096c != null) {
                                try {
                                    c2096c.close();
                                } catch (IOException unused) {
                                }
                            }
                            z10 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } else {
                        c2096c = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, c2096c);
                    c2096c.close();
                    try {
                        c2096c.close();
                    } catch (IOException unused3) {
                    }
                    z10 = true;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (IOException e11) {
                e = e11;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + C7492l.m14882c(bitmap) + " in " + C7488h.m14872a(jElapsedRealtimeNanos) + ", options format: " + c8735e.m16963c(c8734d) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z10;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // p356r5.InterfaceC8737g
    /* JADX INFO: renamed from: g */
    public final EncodeStrategy mo71g(C8735e c8735e) {
        return EncodeStrategy.TRANSFORMED;
    }
}
