package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import ga.C5725h;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p454wa.C9883h;
import p454wa.C9884i;
import p454wa.C9893r;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2529c<T> implements Loader.InterfaceC2524d {

    /* JADX INFO: renamed from: a */
    public final long f13735a;

    /* JADX INFO: renamed from: b */
    public final C9884i f13736b;

    /* JADX INFO: renamed from: c */
    public final int f13737c;

    /* JADX INFO: renamed from: d */
    public final C9893r f13738d;

    /* JADX INFO: renamed from: e */
    public final a<? extends T> f13739e;

    /* JADX INFO: renamed from: f */
    public volatile T f13740f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        Object mo7296a(Uri uri, C9883h c9883h) throws IOException;
    }

    public C2529c() {
        throw null;
    }

    public C2529c(InterfaceC9882g interfaceC9882g, Uri uri, a aVar) {
        Map mapEmptyMap = Collections.emptyMap();
        C10129a.m18994f(uri, "The uri must be set.");
        C9884i c9884i = new C9884i(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.f13738d = new C9893r(interfaceC9882g);
        this.f13736b = c9884i;
        this.f13737c = 4;
        this.f13739e = aVar;
        this.f13735a = C5725h.f34748b.getAndIncrement();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
    /* JADX INFO: renamed from: a */
    public final void mo7374a() throws IOException {
        this.f13738d.f50526b = 0L;
        C9883h c9883h = new C9883h(this.f13738d, this.f13736b);
        try {
            c9883h.m18380a();
            Uri uriMo7276k = this.f13738d.mo7276k();
            uriMo7276k.getClass();
            this.f13740f = (T) this.f13739e.mo7296a(uriMo7276k, c9883h);
            int i10 = C10134c0.f51354a;
        } finally {
            int i11 = C10134c0.f51354a;
            try {
                c9883h.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
    /* JADX INFO: renamed from: b */
    public final void mo7375b() {
    }
}
