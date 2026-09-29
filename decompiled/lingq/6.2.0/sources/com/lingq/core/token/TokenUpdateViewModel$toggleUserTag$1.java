package com.lingq.core.token;

import com.lingq.core.token.domain.C1904a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.f5a;
import p000.un1;
import p000.v91;
import p000.w65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$toggleUserTag$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1504}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$toggleUserTag$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23692b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23693c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23694d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$toggleUserTag$1(C1909e c1909e, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f23692b = c1909e;
        this.f23693c = str;
        this.f23694d = str2;
        this.f23695e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$toggleUserTag$1(this.f23692b, this.f23693c, this.f23694d, this.f23695e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$toggleUserTag$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listMo8036c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23691a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1909e c1909e = this.f23692b;
            w65 w65Var = ((f5a) ((C3244l) c1909e.f23886X.f9311a).getValue()).f38474f;
            if (w65Var == null || (listMo8036c = w65Var.mo8036c()) == null) {
                listMo8036c = EmptyList.f47638a;
            }
            List list = listMo8036c;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                arrayList.add(lowerCase);
            }
            String lowerCase2 = this.f23693c.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            boolean z = !arrayList.contains(lowerCase2);
            C1904a c1904a = c1909e.f23910x;
            this.f23691a = 1;
            if (c1904a.m8712c(this.f23694d, this.f23695e, this.f23693c, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
