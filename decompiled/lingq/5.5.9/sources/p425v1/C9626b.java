package p425v1;

import ae.C0062b;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import dm.C5207g;
import kotlin.Pair;
import p338qd.C8573r0;
import p375s0.C8944f;
import p387t0.AbstractC9150i0;

/* JADX INFO: renamed from: v1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9626b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public final AbstractC9150i0 f49301a;

    /* JADX INFO: renamed from: b */
    public final float f49302b;

    /* JADX INFO: renamed from: c */
    public long f49303c = C8944f.f46907c;

    /* JADX INFO: renamed from: d */
    public Pair<C8944f, ? extends Shader> f49304d;

    public C9626b(AbstractC9150i0 abstractC9150i0, float f3) {
        this.f49301a = abstractC9150i0;
        this.f49302b = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5207g.m11111f(textPaint, "textPaint");
        float f3 = this.f49302b;
        if (!Float.isNaN(f3)) {
            textPaint.setAlpha(C8573r0.m16710Y0(C0062b.m357j0(f3, 0.0f, 1.0f) * 255));
        }
        long j10 = this.f49303c;
        if (j10 == C8944f.f46907c) {
            return;
        }
        Pair<C8944f, ? extends Shader> pair = this.f49304d;
        Shader shaderMo17469b = (pair == null || !C8944f.m17174a(pair.f38012a.f46909a, j10)) ? this.f49301a.mo17469b() : (Shader) pair.f38013b;
        textPaint.setShader(shaderMo17469b);
        this.f49304d = new Pair<>(new C8944f(this.f49303c), shaderMo17469b);
    }
}
