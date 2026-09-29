package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import p000.ajd;
import p000.gp0;
import p000.k3d;
import p000.keb;
import p000.wr9;
import p000.yic;

/* JADX INFO: renamed from: com.google.android.play.core.review.c */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC1076c extends keb {

    /* JADX INFO: renamed from: g */
    public final gp0 f13360g;

    /* JADX INFO: renamed from: h */
    public final wr9 f13361h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ yic f13362i;

    public BinderC1076c(yic yicVar, wr9 wr9Var) {
        gp0 gp0Var = new gp0("OnRequestInstallCallback");
        this.f13362i = yicVar;
        super(4);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f13360g = gp0Var;
        this.f13361h = wr9Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m6257u(Bundle bundle) {
        ajd ajdVar = this.f13362i.f69886a;
        if (ajdVar != null) {
            wr9 wr9Var = this.f13361h;
            synchronized (ajdVar.f740f) {
                ajdVar.f739e.remove(wr9Var);
            }
            ajdVar.m507a().post(new k3d(ajdVar, 0));
        }
        this.f13360g.m12786b("onGetLaunchReviewFlowInfo", new Object[0]);
        this.f13361h.m24140d(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
