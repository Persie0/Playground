package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.Arrays;
import p000.AbstractC0812ly;
import p000.C0778kr;
import p000.C0781ku;
import p000.C0784kx;
import p000.C0785ky;
import p000.C0786kz;
import p000.C0813lz;
import p000.C0818md;
import p000.C0826ml;
import p000.agt;
import p000.bck;
import p000.bkn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    boolean f1017a;

    /* JADX INFO: renamed from: b */
    int f1018b;

    /* JADX INFO: renamed from: c */
    int[] f1019c;

    /* JADX INFO: renamed from: d */
    View[] f1020d;

    /* JADX INFO: renamed from: e */
    final SparseIntArray f1021e;

    /* JADX INFO: renamed from: f */
    final SparseIntArray f1022f;

    /* JADX INFO: renamed from: g */
    final Rect f1023g;

    /* JADX INFO: renamed from: h */
    final bck f1024h;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1017a = false;
        this.f1018b = -1;
        this.f1021e = new SparseIntArray();
        this.f1022f = new SparseIntArray();
        bck bckVar = new bck((char[]) null);
        this.f1024h = bckVar;
        this.f1023g = new Rect();
        int i3 = m16130at(context, attributeSet, i, i2).f39494b;
        if (i3 == this.f1018b) {
            return;
        }
        this.f1017a = true;
        if (i3 > 0) {
            this.f1018b = i3;
            bckVar.m2214k();
            m16155aP();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i3);
        }
    }

    /* JADX INFO: renamed from: bt */
    private final int m1086bt(C0818md c0818md, C0826ml c0826ml, int i) {
        if (!c0826ml.f40922g) {
            return bck.m2198l(i, this.f1018b);
        }
        int iM16312a = c0818md.m16312a(i);
        if (iM16312a != -1) {
            return bck.m2198l(iM16312a, this.f1018b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: bu */
    private final int m1087bu(C0818md c0818md, C0826ml c0826ml, int i) {
        if (!c0826ml.f40922g) {
            return i % this.f1018b;
        }
        int i2 = this.f1022f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM16312a = c0818md.m16312a(i);
        if (iM16312a != -1) {
            return iM16312a % this.f1018b;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: bv */
    private final int m1088bv(C0818md c0818md, C0826ml c0826ml, int i) {
        if (!c0826ml.f40922g) {
            return 1;
        }
        int i2 = this.f1021e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0818md.m16312a(i) == -1) {
            Log.w("GridLayoutManager", rgoX.PKn + i);
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    /* JADX INFO: renamed from: bw */
    private final void m1089bw(int i) {
        int i2;
        int[] iArr = this.f1019c;
        int i3 = this.f1018b;
        if (iArr != null) {
            int i4 = i3 + 1;
            int length = iArr.length;
            if (length != i4 || iArr[length - 1] != i) {
                iArr = new int[i3 + 1];
            }
        } else {
            iArr = new int[i3 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.f1019c = iArr;
    }

    /* JADX INFO: renamed from: bx */
    private final void m1090bx() {
        View[] viewArr = this.f1020d;
        if (viewArr != null) {
            if (viewArr.length == this.f1018b) {
                return;
            }
        }
        this.f1020d = new View[this.f1018b];
    }

    /* JADX INFO: renamed from: by */
    private final void m1091by(View view, int i, boolean z) {
        int iAk;
        int iAk2;
        C0781ku c0781ku = (C0781ku) view.getLayoutParams();
        Rect rect = c0781ku.f39586d;
        int i2 = rect.top + rect.bottom + c0781ku.topMargin + c0781ku.bottomMargin;
        int i3 = rect.left + rect.right + c0781ku.leftMargin + c0781ku.rightMargin;
        int iM1095c = m1095c(c0781ku.f37202a, c0781ku.f37203b);
        if (this.f1048i == 1) {
            iAk2 = m16129ak(iM1095c, i, i3, c0781ku.width, false);
            iAk = m16129ak(this.f1049j.mo15756k(), this.f39559z, i2, c0781ku.height, true);
        } else {
            int iAk3 = m16129ak(iM1095c, i, i2, c0781ku.height, false);
            int iAk4 = m16129ak(this.f1049j.mo15756k(), this.f39558y, i3, c0781ku.width, true);
            iAk = iAk3;
            iAk2 = iAk4;
        }
        m1092bz(view, iAk2, iAk, z);
    }

    /* JADX INFO: renamed from: bz */
    private final void m1092bz(View view, int i, int i2, boolean z) {
        boolean zM16163aZ;
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        if (z) {
            zM16163aZ = true;
            if (this.f39554u && AbstractC0812ly.m16127aW(view.getMeasuredWidth(), i, c0813lz.width) && AbstractC0812ly.m16127aW(view.getMeasuredHeight(), i2, c0813lz.height)) {
                zM16163aZ = false;
            }
        } else {
            zM16163aZ = m16163aZ(view, i, i2, c0813lz);
        }
        if (zM16163aZ) {
            view.measure(i, i2);
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: a */
    public final int mo1093a(C0818md c0818md, C0826ml c0826ml) {
        if (this.f1048i == 1) {
            return this.f1018b;
        }
        if (c0826ml.m16585a() <= 0) {
            return 0;
        }
        return m1086bt(c0818md, c0826ml, c0826ml.m16585a() - 1) + 1;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: b */
    public final int mo1094b(C0818md c0818md, C0826ml c0826ml) {
        if (this.f1048i == 0) {
            return this.f1018b;
        }
        if (c0826ml.m16585a() <= 0) {
            return 0;
        }
        return m1086bt(c0818md, c0826ml, c0826ml.m16585a() - 1) + 1;
    }

    /* JADX INFO: renamed from: c */
    final int m1095c(int i, int i2) {
        if (this.f1048i != 1 || !m1165Y()) {
            int[] iArr = this.f1019c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1019c;
        int i3 = this.f1018b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: d */
    public final int mo1096d(int i, C0818md c0818md, C0826ml c0826ml) {
        m1085bA();
        m1090bx();
        return super.mo1096d(i, c0818md, c0826ml);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: e */
    public final int mo1097e(int i, C0818md c0818md, C0826ml c0826ml) {
        m1085bA();
        m1090bx();
        return super.mo1097e(i, c0818md, c0826ml);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: f */
    public final C0813lz mo1098f() {
        return this.f1048i == 0 ? new C0781ku(-2, -1) : new C0781ku(-1, -2);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: g */
    public final C0813lz mo1099g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0781ku((ViewGroup.MarginLayoutParams) layoutParams) : new C0781ku(layoutParams);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: h */
    public final C0813lz mo1100h(Context context, AttributeSet attributeSet) {
        return new C0781ku(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: i */
    public final View mo1101i(C0818md c0818md, C0826ml c0826ml, boolean z, boolean z2) {
        int i;
        int iM16164aj;
        int i2;
        int iM16164aj2 = m16164aj();
        if (z2) {
            i = -1;
            iM16164aj = m16164aj() - 1;
            i2 = -1;
        } else {
            i = iM16164aj2;
            iM16164aj = 0;
            i2 = 1;
        }
        int iM16585a = c0826ml.m16585a();
        m1156P();
        int iMo15755j = this.f1049j.mo15755j();
        int iMo15751f = this.f1049j.mo15751f();
        View view = null;
        View view2 = null;
        while (iM16164aj != i) {
            View viewM16174av = m16174av(iM16164aj);
            int iBe = m16136be(viewM16174av);
            if (iBe >= 0 && iBe < iM16585a && m1087bu(c0818md, c0826ml, iBe) == 0) {
                if (((C0813lz) viewM16174av.getLayoutParams()).m16220c()) {
                    if (view2 == null) {
                        view2 = viewM16174av;
                    }
                } else {
                    if (this.f1049j.mo15749d(viewM16174av) < iMo15751f && this.f1049j.mo15746a(viewM16174av) >= iMo15755j) {
                        return viewM16174av;
                    }
                    if (view == null) {
                        view = viewM16174av;
                    }
                }
            }
            iM16164aj += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1102j(View view, int i, C0818md c0818md, C0826ml c0826ml) {
        int iM16164aj;
        int iM16164aj2;
        int i2;
        View view2;
        int i3;
        int i4;
        C0818md c0818md2 = c0818md;
        C0826ml c0826ml2 = c0826ml;
        View viewM16173au = m16173au(view);
        View view3 = null;
        if (viewM16173au == null) {
            return null;
        }
        C0781ku c0781ku = (C0781ku) viewM16173au.getLayoutParams();
        int i5 = c0781ku.f37202a;
        int i6 = c0781ku.f37203b + i5;
        if (super.mo1102j(view, i, c0818md, c0826ml) == null) {
            return null;
        }
        if ((m1146F(i) == 1) != this.f1050k) {
            iM16164aj2 = m16164aj() - 1;
            iM16164aj = -1;
            i2 = -1;
        } else {
            iM16164aj = m16164aj();
            iM16164aj2 = 0;
            i2 = 1;
        }
        boolean z = this.f1048i == 1 && m1165Y();
        int iM1086bt = m1086bt(c0818md2, c0826ml2, iM16164aj2);
        int i7 = iM16164aj2;
        int i8 = i2;
        int i9 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i10 = -1;
        View view4 = null;
        while (i7 != iM16164aj) {
            int i11 = iM16164aj;
            int iM1086bt2 = m1086bt(c0818md2, c0826ml2, i7);
            View viewM16174av = m16174av(i7);
            if (viewM16174av == viewM16173au) {
                break;
            }
            if (viewM16174av.hasFocusable() && iM1086bt2 != iM1086bt) {
                if (view3 != null) {
                    break;
                }
                view2 = viewM16173au;
                i4 = iMin;
                i3 = iM1086bt;
            } else {
                C0781ku c0781ku2 = (C0781ku) viewM16174av.getLayoutParams();
                int i12 = c0781ku2.f37202a;
                view2 = viewM16173au;
                int i13 = c0781ku2.f37203b + i12;
                if (viewM16174av.hasFocusable() && i12 == i5 && i13 == i6) {
                    return viewM16174av;
                }
                if (viewM16174av.hasFocusable() && view3 == null) {
                    i4 = iMin;
                    i3 = iM1086bt;
                } else if (viewM16174av.hasFocusable() || view4 != null) {
                    i3 = iM1086bt;
                    int iMin3 = Math.min(i13, i6) - Math.max(i12, i5);
                    if (viewM16174av.hasFocusable()) {
                        if (iMin3 <= iMin) {
                            if (iMin3 == iMin) {
                            }
                            i4 = iMin;
                        }
                        i4 = iMin;
                    } else if (view3 == null) {
                        i4 = iMin;
                        if (!this.f39545C.m768m(viewM16174av) || !this.f39546D.m768m(viewM16174av)) {
                            if (iMin3 <= iMin2) {
                                if (iMin3 == iMin2) {
                                    if (z == (i12 > i9)) {
                                    }
                                }
                            }
                        }
                    } else {
                        i4 = iMin;
                    }
                    i7 += i8;
                    c0818md2 = c0818md;
                    c0826ml2 = c0826ml;
                    iM16164aj = i11;
                    viewM16173au = view2;
                    iM1086bt = i3;
                } else {
                    i4 = iMin;
                    i3 = iM1086bt;
                }
                if (viewM16174av.hasFocusable()) {
                    int i14 = c0781ku2.f37202a;
                    iMin = Math.min(i13, i6) - Math.max(i12, i5);
                    i10 = i14;
                    view3 = viewM16174av;
                } else {
                    int i15 = c0781ku2.f37202a;
                    iMin2 = Math.min(i13, i6) - Math.max(i12, i5);
                    i9 = i15;
                    iMin = i4;
                    view4 = viewM16174av;
                }
                i7 += i8;
                c0818md2 = c0818md;
                c0826ml2 = c0826ml;
                iM16164aj = i11;
                viewM16173au = view2;
                iM1086bt = i3;
            }
            iMin = i4;
            i7 += i8;
            c0818md2 = c0818md;
            c0826ml2 = c0826ml;
            iM16164aj = i11;
            viewM16173au = view2;
            iM1086bt = i3;
        }
        return view3 != null ? view3 : view4;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: k */
    public final void mo1103k(C0818md c0818md, C0826ml c0826ml, C0786kz c0786kz, C0785ky c0785ky) {
        int i;
        int i2;
        int i3;
        int i4;
        int iMo15748c;
        int iM16170aq;
        int iMo15748c2;
        int i5;
        int iAk;
        int iAk2;
        boolean z;
        View viewM15080a;
        int iMo15754i = this.f1049j.mo15754i();
        int i6 = m16164aj() > 0 ? this.f1019c[this.f1018b] : 0;
        boolean z2 = iMo15754i != 1073741824;
        if (z2) {
            m1085bA();
        }
        int i7 = c0786kz.f37756e;
        int iM1087bu = this.f1018b;
        if (i7 != 1) {
            iM1087bu = m1087bu(c0818md, c0826ml, c0786kz.f37755d) + m1088bv(c0818md, c0826ml, c0786kz.f37755d);
            i = 0;
        } else {
            i = 0;
        }
        while (i < this.f1018b && c0786kz.m15083d(c0826ml) && iM1087bu > 0) {
            int i8 = c0786kz.f37755d;
            int iM1088bv = m1088bv(c0818md, c0826ml, i8);
            if (iM1088bv > this.f1018b) {
                throw new IllegalArgumentException("Item at position " + i8 + aJFPpVSaoDO.lkSRJYyBtU + iM1088bv + " spans but GridLayoutManager has only " + this.f1018b + " spans.");
            }
            iM1087bu -= iM1088bv;
            if (iM1087bu < 0 || (viewM15080a = c0786kz.m15080a(c0818md)) == null) {
                break;
            }
            this.f1020d[i] = viewM15080a;
            i++;
        }
        if (i == 0) {
            c0785ky.f37701b = true;
            return;
        }
        if (i7 == 1) {
            i3 = i;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        int i9 = 0;
        while (i2 != i3) {
            View view = this.f1020d[i2];
            C0781ku c0781ku = (C0781ku) view.getLayoutParams();
            int iM1088bv2 = m1088bv(c0818md, c0826ml, m16136be(view));
            c0781ku.f37203b = iM1088bv2;
            c0781ku.f37202a = i9;
            i9 += iM1088bv2;
            i2 += i4;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            View view2 = this.f1020d[i11];
            if (c0786kz.f37763l != null) {
                z = false;
                if (i7 == 1) {
                    m16176ax(view2);
                } else {
                    m16177ay(view2, 0);
                }
            } else if (i7 == 1) {
                m16178az(view2);
                z = false;
            } else {
                z = false;
                m16144aA(view2, 0);
            }
            m16145aB(view2, this.f1023g);
            m1091by(view2, iMo15754i, z);
            int iMo15747b = this.f1049j.mo15747b(view2);
            if (iMo15747b > i10) {
                i10 = iMo15747b;
            }
            float fMo15748c = this.f1049j.mo15748c(view2) / ((C0781ku) view2.getLayoutParams()).f37203b;
            if (fMo15748c > f) {
                f = fMo15748c;
            }
        }
        if (z2) {
            m1089bw(Math.max(Math.round(f * this.f1018b), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i; i12++) {
                View view3 = this.f1020d[i12];
                m1091by(view3, 1073741824, true);
                int iMo15747b2 = this.f1049j.mo15747b(view3);
                if (iMo15747b2 > i10) {
                    i10 = iMo15747b2;
                }
            }
        }
        for (int i13 = 0; i13 < i; i13++) {
            View view4 = this.f1020d[i13];
            if (this.f1049j.mo15747b(view4) != i10) {
                C0781ku c0781ku2 = (C0781ku) view4.getLayoutParams();
                Rect rect = c0781ku2.f39586d;
                int i14 = rect.top + rect.bottom + c0781ku2.topMargin + c0781ku2.bottomMargin;
                int i15 = rect.left + rect.right + c0781ku2.leftMargin + c0781ku2.rightMargin;
                int iM1095c = m1095c(c0781ku2.f37202a, c0781ku2.f37203b);
                if (this.f1048i == 1) {
                    iAk2 = m16129ak(iM1095c, 1073741824, i15, c0781ku2.width, false);
                    iAk = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iAk = m16129ak(iM1095c, 1073741824, i14, c0781ku2.height, false);
                    iAk2 = iMakeMeasureSpec;
                }
                m1092bz(view4, iAk2, iAk, true);
            }
        }
        c0785ky.f37700a = i10;
        if (this.f1048i == 1) {
            if (c0786kz.f37757f == -1) {
                int i16 = c0786kz.f37753b;
                iM16170aq = 0;
                iMo15748c = 0;
                i5 = i16 - i10;
                iMo15748c2 = i16;
            } else {
                i5 = c0786kz.f37753b;
                iMo15748c2 = i5 + i10;
                iM16170aq = 0;
                iMo15748c = 0;
            }
        } else if (c0786kz.f37757f == -1) {
            int i17 = c0786kz.f37753b;
            iM16170aq = i17 - i10;
            iMo15748c = i17;
            iMo15748c2 = 0;
            i5 = 0;
        } else {
            int i18 = c0786kz.f37753b;
            iMo15748c = i18 + i10;
            iM16170aq = i18;
            iMo15748c2 = 0;
            i5 = 0;
        }
        for (int i19 = 0; i19 < i; i19++) {
            View view5 = this.f1020d[i19];
            C0781ku c0781ku3 = (C0781ku) view5.getLayoutParams();
            if (this.f1048i != 1) {
                int iM16172as = m16172as() + this.f1019c[c0781ku3.f37202a];
                i5 = iM16172as;
                iMo15748c2 = this.f1049j.mo15748c(view5) + iM16172as;
            } else if (m1165Y()) {
                int iM16170aq2 = m16170aq() + this.f1019c[this.f1018b - c0781ku3.f37202a];
                iMo15748c = iM16170aq2;
                iM16170aq = iM16170aq2 - this.f1049j.mo15748c(view5);
            } else {
                iM16170aq = m16170aq() + this.f1019c[c0781ku3.f37202a];
                iMo15748c = this.f1049j.mo15748c(view5) + iM16170aq;
            }
            m16139bj(view5, iM16170aq, i5, iMo15748c, iMo15748c2);
            if (c0781ku3.m16220c() || c0781ku3.m16219b()) {
                c0785ky.f37702c = true;
            }
            c0785ky.f37703d = view5.hasFocusable() | c0785ky.f37703d;
        }
        Arrays.fill(this.f1020d, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: l */
    public final void mo1104l(C0818md c0818md, C0826ml c0826ml, C0784kx c0784kx, int i) {
        m1085bA();
        if (c0826ml.m16585a() > 0 && !c0826ml.f40922g) {
            int iM1087bu = m1087bu(c0818md, c0826ml, c0784kx.f37591b);
            if (i == 1) {
                while (iM1087bu > 0) {
                    int i2 = c0784kx.f37591b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0784kx.f37591b = i3;
                    iM1087bu = m1087bu(c0818md, c0826ml, i3);
                }
            } else {
                int iM16585a = c0826ml.m16585a() - 1;
                int i4 = c0784kx.f37591b;
                while (i4 < iM16585a) {
                    int i5 = i4 + 1;
                    int iM1087bu2 = m1087bu(c0818md, c0826ml, i5);
                    if (iM1087bu2 <= iM1087bu) {
                        break;
                    }
                    i4 = i5;
                    iM1087bu = iM1087bu2;
                }
                c0784kx.f37591b = i4;
            }
        }
        m1090bx();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: m */
    public final void mo1105m(C0818md c0818md, C0826ml c0826ml, agt agtVar) {
        super.mo1105m(c0818md, c0826ml, agtVar);
        agtVar.m631i(GridView.class.getName());
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: n */
    public final void mo1106n(C0818md c0818md, C0826ml c0826ml, View view, agt agtVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0781ku)) {
            super.m16149aI(view, agtVar);
            return;
        }
        C0781ku c0781ku = (C0781ku) layoutParams;
        int iM1086bt = m1086bt(c0818md, c0826ml, c0781ku.m16218a());
        if (this.f1048i == 0) {
            agtVar.m634l(bkn.m2552z(c0781ku.f37202a, c0781ku.f37203b, iM1086bt, 1, false));
        } else {
            agtVar.m634l(bkn.m2552z(iM1086bt, 1, c0781ku.f37202a, c0781ku.f37203b, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: o */
    public final void mo1107o(C0818md c0818md, C0826ml c0826ml) {
        if (c0826ml.f40922g) {
            int iM16164aj = m16164aj();
            for (int i = 0; i < iM16164aj; i++) {
                C0781ku c0781ku = (C0781ku) m16174av(i).getLayoutParams();
                int iM16218a = c0781ku.m16218a();
                this.f1021e.put(iM16218a, c0781ku.f37203b);
                this.f1022f.put(iM16218a, c0781ku.f37202a);
            }
        }
        super.mo1107o(c0818md, c0826ml);
        this.f1021e.clear();
        this.f1022f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: p */
    public final void mo1108p(C0826ml c0826ml) {
        super.mo1108p(c0826ml);
        this.f1017a = false;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: q */
    public final void mo1109q(Rect rect, int i, int i2) {
        int iAi;
        int iAi2;
        if (this.f1019c == null) {
            super.mo1109q(rect, i, i2);
        }
        int iM16170aq = m16170aq() + m16171ar();
        int iM16172as = m16172as() + m16169ap();
        if (this.f1048i == 1) {
            iAi2 = m16128ai(i2, rect.height() + iM16172as, m16167an());
            int[] iArr = this.f1019c;
            iAi = m16128ai(i, iArr[iArr.length - 1] + iM16170aq, m16168ao());
        } else {
            iAi = m16128ai(i, rect.width() + iM16170aq, m16168ao());
            int[] iArr2 = this.f1019c;
            iAi2 = m16128ai(i2, iArr2[iArr2.length - 1] + iM16172as, m16167an());
        }
        m16158aS(iAi, iAi2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: r */
    public final void mo1110r(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1110r(false);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: s */
    public final boolean mo1111s(C0813lz c0813lz) {
        return c0813lz instanceof C0781ku;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, p000.AbstractC0812ly
    /* JADX INFO: renamed from: t */
    public final boolean mo1112t() {
        return this.f1053n == null && !this.f1017a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: u */
    public final void mo1113u(C0826ml c0826ml, C0786kz c0786kz, C0778kr c0778kr) {
        int i = this.f1018b;
        for (int i2 = 0; i2 < this.f1018b && c0786kz.m15083d(c0826ml) && i > 0; i2++) {
            c0778kr.m14735a(c0786kz.f37755d, Math.max(0, c0786kz.f37758g));
            i--;
            c0786kz.f37755d += c0786kz.f37756e;
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: v */
    public final void mo1114v(int i, int i2) {
        this.f1024h.m2214k();
        this.f1024h.m2213j();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: w */
    public final void mo1115w() {
        this.f1024h.m2214k();
        this.f1024h.m2213j();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: x */
    public final void mo1116x(int i, int i2) {
        this.f1024h.m2214k();
        this.f1024h.m2213j();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: y */
    public final void mo1117y(int i, int i2) {
        this.f1024h.m2214k();
        this.f1024h.m2213j();
    }

    /* JADX INFO: renamed from: bA */
    private final void m1085bA() {
        m1089bw(this.f1048i == 1 ? (this.f39543A - m16171ar()) - m16170aq() : (this.f39544B - m16169ap()) - m16172as());
    }
}
