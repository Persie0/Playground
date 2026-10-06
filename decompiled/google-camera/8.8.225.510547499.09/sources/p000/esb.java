package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esb implements ciw {

    /* JADX INFO: renamed from: a */
    private final ciw f15301a;

    public esb(oju ojuVar) throws IllegalAccessException, InvocationTargetException {
        kba kbaVarM6062g = dfm.m6062g();
        try {
            this.f15301a = (ciw) ojuVar.get();
            kbaVarM6062g.close();
        } catch (Throwable th) {
            try {
                kbaVarM6062g.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() throws IllegalAccessException, InvocationTargetException {
        kba kbaVarM6062g = dfm.m6062g();
        try {
            nps npsVarMo3538bd = this.f15301a.mo3538bd();
            kbaVarM6062g.close();
            return npsVarMo3538bd;
        } catch (Throwable th) {
            try {
                kbaVarM6062g.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final String mo3539c() {
        return this.f15301a.mo3539c();
    }
}
