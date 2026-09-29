package sk;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.C4931a;
import dm.C5207g;
import p304ok.InterfaceC8066b;
import pk.AbstractC8400a;

/* JADX INFO: renamed from: sk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9060a extends AbstractC8400a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4931a f47340a;

    public C9060a(C4931a c4931a) {
        this.f47340a = c4931a;
    }

    @Override // pk.AbstractC8400a, pk.InterfaceC8403d
    /* JADX INFO: renamed from: i */
    public final void mo9990i(InterfaceC8066b interfaceC8066b, PlayerConstants$PlayerState playerConstants$PlayerState) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        if (playerConstants$PlayerState == PlayerConstants$PlayerState.PLAYING) {
            C4931a c4931a = this.f47340a;
            if (c4931a.f32174g || c4931a.f32168a.f47346d) {
                return;
            }
            interfaceC8066b.pause();
        }
    }
}
