package com.iterable.iterableapi;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p000.eh0;
import p000.pb4;
import p000.qc4;
import p000.vb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C1223s {

    /* JADX INFO: renamed from: b */
    public static final HashMap f14094b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final HashMap f14095c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final C1221q f14096a;

    public C1223s(C1221q c1221q, C1220p c1220p) {
        this.f14096a = c1221q;
        c1220p.f14082g.add(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m6967a(C1205a c1205a, vb4 vb4Var, pb4 pb4Var) {
        try {
            JSONObject jSONObjectM6895b = c1205a.m6895b();
            String str = c1205a.f13980b;
            IterableTaskType iterableTaskType = IterableTaskType.API;
            String string = jSONObjectM6895b.toString();
            C1221q c1221q = this.f14096a;
            String str2 = null;
            if (c1221q.m6962c()) {
                ContentValues contentValues = new ContentValues();
                IterableTaskType iterableTaskType2 = IterableTaskType.API;
                C1218n c1218n = new C1218n();
                String string2 = UUID.randomUUID().toString();
                c1218n.f14060a = string2;
                c1218n.f14061b = str;
                long time = new Date().getTime();
                c1218n.f14063d = time;
                long time2 = new Date().getTime();
                long time3 = new Date().getTime();
                c1218n.f14069j = string;
                c1218n.f14071l = iterableTaskType2;
                contentValues.put("task_id", string2);
                contentValues.put("name", str);
                contentValues.put("version", Integer.valueOf(c1218n.f14062c));
                contentValues.put("created", Long.valueOf(time));
                long j = c1218n.f14064e;
                if (j != 0) {
                    contentValues.put("modified", Long.valueOf(j));
                }
                long j2 = c1218n.f14065f;
                if (j2 != 0) {
                    contentValues.put("last_attempt", Long.valueOf(j2));
                }
                if (time2 != 0) {
                    contentValues.put("scheduled", Long.valueOf(time2));
                }
                if (time3 != 0) {
                    contentValues.put("requested", Long.valueOf(time3));
                }
                contentValues.put("processing", Boolean.valueOf(c1218n.f14066g));
                contentValues.put("failed", Boolean.valueOf(c1218n.f14067h));
                contentValues.put("blocking", Boolean.valueOf(c1218n.f14068i));
                if (string != null) {
                    contentValues.put("data", string);
                }
                String str3 = c1218n.f14070k;
                if (str3 != null) {
                    contentValues.put("error", str3);
                }
                contentValues.put("type", iterableTaskType2.toString());
                contentValues.put("attempts", Integer.valueOf(c1218n.f14072m));
                if (c1221q.f14085a.insert("OfflineTask", null, contentValues) == -1) {
                    new Handler(Looper.getMainLooper()).post(new qc4(c1221q));
                } else {
                    contentValues.clear();
                    new Handler(Looper.getMainLooper()).post(new qc4(c1221q, c1218n));
                    str2 = string2;
                }
            }
            if (str2 == null) {
                new AsyncTaskC1217m().execute(c1205a);
            } else {
                f14094b.put(str2, vb4Var);
                f14095c.put(str2, pb4Var);
            }
        } catch (JSONException unused) {
            eh0.m11135p("RequestProcessor", "Failed serializing the request for offline execution. Attempting to request the request now...");
            new AsyncTaskC1217m().execute(c1205a);
        }
    }
}
