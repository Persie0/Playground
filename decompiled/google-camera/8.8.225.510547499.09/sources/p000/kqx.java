package p000;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqx implements kqw {

    /* JADX INFO: renamed from: a */
    final kqj f36975a;

    /* JADX INFO: renamed from: b */
    public final krj f36976b;

    /* JADX INFO: renamed from: c */
    final drj f36977c;

    public kqx(kqv kqvVar, kqj kqjVar, drj drjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36975a = kqjVar;
        this.f36977c = drjVar;
        this.f36976b = kqvVar.f36971p;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, oju] */
    @Override // p000.kqw
    /* JADX INFO: renamed from: a */
    public final kqg mo14733a(krj krjVar, String str, long j) {
        drj drjVar = this.f36977c;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) drjVar.f12397c.get();
        scheduledExecutorService.getClass();
        Object obj = drjVar.f12396b.get();
        kqv kqvVar = ((hlz) drjVar.f12398d).get();
        kbz kbzVar = (kbz) drjVar.f12399e.get();
        kbzVar.getClass();
        kqs kqsVar = new kqs(scheduledExecutorService, (ljf) obj, kqvVar, kbzVar, ((kbm) drjVar.f12395a).get(), null);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        kqj kqjVar = this.f36975a;
        kro kroVar = (kro) kqjVar.f36860a.get();
        kroVar.getClass();
        kqv kqvVar2 = ((hlz) kqjVar.f36861b).get();
        lhz lhzVar = (lhz) kqjVar.f36862c.get();
        lhzVar.getClass();
        ffn ffnVar = ffn.f21703b;
        kbo kboVar = ((kbm) kqjVar.f36863d).get();
        kbz kbzVar2 = (kbz) kqjVar.f36864e.get();
        kbzVar2.getClass();
        kqj kqjVar2 = (kqj) kqjVar.f36865f.get();
        kqjVar2.getClass();
        krjVar.getClass();
        return new kqi(kroVar, kqvVar2, lhzVar, ffnVar, kboVar, kbzVar2, kqjVar2, krjVar, kqsVar, str, jElapsedRealtimeNanos, j, null, null, null);
    }
}
