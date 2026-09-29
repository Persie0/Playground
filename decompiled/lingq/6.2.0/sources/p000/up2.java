package p000;

/* JADX INFO: loaded from: classes.dex */
public final class up2 {

    /* JADX INFO: renamed from: a */
    public long f64164a;

    /* JADX INFO: renamed from: b */
    public boolean f64165b;

    /* JADX INFO: renamed from: c */
    public final Object f64166c;

    /* JADX INFO: renamed from: d */
    public Object f64167d;

    public up2(ct5 ct5Var, l87 l87Var, long j) {
        this.f64166c = ct5Var;
        this.f64167d = l87Var;
        this.f64164a = j;
        this.f64165b = true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22852a() {
        Boolean bool = (Boolean) this.f64167d;
        return bool != null ? bool.booleanValue() : this.f64165b;
    }

    public up2(String str, long j, Integer num, boolean z) {
        this.f64166c = str;
        this.f64164a = j;
        this.f64167d = num;
        this.f64165b = z;
    }

    public up2(boolean z, String str) {
        this.f64165b = z;
        this.f64166c = str;
    }
}
