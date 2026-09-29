package com.amplitude.core.diagnostics;

import com.amplitude.core.diagnostics.C0906b;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.od2;
import p000.pj5;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.diagnostics.DiagnosticsClientImpl$flushPreviousSessions$1", m4291f = "DiagnosticsClientImpl.kt", m4292l = {}, m4293m = "invokeSuspend")
final class DiagnosticsClientImpl$flushPreviousSessions$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0905a f11042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ double f11043b;

    /* JADX INFO: renamed from: com.amplitude.core.diagnostics.DiagnosticsClientImpl$flushPreviousSessions$1$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "com.amplitude.core.diagnostics.DiagnosticsClientImpl$flushPreviousSessions$1$1", m4291f = "DiagnosticsClientImpl.kt", m4292l = {292}, m4293m = "invokeSuspend")
    final class C09041 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f11044a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0905a f11045b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ od2 f11046c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ double f11047d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09041(C0905a c0905a, od2 od2Var, double d, Continuation continuation) {
            super(2, continuation);
            this.f11045b = c0905a;
            this.f11046c = od2Var;
            this.f11047d = d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C09041(this.f11045b, this.f11046c, this.f11047d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C09041) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f11044a;
            xfa xfaVar = xfa.f68157a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f11044a = 1;
                C0905a.m5121d(this.f11045b, this.f11046c, this.f11047d);
                return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsClientImpl$flushPreviousSessions$1(C0905a c0905a, double d, Continuation continuation) {
        super(2, continuation);
        this.f11042a = c0905a;
        this.f11043b = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiagnosticsClientImpl$flushPreviousSessions$1(this.f11042a, this.f11043b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DiagnosticsClientImpl$flushPreviousSessions$1 diagnosticsClientImpl$flushPreviousSessions$1 = (DiagnosticsClientImpl$flushPreviousSessions$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        diagnosticsClientImpl$flushPreviousSessions$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? arrayList;
        StringBuilder sb;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0905a c0905a = this.f11042a;
        final C0906b c0906b = c0905a.f11060j;
        pj5 pj5Var = c0906b.f11072c;
        File file = new File(new File(c0906b.f11070a, "com.amplitude.diagnostics"), c0906b.f11075f);
        if (file.exists() && file.isDirectory()) {
            arrayList = new ArrayList();
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: pd2
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    C0906b c0906b2 = c0906b;
                    c0906b2.getClass();
                    return file2.isDirectory() && !fa4.m11650l(file2.getName(), c0906b2.f11071b);
                }
            });
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file2 : fileArrListFiles) {
                try {
                    try {
                        file2.getClass();
                        od2 od2VarM5130d = c0906b.m5130d(file2);
                        if (od2VarM5130d != null) {
                            arrayList.add(od2VarM5130d);
                        }
                        try {
                            C0906b.m5128c(file2);
                        } catch (Exception e) {
                            e = e;
                            sb = new StringBuilder("DiagnosticsStorage: Failed to delete session directory ");
                            sb.append(file2.getName());
                            sb.append(": ");
                            sb.append(e.getMessage());
                            pj5Var.mo16255a(sb.toString());
                        }
                    } catch (Throwable th) {
                        try {
                            file2.getClass();
                            C0906b.m5128c(file2);
                            throw th;
                        } catch (Exception e2) {
                            pj5Var.mo16255a("DiagnosticsStorage: Failed to delete session directory " + file2.getName() + ": " + e2.getMessage());
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    pj5Var.mo16255a("DiagnosticsStorage: Failed to load previous session " + file2.getName() + ": " + e3.getMessage());
                    try {
                        C0906b.m5128c(file2);
                    } catch (Exception e4) {
                        e = e4;
                        sb = new StringBuilder("DiagnosticsStorage: Failed to delete session directory ");
                        sb.append(file2.getName());
                        sb.append(": ");
                        sb.append(e.getMessage());
                        pj5Var.mo16255a(sb.toString());
                    }
                }
            }
        } else {
            arrayList = EmptyList.f47638a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wfb.m23926u(c0905a.f11054d, c0905a.f11055e, null, new C09041(c0905a, (od2) it.next(), this.f11043b, null), 2);
        }
        return xfa.f68157a;
    }
}
