package com.lingq.feature.reader.content.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3139j9;
import p000.c18;
import p000.n23;
import p000.o23;
import p000.qx8;
import p000.un1;
import p000.wfb;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.state.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2266c {

    /* JADX INFO: renamed from: a */
    public final C3139j9 f28145a;

    /* JADX INFO: renamed from: b */
    public final n23 f28146b;

    /* JADX INFO: renamed from: c */
    public final o23 f28147c;

    /* JADX INFO: renamed from: d */
    public final un1 f28148d;

    /* JADX INFO: renamed from: e */
    public final C3244l f28149e;

    /* JADX INFO: renamed from: f */
    public final c18 f28150f;

    /* JADX INFO: renamed from: g */
    public String f28151g;

    /* JADX INFO: renamed from: h */
    public String f28152h;

    /* JADX INFO: renamed from: i */
    public int f28153i;

    public C2266c(C3139j9 c3139j9, n23 n23Var, o23 o23Var, un1 un1Var) {
        un1Var.getClass();
        this.f28145a = c3139j9;
        this.f28146b = n23Var;
        this.f28147c = o23Var;
        this.f28148d = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f28149e = c3244lM17114d;
        this.f28150f = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, AbstractC3194a.m15360M());
        this.f28151g = "";
        this.f28152h = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m9272a(int i) {
        wfb.m23926u(this.f28148d, null, null, new ReaderSentenceTranslationStateHolder$fetchTranslation$1(this, i, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9273b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (this.f28153i != 0) {
                wfb.m23926u(this.f28148d, null, null, new ReaderSentenceTranslationStateHolder$prefetchNotes$1(this, iIntValue, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9274c(int i) {
        Object value;
        Map map;
        qx8 qx8Var;
        C3244l c3244l = this.f28149e;
        qx8 qx8Var2 = (qx8) ((Map) c3244l.getValue()).get(Integer.valueOf(i));
        if ((qx8Var2 != null ? qx8Var2.f58342c : null) == null) {
            if (qx8Var2 == null || !qx8Var2.f58341b) {
                do {
                    value = c3244l.getValue();
                    map = (Map) value;
                    qx8Var = (qx8) map.get(Integer.valueOf(i));
                    if (qx8Var == null) {
                        qx8Var = new qx8();
                    }
                } while (!c3244l.m15570h(value, AbstractC3194a.m15368U(map, new Pair(Integer.valueOf(i), qx8.m20194a(qx8Var, false, true, null, null, null, false, 53)))));
                wfb.m23926u(this.f28148d, null, null, new ReaderSentenceTranslationStateHolder$prefetchTranslation$2(this, i, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9275d(int i) {
        Object value;
        Map map;
        qx8 qx8Var;
        Object value2;
        Map map2;
        qx8 qx8Var2;
        C3244l c3244l = this.f28149e;
        qx8 qx8Var3 = (qx8) ((Map) c3244l.getValue()).get(Integer.valueOf(i));
        if ((qx8Var3 != null ? qx8Var3.f58342c : null) != null) {
            do {
                value2 = c3244l.getValue();
                map2 = (Map) value2;
                qx8Var2 = (qx8) map2.get(Integer.valueOf(i));
                if (qx8Var2 == null) {
                    qx8Var2 = new qx8();
                }
            } while (!c3244l.m15570h(value2, AbstractC3194a.m15368U(map2, new Pair(Integer.valueOf(i), qx8.m20194a(qx8Var2, true, false, null, null, null, false, 62)))));
            return;
        }
        do {
            value = c3244l.getValue();
            map = (Map) value;
            qx8Var = (qx8) map.get(Integer.valueOf(i));
            if (qx8Var == null) {
                qx8Var = new qx8();
            }
        } while (!c3244l.m15570h(value, AbstractC3194a.m15368U(map, new Pair(Integer.valueOf(i), qx8.m20194a(qx8Var, true, true, null, null, null, false, 52)))));
        wfb.m23926u(this.f28148d, null, null, new ReaderSentenceTranslationStateHolder$showTranslation$3(this, i, null), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m9276e(int i) {
        Object value;
        Map map;
        qx8 qx8Var;
        C3244l c3244l = this.f28149e;
        qx8 qx8Var2 = (qx8) ((Map) c3244l.getValue()).get(Integer.valueOf(i));
        if (qx8Var2 == null || !qx8Var2.f58340a) {
            m9275d(i);
            return;
        }
        do {
            value = c3244l.getValue();
            map = (Map) value;
            qx8Var = (qx8) map.get(Integer.valueOf(i));
            if (qx8Var == null) {
                qx8Var = new qx8();
            }
        } while (!c3244l.m15570h(value, AbstractC3194a.m15368U(map, new Pair(Integer.valueOf(i), qx8.m20194a(qx8Var, false, false, null, null, null, false, 62)))));
    }
}
