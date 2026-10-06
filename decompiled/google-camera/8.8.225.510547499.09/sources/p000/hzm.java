package p000;

import android.graphics.Rect;
import android.util.Size;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzm {

    /* JADX INFO: renamed from: a */
    public static final hzm f30037a;

    /* JADX INFO: renamed from: b */
    public final Size f30038b;

    /* JADX INFO: renamed from: c */
    public final Rect f30039c;

    /* JADX INFO: renamed from: d */
    public final Rect f30040d;

    /* JADX INFO: renamed from: e */
    public final Rect f30041e;

    /* JADX INFO: renamed from: f */
    public final Rect f30042f;

    /* JADX INFO: renamed from: g */
    public final Rect f30043g;

    /* JADX INFO: renamed from: h */
    public final Rect f30044h;

    /* JADX INFO: renamed from: i */
    public final Rect f30045i;

    /* JADX INFO: renamed from: j */
    public final Rect f30046j;

    /* JADX INFO: renamed from: k */
    public final Rect f30047k;

    /* JADX INFO: renamed from: l */
    public final Rect f30048l;

    /* JADX INFO: renamed from: m */
    public final Rect f30049m;

    /* JADX INFO: renamed from: n */
    public final Rect f30050n;

    /* JADX INFO: renamed from: o */
    public final Rect f30051o;

    /* JADX INFO: renamed from: p */
    public final Rect f30052p;

    /* JADX INFO: renamed from: q */
    public final Rect f30053q;

    /* JADX INFO: renamed from: r */
    public final boolean f30054r;

    /* JADX INFO: renamed from: s */
    public final boolean f30055s;

    static {
        hzl hzlVarM10940b = m10940b();
        hzlVarM10940b.m10936q(new Size(0, 0));
        hzlVarM10940b.m10930k(new Rect());
        hzlVarM10940b.m10934o(new Rect());
        hzlVarM10940b.m10931l(new Rect());
        hzlVarM10940b.m10935p(new Rect());
        hzlVarM10940b.m10938s(new Rect());
        hzlVarM10940b.m10921b(new Rect());
        hzlVarM10940b.m10926g(new Rect());
        hzlVarM10940b.m10923d(new Rect());
        hzlVarM10940b.m10924e(new Rect());
        hzlVarM10940b.m10929j(new Rect());
        hzlVarM10940b.m10922c(new Rect());
        hzlVarM10940b.m10925f(new Rect());
        hzlVarM10940b.m10928i(true);
        hzlVarM10940b.m10937r(true);
        hzlVarM10940b.m10933n(new Rect());
        hzlVarM10940b.m10932m(new Rect());
        hzlVarM10940b.m10927h(new Rect());
        f30037a = hzlVarM10940b.m10920a();
    }

    public hzm() {
    }

    public hzm(Size size, Rect rect, Rect rect2, Rect rect3, Rect rect4, Rect rect5, Rect rect6, Rect rect7, Rect rect8, Rect rect9, Rect rect10, Rect rect11, Rect rect12, Rect rect13, Rect rect14, Rect rect15, boolean z, boolean z2) {
        this.f30038b = size;
        this.f30039c = rect;
        this.f30040d = rect2;
        this.f30041e = rect3;
        this.f30042f = rect4;
        this.f30043g = rect5;
        this.f30044h = rect6;
        this.f30045i = rect7;
        this.f30046j = rect8;
        this.f30047k = rect9;
        this.f30048l = rect10;
        this.f30049m = rect11;
        this.f30050n = rect12;
        this.f30051o = rect13;
        this.f30052p = rect14;
        this.f30053q = rect15;
        this.f30054r = z;
        this.f30055s = z2;
    }

    /* JADX INFO: renamed from: a */
    static Rect m10939a(Rect rect, Size size, ilk ilkVar) {
        ilk ilkVar2 = ilk.PORTRAIT;
        switch (ilkVar) {
            case PORTRAIT:
                return rect;
            case LANDSCAPE:
                return new Rect(rect.top, size.getHeight() - rect.right, rect.bottom, size.getHeight() - rect.left);
            case REVERSE_LANDSCAPE:
                return new Rect(size.getWidth() - rect.bottom, rect.left, size.getWidth() - rect.top, rect.right);
            case REVERSE_PORTRAIT:
                return new Rect(size.getWidth() - rect.right, size.getHeight() - rect.bottom, size.getWidth() - rect.left, size.getHeight() - rect.top);
            default:
                throw new IllegalArgumentException("Unexpected UI Orientation: ".concat(String.valueOf(String.valueOf(ilkVar))));
        }
    }

    /* JADX INFO: renamed from: b */
    static hzl m10940b() {
        hzl hzlVar = new hzl();
        hzlVar.m10928i(false);
        hzlVar.m10937r(true);
        return hzlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzm) {
            hzm hzmVar = (hzm) obj;
            if (this.f30038b.equals(hzmVar.f30038b) && this.f30039c.equals(hzmVar.f30039c) && this.f30040d.equals(hzmVar.f30040d) && this.f30041e.equals(hzmVar.f30041e) && this.f30042f.equals(hzmVar.f30042f) && this.f30043g.equals(hzmVar.f30043g) && this.f30044h.equals(hzmVar.f30044h) && this.f30045i.equals(hzmVar.f30045i) && this.f30046j.equals(hzmVar.f30046j) && this.f30047k.equals(hzmVar.f30047k) && this.f30048l.equals(hzmVar.f30048l) && this.f30049m.equals(hzmVar.f30049m) && this.f30050n.equals(hzmVar.f30050n) && this.f30051o.equals(hzmVar.f30051o) && this.f30052p.equals(hzmVar.f30052p) && this.f30053q.equals(hzmVar.f30053q) && this.f30054r == hzmVar.f30054r && this.f30055s == hzmVar.f30055s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.f30038b.hashCode() ^ 1000003) * 1000003) ^ this.f30039c.hashCode()) * 1000003) ^ this.f30040d.hashCode()) * 1000003) ^ this.f30041e.hashCode()) * 1000003) ^ this.f30042f.hashCode()) * 1000003) ^ this.f30043g.hashCode()) * 1000003) ^ this.f30044h.hashCode()) * 1000003) ^ this.f30045i.hashCode()) * 1000003) ^ this.f30046j.hashCode()) * 1000003) ^ this.f30047k.hashCode()) * 1000003) ^ this.f30048l.hashCode()) * 1000003) ^ this.f30049m.hashCode()) * 1000003) ^ this.f30050n.hashCode()) * 1000003) ^ this.f30051o.hashCode()) * 1000003) ^ this.f30052p.hashCode()) * 1000003) ^ this.f30053q.hashCode();
        return (((iHashCode * 1000003) ^ (true != this.f30054r ? 1237 : 1231)) * 1000003) ^ (true == this.f30055s ? 1231 : 1237);
    }

    public final String toString() {
        return "CameraLayoutBoxes{window=" + String.valueOf(this.f30038b) + ", previewOverlay=" + String.valueOf(this.f30039c) + ", optionsMenuContainer=" + String.valueOf(this.f30040d) + ", preview=" + String.valueOf(this.f30041e) + ", uncoveredPreview=" + String.valueOf(this.f30042f) + ", viewfinderCoverIconArea=" + String.valueOf(this.f30043g) + ", zoomUi=" + String.valueOf(this.f30044h) + ", bottomBar=" + String.valueOf(this.f30045i) + ", gradientBar=" + String.valueOf(this.f30046j) + ", fullScreen=" + String.valueOf(this.f30047k) + NptsKnlVczSZ.SjZK + String.valueOf(this.f30048l) + ", timerWidget=" + String.valueOf(this.f30049m) + ", cutoutArea=" + String.valueOf(this.f30050n) + ", modeSlider=" + String.valueOf(this.f30051o) + ", previewWidgets=" + String.valueOf(this.f30052p) + ", moreModes=" + String.valueOf(this.f30053q) + ", needsRetry=" + this.f30054r + ", zoomInViewfinder=" + this.f30055s + "}";
    }
}
