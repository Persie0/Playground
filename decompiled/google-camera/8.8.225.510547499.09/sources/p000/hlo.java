package p000;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hlo extends LruCache {
    public hlo() {
        super(20971520);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        gyu gyuVar = (gyu) obj;
        super.entryRemoved(z, gyuVar, (lqq) obj2, (lqq) obj3);
        ((nbe) ((nbe) hlp.f28272a.m17252c()).mo17276G(3727)).mo17270A("Thumbnail holder removed: key=%s evicted=%b", gyuVar, z);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Object obj3 = ((lqq) obj2).f39002b;
        if (obj3 != null) {
            return ((Bitmap) obj3).getAllocationByteCount();
        }
        return 1;
    }
}
