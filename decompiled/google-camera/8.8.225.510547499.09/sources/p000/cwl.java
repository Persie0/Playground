package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwl extends jxd implements cws {
    public cwl(haq haqVar) {
        super(haqVar);
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3609b(Object obj) {
        jxn jxnVar = jxn.FPS_AUTO;
        switch (((gzm) obj).ordinal()) {
            case 1:
                return jxn.FPS_60C_24E;
            case 2:
                return jxn.f35054f;
            default:
                throw new IllegalArgumentException("Not a support FPS option");
        }
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final /* bridge */ /* synthetic */ Object mo3610c(Object obj) {
        gzm gzmVar = gzm.FPS_AUTO;
        switch (((jxn) obj).ordinal()) {
            case 4:
                return gzm.FPS_24;
            case 5:
                return gzm.FPS_30;
            default:
                throw new IllegalArgumentException("Not a support camcorderCaptureRate");
        }
    }
}
