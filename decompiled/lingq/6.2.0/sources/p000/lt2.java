package p000;

import com.kochava.core.json.internal.JsonType;
import com.kochava.tracker.events.BuildConfig;
import com.kochava.tracker.events.EventType;
import com.kochava.tracker.events.Events;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lt2 {

    /* JADX INFO: renamed from: d */
    public static final sq5 f50096d;

    /* JADX INFO: renamed from: a */
    public final String f50097a;

    /* JADX INFO: renamed from: b */
    public final dg4 f50098b = dg4.m10328c();

    /* JADX INFO: renamed from: c */
    public final dg4 f50099c = dg4.m10328c();

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f50096d = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "Event");
    }

    public lt2(String str) {
        this.f50097a = str;
    }

    /* JADX INFO: renamed from: b */
    public static lt2 m16529b(EventType eventType) {
        if (eventType != null) {
            return new lt2(eventType.getEventName());
        }
        r46.m20373P(f50096d, "buildWithEventType", "eventType");
        return new lt2("");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00a6, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final void m16530a(eg4 eg4Var) {
        dg4 dg4VarM10336f;
        sq5 sq5Var = f50096d;
        String strM21915e = t9a.m21915e("payload", 256, sq5Var, "setCustomDictionary", "name");
        dg4 dg4Var = null;
        if (eg4Var != null) {
            dg4 dg4Var2 = (dg4) eg4Var;
            if (dg4Var2.m10348r() > 0) {
                dg4VarM10336f = dg4Var2.m10336f();
            } else {
                dg4VarM10336f = null;
            }
        } else {
            dg4VarM10336f = null;
        }
        if (dg4VarM10336f == null) {
            r46.m20373P(sq5Var, "setCustomDictionary", "value");
        } else {
            ArrayList arrayListM10347q = dg4VarM10336f.m10347q();
            for (int i = 0; i < arrayListM10347q.size(); i++) {
                String str = (String) arrayListM10347q.get(i);
                rf4 rf4VarM10341k = dg4VarM10336f.m10341k(str, false);
                if (rf4VarM10341k != null) {
                    Object obj = rf4VarM10341k.f59203a;
                    if (JsonType.getType(obj) == JsonType.Null) {
                        dg4VarM10336f.m10350t(str);
                        r46.m20373P(sq5Var, "setCustomDictionary", "value." + str);
                    } else if (JsonType.getType(obj) == JsonType.String) {
                        String strM3217L = b34.m3217L(obj);
                        if (strM3217L == null) {
                            strM3217L = "";
                        }
                        if (b34.m3255w(strM3217L)) {
                            dg4VarM10336f.m10350t(str);
                            r46.m20373P(sq5Var, "setCustomDictionary", "value." + str);
                        } else if (JsonType.getType(obj) != JsonType.JsonArray) {
                            if (str.length() > 256) {
                                dg4VarM10336f.m10350t(str);
                                dg4VarM10336f.m10355y(b34.m3231a0(256, str), rf4VarM10341k);
                                r46.m20375R(256, sq5Var, "setCustomDictionary", "value.".concat(str));
                            }
                        } else if (str.length() > 256) {
                            dg4VarM10336f.m10350t(str);
                            dg4VarM10336f.m10355y(b34.m3231a0(256, str), rf4VarM10341k);
                            r46.m20375R(256, sq5Var, "setCustomDictionary", "value.".concat(str));
                        }
                    } else if ((JsonType.getType(obj) != JsonType.JsonArray && ((ef4) b34.m3213H(obj, true)).m11093f() == 0) || (JsonType.getType(obj) == JsonType.JsonObject && ((dg4) rf4VarM10341k.m20646a()).m10348r() == 0)) {
                        dg4VarM10336f.m10350t(str);
                        r46.m20373P(sq5Var, "setCustomDictionary", "value." + str);
                    } else if (str.length() > 256) {
                        dg4VarM10336f.m10350t(str);
                        dg4VarM10336f.m10355y(b34.m3231a0(256, str), rf4VarM10341k);
                        r46.m20375R(256, sq5Var, "setCustomDictionary", "value.".concat(str));
                    }
                } else {
                    dg4VarM10336f.m10350t(str);
                    r46.m20373P(sq5Var, "setCustomDictionary", "value." + str);
                }
            }
            dg4Var = dg4VarM10336f;
        }
        if (strM21915e == null || dg4Var == null) {
            return;
        }
        this.f50098b.m10356z(strM21915e, dg4Var);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized JSONObject m16531c() {
        JSONObject jSONObject;
        try {
            dg4 dg4VarM10328c = dg4.m10328c();
            dg4VarM10328c.m10331B("event_name", this.f50097a);
            if (this.f50098b.m10348r() > 0) {
                dg4VarM10328c.m10356z("event_data", this.f50098b.m10336f());
            }
            if (this.f50099c.m10348r() > 0) {
                dg4VarM10328c.m10356z("receipt", this.f50099c.m10336f());
            }
            synchronized (dg4VarM10328c) {
                jSONObject = dg4VarM10328c.f35593a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public final void m16532d() {
        Events events = (Events) Events.getInstance();
        synchronized (events.f14119a) {
            try {
                sq5 sq5Var = Events.f14115g;
                r46.m20360A(sq5Var, "Host called API: Send Event");
                if (this.f50097a.isEmpty()) {
                    r46.m20373P(sq5Var, "sendWithEvent", "eventName");
                } else {
                    events.m6984c(new fd4(new dg4(m16531c())));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m16533e(String str) {
        m16536h("content_id", str);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m16534f(String str) {
        m16536h("currency", str);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m16535g(double d) {
        sq5 sq5Var = f50096d;
        String strM21915e = t9a.m21915e("price", 256, sq5Var, "setCustomNumberValue", "name");
        Double dValueOf = Double.valueOf(d);
        Double d2 = null;
        if (Double.isNaN(d)) {
            dValueOf = null;
        }
        if (dValueOf == null) {
            r46.m20373P(sq5Var, "setCustomNumberValue", "value");
        } else {
            d2 = dValueOf;
        }
        if (strM21915e != null && d2 != null) {
            this.f50098b.m10352v(d2.doubleValue(), strM21915e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m16536h(String str, String str2) {
        sq5 sq5Var = f50096d;
        String strM21915e = t9a.m21915e(str, 256, sq5Var, "setCustomStringValue", "name");
        String strM21915e2 = t9a.m21915e(str2, -1, sq5Var, "setCustomStringValue", "value");
        if (strM21915e != null && strM21915e2 != null) {
            this.f50098b.m10331B(strM21915e, strM21915e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m16537i(JSONObject jSONObject) {
        m16530a(b34.m3215J(jSONObject, true));
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m16538j(double d) {
        m16535g(d);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m16539k(String str) {
        m16536h("user_id", str);
    }
}
