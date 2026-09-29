package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class hg0 implements yva, zp7, okd {

    /* JADX INFO: renamed from: a */
    public boolean f42315a;

    /* JADX INFO: renamed from: b */
    public final Object f42316b;

    public hg0(StringBuilder sb) {
        this.f42316b = sb;
        this.f42315a = true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m13221a() {
        return this.f42315a;
    }

    @Override // p000.zp7
    /* JADX INFO: renamed from: b */
    public void mo12101b(yp7 yp7Var, int i) {
        StringBuilder sb = (StringBuilder) this.f42316b;
        if (this.f42315a) {
            this.f42315a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX INFO: renamed from: c */
    public boolean m13222c(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            ij6.m13959q();
            return false;
        }
        if (((nid) this.f42316b) == null) {
            return m13221a();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            hg0 hg0Var = wt9.f67283a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return m13221a();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    @Override // p000.yva
    /* JADX INFO: renamed from: g */
    public f6b mo13223g(View view, f6b f6bVar, zva zvaVar) {
        boolean z;
        c6b c6bVar = f6bVar.f38536a;
        l64 l64VarMo136i = c6bVar.mo136i(519);
        l64 l64VarMo136i2 = c6bVar.mo136i(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f42316b;
        boolean z2 = bottomSheetBehavior.f12736p;
        int i = l64VarMo136i.f49117b;
        int i2 = l64VarMo136i.f49118c;
        int i3 = l64VarMo136i.f49116a;
        bottomSheetBehavior.f12744x = i;
        boolean z3 = true;
        boolean z4 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (z2) {
            int iM11571a = f6bVar.m11571a();
            bottomSheetBehavior.f12743w = iM11571a;
            paddingBottom = iM11571a + zvaVar.f72288d;
        }
        if (bottomSheetBehavior.f12737q) {
            paddingLeft = (z4 ? zvaVar.f72287c : zvaVar.f72285a) + i3;
        }
        if (bottomSheetBehavior.f12738r) {
            paddingRight = (z4 ? zvaVar.f72285a : zvaVar.f72287c) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f12740t || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.f12741u && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.f12742v) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = l64VarMo136i.f49117b;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
            } else {
                z3 = z;
            }
        } else {
            z3 = z;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z5 = this.f42315a;
        if (z5) {
            bottomSheetBehavior.f12734n = l64VarMo136i2.f49119d;
        }
        if (!z2 && !z5) {
            return f6bVar;
        }
        bottomSheetBehavior.m6039T();
        return f6bVar;
    }

    @Override // p000.okd
    public C3299li zza() {
        a34 a34Var = new a34();
        zzot zzotVar = this.f42315a ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        zzou zzouVar = (zzou) this.f42316b;
        a34Var.f175c = zzotVar;
        yzb yzbVar = new yzb();
        yzbVar.f70718a = zzouVar;
        a34Var.f177e = new hgd(yzbVar);
        return new C3299li(a34Var, 0);
    }

    public hg0(nid nidVar, boolean z) {
        this.f42316b = nidVar;
        this.f42315a = z;
    }

    public /* synthetic */ hg0(Object obj, boolean z) {
        this.f42315a = z;
        this.f42316b = obj;
    }

    public hg0(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f42316b = bottomSheetBehavior;
        this.f42315a = z;
    }
}
