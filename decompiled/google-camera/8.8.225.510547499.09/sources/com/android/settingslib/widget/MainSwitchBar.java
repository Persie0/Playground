package com.android.settingslib.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import p000.aos;
import p000.bou;
import p000.bov;
import p000.bzq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class MainSwitchBar extends LinearLayout implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    protected TextView f6472a;

    /* JADX INFO: renamed from: b */
    protected Switch f6473b;

    /* JADX INFO: renamed from: c */
    private final List f6474c;

    /* JADX INFO: renamed from: d */
    private int f6475d;

    /* JADX INFO: renamed from: e */
    private int f6476e;

    /* JADX INFO: renamed from: f */
    private Drawable f6477f;

    /* JADX INFO: renamed from: g */
    private Drawable f6478g;

    /* JADX INFO: renamed from: h */
    private Drawable f6479h;

    /* JADX INFO: renamed from: i */
    private View f6480i;

    public MainSwitchBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m4025e(boolean z) {
        if (bzq.m3232E()) {
            this.f6480i.setBackground(z ? this.f6477f : this.f6478g);
        } else {
            setBackgroundColor(z ? this.f6476e : this.f6475d);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4026a(bov bovVar) {
        if (this.f6474c.contains(bovVar)) {
            return;
        }
        this.f6474c.add(bovVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m4027b(boolean z) {
        Switch r0 = this.f6473b;
        if (r0 != null) {
            r0.setChecked(z);
        }
        m4025e(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m4028c(CharSequence charSequence) {
        TextView textView = this.f6472a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4029d() {
        return this.f6473b.isChecked();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m4025e(z);
        int size = this.f6474c.size();
        for (int i = 0; i < size; i++) {
            ((bov) this.f6474c.get(i)).mo2825aX(z);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        bou bouVar = (bou) parcelable;
        super.onRestoreInstanceState(bouVar.getSuperState());
        this.f6473b.setChecked(bouVar.f4028a);
        m4027b(bouVar.f4028a);
        m4025e(bouVar.f4028a);
        setVisibility(true != bouVar.f4029b ? 8 : 0);
        this.f6473b.setOnCheckedChangeListener(true != bouVar.f4029b ? null : this);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        bou bouVar = new bou(super.onSaveInstanceState());
        bouVar.f4028a = this.f6473b.isChecked();
        bouVar.f4029b = getVisibility() == 0;
        return bouVar;
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.f6473b.performClick();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f6472a.setEnabled(z);
        this.f6473b.setEnabled(z);
        if (bzq.m3232E()) {
            if (z) {
                this.f6480i.setBackground(m4029d() ? this.f6477f : this.f6478g);
            } else {
                this.f6480i.setBackground(this.f6479h);
            }
        }
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6474c = new ArrayList();
        LayoutInflater.from(context).inflate(C0100R.layout.settingslib_main_switch_bar, this);
        if (!bzq.m3232E()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorAccent});
            this.f6476e = typedArrayObtainStyledAttributes.getColor(0, 0);
            this.f6475d = context.getColor(C0100R.color.material_grey_600);
            typedArrayObtainStyledAttributes.recycle();
        }
        setFocusable(true);
        setClickable(true);
        this.f6480i = findViewById(C0100R.id.frame);
        this.f6472a = (TextView) findViewById(C0100R.id.switch_text);
        this.f6473b = (Switch) findViewById(R.id.switch_widget);
        if (bzq.m3232E()) {
            this.f6477f = getContext().getDrawable(C0100R.drawable.settingslib_switch_bar_bg_on);
            this.f6478g = getContext().getDrawable(C0100R.drawable.settingslib_switch_bar_bg_off);
            this.f6479h = getContext().getDrawable(C0100R.drawable.settingslib_switch_bar_bg_disabled);
        }
        m4026a(new bov() { // from class: bot
            @Override // p000.bov
            /* JADX INFO: renamed from: aX */
            public final void mo2825aX(boolean z) {
                this.f4027a.m4027b(z);
            }
        });
        if (this.f6473b.getVisibility() == 0) {
            this.f6473b.setOnCheckedChangeListener(this);
        }
        m4027b(this.f6473b.isChecked());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, aos.f1927g, 0, 0);
            m4028c(typedArrayObtainStyledAttributes2.getText(4));
            typedArrayObtainStyledAttributes2.recycle();
        }
        m4025e(this.f6473b.isChecked());
    }
}
