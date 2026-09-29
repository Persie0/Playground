package p000;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class nl2 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public final ml2 f52908a;

    public nl2(ml2 ml2Var) {
        this.f52908a = ml2Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            w33 w33Var = w33.f66328a;
            ml2 ml2Var = this.f52908a;
            if (fa4.m11650l(ml2Var, w33Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(ml2Var instanceof el9)) {
                gm5.m12750e();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            el9 el9Var = (el9) ml2Var;
            textPaint.setStrokeWidth(el9Var.f37448a);
            textPaint.setStrokeMiter(el9Var.f37449b);
            int i = el9Var.f37451d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = el9Var.f37450c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
