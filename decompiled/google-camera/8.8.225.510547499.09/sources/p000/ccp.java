package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccp implements fux {

    /* JADX INFO: renamed from: a */
    private static final nbh f5182a = nbh.m17259h(HEePJw.dpScmYwoRYSXMWd);

    /* JADX INFO: renamed from: b */
    private final PointF f5183b;

    /* JADX INFO: renamed from: c */
    private final PointF f5184c;

    /* JADX INFO: renamed from: d */
    private final int f5185d;

    /* JADX INFO: renamed from: e */
    private final oyo f5186e;

    public ccp(PointF pointF, PointF pointF2, oyo oyoVar, int i, byte[] bArr, byte[] bArr2) {
        this.f5183b = pointF;
        this.f5184c = pointF2;
        this.f5186e = oyoVar;
        this.f5185d = i;
    }

    /* JADX INFO: renamed from: c */
    public static ccp m3453c(PointF pointF, PointF pointF2, int i) {
        lku.m15670x(i % 90 == 0, "sensorOrientation must be a multiple of 90");
        lku.m15670x(i >= 0, "sensorOrientation must not be negative");
        return new ccp(pointF, pointF2, new oyo(i % 360), 0, null, null);
    }

    /* JADX INFO: renamed from: d */
    private final MeteringRectangle m3454d(PointF pointF, Rect rect) {
        if (rect.width() < 0 || rect.height() < 0) {
            ((nbe) ((nbe) f5182a.m17252c()).mo17276G((char) 7)).mo17293r("Negative cropRegion: %s", rect);
        }
        rect.left = Math.max(0, rect.left);
        rect.top = Math.max(0, rect.top);
        rect.right = Math.max(rect.left, rect.right);
        rect.bottom = Math.max(rect.top, rect.bottom);
        float fMax = Math.max(0, Math.min(rect.width(), rect.height()));
        PointF pointFM19203g = this.f5186e.m19203g(pointF);
        PointF pointF2 = new PointF(rect.left + (pointFM19203g.x * rect.width()), rect.top + (pointFM19203g.y * rect.height()));
        float f = (int) (fMax * 0.06125f);
        Rect rect2 = new Rect((int) (pointF2.x - f), (int) (pointF2.y - f), (int) (pointF2.x + f), (int) (pointF2.y + f));
        rect2.left = m3455e(rect2.left, rect.left, rect.right);
        rect2.top = m3455e(rect2.top, rect.top, rect.bottom);
        rect2.right = m3455e(rect2.right, rect.left, rect.right);
        rect2.bottom = m3455e(rect2.bottom, rect.top, rect.bottom);
        int i = this.f5185d;
        if (i == 0) {
            i = 122;
        }
        return new MeteringRectangle(rect2, i);
    }

    /* JADX INFO: renamed from: e */
    private static final int m3455e(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    @Override // p000.fux
    /* JADX INFO: renamed from: a */
    public final MeteringRectangle[] mo3456a(Rect rect) {
        return new MeteringRectangle[]{m3454d(this.f5184c, rect)};
    }

    @Override // p000.fux
    /* JADX INFO: renamed from: b */
    public final MeteringRectangle[] mo3457b(Rect rect) {
        return new MeteringRectangle[]{m3454d(this.f5183b, rect)};
    }
}
