package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle$Event;
import com.pierfrancescosoffritti.androidyoutubeplayer.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import p000.C3386nv;
import p000.bbb;
import p000.cbb;
import p000.dbb;
import p000.ebb;
import p000.ek6;
import p000.ex4;
import p000.gm5;
import p000.gv5;
import p000.qx3;
import p000.r3b;
import p000.rb5;
import p000.u89;
import p000.ub5;
import p000.vj6;
import p000.y52;
import p000.zab;

/* JADX INFO: loaded from: classes3.dex */
public final class YouTubePlayerView extends u89 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34325a;

    /* JADX INFO: renamed from: b */
    public final ex4 f34326b;

    /* JADX INFO: renamed from: c */
    public boolean f34327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) throws JSONException, IOException {
        super(context, attributeSet, i);
        context.getClass();
        this.f34325a = new ArrayList();
        ex4 ex4Var = new ex4(context, new dbb(this));
        this.f34326b = ex4Var;
        addView(ex4Var, new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.YouTubePlayerView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.f34327c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.YouTubePlayerView_enableAutomaticInitialization, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.YouTubePlayerView_autoPlay, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.YouTubePlayerView_handleNetworkEvents, true);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.YouTubePlayerView_videoId);
        typedArrayObtainStyledAttributes.recycle();
        if (z && string == null) {
            C3386nv.m17633t("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
            throw null;
        }
        ebb ebbVar = new ebb(string, this, z);
        if (this.f34327c) {
            qx3 qx3Var = new qx3(context);
            qx3Var.m20192a(1, "controls");
            ex4Var.m11385a(ebbVar, z2, new vj6(qx3Var.f58334a, 20), string);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9820a(zab zabVar) {
        ex4 ex4Var = this.f34326b;
        ex4Var.getClass();
        if (ex4Var.f38037d) {
            zabVar.mo13541a(ex4Var.f38034a.getYoutubePlayer$core_release());
        } else {
            ex4Var.f38039f.add(zabVar);
        }
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        int i = cbb.f9858a[lifecycle$Event.ordinal()];
        ex4 ex4Var = this.f34326b;
        switch (i) {
            case 1:
                ex4Var.f38036c.f55805a = true;
                ex4Var.f38040g = true;
                break;
            case 2:
                ((bbb) ex4Var.f38034a.getYoutubePlayer$core_release()).m3594e();
                ex4Var.f38036c.f55805a = false;
                ex4Var.f38040g = false;
                break;
            case 3:
                m9821d();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                gm5.m12750e();
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9821d() {
        ex4 ex4Var = this.f34326b;
        r3b r3bVar = ex4Var.f38034a;
        gv5 gv5Var = ex4Var.f38035b;
        ek6 ek6Var = (ek6) gv5Var.f41393c;
        if (ek6Var != null) {
            Object systemService = ((Context) gv5Var.f41392b).getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).unregisterNetworkCallback(ek6Var);
            ((ArrayList) gv5Var.f41394d).clear();
            gv5Var.f41393c = null;
        }
        ex4Var.removeView(r3bVar);
        r3bVar.removeAllViews();
        r3bVar.destroy();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.f34327c;
    }

    public final void setCustomPlayerUi(View view) {
        view.getClass();
        this.f34326b.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.f34327c = z;
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
