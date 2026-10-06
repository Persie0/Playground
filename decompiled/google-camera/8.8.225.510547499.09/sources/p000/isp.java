package p000;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.zoomui.view.ZoomSliderView;
import com.google.android.apps.camera.zoomui.view.ZoomUi;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class isp {

    /* JADX INFO: renamed from: a */
    public final jww f31996a;

    /* JADX INFO: renamed from: b */
    public final ValueAnimator f31997b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f31998c;

    /* JADX INFO: renamed from: d */
    public boolean f31999d;

    /* JADX INFO: renamed from: e */
    public boolean f32000e;

    /* JADX INFO: renamed from: f */
    public jxn f32001f;

    /* JADX INFO: renamed from: g */
    private final jwn f32002g;

    /* JADX INFO: renamed from: h */
    private final dcj f32003h;

    /* JADX INFO: renamed from: i */
    private final kpb f32004i;

    /* JADX INFO: renamed from: j */
    private final jww f32005j;

    /* JADX INFO: renamed from: k */
    private final jww f32006k;

    /* JADX INFO: renamed from: l */
    private final dhv f32007l;

    /* JADX INFO: renamed from: m */
    private final isq f32008m;

    /* JADX INFO: renamed from: n */
    private final boolean f32009n;

    /* JADX INFO: renamed from: o */
    private final ValueAnimator.AnimatorUpdateListener f32010o;

    public isp(jwn jwnVar, jww jwwVar, jww jwwVar2, jww jwwVar3, dcj dcjVar, kpb kpbVar, dhv dhvVar, isq isqVar) {
        ija ijaVar = new ija(this, 4);
        this.f32010o = ijaVar;
        this.f31998c = new AtomicReference(iug.MAIN_ONLY);
        this.f31999d = false;
        this.f32000e = true;
        this.f32001f = jxn.FPS_AUTO;
        this.f32002g = jwnVar;
        this.f31996a = jwwVar;
        this.f32003h = dcjVar;
        this.f32004i = kpbVar;
        this.f32005j = jwwVar2;
        this.f32006k = jwwVar3;
        this.f32007l = dhvVar;
        this.f32008m = isqVar;
        this.f32009n = dhvVar.mo6184l(dib.f11277ak);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f31997b = valueAnimator;
        valueAnimator.addUpdateListener(ijaVar);
        valueAnimator.setDuration(500L);
        valueAnimator.setInterpolator(new akf());
    }

    /* JADX INFO: renamed from: i */
    private final String m11694i(boolean z, float f, boolean z2) {
        String strCopyValueOf = String.format(Locale.getDefault(), "%.01f", Float.valueOf(m11704c(f, ((Float) ((jwf) this.f32005j).f34942d).floatValue())));
        float fM11704c = m11704c(f, ((Float) ((jwf) this.f32005j).f34942d).floatValue());
        if (fM11704c < 1.0f) {
            if (this.f32009n) {
                strCopyValueOf = String.format(Locale.getDefault(), "%.01f", Float.valueOf(m11704c(((float) Math.floor(f * 10.0f)) / 10.0f, ((Float) ((jwf) this.f32005j).f34942d).floatValue())));
            }
            char[] cArr = new char[strCopyValueOf.length() - 1];
            strCopyValueOf.getChars(1, strCopyValueOf.length(), cArr, 0);
            strCopyValueOf = String.copyValueOf(cArr);
        } else if (m11699n(fM11704c)) {
            strCopyValueOf = String.format(Locale.getDefault(), "%d", Integer.valueOf(Math.round(fM11704c)));
        } else {
            double d = fM11704c;
            double dFloor = Math.floor(d);
            Double.isNaN(d);
            if ((d - dFloor) * 10.0d < 0.5d) {
                strCopyValueOf = String.format(Locale.getDefault(), "%d", Long.valueOf(Math.round(Math.floor(d))));
            }
        }
        String str = true != z2 ? "" : "×";
        return z ? str.concat(String.valueOf(strCopyValueOf)) : String.valueOf(strCopyValueOf).concat(str);
    }

    /* JADX INFO: renamed from: j */
    private final Map m11695j(ikw ikwVar) {
        mwx mwxVarM11710a;
        if (this.f32003h.mo5895d().equals(kmq.f36557a)) {
            if (this.f32007l.mo6184l(dib.f11275ai)) {
                return this.f32008m.m11710a(14);
            }
            return ikwVar == ikw.PORTRAIT ? this.f32008m.m11710a(12) : this.f32008m.m11710a(11);
        }
        if (this.f32007l.mo6184l(dib.f11273ag)) {
            mwxVarM11710a = this.f32007l.mo6184l(dib.f11274ah) ? this.f32008m.m11710a(2) : this.f32008m.m11710a(1);
        } else {
            mwxVarM11710a = this.f32008m.m11710a(3);
        }
        ikw ikwVar2 = ikw.UNINITIALIZED;
        iug iugVar = iug.OFF;
        iuk iukVar = iuk.ULTRA_WIDE;
        switch (ikwVar.ordinal()) {
            case 2:
            case 13:
                if (((iug) this.f31998c.get()).equals(iug.OFF)) {
                    return this.f32008m.m11710a(9);
                }
                if (((iug) this.f31998c.get()).equals(iug.ALL)) {
                    return this.f32008m.m11710a(10);
                }
                if (this.f32007l.mo6184l(dhh.f11059L)) {
                    return mwxVarM11710a;
                }
                if (this.f31999d) {
                    if (this.f32001f.f35060k == 60) {
                        return this.f32008m.m11710a(6);
                    }
                } else if (this.f32004i.f36775h) {
                    return this.f32008m.m11710a(2);
                }
                return mwxVarM11710a;
            case 5:
                return this.f32008m.m11710a(7);
            case 6:
                return this.f32004i.m14667g() ? this.f32008m.m11710a(5) : this.f32008m.m11710a(4);
            case 12:
                return ((Float) ((jwf) this.f32005j).f34942d).floatValue() >= 1.0f ? this.f32008m.m11710a(3) : mwxVarM11710a;
            case 19:
                return this.f32008m.m11710a(8);
            default:
                return mwxVarM11710a;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m11696k(ZoomUi zoomUi, float f, boolean z) {
        zoomUi.m4578z(m11694i(z, f, true));
    }

    /* JADX INFO: renamed from: l */
    private final void m11697l(ZoomUi zoomUi, iuk iukVar, String str) {
        if (this.f32000e) {
            ikw ikwVar = ikw.UNINITIALIZED;
            iug iugVar = iug.OFF;
            iuk iukVar2 = iuk.ULTRA_WIDE;
            switch (iukVar) {
                case ULTRA_WIDE:
                    zoomUi.m4570r().setText(str);
                    break;
                case WIDE:
                    zoomUi.m4571s().setText(str);
                    break;
                case TELE:
                    zoomUi.m4568p().setText(str);
                    break;
                case ULTRA_TELE:
                    zoomUi.m4569q().setText(str);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final boolean m11698m(iuk iukVar, float f) {
        return f >= m11704c(((Float) p021j$.util.Map.EL.getOrDefault(m11695j((ikw) this.f32002g.mo3831be()), iukVar, Float.valueOf(0.0f))).floatValue(), ((Float) ((jwf) this.f32005j).f34942d).floatValue()) || f == m11704c(((Float) ((jwf) this.f32006k).f34942d).floatValue(), ((Float) ((jwf) this.f32005j).f34942d).floatValue());
    }

    /* JADX INFO: renamed from: n */
    private final boolean m11699n(float f) {
        return f >= m11703b() || f == m11704c(((Float) ((jwf) this.f32005j).f34942d).floatValue(), ((Float) ((jwf) this.f32005j).f34942d).floatValue());
    }

    /* JADX INFO: renamed from: o */
    private final boolean m11700o(float f) {
        return ((Float) p021j$.util.Map.EL.getOrDefault(m11695j((ikw) this.f32002g.mo3831be()), iuk.ULTRA_TELE, Float.valueOf(0.0f))).floatValue() == 0.0f || m11704c(f, ((Float) ((jwf) this.f32005j).f34942d).floatValue()) < m11704c(4.0f, ((Float) ((jwf) this.f32005j).f34942d).floatValue());
    }

    /* JADX INFO: renamed from: p */
    private final boolean m11701p(iuk iukVar, float f) {
        return f < m11704c(((Float) p021j$.util.Map.EL.getOrDefault(m11695j((ikw) this.f32002g.mo3831be()), iukVar, Float.valueOf(0.0f))).floatValue(), ((Float) ((jwf) this.f32005j).f34942d).floatValue()) && f < m11704c(((Float) ((jwf) this.f32006k).f34942d).floatValue(), ((Float) ((jwf) this.f32005j).f34942d).floatValue());
    }

    /* JADX INFO: renamed from: a */
    public final float m11702a(int i) {
        float fFloatValue = 1.0f;
        if (i >= 4) {
            return 1.0f;
        }
        if (((mzw) m11695j((ikw) this.f32002g.mo3831be())).f41872c == 3) {
            if (((Float) ((jwf) this.f32005j).f34942d).floatValue() >= 1.0f) {
                i++;
            }
            Map mapM11695j = m11695j((ikw) this.f32002g.mo3831be());
            iuk iukVar = iuk.values()[i];
            Float fValueOf = Float.valueOf(0.0f);
            fFloatValue = (((Float) p021j$.util.Map.EL.getOrDefault(mapM11695j, iukVar, fValueOf)).floatValue() <= ((Float) ((jwf) this.f32006k).f34942d).floatValue() ? (Float) p021j$.util.Map.EL.getOrDefault(m11695j((ikw) this.f32002g.mo3831be()), iuk.values()[i], fValueOf) : (Float) ((jwf) this.f32006k).f34942d).floatValue();
        } else if (((mzw) m11695j((ikw) this.f32002g.mo3831be())).f41872c == 4) {
            Map mapM11695j2 = m11695j((ikw) this.f32002g.mo3831be());
            iuk iukVar2 = iuk.values()[i];
            Float fValueOf2 = Float.valueOf(0.0f);
            fFloatValue = (((Float) p021j$.util.Map.EL.getOrDefault(mapM11695j2, iukVar2, fValueOf2)).floatValue() <= ((Float) ((jwf) this.f32006k).f34942d).floatValue() ? (Float) p021j$.util.Map.EL.getOrDefault(m11695j((ikw) this.f32002g.mo3831be()), iuk.values()[i], fValueOf2) : (Float) ((jwf) this.f32006k).f34942d).floatValue();
        } else if (i < 2) {
            Map mapM11695j3 = m11695j((ikw) this.f32002g.mo3831be());
            int i2 = i + 1;
            iuk iukVar3 = iuk.values()[i2];
            Float fValueOf3 = Float.valueOf(0.0f);
            fFloatValue = (((Float) p021j$.util.Map.EL.getOrDefault(mapM11695j3, iukVar3, fValueOf3)).floatValue() <= ((Float) ((jwf) this.f32006k).f34942d).floatValue() ? (Float) p021j$.util.Map.EL.getOrDefault(m11695j((ikw) this.f32002g.mo3831be()), iuk.values()[i2], fValueOf3) : (Float) ((jwf) this.f32006k).f34942d).floatValue();
        }
        return Math.max(((Float) ((jwf) this.f32005j).f34942d).floatValue(), fFloatValue);
    }

    /* JADX INFO: renamed from: b */
    public final float m11703b() {
        if (this.f32007l.mo6184l(dib.f11274ah)) {
            return 4.0f;
        }
        return ((Float) ((jwf) this.f32006k).f34942d).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:5:0x0018  */
    /* JADX INFO: renamed from: c */
    public final float m11704c(float f, float f2) {
        ikw ikwVar = ikw.UNINITIALIZED;
        iug iugVar = iug.OFF;
        iuk iukVar = iuk.ULTRA_WIDE;
        switch (((iug) this.f31998c.get()).ordinal()) {
            case 1:
                if (f2 >= 1.0f) {
                    f /= f2;
                }
                break;
            case 2:
                f /= ((Float) p021j$.util.Map.EL.getOrDefault(m11695j(ikw.PORTRAIT), iuk.TELE, Float.valueOf(0.0f))).floatValue();
                break;
            case 3:
                f /= f2;
                break;
        }
        return (!this.f32009n || f >= 1.0f) ? Math.round(f * 10.0f) / 10.0f : ((float) Math.floor(f * 10.0f)) / 10.0f;
    }

    /* JADX INFO: renamed from: d */
    public final iuk m11705d(float f) {
        Map mapM11695j = m11695j((ikw) this.f32002g.mo3831be());
        float fM11704c = m11704c(f, ((Float) ((jwf) this.f32005j).f34942d).floatValue());
        for (Map.Entry entry : ((mwx) mapM11695j).entrySet()) {
            ikw ikwVar = ikw.UNINITIALIZED;
            iug iugVar = iug.OFF;
            iuk iukVar = iuk.ULTRA_WIDE;
            switch ((iuk) entry.getKey()) {
                case ULTRA_WIDE:
                    if (m11701p(iuk.WIDE, fM11704c)) {
                        return iuk.ULTRA_WIDE;
                    }
                    break;
                    break;
                case WIDE:
                    if (m11698m(iuk.WIDE, fM11704c) && m11701p(iuk.TELE, fM11704c)) {
                        return iuk.WIDE;
                    }
                    break;
                case TELE:
                    if (m11698m(iuk.TELE, fM11704c) && m11700o(f)) {
                        return iuk.TELE;
                    }
                    break;
                case ULTRA_TELE:
                    if (m11698m(iuk.ULTRA_TELE, fM11704c) || m11699n(fM11704c)) {
                        return iuk.ULTRA_TELE;
                    }
                    break;
            }
        }
        return iuk.WIDE;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x016b. Please report as an issue. */
    /* JADX INFO: renamed from: e */
    public final void m11706e(ZoomUi zoomUi, iuk iukVar) {
        mxk mxkVarMo17127f;
        TextView textViewM4571s;
        TextView textViewM4568p;
        TextView textViewM4569q;
        Map mapM11695j = m11695j((ikw) this.f32002g.mo3831be());
        ZoomSliderView zoomSliderViewM4573u = zoomUi.m4573u();
        mwx mwxVar = (mwx) mapM11695j;
        Iterator<T> it = Collection$EL.stream(mwxVar.values()).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                mxi mxiVar = new mxi();
                mxiVar.mo17072d(next);
                it.getClass();
                while (it.hasNext()) {
                    mxiVar.mo17072d(it.next());
                }
                mxkVarMo17127f = mxiVar.mo17127f();
            } else {
                mxkVarMo17127f = mxk.m17136H(next);
            }
        } else {
            mxkVarMo17127f = mzx.f41874a;
        }
        zoomSliderViewM4573u.m4541j(mxkVarMo17127f.mo17025v());
        int i = 0;
        boolean z = zoomUi.getResources().getConfiguration().getLayoutDirection() == 1;
        for (Map.Entry entry : mwxVar.entrySet()) {
            boolean z2 = entry.getKey() == iukVar;
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            if (z2) {
                fFloatValue = Math.min(Math.max(((Float) ((jwf) this.f32005j).f34942d).floatValue(), ((Float) entry.getValue()).floatValue()), ((Float) ((jwf) this.f32006k).f34942d).floatValue());
                m11696k(zoomUi, ((Float) entry.getValue()).floatValue(), z);
                if (this.f32007l.mo6184l(dib.f11279am)) {
                    Drawable drawable = zoomUi.getResources().getDrawable(C0100R.drawable.bg_unselect_toggle_button, null);
                    zoomUi.m4571s().setBackground(drawable);
                    zoomUi.m4570r().setBackground(drawable);
                    zoomUi.m4568p().setBackground(drawable);
                    zoomUi.m4569q().setBackground(drawable);
                    iuk iukVar2 = iuk.ULTRA_WIDE;
                    switch (iukVar) {
                        case ULTRA_WIDE:
                            zoomUi.m4570r().setBackground(null);
                            break;
                        case WIDE:
                            zoomUi.m4571s().setBackground(null);
                            break;
                        case TELE:
                            zoomUi.m4568p().setBackground(null);
                            break;
                        case ULTRA_TELE:
                            zoomUi.m4569q().setBackground(null);
                            break;
                    }
                }
                Typeface typefaceCreate = Typeface.create("google-sans-text-medium", i);
                TypedValue typedValue = new TypedValue();
                zoomUi.getResources().getValue(C0100R.dimen.zoom_toggle_bar_letter_spacing, typedValue, true);
                float f = typedValue.getFloat();
                int iM15024q = kxk.m15024q(zoomUi, C0100R.attr.colorOnSecondary);
                int iM15024q2 = kxk.m15024q(zoomUi, C0100R.attr.colorOnSurface);
                zoomUi.getResources().getValue(C0100R.dimen.zoom_toggle_bar_selected_letter_spacing, typedValue, true);
                float f2 = typedValue.getFloat();
                iuk iukVar3 = iuk.ULTRA_WIDE;
                switch (iukVar) {
                    case ULTRA_WIDE:
                        zoomUi.m4574v(zoomUi.m4570r(), iM15024q, f2, typefaceCreate);
                        textViewM4571s = zoomUi.m4571s();
                        zoomUi.m4574v(textViewM4571s, iM15024q2, f, typefaceCreate);
                        textViewM4568p = zoomUi.m4568p();
                        zoomUi.m4574v(textViewM4568p, iM15024q2, f, typefaceCreate);
                        textViewM4569q = zoomUi.m4569q();
                        zoomUi.m4574v(textViewM4569q, iM15024q2, f, typefaceCreate);
                        break;
                    case WIDE:
                        zoomUi.m4574v(zoomUi.m4571s(), iM15024q, f2, typefaceCreate);
                        textViewM4571s = zoomUi.m4570r();
                        zoomUi.m4574v(textViewM4571s, iM15024q2, f, typefaceCreate);
                        textViewM4568p = zoomUi.m4568p();
                        zoomUi.m4574v(textViewM4568p, iM15024q2, f, typefaceCreate);
                        textViewM4569q = zoomUi.m4569q();
                        zoomUi.m4574v(textViewM4569q, iM15024q2, f, typefaceCreate);
                        break;
                    case TELE:
                        zoomUi.m4574v(zoomUi.m4568p(), iM15024q, f2, typefaceCreate);
                        zoomUi.m4574v(zoomUi.m4570r(), iM15024q2, f, typefaceCreate);
                        textViewM4568p = zoomUi.m4571s();
                        zoomUi.m4574v(textViewM4568p, iM15024q2, f, typefaceCreate);
                        textViewM4569q = zoomUi.m4569q();
                        zoomUi.m4574v(textViewM4569q, iM15024q2, f, typefaceCreate);
                        break;
                    case ULTRA_TELE:
                        zoomUi.m4574v(zoomUi.m4569q(), iM15024q, f2, typefaceCreate);
                        zoomUi.m4574v(zoomUi.m4570r(), iM15024q2, f, typefaceCreate);
                        zoomUi.m4574v(zoomUi.m4571s(), iM15024q2, f, typefaceCreate);
                        textViewM4569q = zoomUi.m4568p();
                        zoomUi.m4574v(textViewM4569q, iM15024q2, f, typefaceCreate);
                        break;
                }
            }
            if (entry.getKey() == iuk.ULTRA_WIDE) {
                m11697l(zoomUi, iuk.ULTRA_WIDE, m11694i(z, fFloatValue, z2));
                i = 0;
            } else {
                Object key = entry.getKey();
                iuk iukVar4 = iuk.WIDE;
                if (key == iukVar4) {
                    m11697l(zoomUi, iukVar4, m11694i(z, ((Float) entry.getValue()).floatValue(), z2));
                    i = 0;
                } else if (entry.getKey() == iuk.TELE) {
                    if (((Float) entry.getValue()).floatValue() > ((Float) ((jwf) this.f32006k).f34942d).floatValue()) {
                        m11697l(zoomUi, iuk.TELE, m11694i(z, ((Float) ((jwf) this.f32006k).f34942d).floatValue(), z2));
                        i = 0;
                    } else {
                        m11697l(zoomUi, iuk.TELE, m11694i(z, ((Float) entry.getValue()).floatValue(), z2));
                        i = 0;
                    }
                } else if (entry.getKey() != iuk.ULTRA_TELE) {
                    i = 0;
                } else if (((Float) entry.getValue()).floatValue() > ((Float) ((jwf) this.f32006k).f34942d).floatValue()) {
                    m11697l(zoomUi, iuk.ULTRA_TELE, m11694i(z, ((Float) ((jwf) this.f32006k).f34942d).floatValue(), z2));
                    i = 0;
                } else {
                    m11697l(zoomUi, iuk.ULTRA_TELE, m11694i(z, ((Float) entry.getValue()).floatValue(), z2));
                    i = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11707f() {
        if (this.f31997b.isRunning()) {
            this.f31997b.cancel();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11708g(ZoomUi zoomUi, float f) {
        Map mapM11695j = m11695j((ikw) this.f32002g.mo3831be());
        if (m11709h(f)) {
            m11706e(zoomUi, m11705d(f));
            return;
        }
        boolean z = zoomUi.getResources().getConfiguration().getLayoutDirection() == 1;
        float fM11704c = m11704c(f, ((Float) ((jwf) this.f32005j).f34942d).floatValue());
        for (Map.Entry entry : ((mwx) mapM11695j).entrySet()) {
            ikw ikwVar = ikw.UNINITIALIZED;
            iug iugVar = iug.OFF;
            iuk iukVar = iuk.ULTRA_WIDE;
            switch ((iuk) entry.getKey()) {
                case ULTRA_WIDE:
                    if (m11701p(iuk.WIDE, fM11704c)) {
                        m11706e(zoomUi, (iuk) entry.getKey());
                        m11697l(zoomUi, iuk.ULTRA_WIDE, m11694i(z, f, true));
                    }
                    break;
                case WIDE:
                    if (m11698m(iuk.WIDE, fM11704c) && m11701p(iuk.TELE, fM11704c)) {
                        m11706e(zoomUi, (iuk) entry.getKey());
                        m11697l(zoomUi, iuk.WIDE, m11694i(z, f, true));
                    }
                    break;
                case TELE:
                    if (m11698m(iuk.TELE, fM11704c) && m11700o(f)) {
                        m11706e(zoomUi, (iuk) entry.getKey());
                        m11697l(zoomUi, iuk.TELE, m11694i(z, f, true));
                    }
                    break;
                case ULTRA_TELE:
                    if (m11698m(iuk.ULTRA_TELE, fM11704c) || m11699n(fM11704c)) {
                        m11706e(zoomUi, (iuk) entry.getKey());
                        m11697l(zoomUi, iuk.ULTRA_TELE, m11694i(z, f, true));
                    }
                    break;
            }
        }
        m11696k(zoomUi, f, z);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11709h(float f) {
        Map mapM11695j = m11695j((ikw) this.f32002g.mo3831be());
        double dRound = Math.round(m11704c(f, ((Float) ((jwf) this.f32005j).f34942d).floatValue()) * 100.0f);
        double dRound2 = Math.round(f * 100.0f);
        Double.isNaN(dRound2);
        if (mapM11695j.containsValue(Float.valueOf((float) (dRound2 / 100.0d)))) {
            return true;
        }
        Iterator it = ((mwx) mapM11695j).entrySet().iterator();
        while (it.hasNext()) {
            Double.isNaN(dRound);
            double dRound3 = Math.round(m11704c(((Float) ((Map.Entry) it.next()).getValue()).floatValue(), ((Float) ((jwf) this.f32005j).f34942d).floatValue()) * 100.0f);
            Double.isNaN(dRound3);
            if (((float) (dRound / 100.0d)) == ((float) (dRound3 / 100.0d))) {
                return true;
            }
        }
        return false;
    }
}
