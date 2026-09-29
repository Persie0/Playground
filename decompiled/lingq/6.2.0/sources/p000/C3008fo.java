package p000;

import android.text.SegmentFinder;

/* JADX INFO: renamed from: fo */
/* JADX INFO: loaded from: classes.dex */
public final class C3008fo extends SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qfa f39356a;

    public C3008fo(qfa qfaVar) {
        this.f39356a = qfaVar;
    }

    public final int nextEndBoundary(int i) {
        return this.f39356a.mo3853i(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f39356a.mo3845a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f39356a.mo3846b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f39356a.mo3850f(i);
    }
}
