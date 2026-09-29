package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oj3 {

    /* JADX INFO: renamed from: a */
    public int f54459a;

    public oj3(int i) {
        this.f54459a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18039a() {
        return this.f54459a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return wq1.m24123s(sb, this.f54459a, " }");
    }
}
