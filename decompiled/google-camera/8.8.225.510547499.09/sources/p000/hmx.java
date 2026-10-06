package p000;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hmx implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hmy f28372a;

    public hmx(hmy hmyVar) {
        this.f28372a = hmyVar;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int systemUiVisibility = this.f28372a.f28373a.getDecorView().getSystemUiVisibility();
        hmy hmyVar = this.f28372a;
        if ((systemUiVisibility ^ hmyVar.f28375c) == 0 || hmyVar.f28374b) {
            return;
        }
        hmyVar.m10482e();
    }
}
