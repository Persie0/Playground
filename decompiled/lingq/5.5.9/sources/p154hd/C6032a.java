package p154hd;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: hd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6032a extends AbstractC6034c {

    /* JADX INFO: renamed from: a */
    public final SideSheetBehavior<? extends View> f35677a;

    public C6032a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f35677a = sideSheetBehavior;
    }

    /* JADX INFO: renamed from: a */
    public final int m12472a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f35677a;
        return Math.max(0, (sideSheetBehavior.f15453m - sideSheetBehavior.f15452l) - sideSheetBehavior.f15454n);
    }
}
