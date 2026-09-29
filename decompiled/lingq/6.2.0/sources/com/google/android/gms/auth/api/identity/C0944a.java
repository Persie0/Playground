package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import java.util.List;
import p000.lda;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0944a {

    /* JADX INFO: renamed from: a */
    public List f11569a;

    /* JADX INFO: renamed from: b */
    public String f11570b;

    /* JADX INFO: renamed from: c */
    public boolean f11571c;

    /* JADX INFO: renamed from: d */
    public boolean f11572d;

    /* JADX INFO: renamed from: e */
    public Account f11573e;

    /* JADX INFO: renamed from: f */
    public String f11574f;

    /* JADX INFO: renamed from: g */
    public String f11575g;

    /* JADX INFO: renamed from: h */
    public boolean f11576h;

    /* JADX INFO: renamed from: i */
    public Bundle f11577i;

    /* JADX INFO: renamed from: j */
    public boolean f11578j;

    /* JADX INFO: renamed from: k */
    public int f11579k;

    /* JADX INFO: renamed from: a */
    public final void m5269a(String str) {
        lda.m16130p(str);
        String str2 = this.f11570b;
        boolean z = true;
        if (str2 != null && !str2.equals(str)) {
            z = false;
        }
        lda.m16124j("two different server client ids provided", z);
    }
}
