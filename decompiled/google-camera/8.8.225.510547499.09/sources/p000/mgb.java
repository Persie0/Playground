package p000;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgb implements ahc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AppBarLayout f40410a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f40411b;

    public mgb(AppBarLayout appBarLayout, boolean z) {
        this.f40410a = appBarLayout;
        this.f40411b = z;
    }

    @Override // p000.ahc
    /* JADX INFO: renamed from: a */
    public final boolean mo654a(View view) {
        this.f40410a.m4748i(this.f40411b);
        return true;
    }
}
