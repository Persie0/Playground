package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hym extends hyi {
    public hym(Paint paint) {
        super(paint);
    }

    @Override // p000.hyi
    /* JADX INFO: renamed from: b */
    public final void mo10870b(Canvas canvas, RectF rectF) {
        if (this.f29916b) {
            return;
        }
        canvas.drawLine(rectF.left + this.f29915a, rectF.top, rectF.left + this.f29915a, rectF.bottom, this.f29917c);
    }
}
