package p000;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.C0713b;
import androidx.media3.container.C0714a;
import androidx.media3.container.C0715b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractC1120j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class fu5 extends xt5 {

    /* JADX INFO: renamed from: V1 */
    public static final int[] f39643V1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: W1 */
    public static boolean f39644W1;

    /* JADX INFO: renamed from: X1 */
    public static boolean f39645X1;

    /* JADX INFO: renamed from: A1 */
    public long f39646A1;

    /* JADX INFO: renamed from: B1 */
    public int f39647B1;

    /* JADX INFO: renamed from: C1 */
    public int f39648C1;

    /* JADX INFO: renamed from: D1 */
    public int f39649D1;

    /* JADX INFO: renamed from: E1 */
    public jo8 f39650E1;

    /* JADX INFO: renamed from: F1 */
    public long f39651F1;

    /* JADX INFO: renamed from: G1 */
    public boolean f39652G1;

    /* JADX INFO: renamed from: H1 */
    public long f39653H1;

    /* JADX INFO: renamed from: I1 */
    public int f39654I1;

    /* JADX INFO: renamed from: J1 */
    public long f39655J1;

    /* JADX INFO: renamed from: K1 */
    public lsa f39656K1;

    /* JADX INFO: renamed from: L1 */
    public lsa f39657L1;

    /* JADX INFO: renamed from: M1 */
    public int f39658M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f39659N1;

    /* JADX INFO: renamed from: O1 */
    public int f39660O1;

    /* JADX INFO: renamed from: P1 */
    public eu5 f39661P1;

    /* JADX INFO: renamed from: Q1 */
    public wpa f39662Q1;

    /* JADX INFO: renamed from: R1 */
    public long f39663R1;

    /* JADX INFO: renamed from: S1 */
    public long f39664S1;

    /* JADX INFO: renamed from: T1 */
    public boolean f39665T1;

    /* JADX INFO: renamed from: U1 */
    public int f39666U1;

    /* JADX INFO: renamed from: c1 */
    public final Context f39667c1;

    /* JADX INFO: renamed from: d1 */
    public final boolean f39668d1;

    /* JADX INFO: renamed from: e1 */
    public final C3165jz f39669e1;

    /* JADX INFO: renamed from: f1 */
    public final int f39670f1;

    /* JADX INFO: renamed from: g1 */
    public final boolean f39671g1;

    /* JADX INFO: renamed from: h1 */
    public final ypa f39672h1;

    /* JADX INFO: renamed from: i1 */
    public final at2 f39673i1;

    /* JADX INFO: renamed from: j1 */
    public final b64 f39674j1;

    /* JADX INFO: renamed from: k1 */
    public final long f39675k1;

    /* JADX INFO: renamed from: l1 */
    public final zpa f39676l1;

    /* JADX INFO: renamed from: m1 */
    public final PriorityQueue f39677m1;

    /* JADX INFO: renamed from: n1 */
    public C3283l2 f39678n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f39679o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f39680p1;

    /* JADX INFO: renamed from: q1 */
    public ksa f39681q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f39682r1;

    /* JADX INFO: renamed from: s1 */
    public int f39683s1;

    /* JADX INFO: renamed from: t1 */
    public List f39684t1;

    /* JADX INFO: renamed from: u1 */
    public Surface f39685u1;

    /* JADX INFO: renamed from: v1 */
    public PlaceholderSurface f39686v1;

    /* JADX INFO: renamed from: w1 */
    public v89 f39687w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f39688x1;

    /* JADX INFO: renamed from: y1 */
    public int f39689y1;

    /* JADX INFO: renamed from: z1 */
    public int f39690z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public fu5(du5 du5Var) {
        Context context = du5Var.f36242a;
        super(context.getApplicationContext(), 2, du5Var.f36244c, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f39667c1 = applicationContext;
        this.f39670f1 = du5Var.f36248g;
        this.f39681q1 = null;
        this.f39669e1 = new C3165jz(du5Var.f36246e, du5Var.f36247f, 1);
        this.f39668d1 = this.f39681q1 == null;
        this.f39672h1 = new ypa(applicationContext, this, du5Var.f36245d);
        this.f39673i1 = new at2();
        this.f39671g1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f39687w1 = v89.f65026c;
        this.f39689y1 = 1;
        this.f39690z1 = 0;
        this.f39656K1 = lsa.f50084d;
        this.f39660O1 = 0;
        this.f39657L1 = null;
        this.f39658M1 = -1000;
        this.f39663R1 = -9223372036854775807L;
        this.f39664S1 = -9223372036854775807L;
        this.f39674j1 = new b64(11);
        this.f39677m1 = new PriorityQueue();
        this.f39675k1 = -15000L;
        this.f39676l1 = new zpa();
        this.f39650E1 = null;
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m12152E0(String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (fu5.class) {
            try {
                if (!f39644W1) {
                    String str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2) {
                        case "AFTJMST12":
                        case "AFTKMST12":
                        case "AFTA":
                        case "AFTN":
                        case "AFTR":
                        case "AFTEU011":
                        case "AFTEU014":
                        case "AFTSO001":
                        case "AFTEUFF014":
                            z = true;
                            break;
                    }
                    f39645X1 = z;
                    f39644W1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f39645X1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: F0 */
    public static int m12153F0(vt5 vt5Var, C0713b c0713b) {
        int i = c0713b.f6413v;
        int i2 = c0713b.f6414w;
        if (i != -1 && i2 != -1) {
            String str = c0713b.f6406o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairM16616b = m41.m16616b(c0713b);
                if (pairM16616b == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM16616b.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !vt5Var.f65886f)))) {
                        return ((uma.m22810e(i2, 16) * uma.m22810e(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: G0 */
    public static List m12154G0(Context context, gm5 gm5Var, C0713b c0713b, boolean z, boolean z2) {
        String str = c0713b.f6406o;
        if (str == null) {
            return ImmutableList.m6289v();
        }
        if ("video/dolby-vision".equals(str) && !epb.m11314a(context)) {
            List listM3053d = au5.m3053d(gm5Var, c0713b, z, z2);
            if (!listM3053d.isEmpty()) {
                return listM3053d;
            }
        }
        return au5.m3057h(gm5Var, c0713b, z, z2);
    }

    /* JADX INFO: renamed from: H0 */
    public static int m12155H0(vt5 vt5Var, C0713b c0713b) {
        int i = c0713b.f6407p;
        List list = c0713b.f6409r;
        if (i == -1) {
            return m12153F0(vt5Var, c0713b);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return c0713b.f6407p + length;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: A0 */
    public final int mo12156A0(gm5 gm5Var, C0713b c0713b) {
        boolean z;
        int i = 0;
        if (!ez5.m11401k(c0713b.f6406o)) {
            return y90.m24988f(0, 0, 0, 0);
        }
        boolean z2 = c0713b.f6410s != null;
        Context context = this.f39667c1;
        List listM12154G0 = m12154G0(context, gm5Var, c0713b, z2, false);
        if (z2 && listM12154G0.isEmpty()) {
            listM12154G0 = m12154G0(context, gm5Var, c0713b, false, false);
        }
        if (listM12154G0.isEmpty()) {
            return y90.m24988f(1, 0, 0, 0);
        }
        int i2 = c0713b.f6390P;
        if (i2 != 0 && i2 != 2) {
            return y90.m24988f(2, 0, 0, 0);
        }
        vt5 vt5Var = (vt5) listM12154G0.get(0);
        boolean zM23539g = vt5Var.m23539g(context, c0713b);
        if (!zM23539g) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM12154G0.size()) {
                    z = true;
                    break;
                }
                vt5 vt5Var2 = (vt5) listM12154G0.get(i3);
                if (vt5Var2.m23539g(context, c0713b)) {
                    z = false;
                    zM23539g = true;
                    vt5Var = vt5Var2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zM23539g ? 4 : 3;
        int i5 = vt5Var.m23541i(c0713b) ? 16 : 8;
        int i6 = vt5Var.f65887g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if ("video/dolby-vision".equals(c0713b.f6406o) && !epb.m11314a(context)) {
            i7 = 256;
        }
        if (zM23539g) {
            List listM12154G1 = m12154G0(context, gm5Var, c0713b, z2, true);
            if (!listM12154G1.isEmpty()) {
                vt5 vt5Var3 = (vt5) au5.m3058i(context, listM12154G1, c0713b).get(0);
                if (vt5Var3.m23539g(context, c0713b) && vt5Var3.m23541i(c0713b)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // p000.xt5, p000.y90
    /* JADX INFO: renamed from: C */
    public final void mo12157C(float f, float f2) {
        super.mo12157C(f, f2);
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            ksaVar.mo15673j(f);
        } else {
            this.f39672h1.m25269h(f);
        }
        zpa zpaVar = this.f39676l1;
        if (zpaVar != null) {
            zpaVar.m25738c(f);
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: F */
    public final boolean mo12158F(long j) {
        if (this.f68717L0 == -9223372036854775807L || j < this.f39651F1) {
            return false;
        }
        long j2 = this.f68732T0;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: I */
    public final o32 mo12159I(vt5 vt5Var, C0713b c0713b, C0713b c0713b2) {
        int i;
        o32 o32VarM23535c = vt5Var.m23535c(c0713b, c0713b2);
        int i2 = o32VarM23535c.f53764e;
        C3283l2 c3283l2 = this.f39678n1;
        c3283l2.getClass();
        if (c0713b2.f6413v > c3283l2.f48908a || c0713b2.f6414w > c3283l2.f48909b) {
            i2 |= 256;
        }
        if (m12155H0(vt5Var, c0713b2) > c3283l2.f48910c) {
            i2 |= 64;
        }
        if (this.f39690z1 != Integer.MIN_VALUE) {
            float f = c0713b.f6417z;
            if (f != -1.0f) {
                float f2 = c0713b2.f6417z;
                if (f2 != -1.0f && Math.abs(f2 - f) > 1.0f && ((i = Build.VERSION.SDK_INT) < 30 || (i == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i2 |= 65536;
                }
            }
        }
        int i3 = i2;
        return new o32(vt5Var.f65881a, c0713b, c0713b2, i3 != 0 ? 0 : o32VarM23535c.f53763d, i3);
    }

    /* JADX INFO: renamed from: I0 */
    public final Surface m12160I0(vt5 vt5Var) {
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            return ksaVar.mo15665b();
        }
        Surface surface = this.f39685u1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && vt5Var.f65888h) {
            return null;
        }
        bna.m3987z(m12171Q0(vt5Var));
        PlaceholderSurface placeholderSurface = this.f39686v1;
        if (placeholderSurface != null && placeholderSurface.f6511a != vt5Var.f65886f && placeholderSurface != null) {
            placeholderSurface.release();
            this.f39686v1 = null;
        }
        if (this.f39686v1 == null) {
            this.f39686v1 = PlaceholderSurface.m2569b(vt5Var.f65886f);
        }
        return this.f39686v1;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: J */
    public final MediaCodecDecoderException mo12161J(IllegalStateException illegalStateException, vt5 vt5Var) {
        return new MediaCodecVideoDecoderException(illegalStateException, vt5Var, this.f39685u1);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m12162J0(vt5 vt5Var) {
        if (this.f39681q1 != null) {
            return true;
        }
        Surface surface = this.f39685u1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && vt5Var.f65888h) || m12171Q0(vt5Var);
        }
        return true;
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m12163K0(m32 m32Var) {
        if (m24993l() || m32Var.m3751d(536870912)) {
            return true;
        }
        long j = this.f39664S1;
        return j == -9223372036854775807L || j - (m32Var.f50502g - this.f68730S0.f67279c) <= 100000;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m12164L0() {
        if (this.f39647B1 > 0) {
            this.f69501g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = jElapsedRealtime - this.f39646A1;
            final int i = this.f39647B1;
            final C3165jz c3165jz = this.f39669e1;
            Handler handler = c3165jz.f46413a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        ew2 ew2Var = c3165jz.f46414b;
                        String str = uma.f64080a;
                        l52 l52Var = ew2Var.f37985a.f46300r;
                        C3496qf c3496qfM15804F = l52Var.m15804F((jv5) l52Var.f49067d.f10363f);
                        l52Var.m15808J(c3496qfM15804F, 1018, new z42(c3496qfM15804F, i, j));
                    }
                });
            }
            this.f39647B1 = 0;
            this.f39646A1 = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m12165M0() {
        st5 st5Var;
        if (this.f39659N1 && (st5Var = this.f68754i0) != null) {
            this.f39661P1 = new eu5(this, st5Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                st5Var.mo10717d(bundle);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m12166N0(st5 st5Var, int i, long j) {
        Surface surface;
        g8d.m12416a("releaseOutputBuffer");
        st5Var.mo10727o(i, j);
        g8d.m12417b();
        this.f68728R0.f48972e++;
        this.f39648C1 = 0;
        if (this.f39681q1 == null) {
            lsa lsaVar = this.f39656K1;
            boolean zEquals = lsaVar.equals(lsa.f50084d);
            C3165jz c3165jz = this.f39669e1;
            if (!zEquals && !lsaVar.equals(this.f39657L1)) {
                this.f39657L1 = lsaVar;
                c3165jz.m14752b(lsaVar);
            }
            ypa ypaVar = this.f39672h1;
            boolean z = ypaVar.f70267e != 3;
            ypaVar.f70267e = 3;
            ypaVar.f70274l.getClass();
            ypaVar.f70269g = uma.m22797B(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f39685u1) == null) {
                return;
            }
            Handler handler = c3165jz.f46413a;
            if (handler != null) {
                handler.post(new sp1(c3165jz, surface, SystemClock.elapsedRealtime()));
            }
            this.f39688x1 = true;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m12167O0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f39685u1;
        C3165jz c3165jz = this.f39669e1;
        if (surface2 == surface) {
            if (surface != null) {
                lsa lsaVar = this.f39657L1;
                if (lsaVar != null) {
                    c3165jz.m14752b(lsaVar);
                }
                Surface surface3 = this.f39685u1;
                if (surface3 == null || !this.f39688x1 || (handler = c3165jz.f46413a) == null) {
                    return;
                }
                handler.post(new sp1(c3165jz, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f39685u1 = surface;
        ksa ksaVar = this.f39681q1;
        ypa ypaVar = this.f39672h1;
        if (ksaVar == null) {
            ypaVar.m25268g(surface);
        }
        this.f39688x1 = false;
        int i = this.f69502h;
        st5 st5Var = this.f68754i0;
        if (st5Var != null && this.f39681q1 == null) {
            vt5 vt5Var = this.f68761p0;
            vt5Var.getClass();
            if (!m12162J0(vt5Var) || this.f39679o1) {
                m24695o0();
                m24690Y();
            } else {
                Surface surfaceM12160I0 = m12160I0(vt5Var);
                if (surfaceM12160I0 != null) {
                    st5Var.mo10732y(surfaceM12160I0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        uk9.m22770c();
                        return;
                    }
                    st5Var.mo10724l();
                }
            }
        }
        if (surface != null) {
            lsa lsaVar2 = this.f39657L1;
            if (lsaVar2 != null) {
                c3165jz.m14752b(lsaVar2);
            }
        } else {
            this.f39657L1 = null;
            ksa ksaVar2 = this.f39681q1;
            if (ksaVar2 != null) {
                ksaVar2.mo15674k();
            }
        }
        if (i == 2) {
            ksa ksaVar3 = this.f39681q1;
            if (ksaVar3 != null) {
                ksaVar3.mo15680q(true);
            } else {
                ypaVar.m25264c(true);
            }
        }
        m12165M0();
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: P */
    public final int mo12168P(m32 m32Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f39650E1 == null && !this.f39659N1) || m32Var.f50502g >= this.f69506l || m12163K0(m32Var)) ? 0 : 32;
        }
        return 0;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m12169P0(long j, long j2, boolean z, boolean z2) {
        if (this.f39681q1 != null && this.f39668d1) {
            j2 -= -this.f39663R1;
        }
        if (j < -500000 && !z) {
            zk8 zk8Var = this.f69503i;
            zk8Var.getClass();
            int iMo4201d = zk8Var.mo4201d(j2 - this.f69505k);
            if (iMo4201d != 0) {
                this.f39651F1 = j2;
                l32 l32Var = this.f68728R0;
                PriorityQueue priorityQueue = this.f39677m1;
                if (z2) {
                    int i = l32Var.f48971d + iMo4201d;
                    l32Var.f48971d = i;
                    l32Var.f48973f += this.f39649D1;
                    l32Var.f48971d = priorityQueue.size() + i;
                } else {
                    l32Var.f48977j++;
                    m12174S0(priorityQueue.size() + iMo4201d, this.f39649D1);
                }
                if (this.f68754i0 != null) {
                    if (mo12199y0()) {
                        m24695o0();
                        m24690Y();
                    } else if (mo12196w0()) {
                        m24685N();
                    } else {
                        this.f68738W0 = true;
                    }
                }
                ksa ksaVar = this.f39681q1;
                if (ksaVar != null) {
                    ksaVar.mo15677n(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: Q */
    public final float mo12170Q(float f, C0713b c0713b, C0713b[] c0713bArr) {
        vt5 vt5Var;
        float fMax = -1.0f;
        for (C0713b c0713b2 : c0713bArr) {
            float f2 = c0713b2.f6417z;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.f39650E1 == null || (vt5Var = this.f68761p0) == null) {
            return f3;
        }
        float fM23536d = vt5Var.m23536d(c0713b.f6413v, c0713b.f6414w);
        return f3 != -1.0f ? Math.max(f3, fM23536d) : fM23536d;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m12171Q0(vt5 vt5Var) {
        if (this.f39659N1 || m12152E0(vt5Var.f65881a)) {
            return false;
        }
        return !vt5Var.f65886f || PlaceholderSurface.m2568a();
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: R */
    public final ArrayList mo12172R(gm5 gm5Var, C0713b c0713b, boolean z) {
        boolean z2 = this.f39659N1;
        Context context = this.f39667c1;
        return au5.m3058i(context, m12154G0(context, gm5Var, c0713b, z, z2), c0713b);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m12173R0(st5 st5Var, int i) {
        g8d.m12416a("skipVideoBuffer");
        st5Var.mo10720h(i);
        g8d.m12417b();
        this.f68728R0.f48973f++;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m12174S0(int i, int i2) {
        l32 l32Var = this.f68728R0;
        l32Var.f48975h += i;
        int i3 = i + i2;
        l32Var.f48974g += i3;
        this.f39647B1 += i3;
        int i4 = this.f39648C1 + i3;
        this.f39648C1 = i4;
        l32Var.f48976i = Math.max(i4, l32Var.f48976i);
        int i5 = this.f39670f1;
        if (i5 <= 0 || this.f39647B1 < i5) {
            return;
        }
        m12164L0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m12175T0(jv5 jv5Var) {
        z0a z0aVar = this.f69492K;
        if (z0aVar.m25398p()) {
            this.f39664S1 = -9223372036854775807L;
            return;
        }
        int iMo17285b = z0aVar.mo17285b(jv5Var.f46226a);
        if (iMo17285b == -1) {
            this.f39664S1 = -9223372036854775807L;
        } else {
            this.f39664S1 = z0aVar.mo16393f(iMo17285b, new x0a(), false).f67602d;
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: U */
    public final a34 mo12176U(vt5 vt5Var, C0713b c0713b, MediaCrypto mediaCrypto, float f) {
        ga1 ga1Var;
        C3283l2 c3283l2;
        Point point;
        byte b;
        boolean z;
        Pair pairM16616b;
        int iM12153F0;
        String str = vt5Var.f65883c;
        C0713b[] c0713bArr = this.f69504j;
        c0713bArr.getClass();
        int i = c0713b.f6413v;
        float f2 = c0713b.f6417z;
        ga1 ga1Var2 = c0713b.f6379E;
        int i2 = c0713b.f6414w;
        int iM12155H0 = m12155H0(vt5Var, c0713b);
        if (c0713bArr.length == 1) {
            if (iM12155H0 != -1 && (iM12153F0 = m12153F0(vt5Var, c0713b)) != -1) {
                iM12155H0 = Math.min((int) (iM12155H0 * 1.5f), iM12153F0);
            }
            c3283l2 = new C3283l2(i, i2, iM12155H0);
            ga1Var = ga1Var2;
        } else {
            int length = c0713bArr.length;
            int iMax = i;
            int iMax2 = i2;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                C0713b c0713bM16068a = c0713bArr[i3];
                C0713b[] c0713bArr2 = c0713bArr;
                if (ga1Var2 != null && c0713bM16068a.f6379E == null) {
                    lc3 lc3VarM2520a = c0713bM16068a.m2520a();
                    lc3VarM2520a.m16070c(ga1Var2);
                    c0713bM16068a = lc3VarM2520a.m16068a();
                }
                o32 o32VarM23535c = vt5Var.m23535c(c0713b, c0713bM16068a);
                int i4 = length;
                int i5 = c0713bM16068a.f6414w;
                if (o32VarM23535c.f53763d != 0) {
                    int i6 = c0713bM16068a.f6413v;
                    b = -1;
                    z2 |= i6 == -1 || i5 == -1;
                    iMax = Math.max(iMax, i6);
                    iMax2 = Math.max(iMax2, i5);
                    iM12155H0 = Math.max(iM12155H0, m12155H0(vt5Var, c0713bM16068a));
                } else {
                    b = -1;
                }
                length = i4;
                i3++;
                c0713bArr = c0713bArr2;
            }
            if (z2) {
                ss5.m21707d0("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i2 > i;
                int i7 = z3 ? i2 : i;
                boolean z4 = z3;
                int i8 = z3 ? i : i2;
                float f3 = i8 / i7;
                int i9 = 0;
                while (true) {
                    point = null;
                    ga1Var = ga1Var2;
                    if (i9 >= 9) {
                        break;
                    }
                    int i10 = f39643V1[i9];
                    int i11 = i9;
                    int i12 = (int) (i10 * f3);
                    if (i10 <= i7 || i12 <= i8) {
                        break;
                    }
                    if (!z4) {
                        i12 = i10;
                    }
                    if (!z4) {
                        i10 = i12;
                    }
                    Point pointM23534a = vt5Var.m23534a(i12, i10);
                    if (pointM23534a != null) {
                        point = pointM23534a;
                        if (vt5Var.m23542j(f2, pointM23534a.x, pointM23534a.y)) {
                            break;
                        }
                    }
                    i9 = i11 + 1;
                    ga1Var2 = ga1Var;
                    i8 = i8;
                }
                Point point2 = point;
                if (point2 != null) {
                    iMax = Math.max(iMax, point2.x);
                    iMax2 = Math.max(iMax2, point2.y);
                    lc3 lc3VarM2520a2 = c0713b.m2520a();
                    lc3VarM2520a2.m16087t(iMax);
                    lc3VarM2520a2.m16073f(iMax2);
                    iM12155H0 = Math.max(iM12155H0, m12153F0(vt5Var, lc3VarM2520a2.m16068a()));
                    ss5.m21707d0("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                ga1Var = ga1Var2;
            }
            c3283l2 = new C3283l2(iMax, iMax2, iM12155H0);
        }
        this.f39678n1 = c3283l2;
        int i13 = this.f39659N1 ? this.f39660O1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i);
        mediaFormat.setInteger("height", i2);
        fpb.m11993d(mediaFormat, c0713b.f6409r);
        fpb.m11991b(mediaFormat, f2);
        fpb.m11992c(mediaFormat, "rotation-degrees", c0713b.f6375A);
        fpb.m11990a(mediaFormat, ga1Var);
        if ("video/dolby-vision".equals(c0713b.f6406o) && (pairM16616b = m41.m16616b(c0713b)) != null) {
            fpb.m11992c(mediaFormat, "profile", ((Integer) pairM16616b.first).intValue());
        }
        mediaFormat.setInteger("max-width", c3283l2.f48908a);
        mediaFormat.setInteger("max-height", c3283l2.f48909b);
        fpb.m11992c(mediaFormat, "max-input-size", c3283l2.f48910c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.f39671g1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i13 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i13);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f39658M1));
        }
        m24680G(mediaFormat);
        Surface surfaceM12160I0 = m12160I0(vt5Var);
        if (this.f39681q1 != null && !uma.m22831z(this.f39667c1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return a34.m59b(vt5Var, mediaFormat, c0713b, surfaceM12160I0, mediaCrypto);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m12177U0(long j) {
        l32 l32Var = this.f68728R0;
        l32Var.f48978k += j;
        l32Var.f48979l++;
        this.f39653H1 += j;
        this.f39654I1++;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: V */
    public final void mo12178V(m32 m32Var) {
        if (this.f39680p1) {
            ByteBuffer byteBuffer = m32Var.f50503h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        st5 st5Var = this.f68754i0;
                        st5Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        st5Var.mo10717d(bundle);
                    }
                }
            }
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: a0 */
    public final boolean mo12179a0(C0713b c0713b) throws ExoPlaybackException {
        ksa ksaVar = this.f39681q1;
        if (ksaVar == null || ksaVar.isInitialized()) {
            return true;
        }
        try {
            return this.f39681q1.mo15685v(c0713b);
        } catch (VideoSink$VideoSinkException e) {
            throw m24992g(e, c0713b, false, 7000);
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: b0 */
    public final void mo12180b0(Exception exc) {
        ss5.m21724v("MediaCodecVideoRenderer", "Video codec error", exc);
        C3165jz c3165jz = this.f39669e1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new esa(c3165jz, exc));
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: c0 */
    public final void mo12181c0(long j, long j2, String str) {
        String str2;
        C3165jz c3165jz = this.f39669e1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC3093hz(1, j, j2, c3165jz, str2));
        } else {
            str2 = str;
        }
        this.f39679o1 = m12152E0(str2);
        vt5 vt5Var = this.f68761p0;
        vt5Var.getClass();
        this.f39680p1 = vt5Var.m23540h();
        m12165M0();
    }

    @Override // p000.xt5, p000.y90, p000.yb7
    /* JADX INFO: renamed from: d */
    public final void mo4256d(int i, Object obj) {
        if (i == 1) {
            m12167O0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            wpa wpaVar = (wpa) obj;
            this.f39662Q1 = wpaVar;
            ksa ksaVar = this.f39681q1;
            if (ksaVar != null) {
                ksaVar.mo15682s(wpaVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f39660O1 != iIntValue) {
                this.f39660O1 = iIntValue;
                if (this.f39659N1) {
                    m24695o0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f39689y1 = iIntValue2;
            st5 st5Var = this.f68754i0;
            if (st5Var != null) {
                st5Var.mo10730v(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f39690z1 = iIntValue3;
            ksa ksaVar2 = this.f39681q1;
            if (ksaVar2 != null) {
                ksaVar2.mo15672i(iIntValue3);
                return;
            }
            dqa dqaVar = this.f39672h1.f70264b;
            if (dqaVar.f36050j == iIntValue3) {
                return;
            }
            dqaVar.f36050j = iIntValue3;
            dqaVar.m10592d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(xpa.f68507a)) {
                ksa ksaVar3 = this.f39681q1;
                if (ksaVar3 == null || !ksaVar3.isInitialized()) {
                    return;
                }
                this.f39681q1.mo15683t();
                return;
            }
            this.f39684t1 = list;
            ksa ksaVar4 = this.f39681q1;
            if (ksaVar4 != null) {
                ksaVar4.mo15678o(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            v89 v89Var = (v89) obj;
            if (v89Var.f65027a == 0 || v89Var.f65028b == 0) {
                return;
            }
            this.f39687w1 = v89Var;
            ksa ksaVar5 = this.f39681q1;
            if (ksaVar5 != null) {
                Surface surface = this.f39685u1;
                surface.getClass();
                ksaVar5.mo15684u(surface, v89Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f39658M1 = ((Integer) obj).intValue();
                st5 st5Var2 = this.f68754i0;
                if (st5Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f39658M1));
                    st5Var2.mo10717d(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f39685u1;
                m12167O0(null);
                obj.getClass();
                ((fu5) obj).mo4256d(1, surface2);
                break;
            case 18:
                boolean z = this.f39650E1 != null;
                jo8 jo8Var = (jo8) obj;
                this.f39650E1 = jo8Var;
                if (z != (jo8Var != null)) {
                    m24676B0(this.f68755j0);
                }
                break;
            default:
                super.mo4256d(i, obj);
                break;
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: d0 */
    public final void mo12182d0(l41 l41Var) {
        C3165jz c3165jz = this.f39669e1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new mv5(13, c3165jz, l41Var));
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: e0 */
    public final void mo12183e0(String str) {
        C3165jz c3165jz = this.f39669e1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new mv5(15, c3165jz, str));
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: f0 */
    public final o32 mo12184f0(p33 p33Var) {
        o32 o32VarMo12184f0 = super.mo12184f0(p33Var);
        C0713b c0713b = (C0713b) p33Var.f55514c;
        c0713b.getClass();
        C3165jz c3165jz = this.f39669e1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new RunnableC3725wk(c3165jz, c0713b, o32VarMo12184f0, 18));
        }
        zpa zpaVar = this.f39676l1;
        if (zpaVar != null) {
            zpaVar.m25737b();
        }
        return o32VarMo12184f0;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: g0 */
    public final void mo12185g0(C0713b c0713b, MediaFormat mediaFormat) {
        int integer;
        int i;
        st5 st5Var = this.f68754i0;
        if (st5Var != null) {
            st5Var.mo10730v(this.f39689y1);
        }
        if (this.f39659N1) {
            i = c0713b.f6413v;
            integer = c0713b.f6414w;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = c0713b.f6376B;
        int i2 = c0713b.f6375A;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.f39656K1 = new lsa(i, f, integer);
        ksa ksaVar = this.f39681q1;
        if (ksaVar == null || !this.f39665T1) {
            this.f39672h1.m25267f(c0713b.f6417z);
        } else {
            lc3 lc3VarM2520a = c0713b.m2520a();
            lc3VarM2520a.m16087t(i);
            lc3VarM2520a.m16073f(integer);
            lc3VarM2520a.m16081n(f);
            C0713b c0713bM16068a = lc3VarM2520a.m16068a();
            int i4 = this.f39683s1;
            List listM6289v = this.f39684t1;
            if (listM6289v == null) {
                listM6289v = ImmutableList.m6289v();
            }
            ksaVar.mo15676m(c0713bM16068a, this.f68730S0.f67278b, i4, listM6289v);
            this.f39683s1 = 2;
        }
        this.f39665T1 = false;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: h */
    public final void mo12186h() {
        ksa ksaVar = this.f39681q1;
        if (ksaVar == null) {
            ypa ypaVar = this.f39672h1;
            if (ypaVar.f70267e == 0) {
                ypaVar.f70267e = 1;
                return;
            }
            return;
        }
        int i = this.f39683s1;
        if (i == 0 || i == 1) {
            this.f39683s1 = 0;
        } else {
            ksaVar.mo15686w();
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: i0 */
    public final void mo12187i0(long j) {
        super.mo12187i0(j);
        if (this.f39659N1) {
            return;
        }
        this.f39649D1--;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: j0 */
    public final void mo12188j0() {
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            ksaVar.mo15671h();
            if (this.f39663R1 == -9223372036854775807L) {
                this.f39663R1 = this.f68730S0.f67278b;
            }
            this.f39681q1.mo15670g(-this.f39663R1);
        } else {
            this.f39672h1.m25266e(2);
        }
        this.f39665T1 = true;
        m12165M0();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: k */
    public final String mo4257k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: k0 */
    public final void mo12189k0(m32 m32Var) {
        ByteBuffer byteBuffer;
        b64 b64Var = this.f39674j1;
        if (b64Var != null) {
            vt5 vt5Var = this.f68761p0;
            vt5Var.getClass();
            if (vt5Var.f65882b.equals("video/av01") && m32Var.m3751d(1) && (byteBuffer = m32Var.f50500e) != null) {
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, iPosition + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) b64Var.f8006a;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }
        this.f39666U1 = 0;
        int iMo12168P = mo12168P(m32Var);
        if ((Build.VERSION.SDK_INT < 34 || (iMo12168P & 32) == 0) && !this.f39659N1) {
            this.f39649D1++;
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: m */
    public final boolean mo4258m() {
        if (!this.f68720N0) {
            return false;
        }
        ksa ksaVar = this.f39681q1;
        return ksaVar == null || ksaVar.mo15666c();
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: m0 */
    public final boolean mo12190m0(long j, long j2, st5 st5Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0713b c0713b) {
        int i4;
        st5Var.getClass();
        long j4 = j3 - this.f68730S0.f67279c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f39677m1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        m12174S0(i5, 0);
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            if (!z || z2) {
                return ksaVar.mo15675l(j3, new cu5(this, st5Var, i, j4));
            }
            m12173R0(st5Var, i);
            return true;
        }
        int iM25262a = this.f39672h1.m25262a(j3, j, j2, this.f68730S0.f67278b, z, z2, this.f39673i1);
        at2 at2Var = this.f39673i1;
        zpa zpaVar = this.f39676l1;
        if (zpaVar != null && iM25262a != 5 && iM25262a != 4) {
            zpaVar.m25736a(j3, at2Var.f7454a);
        }
        if (iM25262a == 0) {
            this.f69501g.getClass();
            long jNanoTime = System.nanoTime();
            wpa wpaVar = this.f39662Q1;
            if (wpaVar != null) {
                wpaVar.mo12219c(j4, jNanoTime, c0713b, this.f68756k0);
            }
            m12166N0(st5Var, i, jNanoTime);
            m12177U0(at2Var.f7454a);
            return true;
        }
        if (iM25262a == 1) {
            long j5 = at2Var.f7455b;
            long j6 = at2Var.f7454a;
            if (j5 == this.f39655J1) {
                m12173R0(st5Var, i);
            } else {
                wpa wpaVar2 = this.f39662Q1;
                if (wpaVar2 != null) {
                    i4 = i;
                    wpaVar2.mo12219c(j4, j5, c0713b, this.f68756k0);
                } else {
                    i4 = i;
                }
                m12166N0(st5Var, i4, j5);
            }
            m12177U0(j6);
            this.f39655J1 = j5;
            return true;
        }
        if (iM25262a == 2) {
            g8d.m12416a("dropVideoBuffer");
            st5Var.mo10720h(i);
            g8d.m12417b();
            m12174S0(0, 1);
            m12177U0(at2Var.f7454a);
            return true;
        }
        if (iM25262a == 3) {
            m12173R0(st5Var, i);
            m12177U0(at2Var.f7454a);
            return true;
        }
        if (iM25262a != 4 && iM25262a != 5) {
            C3386nv.m17633t(String.valueOf(iM25262a));
        }
        return false;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: o */
    public final boolean mo4259o() {
        boolean z;
        boolean zMo4198a;
        if (this.f68743Z == null) {
            z = false;
        } else {
            if (m24993l()) {
                zMo4198a = this.f69490I;
            } else {
                zk8 zk8Var = this.f69503i;
                zk8Var.getClass();
                zMo4198a = zk8Var.mo4198a();
            }
            if (!zMo4198a && this.f68770y0 < 0) {
                if (this.f68768w0 != -9223372036854775807L) {
                    this.f69501g.getClass();
                    if (SystemClock.elapsedRealtime() < this.f68768w0) {
                    }
                }
                z = false;
            }
            z = true;
        }
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            return ksaVar.mo15681r(z);
        }
        if (z && (this.f68754i0 == null || this.f39659N1)) {
            return true;
        }
        return this.f39672h1.m25263b(z);
    }

    @Override // p000.xt5, p000.y90
    /* JADX INFO: renamed from: p */
    public final void mo4260p() {
        l32 l32Var;
        C3165jz c3165jz = this.f39669e1;
        this.f39657L1 = null;
        this.f39664S1 = -9223372036854775807L;
        m12165M0();
        this.f39688x1 = false;
        this.f39661P1 = null;
        int i = 1;
        this.f39652G1 = true;
        try {
            super.mo4260p();
            l32Var = this.f68728R0;
            c3165jz.getClass();
            synchronized (l32Var) {
            }
        } finally {
            l32Var = this.f68728R0;
            c3165jz.getClass();
            synchronized (l32Var) {
                Handler handler = c3165jz.f46413a;
                if (handler != null) {
                    handler.post(new gsa(c3165jz, l32Var, i));
                }
                c3165jz.m14752b(lsa.f50084d);
            }
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: p0 */
    public final void mo12191p0() {
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            ksaVar.mo15671h();
        } else {
            long j = this.f68730S0.f67281e;
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: q */
    public final void mo4261q(boolean z, boolean z2) {
        this.f68728R0 = new l32();
        b68 b68Var = this.f69498d;
        b68Var.getClass();
        boolean z3 = b68Var.f8020b;
        int i = 0;
        bna.m3987z((z3 && this.f39660O1 == 0) ? false : true);
        if (this.f39659N1 != z3) {
            this.f39659N1 = z3;
            m24695o0();
        }
        l32 l32Var = this.f68728R0;
        C3165jz c3165jz = this.f39669e1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new gsa(c3165jz, l32Var, i));
        }
        boolean z4 = this.f39682r1;
        ypa ypaVar = this.f39672h1;
        if (!z4) {
            if (this.f39684t1 != null && this.f39681q1 == null) {
                t97 t97Var = new t97(this.f39667c1, ypaVar);
                t97Var.m21910d();
                long j = this.f39675k1;
                t97Var.m21908b(j != -9223372036854775807L ? -j : -9223372036854775807L);
                mp9 mp9Var = this.f69501g;
                mp9Var.getClass();
                t97Var.m21909c(mp9Var);
                z97 z97VarM21907a = t97Var.m21907a();
                z97VarM21907a.m25515b();
                this.f39681q1 = z97VarM21907a.m25514a();
            }
            this.f39682r1 = true;
        }
        ksa ksaVar = this.f39681q1;
        if (ksaVar == null) {
            mp9 mp9Var2 = this.f69501g;
            mp9Var2.getClass();
            ypaVar.f70274l = mp9Var2;
            ypaVar.m25266e(!z2 ? 1 : 0);
            return;
        }
        ksaVar.mo15668e(new bu5(this), AbstractC1120j.m6404a());
        wpa wpaVar = this.f39662Q1;
        if (wpaVar != null) {
            this.f39681q1.mo15682s(wpaVar);
        }
        if (this.f39685u1 != null && !this.f39687w1.equals(v89.f65026c)) {
            this.f39681q1.mo15684u(this.f39685u1, this.f39687w1);
        }
        this.f39681q1.mo15672i(this.f39690z1);
        this.f39681q1.mo15673j(this.f68752g0);
        List list = this.f39684t1;
        if (list != null) {
            this.f39681q1.mo15678o(list);
        }
        this.f39683s1 = !z2 ? 1 : 0;
        this.f68736V0 = true;
    }

    @Override // p000.xt5, p000.y90
    /* JADX INFO: renamed from: r */
    public final void mo4262r(long j, boolean z, boolean z2) {
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null && !z) {
            ksaVar.mo15677n(true);
        }
        if (z2) {
            this.f39651F1 = j;
        }
        super.mo4262r(j, z, z2);
        ksa ksaVar2 = this.f39681q1;
        ypa ypaVar = this.f39672h1;
        if (ksaVar2 == null) {
            ypaVar.f70264b.m10590b();
            ypaVar.f70270h = -9223372036854775807L;
            ypaVar.f70268f = -9223372036854775807L;
            ypaVar.f70267e = Math.min(ypaVar.f70267e, 1);
            ypaVar.f70271i = -9223372036854775807L;
            ypaVar.f70276n = false;
        }
        zpa zpaVar = this.f39676l1;
        if (zpaVar != null) {
            zpaVar.m25737b();
        }
        if (z) {
            ksa ksaVar3 = this.f39681q1;
            if (ksaVar3 != null) {
                ksaVar3.mo15680q(false);
            } else {
                ypaVar.m25264c(false);
            }
        }
        m12165M0();
        this.f39648C1 = 0;
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: r0 */
    public final void mo12192r0() {
        super.mo12192r0();
        this.f39677m1.clear();
        this.f39649D1 = 0;
        this.f39666U1 = 0;
        this.f39652G1 = false;
        b64 b64Var = this.f39674j1;
        if (b64Var != null) {
            b64Var.f8007b = null;
            ByteBuffer byteBuffer = (ByteBuffer) b64Var.f8006a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: s */
    public final void mo4263s() {
        ksa ksaVar = this.f39681q1;
        if (ksaVar == null || !this.f39668d1) {
            return;
        }
        ksaVar.mo15664a();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: t */
    public final void mo4264t() {
        try {
            try {
                this.f68707B0 = false;
                m24696q0();
                m24695o0();
                web.m23861M(this.f68748c0, null);
                this.f68748c0 = null;
                this.f39682r1 = false;
                this.f39663R1 = -9223372036854775807L;
                PlaceholderSurface placeholderSurface = this.f39686v1;
                if (placeholderSurface != null) {
                    placeholderSurface.release();
                    this.f39686v1 = null;
                }
            } catch (Throwable th) {
                web.m23861M(this.f68748c0, null);
                this.f68748c0 = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.f39682r1 = false;
            this.f39663R1 = -9223372036854775807L;
            PlaceholderSurface placeholderSurface2 = this.f39686v1;
            if (placeholderSurface2 != null) {
                placeholderSurface2.release();
                this.f39686v1 = null;
            }
            throw th2;
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: u */
    public final void mo12193u() {
        this.f39647B1 = 0;
        this.f69501g.getClass();
        this.f39646A1 = SystemClock.elapsedRealtime();
        this.f39653H1 = 0L;
        this.f39654I1 = 0;
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            ksaVar.mo15669f();
        } else {
            this.f39672h1.m25265d();
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: v */
    public final void mo12194v() {
        m12164L0();
        int i = this.f39654I1;
        if (i != 0) {
            long j = this.f39653H1;
            C3165jz c3165jz = this.f39669e1;
            Handler handler = c3165jz.f46413a;
            if (handler != null) {
                handler.post(new esa(i, j, c3165jz));
            }
            this.f39653H1 = 0L;
            this.f39654I1 = 0;
        }
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            ksaVar.mo15667d();
        } else {
            ypa ypaVar = this.f39672h1;
            ypaVar.f70266d = false;
            ypaVar.f70271i = -9223372036854775807L;
            dqa dqaVar = ypaVar.f70264b;
            dqaVar.f36044d = false;
            aqa aqaVar = dqaVar.f36043c;
            if (aqaVar != null) {
                aqaVar.mo2994c();
            }
            dqaVar.m10589a();
        }
        zpa zpaVar = this.f39676l1;
        if (zpaVar != null) {
            zpaVar.m25737b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:88:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    @Override // p000.xt5
    /* JADX INFO: renamed from: v0 */
    public final boolean mo12195v0(m32 m32Var) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        C0715b c0715b;
        C0714a c0714aM2522b;
        boolean z2 = false;
        if (!m12163K0(m32Var)) {
            long j = m32Var.f50502g;
            boolean z3 = j < this.f69506l;
            zpa zpaVar = this.f39676l1;
            if (zpaVar != null) {
                long j2 = zpaVar.f71941a;
                long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : (long) (((j - j2) * zpaVar.f71943c) + zpaVar.f71942b);
                if (j3 == -9223372036854775807L || j3 >= this.f39675k1) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !m32Var.m3751d(268435456)) {
                if (!m32Var.m3751d(67108864)) {
                    b64 b64Var = this.f39674j1;
                    if (b64Var != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) b64Var.f8006a;
                        vt5 vt5Var = this.f68761p0;
                        vt5Var.getClass();
                        if (vt5Var.f65882b.equals("video/av01") && (byteBuffer = m32Var.f50500e) != null) {
                            boolean z4 = z3 || this.f39666U1 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                b64Var.m3370w(dtb.m10643a(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListM10643a = dtb.m10643a(byteBufferAsReadOnlyBuffer);
                            b64Var.m3370w(arrayListM10643a);
                            int size = arrayListM10643a.size() - 1;
                            int i = 0;
                            while (size >= 0) {
                                tp6 tp6Var = (tp6) arrayListM10643a.get(size);
                                int i2 = tp6Var.f62698a;
                                if (i2 != 2 && i2 != 15 && ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (c0715b = (C0715b) b64Var.f8007b) == null || (c0714aM2522b = C0714a.m2522b(c0715b, tp6Var)) == null || c0714aM2522b.m2523a()))) {
                                    break;
                                }
                                if (((tp6) arrayListM10643a.get(size)).f62698a == 6 || ((tp6) arrayListM10643a.get(size)).f62698a == 3) {
                                    i++;
                                }
                                size--;
                            }
                            if (i > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((tp6) arrayListM10643a.get(size)).f62699b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                m32Var.mo16607k();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                C3283l2 c3283l2 = this.f39678n1;
                                c3283l2.getClass();
                                if (c3283l2.f48910c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !m32Var.m3751d(1073741824)) {
                                    ByteBuffer byteBuffer3 = m32Var.f50500e;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (z3) {
                            this.f68728R0.f48971d++;
                            return z2;
                        }
                        this.f39677m1.add(Long.valueOf(m32Var.f50502g));
                        this.f39666U1++;
                    }
                    return z2;
                }
                m32Var.mo16607k();
                z2 = true;
                if (z2) {
                    if (z3) {
                        this.f68728R0.f48971d++;
                        return z2;
                    }
                    this.f39677m1.add(Long.valueOf(m32Var.f50502g));
                    this.f39666U1++;
                }
                return z2;
            }
        }
        return false;
    }

    @Override // p000.xt5, p000.y90
    /* JADX INFO: renamed from: w */
    public final void mo4265w(C0713b[] c0713bArr, long j, long j2, jv5 jv5Var) {
        super.mo4265w(c0713bArr, j, j2, jv5Var);
        m12175T0(jv5Var);
        zpa zpaVar = this.f39676l1;
        if (zpaVar != null) {
            zpaVar.m25737b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    @Override // p000.xt5
    /* JADX INFO: renamed from: w0 */
    public final boolean mo12196w0() {
        boolean z;
        C0713b c0713b = this.f68755j0;
        long j = this.f39664S1;
        if (j != -9223372036854775807L) {
            if (this.f68740X0 + 1 + j > Long.MAX_VALUE - (this.f68730S0.f67279c + j)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.f39650E1 == null || this.f39652G1 || this.f39659N1 || (c0713b != null && c0713b.f6408q > 0) || z || this.f68730S0.f67281e != -9223372036854775807L;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: x */
    public final void mo12197x() {
        jv5 jv5Var = this.f69493L;
        if (jv5Var != null) {
            m12175T0(jv5Var);
        }
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: x0 */
    public final boolean mo12198x0(vt5 vt5Var) {
        return m12162J0(vt5Var);
    }

    @Override // p000.xt5
    /* JADX INFO: renamed from: y0 */
    public final boolean mo12199y0() {
        vt5 vt5Var = this.f68761p0;
        if (this.f39681q1 != null && vt5Var != null) {
            String str = vt5Var.f65881a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo12199y0();
    }

    @Override // p000.xt5, p000.y90
    /* JADX INFO: renamed from: z */
    public final void mo4266z(long j, long j2) throws ExoPlaybackException {
        ksa ksaVar = this.f39681q1;
        if (ksaVar != null) {
            try {
                ksaVar.mo15679p(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw m24992g(e, e.f6514a, false, 7001);
            }
        }
        super.mo4266z(j, j2);
    }
}
