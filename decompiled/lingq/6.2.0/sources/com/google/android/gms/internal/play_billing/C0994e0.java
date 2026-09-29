package com.google.android.gms.internal.play_billing;

import p000.eld;
import p000.m6d;
import p000.pgd;
import p000.zid;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0994e0 {

    /* JADX INFO: renamed from: a */
    public Object f12180a;

    /* JADX INFO: renamed from: b */
    public zid f12181b;

    /* JADX INFO: renamed from: c */
    public eld f12182c;

    /* JADX INFO: renamed from: d */
    public boolean f12183d;

    /* JADX INFO: renamed from: a */
    public final void m5526a(Object obj) {
        this.f12183d = true;
        zid zidVar = this.f12181b;
        if (zidVar != null) {
            pgd pgdVar = zidVar.f71629b;
            pgdVar.getClass();
            if (obj == null) {
                obj = m6d.f50687g;
            }
            if (m6d.f50686f.mo13805e(pgdVar, null, obj)) {
                m6d.m16658d(pgdVar);
                this.f12180a = null;
                this.f12181b = null;
                this.f12182c = null;
            }
        }
    }

    public final void finalize() {
        eld eldVar;
        zid zidVar = this.f12181b;
        if (zidVar != null) {
            pgd pgdVar = zidVar.f71629b;
            if (!pgdVar.isDone()) {
                if (m6d.f50686f.mo13805e(pgdVar, null, new C0999j(new zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f12180a)))))) {
                    m6d.m16658d(pgdVar);
                }
            }
        }
        if (this.f12183d || (eldVar = this.f12182c) == null) {
            return;
        }
        eldVar.m11217i(null);
    }
}
