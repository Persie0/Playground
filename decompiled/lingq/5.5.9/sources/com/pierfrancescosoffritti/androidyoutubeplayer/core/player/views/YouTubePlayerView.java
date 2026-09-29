package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.p228io.C6763a;
import mo.C7661i;
import p280nk.C7799a;
import p304ok.C8069e;
import p304ok.InterfaceC8066b;
import p345qk.C8641a;
import p370rk.C8821a;
import p370rk.C8822b;
import pk.InterfaceC8402c;
import pk.InterfaceC8403d;
import sk.C9063d;
import sk.C9064e;
import sk.C9066g;
import sk.C9067h;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, m13365d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView;", "Lsk/d;", "Landroidx/lifecycle/o;", "Landroid/view/View;", "view", "Lsl/e;", "setCustomPlayerUi", "", "c", "Z", "getEnableAutomaticInitialization", "()Z", "setEnableAutomaticInitialization", "(Z)V", "enableAutomaticInitialization", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class YouTubePlayerView extends C9063d implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final ArrayList f32164a;

    /* JADX INFO: renamed from: b */
    public final C4931a f32165b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean enableAutomaticInitialization;

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView$a */
    public /* synthetic */ class C4930a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32167a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f32167a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        this.f32164a = new ArrayList();
        final C4931a c4931a = new C4931a(context, new C9066g(this));
        this.f32165b = c4931a;
        addView(c4931a, new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7799a.f42877a, 0, 0);
        C5207g.m11110e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.enableAutomaticInitialization = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        String string = typedArrayObtainStyledAttributes.getString(3);
        typedArrayObtainStyledAttributes.recycle();
        if (z10 && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        final C9067h c9067h = new C9067h(string, this, z10);
        if (this.enableAutomaticInitialization) {
            final C8641a c8641a = C8641a.f46190b;
            C5207g.m11111f(c8641a, "playerOptions");
            if (c4931a.f32171d) {
                throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
            }
            if (z11) {
                C8821a c8821a = c4931a.f32169b;
                c8821a.getClass();
                C8822b c8822b = new C8822b(c8821a);
                c8821a.f46717c = c8822b;
                Object systemService = c8821a.f46715a.getSystemService("connectivity");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).registerDefaultNetworkCallback(c8822b);
            }
            ?? r10 = new InterfaceC2041a<C9072e>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    final C9064e webViewYouTubePlayer$core_release = c4931a.getWebViewYouTubePlayer$core_release();
                    final InterfaceC8403d interfaceC8403d = c9067h;
                    InterfaceC2052l<InterfaceC8066b, C9072e> interfaceC2052l = new InterfaceC2052l<InterfaceC8066b, C9072e>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$2.1
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC8066b interfaceC8066b) {
                            InterfaceC8066b interfaceC8066b2 = interfaceC8066b;
                            C5207g.m11111f(interfaceC8066b2, "it");
                            interfaceC8066b2.mo15934e(interfaceC8403d);
                            return C9072e.f47360a;
                        }
                    };
                    webViewYouTubePlayer$core_release.getClass();
                    webViewYouTubePlayer$core_release.f47345c = interfaceC2052l;
                    C8641a c8641a2 = c8641a;
                    if (c8641a2 == null) {
                        c8641a2 = C8641a.f46190b;
                    }
                    WebSettings settings = webViewYouTubePlayer$core_release.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setMediaPlaybackRequiresUserGesture(false);
                    settings.setCacheMode(-1);
                    webViewYouTubePlayer$core_release.addJavascriptInterface(new C8069e(webViewYouTubePlayer$core_release), "YouTubePlayerBridge");
                    InputStream inputStreamOpenRawResource = webViewYouTubePlayer$core_release.getResources().openRawResource(R.raw.ayp_youtube_player);
                    C5207g.m11110e(inputStreamOpenRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
                    try {
                        try {
                            String strM13430X = C6752c.m13430X(C6763a.m13476a(new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "utf-8"))), "\n", null, null, null, 62);
                            C5206f.m11032z0(inputStreamOpenRawResource, null);
                            String strM15254T2 = C7661i.m15254T2(strM13430X, "<<injectedPlayerVars>>", c8641a2.toString());
                            String string2 = c8641a2.f46191a.getString("origin");
                            C5207g.m11110e(string2, "playerOptions.getString(Builder.ORIGIN)");
                            webViewYouTubePlayer$core_release.loadDataWithBaseURL(string2, strM15254T2, "text/html", "utf-8", null);
                            webViewYouTubePlayer$core_release.setWebChromeClient(new WebChromeClient() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$initWebView$2
                                @Override // android.webkit.WebChromeClient
                                public final Bitmap getDefaultVideoPoster() {
                                    Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                                    return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
                                }

                                @Override // android.webkit.WebChromeClient
                                public final void onHideCustomView() {
                                    super.onHideCustomView();
                                    webViewYouTubePlayer$core_release.f47343a.mo16429b();
                                }

                                @Override // android.webkit.WebChromeClient
                                public final void onShowCustomView(View view, final WebChromeClient.CustomViewCallback customViewCallback) {
                                    C5207g.m11111f(view, "view");
                                    C5207g.m11111f(customViewCallback, "callback");
                                    super.onShowCustomView(view, customViewCallback);
                                    webViewYouTubePlayer$core_release.f47343a.mo16428a(view, new InterfaceC2041a<C9072e>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$initWebView$2$onShowCustomView$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // cm.InterfaceC2041a
                                        /* JADX INFO: renamed from: E */
                                        public final C9072e mo807E() {
                                            customViewCallback.onCustomViewHidden();
                                            return C9072e.f47360a;
                                        }
                                    });
                                }
                            });
                            return C9072e.f47360a;
                        } catch (Exception unused) {
                            throw new RuntimeException("Can't parse HTML file.");
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C5206f.m11032z0(inputStreamOpenRawResource, th2);
                            throw th3;
                        }
                    }
                }
            };
            c4931a.f32172e = r10;
            if (z11) {
                return;
            }
            r10.mo807E();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10491a(InterfaceC8402c interfaceC8402c) {
        C4931a c4931a = this.f32165b;
        c4931a.getClass();
        if (c4931a.f32171d) {
            interfaceC8402c.mo5247a(c4931a.f32168a.getYoutubePlayer$core_release());
        } else {
            c4931a.f32173f.add(interfaceC8402c);
        }
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        int i10 = C4930a.f32167a[event.ordinal()];
        C4931a c4931a = this.f32165b;
        if (i10 == 1) {
            c4931a.f32170c.f46721a = true;
            c4931a.f32174g = true;
            return;
        }
        if (i10 == 2) {
            c4931a.f32168a.getYoutubePlayer$core_release().pause();
            c4931a.f32170c.f46721a = false;
            c4931a.f32174g = false;
        } else {
            if (i10 != 3) {
                return;
            }
            C8821a c8821a = c4931a.f32169b;
            C8822b c8822b = c8821a.f46717c;
            if (c8822b != null) {
                Object systemService = c8821a.f46715a.getSystemService("connectivity");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).unregisterNetworkCallback(c8822b);
                c8821a.f46716b.clear();
                c8821a.f46717c = null;
            }
            C9064e c9064e = c4931a.f32168a;
            c4931a.removeView(c9064e);
            c9064e.removeAllViews();
            c9064e.destroy();
        }
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.enableAutomaticInitialization;
    }

    public final void setCustomPlayerUi(View view) {
        C5207g.m11111f(view, "view");
        this.f32165b.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z10) {
        this.enableAutomaticInitialization = z10;
    }
}
