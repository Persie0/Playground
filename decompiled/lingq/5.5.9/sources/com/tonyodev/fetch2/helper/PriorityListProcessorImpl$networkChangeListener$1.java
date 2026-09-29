package com.tonyodev.fetch2.helper;

import cm.InterfaceC2041a;
import p033bl.C1614e;
import p077dl.C5200a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class PriorityListProcessorImpl$networkChangeListener$1 implements C5200a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1614e f32514a;

    public PriorityListProcessorImpl$networkChangeListener$1(C1614e c1614e) {
        this.f32514a = c1614e;
    }

    @Override // p077dl.C5200a.a
    /* JADX INFO: renamed from: a */
    public final void mo10666a() {
        this.f32514a.f9130i.m10687b(new InterfaceC2041a<C9072e>() { // from class: com.tonyodev.fetch2.helper.PriorityListProcessorImpl$networkChangeListener$1$onNetworkChanged$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                if (!this.f32515b.f32514a.f9125d && !this.f32515b.f32514a.f9124c && this.f32515b.f32514a.f9133l.m10971b() && this.f32515b.f32514a.f9126e > 500) {
                    this.f32515b.f32514a.m5271l();
                }
                return C9072e.f47360a;
            }
        });
    }
}
