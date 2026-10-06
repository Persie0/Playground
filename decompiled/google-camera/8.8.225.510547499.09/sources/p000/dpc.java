package p000;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.EvCompView;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.util.ArrayList;
import java.util.Iterator;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpc implements dox, kba {

    /* JADX INFO: renamed from: a */
    public EvCompView f12177a;

    /* JADX INFO: renamed from: b */
    public jww f12178b;

    /* JADX INFO: renamed from: c */
    public mrm f12179c;

    /* JADX INFO: renamed from: d */
    public ImageButton f12180d;

    /* JADX INFO: renamed from: e */
    private final Context f12181e;

    /* JADX INFO: renamed from: f */
    private final Duration f12182f;

    /* JADX INFO: renamed from: j */
    private final jww f12186j;

    /* JADX INFO: renamed from: l */
    private final kbz f12188l;

    /* JADX INFO: renamed from: m */
    private dpj f12189m;

    /* JADX INFO: renamed from: n */
    private dpo f12190n;

    /* JADX INFO: renamed from: p */
    private ObjectAnimator f12192p;

    /* JADX INFO: renamed from: q */
    private idg f12193q;

    /* JADX INFO: renamed from: r */
    private CheckBox f12194r;

    /* JADX INFO: renamed from: v */
    private kba f12198v;

    /* JADX INFO: renamed from: w */
    private AmbientModeSupport.AmbientController f12199w;

    /* JADX INFO: renamed from: h */
    private final jww f12184h = new jwf(false);

    /* JADX INFO: renamed from: i */
    private final jww f12185i = new jwf(false);

    /* JADX INFO: renamed from: k */
    private final jww f12187k = new jwf(true);

    /* JADX INFO: renamed from: o */
    private Animator f12191o = new AnimatorSet();

    /* JADX INFO: renamed from: s */
    private boolean f12195s = false;

    /* JADX INFO: renamed from: t */
    private boolean f12196t = false;

    /* JADX INFO: renamed from: u */
    private boolean f12197u = false;

    /* JADX INFO: renamed from: g */
    private final jvb f12183g = new jvb();

    public dpc(Context context, kbz kbzVar, jww jwwVar) {
        this.f12181e = context;
        this.f12188l = kbzVar;
        this.f12186j = jwwVar;
        this.f12182f = Duration.ofMillis(context.getResources().getInteger(C0100R.integer.reset_button_animation_duration_millis));
    }

    /* JADX INFO: renamed from: x */
    private final void m6530x() {
        if (this.f12198v == null) {
            this.f12198v = ((glz) ((mrq) this.f12179c).f41482a).mo9460d().mo3830a(new czq(this, 18), this.f12181e.getMainExecutor());
        }
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: a */
    public final jwn mo6465a() {
        return this.f12187k;
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: b */
    public final jwn mo6466b() {
        return this.f12184h;
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: c */
    public final jwn mo6467c() {
        return this.f12185i;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        dpj dpjVar = this.f12189m;
        if (dpjVar != null) {
            dpjVar.mo5712g();
        }
        this.f12184h.mo3415bf(false);
        this.f12183g.close();
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: d */
    public final void mo6468d() {
        this.f12188l.mo13961e("EvCompViewCtrl#disable");
        dpj dpjVar = this.f12189m;
        if (dpjVar != null) {
            dpjVar.mo6542a();
        }
        this.f12188l.mo13962f();
        this.f12196t = false;
        this.f12197u = false;
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: e */
    public final void mo6469e() {
        CheckBox checkBox = this.f12194r;
        lku.m15661o(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setEnabled(false);
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: f */
    public final void mo6470f() {
        CheckBox checkBox = this.f12194r;
        lku.m15661o(checkBox, CswIK.mLRh, new Object[0]);
        checkBox.setSoundEffectsEnabled(false);
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: g */
    public final void mo6471g(int i, int i2, float f) {
        this.f12188l.mo13961e("EvCompViewCtrl#enable");
        m6531u().mo6543b(i, i2, f);
        this.f12188l.mo13962f();
        if (this.f12197u) {
            m6532v();
            mo6480p(false, false);
            this.f12197u = false;
        }
        this.f12196t = true;
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: h */
    public final void mo6472h() {
        CheckBox checkBox = this.f12194r;
        lku.m15661o(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setEnabled(true);
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: i */
    public final void mo6473i() {
        CheckBox checkBox = this.f12194r;
        lku.m15661o(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setSoundEffectsEnabled(true);
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: j */
    public final void mo6474j(boolean z) {
        if (((Boolean) this.f12186j.mo3831be()).booleanValue() && !this.f12195s) {
            m6531u().mo6544c(z);
        }
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: k */
    public final void mo6475k() {
        ((glz) ((mrq) this.f12179c).f41482a).mo9465i();
        m6533w(false, false);
        dpo dpoVar = this.f12190n;
        if (dpoVar != null) {
            dpoVar.m6552j();
        }
        if (((Boolean) ((jwf) this.f12187k).f34942d).booleanValue()) {
            return;
        }
        dpo dpoVar2 = this.f12190n;
        lku.m15662p(dpoVar2);
        dpoVar2.m6554l();
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: l */
    public final void mo6476l(boolean z) {
        this.f12193q.f30444l = z;
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: m */
    public final void mo6477m(boolean z) {
        if (((Boolean) ((jwf) this.f12185i).f34942d).booleanValue() == z) {
            return;
        }
        this.f12185i.mo3415bf(Boolean.valueOf(z));
        if (z) {
            dpo dpoVar = this.f12190n;
            lku.m15662p(dpoVar);
            dpoVar.mo6549c();
        }
        AmbientModeSupport.AmbientController ambientController = this.f12199w;
        if (ambientController != null) {
            Object obj = ambientController.f1702a;
            if (z) {
                cdh cdhVar = (cdh) obj;
                if (((cdg) ((jwf) cdhVar.f5299a).f34942d).equals(cdg.AE_LOCKED) || ((cdg) ((jwf) cdhVar.f5299a).f34942d).equals(cdg.AE_AF_LOCKED)) {
                    return;
                }
                cdhVar.f5299a.mo3415bf(cdg.AE_LOCKED);
                return;
            }
            cdh cdhVar2 = (cdh) obj;
            if (((cdg) ((jwf) cdhVar2.f5299a).f34942d).equals(cdg.AE_UNLOCKED) || ((cdg) ((jwf) cdhVar2.f5299a).f34942d).equals(cdg.UNLOCKED)) {
                return;
            }
            cdhVar2.f5299a.mo3415bf(cdg.AE_UNLOCKED);
        }
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: n */
    public final void mo6478n(dot dotVar) {
        this.f12178b.mo3415bf(dotVar);
        EvCompView evCompView = this.f12177a;
        evCompView.f6643b.mo3415bf(dotVar);
        evCompView.m4115m();
        evCompView.m4113k();
        evCompView.m4114l();
        if (!evCompView.f6642a.isEmpty()) {
            ArrayList arrayList = evCompView.f6642a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dov dovVar = (dov) arrayList.get(i);
                if (evCompView.f6647f.indexOfChild(dovVar) != -1) {
                    evCompView.f6647f.removeView(dovVar);
                } else if (evCompView.f6648g.indexOfChild(dovVar) != -1) {
                    evCompView.f6648g.removeView(dovVar);
                }
            }
            evCompView.f6642a.clear();
        }
        dot dotVar2 = dot.SINGLE;
        switch (dotVar) {
            case SINGLE:
                evCompView.f6649h = evCompView.m4106c(dow.BRIGHTNESS, 0.0f, 1.0f, C0100R.drawable.quantum_gm_ic_brightness_medium_white_24, C0100R.color.google_grey800, C0100R.drawable.bg_evcomp_brightness_knob, C0100R.string.exposure_knob_description);
                evCompView.f6647f.addView(evCompView.f6649h);
                evCompView.f6642a.add(evCompView.f6649h);
                evCompView.f6648g.setVisibility(8);
                break;
            case DUAL:
                float fM4105b = evCompView.f6644c / evCompView.m4105b();
                evCompView.f6649h = evCompView.m4106c(dow.BRIGHTNESS, 0.0f, 1.0f - fM4105b, C0100R.drawable.ic_evc_brightness_24px, C0100R.color.google_grey800, C0100R.drawable.bg_evcomp_brightness_knob, C0100R.string.brightness_knob_accessibility_description);
                evCompView.f6650i = evCompView.m4106c(dow.SHADOW, fM4105b, 1.0f, C0100R.drawable.ic_evc_shadow_24px, C0100R.color.google_grey100, C0100R.drawable.bg_evcomp_shadow_knob, C0100R.string.shadow_knob_accessibility_description);
                evCompView.f6647f.addView(evCompView.f6649h);
                evCompView.f6647f.addView(evCompView.f6650i);
                evCompView.f6642a.add(evCompView.f6649h);
                evCompView.f6642a.add(evCompView.f6650i);
                evCompView.f6648g.setVisibility(8);
                break;
            case DUAL_INDEPENDENT:
                evCompView.f6649h = evCompView.m4106c(dow.BRIGHTNESS, 0.0f, 1.0f, C0100R.drawable.ic_evc_brightness_24px, C0100R.color.google_grey800, C0100R.drawable.bg_evcomp_brightness_knob, C0100R.string.brightness_knob_accessibility_description);
                evCompView.f6650i = evCompView.m4106c(dow.SHADOW, 0.0f, 1.0f, C0100R.drawable.ic_evc_shadow_24px, C0100R.color.google_grey100, C0100R.drawable.bg_evcomp_shadow_knob, C0100R.string.shadow_knob_accessibility_description);
                evCompView.f6647f.addView(evCompView.f6649h);
                evCompView.f6648g.addView(evCompView.f6650i);
                evCompView.f6642a.add(evCompView.f6649h);
                evCompView.f6642a.add(evCompView.f6650i);
                evCompView.f6648g.setVisibility(0);
                break;
        }
        ArrayList arrayList2 = evCompView.f6642a;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dov dovVar2 = (dov) arrayList2.get(i2);
            evCompView.m4107e(dovVar2, dovVar2.f12165d);
        }
        evCompView.invalidate();
        evCompView.requestLayout();
        final dpo dpoVar = this.f12190n;
        lku.m15662p(dpoVar);
        dpoVar.mo6547a();
        dpoVar.m6552j();
        Iterator it = this.f12177a.f6642a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).setOnTouchListener(new View.OnTouchListener() { // from class: doz
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    dpc dpcVar = this.f12173a;
                    dpo dpoVar2 = dpoVar;
                    if (dpcVar.f12177a.getVisibility() != 0) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        dpcVar.f12177a.m4116n(view, motionEvent);
                        dpcVar.m6533w(true, true);
                        dpcVar.mo6477m(true);
                        return true;
                    }
                    if (motionEvent.getAction() == 1) {
                        dow dowVar = (dow) view.getTag();
                        dowVar.getClass();
                        dpoVar2.mo6548b(dowVar);
                        if (!((dot) dpcVar.f12178b.mo3831be()).equals(dot.DUAL_INDEPENDENT)) {
                            return true;
                        }
                    } else if (motionEvent.getAction() == 2) {
                        float[] fArrM4116n = dpcVar.f12177a.m4116n(view, motionEvent);
                        float f = fArrM4116n[0];
                        Object tag = view.getTag();
                        tag.getClass();
                        dpoVar2.mo6550d(f, (dow) tag);
                        if (fArrM4116n[1] != -1.0f) {
                            Object tag2 = view.getTag();
                            tag2.getClass();
                            dpoVar2.mo6550d(fArrM4116n[1], ((dow) tag2).equals(dow.BRIGHTNESS) ? dow.SHADOW : dow.BRIGHTNESS);
                        }
                    }
                    return true;
                }
            });
        }
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: o */
    public final void mo6479o(ilk ilkVar) {
        EvCompView evCompView = this.f12177a;
        evCompView.f6651j = ilkVar;
        evCompView.m4108f(ilkVar);
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: p */
    public final void mo6480p(boolean z, boolean z2) {
        if (((Boolean) this.f12186j.mo3831be()).booleanValue()) {
            Object obj = ((jwf) this.f12185i).f34942d;
            m6531u().mo6545d(z, z2);
            this.f12177a.postDelayed(new dgt(this, 13), 500L);
        }
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: q */
    public final void mo6481q(int i) {
        if (this.f12195s) {
            return;
        }
        dpo dpoVar = this.f12190n;
        lku.m15662p(dpoVar);
        if (dpoVar.f12218a.getVisibility() != 0) {
            return;
        }
        dpoVar.m6551i();
        dpoVar.f12218a.postDelayed(dpoVar.f12228k, i);
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: r */
    public final void mo6482r(hzj hzjVar, ikw ikwVar) {
        boolean z = hzj.f30014d.equals(hzjVar) && ikwVar.f31414w;
        this.f12195s = z;
        if (!z) {
            mo6474j(!hzj.f30014d.equals(hzjVar));
            return;
        }
        if (this.f12196t) {
            m6532v();
            mo6480p(true, false);
            m6530x();
        }
        this.f12197u = !this.f12196t;
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: s */
    public final void mo6483s(AmbientModeSupport.AmbientController ambientController) {
        this.f12199w = ambientController;
    }

    @Override // p000.dox
    /* JADX INFO: renamed from: t */
    public final void mo6484t(EvCompView evCompView, jww jwwVar, jww jwwVar2, jww jwwVar3, jww jwwVar4, djm djmVar, mrm mrmVar, idg idgVar) {
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this.f12181e, R.animator.fade_in);
        objectAnimator.setTarget(evCompView);
        this.f12192p = objectAnimator;
        this.f12178b = jwwVar;
        this.f12177a = evCompView;
        this.f12193q = idgVar;
        this.f12179c = mrmVar;
        this.f12194r = evCompView.f6645d;
        this.f12180d = evCompView.f6646e;
        CheckBox checkBox = this.f12194r;
        lku.m15662p(checkBox);
        checkBox.setVisibility(8);
        this.f12180d.setOnClickListener(new ViewOnClickListenerC0250hu(this, 12));
        this.f12190n = new dpw(new doy(this, 0), evCompView, jwwVar2, jwwVar3, jwwVar4, jwwVar, djmVar, this.f12187k, mrmVar, null, null, null);
        CheckBox checkBox2 = this.f12194r;
        ObjectAnimator objectAnimator2 = this.f12192p;
        dpo dpoVar = this.f12190n;
        lku.m15662p(dpoVar);
        dpo dpoVar2 = this.f12190n;
        lku.m15662p(dpoVar2);
        dps dpsVar = new dps(evCompView, checkBox2, objectAnimator2, dpoVar, djmVar, dpoVar2, null, null, null);
        this.f12189m = dpsVar;
        dpsVar.mo5711f();
        this.f12185i.mo3415bf(false);
        idgVar.f30444l = false;
        this.f12184h.mo3415bf(true);
    }

    /* JADX INFO: renamed from: u */
    public final dpj m6531u() {
        dpj dpjVar = this.f12189m;
        lku.m15662p(dpjVar);
        return dpjVar;
    }

    /* JADX INFO: renamed from: v */
    public final void m6532v() {
        dpo dpoVar = this.f12190n;
        lku.m15662p(dpoVar);
        dpoVar.m6551i();
    }

    /* JADX INFO: renamed from: w */
    public final void m6533w(boolean z, boolean z2) {
        if (!this.f12195s || z2) {
            kba kbaVar = this.f12198v;
            if (kbaVar != null) {
                kbaVar.close();
                this.f12198v = null;
            }
        } else {
            m6530x();
        }
        if (!z) {
            this.f12180d.setVisibility(true == z2 ? 0 : 8);
            return;
        }
        if (z2) {
            if (this.f12180d.getAlpha() == 1.0f && this.f12180d.getVisibility() == 0) {
                return;
            }
            this.f12191o.cancel();
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.f12181e, R.animator.fade_in);
            this.f12191o = animatorLoadAnimator;
            animatorLoadAnimator.setDuration(this.f12182f.toMillis());
            this.f12191o.setTarget(this.f12180d);
            this.f12191o.addListener(new dpa(this));
            this.f12191o.start();
            return;
        }
        if (this.f12180d.getAlpha() == 0.0f && this.f12180d.getVisibility() == 8) {
            return;
        }
        this.f12191o.cancel();
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this.f12181e, R.animator.fade_out);
        this.f12191o = animatorLoadAnimator2;
        animatorLoadAnimator2.setDuration(this.f12182f.toMillis());
        this.f12191o.setTarget(this.f12180d);
        this.f12191o.addListener(new dpb(this));
        this.f12191o.start();
    }
}
