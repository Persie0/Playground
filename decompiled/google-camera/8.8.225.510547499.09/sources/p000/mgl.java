package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mgl extends aai {

    /* JADX INFO: renamed from: a */
    private mgm f40442a;

    /* JADX INFO: renamed from: b */
    private int f40443b;

    public mgl() {
        this.f40443b = 0;
    }

    public mgl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40443b = 0;
    }

    /* JADX INFO: renamed from: F */
    public final int m16355F() {
        mgm mgmVar = this.f40442a;
        if (mgmVar != null) {
            return mgmVar.f40445b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m16356G(int i) {
        mgm mgmVar = this.f40442a;
        if (mgmVar != null) {
            return mgmVar.m16359c(i);
        }
        this.f40443b = i;
        return false;
    }

    /* JADX INFO: renamed from: U */
    protected void mo16353U(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m1426j(view, i);
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: e */
    public boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo16353U(coordinatorLayout, view, i);
        if (this.f40442a == null) {
            this.f40442a = new mgm(view);
        }
        this.f40442a.m16358b();
        this.f40442a.m16357a();
        int i2 = this.f40443b;
        if (i2 == 0) {
            return true;
        }
        this.f40442a.m16359c(i2);
        this.f40443b = 0;
        return true;
    }
}
