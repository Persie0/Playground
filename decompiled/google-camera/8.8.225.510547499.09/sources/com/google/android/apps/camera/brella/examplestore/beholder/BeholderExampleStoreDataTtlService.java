package com.google.android.apps.camera.brella.examplestore.beholder;

import java.util.concurrent.ExecutorService;
import p000.ceg;
import p000.cnc;
import p000.cnd;
import p000.cni;
import p000.cof;
import p000.cot;
import p000.emv;
import p000.had;
import p000.nod;
import p000.npm;
import p000.nps;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BeholderExampleStoreDataTtlService extends cni {

    /* JADX INFO: renamed from: a */
    public had f6566a;

    /* JADX INFO: renamed from: b */
    public cof f6567b;

    /* JADX INFO: renamed from: c */
    public cot f6568c;

    /* JADX INFO: renamed from: d */
    public ExecutorService f6569d;

    /* JADX INFO: renamed from: a */
    public final synchronized cof m4066a() {
        return this.f6567b;
    }

    /* JADX INFO: renamed from: b */
    protected final synchronized had m4067b() {
        return this.f6566a;
    }

    @Override // p000.cni
    /* JADX INFO: renamed from: c */
    public final nps mo3983c() {
        return nod.m17554j(npm.m17611q(nod.m17554j(npm.m17611q(m4066a().mo4001g()), new cnc(this, 0), this.f6569d)), new cnc(this, 1), this.f6569d);
    }

    @Override // p000.cni
    /* JADX INFO: renamed from: d */
    public final nps mo3984d() {
        return nod.m17553i(npm.m17611q(m4066a().mo4005k()), new ceg(m4067b(), 3), this.f6569d);
    }

    @Override // p000.cni
    /* JADX INFO: renamed from: e */
    protected final ExecutorService mo3985e() {
        return this.f6569d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Object applicationContext = getApplicationContext();
        applicationContext.getClass();
        ((cnd) ((emv) applicationContext).mo4193e(cnd.class)).mo3978c(this);
    }
}
