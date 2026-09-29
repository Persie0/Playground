package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC3695vr;
import p000.C3156jq;
import p000.RunnableC3725wk;
import p000.bna;
import p000.cad;
import p000.cl9;
import p000.fa4;
import p000.hfb;
import p000.id3;
import p000.nx1;
import p000.ox1;
import p000.sy2;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new hfb(7);

    /* JADX INFO: renamed from: i */
    public static boolean f11414i;

    /* JADX INFO: renamed from: d */
    public String f11415d;

    /* JADX INFO: renamed from: e */
    public final String f11416e;

    /* JADX INFO: renamed from: f */
    public final String f11417f;

    /* JADX INFO: renamed from: g */
    public final String f11418g;

    /* JADX INFO: renamed from: h */
    public final AccessTokenSource f11419h;

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        this.f11487b = loginClient;
        this.f11418g = "custom_tab";
        this.f11419h = AccessTokenSource.CHROME_CUSTOM_TAB;
        String string = new BigInteger(100, new SecureRandom()).toString(32);
        string.getClass();
        this.f11416e = string;
        f11414i = false;
        this.f11417f = ox1.m18558d(super.mo5198f());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String mo5197e() {
        return this.f11418g;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: f */
    public final String mo5198f() {
        return this.f11417f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[Catch: JSONException -> 0x0070, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0070, blocks: (B:24:0x0056, B:27:0x005f), top: B:69:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: h */
    public final boolean mo5199h(int i, int i2, Intent intent) {
        LoginClient.Request request;
        String stringExtra;
        Bundle bundleM3964n0;
        String string;
        String string2;
        String string3;
        int i3;
        String string4;
        boolean zM11650l = false;
        if (intent != null) {
            int i4 = CustomTabMainActivity.f11347c;
            if (!intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                if (i == 1 && (request = m5240d().f11450g) != null) {
                    if (i2 == -1) {
                        m5248p(request, null, new FacebookOperationCanceledException());
                        return false;
                    }
                    if (intent != null) {
                        int i5 = CustomTabMainActivity.f11347c;
                        stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
                    } else {
                        stringExtra = null;
                    }
                    if (stringExtra != null && (cl9.m4842Y(stringExtra, "fbconnect://cct.", false) || cl9.m4842Y(stringExtra, super.mo5198f(), false))) {
                        Uri uri = Uri.parse(stringExtra);
                        bundleM3964n0 = bna.m3964n0(uri.getQuery());
                        bundleM3964n0.putAll(bna.m3964n0(uri.getFragment()));
                        try {
                            string4 = bundleM3964n0.getString("state");
                            if (string4 == null) {
                                zM11650l = fa4.m11650l(new JSONObject(string4).getString("7_challenge"), this.f11416e);
                            }
                        } catch (JSONException unused) {
                        }
                        if (zM11650l) {
                            string = bundleM3964n0.getString("error");
                            if (string == null) {
                                string = bundleM3964n0.getString("error_type");
                            }
                            string2 = bundleM3964n0.getString("error_msg");
                            if (string2 == null) {
                                string2 = bundleM3964n0.getString("error_message");
                            }
                            if (string2 == null) {
                                string2 = bundleM3964n0.getString("error_description");
                            }
                            string3 = bundleM3964n0.getString("error_code");
                            if (string3 != null) {
                                try {
                                    i3 = Integer.parseInt(string3);
                                } catch (NumberFormatException unused2) {
                                    i3 = -1;
                                }
                            } else {
                                i3 = -1;
                            }
                            if (!bna.m3945d0(string) && bna.m3945d0(string2) && i3 == -1) {
                                if (bundleM3964n0.containsKey("access_token")) {
                                    m5248p(request, bundleM3964n0, null);
                                } else {
                                    sy2.m21768c().execute(new RunnableC3725wk(this, request, bundleM3964n0, 5));
                                }
                            } else if ((string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) || i3 == 4201) {
                                m5248p(request, null, new FacebookOperationCanceledException());
                            } else {
                                m5248p(request, null, new FacebookServiceException(new FacebookRequestError(string, i3, string2), string2));
                            }
                        } else {
                            m5248p(request, null, new FacebookException("Invalid state parameter"));
                        }
                    }
                    return true;
                }
            }
        } else if (i == 1) {
            if (i2 == -1) {
                m5248p(request, null, new FacebookOperationCanceledException());
                return false;
            }
            if (intent != null) {
                int i6 = CustomTabMainActivity.f11347c;
                stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                Uri uri2 = Uri.parse(stringExtra);
                bundleM3964n0 = bna.m3964n0(uri2.getQuery());
                bundleM3964n0.putAll(bna.m3964n0(uri2.getFragment()));
                string4 = bundleM3964n0.getString("state");
                if (string4 == null) {
                    zM11650l = fa4.m11650l(new JSONObject(string4).getString("7_challenge"), this.f11416e);
                }
                if (zM11650l) {
                    m5248p(request, null, new FacebookException("Invalid state parameter"));
                } else {
                    string = bundleM3964n0.getString("error");
                    if (string == null) {
                        string = bundleM3964n0.getString("error_type");
                    }
                    string2 = bundleM3964n0.getString("error_msg");
                    if (string2 == null) {
                        string2 = bundleM3964n0.getString("error_message");
                    }
                    if (string2 == null) {
                        string2 = bundleM3964n0.getString("error_description");
                    }
                    string3 = bundleM3964n0.getString("error_code");
                    if (string3 != null) {
                        i3 = Integer.parseInt(string3);
                    } else {
                        i3 = -1;
                    }
                    if (!bna.m3945d0(string)) {
                        if (string == null) {
                            m5248p(request, null, new FacebookServiceException(new FacebookRequestError(string, i3, string2), string2));
                        } else {
                            m5248p(request, null, new FacebookServiceException(new FacebookRequestError(string, i3, string2), string2));
                        }
                    } else if (string == null) {
                        m5248p(request, null, new FacebookServiceException(new FacebookRequestError(string, i3, string2), string2));
                    } else {
                        m5248p(request, null, new FacebookServiceException(new FacebookRequestError(string, i3, string2), string2));
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: j */
    public final void mo5200j(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f11416e);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final int mo5201k(LoginClient.Request request) {
        request.getClass();
        LoginTargetApp loginTargetApp = request.f11457I;
        LoginClient loginClientM5240d = m5240d();
        if (this.f11417f.length() == 0) {
            return 0;
        }
        Bundle bundleM5247m = m5247m(request);
        mo5202l(bundleM5247m, request);
        if (f11414i) {
            bundleM5247m.putString("cct_over_app_switch", "1");
        }
        if (sy2.f61598n) {
            if (loginTargetApp == LoginTargetApp.INSTAGRAM) {
                C3156jq c3156jq = nx1.f53354b;
                cad.m4483b(bna.m3956j(AbstractC3695vr.m23504o(), "oauth/authorize", bundleM5247m));
            } else {
                C3156jq c3156jq2 = nx1.f53354b;
                cad.m4483b(bna.m3956j(AbstractC3695vr.m23503n(), sy2.m21769d() + "/dialog/oauth", bundleM5247m));
            }
        }
        id3 id3VarM5221e = loginClientM5240d.m5221e();
        if (id3VarM5221e == null) {
            return 0;
        }
        Intent intent = new Intent(id3VarM5221e, (Class<?>) CustomTabMainActivity.class);
        int i = CustomTabMainActivity.f11347c;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", bundleM5247m);
        String strM18555a = this.f11415d;
        if (strM18555a == null) {
            strM18555a = ox1.m18555a();
            this.f11415d = strM18555a;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", strM18555a);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", loginTargetApp.toString());
        C0935i c0935i = loginClientM5240d.f11446c;
        if (c0935i != null) {
            c0935i.m2101b0(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: l */
    public final void mo5202l(Bundle bundle, LoginClient.Request request) {
        request.getClass();
        String str = request.f11469f;
        super.mo5202l(bundle, request);
        String strConcat = request.f11468e;
        if (strConcat == null || strConcat.length() == 0) {
            strConcat = (str == null || str.length() == 0) ? this.f11417f : "intent://".concat(str);
        }
        bundle.putString("redirect_uri", strConcat);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: n */
    public final String mo5203n() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: o */
    public final AccessTokenSource mo5204o() {
        return this.f11419h;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11416e);
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11418g = "custom_tab";
        this.f11419h = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.f11416e = parcel.readString();
        this.f11417f = ox1.m18558d(super.mo5198f());
    }
}
