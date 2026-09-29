package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.config.C1155a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lba implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mba f49417b;

    public /* synthetic */ lba(mba mbaVar, int i) {
        this.f49416a = i;
        this.f49417b = mbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1155a c1155a;
        String str;
        int i = this.f49416a;
        mba mbaVar = this.f49417b;
        switch (i) {
            case 0:
                tq7 tq7Var = mbaVar.f50900l;
                boolean z = mbaVar.f50888L;
                tq7Var.f62737d.m21588a(z);
                tq7Var.f62738e.m21588a(z);
                return;
            default:
                q43 q43Var = mbaVar.f50892d;
                q43Var.m19644a();
                Context context = q43Var.f57252a;
                mbaVar.f50898j = context;
                mbaVar.f50886J = context.getPackageName();
                mbaVar.f50899k = dh1.m10376e();
                mbaVar.f50900l = new tq7(mbaVar.f50898j, new r52(100L, 1L, TimeUnit.MINUTES));
                mbaVar.f50884H = C3659us.m22881a();
                uo7 uo7Var = mbaVar.f50895g;
                dh1 dh1Var = mbaVar.f50899k;
                dh1Var.getClass();
                C1155a c1155a2 = C1155a.f13740h;
                synchronized (C1155a.class) {
                    try {
                        if (C1155a.f13740h == null) {
                            C1155a.f13740h = new C1155a();
                        }
                        c1155a = C1155a.f13740h;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1155a.getClass();
                Long l = (Long) dh1Var.f35642a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = C1155a.f13741i;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    mz6 mz6VarM10384d = dh1Var.m10384d(c1155a);
                    str = mz6VarM10384d.m17160b() ? (String) mz6VarM10384d.m17159a() : "FIREPERF";
                } else {
                    dh1Var.f35644c.m23848f("com.google.firebase.perf.LogSourceName", str);
                }
                mbaVar.f50896h = new w63(uo7Var, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = mbaVar.f50890b;
                C3659us c3659us = mbaVar.f50884H;
                WeakReference weakReference = new WeakReference(mba.f50883N);
                synchronized (c3659us.f64273f) {
                    c3659us.f64273f.add(weakReference);
                    break;
                }
                C3310lt c3310ltM18464D = C3435ot.m18464D();
                mbaVar.f50885I = c3310ltM18464D;
                q43 q43Var2 = mbaVar.f50892d;
                q43Var2.m19644a();
                String str2 = q43Var2.f57254c.f261b;
                c3310ltM18464D.m22767h();
                C3435ot.m18465s((C3435ot) c3310ltM18464D.f64019b, str2);
                C3183kg c3183kgM16816y = C3334mg.m16816y();
                String str3 = mbaVar.f50886J;
                c3183kgM16816y.m22767h();
                C3334mg.m16812s((C3334mg) c3183kgM16816y.f64019b, str3);
                c3183kgM16816y.m22767h();
                C3334mg.m16813t((C3334mg) c3183kgM16816y.f64019b);
                Context context2 = mbaVar.f50898j;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                c3183kgM16816y.m22767h();
                C3334mg.m16814u((C3334mg) c3183kgM16816y.f64019b, str4);
                c3310ltM18464D.m22767h();
                C3435ot.m18469w((C3435ot) c3310ltM18464D.f64019b, (C3334mg) c3183kgM16816y.m22766g());
                mbaVar.f50891c.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    t67 t67Var = (t67) concurrentLinkedQueue.poll();
                    if (t67Var != null) {
                        mbaVar.f50897i.execute(new ks6(5, mbaVar, t67Var));
                    }
                }
                return;
        }
    }
}
