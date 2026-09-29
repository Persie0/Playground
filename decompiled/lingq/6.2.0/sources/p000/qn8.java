package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class qn8 implements rn8 {

    /* JADX INFO: renamed from: a */
    public final ScrollFeedbackProvider f57989a;

    public qn8(NestedScrollView nestedScrollView) {
        this.f57989a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p000.rn8
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f57989a.onScrollLimit(i, i2, i3, z);
    }

    @Override // p000.rn8
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f57989a.onScrollProgress(i, i2, i3, i4);
    }
}
