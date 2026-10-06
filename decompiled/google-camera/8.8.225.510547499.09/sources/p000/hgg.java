package p000;

import android.content.pm.ResolveInfo;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hgg implements hgd {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hgk f27668b;

    public hgg(hgk hgkVar) {
        this.f27668b = hgkVar;
    }

    /* JADX INFO: renamed from: t */
    private final void m10239t() {
        this.f27668b.f27680p.m10232c();
        this.f27668b.f27680p.m10230a();
    }

    /* JADX INFO: renamed from: u */
    private final void m10240u(long j) {
        hgk hgkVar = this.f27668b;
        hgkVar.f27679o.removeCallbacks(hgkVar.f27681q);
        hgk hgkVar2 = this.f27668b;
        hgkVar2.f27679o.postDelayed(hgkVar2.f27681q, j);
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: a */
    public void mo10196a() {
        this.f27668b.m10245r(false, true);
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: b */
    public void mo10197b(chp chpVar, boolean z) {
        m10241q(chpVar, z);
    }

    @Override // p000.hgd, p000.fbl
    /* JADX INFO: renamed from: bF */
    public final /* synthetic */ void mo3523bF() {
    }

    @Override // p000.hgd, p000.ezs
    /* JADX INFO: renamed from: bH */
    public final /* synthetic */ boolean mo3807bH() {
        return false;
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: cb */
    public final void mo10198cb() {
        m10242r();
        m10239t();
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: d */
    public void mo10199d(chp chpVar, boolean z) {
        m10241q(chpVar, z);
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f27668b.f27686v = false;
        hgk hgkVar = this.f27668b;
        chp chpVarB = hgkVar.f27677m.mo3729b();
        chpVarB.getClass();
        jvh.m13562j(hgkVar.m10244q(chpVarB), new gjd(this, 3), jvh.m13554b());
        this.f27668b.f27682r.mo7759c();
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        hgk hgkVar = this.f27668b;
        hgkVar.f27679o.removeCallbacks(hgkVar.f27681q);
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
    public void mo10201j() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo10202k() {
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
    public final /* synthetic */ void mo10205n() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo10206o() {
    }

    @Override // p000.hgd
    /* JADX INFO: renamed from: p */
    public final void mo10207p(long j) {
        m10240u(j);
        m10239t();
    }

    /* JADX INFO: renamed from: q */
    public final void m10241q(chp chpVar, boolean z) {
        hgk hgkVar = this.f27668b;
        hgkVar.f27684t = chpVar;
        hgkVar.f27680p.m10233d(hga.LAUNCH_SHARE_PANEL);
        this.f27668b.f27680p.m10235f(3);
        this.f27668b.f27680p.m10234e(true == z ? 2 : 3);
    }

    /* JADX INFO: renamed from: r */
    public final void m10242r() {
        m10240u(this.f27668b.f27674j.getInteger(C0100R.integer.social_handle_close_timeout));
    }
}
