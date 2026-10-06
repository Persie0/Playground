package p000;

import android.content.pm.ResolveInfo;
import android.widget.Toast;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class hgj implements hgd {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ hgk f27671b;

    public hgj(hgk hgkVar) {
        this.f27671b = hgkVar;
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: a */
    public void mo10196a() {
        this.f27671b.m10245r(false, true);
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo10197b(chp chpVar, boolean z) {
    }

    @Override // p000.hgd, p000.fbl
    /* JADX INFO: renamed from: bF */
    public void mo3523bF() {
    }

    @Override // p000.hgd, p000.ezs
    /* JADX INFO: renamed from: bH */
    public final /* synthetic */ boolean mo3807bH() {
        return false;
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ void mo10198cb() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo10199d(chp chpVar, boolean z) {
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        hgk hgkVar = this.f27671b;
        ResolveInfo resolveInfo = hgkVar.f27685u;
        resolveInfo.getClass();
        CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(hgkVar.f27673i);
        hgk hgkVar2 = this.f27671b;
        hfx hfxVar = hgkVar2.f27678n;
        chp chpVar = hgkVar2.f27684t;
        chpVar.getClass();
        int iM10226j = hfxVar.m10226j(resolveInfo, chpVar);
        this.f27671b.f27680p.m10233d(hga.TAP_SHARE_TARGET);
        hgb hgbVar = this.f27671b.f27680p;
        String str = resolveInfo.activityInfo.packageName;
        lku.m15613H(hgbVar.f27657c);
        nxl nxlVar = hgbVar.f27658d;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nlr nlrVar = (nlr) nxlVar.f44974b;
        nlr nlrVar2 = nlr.f43575j;
        str.getClass();
        nlrVar.f43577a |= 32;
        nlrVar.f43583g = str;
        if (iM10226j == 1) {
            this.f27671b.f27680p.m10235f(1);
            if (this.f27671b.f27678n.m10222e(resolveInfo)) {
                return;
            }
            hgk hgkVar3 = this.f27671b;
            Toast.makeText(hgkVar3.f27672h, hhe.m10289a(resolveInfo, hgkVar3.f27673i, hgkVar3.f27674j), 0).show();
            return;
        }
        if (iM10226j == 3) {
            this.f27671b.f27680p.m10235f(5);
            return;
        }
        hgk hgkVar4 = this.f27671b;
        Toast.makeText(hgkVar4.f27672h, hgkVar4.f27674j.getString(C0100R.string.social_toast_activity_not_found, charSequenceLoadLabel), 0).show();
        this.f27671b.f27680p.m10235f(4);
        hgk hgkVar5 = this.f27671b;
        hgkVar5.f27679o.post(new hfr(hgkVar5, 6));
        this.f27671b.f27687w.m11348p();
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f27671b.f27685u = null;
    }

    @Override // p000.hjn
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo5713h() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo10200i() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo10201j() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: k */
    public void mo10202k() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo10203l(ResolveInfo resolveInfo) {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo10204m() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: n */
    public void mo10205n() {
        this.f27671b.m10245r(false, false);
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo10206o() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo10207p(long j) {
    }
}
