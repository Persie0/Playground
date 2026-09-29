package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class iua extends lua {

    /* JADX INFO: renamed from: g */
    public float[] f44621g;

    /* JADX INFO: renamed from: h */
    public cj1 f44622h;

    @Override // p000.lua
    /* JADX INFO: renamed from: c */
    public final void mo14154c(cj1 cj1Var) {
        this.f44622h = cj1Var;
    }

    @Override // p000.lua
    /* JADX INFO: renamed from: d */
    public final void mo13481d(View view, float f) {
        float[] fArr = this.f44621g;
        fArr[0] = m16547a(f);
        bad.m3548c(this.f44622h, view, fArr);
    }
}
