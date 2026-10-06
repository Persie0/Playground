package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ign {

    /* JADX INFO: renamed from: D */
    private static final mwx f30817D;

    /* JADX INFO: renamed from: E */
    private static final mwx f30818E;

    /* JADX INFO: renamed from: F */
    private static final mwx f30819F;

    /* JADX INFO: renamed from: a */
    public static boolean f30820a = false;

    /* JADX INFO: renamed from: b */
    public static int f30821b;

    /* JADX INFO: renamed from: c */
    public static int f30822c;

    /* JADX INFO: renamed from: A */
    public final int f30823A;

    /* JADX INFO: renamed from: B */
    public final int f30824B;

    /* JADX INFO: renamed from: C */
    public final int f30825C;

    /* JADX INFO: renamed from: d */
    public final int f30826d;

    /* JADX INFO: renamed from: e */
    public final int f30827e;

    /* JADX INFO: renamed from: f */
    public final int f30828f;

    /* JADX INFO: renamed from: g */
    public final int f30829g;

    /* JADX INFO: renamed from: h */
    public final int f30830h;

    /* JADX INFO: renamed from: i */
    public final int f30831i;

    /* JADX INFO: renamed from: j */
    public final int f30832j;

    /* JADX INFO: renamed from: k */
    public final int f30833k;

    /* JADX INFO: renamed from: l */
    public final mrm f30834l;

    /* JADX INFO: renamed from: m */
    public final int f30835m;

    /* JADX INFO: renamed from: n */
    public final String f30836n;

    /* JADX INFO: renamed from: o */
    public final int f30837o;

    /* JADX INFO: renamed from: p */
    public final boolean f30838p;

    /* JADX INFO: renamed from: q */
    public final int f30839q;

    /* JADX INFO: renamed from: r */
    public final int f30840r;

    /* JADX INFO: renamed from: s */
    public final int f30841s;

    /* JADX INFO: renamed from: t */
    public final int f30842t;

    /* JADX INFO: renamed from: u */
    public final int f30843u;

    /* JADX INFO: renamed from: v */
    public final ifi f30844v;

    /* JADX INFO: renamed from: w */
    public final gzp f30845w;

    /* JADX INFO: renamed from: x */
    public final int f30846x;

    /* JADX INFO: renamed from: y */
    public final int f30847y;

    /* JADX INFO: renamed from: z */
    public final int f30848z;

    static {
        mwt mwtVarM17115i = mwx.m17115i();
        mwtVarM17115i.mo17110e(gzp.THREE, Integer.valueOf(C0100R.drawable.timer_3_on_shutter));
        mwtVarM17115i.mo17110e(gzp.TEN, Integer.valueOf(C0100R.drawable.timer_10_on_shutter));
        mwx mwxVarMo17059b = mwtVarM17115i.mo17059b();
        f30817D = mwxVarMo17059b;
        mwt mwtVarM17115i2 = mwx.m17115i();
        mwtVarM17115i2.mo17110e(gzp.THREE, Integer.valueOf(C0100R.drawable.timer_3_on_shutter_night));
        mwtVarM17115i2.mo17110e(gzp.TEN, Integer.valueOf(C0100R.drawable.timer_10_on_shutter_night));
        mwx mwxVarMo17059b2 = mwtVarM17115i2.mo17059b();
        f30818E = mwxVarMo17059b2;
        mwt mwtVarM17115i3 = mwx.m17115i();
        mwtVarM17115i3.mo17110e(ifi.PHOTO_IDLE, mwxVarMo17059b);
        mwtVarM17115i3.mo17110e(ifi.PORTRAIT_IDLE, mwxVarMo17059b);
        mwtVarM17115i3.mo17110e(ifi.CATSHARK_PHOTO_IDLE, mwxVarMo17059b);
        mwtVarM17115i3.mo17110e(ifi.CATSHARK_PORTRAIT_IDLE, mwxVarMo17059b);
        mwtVarM17115i3.mo17110e(ifi.NIGHT_IDLE, mwxVarMo17059b2);
        mwtVarM17115i3.mo17110e(ifi.ASTRO_IDLE, mwxVarMo17059b2);
        mwtVarM17115i3.mo17110e(ifi.LASAGNA_IDLE, mwxVarMo17059b);
        f30819F = mwtVarM17115i3.mo17059b();
    }

    public ign() {
    }

    public ign(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, mrm mrmVar, int i9, String str, int i10, boolean z, int i11, int i12, int i13, int i14, int i15, ifi ifiVar, gzp gzpVar, int i16, int i17, int i18, int i19, int i20, int i21) {
        this.f30826d = i;
        this.f30827e = i2;
        this.f30828f = i3;
        this.f30829g = i4;
        this.f30830h = i5;
        this.f30831i = i6;
        this.f30832j = i7;
        this.f30833k = i8;
        this.f30834l = mrmVar;
        this.f30835m = i9;
        this.f30836n = str;
        this.f30837o = i10;
        this.f30838p = z;
        this.f30839q = i11;
        this.f30840r = i12;
        this.f30841s = i13;
        this.f30842t = i14;
        this.f30843u = i15;
        this.f30844v = ifiVar;
        this.f30845w = gzpVar;
        this.f30846x = i16;
        this.f30847y = i17;
        this.f30848z = i18;
        this.f30823A = i19;
        this.f30824B = i20;
        this.f30825C = i21;
    }

    /* JADX INFO: renamed from: a */
    public static igm m11290a() {
        igm igmVar = new igm((byte[]) null);
        igmVar.m11265b(false);
        igmVar.m11281r(0);
        igmVar.m11267d(0);
        igmVar.m11266c("none");
        igmVar.m11272i(0);
        igmVar.m11273j(-1);
        igmVar.m11280q(0);
        igmVar.m11279p(0);
        igmVar.m11286w(0);
        igmVar.m11287x(0);
        igmVar.m11288y(0);
        igmVar.m11285v(0);
        igmVar.m11270g(255);
        igmVar.m11268e();
        igmVar.m11269f(-1);
        return igmVar;
    }

    /* JADX INFO: renamed from: b */
    public static ign m11291b(ifi ifiVar, gzp gzpVar, View view, boolean z, boolean z2) {
        Function igkVar;
        f30820a = z;
        if (!z2) {
            f30821b = jzn.m13803F(view);
            f30822c = jzn.m13800C(view);
        }
        ifi ifiVar2 = ifi.PHOTO_IDLE;
        int i = 0;
        switch (ifiVar) {
            case PHOTO_IDLE:
                igkVar = igj.f30749f;
                break;
            case PHOTO_PRESSED:
                igkVar = igj.f30752i;
                break;
            case PORTRAIT_IDLE:
                igkVar = new igk(z2, i);
                break;
            case PORTRAIT_PRESSED:
                igkVar = igj.f30755l;
                break;
            case VIDEO_IDLE:
                igkVar = igj.f30760q;
                break;
            case VIDEO_PRESSED:
                igkVar = igj.f30761r;
                break;
            case CANCEL:
                igkVar = igj.f30754k;
                break;
            case CONFIRM_YES_TRANSIENT:
                igkVar = igl.f30770c;
                break;
            case CONFIRM_DISABLED:
                igkVar = igl.f30769b;
                break;
            case CONFIRM_ENABLED:
                igkVar = igl.f30768a;
                break;
            case VIDEO_RECORDING:
                igkVar = igj.f30762s;
                break;
            case IMAX_IDLE:
                igkVar = igj.f30749f;
                break;
            case IMAX_RECORDING:
                igkVar = igl.f30771d;
                break;
            case CATSHARK_PHOTO_IDLE:
                igkVar = igl.f30773f;
                break;
            case CATSHARK_PHOTO_PRESSED:
                igkVar = igj.f30753j;
                break;
            case CATSHARK_PHOTO_PROCESSING:
                igkVar = igj.f30763t;
                break;
            case CATSHARK_PORTRAIT_IDLE:
                igkVar = igl.f30774g;
                break;
            case CATSHARK_PORTRAIT_PRESSED:
                igkVar = igl.f30775h;
                break;
            case CATSHARK_PORTRAIT_PROCESSING:
                igkVar = igl.f30776i;
                break;
            case NIGHT_IDLE:
                igkVar = igl.f30777j;
                break;
            case NIGHT_PRESSED:
                igkVar = igl.f30779l;
                break;
            case NIGHT_PROCESSING:
                igkVar = hgq.f27727u;
                break;
            case NIGHT_CANCEL:
                igkVar = igl.f30772e;
                break;
            case NIGHT_STOP:
                igkVar = igj.f30744a;
                break;
            case ASTRO_IDLE:
                igkVar = igl.f30778k;
                break;
            case ASTRO_PRESSED:
                igkVar = igl.f30780m;
                break;
            case LASAGNA_IDLE:
                igkVar = igj.f30746c;
                break;
            case LASAGNA_PRESSED:
                igkVar = igj.f30747d;
                break;
            case LASAGNA_PROCESSING:
                igkVar = igj.f30748e;
                break;
            case TIMELAPSE_IDLE:
                igkVar = igj.f30756m;
                break;
            case TIMELAPSE_PRESSED:
                igkVar = igj.f30757n;
                break;
            case TIMELAPSE_RECORDING:
                igkVar = igj.f30758o;
                break;
            case TIMELAPSE_PROCESSING:
                igkVar = igj.f30759p;
                break;
            case PHOTO_LONGPRESS:
                igkVar = igj.f30750g;
                break;
            case PHOTO_LONGPRESS_LOCKED:
                igkVar = igj.f30751h;
                break;
            case f30628J:
                igkVar = hgq.f27726t;
                break;
            case AUTOTIMER_RUNNING:
                igkVar = igj.f30745b;
                break;
            case PHOTOSPHERE_IDLE:
                igkVar = igj.f30749f;
                break;
            case AMBER_IDLE:
                igkVar = igj.f30764u;
                break;
            default:
                throw new IllegalArgumentException("Should never get here! " + String.valueOf(ifiVar) + " missing in switch.");
        }
        Resources resources = view.getResources();
        igm igmVar = (igm) igkVar.apply(resources);
        igmVar.m11274k(ifiVar);
        if (gzpVar == null) {
            throw new NullPointerException("Null timerOption");
        }
        igmVar.f30792b = gzpVar;
        int iIntValue = ((Integer) ((mwx) f30819F.getOrDefault(ifiVar, mzw.f41870a)).getOrDefault(gzpVar, 0)).intValue();
        if (iIntValue != 0) {
            igmVar.m11267d(iIntValue);
        }
        if ((igmVar.f30793c & 256) == 0) {
            throw new IllegalStateException("Property \"buttonImageResourceId\" has not been set");
        }
        int i2 = igmVar.f30791a;
        if (i2 != 0) {
            Drawable drawable = resources.getDrawable(i2, null);
            Drawable.ConstantState constantState = drawable.getConstantState();
            constantState.getClass();
            igmVar.m11271h(mrm.m16829i(constantState));
            igmVar.m11266c(resources.getResourceEntryName(i2));
            igmVar.m11272i(drawable.getIntrinsicWidth() / 2);
        }
        return igmVar.m11264a();
    }

    /* JADX INFO: renamed from: c */
    public final igm m11292c() {
        return new igm(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ign) {
            ign ignVar = (ign) obj;
            if (this.f30826d == ignVar.f30826d && this.f30827e == ignVar.f30827e && this.f30828f == ignVar.f30828f && this.f30829g == ignVar.f30829g && this.f30830h == ignVar.f30830h && this.f30831i == ignVar.f30831i && this.f30832j == ignVar.f30832j && this.f30833k == ignVar.f30833k && this.f30834l.equals(ignVar.f30834l) && this.f30835m == ignVar.f30835m && this.f30836n.equals(ignVar.f30836n) && this.f30837o == ignVar.f30837o && this.f30838p == ignVar.f30838p && this.f30839q == ignVar.f30839q && this.f30840r == ignVar.f30840r && this.f30841s == ignVar.f30841s && this.f30842t == ignVar.f30842t && this.f30843u == ignVar.f30843u && this.f30844v.equals(ignVar.f30844v) && this.f30845w.equals(ignVar.f30845w) && this.f30846x == ignVar.f30846x && this.f30847y == ignVar.f30847y && this.f30848z == ignVar.f30848z && this.f30823A == ignVar.f30823A && this.f30824B == ignVar.f30824B && this.f30825C == ignVar.f30825C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f30826d ^ 1000003) * 1000003) ^ this.f30827e) * 1000003) ^ this.f30828f) * 1000003) ^ this.f30829g) * 1000003) ^ this.f30830h) * 1000003) ^ this.f30831i) * 1000003) ^ this.f30832j) * 1000003) ^ this.f30833k) * 1000003) ^ this.f30834l.hashCode()) * 1000003) ^ this.f30835m) * 1000003) ^ this.f30836n.hashCode()) * 1000003) ^ this.f30837o) * 1000003) ^ (true != this.f30838p ? 1237 : 1231)) * 1000003) ^ this.f30839q) * 1000003) ^ this.f30840r) * 1000003) ^ this.f30841s) * 1000003) ^ this.f30842t) * 1000003) ^ this.f30843u) * 1000003) ^ this.f30844v.hashCode()) * 1000003) ^ this.f30845w.hashCode()) * 1000003) ^ this.f30846x) * 1000003) ^ this.f30847y) * 1000003) ^ this.f30848z) * 1000003) ^ this.f30823A) * 1000003) ^ this.f30824B) * (-721379959)) ^ this.f30825C;
    }

    public final String toString() {
        return "ShutterButtonSpec{photoCircleRadius=" + this.f30826d + ", photoCircleAlpha=" + this.f30827e + ", photoCircleColor=" + this.f30828f + ", videoDotRadius=" + this.f30829g + ", videoCircleColor=" + this.f30830h + ", stopSquareHalfSize=" + this.f30831i + ", portraitInnerCircleRadius=" + this.f30832j + ", portraitOuterCircleRadius=" + this.f30833k + ", buttonImage=" + String.valueOf(this.f30834l) + CswIK.PqOTBhAry + this.f30835m + ", buttonImageResourceEntryName=" + this.f30836n + ", buttonImageRectHalfSize=" + this.f30837o + ", animateRippleEffect=" + this.f30838p + ", ripplePaintAlpha=" + this.f30839q + ", rippleRadius=" + this.f30840r + ", mainButtonColor=" + this.f30841s + ", roundButtonRadius=" + this.f30842t + ", outerButtonRadius=" + this.f30843u + ", mode=" + String.valueOf(this.f30844v) + ", timerOption=" + String.valueOf(this.f30845w) + ", tickMarkLength=" + this.f30846x + ", tickMarkPaddingToCircleEdge=" + this.f30847y + ", tickMarkRectRoundRadius=" + this.f30848z + gBCSQzBeB.UnPiKy + this.f30823A + ", mainOuterButtonAlpha=" + this.f30824B + ", innerDotCenterOffset=0, innerDotColor=" + this.f30825C + "}";
    }
}
