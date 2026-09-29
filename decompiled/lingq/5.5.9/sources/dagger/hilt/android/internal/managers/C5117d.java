package dagger.hilt.android.internal.managers;

import mk.AbstractApplicationC7580c1;
import mk.C7633z0;
import nl.C7800a;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: dagger.hilt.android.internal.managers.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5117d implements InterfaceC8405b<Object> {

    /* JADX INFO: renamed from: a */
    public volatile C7633z0 f33096a;

    /* JADX INFO: renamed from: b */
    public final Object f33097b = new Object();

    /* JADX INFO: renamed from: c */
    public final InterfaceC5118e f33098c;

    public C5117d(AbstractApplicationC7580c1.a aVar) {
        this.f33098c = aVar;
    }

    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f33096a == null) {
            synchronized (this.f33097b) {
                if (this.f33096a == null) {
                    this.f33096a = new C7633z0(new C7800a(AbstractApplicationC7580c1.this));
                }
            }
        }
        return this.f33096a;
    }
}
