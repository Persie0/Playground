package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class ts9 extends p6d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f62827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextPaint f62828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p6d f62829c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ us9 f62830d;

    public ts9(us9 us9Var, Context context, TextPaint textPaint, p6d p6dVar) {
        this.f62830d = us9Var;
        this.f62827a = context;
        this.f62828b = textPaint;
        this.f62829c = p6dVar;
    }

    @Override // p000.p6d
    /* JADX INFO: renamed from: b */
    public final void mo33b(int i) {
        this.f62829c.mo33b(i);
    }

    @Override // p000.p6d
    /* JADX INFO: renamed from: c */
    public final void mo34c(Typeface typeface, boolean z) {
        this.f62830d.m22905f(this.f62827a, this.f62828b, typeface);
        this.f62829c.mo34c(typeface, z);
    }
}
