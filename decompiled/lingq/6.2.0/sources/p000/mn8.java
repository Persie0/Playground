package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mn8 {

    /* JADX INFO: renamed from: a */
    public final ui3 f51588a;

    /* JADX INFO: renamed from: b */
    public final ui3 f51589b;

    /* JADX INFO: renamed from: c */
    public final boolean f51590c;

    public mn8(ui3 ui3Var, ui3 ui3Var2, boolean z) {
        this.f51588a = ui3Var;
        this.f51589b = ui3Var2;
        this.f51590c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.f51588a.mo0a()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.f51589b.mo0a()).floatValue());
        sb.append(", reverseScrolling=");
        return ux5.m22993p(sb, this.f51590c, ')');
    }
}
