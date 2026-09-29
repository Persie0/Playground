package p000;

import android.view.View;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.p020ui.HomeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class vu3 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HomeFragment f65912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f65913b;

    public vu3(HomeFragment homeFragment, int i) {
        this.f65912a = homeFragment;
        this.f65913b = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        bh4[] bh4VarArr = HomeFragment.f33886N0;
        this.f65912a.m9798k0().m9810Y2(this.f65913b, LqAnalyticsValues$LessonPath.Unknown.f14315a);
    }
}
