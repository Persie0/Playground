package p000;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButtonProgressOverlay;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ige implements igb {

    /* JADX INFO: renamed from: g */
    private static final mws f30725g = mws.m17099n(ikw.REWIND, ikw.MORE_MODES, ikw.LENS);

    /* JADX INFO: renamed from: a */
    public final ShutterButton f30726a;

    /* JADX INFO: renamed from: b */
    public final Object f30727b;

    /* JADX INFO: renamed from: c */
    public final List f30728c;

    /* JADX INFO: renamed from: d */
    boolean f30729d;

    /* JADX INFO: renamed from: e */
    boolean f30730e;

    /* JADX INFO: renamed from: f */
    public final ikt f30731f;

    /* JADX INFO: renamed from: h */
    private final Handler f30732h;

    /* JADX INFO: renamed from: i */
    private final mrm f30733i;

    /* JADX INFO: renamed from: j */
    private final iga f30734j;

    /* JADX INFO: renamed from: k */
    private final ShutterButtonProgressOverlay f30735k;

    /* JADX INFO: renamed from: l */
    private ikw f30736l = ikw.PHOTO;

    /* JADX INFO: renamed from: m */
    private final iuj f30737m;

    /* JADX INFO: renamed from: n */
    private final ohb f30738n;

    /* JADX INFO: renamed from: o */
    private ifi f30739o;

    /* JADX INFO: renamed from: p */
    private final igf f30740p;

    /* JADX INFO: renamed from: q */
    private final jfs f30741q;

    public ige(ShutterButton shutterButton, Handler handler, mrm mrmVar, ShutterButtonProgressOverlay shutterButtonProgressOverlay, ikt iktVar, iuj iujVar, ohb ohbVar, jfs jfsVar, byte[] bArr) {
        igc igcVar = new igc(this);
        this.f30740p = igcVar;
        this.f30726a = shutterButton;
        this.f30732h = handler;
        this.f30733i = mrmVar;
        this.f30739o = shutterButton.getMode();
        this.f30738n = ohbVar;
        ArrayList arrayList = new ArrayList();
        this.f30728c = arrayList;
        Object obj = new Object();
        this.f30727b = obj;
        this.f30734j = new iga(shutterButton);
        this.f30735k = shutterButtonProgressOverlay;
        this.f30731f = iktVar;
        this.f30737m = iujVar;
        this.f30741q = jfsVar;
        shutterButton.setListener(igcVar);
        mo11233e(new igd(this));
        synchronized (obj) {
            this.f30729d = shutterButton.isEnabled();
            this.f30730e = shutterButton.isClickEnabled();
            int size = arrayList.size();
            boolean z = true;
            if (size != 1) {
                z = false;
            }
            lku.m15614I(z, "Expect only the pressedStateAnimation listener at this stage.");
        }
    }

    /* JADX INFO: renamed from: ar */
    private final void m11255ar(ifi ifiVar) {
        ifi ifiVar2 = ifi.PHOTO_IDLE;
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (ifiVar.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 13:
            case 16:
            case 19:
            case 26:
                this.f30739o = ifiVar;
                break;
        }
    }

    /* JADX INFO: renamed from: as */
    private final void m11256as(ifi ifiVar) {
        m11255ar(ifiVar);
        this.f30726a.setMode(ifiVar, this.f30734j);
        ((igo) ((mrq) this.f30733i).f41482a).mo8348b(ifiVar);
        if (this.f30738n != null) {
            ((iqi) this.f30738n.get()).mo11609k(ifiVar.name().contains("IDLE"));
        }
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: A */
    public final void mo11193A(boolean z) {
        this.f30726a.setEnableLongPressMotion(z);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: B */
    public final void mo11194B(ifg ifgVar) {
        this.f30726a.setLongPressMotionListener(ifgVar);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: C */
    public final void mo11195C(int i) {
        this.f30735k.m4434b(i, -1L, false);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: D */
    public final void mo11196D(int i, long j, boolean z) {
        this.f30735k.m4434b(i, j, z);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: E */
    public final void mo11197E(boolean z) {
        m11258am(z, true);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: F */
    public final void mo11198F() {
        m11259an(false, true, false);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: G */
    public final void mo11199G(boolean z) {
        m11259an(z, true, true);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: H */
    public final void mo11200H() {
        m11256as(ifi.AUTOTIMER_RUNNING);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: I */
    public final void mo11201I() {
        m11256as(ifi.CANCEL);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: J */
    public final void mo11202J() {
        m11256as(ifi.VIDEO_PRESSED);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: K */
    public final void mo11203K() {
        m11262aq();
        m11256as(ifi.IMAX_RECORDING);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: L */
    public final void mo11204L() {
        m11256as(ifi.NIGHT_STOP);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: M */
    public final void mo11205M() {
        m11256as(ifi.NIGHT_CANCEL);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: N */
    public final void mo11206N() {
        m11256as(ifi.NIGHT_PROCESSING);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: O */
    public final void mo11207O() {
        m11256as(ifi.PHOTO_LONGPRESS);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: P */
    public final void mo11208P() {
        mo11199G(true);
        iuj iujVar = this.f30737m;
        if (iujVar != null) {
            iujVar.mo11728I(true);
        }
        m11256as(ifi.PHOTO_LONGPRESS_LOCKED);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: Q */
    public final void mo11209Q() {
        m11256as(ifi.LASAGNA_PROCESSING);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: R */
    public final void mo11210R() {
        m11256as(ifi.CONFIRM_DISABLED);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: S */
    public final void mo11211S() {
        m11256as(ifi.CONFIRM_ENABLED);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: T */
    public final void mo11212T() {
        m11256as(ifi.CATSHARK_PHOTO_PROCESSING);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: U */
    public final void mo11213U() {
        m11256as(ifi.CATSHARK_PORTRAIT_PROCESSING);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: V */
    public final void mo11214V() {
        m11256as(ifi.VIDEO_PRESSED);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: W */
    public final void mo11215W() {
        m11256as(ifi.TIMELAPSE_PRESSED);
        this.f30726a.startTimelapseCircleAnimation();
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: X */
    public final void mo11216X() {
        m11256as(ifi.VIDEO_RECORDING);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: Y */
    public final void mo11217Y() {
        m11256as(ifi.f30628J);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: Z */
    public final void mo11218Z() {
        m11256as(this.f30739o);
        ohb ohbVar = this.f30738n;
        if (ohbVar != null) {
            ((iqi) ohbVar.get()).mo11604b();
        }
    }

    @Override // p000.dch
    /* JADX INFO: renamed from: a */
    public final nps mo4489a(kmq kmqVar) {
        mo11197E(false);
        return kxk.m14965K(null);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: aa */
    public final void mo11219aa() {
        m11256as(ifi.VIDEO_IDLE);
        m11257al(1.0f);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ab */
    public final void mo11220ab() {
        if (m11261ap()) {
            this.f30726a.setPressed(false);
        }
        m11256as(ifi.PHOTO_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ac */
    public final void mo11221ac() {
        if (m11261ap()) {
            this.f30726a.setPressed(false);
        }
        m11256as(ifi.PHOTO_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ad */
    public final void mo11222ad() {
        if (this.f30736l == ikw.AMBER) {
            m11256as(ifi.AMBER_IDLE);
        } else {
            m11256as(ifi.VIDEO_IDLE);
        }
        m11257al(1.0f);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ae */
    public final void mo11223ae() {
        m11256as(ifi.TIMELAPSE_PROCESSING);
        this.f30726a.stopTimelapseCircleAnimation();
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: af */
    public final void mo11224af(ikw ikwVar) {
        this.f30726a.setApplicationMode(ikwVar);
        ifi ifiVar = ifi.PHOTO_IDLE;
        ikw ikwVar2 = ikw.UNINITIALIZED;
        switch (ikwVar) {
            case UNINITIALIZED:
            case ORNAMENT:
            case SETTINGS:
            case MEASURE:
            case TIARA:
                throw new IllegalStateException("Unsupported mode ".concat(String.valueOf(String.valueOf(ikwVar))));
            case PHOTO:
                m11256as(this.f30726a.getCurrentSpec().f30845w == gzp.AUTO ? ifi.f30628J : ifi.PHOTO_IDLE);
                ((igo) ((mrq) this.f30733i).f41482a).mo8350d();
                break;
            case VIDEO:
            case SLOW_MOTION:
            case VIDEO_INTENT:
                m11256as(ifi.VIDEO_IDLE);
                break;
            case IMAX:
                m11256as(ifi.IMAX_IDLE);
                break;
            case PHOTO_SPHERE:
                m11256as(ifi.PHOTOSPHERE_IDLE);
                break;
            case PORTRAIT:
                m11256as(ifi.PORTRAIT_IDLE);
                break;
            case IMAGE_INTENT:
                m11256as(ifi.PHOTO_IDLE);
                break;
            case MOTION_BLUR:
                m11256as(ifi.LASAGNA_IDLE);
                break;
            case LONG_EXPOSURE:
                m11256as(ifi.NIGHT_IDLE);
                break;
            case TIME_LAPSE:
                m11256as(ifi.TIMELAPSE_IDLE);
                break;
            case AMBER:
                m11256as(ifi.AMBER_IDLE);
                break;
        }
        this.f30736l = ikwVar;
        int i = true != f30725g.contains(ikwVar) ? 0 : 4;
        if (i == this.f30726a.getVisibility()) {
            return;
        }
        inw.m11549a(i, this.f30726a);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ag */
    public final void mo11225ag() {
        m11262aq();
        m11256as(ifi.CONFIRM_ENABLED);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ah */
    public final void mo11226ah() {
        m11256as(ifi.TIMELAPSE_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ai */
    public final void mo11227ai(gzp gzpVar) {
        ifi ifiVar = this.f30726a.getCurrentSpec().f30844v;
        m11255ar(ifiVar);
        ifi ifiVar2 = ifi.PHOTO_IDLE;
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (ifiVar.ordinal()) {
            case 0:
            case 35:
                if (gzpVar != gzp.AUTO) {
                    this.f30726a.setMode(ifi.PHOTO_IDLE, gzpVar, this.f30734j);
                } else {
                    this.f30726a.setMode(ifi.f30628J, gzpVar, this.f30734j);
                }
                break;
            case 2:
            case 13:
            case 16:
            case 19:
            case 24:
            case 26:
                this.f30726a.setMode(ifiVar, gzpVar, this.f30734j);
                break;
        }
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: aj */
    public final void mo11228aj() {
        m11256as(ifi.CONFIRM_ENABLED);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: ak */
    public final void mo11229ak() {
        this.f30726a.updateTimelapseProgressState();
    }

    /* JADX INFO: renamed from: al */
    final void m11257al(float f) {
        this.f30726a.animateToScale(f);
    }

    /* JADX INFO: renamed from: am */
    public final void m11258am(boolean z, boolean z2) {
        synchronized (this.f30727b) {
            if (z2) {
                try {
                    this.f30730e = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z3 = false;
            if (z && m11260ao()) {
                z3 = true;
            }
            this.f30732h.post(new bnp(this, z3, 18));
        }
    }

    /* JADX INFO: renamed from: an */
    public final void m11259an(boolean z, boolean z2, boolean z3) {
        synchronized (this.f30727b) {
            if (z2) {
                try {
                    this.f30729d = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i = 1;
            boolean z4 = false;
            if (z && m11260ao()) {
                z4 = true;
            }
            this.f30732h.post(new irp(this, z4, z3, i));
        }
    }

    /* JADX INFO: renamed from: ao */
    public final boolean m11260ao() {
        boolean z;
        synchronized (this.f30727b) {
            z = true;
            if (this.f30728c.size() <= 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ap */
    public final boolean m11261ap() {
        jfs jfsVar = this.f30741q;
        return jfsVar != null && jfsVar.m13078M();
    }

    /* JADX INFO: renamed from: aq */
    final void m11262aq() {
        this.f30726a.setEnabled(true);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: b */
    public final ShutterButton mo11230b() {
        return this.f30726a;
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: c */
    public final kba mo11231c() {
        m11259an(false, false, true);
        return new hcu(this, 15);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kba mo11232d() {
        mo11197E(true);
        return new hcu((igb) this, 14);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: e */
    public final kba mo11233e(igf igfVar) {
        synchronized (this.f30727b) {
            this.f30728c.add(igfVar);
            if (m11260ao()) {
                m11259an(this.f30729d, false, true);
                m11258am(this.f30730e, false);
            }
        }
        return new gto(this, igfVar, 20);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: f */
    public final void mo11234f() {
        m11256as(ifi.PHOTOSPHERE_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: g */
    public final void mo11235g() {
        m11256as(ifi.ASTRO_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: h */
    public final void mo11236h() {
        m11256as(ifi.CATSHARK_PHOTO_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: i */
    public final void mo11237i() {
        m11256as(ifi.CATSHARK_PORTRAIT_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: j */
    public final void mo11238j() {
        m11256as(ifi.NIGHT_IDLE);
        ohb ohbVar = this.f30738n;
        if (ohbVar != null) {
            ((iqi) ohbVar.get()).mo11605c();
        }
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: k */
    public final void mo11239k() {
        m11256as(ifi.IMAX_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: l */
    public final void mo11240l() {
        m11256as(ifi.NIGHT_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: m */
    public final void mo11241m() {
        m11256as(ifi.LASAGNA_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: n */
    public final void mo11242n() {
        m11256as(ifi.PHOTOSPHERE_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: o */
    public final void mo11243o() {
        m11256as(ifi.CATSHARK_PHOTO_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: p */
    public final void mo11244p() {
        m11256as(ifi.CATSHARK_PORTRAIT_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: q */
    public final void mo11245q() {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.f30735k;
        AnimatorSet animatorSet = shutterButtonProgressOverlay.f7180i;
        if (animatorSet != null && animatorSet.isRunning()) {
            shutterButtonProgressOverlay.f7180i.cancel();
        }
        ValueAnimator valueAnimator = shutterButtonProgressOverlay.f7181j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            shutterButtonProgressOverlay.f7181j.cancel();
        }
        shutterButtonProgressOverlay.m4433a();
        shutterButtonProgressOverlay.f7173b = 0;
        shutterButtonProgressOverlay.f7174c = 0.0f;
        shutterButtonProgressOverlay.f7179h = false;
        shutterButtonProgressOverlay.f7178g = true;
        shutterButtonProgressOverlay.f7182k = 1;
        shutterButtonProgressOverlay.invalidate();
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: r */
    public final void mo11246r() {
        m11257al(0.8f);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: s */
    public final void mo11247s() {
        m11257al(0.8f);
        this.f30726a.pauseTimelapseAnimationState();
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: t */
    public final void mo11248t() {
        this.f30726a.performClick();
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: u */
    public final void mo11249u() {
        this.f30726a.performShutterButtonDown();
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: v */
    public final void mo11250v() {
        m11257al(1.0f);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: w */
    public final void mo11251w() {
        m11257al(1.0f);
        this.f30726a.resumeTimelapseAnimationState();
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: x */
    public final void mo11252x() {
        m11256as(ifi.PHOTO_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: y */
    public final void mo11253y() {
        m11256as(ifi.VIDEO_IDLE);
    }

    @Override // p000.igb
    /* JADX INFO: renamed from: z */
    public final void mo11254z(boolean z) {
        this.f30726a.runPressedStateAnimation(z, this.f30734j);
    }
}
