package com.lingq.feature.chat;

import p000.jv0;
import p000.t31;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.chat.j */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2006j implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f25255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un1 f25256c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f25257d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t31 f25258e;

    public /* synthetic */ C2006j(jv0 jv0Var, un1 un1Var, t66 t66Var, t31 t31Var, int i) {
        this.f25254a = i;
        this.f25255b = jv0Var;
        this.f25256c = un1Var;
        this.f25257d = t66Var;
        this.f25258e = t31Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f25254a;
        xfa xfaVar = xfa.f68157a;
        t31 t31Var = this.f25258e;
        t66 t66Var = this.f25257d;
        un1 un1Var = this.f25256c;
        jv0 jv0Var = this.f25255b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                t66Var.setValue(Boolean.FALSE);
                jv0Var.mo8867A();
                wfb.m23926u(un1Var, null, null, new ChatSessionScreenKt$ChatMessageTutorItem$1$1$1(t31Var, str, null), 3);
                break;
            default:
                str.getClass();
                t66Var.setValue(Boolean.FALSE);
                jv0Var.mo8867A();
                wfb.m23926u(un1Var, null, null, new ChatSessionScreenKt$ChatMessageUserItem$1$1$1(t31Var, str, null), 3);
                break;
        }
        return xfaVar;
    }
}
