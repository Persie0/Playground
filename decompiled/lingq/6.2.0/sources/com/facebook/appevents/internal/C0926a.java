package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Set;
import kotlin.AbstractC3192a;
import org.json.JSONObject;
import p000.cs4;
import p000.lp1;
import p000.p58;

/* JADX INFO: renamed from: com.facebook.appevents.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0926a {

    /* JADX INFO: renamed from: b */
    public static final p58 f11409b = new p58(7);

    /* JADX INFO: renamed from: c */
    public static volatile C0926a f11410c;

    /* JADX INFO: renamed from: a */
    public final cs4 f11411a = AbstractC3192a.m15356a(AppLinkManager$preferences$2.f11408b);

    /* JADX INFO: renamed from: a */
    public final SharedPreferences m5194a() {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            Object value = this.f11411a.getValue();
            value.getClass();
            return (SharedPreferences) value;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5195b(Activity activity) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            intent.getClass();
            m5196c(data, intent);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:5:0x0009, B:20:0x0037, B:29:0x004d, B:32:0x0053, B:18:0x0031, B:9:0x0016, B:12:0x001d, B:16:0x0029, B:23:0x0040, B:26:0x0047), top: B:39:0x0009, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:23:0x0040, B:26:0x0047), top: B:45:0x0040, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:5:0x0009, B:20:0x0037, B:29:0x004d, B:32:0x0053, B:18:0x0031, B:9:0x0016, B:12:0x001d, B:16:0x0029, B:23:0x0040, B:26:0x0047), top: B:39:0x0009, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final void m5196c(Uri uri, Intent intent) {
        String string;
        Bundle bundleExtra;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            String string2 = null;
            if (set.contains(this)) {
                string = null;
            } else {
                try {
                    String queryParameter = uri.getQueryParameter("al_applink_data");
                    if (queryParameter == null) {
                        string = null;
                    } else {
                        try {
                            string = new JSONObject(queryParameter).getString("campaign_ids");
                        } catch (Exception unused) {
                            Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                            string = null;
                            if (string == null) {
                                if (!lp1.f49971a.contains(this)) {
                                    try {
                                        bundleExtra = intent.getBundleExtra("al_applink_data");
                                        if (bundleExtra == null) {
                                            string2 = bundleExtra.getString("campaign_ids");
                                        }
                                    } catch (Throwable th) {
                                        lp1.m16420a(this, th);
                                    }
                                }
                                string = string2;
                            }
                            if (string != null) {
                                m5194a().edit().putString("campaign_ids", string).apply();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    lp1.m16420a(this, th2);
                    string = null;
                }
            }
            if (string == null) {
                if (!lp1.f49971a.contains(this)) {
                    bundleExtra = intent.getBundleExtra("al_applink_data");
                    if (bundleExtra == null) {
                        string2 = bundleExtra.getString("campaign_ids");
                    }
                }
                string = string2;
            }
            if (string != null) {
                m5194a().edit().putString("campaign_ids", string).apply();
            }
        } catch (Throwable th3) {
            lp1.m16420a(this, th3);
        }
    }
}
