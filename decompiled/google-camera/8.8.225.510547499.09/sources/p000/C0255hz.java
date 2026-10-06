package p000;

import android.view.View;

/* JADX INFO: renamed from: hz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0255hz extends AbstractViewOnTouchListenerC0777kq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0257ia f30003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0255hz(C0257ia c0257ia, View view) {
        super(view);
        this.f30003a = c0257ia;
    }

    @Override // p000.AbstractViewOnTouchListenerC0777kq
    /* JADX INFO: renamed from: a */
    public final InterfaceC0243hn mo9397a() {
        C0258ib c0258ib = this.f30003a.f30115a.f30284i;
        if (c0258ib == null) {
            return null;
        }
        return c0258ib.m10274a();
    }

    @Override // p000.AbstractViewOnTouchListenerC0777kq
    /* JADX INFO: renamed from: b */
    public final boolean mo9398b() {
        this.f30003a.f30115a.m11038m();
        return true;
    }

    @Override // p000.AbstractViewOnTouchListenerC0777kq
    /* JADX INFO: renamed from: c */
    public final boolean mo10889c() {
        C0259ic c0259ic = this.f30003a.f30115a;
        if (c0259ic.f30286k != null) {
            return false;
        }
        c0259ic.m11036k();
        return true;
    }
}
