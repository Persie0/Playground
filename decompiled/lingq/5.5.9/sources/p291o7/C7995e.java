package p291o7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5056a0;
import p067d8.C5086z;
import p498y3.C10289a;

/* JADX INFO: renamed from: o7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7995e {

    /* JADX INFO: renamed from: f */
    public static final a f43517f = new a();

    /* JADX INFO: renamed from: g */
    public static C7995e f43518g;

    /* JADX INFO: renamed from: a */
    public final C10289a f43519a;

    /* JADX INFO: renamed from: b */
    public final C7988a f43520b;

    /* JADX INFO: renamed from: c */
    public AccessToken f43521c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f43522d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public Date f43523e = new Date(0);

    /* JADX INFO: renamed from: o7.e$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public final C7995e m15863a() {
            C7995e c7995e;
            C7995e c7995e2 = C7995e.f43518g;
            if (c7995e2 != null) {
                return c7995e2;
            }
            synchronized (this) {
                c7995e = C7995e.f43518g;
                if (c7995e == null) {
                    C10289a c10289aM19281a = C10289a.m19281a(C8004n.m15871a());
                    C5207g.m11110e(c10289aM19281a, "getInstance(applicationContext)");
                    C7995e c7995e3 = new C7995e(c10289aM19281a, new C7988a());
                    C7995e.f43518g = c7995e3;
                    c7995e = c7995e3;
                }
            }
            return c7995e;
        }
    }

    /* JADX INFO: renamed from: o7.e$b */
    public static final class b implements e {
        @Override // p291o7.C7995e.e
        /* JADX INFO: renamed from: a */
        public final String mo15864a() {
            return "fb_extend_sso_token";
        }

        @Override // p291o7.C7995e.e
        /* JADX INFO: renamed from: b */
        public final String mo15865b() {
            return "oauth/access_token";
        }
    }

    /* JADX INFO: renamed from: o7.e$c */
    public static final class c implements e {
        @Override // p291o7.C7995e.e
        /* JADX INFO: renamed from: a */
        public final String mo15864a() {
            return "ig_refresh_token";
        }

        @Override // p291o7.C7995e.e
        /* JADX INFO: renamed from: b */
        public final String mo15865b() {
            return "refresh_access_token";
        }
    }

    /* JADX INFO: renamed from: o7.e$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public String f43524a;

        /* JADX INFO: renamed from: b */
        public int f43525b;

        /* JADX INFO: renamed from: c */
        public int f43526c;

        /* JADX INFO: renamed from: d */
        public Long f43527d;

        /* JADX INFO: renamed from: e */
        public String f43528e;
    }

    /* JADX INFO: renamed from: o7.e$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        String mo15864a();

        /* JADX INFO: renamed from: b */
        String mo15865b();
    }

    public C7995e(C10289a c10289a, C7988a c7988a) {
        this.f43519a = c10289a;
        this.f43520b = c7988a;
    }

    /* JADX INFO: renamed from: a */
    public final void m15860a() {
        final AccessToken accessToken = this.f43521c;
        if (accessToken == null) {
            return;
        }
        int i10 = 0;
        if (this.f43522d.compareAndSet(false, true)) {
            this.f43523e = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final d dVar = new d();
            GraphRequest[] graphRequestArr = new GraphRequest[2];
            GraphRequest.InterfaceC2278b interfaceC2278b = new GraphRequest.InterfaceC2278b() { // from class: o7.b
                @Override // com.facebook.GraphRequest.InterfaceC2278b
                /* JADX INFO: renamed from: a */
                public final void mo6614a(C8010t c8010t) {
                    JSONArray jSONArrayOptJSONArray;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    C5207g.m11111f(atomicBoolean2, "$permissionsCallSucceeded");
                    Set set = hashSet;
                    C5207g.m11111f(set, "$permissions");
                    Set set2 = hashSet2;
                    C5207g.m11111f(set2, "$declinedPermissions");
                    Set set3 = hashSet3;
                    C5207g.m11111f(set3, "$expiredPermissions");
                    JSONObject jSONObject = c8010t.f43589d;
                    if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                        atomicBoolean2.set(true);
                        int length = jSONArrayOptJSONArray.length();
                        if (length <= 0) {
                            return;
                        }
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("permission");
                                String strOptString2 = jSONObjectOptJSONObject.optString("status");
                                if (!C5086z.m10802A(strOptString) && !C5086z.m10802A(strOptString2)) {
                                    C5207g.m11110e(strOptString2, "status");
                                    Locale locale = Locale.US;
                                    C5207g.m11110e(locale, "US");
                                    String lowerCase = strOptString2.toLowerCase(locale);
                                    C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                                    int iHashCode = lowerCase.hashCode();
                                    if (iHashCode != -1309235419) {
                                        if (iHashCode != 280295099) {
                                            if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                                set2.add(strOptString);
                                            }
                                        } else if (lowerCase.equals("granted")) {
                                            set.add(strOptString);
                                        }
                                    } else if (lowerCase.equals("expired")) {
                                        set3.add(strOptString);
                                    }
                                    Log.w("AccessTokenManager", C5207g.m11116k(lowerCase, "Unexpected status: "));
                                }
                            }
                            if (i12 >= length) {
                                return;
                            } else {
                                i11 = i12;
                            }
                        }
                    }
                }
            };
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            String str = GraphRequest.f11448j;
            GraphRequest graphRequestM6621g = GraphRequest.C2279c.m6621g(accessToken, "me/permissions", interfaceC2278b);
            graphRequestM6621g.f11454d = bundle;
            HttpMethod httpMethod = HttpMethod.GET;
            graphRequestM6621g.m6613k(httpMethod);
            graphRequestArr[0] = graphRequestM6621g;
            C7992c c7992c = new C7992c(i10, dVar);
            String str2 = accessToken.f11381k;
            if (str2 == null) {
                str2 = "facebook";
            }
            e cVar = C5207g.m11106a(str2, "instagram") ? new c() : new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", cVar.mo15864a());
            bundle2.putString("client_id", accessToken.f11378h);
            bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestM6621g2 = GraphRequest.C2279c.m6621g(accessToken, cVar.mo15865b(), c7992c);
            graphRequestM6621g2.f11454d = bundle2;
            graphRequestM6621g2.m6613k(httpMethod);
            graphRequestArr[1] = graphRequestM6621g2;
            C8009s c8009s = new C8009s(graphRequestArr);
            C8009s.a aVar = new C8009s.a() { // from class: o7.d
                @Override // p291o7.C8009s.a
                /* JADX INFO: renamed from: a */
                public final void mo15859a(C8009s c8009s2) throws Throwable {
                    boolean z10;
                    C7995e.a aVar2;
                    AccessToken accessToken2 = accessToken;
                    C7995e.d dVar2 = dVar;
                    C5207g.m11111f(dVar2, "$refreshResult");
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    C5207g.m11111f(atomicBoolean2, "$permissionsCallSucceeded");
                    Set<String> set = hashSet;
                    C5207g.m11111f(set, "$permissions");
                    Set<String> set2 = hashSet2;
                    C5207g.m11111f(set2, "$declinedPermissions");
                    Set<String> set3 = hashSet3;
                    C5207g.m11111f(set3, "$expiredPermissions");
                    C7995e c7995e = this;
                    C5207g.m11111f(c7995e, "this$0");
                    AtomicBoolean atomicBoolean3 = c7995e.f43522d;
                    String str3 = dVar2.f43524a;
                    int i11 = dVar2.f43525b;
                    Long l10 = dVar2.f43527d;
                    String str4 = dVar2.f43528e;
                    try {
                        C7995e.a aVar3 = C7995e.f43517f;
                        if (aVar3.m15863a().f43521c != null) {
                            AccessToken accessToken3 = aVar3.m15863a().f43521c;
                            if ((accessToken3 == null ? null : accessToken3.f11379i) == accessToken2.f11379i) {
                                if (!atomicBoolean2.get() && str3 == null && i11 == 0) {
                                    atomicBoolean3.set(false);
                                    return;
                                }
                                Date date = accessToken2.f11371a;
                                try {
                                    if (dVar2.f43525b != 0) {
                                        aVar2 = aVar3;
                                        date = new Date(((long) dVar2.f43525b) * 1000);
                                    } else {
                                        aVar2 = aVar3;
                                        if (dVar2.f43526c != 0) {
                                            date = new Date((((long) dVar2.f43526c) * 1000) + new Date().getTime());
                                        }
                                    }
                                    Date date2 = date;
                                    if (str3 == null) {
                                        str3 = accessToken2.f11375e;
                                    }
                                    String str5 = str3;
                                    String str6 = accessToken2.f11378h;
                                    String str7 = accessToken2.f11379i;
                                    if (!atomicBoolean2.get()) {
                                        set = accessToken2.f11372b;
                                    }
                                    Set<String> set4 = set;
                                    if (!atomicBoolean2.get()) {
                                        set2 = accessToken2.f11373c;
                                    }
                                    Set<String> set5 = set2;
                                    if (!atomicBoolean2.get()) {
                                        set3 = accessToken2.f11374d;
                                    }
                                    Set<String> set6 = set3;
                                    AccessTokenSource accessTokenSource = accessToken2.f11376f;
                                    Date date3 = new Date();
                                    Date date4 = l10 != null ? new Date(l10.longValue() * 1000) : accessToken2.f11380j;
                                    if (str4 == null) {
                                        str4 = accessToken2.f11381k;
                                    }
                                    aVar2.m15863a().m15862c(new AccessToken(str5, str6, str7, set4, set5, set6, accessTokenSource, date2, date3, date4, str4), true);
                                } catch (Throwable th2) {
                                    th = th2;
                                    z10 = false;
                                }
                                atomicBoolean3.set(z10);
                                throw th;
                            }
                        }
                        atomicBoolean3.set(false);
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = false;
                    }
                }
            };
            ArrayList arrayList = c8009s.f43584d;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            C5056a0.m10745c(c8009s);
            new AsyncTaskC8008r(c8009s).executeOnExecutor(C8004n.m15873c(), new Void[0]);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15861b(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C8004n.m15871a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f43519a.m19283c(intent);
    }

    /* JADX INFO: renamed from: c */
    public final void m15862c(AccessToken accessToken, boolean z10) {
        AccessToken accessToken2 = this.f43521c;
        this.f43521c = accessToken;
        this.f43522d.set(false);
        this.f43523e = new Date(0L);
        if (z10) {
            C7988a c7988a = this.f43520b;
            if (accessToken != null) {
                c7988a.getClass();
                try {
                    c7988a.f43482a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m6593a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                c7988a.f43482a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                C8004n c8004n = C8004n.f43550a;
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10819d(C8004n.m15871a());
            }
        }
        if (!C5086z.m10816a(accessToken2, accessToken)) {
            m15861b(accessToken2, accessToken);
            Context contextM15871a = C8004n.m15871a();
            Date date = AccessToken.f11370l;
            AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
            AlarmManager alarmManager = (AlarmManager) contextM15871a.getSystemService("alarm");
            if (AccessToken.C2262b.m6596c()) {
                if ((accessTokenM6595b == null ? null : accessTokenM6595b.f11371a) != null) {
                    if (alarmManager == null) {
                        return;
                    }
                    Intent intent = new Intent(contextM15871a, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    try {
                        alarmManager.set(1, accessTokenM6595b.f11371a.getTime(), PendingIntent.getBroadcast(contextM15871a, 0, intent, 67108864));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
