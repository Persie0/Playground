package p000;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlp {

    /* JADX INFO: renamed from: a */
    public static final nbh f28272a = nbh.m17259h("com/google/android/apps/camera/storage/ProcessingMediaThumbnailCache");

    /* JADX INFO: renamed from: b */
    public final LruCache f28273b = new hlo();

    /* JADX INFO: renamed from: a */
    public final Bitmap m10449a(gyu gyuVar) {
        lqq lqqVar = (lqq) this.f28273b.get(gyuVar);
        if (lqqVar != null) {
            return (Bitmap) lqqVar.f39002b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m10450b(gyu gyuVar) {
        lqq lqqVar = (lqq) this.f28273b.get(gyuVar);
        if (lqqVar != null) {
            return Integer.valueOf(lqqVar.f39001a);
        }
        return null;
    }
}
