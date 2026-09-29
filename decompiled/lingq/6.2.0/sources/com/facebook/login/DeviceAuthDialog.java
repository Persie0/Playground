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
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.internal.SmartLoginOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3012fs;
import p000.RunnableC3781y2;
import p000.ad0;
import p000.bd2;
import p000.be2;
import p000.bna;
import p000.eda;
import p000.ema;
import p000.fa4;
import p000.g9a;
import p000.gv5;
import p000.h31;
import p000.kp3;
import p000.lp1;
import p000.mkd;
import p000.mp3;
import p000.np3;
import p000.pp3;
import p000.q41;
import p000.s46;
import p000.sy2;
import p000.uc2;
import p000.vc2;
import p000.w23;
import p000.y23;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceAuthDialog extends be2 {

    /* JADX INFO: renamed from: M0 */
    public View f11420M0;

    /* JADX INFO: renamed from: N0 */
    public TextView f11421N0;

    /* JADX INFO: renamed from: O0 */
    public TextView f11422O0;

    /* JADX INFO: renamed from: P0 */
    public DeviceAuthMethodHandler f11423P0;

    /* JADX INFO: renamed from: Q0 */
    public final AtomicBoolean f11424Q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: R0 */
    public volatile np3 f11425R0;

    /* JADX INFO: renamed from: S0 */
    public volatile ScheduledFuture f11426S0;

    /* JADX INFO: renamed from: T0 */
    public volatile RequestState f11427T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f11428U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f11429V0;

    /* JADX INFO: renamed from: W0 */
    public LoginClient.Request f11430W0;

    public static final class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C0929c();

        /* JADX INFO: renamed from: a */
        public String f11431a;

        /* JADX INFO: renamed from: b */
        public String f11432b;

        /* JADX INFO: renamed from: c */
        public String f11433c;

        /* JADX INFO: renamed from: d */
        public long f11434d;

        /* JADX INFO: renamed from: e */
        public long f11435e;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f11431a);
            parcel.writeString(this.f11432b);
            parcel.writeString(this.f11433c);
            parcel.writeLong(this.f11434d);
            parcel.writeLong(this.f11435e);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        layoutInflater.getClass();
        View viewMo2074A = super.mo2074A(layoutInflater, viewGroup, bundle);
        C0935i c0935i = (C0935i) ((FacebookActivity) m2089Q()).f11351V;
        this.f11423P0 = (DeviceAuthMethodHandler) (c0935i != null ? c0935i.m5249c0().m5222f() : null);
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            m5212s0(requestState);
        }
        return viewMo2074A;
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: C */
    public final void mo2076C() {
        this.f11428U0 = true;
        this.f11424Q0.set(true);
        super.mo2076C();
        np3 np3Var = this.f11425R0;
        if (np3Var != null) {
            np3Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f11426S0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public final void mo2082I(Bundle bundle) {
        super.mo2082I(bundle);
        if (this.f11427T0 != null) {
            bundle.putParcelable("request_state", this.f11427T0);
        }
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: h0 */
    public final Dialog mo3662h0(Bundle bundle) {
        vc2 vc2Var = new vc2(m2089Q(), com.facebook.common.R$style.com_facebook_auth_dialog);
        vc2Var.setContentView(m5206m0(bd2.m3633b() && !this.f11429V0));
        return vc2Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m5205l0(String str, gv5 gv5Var, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11423P0;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.m5240d().m5220d(new LoginClient.Result(deviceAuthMethodHandler.m5240d().f11450g, LoginClient.Result.Code.SUCCESS, new AccessToken(str2, sy2.m21767b(), str, (ArrayList) gv5Var.f41394d, (ArrayList) gv5Var.f41392b, (ArrayList) gv5Var.f41393c, AccessTokenSource.DEVICE_AUTH, date, null, date2, "facebook"), null, null));
        }
        Dialog dialog = this.f8417H0;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final View m5206m0(boolean z) {
        LayoutInflater layoutInflater = m2089Q().getLayoutInflater();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(z ? com.facebook.common.R$layout.com_facebook_smart_device_dialog_fragment : com.facebook.common.R$layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.R$id.progress_bar);
        viewFindViewById.getClass();
        this.f11420M0 = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(com.facebook.common.R$id.confirmation_code);
        viewFindViewById2.getClass();
        this.f11421N0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(com.facebook.common.R$id.cancel_button);
        viewFindViewById3.getClass();
        ((Button) viewFindViewById3).setOnClickListener(new h31(this, 1));
        View viewFindViewById4 = viewInflate.findViewById(com.facebook.common.R$id.com_facebook_device_auth_instructions);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f11422O0 = textView;
        textView.setText(Html.fromHtml(m2111m(com.facebook.common.R$string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m5207n0() {
        if (this.f11424Q0.compareAndSet(false, true)) {
            RequestState requestState = this.f11427T0;
            if (requestState != null) {
                bd2.m3632a(requestState.f11432b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11423P0;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m5240d().m5220d(new LoginClient.Result(deviceAuthMethodHandler.m5240d().f11450g, LoginClient.Result.Code.CANCEL, null, "User canceled log in.", null));
            }
            Dialog dialog = this.f8417H0;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m5208o0(FacebookException facebookException) {
        if (this.f11424Q0.compareAndSet(false, true)) {
            RequestState requestState = this.f11427T0;
            if (requestState != null) {
                bd2.m3632a(requestState.f11432b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11423P0;
            if (deviceAuthMethodHandler != null) {
                LoginClient.Request request = deviceAuthMethodHandler.m5240d().f11450g;
                String message = facebookException.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                deviceAuthMethodHandler.m5240d().m5220d(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = this.f8417H0;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Override // p000.be2, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.f11428U0) {
            return;
        }
        m5207n0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m5209p0(final String str, long j, Long l) {
        Date date;
        Bundle bundleM12429f = g9a.m12429f("fields", "id,permissions,name");
        if (j != 0) {
            date = new Date((j * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        final Date date2 = l.longValue() != 0 ? new Date(l.longValue() * 1000) : null;
        AccessToken accessToken = new AccessToken(str, sy2.m21767b(), "0", null, null, null, null, date, null, date2, "facebook");
        final Date date3 = date;
        String str2 = mp3.f51688j;
        mp3 mp3VarM21068p = s46.m21068p(accessToken, "me", new kp3() { // from class: com.facebook.login.b
            @Override // p000.kp3
            /* JADX INFO: renamed from: a */
            public final void mo3204a(pp3 pp3Var) {
                final DeviceAuthDialog deviceAuthDialog = this.f11498a;
                final String str3 = str;
                final Date date4 = date3;
                final Date date5 = date2;
                if (deviceAuthDialog.f11424Q0.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = pp3Var.f56629c;
                if (facebookRequestError != null) {
                    FacebookException facebookException = facebookRequestError.f11365i;
                    if (facebookException == null) {
                        facebookException = new FacebookException();
                    }
                    deviceAuthDialog.m5208o0(facebookException);
                    return;
                }
                try {
                    JSONObject jSONObject = pp3Var.f56628b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String string = jSONObject.getString("id");
                    string.getClass();
                    final gv5 gv5VarM16903d = mkd.m16903d(jSONObject);
                    String string2 = jSONObject.getString("name");
                    string2.getClass();
                    DeviceAuthDialog.RequestState requestState = deviceAuthDialog.f11427T0;
                    if (requestState != null) {
                        bd2.m3632a(requestState.f11432b);
                    }
                    w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
                    if (!fa4.m11650l(w23VarM24854b != null ? Boolean.valueOf(w23VarM24854b.f66254c.contains(SmartLoginOption.RequireConfirm)) : null, Boolean.TRUE) || deviceAuthDialog.f11429V0) {
                        deviceAuthDialog.m5205l0(string, gv5VarM16903d, str3, date4, date5);
                        return;
                    }
                    deviceAuthDialog.f11429V0 = true;
                    String string3 = deviceAuthDialog.m2110l().getString(com.facebook.common.R$string.com_facebook_smart_login_confirmation_title);
                    string3.getClass();
                    String string4 = deviceAuthDialog.m2110l().getString(com.facebook.common.R$string.com_facebook_smart_login_confirmation_continue_as);
                    string4.getClass();
                    String string5 = deviceAuthDialog.m2110l().getString(com.facebook.common.R$string.com_facebook_smart_login_confirmation_cancel);
                    string5.getClass();
                    String str4 = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                    AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.mo2107i());
                    builder.setMessage(string3).setCancelable(true).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: tc2
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            deviceAuthDialog.m5205l0(string, gv5VarM16903d, str3, date4, date5);
                        }
                    }).setPositiveButton(string5, new uc2(deviceAuthDialog, 0));
                    builder.create().show();
                } catch (JSONException e) {
                    deviceAuthDialog.m5208o0(new FacebookException(e));
                }
            }
        });
        mp3VarM21068p.m16989k(HttpMethod.GET);
        mp3VarM21068p.f51694d = bundleM12429f;
        mp3VarM21068p.m16983d();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m5210q0() {
        RequestState requestState = this.f11427T0;
        if (requestState != null) {
            requestState.f11435e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.f11427T0;
        bundle.putString("code", requestState2 != null ? requestState2.f11433c : null);
        StringBuilder sb = new StringBuilder();
        sb.append(sy2.m21767b());
        sb.append('|');
        eda.m11074g();
        String str = sy2.f61592h;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb.append(str);
        bundle.putString("access_token", sb.toString());
        String str2 = mp3.f51688j;
        this.f11425R0 = new mp3(null, "device/login_status", bundle, HttpMethod.POST, new C0927a(this, 1)).m16983d();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m5211r0() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.f11427T0;
        Long lValueOf = requestState != null ? Long.valueOf(requestState.f11434d) : null;
        if (lValueOf != null) {
            synchronized (DeviceAuthMethodHandler.f11436d) {
                try {
                    if (DeviceAuthMethodHandler.f11437e == null) {
                        DeviceAuthMethodHandler.f11437e = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f11437e;
                    if (scheduledThreadPoolExecutor == null) {
                        fa4.m11636J("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f11426S0 = scheduledThreadPoolExecutor.schedule(new RunnableC3781y2(this, 16), lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m5212s0(RequestState requestState) {
        Bitmap bitmapCreateBitmap;
        this.f11427T0 = requestState;
        TextView textView = this.f11421N0;
        if (textView == null) {
            fa4.m11636J("confirmationCode");
            throw null;
        }
        textView.setText(requestState.f11432b);
        String str = requestState.f11431a;
        bd2 bd2Var = bd2.f8364a;
        boolean zM3634c = false;
        if (lp1.f49971a.contains(bd2.class)) {
            bitmapCreateBitmap = null;
        } else {
            try {
                EnumMap enumMap = new EnumMap(EncodeHintType.class);
                enumMap.put(EncodeHintType.MARGIN, 2);
                try {
                    ad0 ad0VarMo4915f = new q41(10).mo4915f(str, BarcodeFormat.QR_CODE, enumMap);
                    int i = ad0VarMo4915f.f504b;
                    int i2 = ad0VarMo4915f.f503a;
                    int[] iArr = new int[i * i2];
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = i3 * i2;
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i4 + i5] = ad0VarMo4915f.m272a(i5, i3) ? -16777216 : -1;
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    } catch (WriterException unused) {
                    }
                } catch (WriterException unused2) {
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th) {
                lp1.m16420a(bd2.class, th);
            }
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(m2110l(), bitmapCreateBitmap);
        TextView textView2 = this.f11422O0;
        if (textView2 == null) {
            fa4.m11636J("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f11421N0;
        if (textView3 == null) {
            fa4.m11636J("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f11420M0;
        if (view == null) {
            fa4.m11636J("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f11429V0) {
            String str2 = requestState.f11432b;
            if (!lp1.f49971a.contains(bd2.class)) {
                try {
                    if (bd2.m3633b()) {
                        zM3634c = bd2.f8364a.m3634c(str2);
                    }
                } catch (Throwable th2) {
                    lp1.m16420a(bd2.class, th2);
                }
            }
            if (zM3634c) {
                C3012fs c3012fs = new C3012fs(mo2107i(), (String) null);
                sy2 sy2Var = sy2.f61585a;
                if (ema.m11256c()) {
                    c3012fs.m12040g("fb_smart_login_service", null);
                }
            }
        }
        if (requestState.f11435e != 0 && (new Date().getTime() - requestState.f11435e) - (requestState.f11434d * 1000) < 0) {
            m5211r0();
        } else {
            m5210q0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m5213t0(LoginClient.Request request) {
        request.getClass();
        this.f11430W0 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f11465b));
        String str = request.f11472i;
        if (!bna.m3945d0(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.f11474k;
        if (!bna.m3945d0(str2)) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sy2.m21767b());
        sb.append('|');
        eda.m11074g();
        String str3 = sy2.f61592h;
        if (str3 == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb.append(str3);
        bundle.putString("access_token", sb.toString());
        bd2 bd2Var = bd2.f8364a;
        String str4 = null;
        if (!lp1.f49971a.contains(bd2.class)) {
            try {
                HashMap map = new HashMap();
                String str5 = Build.DEVICE;
                str5.getClass();
                map.put("device", str5);
                String str6 = Build.MODEL;
                str6.getClass();
                map.put("model", str6);
                String string = new JSONObject(map).toString();
                string.getClass();
                str4 = string;
            } catch (Throwable th) {
                lp1.m16420a(bd2.class, th);
            }
        }
        bundle.putString("device_info", str4);
        String str7 = mp3.f51688j;
        new mp3(null, "device/login", bundle, HttpMethod.POST, new C0927a(this, 0)).m16983d();
    }
}
