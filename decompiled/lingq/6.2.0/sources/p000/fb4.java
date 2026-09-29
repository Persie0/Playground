package p000;

import android.content.Context;
import com.iterable.iterableapi.C1206b;
import com.iterable.iterableapi.C1210f;
import com.iterable.iterableapi.C1212h;
import com.iterable.iterableapi.C1213i;
import com.iterable.iterableapi.IterableInAppCloseAction;
import com.iterable.iterableapi.IterableInAppDeleteActionType;
import com.iterable.iterableapi.IterableInAppLocation;
import com.iterable.iterableapi.IterablePushRegistrationData$PushRegistrationAction;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fb4 {

    /* JADX INFO: renamed from: t */
    public static volatile fb4 f38769t = new fb4();

    /* JADX INFO: renamed from: a */
    public Context f38770a;

    /* JADX INFO: renamed from: b */
    public lb4 f38771b;

    /* JADX INFO: renamed from: c */
    public String f38772c;

    /* JADX INFO: renamed from: d */
    public String f38773d;

    /* JADX INFO: renamed from: e */
    public String f38774e;

    /* JADX INFO: renamed from: f */
    public String f38775f;

    /* JADX INFO: renamed from: g */
    public String f38776g;

    /* JADX INFO: renamed from: h */
    public String f38777h;

    /* JADX INFO: renamed from: i */
    public boolean f38778i;

    /* JADX INFO: renamed from: j */
    public boolean f38779j;

    /* JADX INFO: renamed from: k */
    public final bl2 f38780k;

    /* JADX INFO: renamed from: l */
    public final C3082ho f38781l;

    /* JADX INFO: renamed from: m */
    public db4 f38782m;

    /* JADX INFO: renamed from: n */
    public C1210f f38783n;

    /* JADX INFO: renamed from: o */
    public qb4 f38784o;

    /* JADX INFO: renamed from: p */
    public C1206b f38785p;

    /* JADX INFO: renamed from: q */
    public final HashMap f38786q;

    /* JADX INFO: renamed from: r */
    public C1213i f38787r;

    /* JADX INFO: renamed from: s */
    public final db4 f38788s;

    public fb4() {
        m58 m58Var = new m58(this, 29);
        bl2 bl2Var = new bl2();
        bl2Var.f8655a = m58Var;
        this.f38780k = bl2Var;
        C3082ho c3082ho = new C3082ho();
        c3082ho.f42681a = new HashSet(C3082ho.f42680b);
        this.f38781l = c3082ho;
        this.f38786q = new HashMap();
        this.f38788s = new db4(this);
        this.f38771b = new lb4(new kb4());
    }

    /* JADX INFO: renamed from: g */
    public static fb4 m11688g() {
        return f38769t;
    }

    /* JADX INFO: renamed from: k */
    public static String m11689k(String str) {
        if (str == null || str.isEmpty()) {
            return "null";
        }
        if (str.length() == 1) {
            return "*";
        }
        return str.charAt(0) + "***";
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11690a() {
        if (m11698j()) {
            return true;
        }
        eh0.m11121R("IterableApi", "Iterable SDK must be initialized with an API key and user email/userId before calling SDK methods");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m11691b() {
        if (m11698j()) {
            this.f38771b.getClass();
            if (this.f38771b.f49395a) {
                m11699l();
            }
            m11695f().m6917i();
            qb4 qb4VarM11694e = m11694e();
            qb4VarM11694e.getClass();
            qb4.m19846c(qb4VarM11694e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1206b m11692c() {
        if (this.f38785p == null) {
            this.f38771b.getClass();
            this.f38785p = new C1206b(this, (s01) this.f38771b.f49399e);
        }
        return this.f38785p;
    }

    /* JADX INFO: renamed from: d */
    public final String m11693d() {
        if (this.f38777h == null) {
            String string = this.f38770a.getSharedPreferences("com.iterable.iterableapi", 0).getString("itbl_deviceid", null);
            this.f38777h = string;
            if (string == null) {
                this.f38777h = UUID.randomUUID().toString();
                this.f38770a.getSharedPreferences("com.iterable.iterableapi", 0).edit().putString("itbl_deviceid", this.f38777h).apply();
            }
        }
        return this.f38777h;
    }

    /* JADX INFO: renamed from: e */
    public final qb4 m11694e() {
        qb4 qb4Var = this.f38784o;
        if (qb4Var != null) {
            return qb4Var;
        }
        ho2.m13385e("IterableApi must be initialized before calling getEmbeddedManager(). Make sure you call IterableApi#initialize() in Application#onCreate");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final C1210f m11695f() {
        C1210f c1210f = this.f38783n;
        if (c1210f != null) {
            return c1210f;
        }
        ho2.m13385e("IterableApi must be initialized before calling getInAppManager(). Make sure you call IterableApi#initialize() in Application#onCreate");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final C1213i m11696h() {
        if (this.f38770a == null) {
            return null;
        }
        if (this.f38787r == null) {
            try {
                Context context = this.f38770a;
                this.f38771b.getClass();
                this.f38787r = new C1213i(context, this.f38771b.f49397c);
            } catch (Exception e) {
                eh0.m11136q("IterableApi", "Failed to create IterableKeychain", e);
            }
        }
        return this.f38787r;
    }

    /* JADX INFO: renamed from: i */
    public final void m11697i(C1212h c1212h, IterableInAppDeleteActionType iterableInAppDeleteActionType, IterableInAppLocation iterableInAppLocation) {
        if (m11690a()) {
            bl2 bl2Var = this.f38780k;
            JSONObject jSONObject = new JSONObject();
            try {
                bl2Var.m3855l(jSONObject);
                jSONObject.put("messageId", c1212h.m6924g());
                if (iterableInAppDeleteActionType != null) {
                    jSONObject.put("deleteAction", iterableInAppDeleteActionType.toString());
                }
                if (iterableInAppLocation != null) {
                    jSONObject.put("messageContext", bl2.m3816I(c1212h, iterableInAppLocation));
                    jSONObject.put("deviceInfo", bl2Var.m3828H());
                }
                IterableInAppLocation iterableInAppLocation2 = IterableInAppLocation.IN_APP;
                bl2Var.m3836Q("events/inAppConsume", jSONObject, ((fb4) ((m58) bl2Var.f8655a).f50618b).f38776g, null, null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11698j() {
        if (this.f38772c != null) {
            return (this.f38773d == null && this.f38774e == null) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m11699l() {
        if (m11690a()) {
            String str = this.f38773d;
            String str2 = this.f38774e;
            String str3 = this.f38776g;
            this.f38771b.getClass();
            new oc4().execute(new nc4(str, str2, str3, this.f38770a.getPackageName(), IterablePushRegistrationData$PushRegistrationAction.ENABLE));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11700m(boolean z) {
        if (m11698j()) {
            String str = this.f38776g;
            if (str == null || str.equalsIgnoreCase(null)) {
                if (z) {
                    m11691b();
                    return;
                }
                return;
            }
            this.f38776g = null;
            if (this.f38770a == null) {
                return;
            }
            C1213i c1213iM11696h = m11696h();
            if (c1213iM11696h != null) {
                c1213iM11696h.m6943c("iterable-email", this.f38773d);
                c1213iM11696h.m6943c("iterable-user-id", this.f38774e);
                c1213iM11696h.m6943c("iterable-unknown-user-id", this.f38775f);
                c1213iM11696h.m6943c("iterable-auth-token", this.f38776g);
            } else {
                eh0.m11135p("IterableApi", "Shared preference creation failed. ");
            }
            m11691b();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11701n(String str, String str2) {
        if (m11690a()) {
            bl2 bl2Var = this.f38780k;
            JSONObject jSONObject = new JSONObject();
            try {
                bl2Var.m3855l(jSONObject);
                jSONObject.put("messageId", str);
                jSONObject.put("clickedUrl", str2);
                bl2Var.m3835P("events/trackInAppClick", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11702o(String str, String str2, IterableInAppCloseAction iterableInAppCloseAction, IterableInAppLocation iterableInAppLocation) {
        C1212h c1212hM6912d = m11695f().m6912d(str);
        if (c1212hM6912d == null) {
            eh0.m11121R("IterableApi", "trackInAppClose: could not find an in-app message with ID: " + str);
            return;
        }
        if (m11690a()) {
            bl2 bl2Var = this.f38780k;
            JSONObject jSONObject = new JSONObject();
            try {
                bl2Var.m3855l(jSONObject);
                jSONObject.put("messageId", c1212hM6912d.m6924g());
                jSONObject.putOpt("clickedUrl", str2);
                jSONObject.put("closeAction", iterableInAppCloseAction.toString());
                jSONObject.put("messageContext", bl2.m3816I(c1212hM6912d, iterableInAppLocation));
                jSONObject.put("deviceInfo", bl2Var.m3828H());
                IterableInAppLocation iterableInAppLocation2 = IterableInAppLocation.IN_APP;
                bl2Var.m3835P("events/trackInAppClose", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        eh0.m11114K();
    }
}
