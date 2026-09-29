package p000;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class yo9 extends mq2 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f70176a;

    public yo9(zo9 zo9Var) {
        this.f70176a = new WeakReference(zo9Var);
    }

    @Override // p000.mq2
    /* JADX INFO: renamed from: a */
    public final void mo16994a() {
        zo9 zo9Var = (zo9) this.f70176a.get();
        if (zo9Var != null) {
            zo9Var.m25728c();
        }
    }

    @Override // p000.mq2
    /* JADX INFO: renamed from: b */
    public final void mo12849b() {
        zo9 zo9Var = (zo9) this.f70176a.get();
        if (zo9Var != null) {
            zo9Var.m25728c();
        }
    }
}
