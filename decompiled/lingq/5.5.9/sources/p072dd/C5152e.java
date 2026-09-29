package p072dd;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.media.AbstractC0140a;
import android.text.TextPaint;

/* JADX INFO: renamed from: dd.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5152e extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f33143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextPaint f33144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0140a f33145c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C5151d f33146d;

    public C5152e(C5151d c5151d, Context context, TextPaint textPaint, AbstractC0140a abstractC0140a) {
        this.f33146d = c5151d;
        this.f33143a = context;
        this.f33144b = textPaint;
        this.f33145c = abstractC0140a;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: X */
    public final void mo586X(int i10) {
        this.f33145c.mo586X(i10);
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: Y */
    public final void mo587Y(Typeface typeface, boolean z10) {
        this.f33146d.m10936g(this.f33143a, this.f33144b, typeface);
        this.f33145c.mo587Y(typeface, z10);
    }
}
