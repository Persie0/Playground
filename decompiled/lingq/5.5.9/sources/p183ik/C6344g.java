package p183ik;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: ik.g */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C6344g extends View {

    /* JADX INFO: renamed from: a */
    public final RectF f36662a;

    /* JADX INFO: renamed from: b */
    public final Paint f36663b;

    /* JADX INFO: renamed from: c */
    public final Paint f36664c;

    /* JADX INFO: renamed from: d */
    public final Path f36665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6344g(Context context, Rect rect) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(rect, "viewToHighlight");
        this.f36662a = new RectF(rect);
        Paint paint = new Paint();
        this.f36663b = paint;
        Paint paint2 = new Paint();
        this.f36664c = paint2;
        this.f36665d = new Path();
        setLayerType(2, null);
        List<Integer> list = C6716m.f37937a;
        setBackgroundColor(C6716m.m13333r(R.attr.fadeBgColor, context));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(C6716m.m13333r(R.attr.tooltipColor, context));
        paint2.setStrokeWidth(5.0f);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f36665d;
        path.reset();
        RectF rectF = this.f36662a;
        path.addRoundRect(new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom), new float[]{15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f}, Path.Direction.CW);
        path.close();
        if (canvas != null) {
            canvas.drawPath(path, this.f36663b);
        }
        if (canvas != null) {
            canvas.drawPath(path, this.f36664c);
        }
        if (canvas != null) {
            canvas.clipPath(path);
        }
    }
}
