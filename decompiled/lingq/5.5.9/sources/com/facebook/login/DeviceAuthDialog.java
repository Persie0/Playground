package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.RunnableC0183b;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.DeviceAuthDialog;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import nf.C7771b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p044c8.C1746a;
import p067d8.C5056a0;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p242lf.C7357b;
import p274n8.DialogInterfaceOnClickListenerC7720e;
import p274n8.ViewOnClickListenerC7718c;
import p291o7.AsyncTaskC8008r;
import p291o7.C7993c0;
import p291o7.C8004n;
import p291o7.C8006p;
import p291o7.C8010t;
import p317p7.C8201h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m13365d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/l;", "<init>", "()V", "a", "b", "RequestState", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class DeviceAuthDialog extends DialogInterfaceOnCancelListenerC0962l {

    /* JADX INFO: renamed from: W0 */
    public static final /* synthetic */ int f11572W0 = 0;

    /* JADX INFO: renamed from: L0 */
    public View f11573L0;

    /* JADX INFO: renamed from: M0 */
    public TextView f11574M0;

    /* JADX INFO: renamed from: N0 */
    public TextView f11575N0;

    /* JADX INFO: renamed from: O0 */
    public DeviceAuthMethodHandler f11576O0;

    /* JADX INFO: renamed from: P0 */
    public final AtomicBoolean f11577P0 = new AtomicBoolean();

    /* JADX INFO: renamed from: Q0 */
    public volatile AsyncTaskC8008r f11578Q0;

    /* JADX INFO: renamed from: R0 */
    public volatile ScheduledFuture<?> f11579R0;

    /* JADX INFO: renamed from: S0 */
    public volatile RequestState f11580S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f11581T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f11582U0;

    /* JADX INFO: renamed from: V0 */
    public LoginClient.Request f11583V0;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C2311a();

        /* JADX INFO: renamed from: a */
        public String f11584a;

        /* JADX INFO: renamed from: b */
        public String f11585b;

        /* JADX INFO: renamed from: c */
        public String f11586c;

        /* JADX INFO: renamed from: d */
        public long f11587d;

        /* JADX INFO: renamed from: e */
        public long f11588e;

        /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        public static final class C2311a implements Parcelable.Creator<RequestState> {
            @Override // android.os.Parcelable.Creator
            public final RequestState createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final RequestState[] newArray(int i10) {
                return new RequestState[i10];
            }
        }

        public RequestState() {
        }

        public RequestState(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            this.f11584a = parcel.readString();
            this.f11585b = parcel.readString();
            this.f11586c = parcel.readString();
            this.f11587d = parcel.readLong();
            this.f11588e = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "dest");
            parcel.writeString(this.f11584a);
            parcel.writeString(this.f11585b);
            parcel.writeString(this.f11586c);
            parcel.writeLong(this.f11587d);
            parcel.writeLong(this.f11588e);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$a */
    public static final class C2312a {
        /* JADX INFO: renamed from: a */
        public static final C2313b m6698a(JSONObject jSONObject) throws JSONException {
            String strOptString;
            int i10 = DeviceAuthDialog.f11572W0;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                    String strOptString2 = jSONObjectOptJSONObject.optString("permission");
                    C5207g.m11110e(strOptString2, "permission");
                    if (!(strOptString2.length() == 0) && !C5207g.m11106a(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                        int iHashCode = strOptString.hashCode();
                        if (iHashCode != -1309235419) {
                            if (iHashCode != 280295099) {
                                if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                    arrayList2.add(strOptString2);
                                }
                            } else if (strOptString.equals("granted")) {
                                arrayList.add(strOptString2);
                            }
                        } else if (strOptString.equals("expired")) {
                            arrayList3.add(strOptString2);
                        }
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return new C2313b(arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$b */
    public static final class C2313b {

        /* JADX INFO: renamed from: a */
        public final List<String> f11589a;

        /* JADX INFO: renamed from: b */
        public final List<String> f11590b;

        /* JADX INFO: renamed from: c */
        public final List<String> f11591c;

        public C2313b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f11589a = arrayList;
            this.f11590b = arrayList2;
            this.f11591c = arrayList3;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$c */
    public static final class DialogC2314c extends Dialog {
        public DialogC2314c(ActivityC0979t activityC0979t) {
            super(activityC0979t, R.style.com_facebook_auth_dialog);
        }

        @Override // android.app.Dialog
        public final void onBackPressed() {
            DeviceAuthDialog.this.getClass();
            super.onBackPressed();
        }
    }

    static {
        new C2312a();
    }

    /* JADX INFO: renamed from: t0 */
    public static void m6687t0(DeviceAuthDialog deviceAuthDialog, C8010t c8010t) {
        C5207g.m11111f(deviceAuthDialog, "this$0");
        if (deviceAuthDialog.f11581T0) {
            return;
        }
        FacebookRequestError facebookRequestError = c8010t.f43588c;
        if (facebookRequestError != null) {
            FacebookException facebookException = facebookRequestError.f11446i;
            if (facebookException == null) {
                facebookException = new FacebookException();
            }
            deviceAuthDialog.m6696y0(facebookException);
            return;
        }
        JSONObject jSONObject = c8010t.f43587b;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            String string = jSONObject.getString("user_code");
            requestState.f11585b = string;
            String str = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
            C5207g.m11110e(str, "java.lang.String.format(locale, format, *args)");
            requestState.f11584a = str;
            requestState.f11586c = jSONObject.getString("code");
            requestState.f11587d = jSONObject.getLong("interval");
            deviceAuthDialog.m6691C0(requestState);
        } catch (JSONException e10) {
            deviceAuthDialog.m6696y0(new FacebookException(e10));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: v0 */
    public static String m6688v0() {
        StringBuilder sb2 = new StringBuilder();
        String str = C5056a0.f32910a;
        sb2.append(C8004n.m15872b());
        sb2.append('|');
        C5056a0.m10747e();
        String str2 = C8004n.f43556g;
        if (str2 == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m6689A0() {
        RequestState requestState = this.f11580S0;
        if (requestState != null) {
            requestState.f11588e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.f11580S0;
        bundle.putString("code", requestState2 == null ? null : requestState2.f11586c);
        bundle.putString("access_token", m6688v0());
        String str = GraphRequest.f11448j;
        this.f11578Q0 = GraphRequest.C2279c.m6623i("device/login_status", bundle, new GraphRequest.InterfaceC2278b() { // from class: com.facebook.login.a
            @Override // com.facebook.GraphRequest.InterfaceC2278b
            /* JADX INFO: renamed from: a */
            public final void mo6614a(C8010t c8010t) {
                DeviceAuthDialog deviceAuthDialog = this.f11658a;
                int i10 = DeviceAuthDialog.f11572W0;
                C5207g.m11111f(deviceAuthDialog, "this$0");
                if (deviceAuthDialog.f11577P0.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = c8010t.f43588c;
                if (facebookRequestError == null) {
                    try {
                        JSONObject jSONObject = c8010t.f43587b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String string = jSONObject.getString("access_token");
                        C5207g.m11110e(string, "resultObject.getString(\"access_token\")");
                        deviceAuthDialog.m6697z0(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e10) {
                        deviceAuthDialog.m6696y0(new FacebookException(e10));
                        return;
                    }
                }
                int i11 = facebookRequestError.f11440c;
                if (i11 == 1349174 || i11 == 1349172) {
                    deviceAuthDialog.m6690B0();
                    return;
                }
                if (i11 != 1349152) {
                    if (i11 == 1349173) {
                        deviceAuthDialog.m6695x0();
                        return;
                    }
                    FacebookException facebookException = facebookRequestError.f11446i;
                    if (facebookException == null) {
                        facebookException = new FacebookException();
                    }
                    deviceAuthDialog.m6696y0(facebookException);
                    return;
                }
                DeviceAuthDialog.RequestState requestState3 = deviceAuthDialog.f11580S0;
                if (requestState3 != null) {
                    C1746a c1746a = C1746a.f9605a;
                    C1746a.m5479a(requestState3.f11585b);
                }
                LoginClient.Request request = deviceAuthDialog.f11583V0;
                if (request != null) {
                    deviceAuthDialog.m6692D0(request);
                } else {
                    deviceAuthDialog.m6695x0();
                }
            }
        }).m6607d();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6690B0() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.f11580S0;
        Long lValueOf = requestState == null ? null : Long.valueOf(requestState.f11587d);
        if (lValueOf != null) {
            synchronized (DeviceAuthMethodHandler.f11593d) {
                try {
                    if (DeviceAuthMethodHandler.f11594e == null) {
                        DeviceAuthMethodHandler.f11594e = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f11594e;
                    if (scheduledThreadPoolExecutor == null) {
                        C5207g.m11117l("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f11579R0 = scheduledThreadPoolExecutor.schedule(new RunnableC0183b(10, this), lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX INFO: renamed from: C0 */
    public final void m6691C0(RequestState requestState) {
        Bitmap bitmapCreateBitmap;
        boolean zM5482d;
        this.f11580S0 = requestState;
        TextView textView = this.f11574M0;
        if (textView == null) {
            C5207g.m11117l("confirmationCode");
            throw null;
        }
        textView.setText(requestState.f11585b);
        C1746a c1746a = C1746a.f9605a;
        String str = requestState.f11584a;
        boolean z10 = false;
        if (C6205a.m12742b(C1746a.class)) {
            bitmapCreateBitmap = null;
        } else {
            try {
                EnumMap enumMap = new EnumMap(EncodeHintType.class);
                enumMap.put(EncodeHintType.MARGIN, 2);
                try {
                    C7771b c7771bMo9303j0 = new C7357b().mo9303j0(str, BarcodeFormat.QR_CODE, enumMap);
                    int i10 = c7771bMo9303j0.f42695b;
                    int i11 = c7771bMo9303j0.f42694a;
                    int[] iArr = new int[i10 * i11];
                    if (i10 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = i12 * i11;
                            if (i11 > 0) {
                                int i15 = 0;
                                while (true) {
                                    int i16 = i15 + 1;
                                    iArr[i14 + i15] = c7771bMo9303j0.m15476b(i15, i12) ? -16777216 : -1;
                                    if (i16 >= i11) {
                                        break;
                                    } else {
                                        i15 = i16;
                                    }
                                }
                            }
                            if (i13 >= i10) {
                                break;
                            } else {
                                i12 = i13;
                            }
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i11, 0, 0, i11, i10);
                    } catch (WriterException unused) {
                    }
                } catch (WriterException unused2) {
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th2) {
                C6205a.m12741a(C1746a.class, th2);
            }
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(m3599s(), bitmapCreateBitmap);
        TextView textView2 = this.f11575N0;
        if (textView2 == null) {
            C5207g.m11117l("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f11574M0;
        if (textView3 == null) {
            C5207g.m11117l("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f11573L0;
        if (view == null) {
            C5207g.m11117l("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f11582U0) {
            C1746a c1746a2 = C1746a.f9605a;
            String str2 = requestState.f11585b;
            if (C6205a.m12742b(C1746a.class)) {
                zM5482d = false;
            } else {
                try {
                    if (C1746a.m5480c()) {
                        zM5482d = C1746a.f9605a.m5482d(str2);
                    } else {
                        zM5482d = false;
                    }
                } catch (Throwable th3) {
                    C6205a.m12741a(C1746a.class, th3);
                }
            }
            if (zM5482d) {
                C8201h c8201h = new C8201h(mo471m(), (String) null);
                C8004n c8004n = C8004n.f43550a;
                if (C7993c0.m15849b()) {
                    c8201h.m16334f("fb_smart_login_service", null);
                }
            }
        }
        if (requestState.f11588e != 0 && (new Date().getTime() - requestState.f11588e) - (requestState.f11587d * 1000) < 0) {
            z10 = true;
        }
        if (z10) {
            m6690B0();
        } else {
            m6689A0();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m6692D0(LoginClient.Request request) {
        String string;
        this.f11583V0 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f11620b));
        C5086z c5086z = C5086z.f33015a;
        String str = request.f11625g;
        if (!C5086z.m10802A(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.f11627i;
        if (!C5086z.m10802A(str2)) {
            bundle.putString("target_user_id", str2);
        }
        bundle.putString("access_token", m6688v0());
        C1746a c1746a = C1746a.f9605a;
        if (!C6205a.m12742b(C1746a.class)) {
            try {
                HashMap map = new HashMap();
                String str3 = Build.DEVICE;
                C5207g.m11110e(str3, "DEVICE");
                map.put("device", str3);
                String str4 = Build.MODEL;
                C5207g.m11110e(str4, "MODEL");
                map.put("model", str4);
                string = new JSONObject(map).toString();
                C5207g.m11110e(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
            } catch (Throwable th2) {
                C6205a.m12741a(C1746a.class, th2);
                string = null;
            }
            bundle.putString("device_info", string);
            String str5 = GraphRequest.f11448j;
            GraphRequest.C2279c.m6623i("device/login", bundle, new C8006p(2, this)).m6607d();
        }
        string = null;
        bundle.putString("device_info", string);
        String str6 = GraphRequest.f11448j;
        GraphRequest.C2279c.m6623i("device/login", bundle, new C8006p(2, this)).m6607d();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        C5207g.m11111f(layoutInflater, "inflater");
        View viewMo3561I = super.mo3561I(layoutInflater, viewGroup, bundle);
        C2332c c2332c = (C2332c) ((FacebookActivity) m3576Y()).f11432S;
        this.f11576O0 = (DeviceAuthMethodHandler) (c2332c == null ? null : c2332c.m6731m0().m6707h());
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            m6691C0(requestState);
        }
        return viewMo3561I;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: K */
    public final void mo3563K() {
        this.f11581T0 = true;
        this.f11577P0.set(true);
        super.mo3563K();
        AsyncTaskC8008r asyncTaskC8008r = this.f11578Q0;
        if (asyncTaskC8008r != null) {
            asyncTaskC8008r.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.f11579R0;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        super.mo3569R(bundle);
        if (this.f11580S0 != null) {
            bundle.putParcelable("request_state", this.f11580S0);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C5207g.m11111f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.f11581T0) {
            m6695x0();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: p0 */
    public final Dialog mo3769p0(Bundle bundle) {
        DialogC2314c dialogC2314c = new DialogC2314c(m3576Y());
        dialogC2314c.setContentView(m6694w0(C1746a.m5480c() && !this.f11582U0));
        return dialogC2314c;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m6693u0(String str, C2313b c2313b, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11576O0;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.m6717d().m6705d(new LoginClient.Result(deviceAuthMethodHandler.m6717d().f11607g, LoginClient.Result.Code.SUCCESS, new AccessToken(str2, C8004n.m15872b(), str, c2313b.f11589a, c2313b.f11590b, c2313b.f11591c, AccessTokenSource.DEVICE_AUTH, date, null, date2), null, null));
        }
        Dialog dialog = this.f6328G0;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: w0 */
    public final View m6694w0(boolean z10) {
        LayoutInflater layoutInflater = m3576Y().getLayoutInflater();
        C5207g.m11110e(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(z10 ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        C5207g.m11110e(viewInflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(R.id.progress_bar);
        C5207g.m11110e(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.f11573L0 = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.confirmation_code);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f11574M0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.cancel_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) viewFindViewById3).setOnClickListener(new ViewOnClickListenerC7718c(0, this));
        View viewFindViewById4 = viewInflate.findViewById(R.id.com_facebook_device_auth_instructions);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f11575N0 = textView;
        textView.setText(Html.fromHtml(m3600t(R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m6695x0() {
        if (this.f11577P0.compareAndSet(false, true)) {
            RequestState requestState = this.f11580S0;
            if (requestState != null) {
                C1746a c1746a = C1746a.f9605a;
                C1746a.m5479a(requestState.f11585b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11576O0;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m6717d().m6705d(new LoginClient.Result(deviceAuthMethodHandler.m6717d().f11607g, LoginClient.Result.Code.CANCEL, null, "User canceled log in.", null));
            }
            Dialog dialog = this.f6328G0;
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m6696y0(FacebookException facebookException) {
        if (this.f11577P0.compareAndSet(false, true)) {
            RequestState requestState = this.f11580S0;
            if (requestState != null) {
                C1746a c1746a = C1746a.f9605a;
                C1746a.m5479a(requestState.f11585b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11576O0;
            if (deviceAuthMethodHandler != null) {
                LoginClient.Request request = deviceAuthMethodHandler.m6717d().f11607g;
                String message = facebookException.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                deviceAuthMethodHandler.m6717d().m6705d(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = this.f6328G0;
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m6697z0(final String str, long j10, Long l10) {
        final Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date2 = null;
        if (j10 != 0) {
            date = new Date((j10 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date2 = new Date(l10.longValue() * 1000);
        }
        AccessToken accessToken = new AccessToken(str, C8004n.m15872b(), "0", null, null, null, null, date, null, date2);
        String str2 = GraphRequest.f11448j;
        GraphRequest graphRequestM6621g = GraphRequest.C2279c.m6621g(accessToken, "me", new GraphRequest.InterfaceC2278b() { // from class: com.facebook.login.b
            @Override // com.facebook.GraphRequest.InterfaceC2278b
            /* JADX INFO: renamed from: a */
            public final void mo6614a(C8010t c8010t) {
                EnumSet<SmartLoginOption> enumSet;
                final DeviceAuthDialog deviceAuthDialog = this.f11659a;
                final String str3 = str;
                final Date date3 = date;
                final Date date4 = date2;
                int i10 = DeviceAuthDialog.f11572W0;
                C5207g.m11111f(deviceAuthDialog, "this$0");
                C5207g.m11111f(str3, "$accessToken");
                if (deviceAuthDialog.f11577P0.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = c8010t.f43588c;
                if (facebookRequestError != null) {
                    FacebookException facebookException = facebookRequestError.f11446i;
                    if (facebookException == null) {
                        facebookException = new FacebookException();
                    }
                    deviceAuthDialog.m6696y0(facebookException);
                    return;
                }
                try {
                    JSONObject jSONObject = c8010t.f43587b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String string = jSONObject.getString("id");
                    C5207g.m11110e(string, "jsonObject.getString(\"id\")");
                    final DeviceAuthDialog.C2313b c2313bM6698a = DeviceAuthDialog.C2312a.m6698a(jSONObject);
                    String string2 = jSONObject.getString("name");
                    C5207g.m11110e(string2, "jsonObject.getString(\"name\")");
                    DeviceAuthDialog.RequestState requestState = deviceAuthDialog.f11580S0;
                    if (requestState != null) {
                        C1746a c1746a = C1746a.f9605a;
                        C1746a.m5479a(requestState.f11585b);
                    }
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                    C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
                    if (!C5207g.m11106a((c5074nM6670b == null || (enumSet = c5074nM6670b.f32971e) == null) ? null : Boolean.valueOf(enumSet.contains(SmartLoginOption.RequireConfirm)), Boolean.TRUE) || deviceAuthDialog.f11582U0) {
                        deviceAuthDialog.m6693u0(string, c2313bM6698a, str3, date3, date4);
                        return;
                    }
                    deviceAuthDialog.f11582U0 = true;
                    String string3 = deviceAuthDialog.m3599s().getString(R.string.com_facebook_smart_login_confirmation_title);
                    C5207g.m11110e(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                    String string4 = deviceAuthDialog.m3599s().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                    C5207g.m11110e(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                    String string5 = deviceAuthDialog.m3599s().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                    C5207g.m11110e(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                    String strM770q = C0166e.m770q(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
                    AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.mo471m());
                    builder.setMessage(string3).setCancelable(true).setNegativeButton(strM770q, new DialogInterface.OnClickListener() { // from class: n8.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            Date date5 = date3;
                            Date date6 = date4;
                            int i12 = DeviceAuthDialog.f11572W0;
                            DeviceAuthDialog deviceAuthDialog2 = deviceAuthDialog;
                            C5207g.m11111f(deviceAuthDialog2, "this$0");
                            String str4 = string;
                            C5207g.m11111f(str4, "$userId");
                            DeviceAuthDialog.C2313b c2313b = c2313bM6698a;
                            C5207g.m11111f(c2313b, "$permissions");
                            String str5 = str3;
                            C5207g.m11111f(str5, "$accessToken");
                            deviceAuthDialog2.m6693u0(str4, c2313b, str5, date5, date6);
                        }
                    }).setPositiveButton(string5, new DialogInterfaceOnClickListenerC7720e(0, deviceAuthDialog));
                    builder.create().show();
                } catch (JSONException e10) {
                    deviceAuthDialog.m6696y0(new FacebookException(e10));
                }
            }
        });
        graphRequestM6621g.m6613k(HttpMethod.GET);
        graphRequestM6621g.f11454d = bundle;
        graphRequestM6621g.m6607d();
    }
}
