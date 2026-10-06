package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsc {

    /* JADX INFO: renamed from: a */
    public static final nsc f44355a = new nsc();

    /* JADX INFO: renamed from: b */
    public static final nsc f44356b = new nsc("kLanczos");

    /* JADX INFO: renamed from: c */
    public static final nsc f44357c;

    /* JADX INFO: renamed from: e */
    private static int f44358e;

    /* JADX INFO: renamed from: d */
    public final int f44359d;

    /* JADX INFO: renamed from: f */
    private final String f44360f;

    static {
        new nsc("kRaisr");
        f44357c = new nsc("kLancet");
        new nsc(VzWFSVj.pMkZaX);
        f44358e = 0;
    }

    private nsc() {
        this.f44360f = "kNone";
        this.f44359d = 0;
        f44358e = 1;
    }

    private nsc(String str) {
        this.f44360f = str;
        int i = f44358e;
        f44358e = i + 1;
        this.f44359d = i;
    }

    public final String toString() {
        return this.f44360f;
    }
}
