package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import p000.AbstractC3393o1;
import p000.AbstractC3696vs;
import p000.C3386nv;
import p000.C3659us;
import p000.C3670v2;
import p000.C3723wi;
import p000.dh1;
import p000.gw9;
import p000.mba;
import p000.oy8;
import p000.s46;
import p000.wq1;
import p000.z67;

/* JADX INFO: loaded from: classes.dex */
public class Trace extends AbstractC3696vs implements Parcelable, oy8 {
    public static final Parcelable.Creator<Trace> CREATOR;

    /* JADX INFO: renamed from: H */
    public static final C3723wi f13771H = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public final WeakReference f13772a;

    /* JADX INFO: renamed from: b */
    public final Trace f13773b;

    /* JADX INFO: renamed from: c */
    public final GaugeManager f13774c;

    /* JADX INFO: renamed from: d */
    public final String f13775d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f13776e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f13777f;

    /* JADX INFO: renamed from: g */
    public final List f13778g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f13779h;

    /* JADX INFO: renamed from: i */
    public final mba f13780i;

    /* JADX INFO: renamed from: j */
    public final s46 f13781j;

    /* JADX INFO: renamed from: k */
    public Timer f13782k;

    /* JADX INFO: renamed from: l */
    public Timer f13783l;

    static {
        new ConcurrentHashMap();
        CREATOR = new C3670v2(11);
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : C3659us.m22881a());
        this.f13772a = new WeakReference(this);
        this.f13773b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f13775d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f13779h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f13776e = concurrentHashMap;
        this.f13777f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f13782k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f13783l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f13778g = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f13780i = null;
            this.f13781j = null;
            this.f13774c = null;
        } else {
            this.f13780i = mba.f50883N;
            this.f13781j = new s46(8);
            this.f13774c = GaugeManager.getInstance();
        }
    }

    @Override // p000.oy8
    /* JADX INFO: renamed from: a */
    public final void mo6730a(PerfSession perfSession) {
        if (perfSession == null) {
            f13771H.m23975f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.f13782k == null || m6731b()) {
                return;
            }
            this.f13778g.add(perfSession);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6731b() {
        return this.f13783l != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.f13782k != null) && !m6731b()) {
                f13771H.m23976g("Trace '%s' is started but not stopped when it is destructed!", this.f13775d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public String getAttribute(String str) {
        return (String) this.f13777f.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.f13777f);
    }

    public long getLongMetric(String str) {
        Counter counter = str != null ? (Counter) this.f13776e.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.f13770b.get();
    }

    public void incrementMetric(String str, long j) {
        String strM25471c = z67.m25471c(str);
        C3723wi c3723wi = f13771H;
        if (strM25471c != null) {
            c3723wi.m23973c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strM25471c);
            return;
        }
        Timer timer = this.f13782k;
        String str2 = this.f13775d;
        if (timer == null) {
            c3723wi.m23976g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (m6731b()) {
            c3723wi.m23976g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f13776e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.f13770b;
        atomicLong.addAndGet(j);
        c3723wi.m23972b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    public void putAttribute(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f13777f;
        C3723wi c3723wi = f13771H;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean zM6731b = m6731b();
            String str3 = this.f13775d;
            if (zM6731b) {
                Locale locale = Locale.ENGLISH;
                C3386nv.m17626m(wq1.m24118n("Trace '", str3, "' has been stopped"));
            } else if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
                z67.m25470b(str, str2);
            } else {
                Locale locale2 = Locale.ENGLISH;
                C3386nv.m17626m("Exceeds max limit of number of attributes - 5");
            }
            c3723wi.m23972b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z = true;
        } catch (Exception e) {
            c3723wi.m23973c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    public void putMetric(String str, long j) {
        String strM25471c = z67.m25471c(str);
        C3723wi c3723wi = f13771H;
        if (strM25471c != null) {
            c3723wi.m23973c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strM25471c);
            return;
        }
        Timer timer = this.f13782k;
        String str2 = this.f13775d;
        if (timer == null) {
            c3723wi.m23976g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (m6731b()) {
            c3723wi.m23976g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f13776e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.f13770b.set(j);
        c3723wi.m23972b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    public void removeAttribute(String str) {
        if (!m6731b()) {
            this.f13777f.remove(str);
            return;
        }
        C3723wi c3723wi = f13771H;
        if (c3723wi.f66844b) {
            c3723wi.f66843a.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    public void start() {
        String str;
        boolean zM10390n = dh1.m10376e().m10390n();
        C3723wi c3723wi = f13771H;
        if (!zM10390n) {
            c3723wi.m23971a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = z67.f70988a;
        String str2 = this.f13775d;
        if (str2 != null) {
            if (str2.length() <= 100) {
                if (!str2.startsWith("_")) {
                    str = null;
                    break;
                }
                Constants$TraceNames[] constants$TraceNamesArrValues = Constants$TraceNames.values();
                int length = constants$TraceNamesArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        if (!str2.startsWith("_st_")) {
                            str = "Trace name must not start with '_'";
                            break;
                        }
                        break;
                    } else if (!constants$TraceNamesArrValues[i].toString().equals(str2)) {
                        i++;
                    }
                    str = null;
                    break;
                }
            } else {
                Locale locale = Locale.US;
                str = "Trace name must not exceed 100 characters";
            }
        } else {
            str = "Trace name must not be null";
        }
        if (str != null) {
            c3723wi.m23973c("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.f13782k != null) {
            c3723wi.m23973c("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.f13781j.getClass();
        this.f13782k = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f13772a);
        mo6730a(perfSession);
        if (perfSession.f13786c) {
            this.f13774c.collectGaugeMetricOnce(perfSession.f13785b);
        }
    }

    public void stop() {
        Timer timer = this.f13782k;
        String str = this.f13775d;
        C3723wi c3723wi = f13771H;
        if (timer == null) {
            c3723wi.m23973c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (m6731b()) {
            c3723wi.m23973c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f13772a);
        unregisterForAppState();
        this.f13781j.getClass();
        Timer timer2 = new Timer();
        this.f13783l = timer2;
        if (this.f13773b == null) {
            ArrayList arrayList = this.f13779h;
            int i = 1;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) AbstractC3393o1.m17731f(1, arrayList);
                if (trace.f13783l == null) {
                    trace.f13783l = timer2;
                }
            }
            if (str.isEmpty()) {
                if (c3723wi.f66844b) {
                    c3723wi.f66843a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.f13780i.m16751c(new gw9(this, i).m12934b(), getAppState());
            if (SessionManager.getInstance().perfSession().f13786c) {
                this.f13774c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f13785b);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13773b, 0);
        parcel.writeString(this.f13775d);
        parcel.writeList(this.f13779h);
        parcel.writeMap(this.f13776e);
        parcel.writeParcelable(this.f13782k, 0);
        parcel.writeParcelable(this.f13783l, 0);
        synchronized (this.f13778g) {
            parcel.writeList(this.f13778g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, mba mbaVar, s46 s46Var, C3659us c3659us) {
        super(c3659us);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.f13772a = new WeakReference(this);
        this.f13773b = null;
        this.f13775d = str.trim();
        this.f13779h = new ArrayList();
        this.f13776e = new ConcurrentHashMap();
        this.f13777f = new ConcurrentHashMap();
        this.f13781j = s46Var;
        this.f13780i = mbaVar;
        this.f13778g = Collections.synchronizedList(new ArrayList());
        this.f13774c = gaugeManager;
    }
}
