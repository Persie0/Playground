package p000;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfq extends get {

    /* JADX INFO: renamed from: a */
    public final Drawable f24599a;

    /* JADX INFO: renamed from: b */
    public final Drawable f24600b;

    /* JADX INFO: renamed from: c */
    private final jww f24601c;

    /* JADX INFO: renamed from: d */
    private final iid f24602d;

    /* JADX INFO: renamed from: e */
    private final mws f24603e = mws.m17098m(gfc.ASPECT_RATIO_THREE_BY_FOUR, gfc.ASPECT_RATIO_FOUR_BY_THREE);

    /* JADX INFO: renamed from: f */
    private final dhv f24604f;

    /* JADX INFO: renamed from: g */
    private final jwn f24605g;

    public gfq(hai haiVar, Resources resources, iid iidVar, dhv dhvVar, fmz fmzVar) {
        this.f24602d = iidVar;
        this.f24601c = new geu(haiVar.mo10030b(gzy.f27048g), (Integer) gzy.f27048g.m10026c(dhvVar), 2, gfc.ASPECT_RATIO_THREE_BY_FOUR, 1, gfc.ASPECT_RATIO_FOUR_BY_THREE);
        this.f24599a = resources.getDrawable(C0100R.drawable.ic_ratio_standard_rotate, null);
        this.f24600b = resources.getDrawable(C0100R.drawable.ic_ratio_3by4_rotate, null);
        this.f24604f = dhvVar;
        this.f24605g = fmzVar.f22756c;
    }

    /* JADX INFO: renamed from: o */
    public static final void m9184o(int i, Drawable drawable) {
        ObjectAnimator duration = ObjectAnimator.ofInt(drawable, "level", i).setDuration(250L);
        duration.setInterpolator(new akf());
        duration.start();
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: a */
    public final int mo5765a() {
        return C0100R.string.aspect_ratio_desc;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: b */
    protected final int mo5766b(gfc gfcVar) {
        ilk ilkVar = ilk.PORTRAIT;
        ikw ikwVar = ikw.UNINITIALIZED;
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 60:
                return C0100R.string.four_by_three_desc;
            case 61:
                return C0100R.string.three_by_four_desc;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: e */
    public final int mo5769e() {
        return C0100R.string.aspect_ratio_desc;
    }

    @Override // p000.get
    /* JADX INFO: renamed from: f */
    protected final int mo5770f(gfc gfcVar) {
        ilk ilkVar = ilk.PORTRAIT;
        ikw ikwVar = ikw.UNINITIALIZED;
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 60:
                return C0100R.string.four_by_three;
            case 61:
                return C0100R.string.three_by_four;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return gev.IMAGE_ASPECT_RATIO_IMMERSIVE;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f24601c;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        return this.f24603e;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        this.f24602d.f31066c.m4462c(new gfp(this, 0));
        ((geo) gfaVar).f24413q.m13537d(this.f24605g.mo3830a(new gcu(gfaVar, 9), not.INSTANCE));
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        if (!this.f24604f.mo6184l(dib.f11311bR) || !((Boolean) ((jwf) this.f24605g).f34942d).booleanValue()) {
            return false;
        }
        ilk ilkVar = ilk.PORTRAIT;
        ikw ikwVar = ikw.UNINITIALIZED;
        gfc gfcVar = gfc.UNKNOWN;
        switch (gfaVar.mo9115b().ordinal()) {
            case 1:
            case 6:
            case 11:
            case 12:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.get, p000.gfb
    /* JADX INFO: renamed from: y */
    public final Drawable mo9149y(gfc gfcVar, Resources resources) {
        ilk ilkVar = ilk.PORTRAIT;
        ikw ikwVar = ikw.UNINITIALIZED;
        gfc gfcVar2 = gfc.UNKNOWN;
        switch (gfcVar.ordinal()) {
            case 60:
                return this.f24599a;
            case 61:
                return this.f24600b;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }
}
