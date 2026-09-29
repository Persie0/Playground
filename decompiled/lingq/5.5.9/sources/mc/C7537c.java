package mc;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p497y2.InterfaceC10288j;

/* JADX INFO: renamed from: mc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7537c implements InterfaceC10288j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f41612b;

    public C7537c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f41612b = bottomSheetBehavior;
        this.f41611a = i10;
    }

    @Override // p497y2.InterfaceC10288j
    /* JADX INFO: renamed from: a */
    public final boolean mo4689a(View view) {
        this.f41612b.m8606D(this.f41611a);
        return true;
    }
}
