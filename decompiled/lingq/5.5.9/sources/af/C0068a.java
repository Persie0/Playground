package af;

import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: af.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0068a extends AbstractC0073f {

    /* JADX INFO: renamed from: a */
    public final String f190a;

    /* JADX INFO: renamed from: b */
    public final List<String> f191b;

    public C0068a(ArrayList arrayList, String str) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f190a = str;
        this.f191b = arrayList;
    }

    @Override // af.AbstractC0073f
    /* JADX INFO: renamed from: a */
    public final List<String> mo443a() {
        return this.f191b;
    }

    @Override // af.AbstractC0073f
    /* JADX INFO: renamed from: b */
    public final String mo444b() {
        return this.f190a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0073f)) {
            return false;
        }
        AbstractC0073f abstractC0073f = (AbstractC0073f) obj;
        return this.f190a.equals(abstractC0073f.mo444b()) && this.f191b.equals(abstractC0073f.mo443a());
    }

    public final int hashCode() {
        return ((this.f190a.hashCode() ^ 1000003) * 1000003) ^ this.f191b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeartBeatResult{userAgent=");
        sb2.append(this.f190a);
        sb2.append(", usedDates=");
        return C0009a.m24m(sb2, this.f191b, "}");
    }
}
