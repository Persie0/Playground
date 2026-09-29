package p000;

import androidx.concurrent.futures.C0464b;

/* JADX INFO: loaded from: classes2.dex */
public final class fm0 extends AbstractC3632u1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ gm0 f39276h;

    public fm0(gm0 gm0Var) {
        this.f39276h = gm0Var;
    }

    @Override // p000.AbstractC3632u1
    /* JADX INFO: renamed from: i */
    public final String mo11935i() {
        C0464b c0464b = (C0464b) this.f39276h.f40989a.get();
        if (c0464b == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c0464b.f5328a + "]";
    }
}
