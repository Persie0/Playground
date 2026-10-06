package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzg extends kzd implements List, kzf {
    public kzg(List list) {
        super(list);
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RuntimeException runtimeException = null;
        for (kzf kzfVar : this.f37767a) {
            if (kzfVar != null) {
                try {
                    kzfVar.close();
                } catch (RuntimeException e) {
                    if (runtimeException != null) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(runtimeException, e);
                        } catch (Exception e2) {
                        }
                    } else {
                        runtimeException = e;
                    }
                }
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p000.kzd, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new kzg(super.subList(i, i2));
    }
}
