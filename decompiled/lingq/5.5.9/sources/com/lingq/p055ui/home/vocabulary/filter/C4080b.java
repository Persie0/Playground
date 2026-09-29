package com.lingq.p055ui.home.vocabulary.filter;

import android.view.View;
import android.widget.AdapterView;
import p278nh.AbstractC7787n;
import p278nh.InterfaceC7788o;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4080b implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4079a f26544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC7787n.f f26545b;

    public C4080b(C4079a c4079a, AbstractC7787n.f fVar) {
        this.f26544a = c4079a;
        this.f26545b = fVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        InterfaceC7788o interfaceC7788o = this.f26544a.f26529f;
        AbstractC7787n.f fVar = this.f26545b;
        interfaceC7788o.mo9848b(fVar.f42754c, fVar.f42752a.get(i10));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
