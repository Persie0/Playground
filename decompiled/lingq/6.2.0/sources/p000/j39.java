package p000;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class j39 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public final i39 f45021a;

    /* JADX INFO: renamed from: b */
    public final float f45022b;

    /* JADX INFO: renamed from: c */
    public final t66 f45023c = AbstractC0278f.m1260j(new x89(9205357640488583168L));

    /* JADX INFO: renamed from: d */
    public final gc2 f45024d = AbstractC0278f.m1254d(new br8(this, 2));

    public j39(i39 i39Var, float f) {
        this.f45021a = i39Var;
        this.f45022b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        b34.m3221Q(textPaint, this.f45022b);
        textPaint.setShader((Shader) this.f45024d.getValue());
    }
}
