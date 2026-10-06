package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwj implements bqu {

    /* JADX INFO: renamed from: a */
    public static final bqq f4655a = bqq.m2926c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: b */
    public static final bqq f4656b = bqq.m2925b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: c */
    private final btg f4657c;

    @Deprecated
    public bwj() {
        this.f4657c = null;
    }

    public bwj(btg btgVar) {
        this.f4657c = btgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    @Override // p000.bqf
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2915a(Object obj, File file, bqr bqrVar) {
        boolean z = (Bitmap) ((bsz) obj).mo3016c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) bqrVar.m2927b(f4656b);
        if (compressFormat == null) {
            compressFormat = z.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        z.getWidth();
        z.getHeight();
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) bqrVar.m2927b(f4655a)).intValue();
        OutputStream bqyVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bqyVar = new bqy(fileOutputStream, this.f4657c);
                    try {
                        z.compress(compressFormat, iIntValue, bqyVar);
                        bqyVar.close();
                        z = 1;
                        bqyVar.close();
                    } catch (IOException e) {
                        z = 0;
                        z = 0;
                        if (bqyVar != null) {
                            bqyVar.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        if (bqyVar != null) {
                            try {
                                bqyVar.close();
                            } catch (IOException e2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    bqyVar = fileOutputStream;
                } catch (Throwable th2) {
                    th = th2;
                    bqyVar = fileOutputStream;
                }
            } catch (IOException e4) {
            }
        } catch (IOException e5) {
        } catch (Throwable th3) {
            th = th3;
        }
        return z;
    }

    @Override // p000.bqu
    /* JADX INFO: renamed from: b */
    public final int mo2932b() {
        return 2;
    }
}
