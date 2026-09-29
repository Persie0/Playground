package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.RunnableC0190i;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.linguist.R;
import gd.C5768g;
import gd.C5770i;
import gd.C5772k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p153hc.C6031a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes.dex */
public class C3099c extends ConstraintLayout {

    /* JADX INFO: renamed from: L */
    public final RunnableC0190i f15854L;

    /* JADX INFO: renamed from: M */
    public int f15855M;

    /* JADX INFO: renamed from: N */
    public C5768g f15856N;

    public C3099c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3099c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C5768g c5768g = new C5768g();
        this.f15856N = c5768g;
        C5770i c5770i = new C5770i(0.5f);
        C5772k c5772k = c5768g.f34857a.f34870a;
        c5772k.getClass();
        C5772k.a aVar = new C5772k.a(c5772k);
        aVar.f34911e = c5770i;
        aVar.f34912f = c5770i;
        aVar.f34913g = c5770i;
        aVar.f34914h = c5770i;
        c5768g.setShapeAppearanceModel(new C5772k(aVar));
        this.f15856N.m12141m(ColorStateList.valueOf(-1));
        C5768g c5768g2 = this.f15856N;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18680q(this, c5768g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35636E, i10, 0);
        this.f15855M = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f15854L = new RunnableC0190i(18, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            view.setId(C10029b0.e.m18683a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0190i runnableC0190i = this.f15854L;
            handler.removeCallbacks(runnableC0190i);
            handler.post(runnableC0190i);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo8928s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0190i runnableC0190i = this.f15854L;
            handler.removeCallbacks(runnableC0190i);
            handler.post(runnableC0190i);
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo8928s() {
        C0762b c0762b = new C0762b();
        c0762b.m2893e(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f15855M * 0.66f) : this.f15855M;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                C0762b.b bVar = c0762b.m2895i(((View) it.next()).getId()).f5387e;
                bVar.f5404A = R.id.circle_center;
                bVar.f5405B = iRound;
                bVar.f5406C = size;
                size += 360.0f / list.size();
            }
        }
        c0762b.m2891b(this);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f15856N.m12141m(ColorStateList.valueOf(i10));
    }
}
