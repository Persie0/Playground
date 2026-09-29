package p000;

import com.lingq.core.domain.model.playlist.Playlist;

/* JADX INFO: loaded from: classes2.dex */
public final class kf7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f47147b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f47148c;

    public /* synthetic */ kf7(vi3 vi3Var, Playlist playlist, int i) {
        this.f47146a = i;
        this.f47147b = vi3Var;
        this.f47148c = playlist;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f47146a;
        xfa xfaVar = xfa.f68157a;
        Playlist playlist = this.f47148c;
        vi3 vi3Var = this.f47147b;
        switch (i) {
            case 0:
                vi3Var.invoke(playlist);
                break;
            case 1:
                vi3Var.invoke(playlist);
                break;
            default:
                vi3Var.invoke(playlist);
                break;
        }
        return xfaVar;
    }
}
