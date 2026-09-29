package p000;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.lingq.feature.library.preview.LessonPreviewFragment;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class p55 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LessonPreviewFragment f55598a;

    public p55(LessonPreviewFragment lessonPreviewFragment) {
        this.f55598a = lessonPreviewFragment;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
        C3244l c3244l = this.f55598a.m9083i0().f26771h;
        Boolean bool = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
        C3244l c3244l = this.f55598a.m9083i0().f26771h;
        Boolean bool = Boolean.TRUE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        r43.m20289a().m20290b(new Exception("Webview Lesson Preview crash " + renderProcessGoneDetail));
        ViewParent parent = webView != null ? webView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }
}
