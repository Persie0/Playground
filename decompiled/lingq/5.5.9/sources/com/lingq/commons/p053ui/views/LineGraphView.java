package com.lingq.commons.p053ui.views;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p225kk.C6716m;
import p301oh.C8046e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0013"}, m13365d2 = {"Lcom/lingq/commons/ui/views/LineGraphView;", "Lcom/google/android/material/card/MaterialCardView;", "", "Loh/e;", "coordinates", "Lsl/e;", "setGraphCoordinates", "", "title", "setTitle", "", "color", "setLineColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LineGraphView extends MaterialCardView {

    /* JADX INFO: renamed from: J */
    public final TextView f16750J;

    /* JADX INFO: renamed from: K */
    public final LineGraph f16751K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineGraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.view_graph, (ViewGroup) this, true);
        View childAt = getChildAt(0);
        C5207g.m11109d(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) childAt;
        View childAt2 = linearLayout.getChildAt(0);
        C5207g.m11109d(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        this.f16750J = (TextView) childAt2;
        View childAt3 = linearLayout.getChildAt(1);
        C5207g.m11109d(childAt3, "null cannot be cast to non-null type com.lingq.commons.ui.views.LineGraph");
        this.f16751K = (LineGraph) childAt3;
    }

    public final void setGraphCoordinates(List<C8046e> list) {
        C5207g.m11111f(list, "coordinates");
        this.f16751K.setCoordinatePoints(list);
    }

    public final void setLineColor(int i10) {
        this.f16751K.setLineColor(i10);
    }

    public final void setTitle(String str) {
        C5207g.m11111f(str, "title");
        SpannableString spannableString = new SpannableString(str);
        int i10 = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (Character.isDigit(str.charAt(length))) {
                    i10 = length;
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length = i11;
                }
            }
        }
        int i12 = i10 + 1;
        spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, i12, 33);
        List<Integer> list = C6716m.f37937a;
        Context context = getContext();
        C5207g.m11110e(context, "context");
        spannableString.setSpan(new ForegroundColorSpan(C6716m.m13333r(R.attr.primaryTextColor, context)), 0, i12, 33);
        this.f16750J.setText(spannableString);
    }
}
