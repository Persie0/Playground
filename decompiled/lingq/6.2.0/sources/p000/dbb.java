package p000;

import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dbb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ YouTubePlayerView f35365a;

    public dbb(YouTubePlayerView youTubePlayerView) {
        this.f35365a = youTubePlayerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m10271a(View view, br8 br8Var) {
        ArrayList arrayList = this.f35365a.f34325a;
        if (arrayList.isEmpty()) {
            C3386nv.m17633t("To enter fullscreen you need to first register a FullscreenListener.");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dbb) it.next()).m10271a(view, br8Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10272b() {
        ArrayList arrayList = this.f35365a.f34325a;
        if (arrayList.isEmpty()) {
            C3386nv.m17633t("To enter fullscreen you need to first register a FullscreenListener.");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dbb) it.next()).m10272b();
        }
    }
}
