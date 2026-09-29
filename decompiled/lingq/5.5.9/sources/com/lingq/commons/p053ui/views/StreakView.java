package com.lingq.commons.p053ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kh.C6694u;
import kotlin.Metadata;
import p225kk.C6716m;
import p301oh.C8047f;
import p301oh.C8048g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\u0014"}, m13365d2 = {"Lcom/lingq/commons/ui/views/StreakView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/widget/LinearLayout$LayoutParams;", "getLayoutWeightParams", "", "color", "Lsl/e;", "setActiveColor", "setInactiveColor", "setLabelColor", "", "Loh/g;", "entries", "setActiveStates", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StreakView extends MaterialCardView {

    /* JADX INFO: renamed from: J */
    public final LinearLayout f16840J;

    /* JADX INFO: renamed from: K */
    public final LinearLayout f16841K;

    /* JADX INFO: renamed from: L */
    public int f16842L;

    /* JADX INFO: renamed from: M */
    public int f16843M;

    /* JADX INFO: renamed from: N */
    public int f16844N;

    /* JADX INFO: renamed from: O */
    public List<C8048g> f16845O;

    /* JADX INFO: renamed from: com.lingq.commons.ui.views.StreakView$a */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC3284a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f16846a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StreakView f16847b;

        public ViewTreeObserverOnGlobalLayoutListenerC3284a(LinearLayout linearLayout, StreakView streakView) {
            this.f16846a = linearLayout;
            this.f16847b = streakView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup viewGroup = this.f16846a;
            if (viewGroup.getMeasuredWidth() > 0 && viewGroup.getMeasuredHeight() > 0) {
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LinearLayout linearLayout = (LinearLayout) viewGroup;
                StreakView streakView = this.f16847b;
                streakView.f16840J.removeAllViews();
                streakView.f16841K.setGravity(17);
                for (C8048g c8048g : streakView.f16845O) {
                    Context context = linearLayout.getContext();
                    C5207g.m11110e(context, "context");
                    C8047f c8047f = new C8047f(context);
                    LinearLayout linearLayout2 = streakView.f16840J;
                    int iMin = Math.min(linearLayout2.getMeasuredHeight(), linearLayout2.getMeasuredWidth() / streakView.f16845O.size());
                    List<Integer> list = C6716m.f37937a;
                    c8047f.setViewForSize(iMin - ((int) C6716m.m13316a(15)));
                    c8047f.m15927a(c8048g.f43729b, c8048g.f43730c, c8048g.f43731d);
                    linearLayout2.addView(c8047f);
                    int iM13316a = (int) C6716m.m13316a(4);
                    c8047f.setPadding(iM13316a, iM13316a, iM13316a, iM13316a);
                    c8047f.setLayoutParams(streakView.getLayoutWeightParams());
                }
                StreakView.m9380e(streakView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        List<Integer> list = C6716m.f37937a;
        this.f16842L = C6716m.m13333r(R.attr.yellowWordBorderColor, context);
        this.f16843M = C6716m.m13333r(R.attr.primaryTextColor, context);
        this.f16844N = -7829368;
        this.f16845O = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6694u.f37846d, 0, 0);
        C5207g.m11110e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…treakView, 0, 0\n        )");
        this.f16843M = typedArrayObtainStyledAttributes.getColor(1, this.f16843M);
        this.f16842L = typedArrayObtainStyledAttributes.getColor(0, this.f16842L);
        this.f16844N = typedArrayObtainStyledAttributes.getColor(2, this.f16844N);
        typedArrayObtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.view_streak, (ViewGroup) this, true);
        View childAt = getChildAt(0);
        C5207g.m11109d(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) childAt;
        View childAt2 = linearLayout.getChildAt(0);
        C5207g.m11109d(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f16840J = (LinearLayout) childAt2;
        View childAt3 = linearLayout.getChildAt(1);
        C5207g.m11109d(childAt3, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f16841K = (LinearLayout) childAt3;
    }

    /* JADX INFO: renamed from: e */
    public static final void m9380e(StreakView streakView) {
        LinearLayout linearLayout = streakView.f16841K;
        linearLayout.removeAllViews();
        for (C8048g c8048g : streakView.f16845O) {
            TextView textView = new TextView(streakView.getContext());
            textView.setText(c8048g.f43728a);
            textView.setTextColor(streakView.f16843M);
            linearLayout.addView(textView);
            textView.setGravity(1);
            textView.setLayoutParams(streakView.getLayoutWeightParams());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout.LayoutParams getLayoutWeightParams() {
        return new LinearLayout.LayoutParams(-1, -1, 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final void m9382g() {
        LinearLayout linearLayout = this.f16840J;
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3284a(linearLayout, this));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
    }

    public final void setActiveColor(int i10) {
        this.f16842L = i10;
        m9382g();
    }

    public final void setActiveStates(List<C8048g> list) {
        C5207g.m11111f(list, "entries");
        this.f16845O = list;
        m9382g();
    }

    public final void setInactiveColor(int i10) {
        this.f16844N = i10;
        m9382g();
    }

    public final void setLabelColor(int i10) {
        this.f16843M = i10;
        m9382g();
    }
}
