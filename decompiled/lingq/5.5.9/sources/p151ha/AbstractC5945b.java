package p151ha;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.upstream.Loader;
import ga.C5725h;
import p454wa.C9884i;
import p454wa.C9893r;
import p454wa.InterfaceC9882g;

/* JADX INFO: renamed from: ha.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5945b implements Loader.InterfaceC2524d {

    /* JADX INFO: renamed from: a */
    public final long f35394a = C5725h.f34748b.getAndIncrement();

    /* JADX INFO: renamed from: b */
    public final C9884i f35395b;

    /* JADX INFO: renamed from: c */
    public final int f35396c;

    /* JADX INFO: renamed from: d */
    public final C2416m f35397d;

    /* JADX INFO: renamed from: e */
    public final int f35398e;

    /* JADX INFO: renamed from: f */
    public final Object f35399f;

    /* JADX INFO: renamed from: g */
    public final long f35400g;

    /* JADX INFO: renamed from: h */
    public final long f35401h;

    /* JADX INFO: renamed from: i */
    public final C9893r f35402i;

    public AbstractC5945b(InterfaceC9882g interfaceC9882g, C9884i c9884i, int i10, C2416m c2416m, int i11, Object obj, long j10, long j11) {
        this.f35402i = new C9893r(interfaceC9882g);
        this.f35395b = c9884i;
        this.f35396c = i10;
        this.f35397d = c2416m;
        this.f35398e = i11;
        this.f35399f = obj;
        this.f35400g = j10;
        this.f35401h = j11;
    }
}
