package bd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import bd.AbstractC1359c;

/* JADX INFO: renamed from: bd.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1369m<S extends AbstractC1359c> {

    /* JADX INFO: renamed from: a */
    public final S f8257a;

    /* JADX INFO: renamed from: b */
    public AbstractC1368l f8258b;

    public AbstractC1369m(S s10) {
        this.f8257a = s10;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4939a(Canvas canvas, Rect rect, float f3);

    /* JADX INFO: renamed from: b */
    public abstract void mo4940b(Canvas canvas, Paint paint, float f3, float f10, int i10);

    /* JADX INFO: renamed from: c */
    public abstract void mo4941c(Canvas canvas, Paint paint);

    /* JADX INFO: renamed from: d */
    public abstract int mo4942d();

    /* JADX INFO: renamed from: e */
    public abstract int mo4943e();
}
