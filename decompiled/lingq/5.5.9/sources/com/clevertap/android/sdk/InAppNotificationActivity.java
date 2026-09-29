package com.clevertap.android.sdk;

import android.R;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0949e0;
import com.clevertap.android.sdk.inapp.AbstractC2213d;
import com.clevertap.android.sdk.inapp.C2210b0;
import com.clevertap.android.sdk.inapp.C2227m;
import com.clevertap.android.sdk.inapp.C2229o;
import com.clevertap.android.sdk.inapp.C2231q;
import com.clevertap.android.sdk.inapp.C2232r;
import com.clevertap.android.sdk.inapp.C2233s;
import com.clevertap.android.sdk.inapp.C2235u;
import com.clevertap.android.sdk.inapp.C2236v;
import com.clevertap.android.sdk.inapp.C2240z;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppType;
import com.clevertap.android.sdk.inapp.InterfaceC2222h0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p003a2.C0009a;
import p254m2.C7472a;
import p290o6.C7966l;
import p290o6.InterfaceC7953e0;

/* JADX INFO: loaded from: classes.dex */
public final class InAppNotificationActivity extends ActivityC0979t implements InterfaceC2222h0, InterfaceC7953e0 {

    /* JADX INFO: renamed from: X */
    public static boolean f11007X;

    /* JADX INFO: renamed from: S */
    public CleverTapInstanceConfig f11008S;

    /* JADX INFO: renamed from: T */
    public CTInAppNotification f11009T;

    /* JADX INFO: renamed from: U */
    public WeakReference<InterfaceC2222h0> f11010U;

    /* JADX INFO: renamed from: V */
    public WeakReference<InterfaceC2180e> f11011V;

    /* JADX INFO: renamed from: W */
    public C2182b f11012W;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$a */
    public class DialogInterfaceOnClickListenerC2176a implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC2176a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            Bundle bundle = new Bundle();
            InAppNotificationActivity inAppNotificationActivity = InAppNotificationActivity.this;
            bundle.putString("wzrk_id", inAppNotificationActivity.f11009T.f11109g);
            bundle.putString("wzrk_c2a", inAppNotificationActivity.f11009T.f11107f.get(0).f11130h);
            inAppNotificationActivity.m6439N(bundle, null);
            String str = inAppNotificationActivity.f11009T.f11107f.get(0).f11123a;
            if (str != null) {
                inAppNotificationActivity.m6442Q(bundle, str);
                return;
            }
            CTInAppNotification cTInAppNotification = inAppNotificationActivity.f11009T;
            if (cTInAppNotification.f11114i0) {
                inAppNotificationActivity.m6444S(cTInAppNotification.f11116j0);
            } else if (cTInAppNotification.f11107f.get(0).f11132j == null || !inAppNotificationActivity.f11009T.f11107f.get(0).f11132j.equalsIgnoreCase("rfp")) {
                inAppNotificationActivity.m6440O(bundle);
            } else {
                inAppNotificationActivity.m6444S(inAppNotificationActivity.f11009T.f11107f.get(0).f11133k);
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$b */
    public class DialogInterfaceOnClickListenerC2177b implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC2177b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            Bundle bundle = new Bundle();
            InAppNotificationActivity inAppNotificationActivity = InAppNotificationActivity.this;
            bundle.putString("wzrk_id", inAppNotificationActivity.f11009T.f11109g);
            bundle.putString("wzrk_c2a", inAppNotificationActivity.f11009T.f11107f.get(1).f11130h);
            inAppNotificationActivity.m6439N(bundle, null);
            String str = inAppNotificationActivity.f11009T.f11107f.get(1).f11123a;
            if (str != null) {
                inAppNotificationActivity.m6442Q(bundle, str);
            } else if (inAppNotificationActivity.f11009T.f11107f.get(1).f11132j == null || !inAppNotificationActivity.f11009T.f11107f.get(1).f11132j.equalsIgnoreCase("rfp")) {
                inAppNotificationActivity.m6440O(bundle);
            } else {
                inAppNotificationActivity.m6444S(inAppNotificationActivity.f11009T.f11107f.get(1).f11133k);
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$c */
    public class DialogInterfaceOnClickListenerC2178c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC2178c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            Bundle bundle = new Bundle();
            InAppNotificationActivity inAppNotificationActivity = InAppNotificationActivity.this;
            bundle.putString("wzrk_id", inAppNotificationActivity.f11009T.f11109g);
            bundle.putString("wzrk_c2a", inAppNotificationActivity.f11009T.f11107f.get(2).f11130h);
            inAppNotificationActivity.m6439N(bundle, null);
            String str = inAppNotificationActivity.f11009T.f11107f.get(2).f11123a;
            if (str != null) {
                inAppNotificationActivity.m6442Q(bundle, str);
            } else {
                inAppNotificationActivity.m6440O(bundle);
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$d */
    public static /* synthetic */ class C2179d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11016a;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            f11016a = iArr;
            try {
                iArr[CTInAppType.CTInAppTypeCoverHTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeInterstitialHTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeHalfInterstitialHTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeCover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeInterstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11016a[CTInAppType.CTInAppTypeAlert.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$e */
    public interface InterfaceC2180e {
        /* JADX INFO: renamed from: b */
        void mo6447b();

        /* JADX INFO: renamed from: d */
        void mo6448d();
    }

    @Override // com.clevertap.android.sdk.inapp.InterfaceC2222h0
    /* JADX INFO: renamed from: D */
    public final void mo6436D(CTInAppNotification cTInAppNotification, Bundle bundle, HashMap<String, String> map) {
        m6439N(bundle, map);
    }

    @Override // p290o6.InterfaceC7953e0
    /* JADX INFO: renamed from: F */
    public final void mo6437F(boolean z10) {
        m6444S(z10);
    }

    /* JADX INFO: renamed from: M */
    public final AbstractC2213d m6438M() {
        AlertDialog alertDialogCreate;
        CTInAppType cTInAppType = this.f11009T.f11083M;
        switch (C2179d.f11016a[cTInAppType.ordinal()]) {
            case 1:
                return new C2227m();
            case 2:
                return new C2231q();
            case 3:
                return new C2229o();
            case 4:
                return new C2232r();
            case 5:
                return new C2240z();
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C2235u();
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C2233s();
            case 8:
                return new C2210b0();
            case 9:
                return new C2236v();
            case 10:
                if (this.f11009T.f11107f.size() > 0) {
                    alertDialogCreate = new AlertDialog.Builder(this, R.style.Theme.Material.Light.Dialog.Alert).setCancelable(false).setTitle(this.f11009T.f11098a0).setMessage(this.f11009T.f11092V).setPositiveButton(this.f11009T.f11107f.get(0).f11130h, new DialogInterfaceOnClickListenerC2176a()).create();
                    if (this.f11009T.f11107f.size() == 2) {
                        alertDialogCreate.setButton(-2, this.f11009T.f11107f.get(1).f11130h, new DialogInterfaceOnClickListenerC2177b());
                    }
                    if (this.f11009T.f11107f.size() > 2) {
                        alertDialogCreate.setButton(-3, this.f11009T.f11107f.get(2).f11130h, new DialogInterfaceOnClickListenerC2178c());
                    }
                } else {
                    alertDialogCreate = null;
                }
                if (alertDialogCreate == null) {
                    this.f11008S.m6433b().getClass();
                    C2181a.m6451c("InAppNotificationActivity: Alert Dialog is null, not showing Alert InApp");
                    return null;
                }
                alertDialogCreate.show();
                f11007X = true;
                m6441P();
                return null;
            default:
                this.f11008S.m6433b().getClass();
                C2181a.m6458k("InAppNotificationActivity: Unhandled InApp Type: " + cTInAppType);
                return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m6439N(Bundle bundle, HashMap<String, String> map) {
        InterfaceC2222h0 interfaceC2222h0M6443R = m6443R();
        if (interfaceC2222h0M6443R != null) {
            interfaceC2222h0M6443R.mo6436D(this.f11009T, bundle, map);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m6440O(Bundle bundle) {
        if (f11007X) {
            f11007X = false;
        }
        finish();
        InterfaceC2222h0 interfaceC2222h0M6443R = m6443R();
        if (interfaceC2222h0M6443R == null || getBaseContext() == null || this.f11009T == null) {
            return;
        }
        interfaceC2222h0M6443R.mo6445c(getBaseContext(), this.f11009T, bundle);
    }

    /* JADX INFO: renamed from: P */
    public final void m6441P() {
        InterfaceC2222h0 interfaceC2222h0M6443R = m6443R();
        if (interfaceC2222h0M6443R != null) {
            interfaceC2222h0M6443R.mo6446y(this.f11009T);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m6442Q(Bundle bundle, String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str.replace("\n", "").replace("\r", ""))));
        } catch (Throwable unused) {
        }
        m6440O(bundle);
    }

    /* JADX INFO: renamed from: R */
    public final InterfaceC2222h0 m6443R() {
        InterfaceC2222h0 interfaceC2222h0;
        try {
            interfaceC2222h0 = this.f11010U.get();
        } catch (Throwable unused) {
            interfaceC2222h0 = null;
        }
        if (interfaceC2222h0 == null) {
            C2181a c2181aM6433b = this.f11008S.m6433b();
            String str = this.f11008S.f10995a;
            String str2 = "InAppActivityListener is null for notification: " + this.f11009T.f11088R;
            c2181aM6433b.getClass();
            C2181a.m6460m(str, str2);
        }
        return interfaceC2222h0;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: S */
    public final void m6444S(boolean z10) {
        this.f11012W.m6463a(z10, this.f11011V.get());
    }

    @Override // com.clevertap.android.sdk.inapp.InterfaceC2222h0
    /* JADX INFO: renamed from: c */
    public final void mo6445c(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        m6440O(bundle);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
        m6440O(null);
    }

    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = getResources().getConfiguration().orientation;
        if (i10 == 2) {
            getWindow().addFlags(1024);
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalArgumentException();
            }
            this.f11009T = (CTInAppNotification) extras.getParcelable("inApp");
            boolean z10 = extras.getBoolean("displayHardPermissionDialog", false);
            Bundle bundle2 = extras.getBundle("configBundle");
            if (bundle2 != null) {
                this.f11008S = (CleverTapInstanceConfig) bundle2.getParcelable("config");
            }
            this.f11010U = new WeakReference<>(CleverTapAPI.m6423j(this, this.f11008S, null).f10981b.f43478h);
            this.f11011V = new WeakReference<>(CleverTapAPI.m6423j(this, this.f11008S, null).f10981b.f43478h);
            this.f11012W = new C2182b(this, this.f11008S);
            if (z10) {
                m6444S(extras.getBoolean("shouldShowFallbackSettings", false));
                return;
            }
            CTInAppNotification cTInAppNotification = this.f11009T;
            if (cTInAppNotification == null) {
                finish();
                return;
            }
            if (cTInAppNotification.f11085O && !cTInAppNotification.f11084N) {
                if (i10 == 2) {
                    C2181a.m6449a("App in Landscape, dismissing portrait InApp Notification");
                    finish();
                    m6440O(null);
                    return;
                }
                C2181a.m6449a("App in Portrait, displaying InApp Notification anyway");
            }
            CTInAppNotification cTInAppNotification2 = this.f11009T;
            if (!cTInAppNotification2.f11085O && cTInAppNotification2.f11084N) {
                if (i10 == 1) {
                    C2181a.m6449a("App in Portrait, dismissing landscape InApp Notification");
                    finish();
                    m6440O(null);
                    return;
                }
                C2181a.m6449a("App in Landscape, displaying InApp Notification anyway");
            }
            if (bundle == null) {
                AbstractC2213d abstractC2213dM6438M = m6438M();
                if (abstractC2213dM6438M != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("inApp", this.f11009T);
                    bundle3.putParcelable("config", this.f11008S);
                    abstractC2213dM6438M.m3583e0(bundle3);
                    C0949e0 c0949e0M3805K = m3805K();
                    c0949e0M3805K.getClass();
                    C0940a c0940a = new C0940a(c0949e0M3805K);
                    c0940a.f6345b = R.animator.fade_in;
                    c0940a.f6346c = R.animator.fade_out;
                    c0940a.f6347d = 0;
                    c0940a.f6348e = 0;
                    c0940a.mo3695f(R.id.content, abstractC2213dM6438M, C0009a.m23l(new StringBuilder(), this.f11008S.f10995a, ":CT_INAPP_CONTENT_FRAGMENT"), 1);
                    c0940a.m3697i();
                }
            } else if (f11007X) {
                m6438M();
            }
        } catch (Throwable th2) {
            C2181a.m6457j("Cannot find a valid notification bundle to show!", th2);
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        C7966l.m15803a(this, this.f11008S);
        boolean z10 = false;
        C7966l.f43364c = false;
        C7966l.m15804b(this, this.f11008S);
        if (i10 == 102) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            }
            if (z10) {
                this.f11011V.get().mo6448d();
            } else {
                this.f11011V.get().mo6447b();
            }
            m6440O(null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f11012W.f11021d && Build.VERSION.SDK_INT >= 33) {
            if (C7472a.m14841a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                this.f11011V.get().mo6448d();
            } else {
                this.f11011V.get().mo6447b();
            }
            m6440O(null);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(R.style.Theme.Translucent.NoTitleBar);
    }

    @Override // com.clevertap.android.sdk.inapp.InterfaceC2222h0
    /* JADX INFO: renamed from: y */
    public final void mo6446y(CTInAppNotification cTInAppNotification) {
        m6441P();
    }
}
