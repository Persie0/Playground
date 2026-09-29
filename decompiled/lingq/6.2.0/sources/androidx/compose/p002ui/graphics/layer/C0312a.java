package androidx.compose.p002ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Locale;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3459pg;
import p000.C3500qj;
import p000.a07;
import p000.an0;
import p000.b07;
import p000.bn0;
import p000.bq1;
import p000.c07;
import p000.e28;
import p000.fb2;
import p000.gq6;
import p000.n84;
import p000.o66;
import p000.omd;
import p000.pc0;
import p000.pk9;
import p000.pm8;
import p000.sp3;
import p000.u8a;
import p000.vi3;
import p000.x89;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0312a {

    /* JADX INFO: renamed from: A */
    public boolean f3975A;

    /* JADX INFO: renamed from: B */
    public RectF f3976B;

    /* JADX INFO: renamed from: a */
    public final sp3 f3977a;

    /* JADX INFO: renamed from: f */
    public Outline f3982f;

    /* JADX INFO: renamed from: j */
    public float f3986j;

    /* JADX INFO: renamed from: k */
    public pk9 f3987k;

    /* JADX INFO: renamed from: l */
    public C3500qj f3988l;

    /* JADX INFO: renamed from: m */
    public C3500qj f3989m;

    /* JADX INFO: renamed from: n */
    public boolean f3990n;

    /* JADX INFO: renamed from: o */
    public an0 f3991o;

    /* JADX INFO: renamed from: p */
    public u8a f3992p;

    /* JADX INFO: renamed from: q */
    public int f3993q;

    /* JADX INFO: renamed from: s */
    public boolean f3995s;

    /* JADX INFO: renamed from: t */
    public long f3996t;

    /* JADX INFO: renamed from: u */
    public long f3997u;

    /* JADX INFO: renamed from: v */
    public int f3998v;

    /* JADX INFO: renamed from: w */
    public int f3999w;

    /* JADX INFO: renamed from: x */
    public int f4000x;

    /* JADX INFO: renamed from: y */
    public int f4001y;

    /* JADX INFO: renamed from: z */
    public long f4002z;

    /* JADX INFO: renamed from: b */
    public fb2 f3978b = bq1.f8854c;

    /* JADX INFO: renamed from: c */
    public LayoutDirection f3979c = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: d */
    public vi3 f3980d = GraphicsLayer$drawBlock$1.f3974b;

    /* JADX INFO: renamed from: e */
    public final vi3 f3981e = new GraphicsLayer$clipDrawBlock$1(this);

    /* JADX INFO: renamed from: g */
    public boolean f3983g = true;

    /* JADX INFO: renamed from: h */
    public long f3984h = 0;

    /* JADX INFO: renamed from: i */
    public long f3985i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final pc0 f3994r = new pc0();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public C0312a(sp3 sp3Var) {
        this.f3977a = sp3Var;
        sp3Var.f61177w = false;
        sp3Var.m21526a();
        this.f3996t = 0L;
        this.f3997u = 0L;
        this.f4002z = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a */
    public final void m1424a() {
        sp3 sp3Var = this.f3977a;
        RenderNode renderNode = sp3Var.f61157c;
        if (this.f3983g) {
            boolean z = this.f3975A;
            if (z || sp3Var.f61170p > 0.0f) {
                C3500qj c3500qj = this.f3988l;
                if (c3500qj != null) {
                    RectF rectF = this.f3976B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f3976B = rectF;
                    }
                    boolean z2 = c3500qj instanceof C3500qj;
                    if (!z2) {
                        C3386nv.m17636w("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = c3500qj.f57839a;
                    path.computeBounds(rectF, false);
                    Outline outline = this.f3982f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f3982f = outline;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        if (!z2) {
                            C3386nv.m17636w("Unable to obtain android.graphics.Path");
                            return;
                        }
                        outline.setPath(path);
                    } else {
                        if (!z2) {
                            C3386nv.m17636w("Unable to obtain android.graphics.Path");
                            return;
                        }
                        outline.setConvexPath(path);
                    }
                    outline.offset(this.f3998v, this.f3999w);
                    this.f3990n = !outline.canClip();
                    this.f3988l = c3500qj;
                    outline.setAlpha(sp3Var.f61162h);
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    renderNode.setOutline(outline);
                    sp3Var.f61161g = true;
                    sp3Var.m21526a();
                    if (this.f3990n && this.f3975A) {
                        sp3Var.f61177w = false;
                        sp3Var.m21526a();
                        renderNode.discardDisplayList();
                    } else {
                        sp3Var.f61177w = this.f3975A;
                        sp3Var.m21526a();
                    }
                } else {
                    sp3Var.f61177w = z;
                    sp3Var.m21526a();
                    Outline outline2 = this.f3982f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f3982f = outline2;
                    }
                    Outline outline3 = outline2;
                    long jM18152h0 = omd.m18152h0(this.f3997u);
                    long j = this.f3984h;
                    long j2 = this.f3985i;
                    if (j2 != 9205357640488583168L) {
                        jM18152h0 = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (jM18152h0 >> 32);
                    int i4 = (int) (jM18152h0 & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), this.f3986j);
                    outline3.setAlpha(sp3Var.f61162h);
                    Math.round(Float.intBitsToFloat(i3));
                    Math.round(Float.intBitsToFloat(i4));
                    renderNode.setOutline(outline3);
                    sp3Var.f61161g = true;
                    sp3Var.m21526a();
                }
            } else {
                sp3Var.f61177w = false;
                sp3Var.m21526a();
                renderNode.setOutline(null);
                sp3Var.f61161g = false;
                sp3Var.m21526a();
            }
        }
        this.f3983g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m1425b() {
        if (this.f3995s && this.f3993q == 0) {
            pc0 pc0Var = this.f3994r;
            C0312a c0312a = (C0312a) pc0Var.f55938b;
            if (c0312a != null) {
                c0312a.f3993q--;
                c0312a.m1425b();
                pc0Var.f55938b = null;
            }
            o66 o66Var = (o66) pc0Var.f55940d;
            if (o66Var != null) {
                Object[] objArr = o66Var.f1303b;
                long[] jArr = o66Var.f1302a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C0312a c0312a2 = (C0312a) objArr[(i << 3) + i3];
                                    c0312a2.f3993q--;
                                    c0312a2.m1425b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                o66Var.m17812e();
            }
            this.f3977a.f61157c.discardDisplayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m1426c(InterfaceC0310a interfaceC0310a) {
        pc0 pc0Var = this.f3994r;
        pc0Var.f55939c = (C0312a) pc0Var.f55938b;
        o66 o66Var = (o66) pc0Var.f55940d;
        if (o66Var != null && o66Var.m725c()) {
            o66 o66Var2 = (o66) pc0Var.f55941e;
            if (o66Var2 == null) {
                o66 o66Var3 = pm8.f56484a;
                o66Var2 = new o66();
                pc0Var.f55941e = o66Var2;
            }
            o66Var2.m17817j(o66Var);
            o66Var.m17812e();
        }
        pc0Var.f55937a = true;
        this.f3980d.invoke(interfaceC0310a);
        pc0Var.f55937a = false;
        C0312a c0312a = (C0312a) pc0Var.f55939c;
        if (c0312a != null) {
            c0312a.f3993q--;
            c0312a.m1425b();
        }
        o66 o66Var4 = (o66) pc0Var.f55941e;
        if (o66Var4 == null || !o66Var4.m725c()) {
            return;
        }
        Object[] objArr = o66Var4.f1303b;
        long[] jArr = o66Var4.f1302a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C0312a c0312a2 = (C0312a) objArr[(i << 3) + i3];
                            c0312a2.f3993q--;
                            c0312a2.m1425b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        o66Var4.m17812e();
    }

    /* JADX INFO: renamed from: d */
    public final pk9 m1427d() {
        pk9 b07Var;
        pk9 pk9Var = this.f3987k;
        C3500qj c3500qj = this.f3988l;
        if (pk9Var != null) {
            return pk9Var;
        }
        if (c3500qj != null) {
            a07 a07Var = new a07(c3500qj);
            this.f3987k = a07Var;
            return a07Var;
        }
        long jM18152h0 = omd.m18152h0(this.f3997u);
        long j = this.f3984h;
        long j2 = this.f3985i;
        if (j2 != 9205357640488583168L) {
            jM18152h0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM18152h0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM18152h0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f3986j;
        if (f > 0.0f) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            b07Var = new c07(omd.m18154j(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
        } else {
            b07Var = new b07(new e28(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f3987k = b07Var;
        return b07Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m1428e(fb2 fb2Var, LayoutDirection layoutDirection, long j, vi3 vi3Var) {
        if (!n84.m17279a(this.f3997u, j)) {
            this.f3997u = j;
            m1433j(this.f3996t, j);
            if (this.f3985i == 9205357640488583168L) {
                this.f3983g = true;
                m1424a();
            }
        }
        this.f3978b = fb2Var;
        this.f3979c = layoutDirection;
        this.f3980d = vi3Var;
        m1429f();
    }

    /* JADX INFO: renamed from: f */
    public final void m1429f() {
        fb2 fb2Var = this.f3978b;
        LayoutDirection layoutDirection = this.f3979c;
        sp3 sp3Var = this.f3977a;
        an0 an0Var = sp3Var.f61156b;
        RenderNode renderNode = sp3Var.f61157c;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        float f = sp3Var.f61178x;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(sp3Var.f61179y)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            bn0 bn0Var = sp3Var.f61155a;
            C3459pg c3459pg = bn0Var.f8709a;
            Canvas canvas = c3459pg.f56079a;
            c3459pg.f56079a = recordingCanvasBeginRecording;
            C3309ls c3309ls = an0Var.f853b;
            c3309ls.m16499S(fb2Var);
            c3309ls.m16500T(layoutDirection);
            c3309ls.f50065c = this;
            c3309ls.m16501U(sp3Var.f61158d);
            c3309ls.m16497Q(c3459pg);
            float f2 = sp3Var.f61178x;
            vi3 vi3Var = this.f3981e;
            if (f2 > 0.0f || sp3Var.f61179y > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                c3459pg.mo17023o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                ((GraphicsLayer$clipDrawBlock$1) vi3Var).invoke(an0Var);
                c3459pg.mo17023o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                ((GraphicsLayer$clipDrawBlock$1) vi3Var).invoke(an0Var);
            }
            bn0Var.f8709a.f56079a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1430g(float f) {
        sp3 sp3Var = this.f3977a;
        if (sp3Var.f61162h == f) {
            return;
        }
        sp3Var.f61162h = f;
        sp3Var.f61157c.setAlpha(f);
    }

    /* JADX INFO: renamed from: h */
    public final void m1431h(int i) {
        sp3 sp3Var = this.f3977a;
        if (sp3Var.f61154G == i) {
            return;
        }
        sp3Var.f61154G = i;
        sp3Var.m21528c();
    }

    /* JADX INFO: renamed from: i */
    public final void m1432i(long j) {
        if (gq6.m12821b(this.f4002z, j)) {
            return;
        }
        this.f4002z = j;
        sp3 sp3Var = this.f3977a;
        sp3Var.f61165k = j;
        sp3Var.m21529d();
    }

    /* JADX INFO: renamed from: j */
    public final void m1433j(long j, long j2) {
        sp3 sp3Var = this.f3977a;
        RenderNode renderNode = sp3Var.f61157c;
        sp3Var.f61151D = (int) (j >> 32);
        sp3Var.f61152E = (int) (j & 4294967295L);
        boolean zM24404a = x89.m24404a(sp3Var.f61158d, omd.m18152h0(j2));
        sp3Var.f61158d = omd.m18152h0(j2);
        sp3Var.m21530e();
        if (zM24404a || !gq6.m12821b(sp3Var.f61165k, 9205357640488583168L)) {
            return;
        }
        renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + sp3Var.f61178x);
        renderNode.setPivotY((((int) (j2 & 4294967295L)) / 2.0f) + sp3Var.f61179y);
    }

    /* JADX INFO: renamed from: k */
    public final void m1434k(long j, long j2, float f) {
        float f2 = this.f3998v;
        long jM12825f = gq6.m12825f(j, (((long) Float.floatToRawIntBits(this.f3999w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (gq6.m12821b(this.f3984h, jM12825f) && x89.m24404a(this.f3985i, j2) && this.f3986j == f && this.f3988l == null) {
            return;
        }
        this.f3987k = null;
        this.f3988l = null;
        this.f3983g = true;
        this.f3990n = false;
        this.f3984h = jM12825f;
        this.f3985i = j2;
        this.f3986j = f;
        m1424a();
    }
}
