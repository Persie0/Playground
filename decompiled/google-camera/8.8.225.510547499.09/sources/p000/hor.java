package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum hor {
    STATE_UNINITIALIZED(0),
    STATE_PREPARING_ON_START(1),
    STATE_PREPARING_ON_RESUME(17),
    STATE_PREPARING_ON_PREVIEW_STARTED(257),
    STATE_IDLE(273),
    STATE_PRE_RECORDING(4096),
    STATE_RECORDING_PAUSE(65536),
    STATE_RECORDING(1048576),
    STATE_PROCESSING(16777216),
    STATE_RECORDING_ERROR(268435456);


    /* JADX INFO: renamed from: k */
    public final int f28650k;

    hor(int i) {
        this.f28650k = i;
    }

    /* JADX INFO: renamed from: a */
    static boolean m10549a(hor horVar) {
        return horVar.equals(STATE_RECORDING_PAUSE) || horVar.equals(STATE_RECORDING) || horVar.equals(STATE_RECORDING_ERROR);
    }
}
