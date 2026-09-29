package p000;

import android.content.Context;
import android.webkit.WebView;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r3b extends WebView {

    /* JADX INFO: renamed from: a */
    public final dbb f58577a;

    /* JADX INFO: renamed from: b */
    public final abb f58578b;

    /* JADX INFO: renamed from: c */
    public final bbb f58579c;

    /* JADX INFO: renamed from: d */
    public C3741x f58580d;

    /* JADX INFO: renamed from: e */
    public boolean f58581e;

    /* JADX INFO: renamed from: f */
    public final yab f58582f;

    public r3b(Context context, dbb dbbVar) {
        super(context, null, 0);
        this.f58577a = dbbVar;
        abb abbVar = new abb();
        this.f58578b = abbVar;
        this.f58579c = new bbb(this, abbVar);
        this.f58582f = new yab(this);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        bbb bbbVar = this.f58579c;
        synchronized (bbbVar.f8304c) {
            bbbVar.f8305d.clear();
        }
        bbbVar.f8303b.removeCallbacksAndMessages(null);
        super.destroy();
    }

    public vab getInstance() {
        return this.f58579c;
    }

    public Collection<AbstractC2949e2> getListeners() {
        List listM22622n1;
        bbb bbbVar = this.f58579c;
        synchronized (bbbVar.f8304c) {
            listM22622n1 = u91.m22622n1(bbbVar.f8305d);
        }
        return listM22622n1;
    }

    public final vab getYoutubePlayer$core_release() {
        return this.f58579c;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (this.f58581e && (i == 8 || i == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z) {
        this.f58581e = z;
    }
}
