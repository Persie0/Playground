package p150h9;

import android.view.View;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.Reference;
import java.util.WeakHashMap;
import p003a2.C0009a;
import p174i9.InterfaceC6208b;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p479xa.C10144m;
import p497y2.InterfaceC10288j;

/* JADX INFO: renamed from: h9.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5935r implements C10144m.a, InterfaceC10288j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35362a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f35363b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35364c;

    public /* synthetic */ C5935r(int i10, int i11, Object obj) {
        this.f35362a = i11;
        this.f35364c = obj;
        this.f35363b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p497y2.InterfaceC10288j
    /* JADX INFO: renamed from: a */
    public final boolean mo4689a(View view) {
        boolean z10;
        final SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f35364c;
        sideSheetBehavior.getClass();
        final int i10 = this.f35363b;
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(C0009a.m23l(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        Reference reference = sideSheetBehavior.f15455o;
        if (reference == null || reference.get() == null) {
            sideSheetBehavior.m8809s(i10);
        } else {
            View view2 = (View) sideSheetBehavior.f15455o.get();
            Runnable runnable = new Runnable() { // from class: hd.d
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                    View view3 = (View) sideSheetBehavior2.f15455o.get();
                    if (view3 != null) {
                        sideSheetBehavior2.m8810t(view3, i10, false);
                    }
                }
            };
            ViewParent parent = view2.getParent();
            if (parent == null || !parent.isLayoutRequested()) {
                z10 = false;
            } else {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.g.m18698b(view2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                view2.post(runnable);
            } else {
                runnable.run();
            }
        }
        return true;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f35362a;
        int i11 = this.f35363b;
        Object obj2 = this.f35364c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC2532v.c) obj).mo7407E(i11, ((C5920j0) obj2).f35324l);
                break;
            default:
                ((InterfaceC6208b) obj).mo12798l((InterfaceC6208b.a) obj2, i11);
                break;
        }
    }
}
