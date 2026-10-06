package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: renamed from: op */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class C0884op {

    /* JADX INFO: renamed from: a */
    public ComplicationData f46363a;

    /* JADX INFO: renamed from: b */
    private final Rect f46364b = new Rect();

    /* JADX INFO: renamed from: a */
    public void mo18725a(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: b */
    public void mo18734b(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: c */
    public int mo18818c() {
        return 17;
    }

    /* JADX INFO: renamed from: d */
    public int mo18819d() {
        return 17;
    }

    /* JADX INFO: renamed from: e */
    public int mo18820e() {
        return 17;
    }

    /* JADX INFO: renamed from: f */
    public int mo18821f() {
        return 17;
    }

    /* JADX INFO: renamed from: g */
    public Layout.Alignment mo18822g() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: renamed from: h */
    public Layout.Alignment mo18823h() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: renamed from: i */
    public Layout.Alignment mo18824i() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: renamed from: j */
    public Layout.Alignment mo18825j() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: renamed from: k */
    public final void m18826k(Rect rect) {
        rect.set(this.f46364b);
    }

    /* JADX INFO: renamed from: l */
    public void mo18827l(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: m */
    public void mo18828m(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: n */
    public void mo18829n(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: o */
    public void mo18830o(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: p */
    public void mo18831p(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: q */
    public void mo18832q(Rect rect) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: r */
    public void mo18833r(ComplicationData complicationData) {
        this.f46363a = complicationData;
    }

    /* JADX INFO: renamed from: s */
    public void mo18834s(int i) {
        this.f46364b.bottom = i;
    }

    /* JADX INFO: renamed from: t */
    public void mo18835t(int i) {
        this.f46364b.right = i;
    }

    /* JADX INFO: renamed from: u */
    public final void m18836u(int i, int i2, ComplicationData complicationData) {
        mo18835t(i);
        mo18834s(i2);
        mo18833r(complicationData);
    }
}
