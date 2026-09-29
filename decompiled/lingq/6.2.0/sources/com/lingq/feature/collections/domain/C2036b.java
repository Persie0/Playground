package com.lingq.feature.collections.domain;

import p000.cd4;
import p000.eh0;
import p000.fj2;
import p000.nn1;
import p000.un1;
import p000.wfb;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.collections.domain.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2036b implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2037c f25639a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f25640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25641c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25642d;

    public /* synthetic */ C2036b(C2037c c2037c, int i, String str, String str2) {
        this.f25639a = c2037c;
        this.f25640b = i;
        this.f25641c = str;
        this.f25642d = str2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        cd4 cd4Var = (cd4) obj2;
        ((String) obj).getClass();
        if (cd4Var != null && cd4Var.mo4538b()) {
            return cd4Var;
        }
        C2037c c2037c = this.f25639a;
        un1 un1Var = c2037c.f25649f;
        nn1 nn1Var = c2037c.f25650g;
        int i = this.f25640b;
        return wfb.m23926u(un1Var, eh0.m11113J(nn1Var, new fj2(i)), null, new DownloadCollectionCourseUseCase$invoke$1$1(c2037c, this.f25641c, i, this.f25642d, null), 2);
    }
}
