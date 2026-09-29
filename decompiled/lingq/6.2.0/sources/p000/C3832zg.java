package p000;

import androidx.compose.p002ui.platform.C0390b;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: renamed from: zg */
/* JADX INFO: loaded from: classes.dex */
public final class C3832zg extends i16 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f71510b;

    public C3832zg(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        this.f71510b = viewTreeObserverOnGlobalLayoutListenerC0391c;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0390b(this.f71510b);
    }

    public final int hashCode() {
        return this.f71510b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "rootModifier";
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ void mo23o(d16 d16Var) {
    }
}
