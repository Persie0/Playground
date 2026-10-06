package p000;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgf implements aew {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f40420a;

    public mgf(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f40420a = collapsingToolbarLayout;
    }

    @Override // p000.aew
    /* JADX INFO: renamed from: a */
    public final ago mo402a(View view, ago agoVar) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f40420a;
        ago agoVar2 = true != afb.m435p(collapsingToolbarLayout) ? null : agoVar;
        if (!aeb.m318b(collapsingToolbarLayout.f8038e, agoVar2)) {
            collapsingToolbarLayout.f8038e = agoVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return agoVar.m612k();
    }
}
