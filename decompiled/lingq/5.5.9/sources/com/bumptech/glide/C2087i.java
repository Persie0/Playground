package com.bumptech.glide;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import p132g6.AbstractC5702a;
import p258m6.InterfaceC7487g;

/* JADX INFO: renamed from: com.bumptech.glide.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2087i implements InterfaceC7487g<Registry> {

    /* JADX INFO: renamed from: a */
    public boolean f10570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C2080b f10571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f10572c;

    public C2087i(ComponentCallbacks2C2080b componentCallbacks2C2080b, ArrayList arrayList, AbstractC5702a abstractC5702a) {
        this.f10571b = componentCallbacks2C2080b;
        this.f10572c = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p258m6.InterfaceC7487g
    public final Registry get() {
        if (this.f10570a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f10570a = true;
        try {
            Registry registryM6241a = C2088j.m6241a(this.f10571b, this.f10572c);
            this.f10570a = false;
            Trace.endSection();
            return registryM6241a;
        } catch (Throwable th2) {
            this.f10570a = false;
            Trace.endSection();
            throw th2;
        }
    }
}
