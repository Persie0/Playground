package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class ex4 extends u89 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f38033h = 0;

    /* JADX INFO: renamed from: a */
    public final r3b f38034a;

    /* JADX INFO: renamed from: b */
    public final gv5 f38035b;

    /* JADX INFO: renamed from: c */
    public final p97 f38036c;

    /* JADX INFO: renamed from: d */
    public boolean f38037d;

    /* JADX INFO: renamed from: e */
    public ui3 f38038e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f38039f;

    /* JADX INFO: renamed from: g */
    public boolean f38040g;

    public ex4(Context context, dbb dbbVar) {
        super(context, null, 0);
        r3b r3bVar = new r3b(context, dbbVar);
        this.f38034a = r3bVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        gv5 gv5Var = new gv5(applicationContext, 27);
        this.f38035b = gv5Var;
        p97 p97Var = new p97();
        this.f38036c = p97Var;
        this.f38038e = new wf1(18);
        this.f38039f = new LinkedHashSet();
        this.f38040g = true;
        addView(r3bVar, new FrameLayout.LayoutParams(-1, -1));
        bbb bbbVar = r3bVar.f58579c;
        bbbVar.m3590a(p97Var);
        bbbVar.m3590a(new cx4(this, 0));
        bbbVar.m3590a(new cx4(this, 1));
        ((ArrayList) gv5Var.f41394d).add(new dx4(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m11385a(AbstractC2949e2 abstractC2949e2, boolean z, vj6 vj6Var, String str) throws JSONException, IOException {
        if (this.f38037d) {
            C3386nv.m17633t("This YouTubePlayerView has already been initialized.");
            return;
        }
        if (z) {
            gv5 gv5Var = this.f38035b;
            Context context = (Context) gv5Var.f41392b;
            ek6 ek6Var = new ek6(gv5Var);
            gv5Var.f41393c = ek6Var;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(ek6Var);
        }
        g91 g91Var = new g91(this, vj6Var, str, abstractC2949e2, 8);
        this.f38038e = g91Var;
        if (z) {
            return;
        }
        g91Var.mo0a();
    }

    public final boolean getCanPlay$core_release() {
        return this.f38040g;
    }

    public final r3b getWebViewYouTubePlayer$core_release() {
        return this.f38034a;
    }

    public final void setCustomPlayerUi(View view) {
        view.getClass();
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z) {
        this.f38037d = z;
    }
}
