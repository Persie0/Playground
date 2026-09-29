package sk;

import android.view.View;
import cm.InterfaceC2041a;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import java.util.Iterator;
import pk.InterfaceC8401b;
import sl.C9072e;

/* JADX INFO: renamed from: sk.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9066g implements InterfaceC8401b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ YouTubePlayerView f47350a;

    public C9066g(YouTubePlayerView youTubePlayerView) {
        this.f47350a = youTubePlayerView;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pk.InterfaceC8401b
    /* JADX INFO: renamed from: a */
    public final void mo16428a(View view, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(view, "fullscreenView");
        YouTubePlayerView youTubePlayerView = this.f47350a;
        if (youTubePlayerView.f32164a.isEmpty()) {
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
        Iterator it = youTubePlayerView.f32164a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8401b) it.next()).mo16428a(view, interfaceC2041a);
        }
    }

    @Override // pk.InterfaceC8401b
    /* JADX INFO: renamed from: b */
    public final void mo16429b() {
        YouTubePlayerView youTubePlayerView = this.f47350a;
        if (youTubePlayerView.f32164a.isEmpty()) {
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
        Iterator it = youTubePlayerView.f32164a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8401b) it.next()).mo16429b();
        }
    }
}
