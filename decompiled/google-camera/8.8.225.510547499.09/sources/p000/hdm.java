package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdm extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final Throwable f27363a;

    /* JADX INFO: renamed from: b */
    private final int f27364b;

    public hdm(int i, Throwable th) {
        this.f27364b = i;
        this.f27363a = th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        Throwable th = this.f27363a;
        String message = th == null ? "" : th.getMessage();
        switch (this.f27364b) {
            case 1:
                str = "RING_BUFFER_FETCH_FAIL";
                break;
            case 2:
                str = VzWFSVj.Nlw;
                break;
            case 3:
                str = "NULL_METADATA";
                break;
            case 4:
                str = "NULL_RAW_IMAGE";
                break;
            default:
                str = "null";
                break;
        }
        return "SmartsFrameFetchException{reason=" + str + ", exception=" + message + "}";
    }
}
