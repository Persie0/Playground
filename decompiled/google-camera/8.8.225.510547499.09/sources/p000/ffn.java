package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffn implements ksc {

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f21704c;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ffn f21703b = new ffn(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ffn f21702a = new ffn(0);

    private /* synthetic */ ffn(int i) {
        this.f21704c = i;
    }

    @Override // p000.ksc
    /* JADX INFO: renamed from: a */
    public final long mo8353a() {
        switch (this.f21704c) {
            case 0:
                return 0L;
            default:
                return SystemClock.elapsedRealtimeNanos();
        }
    }
}
