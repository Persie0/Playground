package com.lingq.commons.p053ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/commons/ui/views/CollapsibleToolbar;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollapsibleToolbar extends MotionLayout implements AppBarLayout.InterfaceC2938a {

    /* JADX INFO: renamed from: a1 */
    public boolean f16710a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        this.f16710a1 = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC2938a
    /* JADX INFO: renamed from: a */
    public final void mo8568a(AppBarLayout appBarLayout, int i10) {
        if (this.f16710a1) {
            float f3 = -i10;
            Float fValueOf = appBarLayout != null ? Float.valueOf(appBarLayout.getTotalScrollRange()) : null;
            C5207g.m11108c(fValueOf);
            setProgress(f3 / fValueOf.floatValue());
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        AppBarLayout appBarLayout = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
        if (appBarLayout != null) {
            if (appBarLayout.f14681h == null) {
                appBarLayout.f14681h = new ArrayList();
            }
            if (appBarLayout.f14681h.contains(this)) {
                return;
            }
            appBarLayout.f14681h.add(this);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f16710a1 = motionEvent.getAction() == 1;
        }
        return true;
    }
}
