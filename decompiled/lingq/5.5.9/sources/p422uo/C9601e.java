package p422uo;

import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import p124fp.C5607d;
import p124fp.C5617n;
import p442vo.AbstractC9765a;

/* JADX INFO: renamed from: uo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9601e extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DiskLruCache f49273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9601e(DiskLruCache diskLruCache, String str) {
        super(str, true);
        this.f49273e = diskLruCache;
    }

    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        DiskLruCache diskLruCache = this.f49273e;
        synchronized (diskLruCache) {
            if (diskLruCache.f43818J && !diskLruCache.f43819K) {
                try {
                    diskLruCache.m15957U();
                } catch (IOException unused) {
                    diskLruCache.f43820L = true;
                }
                try {
                    if (diskLruCache.m15963w()) {
                        diskLruCache.m15955H();
                        diskLruCache.f43836l = 0;
                    }
                } catch (IOException unused2) {
                    diskLruCache.f43821M = true;
                    diskLruCache.f43834j = C5617n.m11990b(new C5607d());
                }
                return -1L;
            }
            return -1L;
        }
    }
}
