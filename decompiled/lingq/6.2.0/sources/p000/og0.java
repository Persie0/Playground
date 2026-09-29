package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* JADX INFO: loaded from: classes2.dex */
public final class og0 extends C3133j3 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f54299d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f54300e;

    public /* synthetic */ og0(Object obj, int i) {
        this.f54299d = i;
        this.f54300e = obj;
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: c */
    public void mo14276c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f54299d) {
            case 1:
                super.mo14276c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f54300e).f13018d);
                break;
            default:
                super.mo14276c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: d */
    public final void mo6010d(View view, C0797b4 c0797b4) {
        int i = this.f54299d;
        Object obj = this.f54300e;
        View.AccessibilityDelegate accessibilityDelegate = this.f44987a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((rg0) obj).f59226k) {
                    c0797b4.m3271a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0797b4.f7900a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f13019e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f13018d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0797b4.f7900a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                c0797b4.m3284o(((EditText) view).getText());
                accessibilityNodeInfo3.setHintText(((ChipTextInputComboView) obj).f13320c.getText());
                accessibilityNodeInfo3.setMaxTextLength(2);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c0797b4.f7900a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                int iIntValue = ((Integer) view.getTag(R$id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo4.setTraversalAfter((View) ((ClockFaceView) obj).f13329S.get(iIntValue - 1));
                }
                c0797b4.m3281l(m58.m16638l(view.isSelected(), 0, 1, iIntValue, 1));
                accessibilityNodeInfo4.setClickable(true);
                c0797b4.m3272b(C3671v3.f64755e);
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0797b4.f7900a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.f12794O;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i3 = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                }
                c0797b4.m3281l(m58.m16638l(((MaterialButton) view).f12765P, 0, 1, i3, 1));
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0797b4.f7900a);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                c0797b4.m3272b(new C3671v3(16, materialCalendar.f12889H0.getVisibility() == 0 ? materialCalendar.m2111m(R$string.mtrl_picker_toggle_to_year_selection) : materialCalendar.m2111m(R$string.mtrl_picker_toggle_to_day_selection)));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = c0797b4.f7900a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo5.setCheckable(navigationMenuItemView.f13027S);
                accessibilityNodeInfo5.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R$string.item_view_role_description));
                break;
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: g */
    public boolean mo6011g(View view, int i, Bundle bundle) {
        int i2 = this.f54299d;
        Object obj = this.f54300e;
        switch (i2) {
            case 0:
                if (i == 1048576) {
                    rg0 rg0Var = (rg0) obj;
                    if (rg0Var.f59226k) {
                        rg0Var.cancel();
                        return true;
                    }
                }
                return super.mo6011g(view, i, bundle);
            case 3:
                ClockFaceView clockFaceView = (ClockFaceView) obj;
                ClockHandView clockHandView = clockFaceView.f13325O;
                Rect rect = clockFaceView.f13326P;
                if (i != 16) {
                    return super.mo6011g(view, i, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(rect);
                float fCenterX = rect.centerX();
                float fCenterY = rect.centerY();
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            default:
                return super.mo6011g(view, i, bundle);
        }
    }
}
