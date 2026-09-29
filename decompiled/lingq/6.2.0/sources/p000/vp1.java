package p000;

import android.util.Log;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class vp1 {

    /* JADX INFO: renamed from: a */
    public final t33 f65743a;

    public vp1(t33 t33Var) {
        this.f65743a = t33Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m23462a(h50 h50Var) {
        t33 t33Var = this.f65743a;
        HashSet<vh8> hashSet = h50Var.f41797a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(hashSet, 10));
        for (vh8 vh8Var : hashSet) {
            arrayList.add(wh8.m23953b(vh8Var.mo11536d(), vh8Var.mo11534b(), vh8Var.mo11535c(), vh8Var.mo11538f(), vh8Var.mo11537e()));
        }
        synchronized (((xh8) t33Var.f61791f)) {
            try {
                if (((xh8) t33Var.f61791f).m24519b(arrayList)) {
                    ((C1149a) t33Var.f61788c).f13669b.m9855a(new mv5(12, t33Var, ((xh8) t33Var.f61791f).m24518a()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
