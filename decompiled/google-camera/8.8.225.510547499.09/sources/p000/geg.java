package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geg extends jxc {

    /* JADX INFO: renamed from: a */
    private static final nbh f24366a = nbh.m17259h("com/google/android/apps/camera/one/zoom/api/MultiCropRegion");

    /* JADX INFO: renamed from: b */
    private final List f24367b;

    /* JADX INFO: renamed from: c */
    private final float f24368c;

    /* JADX INFO: renamed from: d */
    private final double f24369d;

    /* JADX INFO: renamed from: e */
    private final int f24370e;

    /* JADX INFO: renamed from: f */
    private final int f24371f;

    /* JADX INFO: renamed from: g */
    private final int f24372g;

    /* JADX INFO: renamed from: h */
    private final kmq f24373h;

    /* JADX INFO: renamed from: i */
    private final Rect f24374i;

    /* JADX INFO: renamed from: j */
    private boolean f24375j;

    /* JADX INFO: renamed from: k */
    private gef f24376k;

    public geg(float f, jwn jwnVar, kmd kmdVar, dhv dhvVar, kme kmeVar) {
        this(f, jwnVar, kmdVar, kan.f35486a, dhvVar, kmeVar);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9089g(kmd kmdVar, dhv dhvVar) {
        return kmdVar.mo14544M() && kmdVar.mo14535D() && dhvVar.mo6184l(dib.f11273ag);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized gef m9090c() {
        return mo3833d(Float.valueOf(1.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.jxc
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized gef mo3833d(Float f) {
        float fFloatValue;
        if (!Float.isNaN(f.floatValue()) && f.floatValue() > 0.0f) {
            if (!this.f24375j) {
                float fFloatValue2 = f.floatValue();
                double d = this.f24369d;
                boolean z = true;
                lku.m15607B(d > 0.0d, "Invalid sensor size: %s", Double.valueOf(d));
                double d2 = this.f24369d;
                double d3 = fFloatValue2;
                Double.isNaN(d3);
                double dM14866e = kua.m14866e(this.f24368c, d2 / d3);
                double d4 = this.f24369d;
                lku.m15607B(d4 > 0.0d, "Diagonal size cannot be zero (%s)", Double.valueOf(d4));
                if (dM14866e <= 0.0d || dM14866e >= 6.283185307179586d) {
                    z = false;
                }
                lku.m15607B(z, "Invalid AoV: %s", Double.valueOf(dM14866e));
                double dTan = Math.tan(dM14866e / 2.0d);
                float f2 = (float) (d4 / (dTan + dTan));
                try {
                    List list = this.f24367b;
                    double d5 = f2;
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            throw new IllegalStateException(BcwGDRhrTsnlj.vjwVQRB + d5);
                        }
                        fFloatValue = ((Float) list.get(size)).floatValue();
                        double d6 = fFloatValue;
                        if (d6 < d5) {
                            break;
                        }
                        Double.isNaN(d5);
                        Double.isNaN(d6);
                        if (Math.abs(d5 - d6) < 9.999999747378752E-6d) {
                            break;
                        }
                        size--;
                    }
                } catch (IllegalStateException e) {
                    ((nbe) ((nbe) ((nbe) f24366a.m17251b()).mo17283h(e)).mo17276G(2576)).mo17279J(f2, this.f24367b);
                    fFloatValue = ((Float) this.f24367b.get(0)).floatValue();
                }
                double dM14867f = kua.m14867f(dM14866e, fFloatValue) / this.f24369d;
                int i = this.f24370e;
                double d7 = i;
                int i2 = this.f24371f;
                double d8 = i2;
                Double.isNaN(d7);
                int i3 = (int) ((d7 * dM14867f) + 0.5d);
                int i4 = i - i3;
                int i5 = this.f24372g + i2;
                int i6 = i + i3;
                Double.isNaN(d8);
                int i7 = (int) ((dM14867f * d8) + 0.5d);
                this.f24376k = new gef(new Rect(i4, i5 - i7, i6, i5 + i7), this.f24374i, fFloatValue);
            }
            return this.f24376k;
        }
        ((nbe) ((nbe) f24366a.m17252c()).mo17276G((char) 2577)).mo17293r("Invalid zoom factor: %g", f);
        return this.f24376k;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m9092f(kmq kmqVar) {
        if (kmqVar == this.f24373h) {
            this.f24375j = false;
        } else {
            this.f24375j = true;
        }
    }

    public geg(float f, jwn jwnVar, kmd kmdVar, kan kanVar, dhv dhvVar, kme kmeVar) {
        List listMo14567t;
        float fFloatValue;
        float height;
        super(jwnVar);
        kmdVar.mo14556i();
        if (m9089g(kmdVar, dhvVar)) {
            listMo14567t = new ArrayList();
            Iterator it = kmdVar.mo14533B().iterator();
            while (it.hasNext()) {
                kmd kmdVarMo13854a = kmeVar.mo13854a((kmg) it.next());
                kmdVarMo13854a.mo14567t().get(0);
                listMo14567t.add((Float) kmdVarMo13854a.mo14567t().get(0));
            }
            Collections.sort(listMo14567t, amx.f747k);
        } else {
            kmdVar.mo14556i();
            listMo14567t = kmdVar.mo14567t();
        }
        this.f24367b = listMo14567t;
        lku.m15670x(!listMo14567t.isEmpty(), "Must have at least one focal length.");
        if (m9089g(kmdVar, dhvVar)) {
            fFloatValue = ((Float) listMo14567t.get(listMo14567t.size() / 2)).floatValue();
        } else {
            fFloatValue = ((Float) Collections.min(listMo14567t)).floatValue();
        }
        this.f24368c = fFloatValue;
        lku.m15607B(fFloatValue > 0.0f, "Reference focal length cannot be zero (%s)", Float.valueOf(fFloatValue));
        SizeF sizeF = (SizeF) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        if (kanVar.m13883m(kan.f35487b)) {
            height = kanVar.m13876b(sizeF.getWidth());
        } else {
            height = sizeF.getHeight();
        }
        double dHypot = Math.hypot(sizeF.getWidth(), height);
        this.f24369d = dHypot;
        lku.m15607B(dHypot > 0.0d, "Invalid sensor size: %s", Double.valueOf(dHypot));
        Rect rectMo14555h = kmdVar.mo14555h();
        int iM13876b = (int) kanVar.m13876b(rectMo14555h.width());
        this.f24370e = rectMo14555h.width() / 2;
        this.f24371f = iM13876b / 2;
        int iHeight = (rectMo14555h.height() - iM13876b) / 2;
        this.f24372g = iHeight;
        this.f24374i = new Rect(0, iHeight, rectMo14555h.width(), iM13876b + iHeight);
        this.f24373h = kmdVar.mo14558k();
        this.f24376k = mo3833d(Float.valueOf(f));
    }
}
