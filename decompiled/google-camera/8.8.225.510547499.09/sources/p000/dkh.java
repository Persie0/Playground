package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dkh extends djx {

    /* JADX INFO: renamed from: g */
    private static final nbh f11891g = nbh.m17259h(HEePJw.UehBgdkTWEbtUl);

    /* JADX INFO: renamed from: h */
    private kbc f11892h;

    public dkh(Context context, djy djyVar, chq chqVar, gyx gyxVar) {
        super(context, djyVar, chqVar, gyxVar);
    }

    /* JADX INFO: renamed from: p */
    private final int m6305p() {
        int i = this.f11833e.f21564c;
        return i > 0 ? i : this.f11832d.mo3745e().f35518b;
    }

    /* JADX INFO: renamed from: q */
    private final int m6306q() {
        int i = this.f11833e.f21566e;
        return i > 0 ? i : this.f11832d.mo3745e().f35517a;
    }

    /* JADX INFO: renamed from: r */
    private final boolean m6307r() {
        String str = this.f11833e.f21565d;
        return "90".equals(str) || "270".equals(str);
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: a */
    public final View mo3732a(mrm mrmVar, ViewGroup viewGroup) {
        View viewM6264j;
        djw djwVarK;
        if (mrmVar.mo16813g()) {
            viewM6264j = (View) mrmVar.mo16809c();
            djwVarK = m6262k(viewM6264j);
        } else {
            viewM6264j = null;
            djwVarK = null;
        }
        if (djwVarK == null) {
            viewM6264j = m6264j(viewGroup);
            djwVarK = m6262k(viewM6264j);
            djwVarK.getClass();
        }
        viewM6264j.getClass();
        viewM6264j.setTag(C0100R.id.mediadata_tag_viewtype, Integer.valueOf(chr.VIDEO.ordinal()));
        djwVarK.f11827c.setVisibility(8);
        m6265l(viewM6264j);
        djwVarK.f11825a.setContentDescription(this.f11830b.getResources().getString(C0100R.string.video_date_content_description, f11828a.format(this.f11832d.mo3748h())));
        return viewM6264j;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: c */
    public final chr mo3734c() {
        return chr.VIDEO;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: i */
    public final kym mo3740i(int i, int i2) {
        try {
            mrm mrmVarM16828h = mrm.m16828h((Bitmap) this.f11831c.m6270a().mo2855h(this.f11831c.m6272c(m6263n(this.f11832d), m6308o())).mo2855h(djy.m6269f()).m2852e(this.f11832d.mo3743c()).m2857j().get());
            ilj iljVar = ilj.PLACEHOLDER;
            return new kym(mrmVarM16828h);
        } catch (InterruptedException | ExecutionException e) {
            ((nbe) ((nbe) f11891g.m17251b()).mo17276G((char) 954)).mo17290o("Fails to generate thumbnail");
            mqu mquVar = mqu.f41450a;
            ilj iljVar2 = ilj.PLACEHOLDER;
            return new kym(mquVar);
        }
    }

    @Override // p000.djx
    /* JADX INFO: renamed from: m */
    protected final void mo6266m(djw djwVar) {
        this.f11831c.m6270a().mo2855h(this.f11831c.m6272c(m6263n(this.f11832d), m6308o())).mo2855h(djy.m6269f()).m2852e(this.f11832d.mo3743c()).m2858k(djwVar.f11825a).mo3337c();
    }

    /* JADX INFO: renamed from: o */
    public final kbc m6308o() {
        int iM6305p = m6307r() ? m6305p() : m6306q();
        int iM6306q = m6307r() ? m6306q() : m6305p();
        kbc kbcVar = this.f11892h;
        if (kbcVar == null || iM6305p != kbcVar.f35517a || iM6306q != kbcVar.f35518b) {
            this.f11892h = new kbc(iM6305p, iM6306q);
        }
        return this.f11892h;
    }

    public final String toString() {
        return "VideoItem: ".concat(String.valueOf(String.valueOf(this.f11832d)));
    }
}
