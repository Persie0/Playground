package com.lingq.feature.reader.content.domain;

import com.lingq.core.datastore.C1368a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c83;
import p000.nl3;
import p000.si7;
import p000.wz0;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2262a {

    /* JADX INFO: renamed from: a */
    public final si7 f27980a;

    /* JADX INFO: renamed from: b */
    public final nl3 f27981b;

    /* JADX INFO: renamed from: c */
    public final C3244l f27982c;

    /* JADX INFO: renamed from: d */
    public final C3244l f27983d;

    /* JADX INFO: renamed from: e */
    public final C3244l f27984e;

    public C2262a(si7 si7Var, nl3 nl3Var) {
        si7Var.getClass();
        this.f27980a = si7Var;
        this.f27981b = nl3Var;
        this.f27982c = AbstractC3352my.m17114d(EmptyList.f47638a);
        this.f27983d = AbstractC3352my.m17114d(Boolean.FALSE);
        this.f27984e = AbstractC3352my.m17114d("");
    }

    /* JADX INFO: renamed from: a */
    public final wz0 m9256a() {
        c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3224d.m15521C(this.f27984e, new C2261x65517561(null, this)));
        C1368a c1368a = (C1368a) this.f27980a;
        return new wz0(15, AbstractC3224d.m15530i(this.f27982c, this.f27983d, c83VarM15536o, AbstractC3224d.m15536o(c1368a.f18385X0), AbstractC3224d.m15536o(c1368a.f18332D0), new LessonTextProvider$observeLessonTextData$baseInputsFlow$2(null)), this);
    }

    /* JADX INFO: renamed from: b */
    public final void m9257b(List list) {
        list.getClass();
        C3244l c3244l = this.f27982c;
        c3244l.getClass();
        c3244l.m15572j(null, list);
    }
}
