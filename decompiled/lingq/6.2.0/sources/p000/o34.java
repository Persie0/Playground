package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o34 extends yl2 {

    /* JADX INFO: renamed from: I */
    public final dm2 f53766I;

    /* JADX INFO: renamed from: J */
    public x60 f53767J;

    /* JADX INFO: renamed from: K */
    public poa f53768K;

    public o34(Context context, x90 x90Var, dm2 dm2Var, x60 x60Var) {
        super(context, x90Var);
        this.f53766I = dm2Var;
        this.f53767J = x60Var;
        x60Var.f67808a = this;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        poa poaVar;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f69984l)) {
            C3153jn c3153jn = this.f69975c;
            x90 x90Var = this.f69974b;
            if (c3153jn != null && Settings.Global.getFloat(this.f69973a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (poaVar = this.f53768K) != null) {
                poaVar.setBounds(getBounds());
                this.f53768K.setTint(x90Var.f67948e[0]);
                this.f53768K.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fM25182b = m25182b();
            ObjectAnimator objectAnimator = this.f69976d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f69977e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            dm2 dm2Var = this.f53766I;
            dm2Var.f35817a.mo11063d();
            dm2Var.mo10465a(canvas, bounds, fM25182b, z, z2);
            int i2 = x90Var.f67952i;
            int i3 = this.f69983k;
            boolean z3 = (x90Var instanceof ed5) || ((x90Var instanceof q21) && ((q21) x90Var).f57154u);
            boolean z4 = z3 && i2 == 0 && !x90Var.m24412b(false);
            Paint paint = this.f69982j;
            if (!z4) {
                if (z3) {
                    bm2 bm2Var = (bm2) ((ArrayList) this.f53767J.f67809b).get(0);
                    bm2 bm2Var2 = (bm2) AbstractC3393o1.m17731f(1, (ArrayList) this.f53767J.f67809b);
                    dm2 dm2Var2 = this.f53766I;
                    if (dm2Var2 instanceof vc5) {
                        i = i2;
                        dm2Var2.mo10468d(canvas, paint, 0.0f, bm2Var.f8671a, x90Var.f67949f, i3, i);
                        this.f53766I.mo10468d(canvas, paint, bm2Var2.f8672b, 1.0f, x90Var.f67949f, i3, i);
                    } else {
                        i = i2;
                        canvas.save();
                        canvas.rotate(bm2Var2.f8677g);
                        this.f53766I.mo10468d(canvas, paint, bm2Var2.f8672b, bm2Var.f8671a + 1.0f, x90Var.f67949f, i3, i);
                        canvas.restore();
                    }
                }
                for (int i4 = 0; i4 < ((ArrayList) this.f53767J.f67809b).size(); i4++) {
                    bm2 bm2Var3 = (bm2) ((ArrayList) this.f53767J.f67809b).get(i4);
                    bm2Var3.f8676f = m25183c();
                    this.f53766I.mo10467c(canvas, paint, bm2Var3, this.f69983k);
                    if (i4 <= 0 && !z4 && z3) {
                        this.f53766I.mo10468d(canvas, paint, ((bm2) ((ArrayList) this.f53767J.f67809b).get(i4 - 1)).f8672b, bm2Var3.f8671a, x90Var.f67949f, i3, i);
                    }
                }
                canvas.restore();
            }
            this.f53766I.mo10468d(canvas, paint, 0.0f, 1.0f, x90Var.f67949f, i3, 0);
            i = i2;
            while (i4 < ((ArrayList) this.f53767J.f67809b).size()) {
                bm2 bm2Var4 = (bm2) ((ArrayList) this.f53767J.f67809b).get(i4);
                bm2Var4.f8676f = m25183c();
                this.f53766I.mo10467c(canvas, paint, bm2Var4, this.f69983k);
                if (i4 <= 0) {
                }
            }
            canvas.restore();
        }
    }

    @Override // p000.yl2
    /* JADX INFO: renamed from: e */
    public final boolean mo16760e(boolean z, boolean z2, boolean z3) {
        poa poaVar;
        boolean zMo16760e = super.mo16760e(z, z2, z3);
        if (this.f69975c != null && Settings.Global.getFloat(this.f69973a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (poaVar = this.f53768K) != null) {
            return poaVar.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.f53767J.mo278a();
        }
        if (z && z3) {
            this.f53767J.mo282k();
        }
        return zMo16760e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f53766I.mo10469e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f53766I.mo10470f();
    }
}
