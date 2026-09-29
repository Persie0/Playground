package com.lingq.feature.reader.milestones.state;

import com.lingq.feature.reader.milestones.domain.C2269a;
import java.util.ArrayList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.h24;
import p000.nx7;
import p000.pg9;
import p000.u91;
import p000.un1;
import p000.vfd;
import p000.wfb;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.reader.milestones.state.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2272a {

    /* JADX INFO: renamed from: a */
    public final C2269a f28212a;

    /* JADX INFO: renamed from: b */
    public final un1 f28213b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f28214c;

    /* JADX INFO: renamed from: d */
    public final C3244l f28215d;

    /* JADX INFO: renamed from: e */
    public final c18 f28216e;

    /* JADX INFO: renamed from: f */
    public pg9 f28217f;

    public C2272a(C2269a c2269a, un1 un1Var) {
        un1Var.getClass();
        this.f28212a = c2269a;
        this.f28213b = un1Var;
        this.f28214c = new ArrayList();
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f28215d = c3244lM17114d;
        this.f28216e = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m9283a() {
        ArrayList arrayList = this.f28214c;
        nx7 nx7Var = (nx7) u91.m22591I0(arrayList);
        if (nx7Var == null) {
            return;
        }
        arrayList.remove(0);
        this.f28215d.m15571i(null);
        pg9 pg9Var = this.f28217f;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f28217f = null;
        wfb.m23926u(this.f28213b, null, null, new ReaderNotificationStateHolder$dismissCurrent$1(this, nx7Var, null), 3);
        m9284b();
    }

    /* JADX INFO: renamed from: b */
    public final void m9284b() {
        C3244l c3244l = this.f28215d;
        if (c3244l.getValue() == null) {
            ArrayList arrayList = this.f28214c;
            if (arrayList.isEmpty()) {
                return;
            }
            nx7 nx7Var = (nx7) u91.m22589G0(arrayList);
            h24 h24Var = nx7Var.f53363a;
            c3244l.getClass();
            c3244l.m15572j(null, h24Var);
            int iM23266a = vfd.m23266a(nx7Var.f53363a.f41695a);
            if (iM23266a > 0) {
                this.f28217f = wfb.m23926u(this.f28213b, null, null, new ReaderNotificationStateHolder$showNext$1(iM23266a, this, null), 3);
            }
        }
    }
}
