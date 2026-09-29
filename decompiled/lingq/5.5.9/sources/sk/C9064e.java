package sk;

import android.content.Context;
import android.webkit.WebView;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import kotlin.collections.C6752c;
import p304ok.C8069e;
import p304ok.InterfaceC8066b;
import pk.AbstractC8400a;
import pk.InterfaceC8401b;
import pk.InterfaceC8403d;
import sl.C9072e;

/* JADX INFO: renamed from: sk.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9064e extends WebView implements C8069e.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8401b f47343a;

    /* JADX INFO: renamed from: b */
    public final C9065f f47344b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2052l<? super InterfaceC8066b, C9072e> f47345c;

    /* JADX INFO: renamed from: d */
    public boolean f47346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9064e(Context context, C9066g c9066g) {
        super(context, null, 0);
        C5207g.m11111f(context, "context");
        this.f47343a = c9066g;
        this.f47344b = new C9065f(this);
    }

    @Override // p304ok.C8069e.a
    /* JADX INFO: renamed from: a */
    public final void mo15936a() {
        InterfaceC2052l<? super InterfaceC8066b, C9072e> interfaceC2052l = this.f47345c;
        if (interfaceC2052l != null) {
            interfaceC2052l.mo528n(this.f47344b);
        } else {
            C5207g.m11117l("youTubePlayerInitListener");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17276b(AbstractC8400a abstractC8400a) {
        return this.f47344b.f47349c.add(abstractC8400a);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        C9065f c9065f = this.f47344b;
        c9065f.f47349c.clear();
        c9065f.f47348b.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @Override // p304ok.C8069e.a
    public InterfaceC8066b getInstance() {
        return this.f47344b;
    }

    @Override // p304ok.C8069e.a
    public Collection<InterfaceC8403d> getListeners() {
        return C6752c.m13457y0(this.f47344b.f47349c);
    }

    public final InterfaceC8066b getYoutubePlayer$core_release() {
        return this.f47344b;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        if (!this.f47346d || (i10 != 8 && i10 != 4)) {
            super.onWindowVisibilityChanged(i10);
        }
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z10) {
        this.f47346d = z10;
    }
}
