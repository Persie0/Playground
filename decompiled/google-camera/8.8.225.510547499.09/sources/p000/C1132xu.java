package p000;

/* JADX INFO: renamed from: xu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1132xu {

    /* JADX INFO: renamed from: a */
    public Object f48034a;

    /* JADX INFO: renamed from: b */
    public C1136xy f48035b;

    /* JADX INFO: renamed from: c */
    public C1137xz f48036c = C1137xz.m19593h();

    /* JADX INFO: renamed from: d */
    private boolean f48037d;

    /* JADX INFO: renamed from: a */
    public final boolean m19591a(Object obj) {
        this.f48037d = true;
        C1136xy c1136xy = this.f48035b;
        boolean z = c1136xy != null && c1136xy.f48040b.mo19590f(obj);
        if (z) {
            this.f48034a = null;
            this.f48035b = null;
            this.f48036c = null;
        }
        return z;
    }

    protected final void finalize() {
        C1137xz c1137xz;
        C1136xy c1136xy = this.f48035b;
        if (c1136xy != null && !c1136xy.isDone()) {
            StringBuilder sb = new StringBuilder();
            sb.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            Object obj = this.f48034a;
            sb.append(obj);
            c1136xy.m19592a(new C1133xv("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.f48037d || (c1137xz = this.f48036c) == null) {
            return;
        }
        c1137xz.mo19590f(null);
    }
}
