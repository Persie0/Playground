package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.iterable.iterableapi.C1209e;

/* JADX INFO: loaded from: classes2.dex */
public final class rc4 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59065a = 0;

    /* JADX INFO: renamed from: b */
    public Object f59066b;

    public rc4(r3b r3bVar) {
        this.f59066b = r3bVar;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        switch (this.f59065a) {
            case 1:
                Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                if (defaultVideoPoster != null) {
                    return defaultVideoPoster;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                bitmapCreateBitmap.getClass();
                return bitmapCreateBitmap;
            default:
                return super.getDefaultVideoPoster();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        switch (this.f59065a) {
            case 1:
                super.onHideCustomView();
                ((r3b) this.f59066b).f58577a.m10272b();
                break;
            default:
                super.onHideCustomView();
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        switch (this.f59065a) {
            case 0:
                if (i == 100) {
                    ((C1209e) this.f59066b).m6910s0();
                }
                break;
            default:
                super.onProgressChanged(webView, i);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f59065a) {
            case 1:
                view.getClass();
                customViewCallback.getClass();
                super.onShowCustomView(view, customViewCallback);
                ((r3b) this.f59066b).f58577a.m10271a(view, new br8(customViewCallback, 19));
                break;
            default:
                super.onShowCustomView(view, customViewCallback);
                break;
        }
    }

    public /* synthetic */ rc4() {
    }
}
