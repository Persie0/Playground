package p000;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfo extends get {

    /* JADX INFO: renamed from: a */
    public final Drawable f24588a;

    /* JADX INFO: renamed from: b */
    public final Drawable f24589b;

    /* JADX INFO: renamed from: c */
    private final jww f24590c;

    /* JADX INFO: renamed from: d */
    private final iid f24591d;

    /* JADX INFO: renamed from: e */
    private final mws f24592e = mws.m17098m(gfc.ASPECT_RATIO_SIXTEEN_BY_NINE, gfc.ASPECT_RATIO_FOUR_BY_THREE);

    /* JADX INFO: renamed from: f */
    private final dhv f24593f;

    /* JADX INFO: renamed from: g */
    private final jwn f24594g;

    /* JADX INFO: renamed from: h */
    private final jwn f24595h;

    /* JADX INFO: renamed from: i */
    private final fmz f24596i;

    public gfo(hai haiVar, Resources resources, iid iidVar, dhv dhvVar, fmz fmzVar, jwn jwnVar) {
        this.f24591d = iidVar;
        this.f24590c = new geu(haiVar.mo10030b(gzy.f27046e), (Integer) gzy.f27046e.m10026c(dhvVar), 0, gfc.ASPECT_RATIO_SIXTEEN_BY_NINE, 1, gfc.ASPECT_RATIO_FOUR_BY_THREE);
        this.f24588a = resources.getDrawable(C0100R.drawable.ic_ratio_standard_rotate, null);
        this.f24589b = resources.getDrawable(C0100R.drawable.ic_ratio_full_rotate, null);
        this.f24593f = dhvVar;
        this.f24596i = fmzVar;
        this.f24594g = fmzVar.f22756c;
        this.f24595h = jwnVar;
    }

    /* JADX INFO: renamed from: o */
    public static final void m9183o(int i, Drawable drawable) {
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
            case 59:
                return C0100R.string.sixteen_by_nine_desc;
            case 60:
                return C0100R.string.four_by_three_desc;
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
            case 59:
                return C0100R.string.sixteen_by_nine;
            case 60:
                return C0100R.string.four_by_three;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: g */
    public final gev mo5771g() {
        return gev.IMAGE_ASPECT_RATIO;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: i */
    public final jww mo5773i() {
        return this.f24590c;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: j */
    public final mws mo5774j() {
        return this.f24592e;
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: k */
    public final void mo5775k(gfa gfaVar) {
        this.f24591d.f31066c.m4462c(new gfp(this, 1));
        geo geoVar = (geo) gfaVar;
        geoVar.f24413q.m13537d(this.f24594g.mo3830a(new gcu(gfaVar, 7), not.INSTANCE));
        geoVar.f24413q.m13537d(this.f24595h.mo3830a(new gcu(gfaVar, 8), not.INSTANCE));
    }

    @Override // p000.gfb
    /* JADX INFO: renamed from: n */
    public final boolean mo5778n(gfa gfaVar) {
        if (((Boolean) ((jwf) this.f24594g).f34942d).booleanValue()) {
            return false;
        }
        if (this.f24593f.mo6184l(dib.f11311bR)) {
            fmz fmzVar = this.f24596i;
            if (fmzVar.m8599c(fmzVar.f22755b.mo5895d())) {
                return false;
            }
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
            case 59:
                return this.f24589b;
            case 60:
                return this.f24588a;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(gfcVar))));
        }
    }
}
