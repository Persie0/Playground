package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C1143b0 extends AbstractC1155h0 {

    /* JADX INFO: renamed from: c */
    public C1174y f7219c;

    /* JADX INFO: renamed from: d */
    public C1173x f7220d;

    /* JADX INFO: renamed from: e */
    public static int m4430e(View view, AbstractC1175z abstractC1175z) {
        return ((abstractC1175z.mo4531c(view) / 2) + abstractC1175z.mo4533e(view)) - ((abstractC1175z.mo4540l() / 2) + abstractC1175z.mo4539k());
    }

    /* JADX INFO: renamed from: f */
    public static View m4431f(RecyclerView.AbstractC1120m abstractC1120m, AbstractC1175z abstractC1175z) {
        int iM4326y = abstractC1120m.m4326y();
        View view = null;
        if (iM4326y == 0) {
            return null;
        }
        int iMo4540l = (abstractC1175z.mo4540l() / 2) + abstractC1175z.mo4539k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iM4326y; i11++) {
            View viewM4324x = abstractC1120m.m4324x(i11);
            int iAbs = Math.abs(((abstractC1175z.mo4531c(viewM4324x) / 2) + abstractC1175z.mo4533e(viewM4324x)) - iMo4540l);
            if (iAbs < i10) {
                view = viewM4324x;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC1155h0
    /* JADX INFO: renamed from: b */
    public final int[] mo4432b(RecyclerView.AbstractC1120m abstractC1120m, View view) {
        int[] iArr = new int[2];
        if (abstractC1120m.mo4137f()) {
            iArr[0] = m4430e(view, m4434g(abstractC1120m));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1120m.mo4139g()) {
            iArr[1] = m4430e(view, m4435h(abstractC1120m));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1155h0
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public View mo4433c(RecyclerView.AbstractC1120m abstractC1120m) {
        if (abstractC1120m.mo4139g()) {
            return m4431f(abstractC1120m, m4435h(abstractC1120m));
        }
        if (abstractC1120m.mo4137f()) {
            return m4431f(abstractC1120m, m4434g(abstractC1120m));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1175z m4434g(RecyclerView.AbstractC1120m abstractC1120m) {
        C1173x c1173x = this.f7220d;
        if (c1173x == null || c1173x.f7474a != abstractC1120m) {
            this.f7220d = new C1173x(abstractC1120m);
        }
        return this.f7220d;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC1175z m4435h(RecyclerView.AbstractC1120m abstractC1120m) {
        C1174y c1174y = this.f7219c;
        if (c1174y == null || c1174y.f7474a != abstractC1120m) {
            this.f7219c = new C1174y(abstractC1120m);
        }
        return this.f7219c;
    }
}
