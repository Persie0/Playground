package p000;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ooz implements opa {

    /* JADX INFO: renamed from: a */
    public final Object f46361a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f46362b;

    public ooz(File file, int i) {
        this.f46362b = i;
        this.f46361a = file;
    }

    public ooz(opa opaVar, int i) {
        this.f46362b = i;
        this.f46361a = new AtomicReference(opaVar);
    }

    @Override // p000.opa
    /* JADX INFO: renamed from: a */
    public final Iterator mo18817a() {
        switch (this.f46362b) {
            case 0:
                opa opaVar = (opa) ((AtomicReference) this.f46361a).getAndSet(null);
                if (opaVar != null) {
                    return opaVar.mo18817a();
                }
                throw new IllegalStateException("This sequence can be consumed only once.");
            default:
                return new okk(this, null);
        }
    }
}
