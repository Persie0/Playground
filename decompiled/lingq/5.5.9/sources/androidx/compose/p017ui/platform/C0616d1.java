package androidx.compose.p017ui.platform;

import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p166i1.InterfaceC6142e0;
import p210k1.C6570h;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0616d1 implements InterfaceC6142e0 {

    /* JADX INFO: renamed from: a */
    public final int f4298a;

    /* JADX INFO: renamed from: b */
    public final List<C0616d1> f4299b;

    /* JADX INFO: renamed from: c */
    public Float f4300c;

    /* JADX INFO: renamed from: d */
    public Float f4301d;

    /* JADX INFO: renamed from: e */
    public C6570h f4302e;

    /* JADX INFO: renamed from: f */
    public C6570h f4303f;

    public C0616d1(int i10, ArrayList arrayList) {
        C5207g.m11111f(arrayList, "allScopes");
        this.f4298a = i10;
        this.f4299b = arrayList;
        this.f4300c = null;
        this.f4301d = null;
        this.f4302e = null;
        this.f4303f = null;
    }

    @Override // p166i1.InterfaceC6142e0
    /* JADX INFO: renamed from: o */
    public final boolean mo2089o() {
        return this.f4299b.contains(this);
    }
}
