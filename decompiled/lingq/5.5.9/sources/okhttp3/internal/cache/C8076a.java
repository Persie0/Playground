package okhttp3.internal.cache;

import java.io.IOException;
import p124fp.AbstractC5612i;
import p124fp.InterfaceC5627x;
import sl.C9072e;

/* JADX INFO: renamed from: okhttp3.internal.cache.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8076a extends AbstractC5612i {

    /* JADX INFO: renamed from: b */
    public boolean f43858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC5627x f43859c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DiskLruCache f43860d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DiskLruCache.C8074a f43861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8076a(InterfaceC5627x interfaceC5627x, DiskLruCache diskLruCache, DiskLruCache.C8074a c8074a) {
        super(interfaceC5627x);
        this.f43859c = interfaceC5627x;
        this.f43860d = diskLruCache;
        this.f43861e = c8074a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p124fp.AbstractC5612i, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f43858b) {
            return;
        }
        this.f43858b = true;
        DiskLruCache diskLruCache = this.f43860d;
        DiskLruCache.C8074a c8074a = this.f43861e;
        synchronized (diskLruCache) {
            int i10 = c8074a.f43850h - 1;
            c8074a.f43850h = i10;
            if (i10 == 0 && c8074a.f43848f) {
                diskLruCache.m15956Q(c8074a);
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }
}
