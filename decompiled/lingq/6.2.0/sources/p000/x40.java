package p000;

import com.google.android.datatransport.cct.internal.QosTier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x40 extends hj5 {

    /* JADX INFO: renamed from: a */
    public final long f67738a;

    /* JADX INFO: renamed from: b */
    public final long f67739b;

    /* JADX INFO: renamed from: c */
    public final u20 f67740c;

    /* JADX INFO: renamed from: d */
    public final Integer f67741d;

    /* JADX INFO: renamed from: e */
    public final String f67742e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f67743f;

    /* JADX INFO: renamed from: g */
    public final QosTier f67744g;

    public x40(long j, long j2, u20 u20Var, Integer num, String str, ArrayList arrayList, QosTier qosTier) {
        this.f67738a = j;
        this.f67739b = j2;
        this.f67740c = u20Var;
        this.f67741d = num;
        this.f67742e = str;
        this.f67743f = arrayList;
        this.f67744g = qosTier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hj5)) {
            return false;
        }
        x40 x40Var = (x40) ((hj5) obj);
        if (this.f67738a != x40Var.f67738a || this.f67739b != x40Var.f67739b || !this.f67740c.equals(x40Var.f67740c)) {
            return false;
        }
        Integer num = x40Var.f67741d;
        Integer num2 = this.f67741d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = x40Var.f67742e;
        String str2 = this.f67742e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f67743f.equals(x40Var.f67743f)) {
            return false;
        }
        QosTier qosTier = x40Var.f67744g;
        QosTier qosTier2 = this.f67744g;
        if (qosTier2 == null) {
            return qosTier == null;
        }
        return qosTier2.equals(qosTier);
    }

    public final int hashCode() {
        long j = this.f67738a;
        long j2 = this.f67739b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f67740c.hashCode()) * 1000003;
        Integer num = this.f67741d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f67742e;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f67743f.hashCode()) * 1000003;
        QosTier qosTier = this.f67744g;
        return iHashCode3 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f67738a + ", requestUptimeMs=" + this.f67739b + ", clientInfo=" + this.f67740c + ", logSource=" + this.f67741d + ", logSourceName=" + this.f67742e + ", logEvents=" + this.f67743f + ", qosTier=" + this.f67744g + "}";
    }
}
