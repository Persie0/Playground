package androidx.compose.p017ui.layout;

import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import java.util.Map;
import p127g1.AbstractC5636a;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5653q;
import p166i1.AbstractC6164s;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.layout.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0523d implements InterfaceC5653q {

    /* JADX INFO: renamed from: a */
    public final int f3677a;

    /* JADX INFO: renamed from: b */
    public final int f3678b;

    /* JADX INFO: renamed from: c */
    public final Map<AbstractC5636a, Integer> f3679c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3680d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0524e f3681e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2052l<AbstractC0526g.a, C9072e> f3682f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0523d(int i10, int i11, Map<AbstractC5636a, Integer> map, InterfaceC0524e interfaceC0524e, InterfaceC2052l<? super AbstractC0526g.a, C9072e> interfaceC2052l) {
        this.f3680d = i10;
        this.f3681e = interfaceC0524e;
        this.f3682f = interfaceC2052l;
        this.f3677a = i10;
        this.f3678b = i11;
        this.f3679c = map;
    }

    @Override // p127g1.InterfaceC5653q
    /* JADX INFO: renamed from: a */
    public final int mo2038a() {
        return this.f3678b;
    }

    @Override // p127g1.InterfaceC5653q
    /* JADX INFO: renamed from: b */
    public final int mo2039b() {
        return this.f3677a;
    }

    @Override // p127g1.InterfaceC5653q
    /* JADX INFO: renamed from: e */
    public final Map<AbstractC5636a, Integer> mo2040e() {
        return this.f3679c;
    }

    @Override // p127g1.InterfaceC5653q
    /* JADX INFO: renamed from: f */
    public final void mo2041f() {
        AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
        InterfaceC0524e interfaceC0524e = this.f3681e;
        LayoutDirection layoutDirection = interfaceC0524e.getLayoutDirection();
        AbstractC6164s abstractC6164s = interfaceC0524e instanceof AbstractC6164s ? (AbstractC6164s) interfaceC0524e : null;
        InterfaceC5647k interfaceC5647k = AbstractC0526g.a.f3693d;
        c10587a.getClass();
        int i10 = AbstractC0526g.a.f3692c;
        LayoutDirection layoutDirection2 = AbstractC0526g.a.f3691b;
        AbstractC0526g.a.f3692c = this.f3680d;
        AbstractC0526g.a.f3691b = layoutDirection;
        boolean zM2065i = AbstractC0526g.a.C10587a.m2065i(c10587a, abstractC6164s);
        this.f3682f.mo528n(c10587a);
        if (abstractC6164s != null) {
            abstractC6164s.f35994f = zM2065i;
        }
        AbstractC0526g.a.f3692c = i10;
        AbstractC0526g.a.f3691b = layoutDirection2;
        AbstractC0526g.a.f3693d = interfaceC5647k;
    }
}
