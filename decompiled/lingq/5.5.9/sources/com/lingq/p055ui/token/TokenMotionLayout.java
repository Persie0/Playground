package com.lingq.p055ui.token;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/token/TokenMotionLayout;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TokenMotionLayout extends MotionLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenMotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
    }

    /* JADX INFO: renamed from: N */
    public static boolean m10367N(View view, MotionEvent motionEvent) {
        return motionEvent.getX() > ((float) view.getLeft()) && motionEvent.getX() < ((float) view.getRight()) && motionEvent.getY() > ((float) view.getTop()) && motionEvent.getY() < ((float) view.getBottom());
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C5207g.m11111f(motionEvent, "ev");
        boolean z10 = getProgress() > 0.0f && getProgress() < 1.0f;
        View viewFindViewById = findViewById(R.id.cardView);
        C5207g.m11110e(viewFindViewById, "this.findViewById(R.id.cardView)");
        return (z10 || m10367N(viewFindViewById, motionEvent)) ? super.onInterceptTouchEvent(motionEvent) : true;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5207g.m11111f(motionEvent, "ev");
        boolean z10 = getProgress() > 0.0f && getProgress() < 1.0f;
        View viewFindViewById = findViewById(R.id.cardView);
        C5207g.m11110e(viewFindViewById, "this.findViewById(R.id.cardView)");
        return (z10 || m10367N(viewFindViewById, motionEvent)) ? super.onTouchEvent(motionEvent) : false;
    }
}
