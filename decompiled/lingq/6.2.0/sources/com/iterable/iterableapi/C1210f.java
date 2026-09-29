package com.iterable.iterableapi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3309ls;
import p000.RunnableC3468pp;
import p000.RunnableC3795yg;
import p000.ab4;
import p000.bb4;
import p000.bl2;
import p000.cc4;
import p000.d32;
import p000.e41;
import p000.ec4;
import p000.eh0;
import p000.fb4;
import p000.id3;
import p000.l78;
import p000.m58;
import p000.ma3;
import p000.or3;
import p000.p33;
import p000.xb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1210f implements ab4 {

    /* JADX INFO: renamed from: a */
    public final fb4 f14014a;

    /* JADX INFO: renamed from: b */
    public final Context f14015b;

    /* JADX INFO: renamed from: c */
    public final C3309ls f14016c;

    /* JADX INFO: renamed from: d */
    public final e41 f14017d;

    /* JADX INFO: renamed from: e */
    public final or3 f14018e;

    /* JADX INFO: renamed from: f */
    public final bb4 f14019f;

    /* JADX INFO: renamed from: g */
    public final double f14020g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f14021h;

    /* JADX INFO: renamed from: i */
    public long f14022i;

    /* JADX INFO: renamed from: j */
    public long f14023j;

    /* JADX INFO: renamed from: k */
    public boolean f14024k;

    public C1210f(fb4 fb4Var, e41 e41Var) {
        C3309ls c3309ls = new C3309ls(fb4Var.f38770a, 23);
        bb4 bb4Var = bb4.f8269i;
        or3 or3Var = new or3(bb4Var);
        this.f14021h = new ArrayList();
        this.f14022i = 0L;
        this.f14023j = 0L;
        this.f14024k = false;
        this.f14014a = fb4Var;
        this.f14015b = fb4Var.f38770a;
        this.f14017d = e41Var;
        this.f14020g = 30.0d;
        this.f14016c = c3309ls;
        this.f14018e = or3Var;
        this.f14019f = bb4Var;
        bb4Var.m3555a(this);
        m6917i();
    }

    /* JADX INFO: renamed from: c */
    public static void m6911c(C1210f c1210f, ArrayList arrayList) {
        C3309ls c3309ls = c1210f.f14016c;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C1212h c1212h = (C1212h) it.next();
            map.put(c1212h.m6924g(), c1212h);
            boolean z2 = c3309ls.m16520x(c1212h.m6924g()) != null;
            if (!z2) {
                synchronized (c3309ls) {
                    ((Map) c3309ls.f50064b).put(c1212h.m6924g(), c1212h);
                    c1212h.m6937t(c3309ls);
                    xb4 xb4Var = (xb4) c3309ls.f50065c;
                    if (!xb4Var.hasMessages(100)) {
                        xb4Var.sendEmptyMessageDelayed(100, 100L);
                    }
                }
                if (!c1212h.m6932o()) {
                    fb4 fb4Var = c1210f.f14014a;
                    if (fb4Var.m11690a()) {
                        bl2 bl2Var = fb4Var.f38780k;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            bl2Var.m3855l(jSONObject);
                            jSONObject.put("messageId", c1212h.m6924g());
                            jSONObject.put("messageContext", bl2.m3816I(c1212h, null));
                            jSONObject.put("deviceInfo", bl2Var.m3828H());
                            bl2Var.m3835P("events/trackInAppDelivery", jSONObject);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
                z = true;
            }
            if (z2) {
                C1212h c1212hM16520x = c3309ls.m16520x(c1212h.m6924g());
                if (!c1212hM16520x.m6932o() && c1212h.m6932o()) {
                    c1212hM16520x.m6939v(c1212h.m6932o());
                    z = true;
                }
            }
        }
        for (C1212h c1212h2 : c3309ls.m16521y()) {
            if (!map.containsKey(c1212h2.m6924g())) {
                c3309ls.m16490J(c1212h2);
                z = true;
            }
        }
        c1210f.m6916h();
        if (z) {
            c1210f.m6913e();
        }
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: a */
    public final void mo231a() {
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: b */
    public final void mo232b() {
        if (System.currentTimeMillis() - this.f14022i > 60000) {
            m6917i();
        } else {
            m6916h();
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized C1212h m6912d(String str) {
        return this.f14016c.m16520x(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m6913e() {
        new Handler(Looper.getMainLooper()).post(new RunnableC3795yg(this, 6));
    }

    /* JADX INFO: renamed from: f */
    public final void m6914f() {
        ArrayList<C1212h> arrayList;
        WeakReference weakReference = this.f14019f.f8271b;
        if ((weakReference != null ? (Activity) weakReference.get() : null) != null) {
            this.f14018e.getClass();
            if (C1209e.f13998Z0 == null && (System.currentTimeMillis() - this.f14023j) / 1000.0d >= this.f14020g && !this.f14024k) {
                eh0.m11114K();
                synchronized (this) {
                    arrayList = new ArrayList();
                    for (C1212h c1212h : this.f14016c.m16521y()) {
                        if (!c1212h.m6928k() && (c1212h.m6923f() == null || System.currentTimeMillis() <= c1212h.m6923f().getTime())) {
                            arrayList.add(c1212h);
                        }
                    }
                }
                Collections.sort(arrayList, new ma3(20));
                for (C1212h c1212h2 : arrayList) {
                    if (!c1212h2.m6931n() && !c1212h2.m6928k() && c1212h2.m6926i() == IterableInAppMessage$Trigger$TriggerType.IMMEDIATE && !c1212h2.m6932o()) {
                        eh0.m11133m("IterableInAppManager", "Calling onNewInApp on " + c1212h2.m6924g());
                        this.f14017d.getClass();
                        eh0.m11133m("IterableInAppManager", "Response: " + IterableInAppHandler$InAppResponse.SHOW);
                        c1212h2.m6938u();
                        if (c1212h2.m6930m()) {
                            synchronized (this) {
                                c1212h2.m6939v(true);
                                m6913e();
                            }
                            c1212h2.m6935r();
                            this.f14014a.m11697i(c1212h2, null, null);
                            return;
                        }
                        boolean zM6929l = c1212h2.m6929l();
                        IterableInAppLocation iterableInAppLocation = IterableInAppLocation.IN_APP;
                        or3 or3Var = this.f14018e;
                        p33 p33Var = new p33((Object) this, (Object) c1212h2, false, 6);
                        or3Var.getClass();
                        if (c1212h2.m6930m()) {
                            return;
                        }
                        WeakReference weakReference2 = ((bb4) or3Var.f54782a).f8271b;
                        Activity activity = weakReference2 != null ? (Activity) weakReference2.get() : null;
                        if (activity != null) {
                            String str = c1212h2.m6922e().f35385a;
                            String strM6924g = c1212h2.m6924g();
                            double d = c1212h2.m6922e().f35387c;
                            Rect rect = c1212h2.m6922e().f35386b;
                            boolean z = c1212h2.m6922e().f35388d.f42315a;
                            ec4 ec4Var = (ec4) c1212h2.m6922e().f35388d.f42316b;
                            if (!(activity instanceof id3)) {
                                eh0.m11121R("IterableInAppManager", "To display in-app notifications, the context must be of an instance of: FragmentActivity");
                                return;
                            }
                            id3 id3Var = (id3) activity;
                            if (str != null) {
                                if (C1209e.f13998Z0 != null) {
                                    eh0.m11121R("IterableInAppManager", "Skipping the in-app notification: another notification is already being displayed");
                                    return;
                                }
                                C1209e.f13998Z0 = new C1209e();
                                Bundle bundle = new Bundle();
                                bundle.putString("HTML", str);
                                bundle.putBoolean("CallbackOnCancel", true);
                                bundle.putString("MessageId", strM6924g);
                                bundle.putDouble("BackgroundAlpha", d);
                                bundle.putParcelable("InsetPadding", rect);
                                bundle.putString("InAppBgColor", ec4Var.f36995a);
                                bundle.putDouble("InAppBgAlpha", ec4Var.f36996b);
                                bundle.putBoolean("ShouldAnimate", z);
                                C1209e.f13999a1 = p33Var;
                                C1209e.f14000b1 = iterableInAppLocation;
                                C1209e.f13998Z0.m2095W(bundle);
                                C1209e.f13998Z0.m3665k0(id3Var.m13792j(), "iterable_in_app");
                                synchronized (this) {
                                    c1212h2.m6939v(true);
                                    m6913e();
                                }
                                if (zM6929l) {
                                    return;
                                }
                                c1212h2.m6934q();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6915g(C1212h c1212h, IterableInAppDeleteActionType iterableInAppDeleteActionType, IterableInAppLocation iterableInAppLocation) {
        eh0.m11114K();
        c1212h.m6935r();
        this.f14014a.m11697i(c1212h, iterableInAppDeleteActionType, iterableInAppLocation);
        m6913e();
    }

    /* JADX INFO: renamed from: h */
    public final void m6916h() {
        eh0.m11114K();
        double dCurrentTimeMillis = (System.currentTimeMillis() - this.f14023j) / 1000.0d;
        double d = this.f14020g;
        if (dCurrentTimeMillis >= d) {
            m6914f();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3468pp(this, 10), (long) (((d - ((System.currentTimeMillis() - this.f14023j) / 1000.0d)) + 2.0d) * 1000.0d));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6917i() {
        eh0.m11114K();
        cc4 cc4Var = new cc4(this);
        fb4 fb4Var = this.f14014a;
        if (fb4Var.m11690a()) {
            bl2 bl2Var = fb4Var.f38780k;
            m58 m58Var = (m58) bl2Var.f8655a;
            fb4 fb4Var2 = (fb4) m58Var.f50618b;
            JSONObject jSONObject = new JSONObject();
            bl2Var.m3855l(jSONObject);
            try {
                bl2Var.m3855l(jSONObject);
                jSONObject.put("count", 100);
                jSONObject.put("platform", d32.m10021S(fb4Var2.f38770a.getPackageManager()) ? "OTT" : "Android");
                jSONObject.put("SDKVersion", "3.7.0");
                jSONObject.put("systemVersion", Build.VERSION.RELEASE);
                jSONObject.put("packageName", fb4Var2.f38770a.getPackageName());
                l78 l78VarM3831L = bl2Var.m3831L();
                fb4 fb4Var3 = (fb4) m58Var.f50618b;
                l78VarM3831L.mo6965c(fb4Var3.f38772c, "inApp/getMessages", jSONObject, fb4Var3.f38776g, cc4Var);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
