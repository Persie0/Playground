package p000;

import com.google.firebase.perf.p010v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: vs */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3696vs implements InterfaceC3622ts {
    private final C3659us appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private ApplicationProcessState currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<InterfaceC3622ts> appStateCallback = new WeakReference<>(this);

    public AbstractC3696vs(C3659us c3659us) {
        this.appStateMonitor = c3659us;
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    public WeakReference<InterfaceC3622ts> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.f64275h.addAndGet(i);
    }

    @Override // p000.InterfaceC3622ts
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else {
            if (applicationProcessState2 == applicationProcessState || applicationProcessState == applicationProcessState3) {
                return;
            }
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        C3659us c3659us = this.appStateMonitor;
        this.currentAppState = c3659us.f64265J;
        WeakReference<InterfaceC3622ts> weakReference = this.appStateCallback;
        synchronized (c3659us.f64273f) {
            c3659us.f64273f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            C3659us c3659us = this.appStateMonitor;
            WeakReference<InterfaceC3622ts> weakReference = this.appStateCallback;
            synchronized (c3659us.f64273f) {
                c3659us.f64273f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
