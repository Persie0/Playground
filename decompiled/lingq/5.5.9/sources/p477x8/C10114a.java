package p477x8;

import java.util.Arrays;
import p452w8.AbstractC9833n;

/* JADX INFO: renamed from: x8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10114a extends AbstractC10118e {

    /* JADX INFO: renamed from: a */
    public final Iterable<AbstractC9833n> f51289a;

    /* JADX INFO: renamed from: b */
    public final byte[] f51290b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10114a() {
        throw null;
    }

    public C10114a(Iterable iterable, byte[] bArr) {
        this.f51289a = iterable;
        this.f51290b = bArr;
    }

    @Override // p477x8.AbstractC10118e
    /* JADX INFO: renamed from: a */
    public final Iterable<AbstractC9833n> mo18973a() {
        return this.f51289a;
    }

    @Override // p477x8.AbstractC10118e
    /* JADX INFO: renamed from: b */
    public final byte[] mo18974b() {
        return this.f51290b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10118e)) {
            return false;
        }
        AbstractC10118e abstractC10118e = (AbstractC10118e) obj;
        if (this.f51289a.equals(abstractC10118e.mo18973a())) {
            if (Arrays.equals(this.f51290b, abstractC10118e instanceof C10114a ? ((C10114a) abstractC10118e).f51290b : abstractC10118e.mo18974b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51289a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51290b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f51289a + ", extras=" + Arrays.toString(this.f51290b) + "}";
    }
}
