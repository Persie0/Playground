package p021j$.nio.file;

import java.io.IOException;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j$.nio.file.S */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0329S implements InterfaceC0331U {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WatchService f32830a;

    private /* synthetic */ C0329S(WatchService watchService) {
        this.f32830a = watchService;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0331U m12095b(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof C0330T ? ((C0330T) watchService).f32831a : new C0329S(watchService);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0328Q m12096c() {
        return C0326O.m12088b(this.f32830a.poll());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f32830a.close();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0328Q m12097d(long j, TimeUnit timeUnit) {
        return C0326O.m12088b(this.f32830a.poll(j, timeUnit));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0328Q m12098e() {
        return C0326O.m12088b(this.f32830a.take());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0329S) {
            obj = ((C0329S) obj).f32830a;
        }
        return this.f32830a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32830a.hashCode();
    }
}
