package p000;

import com.google.android.apps.camera.p014ui.remotecontrol.RemoteControlView;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ieu implements elw {

    /* JADX INFO: renamed from: a */
    private final RemoteControlView f30568a;

    /* JADX INFO: renamed from: b */
    private Date f30569b;

    public ieu(RemoteControlView remoteControlView) {
        this.f30568a = remoteControlView;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: a */
    public final int mo7492a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: b */
    public final ely mo7493b() {
        return ely.NOTIFICATION_CHIP;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo7494c() {
        return gmz.m9541i();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Runnable mo7495d() {
        return null;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: e */
    public final Date mo7496e() {
        return this.f30569b;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: f */
    public final void mo7497f(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: g */
    public final void mo7498g() {
        this.f30568a.setVisibility(8);
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo7499h() {
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: i */
    public final void mo7500i(Date date) {
        this.f30569b = date;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: j */
    public final void mo7501j() {
        this.f30568a.setVisibility(0);
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo7502k() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean mo7503l() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: m */
    public final boolean mo7504m() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: n */
    public final boolean mo7505n() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean mo7506o() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: p */
    public final int mo7507p() {
        return 7;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo7508q(int i, boolean z, boolean z2, ilk ilkVar, hzj hzjVar) {
    }
}
