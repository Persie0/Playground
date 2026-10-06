package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.p014ui.modeslider.ModeSlider;
import com.google.android.apps.camera.p014ui.modeslider.ModeSliderUi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dab implements dac, kba, fbp, fbl, fbj {

    /* JADX INFO: renamed from: p */
    private static final nbh f10205p = nbh.m17259h("com/google/android/apps/camera/camcorder/ui/modeslider/ModeSliderControllerImpl");

    /* JADX INFO: renamed from: a */
    public final jww f10206a;

    /* JADX INFO: renamed from: b */
    public final BottomBarController f10207b;

    /* JADX INFO: renamed from: d */
    public final eoq f10209d;

    /* JADX INFO: renamed from: e */
    public final dad f10210e;

    /* JADX INFO: renamed from: f */
    public final ibf f10211f;

    /* JADX INFO: renamed from: g */
    public final icf f10212g;

    /* JADX INFO: renamed from: h */
    public final igb f10213h;

    /* JADX INFO: renamed from: j */
    public final daj f10215j;

    /* JADX INFO: renamed from: k */
    public final msi f10216k;

    /* JADX INFO: renamed from: m */
    public ModeSliderUi f10218m;

    /* JADX INFO: renamed from: n */
    public ObjectAnimator f10219n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f10220o;

    /* JADX INFO: renamed from: r */
    private final jww f10222r;

    /* JADX INFO: renamed from: s */
    private final dbr f10223s;

    /* JADX INFO: renamed from: u */
    private final Set f10225u;

    /* JADX INFO: renamed from: v */
    private final jvd f10226v;

    /* JADX INFO: renamed from: w */
    private final fcp f10227w;

    /* JADX INFO: renamed from: x */
    private final ohb f10228x;

    /* JADX INFO: renamed from: y */
    private final dhv f10229y;

    /* JADX INFO: renamed from: q */
    private final AtomicBoolean f10221q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final Object f10214i = new Object();

    /* JADX INFO: renamed from: l */
    public ikw f10217l = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: t */
    private final jvb f10224t = new jvb();

    /* JADX INFO: renamed from: c */
    public final Set f10208c = new HashSet();

    public dab(fan fanVar, jww jwwVar, jww jwwVar2, BottomBarController bottomBarController, eoq eoqVar, jvd jvdVar, dad dadVar, ibf ibfVar, icf icfVar, daj dajVar, igb igbVar, Set set, dbr dbrVar, ohb ohbVar, msi msiVar, fcp fcpVar, dhv dhvVar) {
        this.f10206a = jwwVar;
        this.f10222r = jwwVar2;
        this.f10207b = bottomBarController;
        this.f10223s = dbrVar;
        this.f10209d = eoqVar;
        this.f10226v = jvdVar;
        this.f10210e = dadVar;
        this.f10211f = ibfVar;
        this.f10212g = icfVar;
        this.f10215j = dajVar;
        this.f10213h = igbVar;
        this.f10228x = ohbVar;
        this.f10216k = msiVar;
        this.f10227w = fcpVar;
        this.f10225u = new HashSet(set);
        this.f10229y = dhvVar;
        jvdVar.m13541c(new cuq(this, fanVar, 4));
    }

    /* JADX INFO: renamed from: n */
    private final void m5790n(boolean z, boolean z2) {
        synchronized (this.f10214i) {
            if (m5799k(this.f10217l) && this.f10221q.get()) {
                m5798j(this.f10223s.mo5895d());
                if (!z) {
                    this.f10218m.setAlpha(1.0f);
                    if (z2) {
                        this.f10211f.mo10993b();
                        return;
                    } else {
                        this.f10211f.mo10994c();
                        return;
                    }
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10218m, (Property<ModeSliderUi, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setStartDelay(50L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.addListener(new daa(this, z2));
                this.f10219n = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
                return;
            }
            ((nbe) ((nbe) f10205p.m17252c()).mo17276G(798)).mo17270A("Ignore showing video mode slider. Current mode: %s, Ready to show UI: %b", this.f10217l, this.f10221q.get());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5791a() {
        this.f10207b.setClickable(true);
        this.f10212g.mo11013l(true);
        this.f10213h.mo11197E(true);
        this.f10209d.m7600g(1);
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f10221q.set(false);
        ObjectAnimator objectAnimator = this.f10219n;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f10221q.set(true);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f10211f.mo10992a();
        this.f10208c.clear();
        this.f10225u.clear();
        this.f10224t.close();
    }

    @Override // p000.dac
    /* JADX INFO: renamed from: d */
    public final void mo5792d(boolean z) {
        if (!z) {
            this.f10218m.setAlpha(0.0f);
            this.f10211f.mo10992a();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10218m, (Property<ModeSliderUi, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new dpf(this, 1));
        this.f10220o = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
    }

    @Override // p000.dac
    /* JADX INFO: renamed from: e */
    public final void mo5793e(ViewStub viewStub) {
        if (this.f10218m == null) {
            this.f10218m = (ModeSliderUi) viewStub.inflate();
        }
        this.f10218m.setOnTouchListener(new cln(this, 2));
        ibf ibfVar = this.f10211f;
        ModeSliderUi modeSliderUi = this.f10218m;
        ModeSlider modeSliderM4384b = modeSliderUi.m4384b();
        RecordSpeedSlider recordSpeedSliderM4383a = this.f10218m.m4383a();
        Set set = this.f10225u;
        ibfVar.f30199f = modeSliderUi;
        ibfVar.f30200g = modeSliderM4384b;
        ibfVar.f30201h = recordSpeedSliderM4383a;
        ibfVar.f30202i = set;
        this.f10215j.mo5825p(new AmbientModeSupport.AmbientController(this));
        ModeSlider modeSliderM4384b2 = this.f10218m.m4384b();
        modeSliderM4384b2.m4380i(this.f10210e);
        modeSliderM4384b2.f7051a = new epw(this, 1);
        this.f10211f.mo5711f();
        this.f10224t.m13537d(this.f10206a.mo3830a(new czq(this, 4), jvh.m13554b()));
        this.f10224t.m13537d(this.f10222r.mo3830a(new czq(this, 5), this.f10226v));
        this.f10224t.m13537d(this.f10223s.mo3830a(new czq(this, 6), jvh.m13554b()));
    }

    @Override // p000.dac
    /* JADX INFO: renamed from: f */
    public final void mo5794f(boolean z) {
        if (z) {
            this.f10218m.m4384b().mo4073d();
        } else {
            this.f10218m.m4384b().mo4072c();
        }
    }

    @Override // p000.dac
    /* JADX INFO: renamed from: g */
    public final void mo5795g(ilk ilkVar) {
        this.f10218m.m4385c(ilkVar);
    }

    @Override // p000.dac
    /* JADX INFO: renamed from: h */
    public final void mo5796h(boolean z) {
        m5790n(z, true);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0238  */
    /* JADX INFO: renamed from: i */
    public final void m5797i(ikw ikwVar) {
        mty mtyVarM16937w;
        String string;
        String quantityString;
        String string2;
        Optional optionalM12505of;
        int i;
        int i2;
        boolean z;
        ModeSlider modeSliderM4384b = this.f10218m.m4384b();
        RecordSpeedSlider recordSpeedSliderM4383a = this.f10218m.m4383a();
        if (ikwVar.equals(ikw.VIDEO)) {
            m5790n(false, false);
        } else {
            Optional optionalEmpty = Optional.empty();
            dad dadVar = this.f10210e;
            dadVar.m5802a(ikwVar);
            mty mtyVarM16936v = mty.m16936v();
            boolean zEquals = ikwVar.equals(ikw.VIDEO);
            int i3 = C0100R.string.timelapse_auto_record_speed;
            if (zEquals) {
                mtyVarM16937w = mtyVarM16936v;
            } else if (ikwVar.equals(ikw.TIME_LAPSE)) {
                mzh mzhVarM17166b = mzh.m17166b(Collections.reverseOrder());
                Object[] objArrM16519aa = mkv.m16519aa(dadVar.f10231b.f29158d.values().mo17025v());
                Arrays.sort(objArrM16519aa, mzhVarM17166b);
                ArrayList arrayListM16499G = mkv.m16499G(Arrays.asList(objArrM16519aa));
                mws mwsVarM17101p = dadVar.f10236g.mo6184l(diy.f11751h) ? mws.m17101p(Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_auto), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_5x), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_10x), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_30x), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_120x)) : mws.m17101p(Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_1x), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_5x), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_10x), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_30x), Integer.valueOf(C0100R.string.tooltip_msg_timelapse_record_speed_120x));
                Iterator it = arrayListM16499G.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    double dDoubleValue = ((Double) it.next()).doubleValue();
                    if (i4 != 0) {
                        double d = dadVar.f10231b.f29162h;
                        Double.isNaN(d);
                        double d2 = d / dDoubleValue;
                        Context context = dadVar.f10230a;
                        int i5 = (int) d2;
                        Integer numValueOf = Integer.valueOf(i5);
                        string = context.getString(C0100R.string.timelapse_manual_record_speed, numValueOf);
                        quantityString = dadVar.f10230a.getResources().getQuantityString(C0100R.plurals.accessibility_timelapse_manual_record_speed_desc, i5, numValueOf);
                    } else if (dadVar.f10236g.mo6184l(diy.f11751h)) {
                        String string3 = dadVar.f10230a.getResources().getString(i3);
                        quantityString = dadVar.f10230a.getResources().getString(C0100R.string.accessibility_timelapse_auto_record_speed_desc);
                        string = string3;
                        i4 = 0;
                    } else {
                        i4 = 0;
                        double d3 = dadVar.f10231b.f29162h;
                        Double.isNaN(d3);
                        double d4 = d3 / dDoubleValue;
                        Context context2 = dadVar.f10230a;
                        int i6 = (int) d4;
                        Integer numValueOf2 = Integer.valueOf(i6);
                        string = context2.getString(C0100R.string.timelapse_manual_record_speed, numValueOf2);
                        quantityString = dadVar.f10230a.getResources().getQuantityString(C0100R.plurals.accessibility_timelapse_manual_record_speed_desc, i6, numValueOf2);
                    }
                    Integer numValueOf3 = Integer.valueOf(i4);
                    mtyVarM16936v.mo16908p(numValueOf3, string);
                    mtyVarM16936v.mo16908p(numValueOf3, quantityString);
                    mws mwsVar = mwsVarM17101p;
                    mtyVarM16936v.mo16908p(numValueOf3, dadVar.f10230a.getResources().getString(((Integer) mwsVar.get(i4)).intValue()));
                    i4++;
                    mwsVarM17101p = mwsVar;
                    i3 = C0100R.string.timelapse_auto_record_speed;
                }
                mtyVarM16937w = mty.m16937w(mtyVarM16936v);
            } else if (ikwVar.equals(ikw.SLOW_MOTION)) {
                String string4 = dadVar.f10230a.getString(C0100R.string.accessibility_hfr_record_speed_desc, 1, 8);
                mtyVarM16936v.mo16908p(0, dadVar.f10235f);
                mtyVarM16936v.mo16908p(0, string4);
                mtyVarM16936v.mo16908p(0, dadVar.f10230a.getResources().getString(C0100R.string.tooltip_msg_hfr_record_speed_1_8x));
                String string5 = dadVar.f10230a.getString(C0100R.string.accessibility_hfr_record_speed_desc, 1, 4);
                mtyVarM16936v.mo16908p(1, dadVar.f10234e);
                mtyVarM16936v.mo16908p(1, string5);
                mtyVarM16936v.mo16908p(1, dadVar.f10230a.getResources().getString(C0100R.string.tooltip_msg_hfr_record_speed_1_4x));
                mtyVarM16937w = mty.m16937w(mtyVarM16936v);
            } else {
                mtyVarM16937w = mty.m16937w(mtyVarM16936v);
            }
            dad dadVar2 = this.f10210e;
            dadVar2.m5802a(ikwVar);
            if (ikwVar.equals(ikw.VIDEO)) {
                string2 = "";
            } else if (ikwVar.equals(ikw.TIME_LAPSE)) {
                string2 = ((hqn) dadVar2.f10233d.mo3831be()).equals(hqn.AUTO) ? dadVar2.f10230a.getResources().getString(C0100R.string.timelapse_auto_record_speed) : dadVar2.f10230a.getString(C0100R.string.timelapse_manual_record_speed, Integer.valueOf((int) dadVar2.f10231b.m10615a(((Double) dadVar2.f10232c.mo3831be()).doubleValue())));
            } else if (ikwVar.equals(ikw.SLOW_MOTION)) {
                string2 = ((jxn) dadVar2.f10238i.f34942d).equals(jxn.FPS_120_HFR_4X) ? dadVar2.f10234e : dadVar2.f10235f;
            } else {
                string2 = "";
            }
            int i7 = 0;
            while (true) {
                if (i7 >= mtyVarM16937w.mo16913r().size()) {
                    i7 = -1;
                    break;
                } else if (mtyVarM16937w.mo16914s(Integer.valueOf(i7), string2)) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                throw new IllegalArgumentException("No default speed id found");
            }
            if (ikwVar.equals(ikw.TIME_LAPSE)) {
                boolean zMo6184l = this.f10229y.mo6184l(diy.f11751h);
                i2 = C0100R.drawable.quantum_gm_ic_fast_forward_white_18;
                if (zMo6184l) {
                    optionalM12505of = Optional.m12505of("auto_timelapse_tooltip");
                    i = 1;
                    z = false;
                } else {
                    optionalM12505of = optionalEmpty;
                    i = 1;
                    z = false;
                }
            } else {
                optionalM12505of = optionalEmpty;
                i = 2;
                i2 = C0100R.drawable.quantum_gm_ic_slow_motion_video_white_18;
                z = true;
            }
            this.f10211f.mo10995d();
            modeSliderM4384b.measure(0, 0);
            this.f10215j.mo5824o(mtyVarM16937w, recordSpeedSliderM4383a, i, i7, i2, z, modeSliderM4384b.getMeasuredWidth(), optionalM12505of);
        }
        ((iqi) this.f10228x.get()).mo11606f();
        ((iqi) this.f10228x.get()).mo11607g(ikwVar.name());
    }

    /* JADX INFO: renamed from: j */
    public final void m5798j(kmq kmqVar) {
        ModeSlider modeSliderM4384b = this.f10218m.m4384b();
        Iterator it = this.f10210e.f30188j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((iay) it.next()).f30190b) {
                if (kmqVar.equals(kmq.f36557a)) {
                    modeSliderM4384b.getChildAt(i).setVisibility(8);
                } else {
                    modeSliderM4384b.getChildAt(i).setVisibility(0);
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5799k(ikw ikwVar) {
        return this.f10210e.f10237h.containsKey(ikwVar);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5800l(ikw ikwVar) {
        synchronized (this.f10214i) {
            if (this.f10217l.equals(ikwVar)) {
                return false;
            }
            if (!m5799k(ikwVar)) {
                throw new IllegalArgumentException("Unsupported application mode: " + String.valueOf(ikwVar));
            }
            this.f10217l = ikwVar;
            this.f10227w.mo8151Z(iku.m11411e(ikwVar), 2);
            mo5794f(false);
            Iterator it = this.f10208c.iterator();
            while (it.hasNext()) {
                ((AmbientModeSupport.AmbientController) it.next()).m1654d(ikwVar);
            }
            ModeSlider modeSliderM4384b = this.f10218m.m4384b();
            iay iayVar = (iay) this.f10210e.f10237h.get(ikwVar);
            iayVar.getClass();
            modeSliderM4384b.m4381k(modeSliderM4384b.m4377b(iayVar));
            return true;
        }
    }

    @Override // p000.dac
    /* JADX INFO: renamed from: m */
    public final kba mo5801m(AmbientModeSupport.AmbientController ambientController) {
        this.f10208c.add(ambientController);
        return new cic(this, ambientController, 9, (byte[]) null, (byte[]) null);
    }
}
