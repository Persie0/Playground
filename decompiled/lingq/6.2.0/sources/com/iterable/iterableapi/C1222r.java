package com.iterable.iterableapi;

import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import p000.l78;
import p000.ob4;
import p000.pb4;
import p000.sr3;
import p000.ub4;
import p000.vb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1222r implements l78 {

    /* JADX INFO: renamed from: e */
    public static final HashSet f14089e = new HashSet(Arrays.asList("events/track", "events/trackPushOpen", "commerce/trackPurchase", "events/trackInAppOpen", "events/trackInAppClick", "events/trackInAppClose", "events/trackInboxSession", "events/trackInAppDelivery", "events/inAppConsume", "commerce/updateCart", "embedded-messaging/events/received", "embedded-messaging/events/click", "embedded-messaging/events/session"));

    /* JADX INFO: renamed from: a */
    public C1223s f14090a;

    /* JADX INFO: renamed from: b */
    public C1220p f14091b;

    /* JADX INFO: renamed from: c */
    public C1221q f14092c;

    /* JADX INFO: renamed from: d */
    public sr3 f14093d;

    @Override // p000.l78
    /* JADX INFO: renamed from: a */
    public final void mo6963a(String str, String str2, JSONObject jSONObject, String str3, ob4 ob4Var, pb4 pb4Var) {
        new AsyncTaskC1217m().execute(new C1205a(str, str2, jSONObject, "GET", str3, ob4Var, pb4Var));
    }

    @Override // p000.l78
    /* JADX INFO: renamed from: b */
    public final void mo6964b() {
        this.f14092c.m6961b();
    }

    @Override // p000.l78
    /* JADX INFO: renamed from: c */
    public final void mo6965c(String str, String str2, JSONObject jSONObject, String str3, ub4 ub4Var) {
        new AsyncTaskC1217m().execute(new C1205a(str, str2, jSONObject, "GET", str3, ub4Var));
    }

    @Override // p000.l78
    /* JADX INFO: renamed from: d */
    public final void mo6966d(String str, String str2, JSONObject jSONObject, String str3, vb4 vb4Var, pb4 pb4Var) {
        C1205a c1205a = new C1205a(str, str2, jSONObject, "POST", str3, vb4Var, pb4Var);
        if (!f14089e.contains(c1205a.f13980b) || !this.f14093d.m21668a()) {
            new AsyncTaskC1217m().execute(c1205a);
        } else {
            c1205a.f13984f = IterableApiRequest$ProcessorType.OFFLINE;
            this.f14090a.m6967a(c1205a, vb4Var, pb4Var);
        }
    }
}
