package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: pt */
/* JADX INFO: loaded from: classes.dex */
public final class C3472pt extends AbstractC3517r {

    /* JADX INFO: renamed from: d */
    public final int f56776d;

    public C3472pt(w58 w58Var) {
        super(w58Var);
        this.f56776d = w58Var.f45995a;
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1298a(int i, Object obj) {
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: f */
    public final void mo1302f(int i, int i2, int i3) {
        ArrayList arrayListM19474s = m19474s();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List listSubList = arrayListM19474s.subList(i, i3 + i);
            ArrayList arrayListM22624p1 = u91.m22624p1(listSubList);
            listSubList.clear();
            arrayListM19474s.addAll(i4, arrayListM22624p1);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            arrayListM19474s.set(i, arrayListM19474s.set(i2, arrayListM19474s.get(i)));
        } else {
            arrayListM19474s.add(i4, arrayListM19474s.remove(i));
        }
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: h */
    public final void mo1304h(int i, int i2) {
        ArrayList arrayListM19474s = m19474s();
        if (i2 == 1) {
            arrayListM19474s.remove(i);
        } else {
            arrayListM19474s.subList(i, i2 + i).clear();
        }
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: l */
    public final void mo1306l(int i, Object obj) {
        vp2 vp2Var = (vp2) obj;
        Object obj2 = this.f58433b;
        obj2.getClass();
        int i2 = ((jq2) obj2).f45995a;
        if (i2 > 0) {
            if (vp2Var instanceof jq2) {
                jq2 jq2Var = (jq2) vp2Var;
                jq2Var.f45995a = jq2Var.f45996b ? this.f56776d : i2 - 1;
            }
            m19474s().add(i, vp2Var);
            return;
        }
        Object obj3 = this.f58432a;
        obj3.getClass();
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((jq2) obj3).f45995a).toString());
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: p */
    public final void mo4608p() {
        Object obj = this.f58432a;
        obj.getClass();
        ((jq2) obj).f45997c.clear();
    }

    /* JADX INFO: renamed from: s */
    public final ArrayList m19474s() {
        vp2 vp2Var = (vp2) this.f58433b;
        if (vp2Var instanceof jq2) {
            return ((jq2) vp2Var).f45997c;
        }
        C3386nv.m17633t("Current node cannot accept children");
        return null;
    }
}
