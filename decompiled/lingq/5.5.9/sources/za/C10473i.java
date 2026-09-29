package za;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;
import p479xa.C10157z;
import p505ya.InterfaceC10327i;

/* JADX INFO: renamed from: za.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10473i implements InterfaceC10327i, InterfaceC10465a {

    /* JADX INFO: renamed from: H */
    public byte[] f52372H;

    /* JADX INFO: renamed from: i */
    public int f52381i;

    /* JADX INFO: renamed from: j */
    public SurfaceTexture f52382j;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f52373a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f52374b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final C10471g f52375c = new C10471g();

    /* JADX INFO: renamed from: d */
    public final C10467c f52376d = new C10467c();

    /* JADX INFO: renamed from: e */
    public final C10157z<Long> f52377e = new C10157z<>();

    /* JADX INFO: renamed from: f */
    public final C10157z<C10469e> f52378f = new C10157z<>();

    /* JADX INFO: renamed from: g */
    public final float[] f52379g = new float[16];

    /* JADX INFO: renamed from: h */
    public final float[] f52380h = new float[16];

    /* JADX INFO: renamed from: k */
    public volatile int f52383k = 0;

    /* JADX INFO: renamed from: l */
    public int f52384l = -1;

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m19424a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.m7476b();
            this.f52375c.m19423a();
            GlUtil.m7476b();
            GlUtil.m7477c("No current context", !C10134c0.m19034a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.m7476b();
            int i10 = iArr[0];
            GlUtil.m7475a(36197, i10);
            this.f52381i = i10;
        } catch (GlUtil.GlException e10) {
            C10145n.m19096d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f52381i);
        this.f52382j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: za.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f52371a.f52373a.set(true);
            }
        });
        return this.f52382j;
    }

    @Override // za.InterfaceC10465a
    /* JADX INFO: renamed from: b */
    public final void mo7057b(long j10, float[] fArr) {
        this.f52376d.f52338c.m19165a(j10, fArr);
    }

    @Override // za.InterfaceC10465a
    /* JADX INFO: renamed from: j */
    public final void mo7058j() {
        this.f52377e.m19166b();
        C10467c c10467c = this.f52376d;
        c10467c.f52338c.m19166b();
        c10467c.f52339d = false;
        this.f52374b.set(true);
    }

    @Override // p505ya.InterfaceC10327i
    /* JADX INFO: renamed from: l */
    public final void mo7059l(long j10, long j11, C2416m c2416m, MediaFormat mediaFormat) {
        float f3;
        float f10;
        int i10;
        int i11;
        ArrayList<C10469e.a> arrayListM19421a;
        this.f52377e.m19165a(j11, Long.valueOf(j10));
        byte[] bArr = c2416m.f12460Q;
        int i12 = c2416m.f12461R;
        byte[] bArr2 = this.f52372H;
        int i13 = this.f52384l;
        this.f52372H = bArr;
        if (i12 == -1) {
            i12 = this.f52383k;
        }
        this.f52384l = i12;
        if (i13 == i12 && Arrays.equals(bArr2, this.f52372H)) {
            return;
        }
        byte[] bArr3 = this.f52372H;
        C10469e c10469e = null;
        if (bArr3 != null) {
            int i14 = this.f52384l;
            C10151t c10151t = new C10151t(bArr3);
            try {
                c10151t.m19125F(4);
                int iM19129d = c10151t.m19129d();
                c10151t.m19124E(0);
                if (iM19129d == 1886547818) {
                    c10151t.m19125F(8);
                    int i15 = c10151t.f51439b;
                    int i16 = c10151t.f51440c;
                    while (true) {
                        if (i15 < i16) {
                            int iM19129d2 = c10151t.m19129d() + i15;
                            if (iM19129d2 > i15 && iM19129d2 <= i16) {
                                int iM19129d3 = c10151t.m19129d();
                                if (iM19129d3 != 2037673328 && iM19129d3 != 1836279920) {
                                    c10151t.m19124E(iM19129d2);
                                    i15 = iM19129d2;
                                }
                                c10151t.m19123D(iM19129d2);
                                arrayListM19421a = C10470f.m19421a(c10151t);
                            }
                        }
                        arrayListM19421a = null;
                    }
                } else {
                    arrayListM19421a = C10470f.m19421a(c10151t);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListM19421a != null) {
                int size = arrayListM19421a.size();
                if (size == 1) {
                    C10469e.a aVar = arrayListM19421a.get(0);
                    c10469e = new C10469e(aVar, aVar, i14);
                } else if (size == 2) {
                    c10469e = new C10469e(arrayListM19421a.get(0), arrayListM19421a.get(1), i14);
                }
            }
        }
        if (c10469e == null || !C10471g.m19422b(c10469e)) {
            int i17 = this.f52384l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f11 = radians / 36;
            float f12 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 36; i18 < i21; i21 = 36) {
                float f13 = radians / 2.0f;
                float f14 = (i18 * f11) - f13;
                int i22 = i18 + 1;
                float f15 = (i22 * f11) - f13;
                int i23 = 0;
                while (i23 < 73) {
                    int i24 = i22;
                    int i25 = 0;
                    int i26 = 2;
                    while (i25 < i26) {
                        if (i25 == 0) {
                            f10 = f15;
                            f3 = f14;
                        } else {
                            f3 = f15;
                            f10 = f3;
                        }
                        float f16 = i23 * f12;
                        float f17 = f14;
                        int i27 = i19 + 1;
                        float f18 = f12;
                        double d10 = 50.0f;
                        int i28 = i23;
                        double d11 = (f16 + 3.1415927f) - (radians2 / 2.0f);
                        float f19 = f11;
                        double d12 = f3;
                        int i29 = i17;
                        int i30 = i25;
                        fArr[i19] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        int i31 = i27 + 1;
                        fArr[i27] = (float) (Math.sin(d12) * d10);
                        int i32 = i31 + 1;
                        fArr[i31] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        int i33 = i20 + 1;
                        fArr2[i20] = f16 / radians2;
                        int i34 = i33 + 1;
                        fArr2[i33] = ((i18 + i30) * f19) / radians;
                        if (i28 == 0 && i30 == 0) {
                            i10 = i28;
                            i11 = i30;
                        } else {
                            i10 = i28;
                            i11 = i30;
                            int i35 = (i10 == 72 && i11 == 1) ? 2 : 2;
                            i20 = i34;
                            i19 = i32;
                            i25 = i11 + 1;
                            i23 = i10;
                            i26 = i35;
                            f15 = f10;
                            f12 = f18;
                            f14 = f17;
                            f11 = f19;
                            i17 = i29;
                        }
                        System.arraycopy(fArr, i32 - 3, fArr, i32, 3);
                        i32 += 3;
                        System.arraycopy(fArr2, i34 - 2, fArr2, i34, 2);
                        i34 += 2;
                        i20 = i34;
                        i19 = i32;
                        i25 = i11 + 1;
                        i23 = i10;
                        i26 = i35;
                        f15 = f10;
                        f12 = f18;
                        f14 = f17;
                        f11 = f19;
                        i17 = i29;
                    }
                    i23++;
                    i22 = i24;
                    f14 = f14;
                    i17 = i17;
                }
                i18 = i22;
            }
            C10469e.a aVar2 = new C10469e.a(new C10469e.b(0, 1, fArr, fArr2));
            c10469e = new C10469e(aVar2, aVar2, i17);
        }
        this.f52378f.m19165a(j11, c10469e);
    }
}
