package com.lingq.core.analytics;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.amplitude.android.C0879a;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.events.IdentifyOperation;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iterable.iterableapi.C1206b;
import com.iterable.iterableapi.C1210f;
import com.iterable.iterableapi.C1212h;
import com.iterable.iterableapi.C1213i;
import com.iterable.iterableapi.IterablePushRegistrationData$PushRegistrationAction;
import com.kochava.tracker.events.EventType;
import com.lingq.core.common.util.LqAnalyticsVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.random.Random$Default;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C0842cc;
import p000.C3309ls;
import p000.RunnableC3094i;
import p000.bb4;
import p000.bl2;
import p000.bl9;
import p000.cc4;
import p000.cl9;
import p000.d32;
import p000.db4;
import p000.df4;
import p000.dxb;
import p000.e41;
import p000.eh0;
import p000.ez3;
import p000.fa4;
import p000.fb4;
import p000.fz3;
import p000.gc4;
import p000.h0a;
import p000.hm5;
import p000.ho2;
import p000.im5;
import p000.jb4;
import p000.jm5;
import p000.jq7;
import p000.kb4;
import p000.km5;
import p000.l78;
import p000.lb4;
import p000.lda;
import p000.lnb;
import p000.lt2;
import p000.m58;
import p000.nc4;
import p000.ob1;
import p000.oc4;
import p000.or3;
import p000.ph2;
import p000.pvc;
import p000.qb4;
import p000.r8d;
import p000.rb4;
import p000.sm5;
import p000.tb4;
import p000.te1;
import p000.u91;
import p000.un1;
import p000.v3c;
import p000.v91;
import p000.vz1;
import p000.wb4;
import p000.wfb;
import p000.wi1;
import p000.xxb;

/* JADX INFO: renamed from: com.lingq.core.analytics.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1240a implements hm5 {

    /* JADX INFO: renamed from: a */
    public final Context f14298a;

    /* JADX INFO: renamed from: b */
    public final ob1 f14299b;

    /* JADX INFO: renamed from: c */
    public final df4 f14300c;

    /* JADX INFO: renamed from: d */
    public final un1 f14301d;

    /* JADX INFO: renamed from: e */
    public or3 f14302e;

    /* JADX INFO: renamed from: f */
    public cc4 f14303f;

    /* JADX INFO: renamed from: g */
    public C0842cc f14304g;

    /* JADX INFO: renamed from: h */
    public km5 f14305h;

    public C1240a(Context context, ob1 ob1Var, df4 df4Var, un1 un1Var) {
        ob1Var.getClass();
        df4Var.getClass();
        un1Var.getClass();
        this.f14298a = context;
        this.f14299b = ob1Var;
        this.f14300c = df4Var;
        this.f14301d = un1Var;
    }

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsVariant m7021b(jm5 jm5Var) {
        jm5Var.getClass();
        List list = jm5Var.f45827c;
        if (list.isEmpty()) {
            return new LqAnalyticsVariant("not set", -1, true);
        }
        Random$Default random$Default = jq7.f46010a;
        LqAnalyticsVariant lqAnalyticsVariant = (LqAnalyticsVariant) u91.m22605W0(list);
        Bundle bundle = new Bundle();
        bundle.putInt("experiment id", jm5Var.f45825a);
        bundle.putString("experiment name", jm5Var.f45826b);
        bundle.putInt("variant id", lqAnalyticsVariant.f14397a);
        bundle.putString("variant name", lqAnalyticsVariant.f14398b);
        m7025f("Experiment enrolled", bundle);
        return lqAnalyticsVariant;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m7022c(String... strArr) {
        if (strArr.length == 0 || strArr.length % 2 != 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < strArr.length; i += 2) {
            bundle.putString(strArr[i], strArr[i + 1]);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m7023d() {
        ArrayList arrayList = fb4.f38769t.m11694e().f57538b;
        ArrayList<Iterable> arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) fb4.f38769t.m11694e().f57537a.get(Long.valueOf(((Number) it.next()).longValue()));
            arrayList2.add(list != null ? u91.m22587E0(list) : null);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Iterable iterable : arrayList2) {
            if (iterable == null) {
                iterable = EmptyList.f47638a;
            }
            u91.m22630w0(iterable, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(lnb.m16397a((rb4) it2.next(), this.f14300c));
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: e */
    public final void m7024e() {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.f14298a);
        firebaseAnalytics.getClass();
        or3 or3Var = new or3();
        or3Var.f54782a = firebaseAnalytics;
        this.f14302e = or3Var;
        kb4 kb4Var = new kb4();
        kb4Var.f46967a = false;
        kb4Var.f46973g = true;
        lb4 lb4Var = new lb4(kb4Var);
        Context context = this.f14298a;
        String strM17892f = this.f14299b.m17892f("iterable_key");
        fb4.f38769t.f38770a = context.getApplicationContext();
        fb4.f38769t.f38772c = strM17892f;
        fb4.f38769t.f38771b = lb4Var;
        if (fb4.f38769t.f38771b == null) {
            fb4.f38769t.f38771b = new lb4(new kb4());
        }
        fb4 fb4Var = fb4.f38769t;
        if (fb4Var.f38770a != null) {
            C1213i c1213iM11696h = fb4Var.m11696h();
            if (c1213iM11696h != null) {
                fb4Var.f38773d = c1213iM11696h.m6942b("iterable-email");
                fb4Var.f38774e = c1213iM11696h.m6942b("iterable-user-id");
                fb4Var.f38775f = c1213iM11696h.m6942b("iterable-unknown-user-id");
                fb4Var.f38776g = c1213iM11696h.m6942b("iterable-auth-token");
            } else {
                eh0.m11135p("IterableApi", "retrieveEmailAndUserId: Shared preference creation failed. Could not retrieve email/userId");
            }
            fb4Var.f38771b.getClass();
        }
        te1.m21973F(context);
        bb4 bb4Var = bb4.f8269i;
        bb4Var.getClass();
        if (!bb4.f8268h) {
            bb4.f8268h = true;
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(bb4Var.f8276g);
        }
        bb4Var.m3555a(fb4.f38769t.f38788s);
        if (fb4.f38769t.f38783n == null) {
            fb4 fb4Var2 = fb4.f38769t;
            fb4 fb4Var3 = fb4.f38769t;
            e41 e41Var = (e41) fb4.f38769t.f38771b.f49398d;
            fb4.f38769t.f38771b.getClass();
            fb4.f38769t.f38771b.getClass();
            fb4Var2.f38783n = new C1210f(fb4Var3, e41Var);
        }
        if (fb4.f38769t.f38784o == null) {
            fb4 fb4Var4 = fb4.f38769t;
            fb4 fb4Var5 = fb4.f38769t;
            fb4Var5.getClass();
            qb4 qb4Var = new qb4();
            qb4Var.f57537a = new LinkedHashMap();
            qb4Var.f57538b = new ArrayList();
            qb4Var.f57539c = new ArrayList();
            bl2 bl2Var = new bl2();
            bl2Var.f8655a = new LinkedHashMap();
            bl2Var.f8656b = new tb4(null);
            qb4Var.f57541e = bl2Var;
            qb4Var.f57540d = fb4Var5;
            fb4Var5.f38770a.getClass();
            if (fb4Var5.f38771b.f49396b) {
                bb4Var.m3555a(qb4Var);
            }
            fb4Var4.f38784o = qb4Var;
        }
        if (fb4.f38769t.f38782m == null) {
            fb4 fb4Var6 = fb4.f38769t;
            fb4 fb4Var7 = fb4.f38769t;
            db4 db4Var = new db4();
            fb4 fb4Var8 = fb4.f38769t;
            db4Var.f35355b = fb4Var7;
            bb4Var.m3555a(db4Var);
            fb4Var6.f38782m = db4Var;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("itbl_saved_configuration", 0);
        fb4.f38769t.f38780k.m3837R(sharedPreferences.getBoolean("itbl_offline_mode", false));
        fb4.f38769t.f38779j = sharedPreferences.getBoolean("itbl_auto_retry", false);
        te1.m21973F(context);
        if (!fb4.f38769t.m11690a() && fb4.f38769t.f38775f == null) {
            fb4.f38769t.f38771b.getClass();
        }
        if (d32.m10021S(context.getPackageManager())) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                d32.m10036e0(jSONObject2, context, fb4.f38769t.m11693d(), null);
                jSONObject.put("FireTV", jSONObject2);
                fb4 fb4Var9 = fb4.f38769t;
                if (fb4Var9.m11690a() || fb4Var9.f38775f != null) {
                    fb4Var9.f38780k.m3838T(jSONObject);
                } else {
                    fb4.f38769t.f38771b.getClass();
                }
            } catch (JSONException e) {
                eh0.m11136q("IterableApi", "initialize: exception", e);
            }
        }
        gc4 gc4Var = jb4.f45378a;
        synchronized (gc4Var.f40531d) {
            try {
                if (gc4Var.f40528a) {
                    eh0.m11133m("IterableInitCallbackMgr", "notifyInitializationComplete called but already initialized");
                } else {
                    gc4Var.f40528a = true;
                    eh0.m11133m("IterableInitCallbackMgr", "Notifying initialization completion to " + ((CopyOnWriteArraySet) gc4Var.f40529b).size() + " subscribers and " + ((ConcurrentLinkedQueue) gc4Var.f40530c).size() + " one-time callbacks");
                    Iterator it = ((CopyOnWriteArraySet) gc4Var.f40529b).iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            ho2.m13383c();
                            return;
                        } else if (Looper.myLooper() != Looper.getMainLooper()) {
                            new Handler(Looper.getMainLooper()).post(new RunnableC3094i(4));
                        } else {
                            try {
                                throw null;
                            } catch (Exception e2) {
                                eh0.m11136q("IterableInitCallbackMgr", "Exception in subscriber initialization callback", e2);
                            }
                        }
                    }
                    ((CopyOnWriteArraySet) gc4Var.f40529b).clear();
                    if (((ConcurrentLinkedQueue) gc4Var.f40530c).poll() != null) {
                        ho2.m13383c();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wfb.m23926u(this.f14301d, ph2.f56212a, null, new LqAnalyticsImpl$initialize$1(this, null), 2);
    }

    /* JADX INFO: renamed from: f */
    public final void m7025f(String str, Bundle bundle) {
        Double dM3869O;
        sm5.Companion.getClass();
        h0a.f41641a.mo11431b("Analytics event: " + str + " with params: " + bundle, new Object[0]);
        if (bundle == null) {
            bundle = new Bundle();
        }
        String strM17892f = this.f14299b.m17892f("app_code");
        or3 or3Var = this.f14302e;
        lt2 lt2VarM16529b = null;
        if (or3Var == null) {
            fa4.m11636J("lqaFirebase");
            throw null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strM4839V = cl9.m4839V(cl9.m4839V(lowerCase, " ", "_"), ":", "_");
        bundle.putString("platform", "android");
        bundle.putString("app", strM17892f);
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) or3Var.f54782a;
        Bundle bundle2 = new Bundle();
        Set<String> setKeySet = bundle2.keySet();
        setKeySet.getClass();
        for (String str2 : setKeySet) {
            str2.getClass();
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Object objM19515k = pvc.m19515k(str2, bundle2);
            if (objM19515k != null) {
                if (objM19515k instanceof String) {
                    bundle2.putString(lowerCase2, (String) objM19515k);
                } else if (objM19515k instanceof Integer) {
                    bundle2.putLong(lowerCase2, ((Number) objM19515k).intValue());
                } else if (objM19515k instanceof Long) {
                    bundle2.putLong(lowerCase2, ((Number) objM19515k).longValue());
                } else if (objM19515k instanceof Float) {
                    bundle2.putDouble(lowerCase2, ((Number) objM19515k).floatValue());
                } else if (objM19515k instanceof Double) {
                    bundle2.putDouble(lowerCase2, ((Number) objM19515k).doubleValue());
                } else if (objM19515k instanceof Boolean) {
                    bundle2.putString(lowerCase2, String.valueOf(((Boolean) objM19515k).booleanValue()));
                } else {
                    bundle2.putString(lowerCase2, objM19515k.toString());
                }
            }
        }
        v3c v3cVar = firebaseAnalytics.f13630a;
        v3cVar.getClass();
        v3cVar.m23087c(new dxb(v3cVar, (String) null, strM4839V, bundle2, false));
        C0842cc c0842cc = this.f14304g;
        if (c0842cc != null) {
            bundle.putString("platform", "android");
            bundle.putString("app", strM17892f);
            if (str.equals("Registration confirmed")) {
                lt2VarM16529b = lt2.m16529b(EventType.REGISTRATION_COMPLETE);
            } else if (str.equals("Upgrade confirmed")) {
                lt2VarM16529b = lt2.m16529b(EventType.PURCHASE);
                String string = bundle.getString("Product Id");
                if (string != null) {
                    lt2VarM16529b.m16533e(string);
                }
                try {
                    String string2 = bundle.getString("Amount paid");
                    if (string2 != null && (dM3869O = bl9.m3869O(string2)) != null) {
                        lt2VarM16529b.m16538j(dM3869O.doubleValue());
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                String string3 = bundle.getString("Currency");
                if (string3 != null) {
                    lt2VarM16529b.m16534f(string3);
                }
            }
            if (lt2VarM16529b != null) {
                lt2VarM16529b.m16539k(c0842cc.f9872b);
                JSONObject jSONObject = new JSONObject();
                for (String str3 : bundle.keySet()) {
                    try {
                        str3.getClass();
                        jSONObject.put(str3, pvc.m19515k(str3, bundle));
                    } catch (JSONException unused) {
                    }
                }
                lt2VarM16529b.m16537i(jSONObject);
                lt2VarM16529b.m16532d();
            }
        }
        cc4 cc4Var = this.f14303f;
        if (cc4Var == null || im5.f44289a.contains(str)) {
            return;
        }
        C0879a c0879a = (C0879a) cc4Var.f9881a;
        String lowerCase3 = str.toLowerCase(Locale.ROOT);
        lowerCase3.getClass();
        MapBuilder mapBuilder = new MapBuilder();
        Set<String> setKeySet2 = bundle.keySet();
        setKeySet2.getClass();
        for (String str4 : setKeySet2) {
            str4.getClass();
            Object objM19515k2 = pvc.m19515k(str4, bundle);
            if (objM19515k2 != null) {
                String lowerCase4 = str4.toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                mapBuilder.put(lowerCase4, objM19515k2);
            }
        }
        AbstractC0903a.m5107l(c0879a, lowerCase3, mapBuilder.m15392b(), 4);
    }

    /* JADX INFO: renamed from: g */
    public final void m7026g(String str) {
        Timer timer;
        or3 or3Var = this.f14302e;
        if (or3Var == null) {
            fa4.m11636J("lqaFirebase");
            throw null;
        }
        v3c v3cVar = ((FirebaseAnalytics) or3Var.f54782a).f13630a;
        v3cVar.getClass();
        v3cVar.m23087c(new xxb(v3cVar, str));
        cc4 cc4Var = this.f14303f;
        if (cc4Var != null) {
            ((C0879a) cc4Var.f9881a).m5117k(str);
        }
        C0842cc c0842cc = this.f14304g;
        if (c0842cc != null) {
            c0842cc.f9872b = str;
        }
        fb4 fb4Var = fb4.f38769t;
        fb4Var.getClass();
        fb4.m11689k(str);
        gc4 gc4Var = jb4.f45378a;
        ((wb4) fb4Var.f38771b.f49402h).getClass();
        ((wb4) fb4Var.f38771b.f49402h).getClass();
        String str2 = fb4Var.f38774e;
        if (str2 != null && str2.equals(str)) {
            fb4Var.f38771b.getClass();
        } else if (fb4Var.f38773d != null || fb4Var.f38774e != null || str != null) {
            if (fb4Var.f38771b.f49395a && fb4Var.m11698j() && fb4Var.m11690a()) {
                String str3 = fb4Var.f38773d;
                String str4 = fb4Var.f38774e;
                String str5 = fb4Var.f38776g;
                fb4Var.f38771b.getClass();
                new oc4().execute(new nc4(str3, str4, str5, fb4Var.f38770a.getPackageName(), IterablePushRegistrationData$PushRegistrationAction.DISABLE));
            }
            C1210f c1210f = fb4Var.f38783n;
            if (c1210f != null) {
                eh0.m11114K();
                C3309ls c3309ls = c1210f.f14016c;
                Iterator it = c3309ls.m16521y().iterator();
                while (it.hasNext()) {
                    c3309ls.m16490J((C1212h) it.next());
                }
                c1210f.m6913e();
            }
            qb4 qb4Var = fb4Var.f38784o;
            if (qb4Var != null) {
                qb4Var.f57537a = new LinkedHashMap();
            }
            C1206b c1206b = fb4Var.f38785p;
            if (c1206b != null && (timer = c1206b.f13990c) != null) {
                timer.cancel();
                c1206b.f13990c = null;
                c1206b.f13992e = false;
            }
            bl2 bl2Var = fb4Var.f38780k;
            l78 l78VarM3831L = bl2Var.m3831L();
            m58 m58Var = (m58) bl2Var.f8655a;
            l78VarM3831L.mo6964b();
            eh0.m11133m("IterableApi", "Resetting authToken");
            ((fb4) m58Var.f50618b).f38776g = null;
            fb4Var.f38773d = null;
            fb4Var.f38774e = str;
            fb4Var.f38771b.getClass();
            fb4Var.f38771b.getClass();
            if (str == null) {
                fb4Var.f38782m.getClass();
                fb4Var.f38775f = null;
                Context context = fb4Var.f38770a;
                if (context != null) {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.iterable.iterableapi", 0).edit();
                    editorEdit.remove("itbl_consent_logged");
                    editorEdit.apply();
                }
            }
            if (fb4Var.f38770a != null) {
                C1213i c1213iM11696h = fb4Var.m11696h();
                if (c1213iM11696h != null) {
                    c1213iM11696h.m6943c("iterable-email", fb4Var.f38773d);
                    c1213iM11696h.m6943c("iterable-user-id", fb4Var.f38774e);
                    c1213iM11696h.m6943c("iterable-unknown-user-id", fb4Var.f38775f);
                    c1213iM11696h.m6943c("iterable-auth-token", fb4Var.f38776g);
                } else {
                    eh0.m11135p("IterableApi", "Shared preference creation failed. ");
                }
            }
            if (fb4Var.m11698j()) {
                fb4Var.m11692c().getClass();
                C1206b c1206bM11692c = fb4Var.m11692c();
                synchronized (c1206bM11692c) {
                    synchronized (c1206bM11692c) {
                        fb4.f38769t.m11700m(true);
                    }
                }
            } else {
                fb4Var.m11700m(false);
            }
        }
        fb4.f38769t.m11699l();
    }

    /* JADX INFO: renamed from: h */
    public final void m7027h(String str, String str2) {
        LinkedHashMap linkedHashMapM23651u;
        str2.getClass();
        or3 or3Var = this.f14302e;
        if (or3Var == null) {
            fa4.m11636J("lqaFirebase");
            throw null;
        }
        v3c v3cVar = ((FirebaseAnalytics) or3Var.f54782a).f13630a;
        v3cVar.getClass();
        v3cVar.m23087c(new dxb(v3cVar, (String) null, str, (Object) str2, false));
        cc4 cc4Var = this.f14303f;
        if (cc4Var != null) {
            ez3 ez3Var = new ez3();
            IdentifyOperation identifyOperation = IdentifyOperation.SET;
            synchronized (ez3Var) {
                if (str.length() == 0) {
                    wi1 wi1Var = wi1.f66846b;
                    r8d.m20449b().mo16257c("Attempting to perform operation " + identifyOperation.getOperationType() + " with a null or empty string property, ignoring");
                } else if (((LinkedHashMap) ez3Var.f67809b).containsKey(IdentifyOperation.CLEAR_ALL.getOperationType())) {
                    wi1 wi1Var2 = wi1.f66846b;
                    r8d.m20449b().mo16257c("This Identify already contains a $clearAll operation, ignoring operation %s");
                } else if (((LinkedHashSet) ez3Var.f67808a).contains(str)) {
                    wi1 wi1Var3 = wi1.f66846b;
                    r8d.m20449b().mo16257c("Already used property " + str + " in previous operation, ignoring operation " + identifyOperation.getOperationType());
                } else {
                    if (!((LinkedHashMap) ez3Var.f67809b).containsKey(identifyOperation.getOperationType())) {
                        ((LinkedHashMap) ez3Var.f67809b).put(identifyOperation.getOperationType(), new LinkedHashMap());
                    }
                    Object obj = ((LinkedHashMap) ez3Var.f67809b).get(identifyOperation.getOperationType());
                    obj.getClass();
                    lda.m16118d(obj).put(str, str2);
                    ((LinkedHashSet) ez3Var.f67808a).add(str);
                }
            }
            C0879a c0879a = (C0879a) cc4Var.f9881a;
            fz3 fz3Var = new fz3();
            synchronized (ez3Var) {
                linkedHashMapM23651u = vz1.m23651u((LinkedHashMap) ez3Var.f67809b);
            }
            fz3Var.f8139N = linkedHashMapM23651u;
            c0879a.m5115i(fz3Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7028i(boolean z) {
        C1210f c1210fM11695f = fb4.f38769t.m11695f();
        c1210fM11695f.f14024k = !z;
        if (z) {
            c1210fM11695f.m6916h();
        }
    }
}
