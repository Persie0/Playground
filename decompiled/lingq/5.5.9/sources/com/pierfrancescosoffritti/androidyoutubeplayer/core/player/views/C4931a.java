package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Lambda;
import p370rk.C8821a;
import p370rk.C8823c;
import sk.C9060a;
import sk.C9061b;
import sk.C9062c;
import sk.C9063d;
import sk.C9064e;
import sk.C9066g;
import sl.C9072e;

/* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4931a extends C9063d {

    /* JADX INFO: renamed from: a */
    public final C9064e f32168a;

    /* JADX INFO: renamed from: b */
    public final C8821a f32169b;

    /* JADX INFO: renamed from: c */
    public final C8823c f32170c;

    /* JADX INFO: renamed from: d */
    public boolean f32171d;

    /* JADX INFO: renamed from: e */
    public Lambda f32172e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f32173f;

    /* JADX INFO: renamed from: g */
    public boolean f32174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4931a(Context context, C9066g c9066g) {
        super(context, null, 0);
        C5207g.m11111f(context, "context");
        C9064e c9064e = new C9064e(context, c9066g);
        this.f32168a = c9064e;
        Context applicationContext = context.getApplicationContext();
        C5207g.m11110e(applicationContext, "context.applicationContext");
        C8821a c8821a = new C8821a(applicationContext);
        this.f32169b = c8821a;
        C8823c c8823c = new C8823c();
        this.f32170c = c8823c;
        this.f32172e = new InterfaceC2041a<C9072e>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                return C9072e.f47360a;
            }
        };
        this.f32173f = new LinkedHashSet();
        this.f32174g = true;
        addView(c9064e, new FrameLayout.LayoutParams(-1, -1));
        c9064e.m17276b(c8823c);
        c9064e.m17276b(new C9060a(this));
        c9064e.m17276b(new C9061b(this));
        c8821a.f46716b.add(new C9062c(this));
    }

    public final boolean getCanPlay$core_release() {
        return this.f32174g;
    }

    public final C9064e getWebViewYouTubePlayer$core_release() {
        return this.f32168a;
    }

    public final void setCustomPlayerUi(View view) {
        C5207g.m11111f(view, "view");
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z10) {
        this.f32171d = z10;
    }
}
