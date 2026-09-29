package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import com.bumptech.glide.load.data.InterfaceC2098e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p258m6.C7488h;
import p356r5.InterfaceC8731a;
import p356r5.InterfaceC8732b;
import p392t5.C9197c;
import p392t5.C9198d;
import p392t5.C9210p;
import p429v5.InterfaceC9645a;
import p474x5.InterfaceC10090o;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2123i implements InterfaceC2117c, InterfaceC2117c.a {

    /* JADX INFO: renamed from: a */
    public final C2118d<?> f10790a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2117c.a f10791b;

    /* JADX INFO: renamed from: c */
    public volatile int f10792c;

    /* JADX INFO: renamed from: d */
    public volatile C2116b f10793d;

    /* JADX INFO: renamed from: e */
    public volatile Object f10794e;

    /* JADX INFO: renamed from: f */
    public volatile InterfaceC10090o.a<?> f10795f;

    /* JADX INFO: renamed from: g */
    public volatile C9197c f10796g;

    public C2123i(C2118d<?> c2118d, InterfaceC2117c.a aVar) {
        this.f10790a = c2118d;
        this.f10791b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c
    /* JADX INFO: renamed from: a */
    public final boolean mo6307a() {
        if (this.f10794e != null) {
            Object obj = this.f10794e;
            this.f10794e = null;
            try {
                if (!m6331b(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f10793d != null && this.f10793d.mo6307a()) {
            return true;
        }
        this.f10793d = null;
        this.f10795f = null;
        boolean z10 = false;
        while (!z10) {
            if (!(this.f10792c < this.f10790a.m6309b().size())) {
                break;
            }
            ArrayList arrayListM6309b = this.f10790a.m6309b();
            int i10 = this.f10792c;
            this.f10792c = i10 + 1;
            this.f10795f = (InterfaceC10090o.a) arrayListM6309b.get(i10);
            if (this.f10795f != null) {
                if (!this.f10790a.f10712p.mo17539c(this.f10795f.f51181c.mo6274d())) {
                    if (this.f10790a.m6310c(this.f10795f.f51181c.mo6269a()) != null) {
                    }
                }
                this.f10795f.f51181c.mo6275e(this.f10790a.f10711o, new C9210p(this, this.f10795f));
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6331b(Object obj) throws Throwable {
        int i10 = C7488h.f41373b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        try {
            InterfaceC2098e interfaceC2098eM6232f = this.f10790a.f10699c.m6240a().m6232f(obj);
            Object objMo4883a = interfaceC2098eM6232f.mo4883a();
            InterfaceC8731a<X> interfaceC8731aM6312e = this.f10790a.m6312e(objMo4883a);
            C9198d c9198d = new C9198d(interfaceC8731aM6312e, objMo4883a, this.f10790a.f10705i);
            InterfaceC8732b interfaceC8732b = this.f10795f.f51179a;
            C2118d<?> c2118d = this.f10790a;
            C9197c c9197c = new C9197c(interfaceC8732b, c2118d.f10710n);
            InterfaceC9645a interfaceC9645aM6321a = ((C2119e.c) c2118d.f10704h).m6321a();
            interfaceC9645aM6321a.mo16804d(c9197c, c9198d);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c9197c + ", data: " + obj + ", encoder: " + interfaceC8731aM6312e + ", duration: " + C7488h.m14872a(jElapsedRealtimeNanos));
            }
            if (interfaceC9645aM6321a.mo16806f(c9197c) != null) {
                this.f10796g = c9197c;
                this.f10793d = new C2116b(Collections.singletonList(this.f10795f.f51179a), this.f10790a, this);
                this.f10795f.f51181c.mo6272b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f10796g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f10791b.mo6284i(this.f10795f.f51179a, interfaceC2098eM6232f.mo4883a(), this.f10795f.f51181c, this.f10795f.f51181c.mo6274d(), this.f10795f.f51179a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    this.f10795f.f51181c.mo6272b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c
    public final void cancel() {
        InterfaceC10090o.a<?> aVar = this.f10795f;
        if (aVar != null) {
            aVar.f51181c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c.a
    /* JADX INFO: renamed from: f */
    public final void mo6282f(InterfaceC8732b interfaceC8732b, Exception exc, InterfaceC2097d<?> interfaceC2097d, DataSource dataSource) {
        this.f10791b.mo6282f(interfaceC8732b, exc, interfaceC2097d, this.f10795f.f51181c.mo6274d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c.a
    /* JADX INFO: renamed from: g */
    public final void mo6283g() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c.a
    /* JADX INFO: renamed from: i */
    public final void mo6284i(InterfaceC8732b interfaceC8732b, Object obj, InterfaceC2097d<?> interfaceC2097d, DataSource dataSource, InterfaceC8732b interfaceC8732b2) {
        this.f10791b.mo6284i(interfaceC8732b, obj, interfaceC2097d, this.f10795f.f51181c.mo6274d(), interfaceC8732b);
    }
}
