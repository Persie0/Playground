package com.lingq.commons.p053ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.card.MaterialCardView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import p067d8.ViewOnClickListenerC5062d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0010"}, m13365d2 = {"Lcom/lingq/commons/ui/views/PagesIndicator;", "Lcom/google/android/material/card/MaterialCardView;", "", "index", "Lsl/e;", "setPageIndex", "Lcom/lingq/commons/ui/views/PagesIndicator$a;", "listener", "setOnPageSelectedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@SuppressLint({"RtlHardcoded"})
public final class PagesIndicator extends MaterialCardView {

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ int f16758L = 0;

    /* JADX INFO: renamed from: J */
    public final TextView f16759J;

    /* JADX INFO: renamed from: K */
    public InterfaceC3279a f16760K;

    /* JADX INFO: renamed from: com.lingq.commons.ui.views.PagesIndicator$a */
    public interface InterfaceC3279a {
        /* JADX INFO: renamed from: a */
        void mo9358a();

        /* JADX INFO: renamed from: b */
        void mo9359b(boolean z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagesIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        setRadius(getResources().getDimensionPixelSize(R.dimen.btn_corner_radius_high));
        setElevation(getResources().getDimensionPixelSize(R.dimen.elevation_high));
        setBackgroundResource(R.drawable.dr_pages_indicator_bg);
        Object systemService = context.getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.view_pages_indicator, (ViewGroup) this, true);
        View childAt = getChildAt(0);
        C5207g.m11109d(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) childAt;
        View childAt2 = linearLayout.getChildAt(0);
        C5207g.m11109d(childAt2, "null cannot be cast to non-null type android.widget.ImageButton");
        View childAt3 = linearLayout.getChildAt(1);
        C5207g.m11109d(childAt3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) childAt3;
        this.f16759J = textView;
        View childAt4 = linearLayout.getChildAt(2);
        C5207g.m11109d(childAt4, "null cannot be cast to non-null type android.widget.ImageButton");
        ((ImageButton) childAt2).setOnClickListener(new ViewOnClickListenerC5062d0(3, this));
        ((ImageButton) childAt4).setOnClickListener(new ViewOnClickListenerC2238x(4, this));
        textView.setOnClickListener(new ViewOnClickListenerC2239y(7, this));
        setVisibility(8);
    }

    public final void setOnPageSelectedListener(InterfaceC3279a interfaceC3279a) {
        C5207g.m11111f(interfaceC3279a, "listener");
        this.f16760K = interfaceC3279a;
    }

    public final void setPageIndex(String str) {
        C5207g.m11111f(str, "index");
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        this.f16759J.setText(str);
    }
}
