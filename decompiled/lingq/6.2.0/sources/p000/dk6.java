package p000;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dk6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gv5 f35745b;

    public /* synthetic */ dk6(gv5 gv5Var, int i) {
        this.f35744a = i;
        this.f35745b = gv5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35744a;
        gv5 gv5Var = this.f35745b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) gv5Var.f41394d).iterator();
                while (it.hasNext()) {
                    ex4 ex4Var = ((dx4) it.next()).f36367a;
                    if (ex4Var.f38037d) {
                        p97 p97Var = ex4Var.f38036c;
                        vab youtubePlayer$core_release = ex4Var.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release();
                        p97Var.getClass();
                        youtubePlayer$core_release.getClass();
                        String str = p97Var.f55808d;
                        if (str != null) {
                            boolean z = p97Var.f55806b;
                            if (z && p97Var.f55807c == PlayerConstants$PlayerError.HTML_5_PLAYER) {
                                boolean z2 = p97Var.f55805a;
                                float f = p97Var.f55809e;
                                if (z2) {
                                    ((bbb) youtubePlayer$core_release).m3593d(str, f);
                                } else {
                                    ((bbb) youtubePlayer$core_release).m3591b(str, f);
                                }
                            } else if (!z && p97Var.f55807c == PlayerConstants$PlayerError.HTML_5_PLAYER) {
                                ((bbb) youtubePlayer$core_release).m3591b(str, p97Var.f55809e);
                            }
                            p97Var.f55807c = null;
                        }
                    } else {
                        ex4Var.f38038e.mo0a();
                    }
                }
                break;
            default:
                Iterator it2 = ((ArrayList) gv5Var.f41394d).iterator();
                while (it2.hasNext()) {
                    ((dx4) it2.next()).getClass();
                }
                break;
        }
    }
}
