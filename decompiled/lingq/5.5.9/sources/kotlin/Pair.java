package kotlin;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m13365d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final A f38012a;

    /* JADX INFO: renamed from: b */
    public final B f38013b;

    public Pair(A a10, B b10) {
        this.f38012a = a10;
        this.f38013b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (C5207g.m11106a(this.f38012a, pair.f38012a) && C5207g.m11106a(this.f38013b, pair.f38013b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        A a10 = this.f38012a;
        int iHashCode2 = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f38013b;
        if (b10 != null) {
            iHashCode = b10.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "(" + this.f38012a + ", " + this.f38013b + ')';
    }
}
