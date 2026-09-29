package p000;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType;
import com.facebook.internal.FeatureManager$Feature;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cz8 {

    /* JADX INFO: renamed from: a */
    public final C3388nx f34739a;

    /* JADX INFO: renamed from: b */
    public final String f34740b;

    /* JADX INFO: renamed from: c */
    public ArrayList f34741c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f34742d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f34743e;

    public cz8(C3388nx c3388nx, String str) {
        this.f34739a = c3388nx;
        this.f34740b = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9940a(AppEvent appEvent) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            appEvent.getClass();
            if (this.f34741c.size() + this.f34742d.size() >= 1000) {
                this.f34743e++;
            } else {
                this.f34741c.add(appEvent);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m9941b(boolean z) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        if (z) {
            try {
                this.f34741c.addAll(this.f34742d);
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return;
            }
        }
        this.f34742d.clear();
        this.f34743e = 0;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized List m9942c() {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f34741c;
            this.f34741c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m9943d(mp3 mp3Var, Context context, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        if (lp1.f49971a.contains(this)) {
            return 0;
        }
        try {
            try {
                synchronized (this) {
                    try {
                        int i = this.f34743e;
                        st2.m21735b(this.f34741c);
                        this.f34742d.addAll(this.f34741c);
                        this.f34741c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (AppEvent appEvent : this.f34742d) {
                            try {
                                if (z || !appEvent.f11382c) {
                                    jSONArray.put(appEvent.f11380a);
                                    jSONArray2.put(appEvent.f11381b);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            m9944e(mp3Var, context, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    lp1.m16420a(this, th);
                    return 0;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th = th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9944e(mp3 mp3Var, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (lp1.f49971a.contains(this)) {
                return;
            }
            try {
                jSONObject = AbstractC3049gs.m12857a(AppEventsLoggerUtility$GraphAPIActivityType.CUSTOM_APP_EVENTS, this.f34739a, this.f34740b, z, context);
                if (this.f34743e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            mp3Var.f51693c = jSONObject;
            Bundle bundle = mp3Var.f51694d;
            String string = jSONArray.toString();
            string.getClass();
            bundle.putString("custom_events", string);
            if (p13.m18852b(FeatureManager$Feature.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            mp3Var.f51695e = string;
            mp3Var.f51694d = bundle;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
