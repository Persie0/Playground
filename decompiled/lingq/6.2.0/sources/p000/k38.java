package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k38 {

    /* JADX INFO: renamed from: a */
    public int f46627a;

    /* JADX INFO: renamed from: b */
    public int f46628b;

    /* JADX INFO: renamed from: c */
    public int f46629c;

    /* JADX INFO: renamed from: d */
    public int f46630d;

    /* JADX INFO: renamed from: e */
    public int f46631e;

    /* JADX INFO: renamed from: f */
    public boolean f46632f;

    /* JADX INFO: renamed from: g */
    public boolean f46633g;

    /* JADX INFO: renamed from: h */
    public boolean f46634h;

    /* JADX INFO: renamed from: i */
    public boolean f46635i;

    /* JADX INFO: renamed from: j */
    public boolean f46636j;

    /* JADX INFO: renamed from: k */
    public boolean f46637k;

    /* JADX INFO: renamed from: l */
    public int f46638l;

    /* JADX INFO: renamed from: m */
    public long f46639m;

    /* JADX INFO: renamed from: n */
    public int f46640n;

    /* JADX INFO: renamed from: a */
    public final void m14788a(int i) {
        if ((this.f46630d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f46630d));
    }

    /* JADX INFO: renamed from: b */
    public final int m14789b() {
        return this.f46633g ? this.f46628b - this.f46629c : this.f46631e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f46627a);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f46631e);
        sb.append(", mIsMeasuring=");
        sb.append(this.f46635i);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f46628b);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f46629c);
        sb.append(", mStructureChanged=");
        sb.append(this.f46632f);
        sb.append(", mInPreLayout=");
        sb.append(this.f46633g);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f46636j);
        sb.append(", mRunPredictiveAnimations=");
        return ux5.m22993p(sb, this.f46637k, '}');
    }
}
