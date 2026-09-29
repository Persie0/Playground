package androidx.fragment.app;

import androidx.activity.result.AbstractC0207f;
import androidx.activity.result.InterfaceC0208g;
import p251m.InterfaceC7449a;
import p529z9.InterfaceC10461a;

/* JADX INFO: renamed from: androidx.fragment.app.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0966n implements InterfaceC7449a<Void, AbstractC0207f> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Fragment f6372a;

    public C0966n(Fragment fragment) {
        this.f6372a = fragment;
    }

    @Override // p251m.InterfaceC7449a
    public final AbstractC0207f apply(Void r10) {
        Fragment fragment = this.f6372a;
        InterfaceC10461a interfaceC10461a = fragment.f6078P;
        return interfaceC10461a instanceof InterfaceC0208g ? ((InterfaceC0208g) interfaceC10461a).mo793k() : fragment.m3576Y().f447k;
    }
}
