package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p000.cg5;
import p000.dw6;
import p000.o0a;
import p000.p0a;
import p000.q0a;

/* JADX INFO: loaded from: classes2.dex */
public class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ int f13355M = 0;

    /* JADX INFO: renamed from: L */
    public final Chip f13356L;

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p0a p0aVar = new p0a();
        LayoutInflater.from(context).inflate(R$layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R$id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R$id.material_clock_period_toggle);
        materialButtonToggleGroup.f12795I.add(new o0a(this));
        Chip chip = (Chip) findViewById(R$id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R$id.material_hour_tv);
        this.f13356L = chip2;
        clockFaceView.f13340g0 = new dw6(this, 15);
        cg5 cg5Var = new cg5(new GestureDetector(getContext(), new q0a()), 1);
        chip.setOnTouchListener(cg5Var);
        chip2.setOnTouchListener(cg5Var);
        chip.setTag(R$id.selection_type, 12);
        chip2.setTag(R$id.selection_type, 10);
        chip.setOnClickListener(p0aVar);
        chip2.setOnClickListener(p0aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f13356L.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }
}
