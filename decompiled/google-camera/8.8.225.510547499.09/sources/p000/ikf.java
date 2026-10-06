package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.optionsbar.view.TimerWidget;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikf implements ikg {

    /* JADX INFO: renamed from: a */
    private final oju f31341a;

    public ikf(oju ojuVar) {
        this.f31341a = ojuVar;
    }

    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        jfs jfsVar = (jfs) ((djm) this.f31341a.get()).f11789c;
        TimerWidget timerWidget = (TimerWidget) jfsVar.m13100f(C0100R.id.timer_widget);
        MainActivityLayout mainActivityLayout = (MainActivityLayout) jfsVar.m13100f(C0100R.id.activity_root_view);
        mainActivityLayout.f7256f = timerWidget;
        mainActivityLayout.m4475p();
    }
}
