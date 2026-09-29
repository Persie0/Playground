package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g53 {

    /* JADX INFO: renamed from: b */
    public static final C3723wi f40227b = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f40228a = new ConcurrentHashMap();

    public g53(q43 q43Var, uo7 uo7Var, x43 x43Var, uo7 uo7Var2, RemoteConfigManager remoteConfigManager, dh1 dh1Var, SessionManager sessionManager) {
        Bundle bundle;
        if (q43Var == null) {
            new a14(new Bundle());
            return;
        }
        a53 a53Var = q43Var.f57254c;
        mba mbaVar = mba.f50883N;
        mbaVar.f50892d = q43Var;
        q43Var.m19644a();
        mbaVar.f50887K = a53Var.f266g;
        mbaVar.f50894f = x43Var;
        mbaVar.f50895g = uo7Var2;
        mbaVar.f50897i.execute(new lba(mbaVar, 1));
        q43Var.m19644a();
        Context context = q43Var.f57252a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        a14 a14Var = bundle != null ? new a14(bundle) : new a14();
        remoteConfigManager.setFirebaseRemoteConfigProvider(uo7Var);
        dh1Var.f35643b = a14Var;
        dh1.f35640d.f66844b = kaa.m15042d(context);
        dh1Var.f35644c.m23845c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolM10385f = dh1Var.m10385f();
        C3723wi c3723wi = f40227b;
        if (c3723wi.f66844b) {
            if (boolM10385f != null ? boolM10385f.booleanValue() : q43.m19641c().m19648h()) {
                q43Var.m19644a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(AbstractC3184kh.m15224r(a53Var.f266g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (c3723wi.f66844b) {
                    c3723wi.f66843a.getClass();
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }
}
