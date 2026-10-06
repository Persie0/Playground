package com.google.android.apps.camera.p014ui.modeswitcher;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;
import p000.afc;
import p000.cdp;
import p000.dhv;
import p000.dik;
import p000.fcp;
import p000.ggf;
import p000.ich;
import p000.ick;
import p000.icm;
import p000.icn;
import p000.ico;
import p000.ics;
import p000.ict;
import p000.icy;
import p000.idn;
import p000.iku;
import p000.ikw;
import p000.ilk;
import p000.jvd;
import p000.jvh;
import p000.lku;
import p000.mrm;
import p000.mua;
import p000.mws;
import p000.mzg;
import p000.mzr;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ModeSwitcher extends HorizontalScrollView implements ict {

    /* JADX INFO: renamed from: a */
    public static final nbh f7060a = nbh.m17259h("com/google/android/apps/camera/ui/modeswitcher/ModeSwitcher");

    /* JADX INFO: renamed from: b */
    public icn f7061b;

    /* JADX INFO: renamed from: c */
    public ick f7062c;

    /* JADX INFO: renamed from: d */
    public GestureDetector f7063d;

    /* JADX INFO: renamed from: e */
    public boolean f7064e;

    /* JADX INFO: renamed from: f */
    public boolean f7065f;

    /* JADX INFO: renamed from: g */
    public ilk f7066g;

    /* JADX INFO: renamed from: h */
    public fcp f7067h;

    /* JADX INFO: renamed from: i */
    public icy f7068i;

    /* JADX INFO: renamed from: j */
    public ics f7069j;

    /* JADX INFO: renamed from: k */
    public ikw f7070k;

    /* JADX INFO: renamed from: l */
    public ikw f7071l;

    /* JADX INFO: renamed from: m */
    private final Rect f7072m;

    public ModeSwitcher(Context context) {
        super(context);
        this.f7072m = new Rect();
        this.f7061b = null;
        this.f7064e = false;
        this.f7065f = false;
        this.f7066g = ilk.PORTRAIT;
        this.f7068i = null;
        this.f7069j = new ico(1);
        this.f7070k = ikw.PHOTO;
        this.f7071l = ikw.UNINITIALIZED;
        m4387j(context);
    }

    /* JADX INFO: renamed from: a */
    public static float m4386a(float f, float f2, float f3) {
        lku.m15611F(f2 <= f3, "value=%s min=%s max=%s", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        return Math.max(f2, Math.min(f, f3));
    }

    /* JADX INFO: renamed from: j */
    private final void m4387j(Context context) {
        jvd.m13538a();
        ick ickVar = new ick(context);
        jvh.m13572t(ickVar);
        addView(ickVar);
        this.f7062c = ickVar;
        ickVar.setOrientation(0);
        this.f7062c.f30353n = mrm.m16829i(new AmbientModeSupport.AmbientController(this));
        this.f7062c.setGravity(16);
        this.f7062c.setBackgroundColor(0);
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        icm icmVar = new icm(this);
        GestureDetector gestureDetector = new GestureDetector(context, icmVar);
        this.f7063d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        setOnTouchListener(icmVar);
    }

    /* JADX INFO: renamed from: b */
    public final ikw m4388b() {
        ick ickVar = this.f7062c;
        int scrollX = getScrollX() + (getWidth() / 2);
        jvd.m13538a();
        if (ickVar.f30341b.isEmpty()) {
            return ikw.PHOTO;
        }
        return (ikw) ((Map.Entry) new mua(new ich(scrollX, 0), mzg.f41839a).m17169e(ickVar.f30341b.entrySet())).getKey();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final void m4389c(ikw ikwVar) {
        jvd.m13538a();
        lku.m15670x(ikwVar != ikw.UNINITIALIZED, "Cannot append UNINITIALIZED mode");
        ick ickVar = this.f7062c;
        jvd.m13538a();
        String strM11414d = iku.m11410b(ikwVar).m11414d(ickVar.getContext().getResources());
        String strM11413c = iku.m11410b(ikwVar).m11413c(ickVar.getContext().getResources());
        Resources resources = ickVar.getContext().getResources();
        if (ikwVar == ikw.MOTION_BLUR) {
            dhv dhvVarMo3499a = ((cdp) ickVar.getContext()).mo3499a();
            if (!dhvVarMo3499a.mo6184l(dik.f11608f) && ((Integer) dhvVarMo3499a.mo6173a(dik.f11606d).get()).intValue() == 1) {
                strM11414d = resources.getString(C0100R.string.mode_motion_blur_long_exposure);
                strM11413c = resources.getString(C0100R.string.mode_motion_blur_long_exposure_desc);
            }
        }
        boolean z = ickVar.f30341b.get(ikwVar) == null;
        lku.m15614I(z, "mode " + String.valueOf(ikwVar) + " is registered already.");
        TextView textView = (TextView) ((LayoutInflater) ickVar.getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.mode_name, (ViewGroup) null);
        textView.setText(strM11414d);
        textView.setContentDescription(strM11413c);
        textView.setSoundEffectsEnabled(false);
        RippleDrawable rippleDrawable = (RippleDrawable) ickVar.getContext().getDrawable(C0100R.drawable.mode_chip_with_ripple);
        rippleDrawable.setRadius(0);
        textView.setBackground(rippleDrawable);
        ickVar.f30341b.put(ikwVar, textView);
        boolean z2 = afc.m442c(ickVar) == 1;
        idn idnVar = new idn(ickVar.getContext(), textView);
        idnVar.m11122c(z2 ? (int) resources.getDimension(C0100R.dimen.notification_dot_horiz_padding) : 0, (int) resources.getDimension(C0100R.dimen.notification_dot_top_padding), z2 ? 0 : (int) resources.getDimension(C0100R.dimen.notification_dot_horiz_padding));
        ickVar.f30344e.put(ikwVar, idnVar);
        ickVar.addView(textView);
        textView.setOnClickListener(new ggf(this, ikwVar, 6));
    }

    /* JADX INFO: renamed from: d */
    public final void m4390d() {
        Trace.beginSection("ModeSwitcher:applyOrientation");
        jvh.m13577y(this, this.f7066g);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: e */
    public final void m4391e(boolean z, boolean z2) {
        jvd.m13538a();
        this.f7062c.m11065c(z, z2);
    }

    /* JADX INFO: renamed from: f */
    public final void m4392f(int i, boolean z) {
        int width = i - (getWidth() / 2);
        if (z) {
            smoothScrollTo(width, 0);
        } else {
            scrollTo(width, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4393g(ikw ikwVar, boolean z) {
        jvd.m13538a();
        ikwVar.getClass();
        lku.m15670x(ikwVar != ikw.UNINITIALIZED, "Cannot setActiveMode to UNINITIALIZED");
        lku.m15614I(this.f7064e, "must call finalizeModeSetup before setActiveMode");
        this.f7062c.m11064b(ikwVar, z);
        this.f7070k = ikwVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m4394h(ikw ikwVar) {
        Trace.beginSection("ModeSwitcher#setActiveModeAndNL");
        lku.m15669w(ikwVar != ikw.UNINITIALIZED);
        m4393g(ikwVar, true);
        icy icyVar = this.f7068i;
        if (icyVar != null) {
            icyVar.mo11007f(ikwVar);
        }
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0005, B:13:0x001a, B:11:0x0012, B:16:0x001e, B:18:0x0029, B:19:0x002c, B:17:0x0024), top: B:24:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0024 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0005, B:13:0x001a, B:11:0x0012, B:16:0x001e, B:18:0x0029, B:19:0x002c, B:17:0x0024), top: B:24:0x0005 }] */
    @Override // p000.ict
    /* JADX INFO: renamed from: i */
    public final void mo4395i(ikw ikwVar, boolean z) {
        ick ickVar = this.f7062c;
        synchronized (ickVar) {
            if (!z) {
                if (!z) {
                }
                if (z) {
                    ickVar.f30343d.add(ikwVar);
                } else {
                    ickVar.f30343d.remove(ikwVar);
                }
                ickVar.f30345f = true;
                ickVar.requestLayout();
            }
            try {
                if (!ickVar.f30343d.contains(ikwVar)) {
                    if (!z || ickVar.f30343d.contains(ikwVar)) {
                        if (z) {
                            ickVar.f30343d.add(ikwVar);
                        } else {
                            ickVar.f30343d.remove(ikwVar);
                        }
                        ickVar.f30345f = true;
                        ickVar.requestLayout();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.f7065f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f7065f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4390d();
        }
        if (!this.f7065f) {
            int i5 = mws.f41739d;
            setSystemGestureExclusionRects(mzr.f41857a);
            return;
        }
        this.f7072m.right = getWidth();
        this.f7072m.bottom = getHeight();
        setSystemGestureExclusionRects(mws.m17097l(this.f7072m));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        jvd.m13538a();
        if (this.f7064e) {
            if (z && this.f7065f) {
                ((nbe) ((nbe) f7060a.m17252c()).mo17276G((char) 4149)).mo17290o("ModeSwitcher WAS ALREADY ENABLED!");
            } else if (!z && !this.f7065f) {
                ((nbe) ((nbe) f7060a.m17252c()).mo17276G((char) 4148)).mo17290o("ModeSwitcher WAS ALREADY DISABLED!");
            }
            this.f7062c.setEnabled(z);
            this.f7065f = z;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f7062c.setVisibility(i);
    }

    public ModeSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7072m = new Rect();
        this.f7061b = null;
        this.f7064e = false;
        this.f7065f = false;
        this.f7066g = ilk.PORTRAIT;
        this.f7068i = null;
        this.f7069j = new ico(1);
        this.f7070k = ikw.PHOTO;
        this.f7071l = ikw.UNINITIALIZED;
        m4387j(context);
    }

    public ModeSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7072m = new Rect();
        this.f7061b = null;
        this.f7064e = false;
        this.f7065f = false;
        this.f7066g = ilk.PORTRAIT;
        this.f7068i = null;
        this.f7069j = new ico(1);
        this.f7070k = ikw.PHOTO;
        this.f7071l = ikw.UNINITIALIZED;
        m4387j(context);
    }

    public ModeSwitcher(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7072m = new Rect();
        this.f7061b = null;
        this.f7064e = false;
        this.f7065f = false;
        this.f7066g = ilk.PORTRAIT;
        this.f7068i = null;
        this.f7069j = new ico(1);
        this.f7070k = ikw.PHOTO;
        this.f7071l = ikw.UNINITIALIZED;
        m4387j(context);
    }
}
