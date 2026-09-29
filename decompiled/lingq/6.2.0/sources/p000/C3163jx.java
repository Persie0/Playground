package p000;

import com.google.common.primitives.AbstractC1110a;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: jx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3163jx implements fd9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46330a = 1;

    /* JADX INFO: renamed from: b */
    public int f46331b;

    /* JADX INFO: renamed from: c */
    public long f46332c;

    /* JADX INFO: renamed from: d */
    public int f46333d;

    public C3163jx(long j, int i, int i2) {
        this.f46331b = i;
        this.f46332c = j;
        this.f46333d = i2;
    }

    public String toString() {
        switch (this.f46330a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                int i = this.f46331b;
                String str = uma.f64080a;
                sb.append(new String(AbstractC1110a.m6366f(i), StandardCharsets.US_ASCII));
                sb.append(", size=");
                sb.append(this.f46332c);
                sb.append(", minHeaderSize=");
                return wq1.m24123s(sb, this.f46333d, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3163jx() {
    }
}
