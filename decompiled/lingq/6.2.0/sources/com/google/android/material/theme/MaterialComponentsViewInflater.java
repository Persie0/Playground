package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import p000.C2972ep;
import p000.C3009fp;
import p000.C3048gr;
import p000.C3083hp;
import p000.C3270kq;
import p000.C3382nr;
import p000.cs5;
import p000.hr5;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C3382nr {
    @Override // p000.C3382nr
    /* JADX INFO: renamed from: a */
    public final C2972ep mo6244a(Context context, AttributeSet attributeSet) {
        return new hr5(context, attributeSet);
    }

    @Override // p000.C3382nr
    /* JADX INFO: renamed from: b */
    public final C3009fp mo6245b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000.C3382nr
    /* JADX INFO: renamed from: c */
    public final C3083hp mo6246c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // p000.C3382nr
    /* JADX INFO: renamed from: d */
    public final C3270kq mo6247d(Context context, AttributeSet attributeSet) {
        return new cs5(context, attributeSet);
    }

    @Override // p000.C3382nr
    /* JADX INFO: renamed from: e */
    public final C3048gr mo6248e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
