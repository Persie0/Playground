package ua;

import com.google.android.exoplayer2.C2384d0;
import p150h9.C5926m0;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ua.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9511t {

    /* JADX INFO: renamed from: a */
    public final int f49011a;

    /* JADX INFO: renamed from: b */
    public final C5926m0[] f49012b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9502k[] f49013c;

    /* JADX INFO: renamed from: d */
    public final C2384d0 f49014d;

    /* JADX INFO: renamed from: e */
    public final Object f49015e;

    public C9511t(C5926m0[] c5926m0Arr, InterfaceC9502k[] interfaceC9502kArr, C2384d0 c2384d0, AbstractC9504m.a aVar) {
        this.f49012b = c5926m0Arr;
        this.f49013c = (InterfaceC9502k[]) interfaceC9502kArr.clone();
        this.f49014d = c2384d0;
        this.f49015e = aVar;
        this.f49011a = c5926m0Arr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17976a(C9511t c9511t, int i10) {
        return c9511t != null && C10134c0.m19034a(this.f49012b[i10], c9511t.f49012b[i10]) && C10134c0.m19034a(this.f49013c[i10], c9511t.f49013c[i10]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17977b(int i10) {
        return this.f49012b[i10] != null;
    }
}
