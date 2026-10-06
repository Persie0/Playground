package p000;

import dalvik.system.VMStack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class ndr extends ndj {
    @Override // p000.ndj
    /* JADX INFO: renamed from: a */
    public nbq mo17358a(Class cls, int i) {
        return nbq.f41957a;
    }

    @Override // p000.ndj
    /* JADX INFO: renamed from: b */
    public String mo17359b(Class cls) {
        if (ndt.f42058a) {
            try {
                if (cls.equals(ndt.m17378p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable th) {
            }
        }
        if (!ndt.f42059b) {
            return null;
        }
        nea.m17397k(cls, "target");
        StackTraceElement stackTraceElementMo17428a = neu.f42156a.mo17428a(cls);
        if (stackTraceElementMo17428a != null) {
            return stackTraceElementMo17428a.getClassName();
        }
        return null;
    }
}
