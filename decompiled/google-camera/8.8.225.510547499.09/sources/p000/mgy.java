package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgy {

    /* JADX INFO: renamed from: a */
    public int f40466a;

    /* JADX INFO: renamed from: b */
    public boolean f40467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BottomSheetBehavior f40468c;

    /* JADX INFO: renamed from: d */
    private final Runnable f40469d = new lmg(this, 11);

    public mgy(BottomSheetBehavior bottomSheetBehavior) {
        this.f40468c = bottomSheetBehavior;
    }

    /* JADX INFO: renamed from: a */
    public final void m16364a(int i) {
        WeakReference weakReference = this.f40468c.f8076B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f40466a = i;
        if (this.f40467b) {
            return;
        }
        afb.m428i((View) this.f40468c.f8076B.get(), this.f40469d);
        this.f40467b = true;
    }
}
