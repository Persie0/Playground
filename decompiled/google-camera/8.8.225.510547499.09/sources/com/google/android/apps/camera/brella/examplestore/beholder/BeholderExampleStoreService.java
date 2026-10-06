package com.google.android.apps.camera.brella.examplestore.beholder;

import android.content.Context;
import p000.cne;
import p000.cnh;
import p000.cnj;
import p000.cnw;
import p000.cny;
import p000.cof;
import p000.emv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BeholderExampleStoreService extends cnj {

    /* JADX INFO: renamed from: a */
    public cof f6570a;

    @Override // p000.cnj
    /* JADX INFO: renamed from: a */
    protected final cnh mo3986a(Context context, cny cnyVar, cnw cnwVar) {
        return m4068b(context).mo3995a(cnyVar, cnwVar);
    }

    /* JADX INFO: renamed from: b */
    protected final synchronized cof m4068b(Context context) {
        if (this.f6570a == null) {
            ((cne) ((emv) context.getApplicationContext()).mo4193e(cne.class)).mo3979d(this);
        }
        return this.f6570a;
    }
}
