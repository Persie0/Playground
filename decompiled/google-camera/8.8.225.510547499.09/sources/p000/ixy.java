package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class ixy extends C0825mk {

    /* JADX INFO: renamed from: a */
    private final float f32620a;

    public ixy(Context context, float f) {
        super(context);
        this.f32620a = 160.0f / Math.max(0.01f, f);
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: a */
    protected final float mo11878a(DisplayMetrics displayMetrics) {
        return this.f32620a / displayMetrics.densityDpi;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: g */
    public final int mo11879g(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? ((i3 + i4) - (i + i2)) / 2 : super.mo11879g(i, i2, i3, i4, i5);
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: h */
    public final int mo11880h(View view, int i) {
        int iMo11880h = super.mo11880h(view, i);
        return i == 0 ? iMo11880h - kbd.m13922k(this.f40798d, view).x : iMo11880h;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: i */
    public final int mo11881i(View view, int i) {
        int iMo11881i = super.mo11881i(view, i);
        return i == 0 ? iMo11881i - kbd.m13922k(this.f40798d, view).y : iMo11881i;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: k */
    protected final int mo11882k() {
        return 0;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: l */
    protected final int mo11883l() {
        return 0;
    }
}
