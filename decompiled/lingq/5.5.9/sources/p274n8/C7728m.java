package p274n8;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.CodeChallengeMethod;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginTargetApp;
import dm.C5207g;
import dm.C5212l;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C6752c;
import org.json.JSONException;
import org.json.JSONObject;
import p035c.AbstractC1641a;
import p067d8.C5056a0;
import p067d8.C5063e;
import p067d8.C5086z;
import p081e0.C5298b1;
import p173i8.C6205a;
import p260m8.C7499b;
import p266n.C7664a;
import p266n.C7666c;
import p286o2.RunnableC7907g;
import p291o7.C7995e;
import p291o7.C8004n;
import p291o7.C8012v;
import p291o7.InterfaceC7998h;
import p291o7.InterfaceC8000j;
import sl.C9072e;

/* JADX INFO: renamed from: n8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7728m {

    /* JADX INFO: renamed from: j */
    public static final b f42275j = new b();

    /* JADX INFO: renamed from: k */
    public static final Set<String> f42276k = C7499b.m14973x0("ads_management", "create_event", "rsvp_event");

    /* JADX INFO: renamed from: l */
    public static volatile C7728m f42277l;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f42280c;

    /* JADX INFO: renamed from: e */
    public String f42282e;

    /* JADX INFO: renamed from: f */
    public boolean f42283f;

    /* JADX INFO: renamed from: h */
    public boolean f42285h;

    /* JADX INFO: renamed from: i */
    public boolean f42286i;

    /* JADX INFO: renamed from: a */
    public LoginBehavior f42278a = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b */
    public DefaultAudience f42279b = DefaultAudience.FRIENDS;

    /* JADX INFO: renamed from: d */
    public String f42281d = "rerequest";

    /* JADX INFO: renamed from: g */
    public LoginTargetApp f42284g = LoginTargetApp.FACEBOOK;

    /* JADX INFO: renamed from: n8.m$a */
    public static final class a implements InterfaceC7732q {

        /* JADX INFO: renamed from: a */
        public final Activity f42287a;

        public a(Activity activity) {
            this.f42287a = activity;
        }

        @Override // p274n8.InterfaceC7732q
        /* JADX INFO: renamed from: a */
        public final Activity mo15320a() {
            return this.f42287a;
        }

        @Override // p274n8.InterfaceC7732q
        public final void startActivityForResult(Intent intent, int i10) {
            this.f42287a.startActivityForResult(intent, i10);
        }
    }

    /* JADX INFO: renamed from: n8.m$b */
    public static final class b {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C7728m m15321a() {
            if (C7728m.f42277l == null) {
                synchronized (this) {
                    try {
                        C7728m.f42277l = new C7728m();
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            C7728m c7728m = C7728m.f42277l;
            if (c7728m != null) {
                return c7728m;
            }
            C5207g.m11117l("instance");
            throw null;
        }
    }

    /* JADX INFO: renamed from: n8.m$c */
    public final class c extends AbstractC1641a<Collection<? extends String>, InterfaceC7998h.a> {

        /* JADX INFO: renamed from: a */
        public InterfaceC7998h f42288a;

        /* JADX INFO: renamed from: b */
        public final String f42289b;

        public c(InterfaceC7998h interfaceC7998h, String str) {
            this.f42288a = interfaceC7998h;
            this.f42289b = str;
        }

        @Override // p035c.AbstractC1641a
        /* JADX INFO: renamed from: a */
        public final Intent mo3677a(ComponentActivity componentActivity, Object obj) {
            Collection collection = (Collection) obj;
            C5207g.m11111f(componentActivity, "context");
            C5207g.m11111f(collection, "permissions");
            C7723h c7723h = new C7723h(collection);
            C7728m c7728m = C7728m.this;
            LoginClient.Request requestM15315a = c7728m.m15315a(c7723h);
            String str = this.f42289b;
            if (str != null) {
                requestM15315a.f11623e = str;
            }
            C7728m.m15314f(componentActivity, requestM15315a);
            Intent intentM15312b = C7728m.m15312b(requestM15315a);
            if (C8004n.m15871a().getPackageManager().resolveActivity(intentM15312b, 0) != null) {
                return intentM15312b;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginClient.Result.Code code = LoginClient.Result.Code.ERROR;
            c7728m.getClass();
            C7728m.m15313c(componentActivity, code, null, facebookException, false, requestM15315a);
            throw facebookException;
        }

        @Override // p035c.AbstractC1641a
        /* JADX INFO: renamed from: c */
        public final Object mo3678c(Intent intent, int i10) {
            b bVar = C7728m.f42275j;
            C7728m.this.m15318g(i10, intent, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            InterfaceC7998h interfaceC7998h = this.f42288a;
            if (interfaceC7998h != null) {
                interfaceC7998h.mo6662a(requestCode, i10, intent);
            }
            return new InterfaceC7998h.a(requestCode, i10, intent);
        }
    }

    /* JADX INFO: renamed from: n8.m$d */
    public static final class d implements InterfaceC7732q {

        /* JADX INFO: renamed from: a */
        public final C5298b1 f42291a;

        /* JADX INFO: renamed from: b */
        public final Activity f42292b;

        public d(C5298b1 c5298b1) {
            Activity activity;
            this.f42291a = c5298b1;
            Fragment fragment = (Fragment) c5298b1.f33572a;
            if (fragment != null) {
                activity = fragment.m3582e();
            } else {
                android.app.Fragment fragment2 = (android.app.Fragment) c5298b1.f33573b;
                activity = fragment2 == null ? null : fragment2.getActivity();
            }
            this.f42292b = activity;
        }

        @Override // p274n8.InterfaceC7732q
        /* JADX INFO: renamed from: a */
        public final Activity mo15320a() {
            return this.f42292b;
        }

        @Override // p274n8.InterfaceC7732q
        public final void startActivityForResult(Intent intent, int i10) throws Exception {
            C5298b1 c5298b1 = this.f42291a;
            Fragment fragment = (Fragment) c5298b1.f33572a;
            if (fragment != null) {
                fragment.startActivityForResult(intent, i10);
                return;
            }
            android.app.Fragment fragment2 = (android.app.Fragment) c5298b1.f33573b;
            if (fragment2 == null) {
                return;
            }
            fragment2.startActivityForResult(intent, i10);
        }
    }

    /* JADX INFO: renamed from: n8.m$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final e f42293a = new e();

        /* JADX INFO: renamed from: b */
        public static C7725j f42294b;

        /* JADX WARN: Code duplicated, block: B:9:0x000f A[Catch: all -> 0x0023, TryCatch #0 {, blocks: (B:6:0x0005, B:7:0x000a, B:9:0x000f, B:10:0x001d), top: B:18:0x0005 }] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final synchronized C7725j m15322a(Activity activity) {
            C7725j c7725j;
            Context contextM15871a = activity;
            synchronized (this) {
                if (activity == null) {
                    contextM15871a = C8004n.m15871a();
                    if (f42294b == null) {
                        f42294b = new C7725j(contextM15871a, C8004n.m15872b());
                    }
                    c7725j = f42294b;
                } else {
                    if (f42294b == null) {
                        f42294b = new C7725j(contextM15871a, C8004n.m15872b());
                    }
                    c7725j = f42294b;
                }
                throw th;
            }
            return c7725j;
        }
    }

    static {
        C5207g.m11110e(C7728m.class.toString(), "LoginManager::class.java.toString()");
    }

    public C7728m() {
        C5056a0.m10747e();
        SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.loginManager", 0);
        C5207g.m11110e(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f42280c = sharedPreferences;
        if (C8004n.f43564o && C5063e.m10752a() != null) {
            C7666c.m15263a(C8004n.m15871a(), "com.android.chrome", new C7717b());
            Context contextM15871a = C8004n.m15871a();
            String packageName = C8004n.m15871a().getPackageName();
            if (packageName == null) {
                return;
            }
            Context applicationContext = contextM15871a.getApplicationContext();
            try {
                C7666c.m15263a(applicationContext, packageName, new C7664a(applicationContext));
            } catch (SecurityException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m15312b(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(C8004n.m15871a(), FacebookActivity.class);
        intent.setAction(request.f11619a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static void m15313c(Activity activity, LoginClient.Result.Code code, Map map, FacebookException facebookException, boolean z10, LoginClient.Request request) {
        C7725j c7725jM15322a = e.f42293a.m15322a(activity);
        if (c7725jM15322a == null) {
            return;
        }
        String str = "fb_mobile_login_complete";
        if (request == null) {
            ScheduledExecutorService scheduledExecutorService = C7725j.f42268d;
            if (C6205a.m12742b(C7725j.class)) {
                return;
            }
            try {
                c7725jM15322a.m15310a(str, "");
                return;
            } catch (Throwable th2) {
                C6205a.m12741a(C7725j.class, th2);
                return;
            }
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z10 ? "1" : "0");
        String str2 = request.f11623e;
        str = request.f11613H ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        if (C6205a.m12742b(c7725jM15322a)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService2 = C7725j.f42268d;
        try {
            Bundle bundleM15311a = C7725j.a.m15311a(str2);
            if (code != null) {
                bundleM15311a.putString("2_result", code.getLoggingValue());
            }
            if ((facebookException == null ? null : facebookException.getMessage()) != null) {
                bundleM15311a.putString("5_error_message", facebookException.getMessage());
            }
            JSONObject jSONObject = map2.isEmpty() ^ true ? new JSONObject(map2) : null;
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    Iterator it = map.entrySet().iterator();
                    loop0: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            if (str3 != null) {
                                jSONObject.put(str3, str4);
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleM15311a.putString("6_extras", jSONObject.toString());
            }
            c7725jM15322a.f42270b.m16340a(bundleM15311a, str);
            if (code == LoginClient.Result.Code.SUCCESS && !C6205a.m12742b(c7725jM15322a)) {
                try {
                    C7725j.f42268d.schedule(new RunnableC7907g(c7725jM15322a, 8, C7725j.a.m15311a(str2)), 5L, TimeUnit.SECONDS);
                } catch (Throwable th3) {
                    C6205a.m12741a(c7725jM15322a, th3);
                }
            }
        } catch (Throwable th4) {
            C6205a.m12741a(c7725jM15322a, th4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m15314f(Activity activity, LoginClient.Request request) {
        C7725j c7725jM15322a = e.f42293a.m15322a(activity);
        if (c7725jM15322a != null) {
            String str = request.f11613H ? "foa_mobile_login_start" : "fb_mobile_login_start";
            if (C6205a.m12742b(c7725jM15322a)) {
                return;
            }
            try {
                ScheduledExecutorService scheduledExecutorService = C7725j.f42268d;
                Bundle bundleM15311a = C7725j.a.m15311a(request.f11623e);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", request.f11619a.toString());
                    jSONObject.put("request_code", CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
                    jSONObject.put("permissions", TextUtils.join(",", request.f11620b));
                    jSONObject.put("default_audience", request.f11621c.toString());
                    jSONObject.put("isReauthorize", request.f11624f);
                    String str2 = c7725jM15322a.f42271c;
                    if (str2 != null) {
                        jSONObject.put("facebookVersion", str2);
                    }
                    LoginTargetApp loginTargetApp = request.f11630l;
                    if (loginTargetApp != null) {
                        jSONObject.put("target_app", loginTargetApp.toString());
                    }
                    bundleM15311a.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                c7725jM15322a.f42270b.m16340a(bundleM15311a, str);
            } catch (Throwable th2) {
                C6205a.m12741a(c7725jM15322a, th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final LoginClient.Request m15315a(C7723h c7723h) {
        String strM15323a = c7723h.f42266c;
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            strM15323a = C7730o.m15323a(strM15323a, codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
        }
        String str = strM15323a;
        CodeChallengeMethod codeChallengeMethod2 = codeChallengeMethod;
        LoginBehavior loginBehavior = this.f42278a;
        Set setM13457y0 = C6752c.m13457y0(c7723h.f42264a);
        DefaultAudience defaultAudience = this.f42279b;
        String str2 = this.f42281d;
        String strM15872b = C8004n.m15872b();
        String string = UUID.randomUUID().toString();
        C5207g.m11110e(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, setM13457y0, defaultAudience, str2, strM15872b, string, this.f42284g, c7723h.f42265b, c7723h.f42266c, str, codeChallengeMethod2);
        Date date = AccessToken.f11370l;
        request.f11624f = AccessToken.C2262b.m6596c();
        request.f11628j = this.f42282e;
        request.f11629k = this.f42283f;
        request.f11613H = this.f42285h;
        request.f11614I = this.f42286i;
        return request;
    }

    /* JADX INFO: renamed from: d */
    public final void m15316d(C5298b1 c5298b1, List list, String str) {
        LoginClient.Request requestM15315a = m15315a(new C7723h(list));
        if (str != null) {
            requestM15315a.f11623e = str;
        }
        m15319h(new d(c5298b1), requestM15315a);
    }

    /* JADX INFO: renamed from: e */
    public final void m15317e() {
        Date date = AccessToken.f11370l;
        C7995e.f43517f.m15863a().m15862c(null, true);
        AuthenticationToken.C2266b.m6598a(null);
        C8012v.f43591d.m15888a().m15887a(null, true);
        SharedPreferences.Editor editorEdit = this.f42280c.edit();
        editorEdit.putBoolean("express_login_allowed", false);
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX INFO: renamed from: g */
    public final void m15318g(int i10, Intent intent, InterfaceC8000j interfaceC8000j) {
        LoginClient.Result.Code code;
        boolean z10;
        AccessToken accessToken;
        LoginClient.Request request;
        FacebookException facebookException;
        Map<String, String> map;
        AuthenticationToken authenticationToken;
        FacebookAuthorizationException facebookAuthorizationException;
        boolean z11;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        C7729n c7729n = null;
        boolean z12 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                code = result.f11631a;
                if (i10 != -1) {
                    if (i10 == 0) {
                        z12 = true;
                    }
                    facebookAuthorizationException = null;
                } else {
                    if (code == LoginClient.Result.Code.SUCCESS) {
                        accessToken = result.f11632b;
                        z11 = false;
                        authenticationToken2 = result.f11633c;
                        facebookException = null;
                    } else {
                        facebookAuthorizationException = new FacebookAuthorizationException(result.f11634d);
                    }
                    Map<String, String> map2 = result.f11637g;
                    request = result.f11636f;
                    authenticationToken = authenticationToken2;
                    z10 = z11;
                    map = map2;
                }
                facebookException = facebookAuthorizationException;
                accessToken = null;
                z11 = z12;
                authenticationToken2 = null;
                Map<String, String> map3 = result.f11637g;
                request = result.f11636f;
                authenticationToken = authenticationToken2;
                z10 = z11;
                map = map3;
            } else {
                code = code2;
                accessToken = null;
                request = null;
                facebookException = null;
                map = null;
                authenticationToken = null;
                z10 = false;
            }
        } else if (i10 == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z10 = true;
            accessToken = null;
            request = null;
            facebookException = null;
            map = null;
            authenticationToken = null;
        } else {
            code = code2;
            accessToken = null;
            request = null;
            facebookException = null;
            map = null;
            authenticationToken = null;
            z10 = false;
        }
        if (facebookException == null && accessToken == null && !z10) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        m15313c(null, code, map, facebookException, true, request);
        if (accessToken != null) {
            Date date = AccessToken.f11370l;
            C7995e.f43517f.m15863a().m15862c(accessToken, true);
            AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
            if (accessTokenM6595b != null) {
                if (AccessToken.C2262b.m6596c()) {
                    C5086z c5086z = C5086z.f33015a;
                    C5086z.m10831p(new C5212l(), accessTokenM6595b.f11375e);
                } else {
                    C8012v.f43591d.m15888a().m15887a(null, true);
                }
            }
        }
        if (authenticationToken != null) {
            AuthenticationToken.C2266b.m6598a(authenticationToken);
        }
        if (interfaceC8000j != null) {
            if (accessToken != null && request != null) {
                Set<String> set = request.f11620b;
                Set setM13456x0 = C6752c.m13456x0(C6752c.m13421O(accessToken.f11372b));
                if (request.f11624f) {
                    setM13456x0.retainAll(set);
                }
                Set setM13456x1 = C6752c.m13456x0(C6752c.m13421O(set));
                setM13456x1.removeAll(setM13456x0);
                c7729n = new C7729n(accessToken, authenticationToken, setM13456x0, setM13456x1);
            }
            if (!z10 && (c7729n == null || !c7729n.f42297c.isEmpty())) {
                if (facebookException != null) {
                    interfaceC8000j.mo10338b(facebookException);
                    return;
                }
                if (accessToken == null || c7729n == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = this.f42280c.edit();
                editorEdit.putBoolean("express_login_allowed", true);
                editorEdit.apply();
                interfaceC8000j.mo10339c(c7729n);
                return;
            }
            interfaceC8000j.mo10337a();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m15319h(InterfaceC7732q interfaceC7732q, LoginClient.Request request) throws FacebookException {
        m15314f(interfaceC7732q.mo15320a(), request);
        CallbackManagerImpl.C2301b c2301b = CallbackManagerImpl.f11543b;
        CallbackManagerImpl.RequestCodeOffset requestCodeOffset = CallbackManagerImpl.RequestCodeOffset.Login;
        int requestCode = requestCodeOffset.toRequestCode();
        CallbackManagerImpl.InterfaceC2300a interfaceC2300a = new CallbackManagerImpl.InterfaceC2300a() { // from class: n8.k
            @Override // com.facebook.internal.CallbackManagerImpl.InterfaceC2300a
            /* JADX INFO: renamed from: a */
            public final void mo6663a(Intent intent, int i10) {
                C7728m c7728m = this.f42272a;
                C5207g.m11111f(c7728m, "this$0");
                c7728m.m15318g(i10, intent, null);
            }
        };
        synchronized (c2301b) {
            HashMap map = CallbackManagerImpl.f11544c;
            if (!map.containsKey(Integer.valueOf(requestCode))) {
                map.put(Integer.valueOf(requestCode), interfaceC2300a);
            }
        }
        Intent intentM15312b = m15312b(request);
        boolean z10 = false;
        if (C8004n.m15871a().getPackageManager().resolveActivity(intentM15312b, 0) != null) {
            try {
                interfaceC7732q.startActivityForResult(intentM15312b, requestCodeOffset.toRequestCode());
                z10 = true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        if (z10) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m15313c(interfaceC7732q.mo15320a(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }
}
