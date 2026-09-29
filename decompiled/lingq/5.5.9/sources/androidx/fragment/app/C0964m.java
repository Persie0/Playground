package androidx.fragment.app;

import androidx.activity.result.AbstractC0203b;
import java.util.concurrent.atomic.AtomicReference;
import p035c.AbstractC1641a;

/* JADX INFO: renamed from: androidx.fragment.app.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0964m extends AbstractC0203b<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f6369a;

    public C0964m(AtomicReference atomicReference, AbstractC1641a abstractC1641a) {
        this.f6369a = atomicReference;
    }

    @Override // androidx.activity.result.AbstractC0203b
    /* JADX INFO: renamed from: a */
    public final void mo844a(Object obj) {
        AbstractC0203b abstractC0203b = (AbstractC0203b) this.f6369a.get();
        if (abstractC0203b == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC0203b.mo844a(obj);
    }
}
