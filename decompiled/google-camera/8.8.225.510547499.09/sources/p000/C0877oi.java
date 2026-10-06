package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.text.Layout;
import android.text.TextPaint;
import p021j$.util.Objects;

/* JADX INFO: renamed from: oi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0877oi {

    /* JADX INFO: renamed from: A */
    public InterfaceC0875og f46050A;

    /* JADX INFO: renamed from: C */
    private boolean f46052C;

    /* JADX INFO: renamed from: D */
    private boolean f46053D;

    /* JADX INFO: renamed from: F */
    private C0878oj f46055F;

    /* JADX INFO: renamed from: a */
    public final Context f46056a;

    /* JADX INFO: renamed from: b */
    public ComplicationData f46057b;

    /* JADX INFO: renamed from: d */
    public Drawable f46059d;

    /* JADX INFO: renamed from: e */
    public Drawable f46060e;

    /* JADX INFO: renamed from: f */
    public Drawable f46061f;

    /* JADX INFO: renamed from: g */
    public Drawable f46062g;

    /* JADX INFO: renamed from: h */
    public Drawable f46063h;

    /* JADX INFO: renamed from: z */
    public C0878oj f46081z;

    /* JADX INFO: renamed from: c */
    public final Rect f46058c = new Rect();

    /* JADX INFO: renamed from: B */
    private CharSequence f46051B = "";

    /* JADX INFO: renamed from: i */
    public final C0880ol f46064i = new C0880ol();

    /* JADX INFO: renamed from: j */
    public final C0880ol f46065j = new C0880ol();

    /* JADX INFO: renamed from: k */
    public final C0880ol f46066k = new C0880ol();

    /* JADX INFO: renamed from: l */
    public final C0881om f46067l = new C0881om();

    /* JADX INFO: renamed from: m */
    public final C0881om f46068m = new C0881om();

    /* JADX INFO: renamed from: n */
    public final Rect f46069n = new Rect();

    /* JADX INFO: renamed from: o */
    public final RectF f46070o = new RectF();

    /* JADX INFO: renamed from: p */
    public final Rect f46071p = new Rect();

    /* JADX INFO: renamed from: q */
    public final Rect f46072q = new Rect();

    /* JADX INFO: renamed from: r */
    public final Rect f46073r = new Rect();

    /* JADX INFO: renamed from: s */
    public final Rect f46074s = new Rect();

    /* JADX INFO: renamed from: t */
    public final Rect f46075t = new Rect();

    /* JADX INFO: renamed from: E */
    private final Rect f46054E = new Rect();

    /* JADX INFO: renamed from: u */
    public final RectF f46076u = new RectF();

    /* JADX INFO: renamed from: v */
    public C0876oh f46077v = null;

    /* JADX INFO: renamed from: w */
    public C0876oh f46078w = null;

    /* JADX INFO: renamed from: x */
    public TextPaint f46079x = null;

    /* JADX INFO: renamed from: y */
    public TextPaint f46080y = null;

    public C0877oi(Context context, C0878oj c0878oj, C0878oj c0878oj2) {
        this.f46056a = context;
        m18524g(c0878oj, c0878oj2);
    }

    /* JADX INFO: renamed from: i */
    private final void m18517i() {
        C0884op c0887os;
        Layout.Alignment alignmentMo18824i;
        if (this.f46057b == null || this.f46058c.isEmpty()) {
            return;
        }
        this.f46069n.set(0, 0, this.f46058c.width(), this.f46058c.height());
        this.f46070o.set(0.0f, 0.0f, this.f46058c.width(), this.f46058c.height());
        ComplicationData complicationData = this.f46057b;
        switch (complicationData.f1312b) {
            case 3:
            case 9:
                c0887os = new C0887os();
                break;
            case 4:
                c0887os = new C0885oq();
                break;
            case 5:
                if (!this.f46052C) {
                    c0887os = new C0886or();
                } else if (complicationData.m1371h() != null) {
                    c0887os = new C0887os();
                } else {
                    c0887os = new C0882on();
                }
                break;
            case 6:
                c0887os = new C0882on();
                break;
            case 7:
                c0887os = new C0888ot();
                break;
            case 8:
                c0887os = new C0883oo();
                break;
            default:
                c0887os = new C0884op();
                break;
        }
        c0887os.m18836u(this.f46058c.width(), this.f46058c.height(), this.f46057b);
        c0887os.mo18829n(this.f46054E);
        this.f46076u.set(this.f46054E);
        c0887os.mo18725a(this.f46071p);
        c0887os.mo18832q(this.f46072q);
        c0887os.mo18734b(this.f46073r);
        if (this.f46057b.f1312b == 4) {
            alignmentMo18824i = c0887os.mo18822g();
            c0887os.mo18827l(this.f46074s);
            this.f46067l.m18644b(alignmentMo18824i);
            this.f46067l.m18645c(c0887os.mo18818c());
            c0887os.mo18828m(this.f46075t);
            this.f46068m.m18644b(c0887os.mo18823h());
            this.f46068m.m18645c(c0887os.mo18819d());
        } else {
            alignmentMo18824i = c0887os.mo18824i();
            c0887os.mo18830o(this.f46074s);
            this.f46067l.m18644b(alignmentMo18824i);
            this.f46067l.m18645c(c0887os.mo18820e());
            c0887os.mo18831p(this.f46075t);
            this.f46068m.m18644b(c0887os.mo18825j());
            this.f46068m.m18645c(c0887os.mo18821f());
        }
        if (alignmentMo18824i != Layout.Alignment.ALIGN_CENTER) {
            float fHeight = this.f46058c.height() * 0.1f;
            this.f46067l.m18651i(fHeight / this.f46074s.width());
            this.f46068m.m18651i(fHeight / this.f46074s.width());
        } else {
            this.f46067l.m18651i(0.0f);
            this.f46068m.m18651i(0.0f);
        }
        Rect rect = new Rect();
        Rect rect2 = this.f46069n;
        float fMax = Math.max(m18518a(this.f46055F), m18518a(this.f46081z));
        rect.set(rect2);
        double dSqrt = Math.sqrt(2.0d) - 1.0d;
        double d = fMax;
        Double.isNaN(d);
        int iCeil = (int) Math.ceil(dSqrt * d);
        rect.inset(iCeil, iCeil);
        if (!this.f46074s.intersect(rect)) {
            this.f46074s.setEmpty();
        }
        if (!this.f46075t.intersect(rect)) {
            this.f46075t.setEmpty();
        }
        if (!this.f46071p.isEmpty()) {
            Rect rect3 = this.f46071p;
            C0169eu.m7880j(rect3, rect3, 1.0f);
            C0169eu.m7874d(this.f46071p, rect);
        }
        if (!this.f46072q.isEmpty()) {
            Rect rect4 = this.f46072q;
            C0169eu.m7880j(rect4, rect4, 0.95f);
            if (this.f46057b.m1364a() == 2) {
                C0169eu.m7874d(this.f46072q, rect);
            }
        }
        if (this.f46073r.isEmpty()) {
            return;
        }
        Rect rect5 = this.f46073r;
        C0169eu.m7880j(rect5, rect5, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public final int m18518a(C0878oj c0878oj) {
        if (this.f46058c.isEmpty()) {
            return 0;
        }
        return Math.min(Math.min(this.f46058c.height(), this.f46058c.width()) / 2, c0878oj.f46153p);
    }

    /* JADX INFO: renamed from: b */
    public final int m18519b(C0878oj c0878oj, Rect rect) {
        if (this.f46058c.isEmpty()) {
            return 0;
        }
        return Math.max(m18518a(c0878oj) - Math.min(Math.min(rect.left, this.f46058c.width() - rect.right), Math.min(rect.top, this.f46058c.height() - rect.bottom)), 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m18520c() {
        InterfaceC0875og interfaceC0875og = this.f46050A;
        if (interfaceC0875og != null) {
            interfaceC0875og.mo18401a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18521d(ComplicationData complicationData) {
        Icon icon;
        Icon icon2;
        Icon iconM1367d;
        Icon icon3;
        boolean z;
        if (Objects.equals(this.f46057b, complicationData)) {
            return;
        }
        Icon iconM1366c = null;
        if (complicationData == null) {
            this.f46057b = null;
            return;
        }
        boolean z2 = true;
        if (complicationData.f1312b != 10) {
            this.f46057b = complicationData;
            this.f46053D = false;
        } else {
            if (this.f46053D) {
                return;
            }
            this.f46053D = true;
            C0867nz c0867nz = new C0867nz(3);
            ComplicationText complicationText = new ComplicationText(this.f46051B);
            ComplicationData.m1360j("SHORT_TEXT", c0867nz.f45053a);
            c0867nz.f45054b.putParcelable("SHORT_TEXT", complicationText);
            this.f46057b = c0867nz.m18257a();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.f46059d = null;
        this.f46061f = null;
        this.f46062g = null;
        this.f46063h = null;
        this.f46060e = null;
        ComplicationData complicationData2 = this.f46057b;
        if (complicationData2 != null) {
            iconM1366c = complicationData2.m1366c();
            ComplicationData complicationData3 = this.f46057b;
            ComplicationData.m1361k("ICON_BURN_IN_PROTECTION", complicationData3.f1312b);
            icon = (Icon) complicationData3.m1368e("ICON_BURN_IN_PROTECTION");
            ComplicationData complicationData4 = this.f46057b;
            ComplicationData.m1361k("SMALL_IMAGE_BURN_IN_PROTECTION", complicationData4.f1312b);
            icon2 = (Icon) complicationData4.m1368e("SMALL_IMAGE_BURN_IN_PROTECTION");
            iconM1367d = this.f46057b.m1367d();
            ComplicationData complicationData5 = this.f46057b;
            ComplicationData.m1361k("LARGE_IMAGE", complicationData5.f1312b);
            icon3 = (Icon) complicationData5.m1368e("LARGE_IMAGE");
        } else {
            icon = null;
            icon2 = null;
            iconM1367d = null;
            icon3 = null;
        }
        if (iconM1366c != null) {
            iconM1366c.loadDrawableAsync(this.f46056a, new C0874of(this, 1), handler);
            z = true;
        } else {
            z = false;
        }
        if (icon != null) {
            icon.loadDrawableAsync(this.f46056a, new C0874of(this, 0), handler);
            z = true;
        }
        if (iconM1367d != null) {
            iconM1367d.loadDrawableAsync(this.f46056a, new C0874of(this, 2), handler);
            z = true;
        }
        if (icon2 != null) {
            icon2.loadDrawableAsync(this.f46056a, new C0874of(this, 3), handler);
        } else {
            z2 = z;
        }
        if (icon3 != null) {
            icon3.loadDrawableAsync(this.f46056a, new C0874of(this, 4), handler);
        } else if (!z2) {
            m18520c();
        }
        m18517i();
    }

    /* JADX INFO: renamed from: e */
    public final void m18522e(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f46051B = charSequence.subSequence(0, charSequence.length());
        if (this.f46053D) {
            this.f46053D = false;
            m18521d(new C0867nz(10).m18257a());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18523f(boolean z) {
        if (this.f46052C != z) {
            this.f46052C = z;
            m18517i();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18524g(C0878oj c0878oj, C0878oj c0878oj2) {
        this.f46055F = c0878oj;
        this.f46081z = c0878oj2;
        this.f46077v = new C0876oh(c0878oj, false, false, false);
        this.f46078w = new C0876oh(c0878oj2, true, false, false);
        m18517i();
    }

    /* JADX INFO: renamed from: h */
    public final void m18525h(Rect rect) {
        boolean z = true;
        if (this.f46058c.width() == rect.width() && this.f46058c.height() == rect.height()) {
            z = false;
        }
        this.f46058c.set(rect);
        if (z) {
            m18517i();
        }
    }
}
