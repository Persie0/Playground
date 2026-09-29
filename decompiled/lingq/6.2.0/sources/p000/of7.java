package p000;

import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.playlists.C1832h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class of7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54278a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oe7 f54279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1832h f54280c;

    public /* synthetic */ of7(oe7 oe7Var, C1832h c1832h) {
        this.f54279b = oe7Var;
        this.f54280c = c1832h;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f54278a;
        xfa xfaVar = xfa.f68157a;
        C1832h c1832h = this.f54280c;
        oe7 oe7Var = this.f54279b;
        Playlist playlist = (Playlist) obj;
        playlist.getClass();
        switch (i) {
            case 0:
                c1832h.f22298h.mo344f2(playlist);
                oe7Var.getClass();
                oe7Var.f54249b.m9243e3(playlist);
                break;
            default:
                oe7Var.f54248a.setValue(Boolean.FALSE);
                c1832h.f22298h.mo344f2(playlist);
                oe7Var.f54249b.m9243e3(playlist);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ of7(C1832h c1832h, oe7 oe7Var) {
        this.f54280c = c1832h;
        this.f54279b = oe7Var;
    }
}
