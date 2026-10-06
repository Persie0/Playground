package p000;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfz extends aei {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AppBarLayout.BaseBehavior f40403a;

    public mfz(AppBarLayout.BaseBehavior baseBehavior) {
        this.f40403a = baseBehavior;
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        super.mo326b(view, agtVar);
        agtVar.m636n(this.f40403a.f8023b);
        agtVar.m631i(ScrollView.class.getName());
    }
}
