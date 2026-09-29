package p066d7;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.clevertap.android.sdk.C2181a;

/* JADX INFO: renamed from: d7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5051c extends LruCache<String, Bitmap> {
    public C5051c(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, Bitmap bitmap) {
        int byteCount = bitmap.getByteCount() / 1024;
        C2181a.m6455h("CleverTap.ImageCache: have image of size: " + byteCount + "KB for key: " + str);
        return byteCount;
    }
}
