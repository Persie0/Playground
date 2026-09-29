package com.lingq.p055ui.tooltips;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.linguist.R;
import dm.C5207g;
import fk.ViewOnClickListenerC5566h;
import java.util.Arrays;
import java.util.List;
import p225kk.C6716m;
import ph.C8338o4;

/* JADX INFO: renamed from: com.lingq.ui.tooltips.a */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C4911a extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f31934b = 0;

    /* JADX INFO: renamed from: a */
    public final C8338o4 f31935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C4911a(Context context, TooltipStep tooltipStep, ToolTipsViewManager.C4907c c4907c) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(tooltipStep, "step");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_tooltip, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.tv_message;
        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tv_message);
        if (textView != null) {
            i10 = R.id.view_more;
            ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.view_more);
            if (imageView != null) {
                i10 = R.id.viewParent;
                if (((ConstraintLayout) C0062b.m298P0(viewInflate, R.id.viewParent)) != null) {
                    this.f31935a = new C8338o4(textView, imageView);
                    List<Integer> list = C6716m.f37937a;
                    String str = TooltipStep.info$default(tooltipStep, context, 0, null, 6, null).f31928a;
                    String[] strArr = (String[]) TooltipStep.info$default(tooltipStep, context, 0, null, 6, null).f31929b.toArray(new String[0]);
                    textView.setText(C6716m.m13322g(str, (String[]) Arrays.copyOf(strArr, strArr.length)));
                    imageView.setOnClickListener(new ViewOnClickListenerC5566h(1, c4907c));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public final C8338o4 getBinding() {
        return this.f31935a;
    }
}
