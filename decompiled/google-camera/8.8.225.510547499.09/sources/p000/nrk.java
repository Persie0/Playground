package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrk {

    /* JADX INFO: renamed from: a */
    public static final nrk f44226a = new nrk();

    /* JADX INFO: renamed from: b */
    public static final nrk f44227b = new nrk(PMZiHihxLGEy.ojXSSuWf);

    /* JADX INFO: renamed from: c */
    public static final nrk f44228c = new nrk("kOff");

    /* JADX INFO: renamed from: e */
    private static int f44229e;

    /* JADX INFO: renamed from: d */
    public final int f44230d;

    /* JADX INFO: renamed from: f */
    private final String f44231f;

    static {
        new nrk("kInvalid");
        f44229e = 0;
    }

    private nrk() {
        this.f44231f = "kAuto";
        this.f44230d = 0;
        f44229e = 1;
    }

    private nrk(String str) {
        this.f44231f = str;
        int i = f44229e;
        f44229e = i + 1;
        this.f44230d = i;
    }

    public final String toString() {
        return this.f44231f;
    }
}
