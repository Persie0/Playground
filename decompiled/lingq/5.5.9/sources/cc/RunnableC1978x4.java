package cc;

/* JADX INFO: renamed from: cc.x4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1978x4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10302b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10303c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f10304d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BinderC1987y4 f10305e;

    public RunnableC1978x4(BinderC1987y4 binderC1987y4, String str, String str2, String str3, long j10) {
        this.f10305e = binderC1987y4;
        this.f10301a = str;
        this.f10302b = str2;
        this.f10303c = str3;
        this.f10304d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f10302b;
        BinderC1987y4 binderC1987y4 = this.f10305e;
        String str2 = this.f10301a;
        if (str2 == null) {
            C1846i7 c1846i7 = binderC1987y4.f10411a;
            c1846i7.mo5518f().mo5748g();
            String str3 = c1846i7.f9889Y;
            if (str3 == null || str3.equals(str)) {
                c1846i7.f9889Y = str;
                c1846i7.f9888X = null;
                return;
            }
            return;
        }
        C1988y5 c1988y5 = new C1988y5(this.f10304d, this.f10303c, str2);
        C1846i7 c1846i8 = binderC1987y4.f10411a;
        c1846i8.mo5518f().mo5748g();
        String str4 = c1846i8.f9889Y;
        if (str4 != null) {
            str4.equals(str);
        }
        c1846i8.f9889Y = str;
        c1846i8.f9888X = c1988y5;
    }
}
