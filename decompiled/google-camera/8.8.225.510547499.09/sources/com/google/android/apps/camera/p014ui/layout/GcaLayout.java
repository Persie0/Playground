package com.google.android.apps.camera.p014ui.layout;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReference;
import p000.C1178zm;
import p000.C1190zy;
import p000.emw;
import p000.hza;
import p000.hzb;
import p000.hzf;
import p000.hzg;
import p000.hzh;
import p000.hzi;
import p000.hzj;
import p000.hzm;
import p000.hzo;
import p000.hzp;
import p000.hzs;
import p000.lku;
import p000.msi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GcaLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public msi f7046a;

    /* JADX INFO: renamed from: b */
    public AtomicReference f7047b;

    public GcaLayout(Context context) {
        super(context);
        m4372a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private final void m4372a(Context context) {
        ((hza) ((emw) context).mo4190b(hza.class)).mo7792a(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hzb;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object tag = getTag();
        lku.m15662p(tag);
        Trace.beginSection(String.valueOf(tag.toString()).concat(".onLayout"));
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        hzs hzgVar;
        Object tag = getTag();
        lku.m15662p(tag);
        Trace.beginSection(String.valueOf(tag.toString()).concat(".onMeasure"));
        Object objMo6051a = this.f7046a.mo6051a();
        lku.m15662p(objMo6051a);
        hzp hzpVar = (hzp) objMo6051a;
        hzm hzmVar = hzpVar.f30075b;
        C1190zy c1190zy = new C1190zy();
        c1190zy.m19820e(this);
        hzj hzjVar = hzpVar.f30074a.f30073i;
        int childCount = getChildCount();
        hzo hzoVar = hzpVar.f30074a;
        hzj hzjVar2 = hzj.TABLET_LAYOUT;
        switch (hzjVar) {
            case TABLET_LAYOUT:
                hzgVar = new hzg(hzpVar, c1190zy, getResources());
                break;
            case PHONE_LAYOUT:
            case SIMPLIFIED_LAYOUT:
                hzgVar = new hzf(hzpVar, c1190zy, getResources());
                break;
            case f30014d:
                hzgVar = new hzh(hzpVar, c1190zy, getResources());
                break;
            default:
                hzgVar = new hzi(hzpVar, c1190zy, getResources());
                break;
        }
        if (hzjVar.equals(hzj.TABLET_LAYOUT) || hzjVar.equals(hzj.f30014d) || hzjVar.equals(hzj.STARFISH_LAYOUT)) {
            this.f7047b.set(hzp.m10949a(hzoVar, hzmVar, null, hzgVar));
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = ((hzb) childAt.getLayoutParams()).f30004ax;
            if (i4 != 0) {
                int id = childAt.getId();
                c1190zy.m19819d(id, 3);
                c1190zy.m19819d(id, 6);
                c1190zy.m19819d(id, 7);
                c1190zy.m19819d(id, 4);
                switch (i4 - 1) {
                    case 0:
                        hzgVar.mo10892c(childAt);
                        break;
                    case 1:
                        hzgVar.mo10898i(childAt);
                        break;
                    case 2:
                        hzgVar.mo10903n(childAt);
                        break;
                    case 3:
                        hzgVar.mo10890a(childAt);
                        break;
                    case 4:
                        hzgVar.mo10904o(childAt);
                        break;
                    case 5:
                        hzgVar.mo10895f(childAt);
                        break;
                    case 6:
                        hzgVar.mo10906q(childAt);
                        break;
                    case 7:
                        hzgVar.mo10905p(childAt);
                        break;
                    case 8:
                        hzgVar.mo10893d(childAt);
                        break;
                    case 9:
                        hzgVar.mo10899j(childAt);
                        break;
                    case 10:
                        hzgVar.mo10897h(childAt);
                        break;
                    case 11:
                        hzgVar.mo10891b(childAt);
                        break;
                    case 12:
                        hzgVar.mo10894e(childAt);
                        break;
                    case 13:
                        hzgVar.mo10902m(childAt);
                        break;
                    case 14:
                        hzgVar.mo10900k(childAt);
                        break;
                    case 15:
                        hzgVar.mo10896g(childAt);
                        break;
                    default:
                        hzgVar.mo10901l(childAt);
                        break;
                }
            } else {
                childAt.requestLayout();
            }
        }
        c1190zy.m19818c(this);
        super.onMeasure(i, i2);
        Trace.endSection();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final C1178zm generateDefaultLayoutParams() {
        return new hzb();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final C1178zm generateLayoutParams(AttributeSet attributeSet) {
        return new hzb(getContext(), attributeSet);
    }

    public GcaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4372a(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hzb(layoutParams);
    }

    public GcaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4372a(context);
    }
}
