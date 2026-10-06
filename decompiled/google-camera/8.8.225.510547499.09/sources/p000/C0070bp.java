package p000;

import android.view.View;

/* JADX INFO: renamed from: bp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0070bp extends AbstractC0083cb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ComponentCallbacksC0077bw f4039a;

    public C0070bp(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        this.f4039a = componentCallbacksC0077bw;
    }

    @Override // p000.AbstractC0083cb
    /* JADX INFO: renamed from: a */
    public final View mo2638a(int i) {
        View view = this.f4039a.f4586N;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this.f4039a + " does not have a view");
    }

    @Override // p000.AbstractC0083cb
    /* JADX INFO: renamed from: b */
    public final boolean mo2639b() {
        return this.f4039a.f4586N != null;
    }
}
