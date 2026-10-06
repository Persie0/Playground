package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hli extends hlc {

    /* JADX INFO: renamed from: a */
    private static hli f28260a;

    public hli(long j, ksa ksaVar) {
        super(ksaVar, j, hkq.values());
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m10443d(long j) {
        lku.m15670x(f28260a == null, "CameraAppTiming shouldn't have been set before.");
        f28260a = new hli(j, new ksa());
    }

    /* JADX INFO: renamed from: e */
    public static synchronized hli m10444e() {
        hli hliVar;
        hliVar = f28260a;
        hliVar.getClass();
        return hliVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m10445c() {
        m10437h(hlh.MEDIA_RECORDER_PREPARE_END);
    }

    public long getMediaRecorderPrepareEndNs() {
        return m10436g(hlh.MEDIA_RECORDER_PREPARE_END);
    }

    public long getMediaRecorderPrepareStartNs() {
        return m10436g(hlh.MEDIA_RECORDER_PREPARE_START);
    }

    public hli(ksa ksaVar) {
        super(ksaVar, hlh.values());
    }
}
