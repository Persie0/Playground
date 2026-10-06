package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: fb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0177fb {

    /* JADX INFO: renamed from: a */
    final int f21170a;

    /* JADX INFO: renamed from: b */
    int f21171b;

    /* JADX INFO: renamed from: c */
    int f21172c;

    /* JADX INFO: renamed from: d */
    int f21173d;

    /* JADX INFO: renamed from: e */
    ViewGroup f21174e;

    /* JADX INFO: renamed from: f */
    View f21175f;

    /* JADX INFO: renamed from: g */
    View f21176g;

    /* JADX INFO: renamed from: h */
    public C0225gw f21177h;

    /* JADX INFO: renamed from: i */
    C0221gs f21178i;

    /* JADX INFO: renamed from: j */
    Context f21179j;

    /* JADX INFO: renamed from: k */
    boolean f21180k;

    /* JADX INFO: renamed from: l */
    boolean f21181l;

    /* JADX INFO: renamed from: m */
    boolean f21182m;

    /* JADX INFO: renamed from: n */
    boolean f21183n = false;

    /* JADX INFO: renamed from: o */
    boolean f21184o;

    /* JADX INFO: renamed from: p */
    Bundle f21185p;

    public C0177fb(int i) {
        this.f21170a = i;
    }

    /* JADX INFO: renamed from: a */
    final void m8090a(C0225gw c0225gw) {
        C0221gs c0221gs;
        C0225gw c0225gw2 = this.f21177h;
        if (c0225gw == c0225gw2) {
            return;
        }
        if (c0225gw2 != null) {
            c0225gw2.m9833m(this.f21178i);
        }
        this.f21177h = c0225gw;
        if (c0225gw == null || (c0221gs = this.f21178i) == null) {
            return;
        }
        c0225gw.m9827g(c0221gs);
    }
}
