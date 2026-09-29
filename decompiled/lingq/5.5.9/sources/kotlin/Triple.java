package kotlin;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, m13365d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Triple<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final A f38021a;

    /* JADX INFO: renamed from: b */
    public final B f38022b;

    /* JADX INFO: renamed from: c */
    public final C f38023c;

    public Triple(A a10, B b10, C c10) {
        this.f38021a = a10;
        this.f38022b = b10;
        this.f38023c = c10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return C5207g.m11106a(this.f38021a, triple.f38021a) && C5207g.m11106a(this.f38022b, triple.f38022b) && C5207g.m11106a(this.f38023c, triple.f38023c);
    }

    public final int hashCode() {
        A a10 = this.f38021a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f38022b;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f38023c;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f38021a + ", " + this.f38022b + ", " + this.f38023c + ')';
    }
}
