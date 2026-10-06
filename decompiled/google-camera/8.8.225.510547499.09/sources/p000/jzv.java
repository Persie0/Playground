package p000;

import android.location.Location;
import android.media.MediaCodec;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzv implements jyy {

    /* JADX INFO: renamed from: a */
    public final npu f35405a;

    /* JADX INFO: renamed from: b */
    public final kbz f35406b;

    /* JADX INFO: renamed from: c */
    public jxs f35407c;

    /* JADX INFO: renamed from: d */
    public jxv f35408d;

    /* JADX INFO: renamed from: f */
    public int f35410f;

    /* JADX INFO: renamed from: i */
    public final Handler f35413i;

    /* JADX INFO: renamed from: u */
    public Surface f35425u;

    /* JADX INFO: renamed from: v */
    public jyz f35426v;

    /* JADX INFO: renamed from: w */
    public MediaCodec.Callback f35427w;

    /* JADX INFO: renamed from: x */
    public kns f35428x;

    /* JADX INFO: renamed from: z */
    private nps f35430z;

    /* JADX INFO: renamed from: e */
    public jym f35409e = jym.SURFACE;

    /* JADX INFO: renamed from: g */
    public int f35411g = 1;

    /* JADX INFO: renamed from: h */
    public int f35412h = 3;

    /* JADX INFO: renamed from: y */
    public int f35429y = 6;

    /* JADX INFO: renamed from: j */
    public int f35414j = 0;

    /* JADX INFO: renamed from: k */
    public long f35415k = 4000000000L;

    /* JADX INFO: renamed from: l */
    public nps f35416l = kxk.m14965K(0L);

    /* JADX INFO: renamed from: m */
    public int f35417m = 0;

    /* JADX INFO: renamed from: n */
    public jyq f35418n = new jyl();

    /* JADX INFO: renamed from: o */
    public final List f35419o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public boolean f35420p = false;

    /* JADX INFO: renamed from: q */
    public boolean f35421q = false;

    /* JADX INFO: renamed from: r */
    public boolean f35422r = false;

    /* JADX INFO: renamed from: s */
    public boolean f35423s = false;

    /* JADX INFO: renamed from: t */
    public nps f35424t = kxk.m14965K(mqu.f41450a);

    public jzv(npu npuVar, Handler handler, kbz kbzVar) {
        this.f35405a = npuVar;
        this.f35413i = handler;
        this.f35406b = kbzVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jyy mo13760b(jyz jyzVar) {
        this.f35426v = jyzVar;
        return this;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: c */
    public final void mo13761c(jxs jxsVar) {
        this.f35407c = jxsVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: d */
    public final void mo13762d(int i) {
        this.f35429y = i;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: e */
    public final void mo13763e(jym jymVar) {
        this.f35409e = jymVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: f */
    public final void mo13764f(int i) {
        this.f35410f = i;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: g */
    public final void mo13765g(Surface surface) {
        if (this.f35409e != jym.SURFACE) {
            Log.w("VidRMedCodBdr", "colorformat will be set to SURFACE as a surface is provided");
            this.f35409e = jym.SURFACE;
        }
        this.f35425u = surface;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: h */
    public final void mo13766h(Location location) {
        this.f35424t = kxk.m14965K(mrm.m16829i(location));
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: i */
    public final void mo13767i(nps npsVar) {
        this.f35424t = npsVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: j */
    public final void mo13768j(int i) {
        this.f35414j = i;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: k */
    public final void mo13769k(long j) {
        this.f35416l = kxk.m14965K(Long.valueOf(j));
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: l */
    public final void mo13770l(long j) {
        this.f35415k = j;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: m */
    public final void mo13771m(MediaCodec.Callback callback) {
        this.f35427w = callback;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: n */
    public final void mo13772n(boolean z) {
        this.f35421q = z;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: o */
    public final void mo13773o(int i) {
        this.f35417m = i;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: p */
    public final void mo13774p(nps npsVar) {
        this.f35430z = npsVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: q */
    public final void mo13775q(FileDescriptor fileDescriptor) {
        this.f35430z = kxk.m14965K(fileDescriptor);
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: r */
    public final void mo13776r(jxv jxvVar) {
        this.f35408d = jxvVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: s */
    public final void mo13777s(boolean z) {
        this.f35422r = z;
    }

    /* JADX INFO: renamed from: t */
    public final nps m13852t() {
        nps npsVar = this.f35430z;
        return npsVar != null ? npsVar : kxk.m14965K(null);
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ jyx mo13759a() {
        if (this.f35430z != null) {
            return new jzu(this);
        }
        throw new IllegalArgumentException("Either output video file path or descriptor is required");
    }
}
