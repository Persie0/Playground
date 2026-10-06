package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.afc;
import p000.mji;
import p000.mjj;
import p000.mjs;
import p000.mjy;
import p000.mjz;
import p000.mka;
import p000.mkd;
import p000.mkh;
import p000.mki;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicator extends mji {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // p000.mji
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ mjj mo4845a(Context context, AttributeSet attributeSet) {
        return new mki(context, attributeSet);
    }

    @Override // p000.mji
    /* JADX INFO: renamed from: g */
    public final void mo4846g(int i) {
        mjj mjjVar = this.f40731a;
        if (mjjVar != null && ((mki) mjjVar).f40836g == 0 && isIndeterminate()) {
            return;
        }
        super.mo4846g(i);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mki mkiVar = (mki) this.f40731a;
        boolean z2 = true;
        if (mkiVar.f40837h != 1 && ((afc.m442c(this) != 1 || ((mki) this.f40731a).f40837h != 2) && (afc.m442c(this) != 0 || ((mki) this.f40731a).f40837h != 3))) {
            z2 = false;
        }
        mkiVar.f40838i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        mjz indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        mjs progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        mjy mkhVar;
        super(context, attributeSet, i, C0100R.style.Widget_MaterialComponents_LinearProgressIndicator);
        Context context2 = getContext();
        mki mkiVar = (mki) this.f40731a;
        mka mkaVar = new mka(mkiVar);
        if (mkiVar.f40836g == 0) {
            mkhVar = new mkd(mkiVar);
        } else {
            mkhVar = new mkh(context2, mkiVar);
        }
        setIndeterminateDrawable(new mjz(context2, mkiVar, mkaVar, mkhVar));
        Context context3 = getContext();
        mki mkiVar2 = (mki) this.f40731a;
        setProgressDrawable(new mjs(context3, mkiVar2, new mka(mkiVar2)));
    }
}
