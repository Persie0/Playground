package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: renamed from: os */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0887os extends C0884op {

    /* JADX INFO: renamed from: b */
    private final Rect f46475b = new Rect();

    @Override // p000.C0884op
    /* JADX INFO: renamed from: a */
    public final void mo18725a(Rect rect) {
        if (this.f46363a.m1366c() == null) {
            rect.setEmpty();
            return;
        }
        m18826k(rect);
        if (C0169eu.m7881k(rect)) {
            C0169eu.m7877g(rect, rect);
            return;
        }
        C0169eu.m7876f(rect, rect);
        C0169eu.m7879i(rect, rect);
        C0169eu.m7876f(rect, rect);
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: e */
    public final int mo18820e() {
        ComplicationData complicationData = this.f46363a;
        return (complicationData.m1372i() == null || complicationData.m1366c() != null) ? 16 : 80;
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: f */
    public final int mo18821f() {
        return 48;
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: i */
    public final Layout.Alignment mo18824i() {
        ComplicationData complicationData = this.f46363a;
        m18826k(this.f46475b);
        return (!C0169eu.m7881k(this.f46475b) || complicationData.m1366c() == null) ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: j */
    public final Layout.Alignment mo18825j() {
        return mo18824i();
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: o */
    public final void mo18830o(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        m18826k(rect);
        if (complicationData.m1366c() == null) {
            if (complicationData.m1372i() != null) {
                C0169eu.m7879i(rect, rect);
            }
        } else if (C0169eu.m7881k(rect)) {
            C0169eu.m7878h(rect, rect);
        } else {
            C0169eu.m7876f(rect, rect);
            C0169eu.m7875e(rect, rect);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: p */
    public final void mo18831p(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        if (complicationData.m1366c() != null || complicationData.m1372i() == null) {
            rect.setEmpty();
        } else {
            m18826k(rect);
            C0169eu.m7875e(rect, rect);
        }
    }
}
