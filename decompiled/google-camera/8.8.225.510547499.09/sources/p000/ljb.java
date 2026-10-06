package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljb {

    /* JADX INFO: renamed from: a */
    public final String f38352a;

    /* JADX INFO: renamed from: b */
    public final boolean f38353b;

    /* JADX INFO: renamed from: c */
    public final pat f38354c;

    /* JADX INFO: renamed from: d */
    public final ozk f38355d;

    /* JADX INFO: renamed from: e */
    public final String f38356e;

    /* JADX INFO: renamed from: f */
    public final Long f38357f;

    /* JADX INFO: renamed from: g */
    public final boolean f38358g;

    /* JADX INFO: renamed from: h */
    public final lhm f38359h;

    /* JADX INFO: renamed from: i */
    public final int f38360i;

    public ljb() {
    }

    public ljb(String str, boolean z, pat patVar, ozk ozkVar, String str2, Long l, boolean z2, lhm lhmVar, int i) {
        this.f38352a = str;
        this.f38353b = z;
        this.f38354c = patVar;
        this.f38355d = ozkVar;
        this.f38356e = str2;
        this.f38357f = l;
        this.f38358g = z2;
        this.f38359h = lhmVar;
        this.f38360i = i;
    }

    /* JADX INFO: renamed from: a */
    public static lja m15522a() {
        lja ljaVar = new lja();
        ljaVar.m15513c(false);
        ljaVar.m15514d(false);
        ljaVar.m15512b(0);
        return ljaVar;
    }

    public final boolean equals(Object obj) {
        ozk ozkVar;
        String str;
        Long l;
        lhm lhmVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ljb)) {
            return false;
        }
        ljb ljbVar = (ljb) obj;
        String str2 = this.f38352a;
        if (str2 != null ? str2.equals(ljbVar.f38352a) : ljbVar.f38352a == null) {
            if (this.f38353b == ljbVar.f38353b && this.f38354c.equals(ljbVar.f38354c) && ((ozkVar = this.f38355d) != null ? ozkVar.equals(ljbVar.f38355d) : ljbVar.f38355d == null) && ((str = this.f38356e) != null ? str.equals(ljbVar.f38356e) : ljbVar.f38356e == null) && ((l = this.f38357f) != null ? l.equals(ljbVar.f38357f) : ljbVar.f38357f == null) && this.f38358g == ljbVar.f38358g && ((lhmVar = this.f38359h) != null ? lhmVar.equals(ljbVar.f38359h) : ljbVar.f38359h == null) && this.f38360i == ljbVar.f38360i) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Metric{customEventName=" + this.f38352a + ", isEventNameConstant=" + this.f38353b + ", metric=" + String.valueOf(this.f38354c) + ", metricExtension=" + String.valueOf(this.f38355d) + ", accountableComponentName=" + this.f38356e + ", sampleRatePermille=" + this.f38357f + ", isUnsampled=" + this.f38358g + ", debugLogsTime=" + String.valueOf(this.f38359h) + ", debugLogsSize=" + this.f38360i + "}";
    }

    public final int hashCode() {
        int iM18134L;
        int iM18134L2;
        String str = this.f38352a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = true != this.f38353b ? 1237 : 1231;
        int i2 = iHashCode ^ 1000003;
        pat patVar = this.f38354c;
        if (patVar.m18142ac()) {
            iM18134L = patVar.m18134L();
        } else {
            int iM18134L3 = patVar.f44820aG;
            if (iM18134L3 == 0) {
                iM18134L3 = patVar.m18134L();
                patVar.f44820aG = iM18134L3;
            }
            iM18134L = iM18134L3;
        }
        int i3 = ((((i2 * 1000003) ^ i) * 1000003) ^ iM18134L) * 1000003;
        ozk ozkVar = this.f38355d;
        if (ozkVar == null) {
            iM18134L2 = 0;
        } else if (ozkVar.m18142ac()) {
            iM18134L2 = ozkVar.m18134L();
        } else {
            int iM18134L4 = ozkVar.f44820aG;
            if (iM18134L4 == 0) {
                iM18134L4 = ozkVar.m18134L();
                ozkVar.f44820aG = iM18134L4;
            }
            iM18134L2 = iM18134L4;
        }
        int i4 = (i3 ^ iM18134L2) * 1000003;
        String str2 = this.f38356e;
        int iHashCode2 = (i4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f38357f;
        int iHashCode3 = (((iHashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true == this.f38358g ? 1231 : 1237)) * 1000003;
        lhm lhmVar = this.f38359h;
        return ((iHashCode3 ^ (lhmVar != null ? lhmVar.hashCode() : 0)) * 1000003) ^ this.f38360i;
    }
}
