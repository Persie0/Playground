package kotlinx.coroutines.scheduling;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7178b extends C7181e {

    /* JADX INFO: renamed from: d */
    public static final C7178b f40475d = new C7178b();

    public C7178b() {
        super(C7186j.f40483b, C7186j.f40484c, C7186j.f40485d);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
