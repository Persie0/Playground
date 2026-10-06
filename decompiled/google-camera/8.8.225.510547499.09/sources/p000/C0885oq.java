package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: renamed from: oq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0885oq extends C0884op {

    /* JADX INFO: renamed from: b */
    private final Rect f46412b = new Rect();

    /* JADX INFO: renamed from: v */
    private final boolean m18900v(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        return (complicationData.m1366c() == null && complicationData.m1367d() == null) || !C0169eu.m7881k(rect);
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: a */
    public final void mo18725a(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        m18826k(rect);
        if (complicationData.m1366c() == null || complicationData.m1367d() != null || m18900v(rect)) {
            rect.setEmpty();
        } else {
            C0169eu.m7877g(rect, rect);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: c */
    public final int mo18818c() {
        return this.f46363a.m1370g() == null ? 16 : 80;
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: d */
    public final int mo18819d() {
        return 48;
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: g */
    public final Layout.Alignment mo18822g() {
        m18826k(this.f46412b);
        return m18900v(this.f46412b) ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: h */
    public final Layout.Alignment mo18823h() {
        return mo18822g();
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: l */
    public final void mo18827l(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        m18826k(rect);
        if (m18900v(rect)) {
            if (complicationData.m1370g() != null) {
                C0169eu.m7879i(rect, rect);
            }
        } else if (complicationData.m1370g() == null) {
            C0169eu.m7878h(rect, rect);
        } else {
            C0169eu.m7878h(rect, rect);
            C0169eu.m7879i(rect, rect);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: m */
    public final void mo18828m(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        m18826k(rect);
        if (complicationData.m1370g() == null) {
            rect.setEmpty();
        } else if (m18900v(rect)) {
            C0169eu.m7875e(rect, rect);
        } else {
            C0169eu.m7878h(rect, rect);
            C0169eu.m7875e(rect, rect);
        }
    }

    @Override // p000.C0884op
    /* JADX INFO: renamed from: q */
    public final void mo18832q(Rect rect) {
        ComplicationData complicationData = this.f46363a;
        m18826k(rect);
        if (complicationData.m1367d() == null || m18900v(rect)) {
            rect.setEmpty();
        } else {
            C0169eu.m7877g(rect, rect);
        }
    }
}
