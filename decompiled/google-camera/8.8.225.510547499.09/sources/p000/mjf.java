package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mjf extends ImageButton {

    /* JADX INFO: renamed from: d */
    public int f40728d;

    public mjf(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m16443g(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f40728d = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        m16443g(i, true);
    }

    public mjf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mjf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40728d = getVisibility();
    }
}
