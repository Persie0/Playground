package com.lingq.commons.p053ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import p274n8.ViewOnClickListenerC7718c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001d\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u0012"}, m13365d2 = {"Lcom/lingq/commons/ui/views/NumberStepper;", "Landroid/widget/LinearLayout;", "", "currentNumber", "Lsl/e;", "setNumber", "maxStep", "setMaxStep", "Lcom/lingq/commons/ui/views/NumberStepper$a;", "listener", "setOnNumberChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@SuppressLint({"RtlHardcoded"})
public final class NumberStepper extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f16752f = 0;

    /* JADX INFO: renamed from: a */
    public final ImageButton f16753a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3278a f16754b;

    /* JADX INFO: renamed from: c */
    public int f16755c;

    /* JADX INFO: renamed from: d */
    public final int f16756d;

    /* JADX INFO: renamed from: e */
    public int f16757e;

    /* JADX INFO: renamed from: com.lingq.commons.ui.views.NumberStepper$a */
    public interface InterfaceC3278a {
        /* JADX INFO: renamed from: a */
        void mo9357a(int i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberStepper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        this.f16756d = 1;
        this.f16757e = Integer.MAX_VALUE;
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(R.drawable.dr_number_stepper_bg);
        Object systemService = context.getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.view_number_stepper, (ViewGroup) this, true);
        View childAt = getChildAt(2);
        C5207g.m11109d(childAt, "null cannot be cast to non-null type android.widget.ImageButton");
        ImageButton imageButton = (ImageButton) childAt;
        this.f16753a = imageButton;
        View childAt2 = getChildAt(0);
        C5207g.m11109d(childAt2, "null cannot be cast to non-null type android.widget.ImageButton");
        imageButton.setOnClickListener(new ViewOnClickListenerC2239y(6, this));
        ((ImageButton) childAt2).setOnClickListener(new ViewOnClickListenerC7718c(4, this));
        m9356a();
    }

    /* JADX INFO: renamed from: a */
    public final void m9356a() {
        this.f16753a.setEnabled(this.f16755c < this.f16757e);
    }

    public final void setMaxStep(int i10) {
        this.f16757e = i10;
    }

    public final void setNumber(int i10) {
        this.f16755c = i10;
        m9356a();
    }

    public final void setOnNumberChangedListener(InterfaceC3278a interfaceC3278a) {
        C5207g.m11111f(interfaceC3278a, "listener");
        this.f16754b = interfaceC3278a;
    }
}
