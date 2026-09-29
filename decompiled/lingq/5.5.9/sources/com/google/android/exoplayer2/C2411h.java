package com.google.android.exoplayer2;

import p479xa.C10154w;
import p479xa.InterfaceC10133c;
import p479xa.InterfaceC10146o;

/* JADX INFO: renamed from: com.google.android.exoplayer2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2411h implements InterfaceC10146o {

    /* JADX INFO: renamed from: a */
    public final C10154w f12258a;

    /* JADX INFO: renamed from: b */
    public final a f12259b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2536y f12260c;

    /* JADX INFO: renamed from: d */
    public InterfaceC10146o f12261d;

    /* JADX INFO: renamed from: e */
    public boolean f12262e = true;

    /* JADX INFO: renamed from: f */
    public boolean f12263f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.h$a */
    public interface a {
    }

    public C2411h(a aVar, InterfaceC10133c interfaceC10133c) {
        this.f12259b = aVar;
        this.f12258a = new C10154w(interfaceC10133c);
    }

    @Override // p479xa.InterfaceC10146o
    public final C2505u getPlaybackParameters() {
        InterfaceC10146o interfaceC10146o = this.f12261d;
        return interfaceC10146o != null ? interfaceC10146o.getPlaybackParameters() : this.f12258a.f51452e;
    }

    @Override // p479xa.InterfaceC10146o
    /* JADX INFO: renamed from: l */
    public final long mo6886l() {
        if (this.f12262e) {
            return this.f12258a.mo6886l();
        }
        InterfaceC10146o interfaceC10146o = this.f12261d;
        interfaceC10146o.getClass();
        return interfaceC10146o.mo6886l();
    }

    @Override // p479xa.InterfaceC10146o
    public final void setPlaybackParameters(C2505u c2505u) {
        InterfaceC10146o interfaceC10146o = this.f12261d;
        if (interfaceC10146o != null) {
            interfaceC10146o.setPlaybackParameters(c2505u);
            c2505u = this.f12261d.getPlaybackParameters();
        }
        this.f12258a.setPlaybackParameters(c2505u);
    }
}
