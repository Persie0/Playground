package p000;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class epa implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bgv f14942a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ bgv f14943b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f14944c;

    public epa(bgv bgvVar, bgv bgvVar2, View view) {
        this.f14942a = bgvVar;
        this.f14943b = bgvVar2;
        this.f14944c = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14942a.m2440g();
        this.f14943b.m2440g();
        this.f14944c.removeOnAttachStateChangeListener(this);
    }
}
