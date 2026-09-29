package p067d8;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0979t;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.login.LoginTargetApp;
import com.kochava.tracker.BuildConfig;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.text.C7076b;
import mo.C7661i;
import org.json.JSONArray;
import org.json.JSONObject;
import p173i8.C6205a;
import p291o7.AsyncTaskC8008r;
import p291o7.C8004n;
import p291o7.C8010t;
import p334q8.C8504a;
import tl.C9322j;

/* JADX INFO: renamed from: d8.e0 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC5064e0 extends Dialog {

    /* JADX INFO: renamed from: H */
    public static volatile int f32919H;

    /* JADX INFO: renamed from: a */
    public String f32920a;

    /* JADX INFO: renamed from: b */
    public String f32921b;

    /* JADX INFO: renamed from: c */
    public c f32922c;

    /* JADX INFO: renamed from: d */
    public f f32923d;

    /* JADX INFO: renamed from: e */
    public ProgressDialog f32924e;

    /* JADX INFO: renamed from: f */
    public ImageView f32925f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f32926g;

    /* JADX INFO: renamed from: h */
    public final d f32927h;

    /* JADX INFO: renamed from: i */
    public boolean f32928i;

    /* JADX INFO: renamed from: j */
    public boolean f32929j;

    /* JADX INFO: renamed from: k */
    public boolean f32930k;

    /* JADX INFO: renamed from: l */
    public WindowManager.LayoutParams f32931l;

    /* JADX INFO: renamed from: d8.e0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Context f32932a;

        /* JADX INFO: renamed from: b */
        public final String f32933b;

        /* JADX INFO: renamed from: c */
        public c f32934c;

        /* JADX INFO: renamed from: d */
        public Bundle f32935d;

        public a(ActivityC0979t activityC0979t, String str, Bundle bundle) {
            str = str == null ? C5086z.m10832q(activityC0979t) : str;
            C5056a0.m10746d(str, "applicationId");
            this.f32933b = str;
            this.f32932a = activityC0979t;
            this.f32935d = bundle;
        }
    }

    /* JADX INFO: renamed from: d8.e0$b */
    public final class b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogC5064e0 f32936a;

        public b(DialogC5064e0 dialogC5064e0) {
            C5207g.m11111f(dialogC5064e0, "this$0");
            this.f32936a = dialogC5064e0;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            C5207g.m11111f(webView, "view");
            C5207g.m11111f(str, "url");
            super.onPageFinished(webView, str);
            DialogC5064e0 dialogC5064e0 = this.f32936a;
            if (!dialogC5064e0.f32929j && (progressDialog = dialogC5064e0.f32924e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = dialogC5064e0.f32926g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            f fVar = dialogC5064e0.f32923d;
            if (fVar != null) {
                fVar.setVisibility(0);
            }
            ImageView imageView = dialogC5064e0.f32925f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            dialogC5064e0.f32930k = true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            C5207g.m11111f(webView, "view");
            C5207g.m11111f(str, "url");
            C5086z c5086z = C5086z.f33015a;
            C5086z.m10807F("FacebookSDK.WebDialog", C5207g.m11116k(str, "Webview loading URL: "));
            super.onPageStarted(webView, str, bitmap);
            DialogC5064e0 dialogC5064e0 = this.f32936a;
            if (dialogC5064e0.f32929j || (progressDialog = dialogC5064e0.f32924e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            C5207g.m11111f(webView, "view");
            C5207g.m11111f(str, "description");
            C5207g.m11111f(str2, "failingUrl");
            super.onReceivedError(webView, i10, str, str2);
            this.f32936a.m10758d(new FacebookDialogException(str, i10, str2));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C5207g.m11111f(webView, "view");
            C5207g.m11111f(sslErrorHandler, "handler");
            C5207g.m11111f(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.f32936a.m10758d(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i10;
            C5207g.m11111f(webView, "view");
            C5207g.m11111f(str, "url");
            C5086z c5086z = C5086z.f33015a;
            C5086z.m10807F("FacebookSDK.WebDialog", C5207g.m11116k(str, "Redirect URL: "));
            Uri uri = Uri.parse(str);
            boolean z10 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            DialogC5064e0 dialogC5064e0 = this.f32936a;
            if (!C7661i.m15256V2(str, dialogC5064e0.f32921b, false)) {
                if (C7661i.m15256V2(str, "fbconnect://cancel", false)) {
                    dialogC5064e0.cancel();
                    return true;
                }
                if (!z10 && !C7076b.m14278X2(str, "touch", false)) {
                    try {
                        dialogC5064e0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        return false;
                    }
                }
                return false;
            }
            Bundle bundleMo10756b = dialogC5064e0.mo10756b(str);
            String string = bundleMo10756b.getString("error");
            if (string == null) {
                string = bundleMo10756b.getString("error_type");
            }
            String string2 = bundleMo10756b.getString("error_msg");
            if (string2 == null) {
                string2 = bundleMo10756b.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleMo10756b.getString("error_description");
            }
            String string3 = bundleMo10756b.getString("error_code");
            if (string3 == null || C5086z.m10802A(string3)) {
                i10 = -1;
            } else {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
            }
            if (C5086z.m10802A(string) && C5086z.m10802A(string2) && i10 == -1) {
                c cVar = dialogC5064e0.f32922c;
                if (cVar != null && !dialogC5064e0.f32928i) {
                    dialogC5064e0.f32928i = true;
                    cVar.mo6730a(bundleMo10756b, null);
                    dialogC5064e0.dismiss();
                }
            } else if ((string == null || !(C5207g.m11106a(string, "access_denied") || C5207g.m11106a(string, "OAuthAccessDeniedException"))) && i10 != 4201) {
                dialogC5064e0.m10758d(new FacebookServiceException(new FacebookRequestError(string, i10, string2), string2));
            } else {
                dialogC5064e0.cancel();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: d8.e0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo6730a(Bundle bundle, FacebookException facebookException);
    }

    /* JADX INFO: renamed from: d8.e0$d */
    public final class d extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a */
        public final String f32937a;

        /* JADX INFO: renamed from: b */
        public final Bundle f32938b;

        /* JADX INFO: renamed from: c */
        public Exception[] f32939c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DialogC5064e0 f32940d;

        public d(DialogC5064e0 dialogC5064e0, String str, Bundle bundle) {
            C5207g.m11111f(dialogC5064e0, "this$0");
            C5207g.m11111f(str, "action");
            this.f32940d = dialogC5064e0;
            this.f32937a = str;
            this.f32938b = bundle;
            this.f32939c = new Exception[0];
        }

        /* JADX WARN: Type inference failed for: r10v1, types: [d8.f0] */
        /* JADX INFO: renamed from: a */
        public final String[] m10760a(Void... voidArr) {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                C5207g.m11111f(voidArr, "p0");
                String[] stringArray = this.f32938b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f32939c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                Date date = AccessToken.f11370l;
                AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((AsyncTaskC8008r) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i10]);
                            if (C5086z.m10803B(uri)) {
                                strArr[i10] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                ?? r10 = new GraphRequest.InterfaceC2278b() { // from class: d8.f0
                                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                    @Override // com.facebook.GraphRequest.InterfaceC2278b
                                    /* JADX INFO: renamed from: a */
                                    public final void mo6614a(C8010t c8010t) {
                                        int i12 = i10;
                                        String[] strArr2 = strArr;
                                        C5207g.m11111f(strArr2, "$results");
                                        DialogC5064e0.d dVar = this;
                                        C5207g.m11111f(dVar, "this$0");
                                        CountDownLatch countDownLatch2 = countDownLatch;
                                        C5207g.m11111f(countDownLatch2, "$latch");
                                        try {
                                            FacebookRequestError facebookRequestError = c8010t.f43588c;
                                            String str = "Error staging photo.";
                                            if (facebookRequestError != null) {
                                                String strM6602a = facebookRequestError.m6602a();
                                                if (strM6602a != null) {
                                                    str = strM6602a;
                                                }
                                                throw new FacebookGraphResponseException(c8010t, str);
                                            }
                                            JSONObject jSONObject = c8010t.f43587b;
                                            if (jSONObject == null) {
                                                throw new FacebookException(str);
                                            }
                                            String strOptString = jSONObject.optString("uri");
                                            if (strOptString == null) {
                                                throw new FacebookException(str);
                                            }
                                            strArr2[i12] = strOptString;
                                            countDownLatch2.countDown();
                                        } catch (Exception e10) {
                                            dVar.f32939c[i12] = e10;
                                        }
                                    }
                                };
                                C5207g.m11110e(uri, "uri");
                                concurrentLinkedQueue.add(C8504a.m16609a(accessTokenM6595b, uri, r10).m6607d());
                            }
                            if (i11 <= length) {
                                i10 = i11;
                            }
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTaskC8008r) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m10761b(String[] strArr) {
            Bundle bundle = this.f32938b;
            DialogC5064e0 dialogC5064e0 = this.f32940d;
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = dialogC5064e0.f32924e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f32939c;
                int length = excArr.length;
                int i10 = 0;
                while (i10 < length) {
                    Exception exc = excArr[i10];
                    i10++;
                    if (exc != null) {
                        dialogC5064e0.m10758d(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    dialogC5064e0.m10758d(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List listM17670X = C9322j.m17670X(strArr);
                if (listM17670X.contains(null)) {
                    dialogC5064e0.m10758d(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10810I(bundle, new JSONArray((Collection) listM17670X));
                dialogC5064e0.f32920a = C5086z.m10817b(C5083w.m10800a(), C8004n.m15874d() + "/dialog/" + this.f32937a, bundle).toString();
                ImageView imageView = dialogC5064e0.f32925f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                dialogC5064e0.m10759e((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                return m10760a(voidArr);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                m10761b(strArr);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        }
    }

    /* JADX INFO: renamed from: d8.e0$e */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32941a;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            f32941a = iArr;
        }
    }

    /* JADX INFO: renamed from: d8.e0$f */
    public static final class f extends WebView {
        public f(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC5064e0(Context context, String str, Bundle bundle, LoginTargetApp loginTargetApp, c cVar) {
        Uri uriM10817b;
        super(context, f32919H);
        C5056a0.m10747e();
        this.f32921b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = C5086z.m10839x(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f32921b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C8004n.m15872b());
        String str3 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"16.0.1"}, 1));
        C5207g.m11110e(str3, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", str3);
        this.f32922c = cVar;
        if (C5207g.m11106a(str, "share") && bundle.containsKey("media")) {
            this.f32927h = new d(this, str, bundle);
            return;
        }
        if (e.f32941a[loginTargetApp.ordinal()] == 1) {
            uriM10817b = C5086z.m10817b(C5083w.m10801b(), "oauth/authorize", bundle);
        } else {
            uriM10817b = C5086z.m10817b(C5083w.m10800a(), C8004n.m15874d() + "/dialog/" + ((Object) str), bundle);
        }
        this.f32920a = uriM10817b.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC5064e0(ActivityC0979t activityC0979t, String str) {
        C5056a0.m10747e();
        int i10 = f32919H;
        if (i10 == 0) {
            C5056a0.m10747e();
            i10 = f32919H;
        }
        super(activityC0979t, i10);
        this.f32921b = "fbconnect://success";
        this.f32920a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final void m10755a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            if ((applicationInfo == null ? null : applicationInfo.metaData) != null && f32919H == 0) {
                int i10 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i10 == 0) {
                    i10 = R.style.com_facebook_activity_theme;
                }
                f32919H = i10;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public Bundle mo10756b(String str) {
        Uri uri = Uri.parse(str);
        C5086z c5086z = C5086z.f33015a;
        Bundle bundleM10809H = C5086z.m10809H(uri.getQuery());
        bundleM10809H.putAll(C5086z.m10809H(uri.getFragment()));
        return bundleM10809H;
    }

    /* JADX INFO: renamed from: c */
    public final void m10757c() {
        double d10;
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i13 = (int) (i12 / displayMetrics.density);
        double d11 = 1.0d;
        if (i13 <= 480) {
            d10 = 1.0d;
        } else {
            d10 = i13 >= 800 ? 0.5d : ((((double) (800 - i13)) / ((double) 320)) * 0.5d) + 0.5d;
        }
        int iMin = Math.min((int) (((double) i12) * d10), i10);
        int i14 = (int) (i11 / displayMetrics.density);
        if (i14 > 800) {
            d11 = i14 >= 1280 ? 0.5d : ((((double) (1280 - i14)) / ((double) 480)) * 0.5d) + 0.5d;
        }
        int iMin2 = Math.min((int) (((double) i11) * d11), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(iMin, iMin2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f32922c == null || this.f32928i) {
            return;
        }
        m10758d(new FacebookOperationCanceledException());
    }

    /* JADX INFO: renamed from: d */
    public final void m10758d(Exception exc) {
        if (this.f32922c == null || this.f32928i) {
            return;
        }
        this.f32928i = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        c cVar = this.f32922c;
        if (cVar != null) {
            cVar.mo6730a(null, facebookException);
        }
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        f fVar = this.f32923d;
        if (fVar != null) {
            fVar.stopLoading();
        }
        if (!this.f32929j && (progressDialog = this.f32924e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: e */
    public final void m10759e(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        f fVar = new f(getContext());
        this.f32923d = fVar;
        fVar.setVerticalScrollBarEnabled(false);
        f fVar2 = this.f32923d;
        if (fVar2 != null) {
            fVar2.setHorizontalScrollBarEnabled(false);
        }
        f fVar3 = this.f32923d;
        if (fVar3 != null) {
            fVar3.setWebViewClient(new b(this));
        }
        f fVar4 = this.f32923d;
        WebSettings settings = null;
        WebSettings settings2 = fVar4 == null ? null : fVar4.getSettings();
        if (settings2 != null) {
            settings2.setJavaScriptEnabled(true);
        }
        f fVar5 = this.f32923d;
        if (fVar5 != null) {
            String str = this.f32920a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            fVar5.loadUrl(str);
        }
        f fVar6 = this.f32923d;
        if (fVar6 != null) {
            fVar6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        f fVar7 = this.f32923d;
        if (fVar7 != null) {
            fVar7.setVisibility(4);
        }
        f fVar8 = this.f32923d;
        WebSettings settings3 = fVar8 == null ? null : fVar8.getSettings();
        if (settings3 != null) {
            settings3.setSavePassword(false);
        }
        f fVar9 = this.f32923d;
        if (fVar9 != null) {
            settings = fVar9.getSettings();
        }
        if (settings != null) {
            settings.setSaveFormData(false);
        }
        f fVar10 = this.f32923d;
        if (fVar10 != null) {
            fVar10.setFocusable(true);
        }
        f fVar11 = this.f32923d;
        if (fVar11 != null) {
            fVar11.setFocusableInTouchMode(true);
        }
        f fVar12 = this.f32923d;
        if (fVar12 != null) {
            fVar12.setOnTouchListener(new View.OnTouchListener() { // from class: d8.c0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!view.hasFocus()) {
                        view.requestFocus();
                    }
                    return false;
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f32923d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f32926g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        boolean z10 = false;
        this.f32929j = false;
        C5086z c5086z = C5086z.f33015a;
        Context context = getContext();
        C5207g.m11110e(context, "context");
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z10 = true;
        }
        if (z10 && (layoutParams = this.f32931l) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f32931l;
                C5086z.m10807F("FacebookSDK.WebDialog", C5207g.m11116k(layoutParams2 != null ? layoutParams2.token : null, "Set token on onAttachedToWindow(): "));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f32924e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f32924e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f32924e;
        int i10 = 0;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f32924e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: d8.b0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    DialogC5064e0 dialogC5064e0 = this.f32913a;
                    C5207g.m11111f(dialogC5064e0, "this$0");
                    dialogC5064e0.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f32926g = new FrameLayout(getContext());
        m10757c();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f32925f = imageView;
        imageView.setOnClickListener(new ViewOnClickListenerC5062d0(i10, this));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.f32925f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f32925f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f32920a != null) {
            ImageView imageView4 = this.f32925f;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            m10759e((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f32926g;
        if (frameLayout != null) {
            frameLayout.addView(this.f32925f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f32926g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f32929j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        C5207g.m11111f(keyEvent, "event");
        if (i10 == 4) {
            f fVar = this.f32923d;
            if (fVar != null && C5207g.m11106a(Boolean.valueOf(fVar.canGoBack()), Boolean.TRUE)) {
                f fVar2 = this.f32923d;
                if (fVar2 != null) {
                    fVar2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d dVar = this.f32927h;
        if (dVar != null) {
            if ((dVar == null ? null : dVar.getStatus()) == AsyncTask.Status.PENDING) {
                if (dVar != null) {
                    dVar.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f32924e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        m10757c();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        d dVar = this.f32927h;
        if (dVar != null) {
            dVar.cancel(true);
            ProgressDialog progressDialog = this.f32924e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C5207g.m11111f(layoutParams, "params");
        if (layoutParams.token == null) {
            this.f32931l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }
}
