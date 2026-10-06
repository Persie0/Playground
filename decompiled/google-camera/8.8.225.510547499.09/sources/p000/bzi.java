package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzi {

    /* JADX INFO: renamed from: a */
    public final Set f4812a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final Set f4813b = new HashSet();

    /* JADX INFO: renamed from: c */
    public boolean f4814c;

    /* JADX INFO: renamed from: a */
    public final boolean m3216a(bzw bzwVar) {
        boolean z = true;
        if (bzwVar == null) {
            return true;
        }
        boolean zRemove = this.f4812a.remove(bzwVar);
        if (!this.f4813b.remove(bzwVar) && !zRemove) {
            z = false;
        }
        if (z) {
            bzwVar.mo3323c();
        }
        return z;
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f4812a.size() + ", isPaused=" + this.f4814c + "}";
    }
}
