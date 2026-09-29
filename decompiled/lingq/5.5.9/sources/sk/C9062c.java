package sk;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.C4931a;
import dm.C5207g;
import p304ok.InterfaceC8066b;
import p370rk.C8821a;
import p370rk.C8823c;
import p370rk.C8824d;

/* JADX INFO: renamed from: sk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9062c implements C8821a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4931a f47342a;

    public C9062c(C4931a c4931a) {
        this.f47342a = c4931a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cm.a, kotlin.jvm.internal.Lambda] */
    @Override // p370rk.C8821a.a
    /* JADX INFO: renamed from: a */
    public final void mo17084a() {
        C4931a c4931a = this.f47342a;
        if (!c4931a.f32171d) {
            c4931a.f32172e.mo807E();
            return;
        }
        InterfaceC8066b youtubePlayer$core_release = c4931a.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release();
        C8823c c8823c = c4931a.f32170c;
        c8823c.getClass();
        C5207g.m11111f(youtubePlayer$core_release, "youTubePlayer");
        String str = c8823c.f46724d;
        if (str == null) {
            return;
        }
        boolean z10 = c8823c.f46722b;
        if (z10 && c8823c.f46723c == PlayerConstants$PlayerError.HTML_5_PLAYER) {
            C8824d.m17086a(youtubePlayer$core_release, c8823c.f46721a, str, c8823c.f46725e);
        } else if (!z10 && c8823c.f46723c == PlayerConstants$PlayerError.HTML_5_PLAYER) {
            youtubePlayer$core_release.mo15931b(c8823c.f46725e, str);
        }
        c8823c.f46723c = null;
    }

    @Override // p370rk.C8821a.a
    /* JADX INFO: renamed from: b */
    public final void mo17085b() {
    }
}
