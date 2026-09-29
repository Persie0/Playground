package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import p000.C3440oy;
import p000.bna;
import p000.cl9;
import p000.eda;
import p000.fa4;
import p000.gna;
import p000.hfb;
import p000.id3;
import p000.lp1;
import p000.sy2;
import p000.web;
import p000.x74;

/* JADX INFO: loaded from: classes2.dex */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new hfb(16);

    /* JADX INFO: renamed from: a */
    public LoginMethodHandler[] f11444a;

    /* JADX INFO: renamed from: b */
    public int f11445b;

    /* JADX INFO: renamed from: c */
    public C0935i f11446c;

    /* JADX INFO: renamed from: d */
    public C3440oy f11447d;

    /* JADX INFO: renamed from: e */
    public web f11448e;

    /* JADX INFO: renamed from: f */
    public boolean f11449f;

    /* JADX INFO: renamed from: g */
    public Request f11450g;

    /* JADX INFO: renamed from: h */
    public Map f11451h;

    /* JADX INFO: renamed from: i */
    public LinkedHashMap f11452i;

    /* JADX INFO: renamed from: j */
    public C0936j f11453j;

    /* JADX INFO: renamed from: k */
    public int f11454k;

    /* JADX INFO: renamed from: l */
    public int f11455l;

    /* JADX INFO: renamed from: a */
    public final void m5217a(String str, String str2, boolean z) {
        Map map = this.f11451h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f11451h == null) {
            this.f11451h = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5218b() {
        if (this.f11449f) {
            return true;
        }
        id3 id3VarM5221e = m5221e();
        if ((id3VarM5221e != null ? id3VarM5221e.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f11449f = true;
            return true;
        }
        id3 id3VarM5221e2 = m5221e();
        String string = id3VarM5221e2 != null ? id3VarM5221e2.getString(com.facebook.common.R$string.com_facebook_internet_permission_error_title) : null;
        String string2 = id3VarM5221e2 != null ? id3VarM5221e2.getString(com.facebook.common.R$string.com_facebook_internet_permission_error_message) : null;
        Request request = this.f11450g;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        m5219c(new Result(request, Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m5219c(Result result) {
        LoginClient loginClient;
        result.getClass();
        Result.Code code = result.f11476a;
        LoginMethodHandler loginMethodHandlerM5222f = m5222f();
        if (loginMethodHandlerM5222f != null) {
            loginClient = this;
            loginClient.m5224h(loginMethodHandlerM5222f.mo5197e(), code.getLoggingValue(), result.f11479d, result.f11480e, loginMethodHandlerM5222f.f11486a);
        } else {
            loginClient = this;
        }
        Map map = loginClient.f11451h;
        if (map != null) {
            result.f11482g = map;
        }
        LinkedHashMap linkedHashMap = loginClient.f11452i;
        if (linkedHashMap != null) {
            result.f11483h = linkedHashMap;
        }
        loginClient.f11444a = null;
        loginClient.f11445b = -1;
        loginClient.f11450g = null;
        loginClient.f11451h = null;
        loginClient.f11454k = 0;
        loginClient.f11455l = 0;
        C3440oy c3440oy = loginClient.f11447d;
        if (c3440oy != null) {
            C0935i c0935i = (C0935i) c3440oy.f55160b;
            c0935i.f11508x0 = null;
            int i = code == Result.Code.CANCEL ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            id3 id3VarM2105g = c0935i.m2105g();
            if (!c0935i.m2115q() || id3VarM2105g == null) {
                return;
            }
            id3VarM2105g.setResult(i, intent);
            id3VarM2105g.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:8:0x0017, B:10:0x0021, B:14:0x004d, B:13:0x0034), top: B:23:0x0017 }] */
    /* JADX INFO: renamed from: d */
    public final void m5220d(Result result) {
        Result result2;
        result.getClass();
        AccessToken accessToken = result.f11477b;
        if (accessToken != null) {
            Date date = AccessToken.f11306l;
            if (x74.m24366w()) {
                AccessToken accessTokenM24363t = x74.m24363t();
                if (accessTokenM24363t != null) {
                    try {
                        if (fa4.m11650l(accessTokenM24363t.f11315i, accessToken.f11315i)) {
                            result2 = new Result(this.f11450g, Result.Code.SUCCESS, result.f11477b, result.f11478c, null, null);
                        } else {
                            Request request = this.f11450g;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("User logged in as different Facebook user.");
                            result2 = new Result(request, Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null);
                        }
                    } catch (Exception e) {
                        Request request2 = this.f11450g;
                        String message = e.getMessage();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("Caught exception");
                        if (message != null) {
                            arrayList2.add(message);
                        }
                        m5219c(new Result(request2, Result.Code.ERROR, null, TextUtils.join(": ", arrayList2), null));
                        return;
                    }
                } else {
                    Request request3 = this.f11450g;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("User logged in as different Facebook user.");
                    result2 = new Result(request3, Result.Code.ERROR, null, TextUtils.join(": ", arrayList3), null);
                }
                m5219c(result2);
                return;
            }
        }
        m5219c(result);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final id3 m5221e() {
        C0935i c0935i = this.f11446c;
        if (c0935i != null) {
            return c0935i.m2105g();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final LoginMethodHandler m5222f() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.f11445b;
        if (i < 0 || (loginMethodHandlerArr = this.f11444a) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    /* JADX INFO: renamed from: g */
    public final C0936j m5223g() {
        Context contextM5221e;
        Request request;
        String strM21767b;
        String str;
        C0936j c0936j = this.f11453j;
        if (c0936j != null) {
            if (lp1.f49971a.contains(c0936j)) {
                str = null;
            } else {
                try {
                    str = c0936j.f11512a;
                } catch (Throwable th) {
                    lp1.m16420a(c0936j, th);
                    str = null;
                }
            }
            Request request2 = this.f11450g;
            if (!fa4.m11650l(str, request2 != null ? request2.f11467d : null)) {
                contextM5221e = m5221e();
                if (contextM5221e == null) {
                    contextM5221e = sy2.m21766a();
                }
                request = this.f11450g;
                if (request != null || (strM21767b = request.f11467d) == null) {
                    strM21767b = sy2.m21767b();
                }
                c0936j = new C0936j(contextM5221e, strM21767b);
                this.f11453j = c0936j;
            }
        } else {
            contextM5221e = m5221e();
            if (contextM5221e == null) {
                contextM5221e = sy2.m21766a();
            }
            request = this.f11450g;
            if (request != null) {
                strM21767b = sy2.m21767b();
            } else {
                strM21767b = sy2.m21767b();
            }
            c0936j = new C0936j(contextM5221e, strM21767b);
            this.f11453j = c0936j;
        }
        return c0936j;
    }

    /* JADX INFO: renamed from: h */
    public final void m5224h(String str, String str2, String str3, String str4, Map map) {
        Request request = this.f11450g;
        if (request == null) {
            m5223g().m5253c("fb_mobile_login_method_complete", str);
            return;
        }
        C0936j c0936jM5223g = m5223g();
        String str5 = request.f11470g;
        String str6 = request.f11458J ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (lp1.f49971a.contains(c0936jM5223g)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = C0936j.f11511d;
            Bundle bundleM12764a = gna.m12764a(str5);
            if (str2 != null) {
                bundleM12764a.putString("2_result", str2);
            }
            if (str3 != null) {
                bundleM12764a.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleM12764a.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleM12764a.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleM12764a.putString("3_method", str);
            c0936jM5223g.f11513b.m16645i(str6, bundleM12764a);
        } catch (Throwable th) {
            lp1.m16420a(c0936jM5223g, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5225i(int i, int i2, Intent intent) {
        this.f11454k++;
        if (this.f11450g != null) {
            if (intent != null) {
                int i3 = CustomTabMainActivity.f11347c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    m5226j();
                    return;
                }
            }
            LoginMethodHandler loginMethodHandlerM5222f = m5222f();
            if (loginMethodHandlerM5222f != null) {
                if ((loginMethodHandlerM5222f instanceof KatanaProxyLoginMethodHandler) && intent == null && this.f11454k < this.f11455l) {
                    return;
                }
                loginMethodHandlerM5222f.mo5199h(i, i2, intent);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5226j() {
        LoginClient loginClient;
        LoginMethodHandler loginMethodHandlerM5222f = m5222f();
        if (loginMethodHandlerM5222f != null) {
            loginClient = this;
            loginClient.m5224h(loginMethodHandlerM5222f.mo5197e(), "skipped", null, null, loginMethodHandlerM5222f.f11486a);
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.f11444a;
        while (loginMethodHandlerArr != null) {
            int i = loginClient.f11445b;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.f11445b = i + 1;
            LoginMethodHandler loginMethodHandlerM5222f2 = loginClient.m5222f();
            if (loginMethodHandlerM5222f2 != null) {
                if (!(loginMethodHandlerM5222f2 instanceof WebViewLoginMethodHandler) || loginClient.m5218b()) {
                    Request request = loginClient.f11450g;
                    if (request == null) {
                        continue;
                    } else {
                        int iMo5201k = loginMethodHandlerM5222f2.mo5201k(request);
                        loginClient.f11454k = 0;
                        if (iMo5201k > 0) {
                            C0936j c0936jM5223g = loginClient.m5223g();
                            String str = request.f11470g;
                            String strMo5197e = loginMethodHandlerM5222f2.mo5197e();
                            String str2 = request.f11458J ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!lp1.f49971a.contains(c0936jM5223g)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = C0936j.f11511d;
                                    Bundle bundleM12764a = gna.m12764a(str);
                                    bundleM12764a.putString("3_method", strMo5197e);
                                    c0936jM5223g.f11513b.m16645i(str2, bundleM12764a);
                                } catch (Throwable th) {
                                    lp1.m16420a(c0936jM5223g, th);
                                }
                            }
                            loginClient.f11455l = iMo5201k;
                        } else {
                            C0936j c0936jM5223g2 = loginClient.m5223g();
                            String str3 = request.f11470g;
                            String strMo5197e2 = loginMethodHandlerM5222f2.mo5197e();
                            String str4 = request.f11458J ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!lp1.f49971a.contains(c0936jM5223g2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = C0936j.f11511d;
                                    Bundle bundleM12764a2 = gna.m12764a(str3);
                                    bundleM12764a2.putString("3_method", strMo5197e2);
                                    c0936jM5223g2.f11513b.m16645i(str4, bundleM12764a2);
                                } catch (Throwable th2) {
                                    lp1.m16420a(c0936jM5223g2, th2);
                                }
                            }
                            loginClient.m5217a("not_tried", loginMethodHandlerM5222f2.mo5197e(), true);
                        }
                        if (iMo5201k > 0) {
                            return;
                        }
                    }
                } else {
                    loginClient.m5217a("no_internet_permission", "1", false);
                }
            }
        }
        Request request2 = loginClient.f11450g;
        if (request2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            loginClient.m5219c(new Result(request2, Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelableArray(this.f11444a, i);
        parcel.writeInt(this.f11445b);
        parcel.writeParcelable(this.f11450g, i);
        bna.m3914C0(parcel, this.f11451h);
        bna.m3914C0(parcel, this.f11452i);
    }

    public static final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C0933g();

        /* JADX INFO: renamed from: a */
        public final Code f11476a;

        /* JADX INFO: renamed from: b */
        public final AccessToken f11477b;

        /* JADX INFO: renamed from: c */
        public final AuthenticationToken f11478c;

        /* JADX INFO: renamed from: d */
        public final String f11479d;

        /* JADX INFO: renamed from: e */
        public final String f11480e;

        /* JADX INFO: renamed from: f */
        public final Request f11481f;

        /* JADX INFO: renamed from: g */
        public Map f11482g;

        /* JADX INFO: renamed from: h */
        public HashMap f11483h;

        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.f11476a = Code.valueOf(string == null ? "error" : string);
            this.f11477b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f11478c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f11479d = parcel.readString();
            this.f11480e = parcel.readString();
            this.f11481f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f11482g = bna.m3968p0(parcel);
            this.f11483h = bna.m3968p0(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f11476a.name());
            parcel.writeParcelable(this.f11477b, i);
            parcel.writeParcelable(this.f11478c, i);
            parcel.writeString(this.f11479d);
            parcel.writeString(this.f11480e);
            parcel.writeParcelable(this.f11481f, i);
            bna.m3914C0(parcel, this.f11482g);
            bna.m3914C0(parcel, this.f11483h);
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            code.getClass();
            this.f11481f = request;
            this.f11477b = accessToken;
            this.f11478c = authenticationToken;
            this.f11479d = str;
            this.f11476a = code;
            this.f11480e = str2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            code.getClass();
        }
    }

    public static final class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C0932f();

        /* JADX INFO: renamed from: H */
        public boolean f11456H;

        /* JADX INFO: renamed from: I */
        public final LoginTargetApp f11457I;

        /* JADX INFO: renamed from: J */
        public boolean f11458J;

        /* JADX INFO: renamed from: K */
        public boolean f11459K;

        /* JADX INFO: renamed from: L */
        public final String f11460L;

        /* JADX INFO: renamed from: M */
        public final String f11461M;

        /* JADX INFO: renamed from: N */
        public final String f11462N;

        /* JADX INFO: renamed from: O */
        public final CodeChallengeMethod f11463O;

        /* JADX INFO: renamed from: a */
        public final LoginBehavior f11464a;

        /* JADX INFO: renamed from: b */
        public Set f11465b;

        /* JADX INFO: renamed from: c */
        public final DefaultAudience f11466c;

        /* JADX INFO: renamed from: d */
        public final String f11467d;

        /* JADX INFO: renamed from: e */
        public final String f11468e;

        /* JADX INFO: renamed from: f */
        public final String f11469f;

        /* JADX INFO: renamed from: g */
        public final String f11470g;

        /* JADX INFO: renamed from: h */
        public boolean f11471h;

        /* JADX INFO: renamed from: i */
        public final String f11472i;

        /* JADX INFO: renamed from: j */
        public final String f11473j;

        /* JADX INFO: renamed from: k */
        public final String f11474k;

        /* JADX INFO: renamed from: l */
        public String f11475l;

        public Request(Parcel parcel) {
            String string = parcel.readString();
            eda.m11073f(string, "loginBehavior");
            this.f11464a = LoginBehavior.valueOf(string);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f11465b = new HashSet(arrayList);
            String string2 = parcel.readString();
            this.f11466c = string2 != null ? DefaultAudience.valueOf(string2) : DefaultAudience.NONE;
            String string3 = parcel.readString();
            eda.m11073f(string3, "applicationId");
            this.f11467d = string3;
            this.f11468e = parcel.readString();
            this.f11469f = parcel.readString();
            String string4 = parcel.readString();
            eda.m11073f(string4, "authId");
            this.f11470g = string4;
            this.f11471h = parcel.readByte() != 0;
            this.f11472i = parcel.readString();
            String string5 = parcel.readString();
            eda.m11073f(string5, "authType");
            this.f11473j = string5;
            this.f11474k = parcel.readString();
            this.f11475l = parcel.readString();
            this.f11456H = parcel.readByte() != 0;
            String string6 = parcel.readString();
            this.f11457I = string6 != null ? LoginTargetApp.valueOf(string6) : LoginTargetApp.FACEBOOK;
            this.f11458J = parcel.readByte() != 0;
            this.f11459K = parcel.readByte() != 0;
            String string7 = parcel.readString();
            eda.m11073f(string7, "nonce");
            this.f11460L = string7;
            this.f11461M = parcel.readString();
            this.f11462N = parcel.readString();
            String string8 = parcel.readString();
            this.f11463O = string8 != null ? CodeChallengeMethod.valueOf(string8) : null;
        }

        /* JADX INFO: renamed from: a */
        public final String m5227a() {
            return this.f11470g;
        }

        /* JADX INFO: renamed from: b */
        public final LoginBehavior m5228b() {
            return this.f11464a;
        }

        /* JADX INFO: renamed from: c */
        public final Set m5229c() {
            return this.f11465b;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m5230d() {
            for (String str : this.f11465b) {
                C0937k c0937k = C0939m.f11517f;
                if (str != null && (cl9.m4842Y(str, "publish", false) || cl9.m4842Y(str, "manage", false) || C0939m.f11518g.contains(str))) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m5231e() {
            return this.f11458J;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m5232f() {
            return this.f11471h;
        }

        /* JADX INFO: renamed from: g */
        public final void m5233g() {
            this.f11458J = false;
        }

        /* JADX INFO: renamed from: h */
        public final void m5234h() {
            this.f11475l = null;
        }

        /* JADX INFO: renamed from: i */
        public final void m5235i(boolean z) {
            this.f11471h = z;
        }

        /* JADX INFO: renamed from: j */
        public final void m5236j() {
            this.f11456H = false;
        }

        /* JADX INFO: renamed from: k */
        public final void m5237k() {
            this.f11459K = false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f11464a.name());
            parcel.writeStringList(new ArrayList(this.f11465b));
            parcel.writeString(this.f11466c.name());
            parcel.writeString(this.f11467d);
            parcel.writeString(this.f11468e);
            parcel.writeString(this.f11469f);
            parcel.writeString(this.f11470g);
            parcel.writeByte(this.f11471h ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11472i);
            parcel.writeString(this.f11473j);
            parcel.writeString(this.f11474k);
            parcel.writeString(this.f11475l);
            parcel.writeByte(this.f11456H ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11457I.name());
            parcel.writeByte(this.f11458J ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11459K ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11460L);
            parcel.writeString(this.f11461M);
            parcel.writeString(this.f11462N);
            CodeChallengeMethod codeChallengeMethod = this.f11463O;
            parcel.writeString(codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        }

        public Request(LoginBehavior loginBehavior, Set set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod, String str7, String str8) {
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            this.f11464a = loginBehavior;
            this.f11465b = set;
            this.f11466c = defaultAudience;
            this.f11473j = str;
            this.f11467d = str2;
            this.f11468e = str7;
            this.f11469f = str8;
            this.f11470g = str3;
            this.f11457I = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str4 != null && str4.length() != 0) {
                this.f11460L = str4;
            } else {
                String string = UUID.randomUUID().toString();
                string.getClass();
                this.f11460L = string;
            }
            this.f11461M = str5;
            this.f11462N = str6;
            this.f11463O = codeChallengeMethod;
        }
    }
}
