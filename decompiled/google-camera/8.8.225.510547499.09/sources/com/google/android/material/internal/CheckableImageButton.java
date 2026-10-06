package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0273iq;
import p000.afq;
import p000.mir;
import p000.mis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0273iq implements Checkable {

    /* JADX INFO: renamed from: c */
    private static final int[] f8165c = {R.attr.state_checked};

    /* JADX INFO: renamed from: a */
    public boolean f8166a;

    /* JADX INFO: renamed from: b */
    public boolean f8167b;

    /* JADX INFO: renamed from: d */
    private boolean f8168d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f8166a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f8166a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), f8165c) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mis)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mis misVar = (mis) parcelable;
        super.onRestoreInstanceState(misVar.f394d);
        setChecked(misVar.f40639a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        mis misVar = new mis(super.onSaveInstanceState());
        misVar.f40639a = this.f8166a;
        return misVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.f8167b || this.f8166a == z) {
            return;
        }
        this.f8166a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.f8168d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f8166a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8167b = true;
        this.f8168d = true;
        afq.m547g(this, new mir(this));
    }
}
