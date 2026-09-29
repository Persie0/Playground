package p425v1;

import android.graphics.Paint;
import android.support.v4.media.AbstractC0140a;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import dm.C5207g;
import p424v0.C9623g;
import p424v0.C9624h;

/* JADX INFO: renamed from: v1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9625a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public final AbstractC0140a f49300a;

    public C9625a(AbstractC0140a abstractC0140a) {
        this.f49300a = abstractC0140a;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C9623g c9623g = C9623g.f49295a;
            AbstractC0140a abstractC0140a = this.f49300a;
            if (C5207g.m11106a(abstractC0140a, c9623g)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC0140a instanceof C9624h) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((C9624h) abstractC0140a).f49296a);
                textPaint.setStrokeMiter(((C9624h) abstractC0140a).f49297b);
                int i10 = ((C9624h) abstractC0140a).f49299d;
                boolean z10 = true;
                if (i10 == 0) {
                    join = Paint.Join.MITER;
                } else {
                    if (i10 == 1) {
                        join = Paint.Join.ROUND;
                    } else {
                        join = i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
                    }
                }
                textPaint.setStrokeJoin(join);
                int i11 = ((C9624h) abstractC0140a).f49298c;
                if (i11 == 0) {
                    cap = Paint.Cap.BUTT;
                } else {
                    if (i11 == 1) {
                        cap = Paint.Cap.ROUND;
                    } else {
                        if (i11 != 2) {
                            z10 = false;
                        }
                        cap = z10 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                    }
                }
                textPaint.setStrokeCap(cap);
                ((C9624h) abstractC0140a).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
