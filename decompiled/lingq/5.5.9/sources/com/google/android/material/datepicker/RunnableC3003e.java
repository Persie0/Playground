package com.google.android.material.datepicker;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3003e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCalendar f15161b;

    public RunnableC3003e(MaterialCalendar materialCalendar, int i10) {
        this.f15161b = materialCalendar;
        this.f15160a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15161b.f15116E0.m4207k0(this.f15160a);
    }
}
