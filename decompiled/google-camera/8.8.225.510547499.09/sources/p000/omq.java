package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class omq extends omn {
    @Override // p000.omn
    /* JADX INFO: renamed from: b */
    public final void mo18723b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (omp.f46319a != null && omp.f46319a.intValue() < 19) {
            super.mo18723b(th, th2);
        } else {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            } catch (Exception e) {
            }
        }
    }
}
