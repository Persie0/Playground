package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: renamed from: or */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0886or extends C0884op {

    /* JADX INFO: renamed from: b */
    private static final float f46439b = (float) (1.0d / Math.sqrt(2.0d));

    /* JADX INFO: renamed from: c */
    private final C0887os f46440c = new C0887os();

    /* JADX INFO: renamed from: d */
    private final Rect f46441d = new Rect();

    /* JADX INFO: renamed from: e */
    private final Rect f46442e = new Rect();

    /* JADX INFO: renamed from: v */
    private final void m18945v() {
        if (this.f46363a != null) {
            mo18829n(this.f46441d);
            Rect rect = this.f46441d;
            C0169eu.m7880j(rect, rect, f46439b * 0.7f);
            this.f46440c.m18836u(this.f46441d.width(), this.f46441d.height(), this.f46363a);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: a */
    public final void mo18725a(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        if (complicationData.m1366c() == null) {
            rect.setEmpty();
            return;
        }
        m18826k(rect);
        if (complicationData.m1371h() == null || C0169eu.m7881k(rect)) {
            C0169eu.m7880j(rect, this.f46441d, 0.7f);
        } else {
            this.f46440c.mo18725a(rect);
            rect.offset(this.f46441d.left, this.f46441d.top);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: e */
    public final int mo18820e() {
        ComplicationData complicationData = this.f46363a;
        m18826k(this.f46442e);
        if (C0169eu.m7881k(this.f46442e)) {
            return complicationData.m1372i() != null ? 80 : 16;
        }
        return this.f46440c.mo18820e();
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: f */
    public final int mo18821f() {
        return 48;
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: i */
    public final Layout.Alignment mo18824i() {
        m18826k(this.f46442e);
        return C0169eu.m7881k(this.f46442e) ? Layout.Alignment.ALIGN_NORMAL : this.f46440c.mo18824i();
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: j */
    public final Layout.Alignment mo18825j() {
        return mo18824i();
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: n */
    public final void mo18829n(Rect rect) {
        m18826k(rect);
        if (this.f46363a.m1371h() == null || !C0169eu.m7881k(rect)) {
            C0169eu.m7876f(rect, rect);
            C0169eu.m7880j(rect, rect, 0.95f);
        } else {
            C0169eu.m7877g(rect, rect);
            C0169eu.m7880j(rect, rect, 0.95f);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: o */
    public final void mo18830o(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        if (complicationData.m1371h() == null) {
            rect.setEmpty();
            return;
        }
        m18826k(rect);
        if (!C0169eu.m7881k(rect)) {
            this.f46440c.mo18830o(rect);
            rect.offset(this.f46441d.left, this.f46441d.top);
        } else if (complicationData.m1372i() == null || complicationData.m1366c() != null) {
            C0169eu.m7878h(rect, rect);
        } else {
            C0169eu.m7878h(rect, rect);
            C0169eu.m7879i(rect, rect);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: p */
    public final void mo18831p(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        if (complicationData.m1372i() == null || complicationData.m1371h() == null) {
            rect.setEmpty();
            return;
        }
        m18826k(rect);
        if (C0169eu.m7881k(rect)) {
            C0169eu.m7878h(rect, rect);
            C0169eu.m7875e(rect, rect);
        } else {
            this.f46440c.mo18831p(rect);
            rect.offset(this.f46441d.left, this.f46441d.top);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: r */
    public final void mo18833r(ComplicationData complicationData) {
        this.f46363a = complicationData;
        m18945v();
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: s */
    public final void mo18834s(int i) {
        super.mo18834s(i);
        m18945v();
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: t */
    public final void mo18835t(int i) {
        super.mo18835t(i);
        m18945v();
    }
}
