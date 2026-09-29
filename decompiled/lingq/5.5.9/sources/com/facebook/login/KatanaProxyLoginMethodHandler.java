package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.CallbackManagerImpl;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5063e;
import p067d8.C5079s;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C2319a();

    /* JADX INFO: renamed from: d */
    public final String f11600d;

    /* JADX INFO: renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    public static final class C2319a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final KatanaProxyLoginMethodHandler[] newArray(int i10) {
            return new KatanaProxyLoginMethodHandler[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "source");
        this.f11600d = "katana_proxy_auth";
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11600d = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String getF11598d() {
        return this.f11600d;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:39:0x0102->B:55:?, LOOP_END, SYNTHETIC] */
    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: q */
    public final int mo6685q(LoginClient.Request request) {
        Class<C5079s> cls;
        String str;
        ArrayList<Intent> arrayList;
        int i10;
        boolean z10 = C8004n.f43565p && C5063e.m10752a() != null && request.f11619a.allowsCustomTabAuth();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        C5207g.m11110e(string, "e2e.toString()");
        C5079s c5079s = C5079s.f32992a;
        m6717d().m6706e();
        String str2 = request.f11622d;
        Set<String> set = request.f11620b;
        boolean zM6712a = request.m6712a();
        DefaultAudience defaultAudience = request.f11621c;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience2 = defaultAudience;
        String strM6716c = m6716c(request.f11623e);
        String str3 = request.f11626h;
        String str4 = request.f11628j;
        boolean z11 = request.f11629k;
        boolean z12 = request.f11613H;
        boolean z13 = request.f11614I;
        String str5 = request.f11615J;
        CodeChallengeMethod codeChallengeMethod = request.f11618M;
        if (codeChallengeMethod != null) {
            codeChallengeMethod.name();
        }
        Class<C5079s> cls2 = C5079s.class;
        if (!C6205a.m12742b(cls2)) {
            try {
                C5207g.m11111f(str2, "applicationId");
                C5207g.m11111f(set, "permissions");
                C5207g.m11111f(defaultAudience2, "defaultAudience");
                C5207g.m11111f(str3, "authType");
                ArrayList arrayList2 = C5079s.f32994c;
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    cls = cls2;
                    String str6 = str5;
                    boolean z14 = z13;
                    String str7 = str2;
                    boolean z15 = z12;
                    boolean z16 = z11;
                    String str8 = str4;
                    String str9 = str3;
                    DefaultAudience defaultAudience3 = defaultAudience2;
                    Set<String> set2 = set;
                    String str10 = str2;
                    boolean z17 = z10;
                    boolean z18 = z10;
                    str = string;
                    try {
                        Intent intentM10791c = C5079s.f32992a.m10791c((C5079s.e) it.next(), str7, set, string, zM6712a, defaultAudience2, strM6716c, str9, z17, str8, z16, LoginTargetApp.FACEBOOK, z15, z14, str6);
                        if (intentM10791c != null) {
                            arrayList.add(intentM10791c);
                        }
                        string = str;
                        cls2 = cls;
                        str5 = str6;
                        z13 = z14;
                        z12 = z15;
                        z11 = z16;
                        str4 = str8;
                        str3 = str9;
                        defaultAudience2 = defaultAudience3;
                        set = set2;
                        str2 = str10;
                        z10 = z18;
                    } catch (Throwable th2) {
                        th = th2;
                        C6205a.m12741a(cls, th);
                        arrayList = null;
                        m6715a(str, "e2e");
                        i10 = 0;
                        for (Intent intent : arrayList) {
                            i10++;
                            CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
                            if (m6723A(intent)) {
                                return i10;
                            }
                        }
                        return 0;
                    }
                }
                str = string;
            } catch (Throwable th3) {
                th = th3;
                cls = cls2;
                str = string;
            }
            m6715a(str, "e2e");
            i10 = 0;
            while (r0.hasNext()) {
                i10++;
                CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
                if (m6723A(intent)) {
                    return i10;
                }
            }
            return 0;
        }
        str = string;
        arrayList = null;
        m6715a(str, "e2e");
        i10 = 0;
        while (r0.hasNext()) {
            i10++;
            CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            if (m6723A(intent)) {
                return i10;
            }
        }
        return 0;
    }
}
