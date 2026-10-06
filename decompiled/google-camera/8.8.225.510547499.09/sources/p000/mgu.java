package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgu implements ahc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f40458a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BottomSheetBehavior f40459b;

    public mgu(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f40459b = bottomSheetBehavior;
        this.f40458a = i;
    }

    @Override // p000.ahc
    /* JADX INFO: renamed from: a */
    public final boolean mo654a(View view) {
        this.f40459b.m4808C(this.f40458a);
        return true;
    }
}
