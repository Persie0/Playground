package com.google.firebase.perf.session;

import android.content.Context;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p000.AbstractC3696vs;
import p000.C3659us;
import p000.oy8;
import p000.yg1;

/* JADX INFO: loaded from: classes.dex */
public class SessionManager extends AbstractC3696vs {
    private static final SessionManager instance = new SessionManager();
    private final C3659us appStateMonitor;
    private final Set<WeakReference<oy8>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, C3659us c3659us) {
        super(C3659us.m22881a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = c3659us;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.f13786c) {
            this.gaugeManager.logGaugeMetadata(perfSession.f13784a, ApplicationProcessState.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.f13786c) {
            this.gaugeManager.logGaugeMetadata(perfSession.f13784a, applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        boolean z = perfSession.f13786c;
        GaugeManager gaugeManager = this.gaugeManager;
        if (z) {
            gaugeManager.startCollectingGauges(perfSession, applicationProcessState);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    @Override // p000.AbstractC3696vs, p000.InterfaceC3622ts
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        super.onUpdateAppState(applicationProcessState);
        if (this.appStateMonitor.f64267L) {
            return;
        }
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            updatePerfSession(PerfSession.m6734c(UUID.randomUUID().toString()));
        } else if (this.perfSession.m6736d()) {
            updatePerfSession(PerfSession.m6734c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(applicationProcessState);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<oy8> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new yg1(this, context, this.perfSession, 4));
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.m6736d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<oy8> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.f13784a == this.perfSession.f13784a) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<oy8>> it = this.clients.iterator();
                while (it.hasNext()) {
                    oy8 oy8Var = it.next().get();
                    if (oy8Var != null) {
                        oy8Var.mo6730a(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.f64265J);
        startOrStopCollectingGauges(this.appStateMonitor.f64265J);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.m6734c(UUID.randomUUID().toString()), C3659us.m22881a());
    }
}
