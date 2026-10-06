package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class okf implements Serializable, ojy {

    /* JADX INFO: renamed from: a */
    private omx f46192a;

    /* JADX INFO: renamed from: b */
    private volatile Object f46193b = okg.f46195a;

    /* JADX INFO: renamed from: c */
    private final Object f46194c = this;

    private final Object writeReplace() {
        return new ojw(mo18586a());
    }

    @Override // p000.ojy
    /* JADX INFO: renamed from: b */
    public final boolean mo18587b() {
        return this.f46193b != okg.f46195a;
    }

    public final String toString() {
        return mo18587b() ? String.valueOf(mo18586a()) : "Lazy value not initialized yet.";
    }

    @Override // p000.ojy
    /* JADX INFO: renamed from: a */
    public final Object mo18586a() {
        Object objMo2077a;
        Object obj = this.f46193b;
        if (obj != okg.f46195a) {
            return obj;
        }
        synchronized (this.f46194c) {
            objMo2077a = this.f46193b;
            if (objMo2077a == okg.f46195a) {
                omx omxVar = this.f46192a;
                omxVar.getClass();
                objMo2077a = omxVar.mo2077a();
                this.f46193b = objMo2077a;
                this.f46192a = null;
            }
        }
        return objMo2077a;
    }
}
