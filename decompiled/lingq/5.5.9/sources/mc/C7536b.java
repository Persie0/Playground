package mc;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p312p2.C8170b;
import p471x2.C10063s0;
import p507yc.C10347n;

/* JADX INFO: renamed from: mc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7536b implements C10347n.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f41609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f41610b;

    public C7536b(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f41610b = bottomSheetBehavior;
        this.f41609a = z10;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    @Override // p507yc.C10347n.b
    /* JADX INFO: renamed from: a */
    public final C10063s0 mo14692a(View view, C10063s0 c10063s0, C10347n.c cVar) {
        boolean z10;
        C8170b c8170bM18864a = c10063s0.m18864a(7);
        C8170b c8170bM18864a2 = c10063s0.m18864a(32);
        int i10 = c8170bM18864a.f44303b;
        BottomSheetBehavior bottomSheetBehavior = this.f41610b;
        bottomSheetBehavior.f14870w = i10;
        boolean zM19365e = C10347n.m19365e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z11 = bottomSheetBehavior.f14862o;
        if (z11) {
            int iM18865b = c10063s0.m18865b();
            bottomSheetBehavior.f14869v = iM18865b;
            paddingBottom = iM18865b + cVar.f52056d;
        }
        boolean z12 = bottomSheetBehavior.f14863p;
        int i11 = c8170bM18864a.f44302a;
        if (z12) {
            paddingLeft = (zM19365e ? cVar.f52055c : cVar.f52053a) + i11;
        }
        boolean z13 = bottomSheetBehavior.f14864q;
        int i12 = c8170bM18864a.f44304c;
        if (z13) {
            paddingRight = (zM19365e ? cVar.f52053a : cVar.f52055c) + i12;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z14 = true;
        if (!bottomSheetBehavior.f14866s || marginLayoutParams.leftMargin == i11) {
            z10 = false;
        } else {
            marginLayoutParams.leftMargin = i11;
            z10 = true;
        }
        if (bottomSheetBehavior.f14867t && marginLayoutParams.rightMargin != i12) {
            marginLayoutParams.rightMargin = i12;
            z10 = true;
        }
        if (bottomSheetBehavior.f14868u) {
            int i13 = marginLayoutParams.topMargin;
            int i14 = c8170bM18864a.f44303b;
            if (i13 != i14) {
                marginLayoutParams.topMargin = i14;
            } else {
                z14 = z10;
            }
        } else {
            z14 = z10;
        }
        if (z14) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z15 = this.f41609a;
        if (z15) {
            bottomSheetBehavior.f14860m = c8170bM18864a2.f44305d;
        }
        if (z11 || z15) {
            bottomSheetBehavior.m8613K();
        }
        return c10063s0;
    }
}
