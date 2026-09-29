package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qb4 implements ab4 {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f57537a;

    /* JADX INFO: renamed from: b */
    public ArrayList f57538b;

    /* JADX INFO: renamed from: c */
    public ArrayList f57539c;

    /* JADX INFO: renamed from: d */
    public fb4 f57540d;

    /* JADX INFO: renamed from: e */
    public bl2 f57541e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ob4] */
    /* JADX INFO: renamed from: c */
    public static void m19846c(final qb4 qb4Var) {
        Long[] lArr = new Long[0];
        if (qb4Var.f57540d.f38771b.f49396b) {
            eh0.m11120Q("IterableEmbeddedManager", "Syncing messages...");
            fb4 fb4Var = fb4.f38769t;
            ?? r8 = new vb4() { // from class: ob4
                @Override // p000.vb4
                /* JADX INFO: renamed from: a */
                public final void mo17898a(JSONObject jSONObject) {
                    qb4 qb4Var2 = this.f54129a;
                    ArrayList<km5> arrayList = qb4Var2.f57539c;
                    jSONObject.getClass();
                    eh0.m11120Q("IterableEmbeddedManager", "Got response from network call to get embedded messages");
                    try {
                        ArrayList arrayList2 = qb4Var2.f57538b;
                        ArrayList arrayList3 = new ArrayList();
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("placements");
                        if (jSONArrayOptJSONArray != null) {
                            if (jSONArrayOptJSONArray.length() == 0) {
                                qb4Var2.f57537a = new LinkedHashMap();
                                if (!arrayList2.isEmpty()) {
                                    for (km5 km5Var : arrayList) {
                                        eh0.m11133m("IterableEmbeddedManager", "Calling updateHandler");
                                        km5Var.m15337a();
                                    }
                                }
                            } else {
                                int length = jSONArrayOptJSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                                    jSONObjectOptJSONObject.getClass();
                                    sb4 sb4VarM15955r = l70.m15955r(jSONObjectOptJSONObject);
                                    long j = sb4VarM15955r.f60620a;
                                    ArrayList arrayList4 = sb4VarM15955r.f60621b;
                                    arrayList3.add(Long.valueOf(j));
                                    qb4Var2.m19847d(j, arrayList4);
                                }
                            }
                        }
                        Set setM22627s1 = u91.m22627s1(arrayList3);
                        arrayList2.getClass();
                        if (!(setM22627s1 instanceof Collection)) {
                            setM22627s1 = u91.m22622n1(setM22627s1);
                        }
                        Collection collection = setM22627s1;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (Object obj : arrayList2) {
                            if (!collection.contains(obj)) {
                                linkedHashSet.add(obj);
                            }
                        }
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                qb4Var2.f57537a.remove(Long.valueOf(((Number) it.next()).longValue()));
                            }
                            for (km5 km5Var2 : arrayList) {
                                eh0.m11133m("IterableEmbeddedManager", "Calling updateHandler");
                                km5Var2.m15337a();
                            }
                        }
                        qb4Var2.f57538b = arrayList3;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((km5) it2.next()).getClass();
                        }
                    } catch (JSONException e) {
                        eh0.m11135p("IterableEmbeddedManager", e.toString());
                        e.getMessage();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((km5) it3.next()).getClass();
                        }
                    }
                }
            };
            pb4 pb4Var = new pb4(qb4Var);
            if (fb4Var.m11690a()) {
                bl2 bl2Var = fb4Var.f38780k;
                JSONObject jSONObject = new JSONObject();
                try {
                    bl2Var.m3855l(jSONObject);
                    jSONObject.put("platform", "Android");
                    jSONObject.put("SDKVersion", "3.7.0");
                    jSONObject.put("systemVersion", Build.VERSION.RELEASE);
                    jSONObject.put("packageName", ((fb4) ((m58) bl2Var.f8655a).f50618b).f38770a.getPackageName());
                    if (lArr.length == 0) {
                        l78 l78VarM3831L = bl2Var.m3831L();
                        fb4 fb4Var2 = (fb4) ((m58) bl2Var.f8655a).f50618b;
                        l78VarM3831L.mo6963a(fb4Var2.f38772c, "embedded-messaging/messages", jSONObject, fb4Var2.f38776g, r8, pb4Var);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("embedded-messaging/messages?");
                    boolean z = true;
                    for (Long l : lArr) {
                        if (z) {
                            sb.append("placementIds=");
                            sb.append(l);
                            z = false;
                        } else {
                            sb.append("&placementIds=");
                            sb.append(l);
                        }
                    }
                    String string = sb.toString();
                    l78 l78VarM3831L2 = bl2Var.m3831L();
                    fb4 fb4Var3 = (fb4) ((m58) bl2Var.f8655a).f50618b;
                    l78VarM3831L2.mo6963a(fb4Var3.f38772c, string, jSONObject, fb4Var3.f38776g, r8, pb4Var);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: a */
    public final void mo231a() {
        this.f57541e.m3826F();
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: b */
    public final void mo232b() {
        eh0.m11114K();
        bl2 bl2Var = this.f57541e;
        if (((tb4) bl2Var.f8656b).f62098a != null) {
            eh0.m11135p("EmbeddedSessionManager", "Embedded session started twice");
        } else {
            bl2Var.f8656b = new tb4(new Date());
        }
        eh0.m11133m("IterableEmbeddedManager", "Calling start session");
        m19846c(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m19847d(long j, ArrayList arrayList) {
        eh0.m11114K();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = (List) this.f57537a.get(Long.valueOf(j));
        if (list != null) {
            for (rb4 rb4Var : new ArrayList(list)) {
                linkedHashMap.put((String) rb4Var.f59022a.f64166c, rb4Var);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            rb4 rb4Var2 = (rb4) it.next();
            if (!linkedHashMap.containsKey((String) rb4Var2.f59022a.f64166c)) {
                fb4 fb4Var = fb4.f38769t;
                if (fb4Var.m11690a()) {
                    bl2 bl2Var = fb4Var.f38780k;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        bl2Var.m3855l(jSONObject);
                        jSONObject.put("messageId", (String) rb4Var2.f59022a.f64166c);
                        jSONObject.put("deviceInfo", bl2Var.m3828H());
                        bl2Var.m3835P("embedded-messaging/events/received", jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                z = true;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            rb4 rb4Var3 = (rb4) it2.next();
            linkedHashMap2.put((String) rb4Var3.f59022a.f64166c, rb4Var3);
        }
        List list2 = (List) this.f57537a.get(Long.valueOf(j));
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (!linkedHashMap2.containsKey((String) ((rb4) it3.next()).f59022a.f64166c)) {
                    z = true;
                }
            }
        }
        this.f57537a.put(Long.valueOf(j), arrayList);
        if (z) {
            for (km5 km5Var : this.f57539c) {
                eh0.m11133m("IterableEmbeddedManager", "Calling updateHandler");
                km5Var.m15337a();
            }
        }
    }
}
