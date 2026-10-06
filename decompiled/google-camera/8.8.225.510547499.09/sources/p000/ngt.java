package p000;

import java.util.function.BiFunction;
import java.util.function.Supplier;
import p021j$.util.stream.Stream;
import p021j$.util.stream.StreamSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngt extends ngu {

    /* JADX INFO: renamed from: a */
    public final Stream f42237a;

    /* JADX INFO: renamed from: b */
    public final Stream f42238b;

    public ngt(Stream stream, Stream stream2) {
        stream.getClass();
        this.f42237a = stream;
        stream2.getClass();
        this.f42238b = stream2;
    }

    @Override // p000.ngu
    /* JADX INFO: renamed from: b */
    public final Stream mo17468b(final BiFunction biFunction) {
        biFunction.getClass();
        int i = 15;
        return StreamSupport.stream(new Supplier() { // from class: ngq
            @Override // java.util.function.Supplier
            public final Object get() {
                ngs ngsVar = new ngs(this.f42229a);
                return new ngr(ngsVar, Math.min(ngsVar.f42234c.estimateSize(), ngsVar.f42235d.estimateSize()));
            }
        }, 16, false).onClose(new lmg(this.f42237a, i)).onClose(new lmg(this.f42238b, i));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Stream stream = this.f42237a;
        try {
            this.f42238b.close();
            stream.close();
        } catch (Throwable th) {
            try {
                stream.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception e) {
                }
            }
            throw th;
        }
    }
}
