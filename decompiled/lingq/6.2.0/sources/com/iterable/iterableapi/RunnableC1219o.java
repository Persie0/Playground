package com.iterable.iterableapi;

import java.util.HashMap;
import org.json.JSONObject;
import p000.gb4;
import p000.pb4;
import p000.vb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.o */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1219o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1223s f14073a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f14074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gb4 f14075c;

    public RunnableC1219o(C1223s c1223s, String str, IterableTaskRunner$TaskResult iterableTaskRunner$TaskResult, gb4 gb4Var) {
        this.f14073a = c1223s;
        this.f14074b = str;
        this.f14075c = gb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        this.f14073a.getClass();
        HashMap map = C1223s.f14094b;
        String str = this.f14074b;
        vb4 vb4Var = (vb4) map.get(str);
        HashMap map2 = C1223s.f14095c;
        pb4 pb4Var = (pb4) map2.get(str);
        map.remove(str);
        map2.remove(str);
        gb4 gb4Var = this.f14075c;
        boolean z = gb4Var.f40488a;
        JSONObject jSONObject = gb4Var.f40491d;
        if (z) {
            if (vb4Var != null) {
                vb4Var.mo17898a(jSONObject);
            }
        } else if (pb4Var != null) {
            pb4Var.m19057a(gb4Var.f40492e, jSONObject);
        }
    }
}
