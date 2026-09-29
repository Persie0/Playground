package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.CallbackManagerImpl$RequestCodeOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.hfb;
import p000.lp1;
import p000.ox1;
import p000.r76;
import p000.s76;
import p000.sy2;

/* JADX INFO: loaded from: classes2.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new hfb(15);

    /* JADX INFO: renamed from: d */
    public final String f11443d;

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11443d = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String mo5197e() {
        return this.f11443d;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final int mo5201k(LoginClient.Request request) {
        request.getClass();
        boolean z = sy2.f61599o && ox1.m18555a() != null && request.f11464a.allowsCustomTabAuth();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            sy2 sy2Var = sy2.f61585a;
        }
        String string = jSONObject.toString();
        string.getClass();
        m5240d();
        String str = request.f11467d;
        Set set = request.f11465b;
        boolean zM5230d = request.m5230d();
        DefaultAudience defaultAudience = request.f11466c;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience2 = defaultAudience;
        String strM5239c = m5239c(request.f11470g);
        String str2 = request.f11473j;
        String str3 = request.f11475l;
        boolean z2 = request.f11456H;
        boolean z3 = request.f11458J;
        boolean z4 = request.f11459K;
        String str4 = request.f11460L;
        CodeChallengeMethod codeChallengeMethod = request.f11463O;
        if (codeChallengeMethod != null) {
            codeChallengeMethod.name();
        }
        String str5 = request.f11468e;
        String str6 = request.f11469f;
        s76 s76Var = s76.f60467a;
        ArrayList<Intent> arrayList = null;
        if (!lp1.f49971a.contains(s76.class)) {
            try {
                str.getClass();
                set.getClass();
                defaultAudience2.getClass();
                str2.getClass();
                ArrayList arrayList2 = s76.f60468b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    boolean z5 = z3;
                    String str7 = str4;
                    String str8 = str5;
                    boolean z6 = z4;
                    boolean z7 = z2;
                    Intent intentM21144c = s76.f60467a.m21144c((r76) it.next(), str, set, string, zM5230d, defaultAudience2, strM5239c, str2, z, str3, z7, LoginTargetApp.FACEBOOK, z5, z6, str7, str8, str6);
                    if (intentM21144c != null) {
                        arrayList3.add(intentM21144c);
                    }
                    z2 = z7;
                    z3 = z5;
                    z4 = z6;
                    str4 = str7;
                    str5 = str8;
                }
                arrayList = arrayList3;
            } catch (Throwable th) {
                lp1.m16420a(s76.class, th);
            }
        }
        m5238a("e2e", string);
        int i = 0;
        for (Intent intent : arrayList) {
            i++;
            CallbackManagerImpl$RequestCodeOffset.Login.toRequestCode();
            if (m5246p(intent)) {
                return i;
            }
        }
        return 0;
    }

    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11443d = "katana_proxy_auth";
    }
}
