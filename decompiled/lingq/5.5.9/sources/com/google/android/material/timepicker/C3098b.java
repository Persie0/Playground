package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.linguist.R;
import p471x2.C10026a;
import p497y2.C10284f;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3098b extends C10026a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f15853d;

    public C3098b(ClockFaceView clockFaceView) {
        this.f15853d = clockFaceView;
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: d */
    public final void mo2999d(View view, C10284f c10284f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
        AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f15853d.f15825S.get(iIntValue - 1));
        }
        c10284f.m19266k(C10284f.c.m19275a(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c10284f.m19257b(C10284f.a.f51742e);
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: g */
    public final boolean mo3000g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.mo3000g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f15853d;
        view.getHitRect(clockFaceView.f15822P);
        float fCenterX = clockFaceView.f15822P.centerX();
        float fCenterY = clockFaceView.f15822P.centerY();
        clockFaceView.f15821O.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f15821O.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
