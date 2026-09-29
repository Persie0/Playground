package com.lingq.core.settings.notifications;

import com.lingq.core.data.repository.C1293i;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3513qw;
import p000.c18;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.t23;
import p000.vj6;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.xu8;
import p000.xz8;
import p000.yn6;

/* JADX INFO: renamed from: com.lingq.core.settings.notifications.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1876b extends wta {

    /* JADX INFO: renamed from: b */
    public final xz8 f23010b;

    /* JADX INFO: renamed from: c */
    public final vj6 f23011c;

    /* JADX INFO: renamed from: d */
    public final xz8 f23012d;

    /* JADX INFO: renamed from: e */
    public final t23 f23013e;

    /* JADX INFO: renamed from: f */
    public final nn1 f23014f;

    /* JADX INFO: renamed from: g */
    public final String f23015g;

    /* JADX INFO: renamed from: h */
    public final String f23016h;

    /* JADX INFO: renamed from: i */
    public final C3244l f23017i;

    /* JADX INFO: renamed from: j */
    public final c18 f23018j;

    public C1876b(t23 t23Var, xz8 xz8Var, vj6 vj6Var, xz8 xz8Var2, t23 t23Var2, nn1 nn1Var, nl8 nl8Var) {
        nl8Var.getClass();
        this.f23010b = xz8Var;
        this.f23011c = vj6Var;
        this.f23012d = xz8Var2;
        this.f23013e = t23Var2;
        this.f23014f = nn1Var;
        String str = (String) nl8Var.m17488b("languageCode");
        str = str == null ? "" : str;
        this.f23015g = str;
        String str2 = (String) nl8Var.m17488b("title");
        String str3 = str2 == null ? "" : str2;
        this.f23016h = str3;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new xu8(null, null, false, 15));
        this.f23017i = c3244lM17114d;
        this.f23018j = AbstractC3224d.m15520B(new C3228h(new C3513qw(((C1293i) t23Var.f61764a).m7215l(str), 11), c3244lM17114d, new NotificationsDailyLingqsViewModel$state$1(this, null)), lda.m16103C(this), xi9.f68262a, new yn6(str3, null, false, false, new xu8(null, null, false, 15)));
        wfb.m23926u(lda.m16103C(this), null, null, new NotificationsDailyLingqsViewModel$1(this, null), 3);
    }
}
