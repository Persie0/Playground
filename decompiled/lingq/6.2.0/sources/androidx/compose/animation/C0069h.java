package androidx.compose.animation;

import p000.d16;
import p000.fa4;
import p000.faa;
import p000.i16;
import p000.qs2;
import p000.qv2;
import p000.ui3;
import p000.v9a;
import p000.vs2;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.animation.h */
/* JADX INFO: loaded from: classes.dex */
final class C0069h extends i16 {

    /* JADX INFO: renamed from: b */
    public final faa f1568b;

    /* JADX INFO: renamed from: c */
    public final v9a f1569c;

    /* JADX INFO: renamed from: d */
    public final v9a f1570d;

    /* JADX INFO: renamed from: e */
    public final v9a f1571e;

    /* JADX INFO: renamed from: f */
    public final vs2 f1572f;

    /* JADX INFO: renamed from: g */
    public final qv2 f1573g;

    /* JADX INFO: renamed from: h */
    public final ui3 f1574h;

    /* JADX INFO: renamed from: i */
    public final qs2 f1575i;

    public C0069h(faa faaVar, v9a v9aVar, v9a v9aVar2, v9a v9aVar3, vs2 vs2Var, qv2 qv2Var, ui3 ui3Var, qs2 qs2Var) {
        this.f1568b = faaVar;
        this.f1569c = v9aVar;
        this.f1570d = v9aVar2;
        this.f1571e = v9aVar3;
        this.f1572f = vs2Var;
        this.f1573g = qv2Var;
        this.f1574h = ui3Var;
        this.f1575i = qs2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0069h)) {
            return false;
        }
        C0069h c0069h = (C0069h) obj;
        return fa4.m11650l(c0069h.f1568b, this.f1568b) && fa4.m11650l(c0069h.f1569c, this.f1569c) && fa4.m11650l(c0069h.f1570d, this.f1570d) && fa4.m11650l(c0069h.f1571e, this.f1571e) && c0069h.f1572f.equals(this.f1572f) && fa4.m11650l(c0069h.f1573g, this.f1573g) && c0069h.f1574h == this.f1574h && fa4.m11650l(c0069h.f1575i, this.f1575i);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0071j(this.f1568b, this.f1569c, this.f1570d, this.f1571e, this.f1572f, this.f1573g, this.f1574h, this.f1575i);
    }

    public final int hashCode() {
        int iHashCode = this.f1568b.hashCode() * 31;
        v9a v9aVar = this.f1569c;
        int iHashCode2 = (iHashCode + (v9aVar != null ? v9aVar.hashCode() : 0)) * 31;
        v9a v9aVar2 = this.f1570d;
        int iHashCode3 = (iHashCode2 + (v9aVar2 != null ? v9aVar2.hashCode() : 0)) * 31;
        v9a v9aVar3 = this.f1571e;
        return this.f1575i.hashCode() + ((this.f1574h.hashCode() + ((this.f1573g.f58243a.hashCode() + ((this.f1572f.f65844a.hashCode() + ((iHashCode3 + (v9aVar3 != null ? v9aVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "enterExitTransition";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f1568b, "transition");
        z91Var.m25511b(this.f1569c, "sizeAnimation");
        z91Var.m25511b(this.f1570d, "offsetAnimation");
        z91Var.m25511b(this.f1571e, "slideAnimation");
        z91Var.m25511b(this.f1572f, "enter");
        z91Var.m25511b(this.f1573g, "exit");
        z91Var.m25511b(this.f1575i, "graphicsLayerBlock");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0071j c0071j = (C0071j) d16Var;
        c0071j.f1580K = this.f1568b;
        c0071j.f1581L = this.f1569c;
        c0071j.f1582M = this.f1570d;
        c0071j.f1583N = this.f1571e;
        c0071j.f1584O = this.f1572f;
        c0071j.f1585P = this.f1573g;
        c0071j.f1586Q = this.f1574h;
        c0071j.f1587R = this.f1575i;
    }
}
