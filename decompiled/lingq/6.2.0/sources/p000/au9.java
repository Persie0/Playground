package p000;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class au9 {

    /* JADX INFO: renamed from: c */
    public float f7525c;

    /* JADX INFO: renamed from: d */
    public float f7526d;

    /* JADX INFO: renamed from: f */
    public final WeakReference f7528f;

    /* JADX INFO: renamed from: g */
    public us9 f7529g;

    /* JADX INFO: renamed from: a */
    public final TextPaint f7523a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final yt9 f7524b = new yt9(this);

    /* JADX INFO: renamed from: e */
    public boolean f7527e = true;

    public au9(zt9 zt9Var) {
        this.f7528f = new WeakReference(null);
        this.f7528f = new WeakReference(zt9Var);
    }

    /* JADX INFO: renamed from: a */
    public final float m3066a(String str) {
        if (!this.f7527e) {
            return this.f7525c;
        }
        m3067b(str);
        return this.f7525c;
    }

    /* JADX INFO: renamed from: b */
    public final void m3067b(String str) {
        TextPaint textPaint = this.f7523a;
        this.f7525c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f7526d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f7527e = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m3068c(us9 us9Var, Context context) {
        if (this.f7529g != us9Var) {
            this.f7529g = us9Var;
            WeakReference weakReference = this.f7528f;
            if (us9Var != null) {
                TextPaint textPaint = this.f7523a;
                yt9 yt9Var = this.f7524b;
                us9Var.m22904e(context, textPaint, yt9Var);
                zt9 zt9Var = (zt9) weakReference.get();
                if (zt9Var != null) {
                    textPaint.drawableState = zt9Var.getState();
                }
                us9Var.m22903d(context, textPaint, yt9Var);
                this.f7527e = true;
            }
            zt9 zt9Var2 = (zt9) weakReference.get();
            if (zt9Var2 != null) {
                zt9Var2.mo11471a();
                zt9Var2.onStateChange(zt9Var2.getState());
            }
        }
    }
}
