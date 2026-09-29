package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C2090l;

/* JADX INFO: renamed from: com.bumptech.glide.manager.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2148d implements InterfaceC2146b {

    /* JADX INFO: renamed from: a */
    public final Context f10857a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2146b.a f10858b;

    public C2148d(Context context, ComponentCallbacks2C2090l.c cVar) {
        this.f10857a = context.getApplicationContext();
        this.f10858b = cVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final void mo6252a() {
        C2160p c2160pM6379a = C2160p.m6379a(this.f10857a);
        InterfaceC2146b.a aVar = this.f10858b;
        synchronized (c2160pM6379a) {
            try {
                c2160pM6379a.f10882b.add(aVar);
                c2160pM6379a.m6380b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final void mo6253b() {
        C2160p c2160pM6379a = C2160p.m6379a(this.f10857a);
        InterfaceC2146b.a aVar = this.f10858b;
        synchronized (c2160pM6379a) {
            try {
                c2160pM6379a.f10882b.remove(aVar);
                if (c2160pM6379a.f10883c && c2160pM6379a.f10882b.isEmpty()) {
                    C2160p.c cVar = c2160pM6379a.f10881a;
                    cVar.f10888c.get().unregisterNetworkCallback(cVar.f10889d);
                    c2160pM6379a.f10883c = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: h */
    public final void mo6257h() {
    }
}
