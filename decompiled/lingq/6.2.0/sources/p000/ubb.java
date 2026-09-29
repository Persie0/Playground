package p000;

import com.lingq.core.player.video.C1821b;
import com.lingq.core.player.video.C1822c;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/* JADX INFO: loaded from: classes3.dex */
public final class ubb implements zh2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ub5 f63680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1822c f63681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1821b f63682c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vbb f63683d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f63684e;

    public ubb(ub5 ub5Var, C1822c c1822c, C1821b c1821b, vbb vbbVar, t66 t66Var) {
        this.f63680a = ub5Var;
        this.f63681b = c1822c;
        this.f63682c = c1821b;
        this.f63683d = vbbVar;
        this.f63684e = t66Var;
    }

    @Override // p000.zh2
    /* JADX INFO: renamed from: a */
    public final void mo1799a() {
        ub5 ub5Var = this.f63680a;
        ub5Var.mo256K().mo21331x(this.f63681b);
        this.f63682c.m8496a();
        vbb vbbVar = this.f63683d;
        YouTubePlayerView youTubePlayerView = vbbVar.f65172a;
        if (youTubePlayerView != null) {
            ub5Var.mo256K().mo21331x(youTubePlayerView);
            if (vbbVar.f65173b) {
                return;
            }
            vab vabVar = (vab) this.f63684e.getValue();
            if (vabVar != null) {
                ((bbb) vabVar).m3594e();
            }
            youTubePlayerView.m9821d();
        }
    }
}
