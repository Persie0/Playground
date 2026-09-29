package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.datepicker.o */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3013o implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3011m f15206a;

    public ViewOnClickListenerC3013o(C3011m c3011m) {
        this.f15206a = c3011m;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3011m c3011m = this.f15206a;
        c3011m.f15195h1.setEnabled(c3011m.m8743t0().m8722a0());
        c3011m.f15193f1.toggle();
        c3011m.m8745y0(c3011m.f15193f1);
        c3011m.m8744x0();
    }
}
