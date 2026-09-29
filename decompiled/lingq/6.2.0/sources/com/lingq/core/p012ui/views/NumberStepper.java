package com.lingq.core.p012ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$layout;
import com.lingq.core.p012ui.views.NumberStepper;
import p000.bp6;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberStepper extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final ImageButton f24190a;

    /* JADX INFO: renamed from: b */
    public int f24191b;

    /* JADX INFO: renamed from: c */
    public final int f24192c;

    /* JADX INFO: renamed from: d */
    public int f24193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberStepper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        final int i = 1;
        this.f24192c = 1;
        this.f24193d = Integer.MAX_VALUE;
        final int i2 = 0;
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(R$drawable.dr_number_stepper_bg);
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R$layout.view_number_stepper, (ViewGroup) this, true);
        View childAt = getChildAt(2);
        childAt.getClass();
        ImageButton imageButton = (ImageButton) childAt;
        this.f24190a = imageButton;
        View childAt2 = getChildAt(0);
        childAt2.getClass();
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: ap6

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NumberStepper f7327b;

            {
                this.f7327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                NumberStepper numberStepper = this.f7327b;
                switch (i3) {
                    case 0:
                        numberStepper.f24191b += numberStepper.f24192c;
                        numberStepper.m8803a();
                        break;
                    default:
                        int i4 = numberStepper.f24191b - numberStepper.f24192c;
                        numberStepper.f24191b = i4;
                        if (i4 < 0) {
                            numberStepper.f24191b = 0;
                        }
                        numberStepper.m8803a();
                        break;
                }
            }
        });
        ((ImageButton) childAt2).setOnClickListener(new View.OnClickListener(this) { // from class: ap6

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NumberStepper f7327b;

            {
                this.f7327b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                NumberStepper numberStepper = this.f7327b;
                switch (i3) {
                    case 0:
                        numberStepper.f24191b += numberStepper.f24192c;
                        numberStepper.m8803a();
                        break;
                    default:
                        int i4 = numberStepper.f24191b - numberStepper.f24192c;
                        numberStepper.f24191b = i4;
                        if (i4 < 0) {
                            numberStepper.f24191b = 0;
                        }
                        numberStepper.m8803a();
                        break;
                }
            }
        });
        m8803a();
    }

    /* JADX INFO: renamed from: a */
    public final void m8803a() {
        this.f24190a.setEnabled(this.f24191b < this.f24193d);
    }

    public final void setMaxStep(int i) {
        this.f24193d = i;
    }

    public final void setNumber(int i) {
        this.f24191b = i;
        m8803a();
    }

    public final void setOnNumberChangedListener(bp6 bp6Var) {
        bp6Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NumberStepper(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ NumberStepper(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
