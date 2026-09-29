package p000;

import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.playlists.C1832h;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pf7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1832h f56064b;

    public /* synthetic */ pf7(C1832h c1832h, int i) {
        this.f56063a = i;
        this.f56064b = c1832h;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f56063a;
        xfa xfaVar = xfa.f68157a;
        C1832h c1832h = this.f56064b;
        Playlist playlist = (Playlist) obj;
        switch (i) {
            case 0:
                playlist.getClass();
                C3244l c3244l = c1832h.f22302l;
                ld7 ld7Var = new ld7(playlist.f19555c, null);
                c3244l.getClass();
                c3244l.m15572j(null, ld7Var);
                break;
            default:
                playlist.getClass();
                C3244l c3244l2 = c1832h.f22302l;
                ld7 ld7Var2 = new ld7(playlist.f19555c, null);
                c3244l2.getClass();
                c3244l2.m15572j(null, ld7Var2);
                break;
        }
        return xfaVar;
    }
}
