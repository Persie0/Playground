package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iia implements ipk {

    /* JADX INFO: renamed from: a */
    private final ldf f31043a;

    /* JADX INFO: renamed from: b */
    private final lec f31044b;

    /* JADX INFO: renamed from: c */
    private final lby f31045c;

    /* JADX INFO: renamed from: d */
    private final lea f31046d;

    /* JADX INFO: renamed from: e */
    private final kbz f31047e;

    /* JADX INFO: renamed from: f */
    private final ihz f31048f;

    /* JADX INFO: renamed from: g */
    private ldz f31049g;

    /* JADX INFO: renamed from: h */
    private ldz f31050h;

    /* JADX INFO: renamed from: i */
    private lbm f31051i;

    /* JADX INFO: renamed from: j */
    private final float[] f31052j = new float[128];

    /* JADX INFO: renamed from: k */
    private final float[] f31053k = new float[128];

    /* JADX INFO: renamed from: l */
    private final float[] f31054l = new float[128];

    /* JADX INFO: renamed from: m */
    private final float[] f31055m = new float[128];

    /* JADX INFO: renamed from: n */
    private final ldx f31056n;

    /* JADX INFO: renamed from: o */
    private final ldx f31057o;

    public iia(lby lbyVar, ihz ihzVar, kbz kbzVar) {
        this.f31045c = lbyVar;
        this.f31046d = lea.m15230a(lbyVar);
        this.f31048f = ihzVar;
        this.f31047e = kbzVar;
        ead eadVar = new ead(lbyVar, 12);
        this.f31043a = eadVar.m6994a();
        this.f31044b = lec.m15239e(eadVar.f13038a, led.m15244b(eadVar.f13041d), led.m15243a(eadVar.f13040c));
        this.f31056n = m11375e(lbyVar, "#version 320 es\nprecision highp float;\nuniform sampler2D uImgTex;\nuniform int weightLen;\nuniform float weight[128];\nuniform float offsetX[128];\nuniform float offsetY[128];\nin vec2 texCoord;\nout vec4 outColor;\nvoid main() {\n  vec4 fc = texture(uImgTex, texCoord) * weight[0];\n  for (int i = 1; i < weightLen; i++) {\n    fc += texture(uImgTex, texCoord + vec2(offsetX[i], offsetY[i])) * weight[i];\n  }\n  for (int i = 1; i < weightLen; i++) {\n    fc += texture(uImgTex, texCoord - vec2(offsetX[i], offsetY[i])) * weight[i];\n  }\n  outColor = fc;\n}\n");
        this.f31057o = m11375e(lbyVar, "#version 320 es\n#extension GL_EXT_YUV_target : require\nprecision highp float;\nuniform float fade;\nuniform sampler2D uImgTex;\nin vec2 texCoord;\nlayout(yuv) out vec4 outColor;\nvoid main() {\n  outColor =     vec4(rgb_2_yuv(texture(uImgTex, texCoord).xyz * fade, itu_601_full_range), 1.0);\n}");
    }

    /* JADX INFO: renamed from: d */
    private final void m11374d() {
        if (this.f31049g == null) {
            lku.m15613H(this.f31050h == null);
            return;
        }
        this.f31047e.mo13961e("closeTextures");
        ldz ldzVar = this.f31049g;
        ldzVar.getClass();
        ldzVar.close();
        ldz ldzVar2 = this.f31050h;
        ldzVar2.getClass();
        ldzVar2.close();
        this.f31049g = null;
        this.f31050h = null;
        this.f31047e.mo13962f();
    }

    /* JADX INFO: renamed from: e */
    private static ldx m11375e(lby lbyVar, String str) {
        ldx ldxVarM15219h = ldx.m15219h(lbyVar, "#version 320 es\nin vec4 aPosition;\nin vec2 aTexCoord;\nuniform float zoomFactor;\nout vec2 texCoord;\nvoid main() {\n  texCoord = aTexCoord;\n  gl_Position = vec4(zoomFactor * aPosition.xyz, aPosition.w);\n}");
        ldx ldxVarM15217b = ldx.m15217b(lbyVar, str);
        lpe lpeVarM15225o = ldx.m15225o(lbyVar);
        lpeVarM15225o.m15804b(kua.m14876o(ldxVarM15219h));
        lpeVarM15225o.m15804b(kua.m14876o(ldxVarM15217b));
        return lpeVarM15225o.m15806d();
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: a */
    public final ipl mo3652a() {
        return ipl.BLUR;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: b */
    public final lby mo3653b() {
        return this.f31045c;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3654c() {
        return kbd.m13925n(this);
    }

    @Override // p000.ipk, p000.kba, java.lang.AutoCloseable
    public final void close() {
        m11374d();
        this.f31056n.close();
        this.f31057o.close();
        this.f31046d.close();
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo3662k() {
        return false;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo3663l(kpw kpwVar, kpw kpwVar2) {
        return kbd.m13926o(this, kpwVar, kpwVar2);
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int mo3664m(key keyVar, kgg kggVar, key keyVar2) {
        return kbd.m13927p(this, keyVar, kggVar, keyVar2);
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: n */
    public final int mo3665n(lcy lcyVar, ldx ldxVar) throws IllegalAccessException, InvocationTargetException {
        String str = "offsetX";
        String str2 = "weight";
        if (!((Boolean) this.f31048f.f31027a.f34942d).booleanValue()) {
            m11374d();
            return 2;
        }
        this.f31047e.mo13961e("Launch: radius=".concat(String.valueOf(String.valueOf(this.f31048f.f31028b.f34942d))));
        ihz ihzVar = this.f31048f;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        long j = ihzVar.f31032f;
        if (j == 0) {
            if (ihzVar.f31033g == 0) {
                ihzVar.f31032f = millis;
                j = millis;
            } else {
                j = 0;
            }
        }
        lku.m15669w(millis >= j);
        ihzVar.f31033g = millis;
        ihzVar.m11373a();
        boolean z = !((Boolean) this.f31048f.f31027a.f34942d).booleanValue();
        if (this.f31049g == null) {
            this.f31047e.mo13961e("allocateTextures");
            lku.m15613H(this.f31049g == null);
            lku.m15613H(this.f31050h == null);
            kzh kzhVar = lcyVar.m15193g().f37877a;
            float f = this.f31048f.f31031e;
            lbm lbmVar = new lbm(new kzh(Math.round(kzhVar.m15089b() * f), Math.round(kzhVar.m15088a() * f)));
            this.f31049g = ldz.m15227g(this.f31045c, lbmVar);
            this.f31050h = ldz.m15227g(this.f31045c, lbmVar);
            this.f31051i = lbmVar;
            this.f31047e.mo13962f();
        }
        this.f31047e.mo13961e("prep");
        ldz ldzVar = this.f31049g;
        ldzVar.getClass();
        ldz ldzVar2 = this.f31050h;
        ldzVar2.getClass();
        int iM14978X = kxk.m14978X(((Integer) this.f31048f.f31028b.f34942d).intValue(), 1, 128);
        lbm lbmVar2 = this.f31051i;
        lbmVar2.getClass();
        float fM15089b = lbmVar2.f37877a.m15089b();
        lbm lbmVar3 = this.f31051i;
        lbmVar3.getClass();
        float fM15088a = lbmVar3.f37877a.m15088a();
        int i = 0;
        while (i < iM14978X) {
            float f2 = 1.0f / fM15088a;
            float f3 = fM15088a;
            float f4 = i;
            this.f31053k[i] = (1.0f / fM15089b) * f4;
            this.f31054l[i] = f2 * f4;
            i++;
            fM15089b = fM15089b;
            fM15088a = f3;
        }
        float[] fArr = this.f31055m;
        float f5 = 0.0f;
        int i2 = 0;
        while (i2 < iM14978X) {
            boolean z2 = z;
            float f6 = (2.0f / iM14978X) * i2;
            float f7 = (-(f6 * f6)) / 2.0f;
            String str3 = str;
            String str4 = str2;
            float fExp = (float) Math.exp(f7);
            fArr[i2] = fExp;
            if (i2 != 0) {
                fExp += fExp;
            }
            f5 += fExp;
            i2++;
            str = str3;
            str2 = str4;
            z = z2;
        }
        String str5 = str;
        String str6 = str2;
        boolean z3 = z;
        for (int i3 = 0; i3 < iM14978X; i3++) {
            fArr[i3] = fArr[i3] / f5;
        }
        this.f31047e.mo13962f();
        this.f31047e.mo13961e("downscale");
        ldx ldxVarM15223m = ldx.m15223m(kua.m14875n(ldzVar));
        try {
            this.f31046d.m15235e(lcyVar, ldxVarM15223m);
            ldxVarM15223m.close();
            this.f31047e.mo13962f();
            this.f31047e.mo13961e("hblur");
            ldx ldxVarM15223m2 = ldx.m15223m(kua.m14875n(ldzVar2));
            try {
                lct lctVarM15890c = lct.m15170j(this.f31044b, this.f31043a).m15890c(this.f31056n);
                lctVarM15890c.m15171a("aPosition", 0);
                lctVarM15890c.m15171a("aTexCoord", 1);
                lctVarM15890c.m15174d("zoomFactor", 1.0f);
                lctVarM15890c.m15176f(iM14978X);
                lctVarM15890c.m15175e(str6, this.f31055m);
                lctVarM15890c.m15175e(str5, this.f31053k);
                lctVarM15890c.m15175e("offsetY", this.f31052j);
                lctVarM15890c.m15173c("uImgTex", ldzVar);
                lctVarM15890c.m15179k(ldxVarM15223m2);
                ldxVarM15223m2.close();
                this.f31047e.mo13962f();
                this.f31047e.mo13961e("vblur");
                ldx ldxVarM15223m3 = ldx.m15223m(kua.m14875n(ldzVar));
                try {
                    lct lctVarM15890c2 = lct.m15170j(this.f31044b, this.f31043a).m15890c(this.f31056n);
                    lctVarM15890c2.m15171a("aPosition", 0);
                    lctVarM15890c2.m15171a("aTexCoord", 1);
                    lctVarM15890c2.m15174d("zoomFactor", 1.0f);
                    lctVarM15890c2.m15176f(iM14978X);
                    lctVarM15890c2.m15175e(str6, this.f31055m);
                    lctVarM15890c2.m15175e(str5, this.f31052j);
                    lctVarM15890c2.m15175e("offsetY", this.f31054l);
                    lctVarM15890c2.m15173c("uImgTex", ldzVar2);
                    lctVarM15890c2.m15179k(ldxVarM15223m3);
                    ldxVarM15223m3.close();
                    this.f31047e.mo13962f();
                    this.f31047e.mo13961e("upscale");
                    lct lctVarM15890c3 = lct.m15170j(this.f31044b, this.f31043a).m15890c(this.f31057o);
                    lctVarM15890c3.m15171a("aPosition", 0);
                    lctVarM15890c3.m15171a("aTexCoord", 1);
                    lctVarM15890c3.m15174d("zoomFactor", ((Float) this.f31048f.f31029c.f34942d).floatValue());
                    lctVarM15890c3.m15174d("fade", ((Float) this.f31048f.f31030d.f34942d).floatValue());
                    lctVarM15890c3.m15173c("uImgTex", ldzVar2);
                    lctVarM15890c3.m15179k(ldxVar);
                    this.f31047e.mo13962f();
                    if (z3) {
                        m11374d();
                    }
                    this.f31047e.mo13962f();
                    return 1;
                } catch (Throwable th) {
                    try {
                        ldxVarM15223m3.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    ldxVarM15223m2.close();
                    throw th3;
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            try {
                ldxVarM15223m.close();
                throw th5;
            } catch (Throwable th6) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                throw th5;
            }
        }
    }
}
