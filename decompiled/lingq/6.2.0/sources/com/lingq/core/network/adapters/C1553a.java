package com.lingq.core.network.adapters;

import com.lingq.core.domain.model.repo.NetworkErrorType;
import java.io.IOException;
import kotlin.Triple;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.ak6;
import p000.am0;
import p000.h0a;
import p000.i88;
import p000.j88;
import p000.m88;
import p000.ok6;
import p000.rm5;
import p000.sm5;
import p000.ul0;
import p000.xfa;
import p000.xj6;
import p000.y38;
import p000.yj6;
import p000.zj6;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.lingq.core.network.adapters.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1553a implements am0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ am0 f20306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ok6 f20307b;

    public C1553a(am0 am0Var, ok6 ok6Var) {
        this.f20306a = am0Var;
        this.f20307b = ok6Var;
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: l */
    public final void mo553l(ul0 ul0Var, i88 i88Var) {
        NetworkResponse.Error error;
        NetworkResponse success;
        j88 j88Var = i88Var.f43689a;
        int i = j88Var.f45204d;
        boolean z = j88Var.f45200L;
        ok6 ok6Var = this.f20307b;
        if (z) {
            Object obj = i88Var.f43690b;
            if (obj != null) {
                success = new NetworkResponse.Success(obj);
            } else if (ok6Var.f54495b.equals(xfa.class)) {
                success = new NetworkResponse.Success(xfa.f68157a);
            } else {
                error = new NetworkResponse.Error("Empty body", null, Integer.valueOf(i), null, 10, null);
            }
            this.f20306a.mo553l(ok6Var, i88.m13720c(success));
        }
        m88 m88Var = i88Var.f43691c;
        String strM16682n = m88Var != null ? m88Var.m16682n() : null;
        NetworkErrorType networkErrorTypeM21604O = AbstractC3584sr.m21604O(i);
        networkErrorTypeM21604O.getClass();
        StringBuilder sb = new StringBuilder("Http(code=");
        sb.append(i);
        sb.append(", type=");
        sb.append(networkErrorTypeM21604O);
        sb.append(", body=");
        error = new NetworkResponse.Error(AbstractC3393o1.m17738m(sb, strM16682n, ")"), null, Integer.valueOf(i), strM16682n, 2, null);
        success = error;
        this.f20306a.mo553l(ok6Var, i88.m13720c(success));
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: p */
    public final void mo554p(ul0 ul0Var, Throwable th) {
        Triple triple;
        m88 m88Var;
        String strM16682n = null;
        if (th instanceof IOException) {
            triple = new Triple(yj6.f69911a, null, null);
        } else if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            int i = httpException.f59169a;
            i88 i88Var = httpException.f59170b;
            if (i88Var != null && (m88Var = i88Var.f43691c) != null) {
                strM16682n = m88Var.m16682n();
            }
            triple = new Triple(new xj6(i, AbstractC3584sr.m21604O(i), strM16682n), Integer.valueOf(i), strM16682n);
        } else {
            rm5 rm5Var = sm5.Companion;
            String str = "NetworkResponseCall: Unexpected error - " + y38.m24933a(th.getClass()).m25414c() + ": " + th.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str, new Object[0]);
            th.printStackTrace();
            triple = new Triple(zj6.f71653a, null, null);
        }
        ak6 ak6Var = (ak6) triple.f47633a;
        this.f20306a.mo553l(this.f20307b, i88.m13720c(new NetworkResponse.Error(ak6Var + ": " + th.getMessage(), th, (Integer) triple.f47634b, (String) triple.f47635c)));
    }
}
