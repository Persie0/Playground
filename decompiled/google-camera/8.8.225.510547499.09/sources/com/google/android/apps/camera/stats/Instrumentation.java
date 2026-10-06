package com.google.android.apps.camera.stats;

import com.google.android.apps.camera.stats.timing.TimingSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.hea;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Instrumentation {

    /* JADX INFO: renamed from: a */
    private static Instrumentation f6950a = null;

    /* JADX INFO: renamed from: b */
    private final List f6951b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static synchronized void m4295d(Instrumentation instrumentation) {
        f6950a = instrumentation;
    }

    public static synchronized Instrumentation instance() {
        return f6950a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized TimingSession m4296a(Class cls) {
        List listM4297b;
        listM4297b = m4297b(cls);
        return (TimingSession) listM4297b.get(listM4297b.size() - 1);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized List m4297b(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f6951b.iterator();
        while (it.hasNext()) {
            TimingSession timingSession = (TimingSession) ((WeakReference) it.next()).get();
            if (timingSession != null && timingSession.getClass().equals(cls)) {
                arrayList.add(timingSession);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4298c(WeakReference weakReference) {
        this.f6951b.remove(weakReference.get());
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m4299e(Class cls) {
        return !m4297b(cls).isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m4300f(TimingSession timingSession) {
        this.f6951b.add(new WeakReference(timingSession));
        timingSession.mo4303b(new hea(this, timingSession, 14));
    }
}
