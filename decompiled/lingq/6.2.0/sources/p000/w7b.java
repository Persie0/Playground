package p000;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.C0773b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w7b {

    /* JADX INFO: renamed from: i */
    public static final String f66495i = oj5.m18041h("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final C0773b f66496a;

    /* JADX INFO: renamed from: b */
    public final String f66497b;

    /* JADX INFO: renamed from: c */
    public final ExistingWorkPolicy f66498c;

    /* JADX INFO: renamed from: d */
    public final List f66499d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f66500e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f66501f;

    /* JADX INFO: renamed from: g */
    public boolean f66502g;

    /* JADX INFO: renamed from: h */
    public web f66503h;

    public w7b(C0773b c0773b, String str, ExistingWorkPolicy existingWorkPolicy, List list, int i) {
        this.f66496a = c0773b;
        this.f66497b = str;
        this.f66498c = existingWorkPolicy;
        this.f66499d = list;
        this.f66500e = new ArrayList(list.size());
        this.f66501f = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && ((l8b) list.get(i2)).f49310b.f55792u != Long.MAX_VALUE) {
                C3386nv.m17626m("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((l8b) list.get(i2)).f49309a.toString();
            string.getClass();
            this.f66500e.add(string);
            this.f66501f.add(string);
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashSet m23804b(w7b w7bVar) {
        HashSet hashSet = new HashSet();
        w7bVar.getClass();
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final web m23805a() {
        if (this.f66502g) {
            oj5.m18040f().m18046j(f66495i, "Already enqueued work ids (" + TextUtils.join(", ", this.f66500e) + ")");
        } else {
            C0773b c0773b = this.f66496a;
            this.f66503h = pyb.m19571a(c0773b.f7205b.f42359m, "EnqueueRunnable_" + this.f66498c.name(), c0773b.f7207d.f36847a, new br8(this, 20));
        }
        return this.f66503h;
    }

    public w7b(C0773b c0773b, List list) {
        this(c0773b, null, ExistingWorkPolicy.KEEP, list, 0);
    }

    public w7b(C0773b c0773b, String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        this(c0773b, str, existingWorkPolicy, list, 0);
    }
}
