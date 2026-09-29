package p000;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.C0713b;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class rm8 implements wpa, im0 {

    /* JADX INFO: renamed from: H */
    public byte[] f59541H;

    /* JADX INFO: renamed from: i */
    public int f59550i;

    /* JADX INFO: renamed from: j */
    public SurfaceTexture f59551j;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f59542a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f59543b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final pn7 f59544c = new pn7();

    /* JADX INFO: renamed from: d */
    public final nc0 f59545d = new nc0(1);

    /* JADX INFO: renamed from: e */
    public final gh1 f59546e = new gh1(3);

    /* JADX INFO: renamed from: f */
    public final gh1 f59547f = new gh1(3);

    /* JADX INFO: renamed from: g */
    public final float[] f59548g = new float[16];

    /* JADX INFO: renamed from: h */
    public final float[] f59549h = new float[16];

    /* JADX INFO: renamed from: k */
    public volatile int f59552k = 0;

    /* JADX INFO: renamed from: l */
    public int f59553l = -1;

    @Override // p000.im0
    /* JADX INFO: renamed from: a */
    public final void mo12217a() {
        this.f59546e.m12624c();
        nc0 nc0Var = this.f59545d;
        ((gh1) nc0Var.f52587e).m12624c();
        nc0Var.f52584b = false;
        this.f59543b.set(true);
    }

    @Override // p000.im0
    /* JADX INFO: renamed from: b */
    public final void mo12218b(float[] fArr, long j) {
        ((gh1) this.f59545d.f52587e).m12622a(fArr, j);
    }

    @Override // p000.wpa
    /* JADX INFO: renamed from: c */
    public final void mo12219c(long j, long j2, C0713b c0713b, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListM19146a;
        this.f59546e.m12622a(Long.valueOf(j), j2);
        byte[] bArr = c0713b.f6377C;
        int i2 = c0713b.f6378D;
        byte[] bArr2 = this.f59541H;
        int i3 = this.f59553l;
        this.f59541H = bArr;
        if (i2 == -1) {
            i2 = this.f59552k;
        }
        this.f59553l = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.f59541H)) {
            return;
        }
        byte[] bArr3 = this.f59541H;
        on7 on7Var = null;
        if (bArr3 != null) {
            int i4 = this.f59553l;
            k47 k47Var = new k47(bArr3);
            try {
                k47Var.m14819N(4);
                int iM14829m = k47Var.m14829m();
                k47Var.m14818M(0);
                if (iM14829m == 1886547818) {
                    k47Var.m14819N(8);
                    int i5 = k47Var.f46701b;
                    int i6 = k47Var.f46702c;
                    while (true) {
                        if (i5 < i6) {
                            int iM14829m2 = k47Var.m14829m() + i5;
                            if (iM14829m2 > i5 && iM14829m2 <= i6) {
                                int iM14829m3 = k47Var.m14829m();
                                if (iM14829m3 != 2037673328 && iM14829m3 != 1836279920) {
                                    k47Var.m14818M(iM14829m2);
                                    i5 = iM14829m2;
                                }
                                k47Var.m14817L(iM14829m2);
                                arrayListM19146a = phc.m19146a(k47Var);
                            }
                        }
                        arrayListM19146a = null;
                    }
                } else {
                    arrayListM19146a = phc.m19146a(k47Var);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListM19146a != null) {
                int size = arrayListM19146a.size();
                if (size == 1) {
                    nn7 nn7Var = (nn7) arrayListM19146a.get(0);
                    on7Var = new on7(nn7Var, nn7Var, i4);
                } else if (size == 2) {
                    on7Var = new on7((nn7) arrayListM19146a.get(0), (nn7) arrayListM19146a.get(1), i4);
                }
            }
        }
        if (on7Var == null || !pn7.m19409b(on7Var)) {
            int i7 = this.f59553l;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i10 * f) - f3;
                i = i10 + 1;
                float f5 = (i * f) - f3;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f6 = radians;
                        float f7 = i11 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i13 == 0 ? f4 : f5;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f9 = f;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f7 / f8;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f9) / f6;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i11++;
                    i = i12;
                }
            }
            nn7 nn7Var2 = new nn7(new xh0(0, 1, fArr, fArr2));
            on7Var = new on7(nn7Var2, nn7Var2, i7);
        }
        this.f59547f.m12622a(on7Var, j2);
    }

    /* JADX INFO: renamed from: d */
    public final SurfaceTexture m20716d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            oed.m17953a();
            this.f59544c.m19410a();
            oed.m17953a();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            oed.m17953a();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            oed.m17953a();
            GLES20.glTexParameteri(36197, 10240, 9729);
            oed.m17953a();
            GLES20.glTexParameteri(36197, 10241, 9729);
            oed.m17953a();
            GLES20.glTexParameteri(36197, 10242, 33071);
            oed.m17953a();
            GLES20.glTexParameteri(36197, 10243, 33071);
            oed.m17953a();
            this.f59550i = i;
        } catch (GlUtil$GlException e) {
            ss5.m21724v("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f59550i);
        this.f59551j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: qm8
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f57948a.f59542a.set(true);
            }
        });
        return this.f59551j;
    }
}
