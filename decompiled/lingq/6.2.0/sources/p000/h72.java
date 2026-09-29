package p000;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h72 {

    /* JADX INFO: renamed from: r */
    public static final ImmutableList f41857r;

    /* JADX INFO: renamed from: a */
    public final y0a f41858a;

    /* JADX INFO: renamed from: b */
    public final x0a f41859b;

    /* JADX INFO: renamed from: c */
    public final u42 f41860c;

    /* JADX INFO: renamed from: d */
    public final long f41861d;

    /* JADX INFO: renamed from: e */
    public final long f41862e;

    /* JADX INFO: renamed from: f */
    public final long f41863f;

    /* JADX INFO: renamed from: g */
    public final long f41864g;

    /* JADX INFO: renamed from: h */
    public final long f41865h;

    /* JADX INFO: renamed from: i */
    public final long f41866i;

    /* JADX INFO: renamed from: j */
    public final long f41867j;

    /* JADX INFO: renamed from: k */
    public final long f41868k;

    /* JADX INFO: renamed from: l */
    public final int f41869l;

    /* JADX INFO: renamed from: m */
    public final boolean f41870m;

    /* JADX INFO: renamed from: n */
    public final long f41871n;

    /* JADX INFO: renamed from: o */
    public final ImmutableMap f41872o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentHashMap f41873p;

    /* JADX INFO: renamed from: q */
    public long f41874q;

    static {
        d14 d14Var = ImmutableList.f13390b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        d32.m10011I(objArr, 6);
        f41857r = ImmutableList.m6283l(objArr, 6);
    }

    public h72() {
        u42 u42Var = new u42();
        ImmutableMap immutableMapM6298f = ImmutableMap.m6298f();
        m13106a("bufferForPlaybackMs", DescriptorProtos.Edition.EDITION_2023_VALUE, 0, "0");
        m13106a("bufferForPlaybackForLocalPlaybackMs", DescriptorProtos.Edition.EDITION_2023_VALUE, 0, "0");
        m13106a("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        m13106a("bufferForPlaybackAfterRebufferForLocalPlaybackMs", DescriptorProtos.Edition.EDITION_2023_VALUE, 0, "0");
        m13106a("minBufferMs", 50000, DescriptorProtos.Edition.EDITION_2023_VALUE, "bufferForPlaybackMs");
        m13106a("minBufferForLocalPlaybackMs", DescriptorProtos.Edition.EDITION_2023_VALUE, DescriptorProtos.Edition.EDITION_2023_VALUE, "bufferForPlaybackForLocalPlaybackMs");
        m13106a("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        m13106a("minBufferForLocalPlaybackMs", DescriptorProtos.Edition.EDITION_2023_VALUE, DescriptorProtos.Edition.EDITION_2023_VALUE, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        m13106a("maxBufferMs", 50000, 50000, "minBufferMs");
        m13106a("maxBufferForLocalPlaybackMs", 50000, DescriptorProtos.Edition.EDITION_2023_VALUE, "minBufferForLocalPlaybackMs");
        m13106a("backBufferDurationMs", 0, 0, "0");
        this.f41858a = new y0a();
        this.f41859b = new x0a();
        this.f41860c = u42Var;
        long jM22797B = uma.m22797B(50000L);
        this.f41861d = jM22797B;
        long jM22797B2 = uma.m22797B(1000L);
        this.f41862e = jM22797B2;
        this.f41863f = jM22797B;
        this.f41864g = jM22797B;
        this.f41865h = jM22797B2;
        this.f41866i = jM22797B2;
        this.f41867j = uma.m22797B(2000L);
        this.f41868k = jM22797B2;
        this.f41869l = -1;
        this.f41870m = true;
        this.f41871n = uma.m22797B(0L);
        this.f41873p = new ConcurrentHashMap();
        this.f41872o = ImmutableMap.m6297c(immutableMapM6298f);
        this.f41874q = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static void m13106a(String str, int i, int i2, String str2) {
        if (i >= i2) {
            return;
        }
        C3386nv.m17626m(b34.m3207B("%s cannot be less than %s", str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX INFO: renamed from: b */
    public final boolean m13107b(dh5 dh5Var) {
        boolean z;
        xb7 xb7Var = dh5Var.f35650a;
        long j = dh5Var.f35653d;
        ConcurrentHashMap concurrentHashMap = this.f41873p;
        g72 g72Var = (g72) concurrentHashMap.get(xb7Var);
        g72Var.getClass();
        g72 g72Var2 = (g72) concurrentHashMap.get(xb7Var);
        g72Var2.getClass();
        int iM12403a = g72Var2.m12403a() * this.f41860c.f63380b;
        g72 g72Var3 = (g72) concurrentHashMap.get(xb7Var);
        g72Var3.getClass();
        boolean z2 = iM12403a >= g72Var3.f40311c;
        if (xb7Var == xb7.f68028c) {
            return !z2;
        }
        z0a z0aVar = dh5Var.f35651b;
        mu5 mu5Var = z0aVar.mo39m(z0aVar.mo23250g(dh5Var.f35652c.f46226a, this.f41859b).f67601c, this.f41858a, 0L).f69065b.f56811b;
        if (mu5Var == null) {
            z = false;
        } else {
            String scheme = mu5Var.f51852a.getScheme();
            if (TextUtils.isEmpty(scheme) || f41857r.contains(scheme)) {
                z = true;
            } else {
                z = false;
            }
        }
        long jMin = z ? this.f41862e : this.f41861d;
        long j2 = z ? this.f41864g : this.f41863f;
        float f = dh5Var.f35654e;
        if (f > 1.0f) {
            jMin = Math.min(uma.m22824s(f, jMin), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            boolean z3 = (z ? this.f41870m : false) || !z2;
            g72Var.f40310b = z3;
            if (!z3 && j < 500000) {
                ss5.m21707d0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z2) {
            g72Var.f40310b = false;
        }
        return g72Var.f40310b;
    }

    /* JADX INFO: renamed from: c */
    public final void m13108c() {
        boolean zIsEmpty = this.f41873p.isEmpty();
        u42 u42Var = this.f41860c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (u42Var) {
                if (u42Var.f63379a) {
                    u42Var.m22447b(0);
                }
            }
        } else {
            Iterator it = this.f41873p.values().iterator();
            while (it.hasNext()) {
                i += ((g72) it.next()).f40311c;
            }
            u42Var.m22447b(i);
        }
    }
}
