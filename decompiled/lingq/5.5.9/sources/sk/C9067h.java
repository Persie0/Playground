package sk;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import p304ok.InterfaceC8066b;
import p370rk.C8824d;
import pk.AbstractC8400a;

/* JADX INFO: renamed from: sk.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C9067h extends AbstractC8400a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f47351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ YouTubePlayerView f47352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f47353c;

    public C9067h(String str, YouTubePlayerView youTubePlayerView, boolean z10) {
        this.f47351a = str;
        this.f47352b = youTubePlayerView;
        this.f47353c = z10;
    }

    @Override // pk.AbstractC8400a, pk.InterfaceC8403d
    /* JADX INFO: renamed from: h */
    public final void mo10114h(InterfaceC8066b interfaceC8066b) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        String str = this.f47351a;
        if (str != null) {
            C8824d.m17086a(interfaceC8066b, this.f47352b.f32165b.getCanPlay$core_release() && this.f47353c, str, 0.0f);
        }
        interfaceC8066b.mo15930a(this);
    }
}
