package com.google.android.gms.measurement;

import ac.AbstractC0056c;
import ac.C0054a;
import ac.C0055b;
import ae.C0062b;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import cc.C1897o4;
import cc.InterfaceC1943t5;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    public static volatile AppMeasurement f14594b;

    /* JADX INFO: renamed from: a */
    public final AbstractC0056c f14595a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            C6272i.m12915i(bundle);
            this.mAppId = (String) C0062b.m263E2(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C0062b.m263E2(bundle, "origin", String.class, null);
            this.mName = (String) C0062b.m263E2(bundle, "name", String.class, null);
            this.mValue = C0062b.m263E2(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C0062b.m263E2(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C0062b.m263E2(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C0062b.m263E2(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C0062b.m263E2(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C0062b.m263E2(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C0062b.m263E2(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C0062b.m263E2(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C0062b.m263E2(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C0062b.m263E2(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C0062b.m263E2(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C0062b.m263E2(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C0062b.m263E2(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C1897o4 c1897o4) {
        this.f14595a = new C0054a(c1897o4);
    }

    public AppMeasurement(InterfaceC1943t5 interfaceC1943t5) {
        this.f14595a = new C0055b(interfaceC1943t5);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f14594b == null) {
            synchronized (AppMeasurement.class) {
                if (f14594b == null) {
                    InterfaceC1943t5 interfaceC1943t5 = (InterfaceC1943t5) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC1943t5 != null) {
                        f14594b = new AppMeasurement(interfaceC1943t5);
                    } else {
                        f14594b = new AppMeasurement(C1897o4.m5777s(context, new zzcl(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f14594b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f14595a.mo222o(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f14595a.mo223p(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f14595a.mo224q(str);
    }

    @Keep
    public long generateEventId() {
        return this.f14595a.mo213c();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f14595a.mo214e();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listMo218k = this.f14595a.mo218k(str, str2);
        ArrayList arrayList = new ArrayList(listMo218k == null ? 0 : listMo218k.size());
        Iterator it = listMo218k.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f14595a.mo215f();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f14595a.mo216h();
    }

    @Keep
    public String getGmpAppId() {
        return this.f14595a.mo217j();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f14595a.mo225r(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f14595a.mo219l(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f14595a.mo221n(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C6272i.m12915i(conditionalUserProperty);
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
            C0062b.m275H2(bundle, obj);
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
        this.f14595a.mo220m(bundle);
    }
}
