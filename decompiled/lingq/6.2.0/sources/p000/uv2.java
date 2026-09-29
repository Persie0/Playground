package p000;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uv2 implements sg5, InterfaceC3396o4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f64396b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f64397c;

    public /* synthetic */ uv2(Object obj, int i, int i2) {
        this.f64395a = i2;
        this.f64397c = obj;
        this.f64396b = i;
    }

    @Override // p000.InterfaceC3396o4
    /* JADX INFO: renamed from: b */
    public boolean mo4797b(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f64397c;
        int i = SideSheetBehavior.f13083x;
        sideSheetBehavior.m6166w(this.f64396b);
        return true;
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        switch (this.f64395a) {
            case 0:
                z0a z0aVar = ((k97) this.f64397c).f46893a;
                ((ba7) obj).mo3519p(this.f64396b);
                break;
            default:
                ((ba7) obj).mo3529z((pu5) this.f64397c, this.f64396b);
                break;
        }
    }
}
