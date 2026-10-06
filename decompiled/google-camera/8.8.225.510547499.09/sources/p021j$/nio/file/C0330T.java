package p021j$.nio.file;

import java.io.IOException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j$.nio.file.T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0330T implements WatchService {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0331U f32831a;

    private /* synthetic */ C0330T(InterfaceC0331U interfaceC0331U) {
        this.f32831a = interfaceC0331U;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WatchService m12099b(InterfaceC0331U interfaceC0331U) {
        if (interfaceC0331U == null) {
            return null;
        }
        return interfaceC0331U instanceof C0329S ? ((C0329S) interfaceC0331U).f32830a : new C0330T(interfaceC0331U);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        ((C0329S) this.f32831a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0331U interfaceC0331U = this.f32831a;
        if (obj instanceof C0330T) {
            obj = ((C0330T) obj).f32831a;
        }
        return interfaceC0331U.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32831a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return C0327P.m12094a(((C0329S) this.f32831a).m12096c());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return C0327P.m12094a(((C0329S) this.f32831a).m12098e());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return C0327P.m12094a(((C0329S) this.f32831a).m12097d(j, timeUnit));
    }
}
