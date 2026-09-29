package androidx.compose.foundation.style;

import androidx.compose.animation.core.C0059a;
import p000.AbstractC3489q9;
import p000.InterfaceC0025an;
import p000.pg9;
import p000.un1;
import p000.wfb;

/* JADX INFO: renamed from: androidx.compose.foundation.style.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0157b {

    /* JADX INFO: renamed from: a */
    public InterfaceC0025an f2742a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0025an f2743b;

    /* JADX INFO: renamed from: c */
    public final C0059a f2744c = AbstractC3489q9.m19771a(0.0f);

    /* JADX INFO: renamed from: d */
    public StyleAnimations$EntryState f2745d = StyleAnimations$EntryState.Inserted;

    /* JADX INFO: renamed from: e */
    public boolean f2746e = true;

    /* JADX INFO: renamed from: f */
    public pg9 f2747f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0158c f2748g;

    public C0157b(C0158c c0158c, InterfaceC0025an interfaceC0025an, InterfaceC0025an interfaceC0025an2) {
        this.f2748g = c0158c;
        this.f2742a = interfaceC0025an;
        this.f2743b = interfaceC0025an2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1051a(un1 un1Var) {
        this.f2746e = false;
        pg9 pg9Var = this.f2747f;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f2747f = wfb.m23926u(un1Var, null, null, new StyleAnimations$Entry$animateOut$1(this, this.f2748g, null), 3);
    }
}
