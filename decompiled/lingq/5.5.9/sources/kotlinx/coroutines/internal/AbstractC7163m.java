package kotlinx.coroutines.internal;

import no.C7814a0;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7163m {
    /* JADX INFO: renamed from: a */
    public abstract AbstractC7153c<?> mo14427a();

    /* JADX INFO: renamed from: b */
    public final boolean m14461b(AbstractC7163m abstractC7163m) {
        AbstractC7153c<?> abstractC7153cMo14427a;
        AbstractC7153c<?> abstractC7153cMo14427a2 = mo14427a();
        boolean z10 = false;
        if (abstractC7153cMo14427a2 == null || (abstractC7153cMo14427a = abstractC7163m.mo14427a()) == null) {
            return false;
        }
        if (abstractC7153cMo14427a2.mo14438g() < abstractC7153cMo14427a.mo14438g()) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo14428c(Object obj);

    public String toString() {
        return getClass().getSimpleName() + '@' + C7814a0.m15551c(this);
    }
}
