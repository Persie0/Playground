package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dqx implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f12372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f12373b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f12374c;

    public /* synthetic */ dqx(boolean z, boolean z2, int i) {
        this.f12374c = i;
        this.f12372a = z;
        this.f12373b = z2;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        switch (this.f12374c) {
            case 0:
                return Boolean.valueOf(this.f12372a && this.f12373b && ((gzl) obj) != gzl.OFF);
            case 1:
                return Boolean.valueOf(this.f12372a && this.f12373b && ((Integer) obj).intValue() != jbx.m12872q(1));
            case 2:
                return Boolean.valueOf(this.f12372a && this.f12373b && ((gzl) obj) != gzl.OFF);
            default:
                boolean z = this.f12372a;
                boolean z2 = this.f12373b;
                Integer num = (Integer) obj;
                if (z) {
                    return (gzl.m10015a(num.intValue()) == gzl.OFF || !z2) ? gzl.m10015a(num.intValue()) : gzl.DEBUG_MAX;
                }
                return gzl.OFF;
        }
    }
}
