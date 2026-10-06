package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjc implements aew {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mje f40722a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mgs f40723b;

    public mjc(mgs mgsVar, mje mjeVar) {
        this.f40723b = mgsVar;
        this.f40722a = mjeVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096 A[DONT_INVERT] */
    @Override // p000.aew
    /* JADX INFO: renamed from: a */
    public final ago mo402a(View view, ago agoVar) {
        mgs mgsVar = this.f40723b;
        mje mjeVar = new mje(this.f40722a);
        acr acrVarM608f = agoVar.m608f(7);
        acr acrVarM608f2 = agoVar.m608f(32);
        mgsVar.f40456b.f8118n = acrVarM608f.f104c;
        boolean zM15401I = lij.m15401I(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = mgsVar.f40456b;
        if (bottomSheetBehavior.f8111g) {
            bottomSheetBehavior.f8117m = agoVar.m603a();
            paddingBottom = mjeVar.f40727d + mgsVar.f40456b.f8117m;
        }
        BottomSheetBehavior bottomSheetBehavior2 = mgsVar.f40456b;
        if (bottomSheetBehavior2.f8112h) {
            paddingLeft = (zM15401I ? mjeVar.f40726c : mjeVar.f40724a) + acrVarM608f.f103b;
        }
        if (bottomSheetBehavior2.f8113i) {
            paddingRight = (zM15401I ? mjeVar.f40724a : mjeVar.f40726c) + acrVarM608f.f105d;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z = true;
        boolean z2 = false;
        if (mgsVar.f40456b.f8114j) {
            int i = marginLayoutParams.leftMargin;
            int i2 = acrVarM608f.f103b;
            if (i != i2) {
                marginLayoutParams.leftMargin = i2;
                z2 = true;
            }
        }
        if (mgsVar.f40456b.f8115k) {
            int i3 = marginLayoutParams.rightMargin;
            int i4 = acrVarM608f.f105d;
            if (i3 != i4) {
                marginLayoutParams.rightMargin = i4;
            } else {
                z = z2;
            }
        } else {
            z = z2;
        }
        if (mgsVar.f40456b.f8116l) {
            int i5 = marginLayoutParams.topMargin;
            int i6 = acrVarM608f.f104c;
            if (i5 != i6) {
                marginLayoutParams.topMargin = i6;
            } else if (z) {
            }
            view.setLayoutParams(marginLayoutParams);
        } else if (z) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z3 = mgsVar.f40455a;
        if (z3) {
            mgsVar.f40456b.f8110f = acrVarM608f2.f106e;
        }
        BottomSheetBehavior bottomSheetBehavior3 = mgsVar.f40456b;
        if (bottomSheetBehavior3.f8111g || z3) {
            bottomSheetBehavior3.m4813H();
        }
        return agoVar;
    }
}
