package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fmk {

    /* JADX INFO: renamed from: a */
    private static final nbh f22563a = nbh.m17259h("com/google/android/apps/camera/modules/capture/CapturePictureTakerHelper");

    /* JADX INFO: renamed from: a */
    public static void m8587a(gyh gyhVar, mca mcaVar) {
        if (gyhVar == null) {
            ((nbe) ((nbe) f22563a.m17252c()).mo17276G((char) 2373)).mo17290o("No active capture session to interrupt.");
        } else {
            if (!((Boolean) ((jwf) mcaVar.f39921i).f34942d).booleanValue()) {
                throw new IllegalStateException("Capture is not on-going, hence cannot interrupt");
            }
            gyhVar.mo9873E();
        }
    }
}
