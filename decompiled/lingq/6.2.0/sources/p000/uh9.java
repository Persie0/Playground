package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class uh9 {

    /* JADX INFO: renamed from: a */
    public CharSequence f63935a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f63936b;

    /* JADX INFO: renamed from: c */
    public final int f63937c;

    /* JADX INFO: renamed from: d */
    public int f63938d;

    /* JADX INFO: renamed from: k */
    public boolean f63945k;

    /* JADX INFO: renamed from: m */
    public dw6 f63947m;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f63939e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f63940f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f63941g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f63942h = 1.0f;

    /* JADX INFO: renamed from: i */
    public int f63943i = 1;

    /* JADX INFO: renamed from: j */
    public boolean f63944j = true;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f63946l = null;

    public uh9(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f63935a = charSequence;
        this.f63936b = textPaint;
        this.f63937c = i;
        this.f63938d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m22737a() {
        if (this.f63935a == null) {
            this.f63935a = "";
        }
        int iMax = Math.max(0, this.f63937c);
        CharSequence charSequenceEllipsize = this.f63935a;
        int i = this.f63940f;
        TextPaint textPaint = this.f63936b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f63946l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f63938d);
        this.f63938d = iMin;
        if (this.f63945k && this.f63940f == 1) {
            this.f63939e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f63939e);
        builderObtain.setIncludePad(this.f63944j);
        builderObtain.setTextDirection(this.f63945k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f63946l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f63940f);
        float f = this.f63941g;
        if (f != 0.0f || this.f63942h != 1.0f) {
            builderObtain.setLineSpacing(f, this.f63942h);
        }
        if (this.f63940f > 1) {
            builderObtain.setHyphenationFrequency(this.f63943i);
        }
        dw6 dw6Var = this.f63947m;
        if (dw6Var != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) dw6Var.f36323b).f13261P.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
