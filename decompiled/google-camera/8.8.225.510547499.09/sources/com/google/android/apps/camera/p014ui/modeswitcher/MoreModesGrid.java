package com.google.android.apps.camera.p014ui.modeswitcher;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import p000.fcp;
import p000.ict;
import p000.icw;
import p000.ikw;
import p000.ilk;
import p000.jvd;
import p000.jvh;
import p000.mqu;
import p000.mrm;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MoreModesGrid extends GridLayout implements ict {

    /* JADX INFO: renamed from: b */
    public final ArrayList f7075b;

    /* JADX INFO: renamed from: c */
    public ilk f7076c;

    /* JADX INFO: renamed from: d */
    public fcp f7077d;

    /* JADX INFO: renamed from: e */
    public boolean f7078e;

    /* JADX INFO: renamed from: f */
    public Animator f7079f;

    /* JADX INFO: renamed from: g */
    public int f7080g;

    /* JADX INFO: renamed from: h */
    public int f7081h;

    /* JADX INFO: renamed from: i */
    public float f7082i;

    /* JADX INFO: renamed from: j */
    public mrm f7083j;

    /* JADX INFO: renamed from: k */
    private static final nbh f7074k = nbh.m17259h("com/google/android/apps/camera/ui/modeswitcher/MoreModesGrid");

    /* JADX INFO: renamed from: a */
    public static final ColorFilter f7073a = new ColorMatrixColorFilter(new float[]{0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});

    public MoreModesGrid(Context context) {
        super(context);
        this.f7075b = new ArrayList();
        this.f7076c = ilk.PORTRAIT;
        this.f7078e = false;
        this.f7079f = new ObjectAnimator();
        this.f7082i = 0.0f;
        this.f7083j = mqu.f41450a;
        m4396e(context);
    }

    /* JADX INFO: renamed from: e */
    private final void m4396e(Context context) {
        jvd.m13538a();
        setColumnCount(3);
        Resources resources = context.getResources();
        this.f7080g = resources.getInteger(C0100R.integer.show_more_modes_animation_duration);
        this.f7081h = resources.getInteger(C0100R.integer.hide_more_modes_animation_duration);
        this.f7082i = resources.getDimension(C0100R.dimen.more_modes_motion_animation_offset);
        setBackground(resources.getDrawable(C0100R.drawable.more_modes_bg, null));
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0100R.dimen.more_modes_grid_bottom_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(C0100R.dimen.more_modes_grid_side_padding);
        setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: f */
    private final void m4397f(float f) {
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setAlpha(f);
    }

    /* JADX INFO: renamed from: a */
    public final Animator m4398a(boolean z) {
        Property property = View.ALPHA;
        float[] fArr = new float[2];
        fArr[0] = z ? 0.0f : getAlpha();
        fArr[1] = true == z ? 1.0f : 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<MoreModesGrid, Float>) property, fArr);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: c */
    public final void m4400c() {
        jvh.m13577y((View) getParent(), this.f7076c);
    }

    /* JADX INFO: renamed from: d */
    public final void m4401d(boolean z) {
        this.f7079f.cancel();
        if (z) {
            m4397f(1.0f);
        } else {
            m4397f(0.3f);
        }
        super.setEnabled(z);
    }

    @Override // p000.ict
    /* JADX INFO: renamed from: i */
    public final void mo4395i(ikw ikwVar, boolean z) {
        icw icwVar;
        ArrayList arrayList = this.f7075b;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                icwVar = null;
                break;
            } else {
                icwVar = (icw) arrayList.get(i);
                i++;
            }
        } while (icwVar.f30400a != ikwVar);
        if (icwVar == null) {
            ((nbe) ((nbe) f7074k.m17251b()).mo17276G((char) 4177)).mo17293r("No ModeInfo found for %s", ikwVar);
            return;
        }
        if (z && icwVar.f30402c) {
            return;
        }
        if (z || icwVar.f30402c) {
            icwVar.f30402c = z;
            View view = icwVar.f30401b;
            if (view == null) {
                return;
            }
            ((LayerDrawable) ((TextView) view).getCompoundDrawables()[1]).getDrawable(2).setAlpha(true == z ? 255 : 0);
        }
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4400c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Animator m4399b(boolean z) {
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[2];
        fArr[0] = z ? this.f7082i : getTranslationX();
        fArr[1] = z ? 0.0f : this.f7082i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<MoreModesGrid, Float>) property, fArr);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        return objectAnimatorOfFloat;
    }

    public MoreModesGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7075b = new ArrayList();
        this.f7076c = ilk.PORTRAIT;
        this.f7078e = false;
        this.f7079f = new ObjectAnimator();
        this.f7082i = 0.0f;
        this.f7083j = mqu.f41450a;
        m4396e(context);
    }

    public MoreModesGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7075b = new ArrayList();
        this.f7076c = ilk.PORTRAIT;
        this.f7078e = false;
        this.f7079f = new ObjectAnimator();
        this.f7082i = 0.0f;
        this.f7083j = mqu.f41450a;
        m4396e(context);
    }

    public MoreModesGrid(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7075b = new ArrayList();
        this.f7076c = ilk.PORTRAIT;
        this.f7078e = false;
        this.f7079f = new ObjectAnimator();
        this.f7082i = 0.0f;
        this.f7083j = mqu.f41450a;
        m4396e(context);
    }
}
