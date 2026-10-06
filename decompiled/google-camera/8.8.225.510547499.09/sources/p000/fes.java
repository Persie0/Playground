package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fes {

    /* JADX INFO: renamed from: a */
    public static final fes f21562a = m8312a().m8303a();

    /* JADX INFO: renamed from: b */
    public final int f21563b;

    /* JADX INFO: renamed from: c */
    public final int f21564c;

    /* JADX INFO: renamed from: d */
    public final String f21565d;

    /* JADX INFO: renamed from: e */
    public final int f21566e;

    /* JADX INFO: renamed from: f */
    public final boolean f21567f;

    /* JADX INFO: renamed from: g */
    public final boolean f21568g;

    /* JADX INFO: renamed from: h */
    public final boolean f21569h;

    /* JADX INFO: renamed from: i */
    public final boolean f21570i;

    /* JADX INFO: renamed from: j */
    private final int f21571j;

    /* JADX INFO: renamed from: k */
    private final boolean f21572k;

    public fes() {
    }

    public fes(int i, int i2, int i3, String str, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f21571j = i;
        this.f21563b = i2;
        this.f21564c = i3;
        this.f21565d = str;
        this.f21566e = i4;
        this.f21572k = z;
        this.f21567f = z2;
        this.f21568g = z3;
        this.f21569h = z4;
        this.f21570i = z5;
    }

    /* JADX INFO: renamed from: a */
    public static fer m8312a() {
        fer ferVar = new fer();
        ferVar.f21553c = (short) (ferVar.f21553c | 48);
        ferVar.m8304b(false);
        ferVar.m8305c(false);
        ferVar.m8306d(false);
        ferVar.m8308f(false);
        ferVar.m8307e(false);
        ferVar.f21553c = (short) (ferVar.f21553c | 2048);
        ferVar.m8311i(-1);
        ferVar.m8310h(-1);
        ferVar.m8309g(-1);
        ferVar.f21551a = -1;
        ferVar.f21553c = (short) (ferVar.f21553c | 1);
        ferVar.f21552b = "";
        return ferVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fes) {
            fes fesVar = (fes) obj;
            if (this.f21571j == fesVar.f21571j && this.f21563b == fesVar.f21563b && this.f21564c == fesVar.f21564c && this.f21565d.equals(fesVar.f21565d) && this.f21566e == fesVar.f21566e && this.f21572k == fesVar.f21572k && this.f21567f == fesVar.f21567f && this.f21568g == fesVar.f21568g && this.f21569h == fesVar.f21569h && this.f21570i == fesVar.f21570i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f21571j ^ 1000003) * 1000003) ^ this.f21563b) * 1000003) ^ this.f21564c) * 1000003) ^ this.f21565d.hashCode()) * 1000003) ^ this.f21566e;
        int i = true != this.f21572k ? 1237 : 1231;
        int i2 = true != this.f21567f ? 1237 : 1231;
        int i3 = true != this.f21568g ? 1237 : 1231;
        return (((((((((((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ (true != this.f21569h ? 1237 : 1231)) * 1000003) ^ (true != this.f21570i ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "Metadata{burstSize=" + this.f21571j + ", videoCaptureFramerate=" + this.f21563b + ", videoHeight=" + this.f21564c + ", videoOrientation=" + this.f21565d + ", videoWidth=" + this.f21566e + ", hasBurstData=false, portrait=false, loaded=" + this.f21572k + ", panorama=" + this.f21567f + ", panorama360=" + this.f21568g + ", usePanoramaViewer=" + this.f21569h + ", photosphere=" + this.f21570i + ", timelapse=false}";
    }
}
