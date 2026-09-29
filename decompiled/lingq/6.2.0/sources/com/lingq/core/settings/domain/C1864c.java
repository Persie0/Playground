package com.lingq.core.settings.domain;

import android.content.SharedPreferences;
import com.amplitude.android.C0879a;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1371d;
import java.util.UUID;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3409oh;
import p000.C3509qs;
import p000.cc4;
import p000.cma;
import p000.e7a;
import p000.fa4;
import p000.hm5;
import p000.km7;
import p000.nm7;
import p000.qn6;
import p000.vma;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1864c {

    /* JADX INFO: renamed from: a */
    public final km7 f22923a;

    /* JADX INFO: renamed from: b */
    public final qn6 f22924b;

    /* JADX INFO: renamed from: c */
    public final vma f22925c;

    /* JADX INFO: renamed from: d */
    public final e7a f22926d;

    /* JADX INFO: renamed from: e */
    public final C3509qs f22927e;

    /* JADX INFO: renamed from: f */
    public final nm7 f22928f;

    /* JADX INFO: renamed from: g */
    public final hm5 f22929g;

    /* JADX INFO: renamed from: h */
    public final cma f22930h;

    public C1864c(km7 km7Var, qn6 qn6Var, vma vmaVar, e7a e7aVar, C3509qs c3509qs, nm7 nm7Var, hm5 hm5Var, cma cmaVar) {
        km7Var.getClass();
        qn6Var.getClass();
        vmaVar.getClass();
        e7aVar.getClass();
        c3509qs.getClass();
        nm7Var.getClass();
        hm5Var.getClass();
        cmaVar.getClass();
        this.f22923a = km7Var;
        this.f22924b = qn6Var;
        this.f22925c = vmaVar;
        this.f22926d = e7aVar;
        this.f22927e = c3509qs;
        this.f22928f = nm7Var;
        this.f22929g = hm5Var;
        this.f22930h = cmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (((com.lingq.core.datastore.C1369b) r9.f22928f).m7914a(r0) == r1) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8625a(ContinuationImpl continuationImpl) throws Throwable {
        LogoutUseCase$invoke$1 logoutUseCase$invoke$1;
        if (continuationImpl instanceof LogoutUseCase$invoke$1) {
            logoutUseCase$invoke$1 = (LogoutUseCase$invoke$1) continuationImpl;
            int i = logoutUseCase$invoke$1.f22788c;
            if ((i & Integer.MIN_VALUE) != 0) {
                logoutUseCase$invoke$1.f22788c = i - Integer.MIN_VALUE;
            } else {
                logoutUseCase$invoke$1 = new LogoutUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            logoutUseCase$invoke$1 = new LogoutUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = logoutUseCase$invoke$1.f22786a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = logoutUseCase$invoke$1.f22788c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            logoutUseCase$invoke$1.f22788c = 1;
            ((C1267a) this.f22923a).f14586c.mo2831d();
            if (xfaVar != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                logoutUseCase$invoke$1.f22788c = 3;
                if (((C1371d) this.f22925c).m7961a(logoutUseCase$invoke$1) != coroutineSingletons) {
                    this.f22926d.mo8777t0();
                    SharedPreferences.Editor editorEdit = this.f22927e.f58118b.edit();
                    editorEdit.getClass();
                    editorEdit.clear();
                    editorEdit.apply();
                    logoutUseCase$invoke$1.f22788c = 4;
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                AbstractC3193b.m15359b(obj);
                this.f22926d.mo8777t0();
                SharedPreferences.Editor editorEdit2 = this.f22927e.f58118b.edit();
                editorEdit2.getClass();
                editorEdit2.clear();
                editorEdit2.apply();
                logoutUseCase$invoke$1.f22788c = 4;
            } else {
                if (i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        cc4 cc4Var = ((C1240a) this.f22929g).f14303f;
        if (cc4Var != null) {
            C0879a c0879a = (C0879a) cc4Var.f9881a;
            c0879a.m5117k(null);
            if (c0879a.f11027l.m15504W()) {
                C3409oh c3409oh = c0879a.f10787t;
                if (c3409oh == null) {
                    fa4.m11636J("androidContextPlugin");
                    throw null;
                }
                c3409oh.m17993d(c0879a.f11016a, true);
            } else {
                c0879a.m5116j(UUID.randomUUID().toString() + 'R');
            }
        }
        this.f22930h.mo4587X();
        return xfaVar;
        logoutUseCase$invoke$1.f22788c = 2;
        if (this.f22924b.mo7003O(logoutUseCase$invoke$1) != coroutineSingletons) {
            logoutUseCase$invoke$1.f22788c = 3;
            if (((C1371d) this.f22925c).m7961a(logoutUseCase$invoke$1) != coroutineSingletons) {
                this.f22926d.mo8777t0();
                SharedPreferences.Editor editorEdit3 = this.f22927e.f58118b.edit();
                editorEdit3.getClass();
                editorEdit3.clear();
                editorEdit3.apply();
                logoutUseCase$invoke$1.f22788c = 4;
            }
        }
        return coroutineSingletons;
    }
}
