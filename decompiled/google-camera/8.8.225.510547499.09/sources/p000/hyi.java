package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hyi {

    /* JADX INFO: renamed from: a */
    int f29915a;

    /* JADX INFO: renamed from: b */
    boolean f29916b;

    /* JADX INFO: renamed from: c */
    final Paint f29917c;

    public hyi(Paint paint) {
        this.f29917c = paint;
    }

    /* JADX INFO: renamed from: a */
    public final void m10869a(int i) {
        this.f29917c.setAlpha(i);
    }

    /* JADX INFO: renamed from: b */
    public void mo10870b(Canvas canvas, RectF rectF) {
        if (this.f29916b) {
            return;
        }
        canvas.drawLine(rectF.left, rectF.top + this.f29915a, rectF.right, rectF.top + this.f29915a, this.f29917c);
    }
}
