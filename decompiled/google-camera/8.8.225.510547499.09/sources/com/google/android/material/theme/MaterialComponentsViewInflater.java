package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import p000.C0265ii;
import p000.C0267ik;
import p000.C0278iv;
import p000.C0752js;
import p000.mhm;
import p000.mkk;
import p000.mmk;
import p000.mmn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    /* JADX INFO: renamed from: a */
    public final C0265ii mo1022a(Context context, AttributeSet attributeSet) {
        return new mmk(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    /* JADX INFO: renamed from: b */
    public final AppCompatButton mo1023b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    /* JADX INFO: renamed from: c */
    public final C0267ik mo1024c(Context context, AttributeSet attributeSet) {
        return new mhm(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    /* JADX INFO: renamed from: d */
    public final C0278iv mo1025d(Context context, AttributeSet attributeSet) {
        return new mkk(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    /* JADX INFO: renamed from: e */
    public final C0752js mo1026e(Context context, AttributeSet attributeSet) {
        return new mmn(context, attributeSet);
    }
}
