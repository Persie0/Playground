package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hla {

    /* JADX INFO: renamed from: a */
    private boolean f28231a;

    /* JADX INFO: renamed from: b */
    private boolean f28232b;

    /* JADX INFO: renamed from: c */
    private byte f28233c;

    /* JADX INFO: renamed from: a */
    public final hlb m10432a() {
        if (this.f28233c == 3) {
            return new hlb(this.f28231a, this.f28232b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f28233c & 1) == 0) {
            sb.append(" logDurationFromStart");
        }
        if ((this.f28233c & 2) == 0) {
            sb.append(" logDurationFromLast");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10433b(boolean z) {
        this.f28232b = z;
        this.f28233c = (byte) (this.f28233c | 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m10434c(boolean z) {
        this.f28231a = z;
        this.f28233c = (byte) (this.f28233c | 1);
    }
}
