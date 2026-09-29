package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xh8 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f68211a;

    /* JADX INFO: renamed from: b */
    public int f68212b;

    public xh8() {
        this.f68211a = new ArrayList();
        this.f68212b = 128;
    }

    /* JADX INFO: renamed from: a */
    public synchronized List m24518a() {
        return Collections.unmodifiableList(new ArrayList(this.f68211a));
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m24519b(List list) {
        this.f68211a.clear();
        if (list.size() <= this.f68212b) {
            return this.f68211a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f68212b, null);
        return this.f68211a.addAll(list.subList(0, this.f68212b));
    }

    public xh8(ArrayList arrayList) {
        this.f68211a = arrayList;
    }
}
