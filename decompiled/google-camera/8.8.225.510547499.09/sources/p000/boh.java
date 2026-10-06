package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class boh {

    /* JADX INFO: renamed from: a */
    public final bog f3984a;

    /* JADX INFO: renamed from: b */
    private final Handler f3985b;

    public boh(Handler handler) {
        this.f3984a = new boe();
        this.f3985b = handler;
    }

    public boh(bog bogVar, Handler handler) {
        this.f3985b = handler;
        this.f3984a = bogVar;
    }

    /* JADX INFO: renamed from: a */
    public void mo2757a(int i) {
        this.f3985b.post(new bbt(this, i, 4));
    }

    /* JADX INFO: renamed from: b */
    public void mo2758b(RuntimeException runtimeException, String str, int i, int i2) {
        this.f3985b.post(new bof(this, runtimeException, str, i, i2));
    }

    /* JADX INFO: renamed from: c */
    public void mo2759c(RuntimeException runtimeException) {
        this.f3985b.post(new bey(this, runtimeException, 14));
    }
}
