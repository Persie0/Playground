package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0301c;
import androidx.appcompat.widget.C0307e;
import androidx.appcompat.widget.C0336q;
import cd.C1998a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import p080e.C5284p;
import p240ld.C7318r;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C5284p {
    @Override // p080e.C5284p
    /* JADX INFO: renamed from: a */
    public final C0301c mo8921a(Context context, AttributeSet attributeSet) {
        return new C7318r(context, attributeSet);
    }

    @Override // p080e.C5284p
    /* JADX INFO: renamed from: b */
    public final C0307e mo8922b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p080e.C5284p
    /* JADX INFO: renamed from: c */
    public final AppCompatCheckBox mo8923c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // p080e.C5284p
    /* JADX INFO: renamed from: d */
    public final C0336q mo8924d(Context context, AttributeSet attributeSet) {
        return new C1998a(context, attributeSet);
    }

    @Override // p080e.C5284p
    /* JADX INFO: renamed from: e */
    public final AppCompatTextView mo8925e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
