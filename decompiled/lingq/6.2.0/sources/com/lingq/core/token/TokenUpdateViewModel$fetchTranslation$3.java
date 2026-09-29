package com.lingq.core.token;

import com.lingq.core.data.repository.C1306v;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.f5a;
import p000.un1;
import p000.vqb;
import p000.vz1;
import p000.w3a;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$fetchTranslation$3", m4291f = "TokenUpdateViewModel.kt", m4292l = {872, 880}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$fetchTranslation$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public cd4 f23590a;

    /* JADX INFO: renamed from: b */
    public int f23591b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23592c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1909e f23593d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23594e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f23595f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23596g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$fetchTranslation$3(C1909e c1909e, String str, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.f23593d = c1909e;
        this.f23594e = str;
        this.f23595f = str2;
        this.f23596g = str3;
        this.f23597h = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$fetchTranslation$3 tokenUpdateViewModel$fetchTranslation$3 = new TokenUpdateViewModel$fetchTranslation$3(this.f23593d, this.f23594e, this.f23595f, this.f23596g, this.f23597h, continuation);
        tokenUpdateViewModel$fetchTranslation$3.f23592c = obj;
        return tokenUpdateViewModel$fetchTranslation$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$fetchTranslation$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[Catch: Exception -> 0x0129, LOOP:0: B:35:0x00a2->B:58:?, LOOP_START, TryCatch #2 {Exception -> 0x0129, blocks: (B:7:0x0022, B:33:0x009d, B:35:0x00a2, B:37:0x00af, B:21:0x0069), top: B:53:0x001a }] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r0 == r10) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.lingq.core.token.e] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cd4] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25, types: [cd4] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        cd4 cd4VarM23926u;
        Object objM7380f;
        cd4 cd4Var;
        boolean zBooleanValue;
        Object objM7380f2;
        boolean z;
        Object value3;
        Object value4;
        ?? r0 = this.f23593d;
        C3244l c3244l = r0.f23885W;
        C3244l c3244l2 = r0.f23881S;
        vqb vqbVar = r0.f23891e;
        un1 un1Var = (un1) this.f23592c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23591b;
        String str = this.f23596g;
        String str2 = this.f23595f;
        try {
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    cd4VarM23926u = wfb.m23926u(un1Var, null, null, new TokenUpdateViewModel$fetchTranslation$3$timeoutJob$1(r0, null), 3);
                    try {
                        String str3 = this.f23594e;
                        String str4 = this.f23597h;
                        this.f23592c = un1Var;
                        this.f23590a = cd4VarM23926u;
                        this.f23591b = 1;
                        objM7380f = ((C1306v) ((w3a) vqbVar.f65802b)).m7380f(str3, str2, str, str4, this);
                        if (objM7380f == coroutineSingletons) {
                        }
                    } catch (Exception unused) {
                        cd4Var = cd4VarM23926u;
                        vz1.m23597A(un1Var);
                        cd4VarM23926u = cd4Var;
                        zBooleanValue = false;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    cd4Var = this.f23590a;
                    try {
                        AbstractC3193b.m15359b(obj);
                        cd4VarM23926u = cd4Var;
                        objM7380f = obj;
                    } catch (Exception unused2) {
                        vz1.m23597A(un1Var);
                        cd4VarM23926u = cd4Var;
                        zBooleanValue = false;
                    }
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cd4 cd4Var2 = this.f23590a;
                    AbstractC3193b.m15359b(obj);
                    cd4VarM23926u = cd4Var2;
                    objM7380f2 = obj;
                }
                zBooleanValue = ((Boolean) objM7380f2).booleanValue();
                vz1.m23597A(un1Var);
                z = zBooleanValue;
                r0 = cd4VarM23926u;
                r0.mo4537a(null);
                if (!z) {
                    do {
                        value3 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value3, null));
                    do {
                        value4 = c3244l.getValue();
                    } while (!c3244l.m15570h(value4, f5a.m11558a((f5a) value4, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, true, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097127)));
                }
                return xfa.f68157a;
                vz1.m23597A(un1Var);
                if (zBooleanValue || this.f23597h == null) {
                    z = zBooleanValue;
                    r0 = cd4VarM23926u;
                    r0.mo4537a(null);
                    if (!z) {
                        do {
                            value3 = c3244l2.getValue();
                        } while (!c3244l2.m15570h(value3, null));
                        do {
                            value4 = c3244l.getValue();
                        } while (!c3244l.m15570h(value4, f5a.m11558a((f5a) value4, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, true, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097127)));
                    }
                } else {
                    String str5 = this.f23594e;
                    this.f23592c = un1Var;
                    this.f23590a = cd4VarM23926u;
                    this.f23591b = 2;
                    objM7380f2 = ((C1306v) ((w3a) vqbVar.f65802b)).m7380f(str5, str2, str, null, this);
                }
            } catch (Exception unused3) {
                r0 = cd4VarM23926u;
                vz1.m23597A(un1Var);
                r0.mo4537a(null);
                do {
                    value = c3244l2.getValue();
                } while (!c3244l2.m15570h(value, null));
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, f5a.m11558a((f5a) value2, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, true, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097127)));
            }
            zBooleanValue = ((Boolean) objM7380f).booleanValue();
        } catch (Exception unused4) {
        }
        return xfa.f68157a;
    }
}
