package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.lingq.core.designsystem.R$attr;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class t6a extends View {

    /* JADX INFO: renamed from: a */
    public final RectF f61917a;

    /* JADX INFO: renamed from: b */
    public final Paint f61918b;

    /* JADX INFO: renamed from: c */
    public final Paint f61919c;

    /* JADX INFO: renamed from: d */
    public final Path f61920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6a(MainActivity mainActivity, Rect rect) {
        super(mainActivity);
        rect.getClass();
        this.f61917a = new RectF(rect);
        Paint paint = new Paint();
        this.f61918b = paint;
        Paint paint2 = new Paint();
        this.f61919c = paint2;
        this.f61920d = new Path();
        setLayerType(2, null);
        setBackgroundColor(jfa.m14431n(mainActivity, R$attr.fadeBgColor));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(jfa.m14431n(mainActivity, R$attr.tooltipColor));
        paint2.setStrokeWidth(5.0f);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Path path = this.f61920d;
        path.reset();
        RectF rectF = this.f61917a;
        path.addRoundRect(new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom), new float[]{15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f}, Path.Direction.CW);
        path.close();
        canvas.drawPath(path, this.f61918b);
        canvas.drawPath(path, this.f61919c);
        canvas.clipPath(path);
    }
}
