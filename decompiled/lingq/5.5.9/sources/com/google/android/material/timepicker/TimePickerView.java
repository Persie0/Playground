package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.linguist.R;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ int f15849M = 0;

    /* JADX INFO: renamed from: L */
    public final Chip f15850L;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class ViewOnClickListenerC3096a implements View.OnClickListener {
        public ViewOnClickListenerC3096a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i10 = TimePickerView.f15849M;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC3096a viewOnClickListenerC3096a = new ViewOnClickListenerC3096a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f14924c.add(new MaterialButtonToggleGroup.InterfaceC2973d() { // from class: com.google.android.material.timepicker.d
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC2973d
            /* JADX INFO: renamed from: a */
            public final void mo8640a() {
                int i10 = TimePickerView.f15849M;
                this.f15857a.getClass();
            }
        });
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f15850L = chip2;
        ViewOnTouchListenerC3102f viewOnTouchListenerC3102f = new ViewOnTouchListenerC3102f(new GestureDetector(getContext(), new C3101e(this)));
        chip.setOnTouchListener(viewOnTouchListenerC3102f);
        chip2.setOnTouchListener(viewOnTouchListenerC3102f);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC3096a);
        chip2.setOnClickListener(viewOnClickListenerC3096a);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f15850L.sendAccessibilityEvent(8);
        }
    }
}
