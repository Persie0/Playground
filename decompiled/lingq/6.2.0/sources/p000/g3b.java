package p000;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.common.R$drawable;
import com.facebook.common.R$string;
import com.facebook.common.R$style;
import com.facebook.login.LoginTargetApp;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class g3b extends Dialog {

    /* JADX INFO: renamed from: H */
    public static final int f40137H = R$style.com_facebook_activity_theme;

    /* JADX INFO: renamed from: I */
    public static volatile int f40138I;

    /* JADX INFO: renamed from: a */
    public String f40139a;

    /* JADX INFO: renamed from: b */
    public String f40140b;

    /* JADX INFO: renamed from: c */
    public c3b f40141c;

    /* JADX INFO: renamed from: d */
    public sc4 f40142d;

    /* JADX INFO: renamed from: e */
    public ProgressDialog f40143e;

    /* JADX INFO: renamed from: f */
    public ImageView f40144f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f40145g;

    /* JADX INFO: renamed from: h */
    public final e3b f40146h;

    /* JADX INFO: renamed from: i */
    public boolean f40147i;

    /* JADX INFO: renamed from: j */
    public boolean f40148j;

    /* JADX INFO: renamed from: k */
    public boolean f40149k;

    /* JADX INFO: renamed from: l */
    public WindowManager.LayoutParams f40150l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3b(id3 id3Var, String str, Bundle bundle, LoginTargetApp loginTargetApp, c3b c3bVar) {
        Uri uriM3956j;
        super(id3Var, f40138I);
        eda.m11074g();
        this.f40140b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        id3Var.getClass();
        String str2 = id3Var.getPackageManager().hasSystemFeature("android.hardware.type.pc") ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f40140b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", sy2.m21767b());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.2.3"}, 1)));
        this.f40141c = c3bVar;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.f40146h = new e3b(this, str, bundle);
            return;
        }
        if (f3b.f38371a[loginTargetApp.ordinal()] == 1) {
            uriM3956j = bna.m3956j(AbstractC3695vr.m23504o(), "oauth/authorize", bundle);
        } else {
            uriM3956j = bna.m3956j(AbstractC3695vr.m23503n(), sy2.m21769d() + "/dialog/" + str, bundle);
        }
        this.f40139a = uriM3956j.toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m12343a(float f, int i, int i2, int i3) {
        double d;
        int i4 = (int) (i / f);
        if (i4 <= i2) {
            d = 1.0d;
        } else {
            d = i4 >= i3 ? 0.5d : ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i) * d);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12344b(id3 id3Var) {
        if (id3Var == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = id3Var.getPackageManager().getApplicationInfo(id3Var.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && f40138I == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = f40137H;
                }
                f40138I = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle mo12345c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleM3964n0 = bna.m3964n0(uri.getQuery());
        bundleM3964n0.putAll(bna.m3964n0(uri.getFragment()));
        return bundleM3964n0;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f40141c == null || this.f40147i) {
            return;
        }
        m12347e(new FacebookOperationCanceledException());
    }

    /* JADX INFO: renamed from: d */
    public final void m12346d() {
        Object systemService = getContext().getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int iMin = Math.min(m12343a(displayMetrics.density, i3, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(m12343a(displayMetrics.density, i, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        sc4 sc4Var = this.f40142d;
        if (sc4Var != null) {
            sc4Var.stopLoading();
        }
        if (!this.f40148j && (progressDialog = this.f40143e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m12347e(Exception exc) {
        if (this.f40141c == null || this.f40147i) {
            return;
        }
        this.f40147i = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        c3b c3bVar = this.f40141c;
        if (c3bVar != null) {
            c3bVar.mo4304a(null, facebookException);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final void m12348f(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        int i2 = 1;
        sc4 sc4Var = new sc4(getContext(), 1);
        this.f40142d = sc4Var;
        sc4Var.setVerticalScrollBarEnabled(false);
        sc4 sc4Var2 = this.f40142d;
        if (sc4Var2 != null) {
            sc4Var2.setHorizontalScrollBarEnabled(false);
        }
        sc4 sc4Var3 = this.f40142d;
        if (sc4Var3 != null) {
            sc4Var3.setWebViewClient(new tc4(this, i2));
        }
        sc4 sc4Var4 = this.f40142d;
        WebSettings settings = sc4Var4 != null ? sc4Var4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        sc4 sc4Var5 = this.f40142d;
        if (sc4Var5 != null) {
            String str = this.f40139a;
            if (str == null) {
                C3386nv.m17633t("Required value was null.");
                return;
            }
            sc4Var5.loadUrl(str);
        }
        sc4 sc4Var6 = this.f40142d;
        if (sc4Var6 != null) {
            sc4Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        sc4 sc4Var7 = this.f40142d;
        if (sc4Var7 != null) {
            sc4Var7.setVisibility(4);
        }
        sc4 sc4Var8 = this.f40142d;
        WebSettings settings2 = sc4Var8 != null ? sc4Var8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        sc4 sc4Var9 = this.f40142d;
        WebSettings settings3 = sc4Var9 != null ? sc4Var9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        sc4 sc4Var10 = this.f40142d;
        if (sc4Var10 != null) {
            sc4Var10.setFocusable(true);
        }
        sc4 sc4Var11 = this.f40142d;
        if (sc4Var11 != null) {
            sc4Var11.setFocusableInTouchMode(true);
        }
        sc4 sc4Var12 = this.f40142d;
        if (sc4Var12 != null) {
            sc4Var12.setOnTouchListener(new a3b());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f40142d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f40145g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f40148j = false;
        Context context = getContext();
        context.getClass();
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.f40150l) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f40150l;
                Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
                sy2 sy2Var = sy2.f61585a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f40143e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f40143e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R$string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f40143e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f40143e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: b3b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f7881a.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f40145g = new FrameLayout(getContext());
        m12346d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f40144f = imageView;
        imageView.setOnClickListener(new h31(this, 13));
        Drawable drawable = getContext().getResources().getDrawable(R$drawable.com_facebook_close);
        ImageView imageView2 = this.f40144f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f40144f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f40139a != null) {
            ImageView imageView4 = this.f40144f;
            if (imageView4 == null) {
                C3386nv.m17633t("Required value was null.");
                return;
            }
            m12348f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f40145g;
        if (frameLayout != null) {
            frameLayout.addView(this.f40144f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f40145g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            C3386nv.m17633t("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f40148j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 4) {
            sc4 sc4Var = this.f40142d;
            if (sc4Var != null && sc4Var.canGoBack()) {
                sc4 sc4Var2 = this.f40142d;
                if (sc4Var2 != null) {
                    sc4Var2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e3b e3bVar = this.f40146h;
        if (e3bVar != null) {
            if ((e3bVar != null ? e3bVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (e3bVar != null) {
                    e3bVar.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f40143e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        m12346d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        e3b e3bVar = this.f40146h;
        if (e3bVar != null) {
            e3bVar.cancel(true);
            ProgressDialog progressDialog = this.f40143e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (layoutParams.token == null) {
            this.f40150l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g3b(Context context, String str) {
        context.getClass();
        eda.m11074g();
        int i = f40138I;
        if (i == 0) {
            eda.m11074g();
            i = f40138I;
        }
        super(context, i);
        this.f40140b = "fbconnect://success";
        this.f40139a = str;
    }
}
