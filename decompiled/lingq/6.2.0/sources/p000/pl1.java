package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.measurement.C0962f;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class pl1 {

    /* JADX INFO: renamed from: a */
    public volatile Object f56397a;

    /* JADX INFO: renamed from: b */
    public Object f56398b;

    /* JADX INFO: renamed from: a */
    public t9d m19384a(final C0962f c0962f) {
        final u7d u7dVar = (u7d) this.f56397a;
        u7d u7dVar2 = t9d.f62027j;
        if (u7dVar != u7dVar2) {
            li1 li1Var = t9d.f62026i;
            li1Var.getClass();
            final qb2 qb2Var = new qb2();
            int i = 0;
            qb2Var.f57531a = false;
            ConcurrentHashMap concurrentHashMap = li1Var.f49695a;
            Context context = c0962f.f11845b;
            String str = u7dVar.f63532d;
            if (str == null) {
                str = (String) u7dVar.f63529a.apply(context);
                u7dVar.f63532d = str;
            }
            x7d x7dVar = (x7d) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: h9d
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    x7d x7dVar2 = new x7d(new t9d(c0962f, u7dVar));
                    qb2Var.f57531a = true;
                    return x7dVar2;
                }
            });
            if (qb2Var.f57531a) {
                Context context2 = c0962f.f11845b;
                gw9 gw9Var = new gw9(li1Var, 16);
                if (wcd.f66630b == null) {
                    synchronized (wcd.class) {
                        try {
                            if (wcd.f66630b == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new wcd(i), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new wcd(i), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                wcd.f66630b = gw9Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.f56398b = x7dVar.f67910a;
            this.f56397a = u7dVar2;
        }
        return (t9d) this.f56398b;
    }
}
