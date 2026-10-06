package p000;

/* JADX INFO: renamed from: ml */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0826ml {

    /* JADX INFO: renamed from: a */
    public int f40916a = -1;

    /* JADX INFO: renamed from: b */
    public int f40917b = 0;

    /* JADX INFO: renamed from: c */
    public int f40918c = 0;

    /* JADX INFO: renamed from: d */
    public int f40919d = 1;

    /* JADX INFO: renamed from: e */
    public int f40920e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f40921f = false;

    /* JADX INFO: renamed from: g */
    public boolean f40922g = false;

    /* JADX INFO: renamed from: h */
    public boolean f40923h = false;

    /* JADX INFO: renamed from: i */
    public boolean f40924i = false;

    /* JADX INFO: renamed from: j */
    public boolean f40925j = false;

    /* JADX INFO: renamed from: k */
    public boolean f40926k = false;

    /* JADX INFO: renamed from: l */
    public int f40927l;

    /* JADX INFO: renamed from: m */
    public long f40928m;

    /* JADX INFO: renamed from: n */
    public int f40929n;

    /* JADX INFO: renamed from: o */
    public int f40930o;

    /* JADX INFO: renamed from: p */
    public int f40931p;

    /* JADX INFO: renamed from: a */
    public final int m16585a() {
        return this.f40922g ? this.f40917b - this.f40918c : this.f40920e;
    }

    /* JADX INFO: renamed from: b */
    public final void m16586b(int i) {
        if ((this.f40919d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f40919d));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16587c() {
        return this.f40916a != -1;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f40916a + ", mData=" + ((Object) null) + ", mItemCount=" + this.f40920e + ", mIsMeasuring=" + this.f40924i + ", mPreviousLayoutItemCount=" + this.f40917b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f40918c + ", mStructureChanged=" + this.f40921f + ", mInPreLayout=" + this.f40922g + ", mRunSimpleAnimations=" + this.f40925j + ", mRunPredictiveAnimations=" + this.f40926k + '}';
    }
}
