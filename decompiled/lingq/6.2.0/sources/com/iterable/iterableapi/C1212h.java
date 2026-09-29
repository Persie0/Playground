package com.iterable.iterableapi;

import android.content.Context;
import android.graphics.Rect;
import java.io.File;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3309ls;
import p000.bq1;
import p000.dc4;
import p000.ec4;
import p000.eh0;
import p000.fc4;
import p000.hg0;
import p000.xb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C1212h {

    /* JADX INFO: renamed from: a */
    public final String f14027a;

    /* JADX INFO: renamed from: b */
    public final dc4 f14028b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f14029c;

    /* JADX INFO: renamed from: d */
    public final Date f14030d;

    /* JADX INFO: renamed from: e */
    public final Date f14031e;

    /* JADX INFO: renamed from: f */
    public final C1211g f14032f;

    /* JADX INFO: renamed from: g */
    public final double f14033g;

    /* JADX INFO: renamed from: h */
    public final Boolean f14034h;

    /* JADX INFO: renamed from: i */
    public final fc4 f14035i;

    /* JADX INFO: renamed from: j */
    public final Long f14036j;

    /* JADX INFO: renamed from: k */
    public boolean f14037k = false;

    /* JADX INFO: renamed from: l */
    public boolean f14038l = false;

    /* JADX INFO: renamed from: m */
    public boolean f14039m = false;

    /* JADX INFO: renamed from: n */
    public boolean f14040n = false;

    /* JADX INFO: renamed from: o */
    public boolean f14041o = false;

    /* JADX INFO: renamed from: p */
    public C3309ls f14042p;

    /* JADX INFO: renamed from: q */
    public final boolean f14043q;

    /* JADX INFO: renamed from: r */
    public C3309ls f14044r;

    public C1212h(String str, dc4 dc4Var, JSONObject jSONObject, Date date, Date date2, C1211g c1211g, Double d, Boolean bool, fc4 fc4Var, Long l, boolean z) {
        Boolean boolValueOf;
        boolean z2 = false;
        this.f14027a = str;
        this.f14028b = dc4Var;
        this.f14029c = jSONObject;
        this.f14030d = date;
        this.f14031e = date2;
        this.f14032f = c1211g;
        this.f14033g = d.doubleValue();
        if (bool != null) {
            if (bool.booleanValue() && !z) {
                z2 = true;
            }
            boolValueOf = Boolean.valueOf(z2);
        } else {
            boolValueOf = null;
        }
        this.f14034h = boolValueOf;
        this.f14035i = fc4Var;
        this.f14036j = l;
        this.f14043q = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m6918a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        if ("AutoExpand".equalsIgnoreCase(jSONObject.optString("displayOption"))) {
            return -1;
        }
        return jSONObject.optInt("percentage", 0);
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m6919b(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (i == -1) {
            jSONObject.putOpt("displayOption", "AutoExpand");
            return jSONObject;
        }
        jSONObject.putOpt("percentage", Integer.valueOf(i));
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m6920c(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("top", m6919b(rect.top));
        jSONObject.putOpt("left", m6919b(rect.left));
        jSONObject.putOpt("bottom", m6919b(rect.bottom));
        jSONObject.putOpt("right", m6919b(rect.right));
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static C1212h m6921d(JSONObject jSONObject, C3309ls c3309ls) {
        Long lValueOf;
        Rect rect;
        double dOptDouble;
        String strOptString;
        dc4 dc4Var;
        String str;
        if (jSONObject != null) {
            String strOptString2 = jSONObject.optString("messageId");
            try {
                long j = jSONObject.getLong("campaignId");
                lValueOf = j >= 0 ? Long.valueOf(j) : null;
            } catch (JSONException unused) {
            }
            boolean zOptBoolean = jSONObject.optBoolean("jsonOnly", false);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customPayload");
            if (jSONObjectOptJSONObject == null && zOptBoolean) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            if (zOptBoolean) {
                dc4Var = new dc4("", new Rect(), 0.0d, new hg0((Object) new ec4(0.0d, null), false));
            } else {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("content");
                if (jSONObjectOptJSONObject2 != null) {
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("payload");
                    }
                    String strOptString3 = jSONObjectOptJSONObject2.optString("html", null);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("inAppDisplaySettings");
                    if (jSONObjectOptJSONObject3 == null) {
                        rect = new Rect(0, 0, 0, 0);
                    } else {
                        rect = new Rect();
                        rect.top = m6918a(jSONObjectOptJSONObject3.optJSONObject("top"));
                        rect.left = m6918a(jSONObjectOptJSONObject3.optJSONObject("left"));
                        rect.bottom = m6918a(jSONObjectOptJSONObject3.optJSONObject("bottom"));
                        rect.right = m6918a(jSONObjectOptJSONObject3.optJSONObject("right"));
                    }
                    Rect rect2 = rect;
                    double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("backgroundAlpha", 0.0d);
                    boolean zOptBoolean2 = jSONObjectOptJSONObject3.optBoolean("shouldAnimate", false);
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("bgColor");
                    if (jSONObjectOptJSONObject4 != null) {
                        strOptString = jSONObjectOptJSONObject4.optString("hex");
                        dOptDouble = jSONObjectOptJSONObject4.optDouble("alpha");
                    } else {
                        dOptDouble = 0.0d;
                        strOptString = null;
                    }
                    dc4Var = new dc4(strOptString3, rect2, dOptDouble2, new hg0(new ec4(dOptDouble, strOptString), zOptBoolean2));
                }
            }
            long jOptLong = jSONObject.optLong("createdAt");
            Date date = jOptLong != 0 ? new Date(jOptLong) : null;
            long jOptLong2 = jSONObject.optLong("expiresAt");
            Date date2 = jOptLong2 != 0 ? new Date(jOptLong2) : null;
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("trigger");
            C1211g c1211g = jSONObjectOptJSONObject5 == null ? new C1211g(IterableInAppMessage$Trigger$TriggerType.IMMEDIATE) : new C1211g(jSONObjectOptJSONObject5);
            double dOptDouble3 = jSONObject.optDouble("priorityLevel", 300.5d);
            Boolean boolValueOf = jSONObject.has("saveToInbox") ? Boolean.valueOf(jSONObject.optBoolean("saveToInbox")) : null;
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("inboxMetadata");
            fc4 fc4Var = jSONObjectOptJSONObject6 == null ? null : new fc4(jSONObjectOptJSONObject6.optString("title"), jSONObjectOptJSONObject6.optString("subtitle"), jSONObjectOptJSONObject6.optString("icon"));
            Double dValueOf = Double.valueOf(dOptDouble3);
            dc4 dc4Var2 = dc4Var;
            C1212h c1212h = new C1212h(strOptString2, dc4Var2, jSONObjectOptJSONObject, date, date2, c1211g, dValueOf, boolValueOf, fc4Var, lValueOf, zOptBoolean);
            c1212h.f14042p = c3309ls;
            if (!zOptBoolean && (str = dc4Var2.f35385a) != null && !str.isEmpty()) {
                c1212h.f14040n = true;
            }
            c1212h.f14037k = jSONObject.optBoolean("processed", false);
            c1212h.f14038l = jSONObject.optBoolean("consumed", false);
            c1212h.f14039m = jSONObject.optBoolean("read", false);
            return c1212h;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final dc4 m6922e() {
        dc4 dc4Var = this.f14028b;
        if (dc4Var.f35385a == null && !this.f14043q) {
            C3309ls c3309ls = this.f14042p;
            c3309ls.getClass();
            File file = new File(((Context) c3309ls.f50066d).getFilesDir(), "com.iterable.sdk");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "IterableInAppFileStorage");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            dc4Var.f35385a = bq1.m4064q0(new File(new File(file2, this.f14027a), "index.html"));
        }
        return dc4Var;
    }

    /* JADX INFO: renamed from: f */
    public final Date m6923f() {
        return this.f14031e;
    }

    /* JADX INFO: renamed from: g */
    public final String m6924g() {
        return this.f14027a;
    }

    /* JADX INFO: renamed from: h */
    public final double m6925h() {
        return this.f14033g;
    }

    /* JADX INFO: renamed from: i */
    public final IterableInAppMessage$Trigger$TriggerType m6926i() {
        return this.f14032f.f14026b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6927j() {
        return this.f14040n;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6928k() {
        return this.f14038l;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6929l() {
        Boolean bool = this.f14034h;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6930m() {
        return this.f14043q;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6931n() {
        return this.f14037k;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6932o() {
        return this.f14039m;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m6933p() {
        return m6929l() && this.f14032f.f14026b == IterableInAppMessage$Trigger$TriggerType.NEVER;
    }

    /* JADX INFO: renamed from: q */
    public final void m6934q() {
        this.f14041o = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m6935r() {
        this.f14038l = true;
        C3309ls c3309ls = this.f14044r;
        if (c3309ls != null) {
            xb4 xb4Var = (xb4) c3309ls.f50065c;
            if (xb4Var.hasMessages(100)) {
                return;
            }
            xb4Var.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6936s() {
        this.f14040n = false;
    }

    /* JADX INFO: renamed from: t */
    public final void m6937t(C3309ls c3309ls) {
        this.f14044r = c3309ls;
    }

    /* JADX INFO: renamed from: u */
    public final void m6938u() {
        this.f14037k = true;
        C3309ls c3309ls = this.f14044r;
        if (c3309ls != null) {
            xb4 xb4Var = (xb4) c3309ls.f50065c;
            if (xb4Var.hasMessages(100)) {
                return;
            }
            xb4Var.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6939v(boolean z) {
        this.f14039m = z;
        C3309ls c3309ls = this.f14044r;
        if (c3309ls != null) {
            xb4 xb4Var = (xb4) c3309ls.f50065c;
            if (xb4Var.hasMessages(100)) {
                return;
            }
            xb4Var.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX INFO: renamed from: w */
    public final JSONObject m6940w() {
        dc4 dc4Var = this.f14028b;
        hg0 hg0Var = dc4Var.f35388d;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("messageId", this.f14027a);
            Long l = this.f14036j;
            if (l != null && l.longValue() >= 0) {
                jSONObject.put("campaignId", l);
            }
            Date date = this.f14030d;
            if (date != null) {
                jSONObject.putOpt("createdAt", Long.valueOf(date.getTime()));
            }
            Date date2 = this.f14031e;
            if (date2 != null) {
                jSONObject.putOpt("expiresAt", Long.valueOf(date2.getTime()));
            }
            boolean z = this.f14043q;
            boolean z2 = true;
            if (z) {
                jSONObject.put("jsonOnly", 1);
            }
            jSONObject.putOpt("trigger", this.f14032f.f14025a);
            jSONObject.putOpt("priorityLevel", Double.valueOf(this.f14033g));
            JSONObject jSONObjectM6920c = m6920c(dc4Var.f35386b);
            jSONObjectM6920c.put("shouldAnimate", hg0Var.f42315a);
            if (((ec4) hg0Var.f42316b).f36995a != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("alpha", ((ec4) hg0Var.f42316b).f36996b);
                jSONObject3.putOpt("hex", ((ec4) hg0Var.f42316b).f36995a);
                jSONObjectM6920c.put("bgColor", jSONObject3);
            }
            jSONObject2.putOpt("inAppDisplaySettings", jSONObjectM6920c);
            double d = dc4Var.f35387c;
            if (d != 0.0d) {
                jSONObject2.putOpt("backgroundAlpha", Double.valueOf(d));
            }
            jSONObject.putOpt("content", jSONObject2);
            jSONObject.putOpt("customPayload", this.f14029c);
            Boolean bool = this.f14034h;
            if (bool != null) {
                if (!bool.booleanValue() || z) {
                    z2 = false;
                }
                jSONObject.putOpt("saveToInbox", Boolean.valueOf(z2));
            }
            fc4 fc4Var = this.f14035i;
            if (fc4Var != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.putOpt("title", fc4Var.f38844a);
                    jSONObject4.putOpt("subtitle", fc4Var.f38845b);
                    jSONObject4.putOpt("icon", fc4Var.f38846c);
                } catch (JSONException e) {
                    eh0.m11136q("IterableInAppMessage", "Error while serializing inbox metadata", e);
                }
                jSONObject.putOpt("inboxMetadata", jSONObject4);
            }
            jSONObject.putOpt("processed", Boolean.valueOf(this.f14037k));
            jSONObject.putOpt("consumed", Boolean.valueOf(this.f14038l));
            jSONObject.putOpt("read", Boolean.valueOf(this.f14039m));
            return jSONObject;
        } catch (JSONException e2) {
            eh0.m11136q("IterableInAppMessage", "Error while serializing an in-app message", e2);
            return jSONObject;
        }
    }
}
