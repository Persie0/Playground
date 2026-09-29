package androidx.compose.p017ui.focus;

import cm.InterfaceC2052l;
import p351r0.C8684c;
import p351r0.InterfaceC8691j;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesImpl implements InterfaceC8691j {

    /* JADX INFO: renamed from: a */
    public boolean f3373a = true;

    /* JADX INFO: renamed from: b */
    public final FocusRequester f3374b;

    /* JADX INFO: renamed from: c */
    public final FocusRequester f3375c;

    /* JADX INFO: renamed from: d */
    public final FocusRequester f3376d;

    /* JADX INFO: renamed from: e */
    public final FocusRequester f3377e;

    /* JADX INFO: renamed from: f */
    public final FocusRequester f3378f;

    /* JADX INFO: renamed from: g */
    public final FocusRequester f3379g;

    /* JADX INFO: renamed from: h */
    public final FocusRequester f3380h;

    /* JADX INFO: renamed from: i */
    public final FocusRequester f3381i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2052l<? super C8684c, FocusRequester> f3382j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2052l<? super C8684c, FocusRequester> f3383k;

    public FocusPropertiesImpl() {
        FocusRequester focusRequester = FocusRequester.f3386b;
        FocusRequester focusRequester2 = FocusRequester.f3386b;
        this.f3374b = focusRequester2;
        this.f3375c = focusRequester2;
        this.f3376d = focusRequester2;
        this.f3377e = focusRequester2;
        this.f3378f = focusRequester2;
        this.f3379g = focusRequester2;
        this.f3380h = focusRequester2;
        this.f3381i = focusRequester2;
        this.f3382j = FocusPropertiesImpl$enter$1.f3384b;
        this.f3383k = FocusPropertiesImpl$exit$1.f3385b;
    }

    @Override // p351r0.InterfaceC8691j
    /* JADX INFO: renamed from: a */
    public final boolean mo1967a() {
        return this.f3373a;
    }

    @Override // p351r0.InterfaceC8691j
    /* JADX INFO: renamed from: b */
    public final void mo1968b(boolean z10) {
        this.f3373a = z10;
    }
}
