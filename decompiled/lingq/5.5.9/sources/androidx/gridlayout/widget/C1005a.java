package androidx.gridlayout.widget;

import android.view.View;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.gridlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1005a extends GridLayout.AbstractC0996h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GridLayout.AbstractC0996h f6508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GridLayout.AbstractC0996h f6509b;

    public C1005a(GridLayout.AbstractC0996h abstractC0996h, GridLayout.AbstractC0996h abstractC0996h2) {
        this.f6508a = abstractC0996h;
        this.f6509b = abstractC0996h2;
    }

    @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
    /* JADX INFO: renamed from: a */
    public final int mo3854a(View view, int i10, int i11) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z10 = true;
        if (C10029b0.e.m18686d(view) != 1) {
            z10 = false;
        }
        return (!z10 ? this.f6508a : this.f6509b).mo3854a(view, i10, i11);
    }

    @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
    /* JADX INFO: renamed from: c */
    public final String mo3855c() {
        return "SWITCHING[L:" + this.f6508a.mo3855c() + ", R:" + this.f6509b.mo3855c() + "]";
    }

    @Override // androidx.gridlayout.widget.GridLayout.AbstractC0996h
    /* JADX INFO: renamed from: d */
    public final int mo3856d(View view, int i10) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return (!(C10029b0.e.m18686d(view) == 1) ? this.f6508a : this.f6509b).mo3856d(view, i10);
    }
}
