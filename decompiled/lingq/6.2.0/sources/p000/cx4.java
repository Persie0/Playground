package p000;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class cx4 extends AbstractC2949e2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ex4 f34681b;

    public /* synthetic */ cx4(ex4 ex4Var, int i) {
        this.f34680a = i;
        this.f34681b = ex4Var;
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: d */
    public void mo8499d(vab vabVar) {
        switch (this.f34680a) {
            case 1:
                vabVar.getClass();
                ex4 ex4Var = this.f34681b;
                ex4Var.setYouTubePlayerReady$core_release(true);
                LinkedHashSet linkedHashSet = ex4Var.f38039f;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((zab) it.next()).mo13541a(vabVar);
                }
                linkedHashSet.clear();
                ((bbb) vabVar).m3595f(this);
                break;
            default:
                super.mo8499d(vabVar);
                break;
        }
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: e */
    public void mo8500e(vab vabVar, PlayerConstants$PlayerState playerConstants$PlayerState) {
        switch (this.f34680a) {
            case 0:
                vabVar.getClass();
                playerConstants$PlayerState.getClass();
                if (playerConstants$PlayerState == PlayerConstants$PlayerState.PLAYING) {
                    ex4 ex4Var = this.f34681b;
                    if (!ex4Var.f38040g && !ex4Var.f38034a.f58581e) {
                        ((bbb) vabVar).m3594e();
                        break;
                    }
                }
                break;
            default:
                super.mo8500e(vabVar, playerConstants$PlayerState);
                break;
        }
    }
}
