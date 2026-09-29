package com.clevertap.android.sdk.p049db;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p289o5.C7940t;
import p290o6.C7977q0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.db.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2185b extends AbstractC2184a {

    /* JADX INFO: renamed from: a */
    public DBAdapter f11043a;

    /* JADX INFO: renamed from: b */
    public final C7940t f11044b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f11045c;

    public C2185b(CleverTapInstanceConfig cleverTapInstanceConfig, C7940t c7940t) {
        this.f11045c = cleverTapInstanceConfig;
        this.f11044b = c7940t;
    }

    @Override // com.clevertap.android.sdk.p049db.AbstractC2184a
    /* JADX INFO: renamed from: a */
    public final void mo6478a(Context context) {
        synchronized (((Boolean) this.f11044b.f43256a)) {
            DBAdapter dBAdapterMo6479b = mo6479b(context);
            dBAdapterMo6479b.m6472i(DBAdapter.Table.EVENTS);
            dBAdapterMo6479b.m6472i(DBAdapter.Table.PROFILE_EVENTS);
            SharedPreferences.Editor editorEdit = C7977q0.m15827e(context, "IJ").edit();
            editorEdit.clear();
            C7977q0.m15830h(editorEdit);
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f11045c;
            C7977q0.m15831i(context, 0, C7977q0.m15833k(cleverTapInstanceConfig, "comms_first_ts"));
            C7977q0.m15831i(context, 0, C7977q0.m15833k(cleverTapInstanceConfig, "comms_last_ts"));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.clevertap.android.sdk.p049db.AbstractC2184a
    /* JADX INFO: renamed from: b */
    public final DBAdapter mo6479b(Context context) {
        if (this.f11043a == null) {
            DBAdapter dBAdapter = new DBAdapter(context, this.f11045c);
            this.f11043a = dBAdapter;
            DBAdapter.Table table = DBAdapter.Table.EVENTS;
            synchronized (dBAdapter) {
                dBAdapter.m6465b(table, 432000000L);
            }
            DBAdapter dBAdapter2 = this.f11043a;
            DBAdapter.Table table2 = DBAdapter.Table.PROFILE_EVENTS;
            synchronized (dBAdapter2) {
                dBAdapter2.m6465b(table2, 432000000L);
            }
            DBAdapter dBAdapter3 = this.f11043a;
            DBAdapter.Table table3 = DBAdapter.Table.PUSH_NOTIFICATION_VIEWED;
            synchronized (dBAdapter3) {
                try {
                    dBAdapter3.m6465b(table3, 432000000L);
                } finally {
                }
            }
            DBAdapter dBAdapter4 = this.f11043a;
            synchronized (dBAdapter4) {
                dBAdapter4.m6465b(DBAdapter.Table.PUSH_NOTIFICATIONS, 0L);
            }
        }
        return this.f11043a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final C2186c m6480c(Context context, DBAdapter.Table table, C2186c c2186c) {
        C2186c c2186c2;
        synchronized (((Boolean) this.f11044b.f43256a)) {
            DBAdapter dBAdapterMo6479b = mo6479b(context);
            if (c2186c != null) {
                table = c2186c.f11048c;
            }
            if (c2186c != null) {
                dBAdapterMo6479b.m6466c(c2186c.f11047b, c2186c.f11048c);
            }
            c2186c2 = new C2186c();
            c2186c2.f11048c = table;
            JSONObject jSONObjectM6467d = dBAdapterMo6479b.m6467d(table);
            if (jSONObjectM6467d != null) {
                Iterator<String> itKeys = jSONObjectM6467d.keys();
                if (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c2186c2.f11047b = next;
                    try {
                        c2186c2.f11046a = jSONObjectM6467d.getJSONArray(next);
                    } catch (JSONException unused) {
                        c2186c2.f11047b = null;
                        c2186c2.f11046a = null;
                    }
                }
                throw th;
            }
        }
        return c2186c2;
    }

    /* JADX INFO: renamed from: d */
    public final void m6481d(Context context, JSONObject jSONObject, DBAdapter.Table table) {
        synchronized (((Boolean) this.f11044b.f43256a)) {
            if (mo6479b(context).m6473j(jSONObject, table) > 0) {
                C2181a c2181aM6433b = this.f11045c.m6433b();
                String str = this.f11045c.f10995a;
                String str2 = "Queued event: " + jSONObject.toString();
                c2181aM6433b.getClass();
                C2181a.m6452d(str, str2);
                C2181a c2181aM6433b2 = this.f11045c.m6433b();
                String str3 = this.f11045c.f10995a;
                String str4 = "Queued event to DB table " + table + ": " + jSONObject.toString();
                c2181aM6433b2.getClass();
                C2181a.m6460m(str3, str4);
            }
        }
    }
}
