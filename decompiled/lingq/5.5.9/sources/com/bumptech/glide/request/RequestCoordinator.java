package com.bumptech.glide.request;

import p171i6.InterfaceC6199d;

/* JADX INFO: loaded from: classes.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z10) {
            this.isComplete = z10;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo6381a();

    /* JADX INFO: renamed from: b */
    void mo6382b(InterfaceC6199d interfaceC6199d);

    /* JADX INFO: renamed from: c */
    RequestCoordinator mo6383c();

    /* JADX INFO: renamed from: d */
    void mo6384d(InterfaceC6199d interfaceC6199d);

    /* JADX INFO: renamed from: f */
    boolean mo6385f(InterfaceC6199d interfaceC6199d);

    /* JADX INFO: renamed from: g */
    boolean mo6386g(InterfaceC6199d interfaceC6199d);

    /* JADX INFO: renamed from: h */
    boolean mo6387h(InterfaceC6199d interfaceC6199d);
}
