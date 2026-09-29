package com.amplitude.android;

import android.content.Context;
import com.amplitude.android.utilities.C0899a;
import com.amplitude.core.ServerZone;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.dj9;
import p000.g9c;
import p000.ho5;
import p000.j92;
import p000.s46;
import p000.u91;
import p000.v84;
import p000.vi3;
import p000.x8a;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0880b {

    /* JADX INFO: renamed from: a */
    public final String f10788a;

    /* JADX INFO: renamed from: b */
    public final Context f10789b;

    /* JADX INFO: renamed from: c */
    public final int f10790c;

    /* JADX INFO: renamed from: d */
    public final int f10791d;

    /* JADX INFO: renamed from: e */
    public final String f10792e;

    /* JADX INFO: renamed from: f */
    public final dj9 f10793f;

    /* JADX INFO: renamed from: g */
    public final C0899a f10794g;

    /* JADX INFO: renamed from: h */
    public final int f10795h;

    /* JADX INFO: renamed from: i */
    public final ServerZone f10796i;

    /* JADX INFO: renamed from: j */
    public final x8a f10797j;

    /* JADX INFO: renamed from: k */
    public final boolean f10798k;

    /* JADX INFO: renamed from: l */
    public final long f10799l;

    /* JADX INFO: renamed from: m */
    public final long f10800m;

    /* JADX INFO: renamed from: n */
    public final dj9 f10801n;

    /* JADX INFO: renamed from: o */
    public final ho5 f10802o;

    /* JADX INFO: renamed from: p */
    public final boolean f10803p;

    /* JADX INFO: renamed from: q */
    public Boolean f10804q;

    /* JADX INFO: renamed from: r */
    public final v84 f10805r;

    /* JADX INFO: renamed from: s */
    public final boolean f10806s;

    /* JADX INFO: renamed from: t */
    public final boolean f10807t;

    /* JADX INFO: renamed from: u */
    public File f10808u;

    /* JADX INFO: renamed from: v */
    public Set f10809v;

    public C0880b(Context context, String str, Set set) {
        s46 s46Var = AbstractC3584sr.f61274a;
        C0899a c0899a = new C0899a();
        ServerZone serverZone = ServerZone.US;
        x8a x8aVar = new x8a();
        x8aVar.f67936a = new HashSet();
        g9c g9cVar = AbstractC3584sr.f61276c;
        ho5 ho5Var = AbstractC3584sr.f61275b;
        Boolean bool = Boolean.FALSE;
        v84 v84Var = new v84();
        serverZone.getClass();
        set.getClass();
        this.f10788a = str;
        this.f10789b = context;
        this.f10790c = 30;
        this.f10791d = 30000;
        this.f10792e = "$default_instance";
        this.f10793f = s46Var;
        this.f10794g = c0899a;
        this.f10795h = 5;
        this.f10796i = serverZone;
        this.f10797j = x8aVar;
        this.f10798k = true;
        this.f10799l = 300000L;
        this.f10800m = 30000L;
        this.f10801n = g9cVar;
        this.f10802o = ho5Var;
        this.f10803p = true;
        this.f10804q = bool;
        this.f10805r = v84Var;
        this.f10806s = true;
        this.f10807t = true;
        this.f10809v = u91.m22626r1(set);
        new j92(true, false, false, false).f45237e.add(new vi3() { // from class: com.amplitude.android.Configuration$defaultTracking$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                j92 j92Var = (j92) obj;
                j92Var.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (j92Var.f45233a) {
                    linkedHashSet.add(AutocaptureOption.SESSIONS);
                }
                if (j92Var.f45234b) {
                    linkedHashSet.add(AutocaptureOption.APP_LIFECYCLES);
                }
                if (j92Var.f45235c) {
                    linkedHashSet.add(AutocaptureOption.DEEP_LINKS);
                }
                if (j92Var.f45236d) {
                    linkedHashSet.add(AutocaptureOption.SCREEN_VIEWS);
                }
                this.f10756b.f10809v = linkedHashSet;
                return xfa.f68157a;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final File m5061a() {
        if (this.f10808u == null) {
            Context context = this.f10789b;
            File dir = context.getDir("amplitude", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append('/');
            File file = new File(dir, AbstractC3393o1.m17738m(sb, this.f10792e, "/analytics/"));
            this.f10808u = file;
            file.mkdirs();
        }
        File file2 = this.f10808u;
        file2.getClass();
        return file2;
    }
}
