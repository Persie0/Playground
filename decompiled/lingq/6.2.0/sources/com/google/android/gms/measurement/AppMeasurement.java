package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.bob;
import p000.cfb;
import p000.hed;
import p000.kjc;
import p000.lda;
import p000.oxc;
import p000.rrb;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    public static volatile AppMeasurement f12306b;

    /* JADX INFO: renamed from: a */
    public final rrb f12307a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(kjc kjcVar) {
        this.f12307a = new cfb(kjcVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f12306b == null) {
            synchronized (AppMeasurement.class) {
                if (f12306b == null) {
                    oxc oxcVar = (oxc) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (oxcVar != null) {
                        f12306b = new AppMeasurement(oxcVar);
                    } else {
                        f12306b = new AppMeasurement(kjc.m15281r(context, new zzdb(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return f12306b;
    }

    public void beginAdUnitExposure(String str) {
        this.f12307a.mo4011p(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f12307a.mo4012q(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f12307a.mo4010o(str);
    }

    public long generateEventId() {
        return this.f12307a.mo4007l();
    }

    public String getAppInstanceId() {
        return this.f12307a.mo4015t();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo4013r = this.f12307a.mo4013r(str, str2);
        ArrayList arrayList = new ArrayList(listMo4013r == null ? 0 : listMo4013r.size());
        for (Bundle bundle : listMo4013r) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            lda.m16130p(bundle);
            conditionalUserProperty.mAppId = (String) hed.m13215c(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) hed.m13215c(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) hed.m13215c(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = hed.m13215c(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) hed.m13215c(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) hed.m13215c(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) hed.m13215c(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) hed.m13215c(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) hed.m13215c(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) hed.m13215c(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) hed.m13215c(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) hed.m13215c(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) hed.m13215c(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) hed.m13215c(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) hed.m13215c(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) hed.m13215c(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f12307a.mo4008m();
    }

    public String getCurrentScreenName() {
        return this.f12307a.mo4005f();
    }

    public String getGmpAppId() {
        return this.f12307a.mo4016u();
    }

    public int getMaxUserProperties(String str) {
        return this.f12307a.mo4014s(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f12307a.mo4017v(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f12307a.mo4006g(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        lda.m16130p(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            hed.m13214b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f12307a.mo4009n(bundle);
    }

    public AppMeasurement(oxc oxcVar) {
        this.f12307a = new bob(oxcVar);
    }
}
