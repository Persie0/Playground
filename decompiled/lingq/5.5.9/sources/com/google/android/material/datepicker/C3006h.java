package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.linguist.R;
import p471x2.C10026a;
import p497y2.C10284f;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3006h extends C10026a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MaterialCalendar f15165d;

    public C3006h(MaterialCalendar materialCalendar) {
        this.f15165d = materialCalendar;
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: d */
    public final void mo2999d(View view, C10284f c10284f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
        AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        MaterialCalendar materialCalendar = this.f15165d;
        accessibilityNodeInfo.setHintText(materialCalendar.f15120I0.getVisibility() == 0 ? materialCalendar.m3600t(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.m3600t(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
