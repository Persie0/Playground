package p000;

import android.view.View;
import androidx.wear.widget.CurvedTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izb implements ize {

    /* JADX INFO: renamed from: a */
    private final CurvedTextView f32703a;

    public izb(CurvedTextView curvedTextView) {
        this.f32703a = curvedTextView;
    }

    @Override // p000.ize
    /* JADX INFO: renamed from: a */
    public final View mo11912a() {
        return this.f32703a;
    }

    @Override // p000.ize
    /* JADX INFO: renamed from: b */
    public final void mo11913b(CharSequence charSequence) {
        CurvedTextView curvedTextView = this.f32703a;
        String string = charSequence != null ? charSequence.toString() : "";
        curvedTextView.f1743b = string != null ? string : "";
        curvedTextView.m1688f();
    }

    @Override // p000.ize
    /* JADX INFO: renamed from: c */
    public final void mo11914c(int i) {
        CurvedTextView curvedTextView = this.f32703a;
        curvedTextView.f1744c = i;
        curvedTextView.f1742a = true;
        curvedTextView.postInvalidate();
    }
}
