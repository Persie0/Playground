package androidx.fragment.app;

import androidx.activity.result.AbstractC0207f;
import androidx.activity.result.InterfaceC0202a;
import java.util.concurrent.atomic.AtomicReference;
import p035c.AbstractC1641a;
import p251m.InterfaceC7449a;

/* JADX INFO: renamed from: androidx.fragment.app.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0968o extends Fragment.AbstractC0913d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7449a f6374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f6375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1641a f6376c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0202a f6377d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Fragment f6378e;

    public C0968o(Fragment fragment, C0966n c0966n, AtomicReference atomicReference, AbstractC1641a abstractC1641a, InterfaceC0202a interfaceC0202a) {
        this.f6378e = fragment;
        this.f6374a = c0966n;
        this.f6375b = atomicReference;
        this.f6376c = abstractC1641a;
        this.f6377d = interfaceC0202a;
    }

    @Override // androidx.fragment.app.Fragment.AbstractC0913d
    /* JADX INFO: renamed from: a */
    public final void mo3606a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        Fragment fragment = this.f6378e;
        sb2.append(fragment.f6099f);
        sb2.append("_rq#");
        sb2.append(fragment.f6118r0.getAndIncrement());
        this.f6375b.set(((AbstractC0207f) this.f6374a.apply(null)).m867c(sb2.toString(), fragment, this.f6376c, this.f6377d));
    }
}
