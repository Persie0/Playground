package p000;

import android.view.View;

/* JADX INFO: renamed from: iz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0282iz extends AbstractViewOnTouchListenerC0777kq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0740jg f32696a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0743jj f32697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0282iz(C0743jj c0743jj, View view, C0740jg c0740jg) {
        super(view);
        this.f32697b = c0743jj;
        this.f32696a = c0740jg;
    }

    @Override // p000.AbstractViewOnTouchListenerC0777kq
    /* JADX INFO: renamed from: a */
    public final InterfaceC0243hn mo9397a() {
        return this.f32696a;
    }

    @Override // p000.AbstractViewOnTouchListenerC0777kq
    /* JADX INFO: renamed from: b */
    public final boolean mo9398b() {
        if (this.f32697b.f34156b.mo12917u()) {
            return true;
        }
        this.f32697b.m13303b();
        return true;
    }
}
