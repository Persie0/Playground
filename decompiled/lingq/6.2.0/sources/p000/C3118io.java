package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: io */
/* JADX INFO: loaded from: classes.dex */
public final class C3118io {

    /* JADX INFO: renamed from: a */
    public final int f44337a;

    /* JADX INFO: renamed from: b */
    public final b64 f44338b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3691vn f44339c;

    /* JADX INFO: renamed from: d */
    public final String f44340d;

    public C3118io(b64 b64Var, InterfaceC3691vn interfaceC3691vn, String str) {
        this.f44338b = b64Var;
        this.f44339c = interfaceC3691vn;
        this.f44340d = str;
        this.f44337a = Arrays.hashCode(new Object[]{b64Var, interfaceC3691vn, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3118io)) {
            return false;
        }
        C3118io c3118io = (C3118io) obj;
        return x74.m24360q(this.f44338b, c3118io.f44338b) && x74.m24360q(this.f44339c, c3118io.f44339c) && x74.m24360q(this.f44340d, c3118io.f44340d);
    }

    public final int hashCode() {
        return this.f44337a;
    }
}
