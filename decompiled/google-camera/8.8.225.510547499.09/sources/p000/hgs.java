package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.Toast;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedAppSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedMainSwitchPreference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgs {

    /* JADX INFO: renamed from: a */
    public final Context f27730a;

    /* JADX INFO: renamed from: b */
    public final Executor f27731b;

    /* JADX INFO: renamed from: c */
    public final had f27732c;

    /* JADX INFO: renamed from: d */
    public final hah f27733d;

    /* JADX INFO: renamed from: e */
    public final hai f27734e;

    /* JADX INFO: renamed from: f */
    public final hgy f27735f;

    /* JADX INFO: renamed from: g */
    public final fcp f27736g;

    /* JADX INFO: renamed from: h */
    public final mwn f27737h;

    /* JADX INFO: renamed from: i */
    public final Map f27738i;

    /* JADX INFO: renamed from: j */
    public final Map f27739j;

    /* JADX INFO: renamed from: k */
    public final PackageManager f27740k;

    /* JADX INFO: renamed from: l */
    public mws f27741l;

    /* JADX INFO: renamed from: m */
    public PreferenceScreen f27742m;

    /* JADX INFO: renamed from: n */
    public Toast f27743n;

    public hgs(Context context, Executor executor, had hadVar, hah hahVar, hai haiVar, hgy hgyVar, fcp fcpVar) {
        int i = mws.f41739d;
        this.f27741l = mzr.f41857a;
        this.f27730a = context;
        this.f27731b = executor;
        this.f27732c = hadVar;
        this.f27733d = hahVar;
        this.f27734e = haiVar;
        this.f27735f = hgyVar;
        this.f27736g = fcpVar;
        this.f27737h = mws.m17090e();
        this.f27738i = new HashMap();
        this.f27739j = new HashMap();
        this.f27740k = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    public final void m10251a(MaterialManagedAppSwitchPreference materialManagedAppSwitchPreference, boolean z) {
        materialManagedAppSwitchPreference.mo1542k(z);
        this.f27732c.mo10045l(materialManagedAppSwitchPreference.f1590r, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m10252b(boolean z) {
        MaterialManagedMainSwitchPreference materialManagedMainSwitchPreference = (MaterialManagedMainSwitchPreference) this.f27742m.m1533l(gzy.f27004P.f26977a);
        materialManagedMainSwitchPreference.getClass();
        materialManagedMainSwitchPreference.mo1542k(z);
        this.f27734e.mo10033e(gzy.f27004P, Boolean.valueOf(z));
        this.f27734e.mo10033e(gzy.f27007S, true);
    }
}
