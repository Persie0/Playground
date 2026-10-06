package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class der {

    /* JADX INFO: renamed from: a */
    public mrm f10730a;

    /* JADX INFO: renamed from: b */
    private long f10731b;

    /* JADX INFO: renamed from: c */
    private mws f10732c;

    /* JADX INFO: renamed from: d */
    private byte f10733d;

    public der() {
    }

    public der(byte[] bArr) {
        this.f10730a = mqu.f41450a;
    }

    /* JADX INFO: renamed from: a */
    public final des m6018a() {
        mws mwsVar;
        if (this.f10733d == 1 && (mwsVar = this.f10732c) != null) {
            return new des(this.f10731b, mwsVar, this.f10730a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10733d == 0) {
            sb.append(" timestampNs");
        }
        if (this.f10732c == null) {
            sb.append(" cameraVisionKitChipResults");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m6019b(List list) {
        this.f10732c = mws.m17095j(list);
    }

    /* JADX INFO: renamed from: c */
    public final void m6020c(long j) {
        this.f10731b = j;
        this.f10733d = (byte) 1;
    }
}
