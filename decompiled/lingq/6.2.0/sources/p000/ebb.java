package p000;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/* JADX INFO: loaded from: classes3.dex */
public final class ebb extends AbstractC2949e2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f36984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ YouTubePlayerView f36985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f36986c;

    public ebb(String str, YouTubePlayerView youTubePlayerView, boolean z) {
        this.f36984a = str;
        this.f36985b = youTubePlayerView;
        this.f36986c = z;
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: d */
    public final void mo8499d(vab vabVar) {
        vabVar.getClass();
        String str = this.f36984a;
        if (str != null) {
            if (this.f36985b.f34326b.getCanPlay$core_release() && this.f36986c) {
                ((bbb) vabVar).m3593d(str, 0.0f);
            } else {
                ((bbb) vabVar).m3591b(str, 0.0f);
            }
        }
        ((bbb) vabVar).m3595f(this);
    }
}
