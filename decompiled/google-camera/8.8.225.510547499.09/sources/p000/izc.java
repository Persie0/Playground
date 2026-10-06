package p000;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izc implements ize {

    /* JADX INFO: renamed from: a */
    private final TextView f32704a;

    public izc(TextView textView) {
        this.f32704a = textView;
    }

    @Override // p000.ize
    /* JADX INFO: renamed from: a */
    public final View mo11912a() {
        return this.f32704a;
    }

    @Override // p000.ize
    /* JADX INFO: renamed from: b */
    public final void mo11913b(CharSequence charSequence) {
        this.f32704a.setText(charSequence);
    }

    @Override // p000.ize
    /* JADX INFO: renamed from: c */
    public final void mo11914c(int i) {
        this.f32704a.setTextColor(i);
    }
}
