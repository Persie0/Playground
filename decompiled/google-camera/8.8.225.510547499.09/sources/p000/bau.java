package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bau implements bal {

    /* JADX INFO: renamed from: a */
    public final bbh f2882a;

    /* JADX INFO: renamed from: b */
    public final List f2883b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f2884c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Object f2885d;

    /* JADX INFO: renamed from: e */
    public bat f2886e;

    public bau(bbh bbhVar) {
        this.f2882a = bbhVar;
    }

    @Override // p000.bal
    /* JADX INFO: renamed from: a */
    public final void mo2165a(Object obj) {
        this.f2885d = obj;
        m2172e(this.f2886e, obj);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo2169b(bcv bcvVar);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2170c(Object obj);

    /* JADX INFO: renamed from: d */
    public final void m2171d(bat batVar) {
        if (this.f2886e != batVar) {
            this.f2886e = batVar;
            m2172e(batVar, this.f2885d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2172e(bat batVar, Object obj) {
        if (this.f2883b.isEmpty() || batVar == null) {
            return;
        }
        if (obj == null || mo2170c(obj)) {
            List list = this.f2883b;
            synchronized (((bap) batVar).f2879b) {
                ban banVar = ((bap) batVar).f2878a;
                if (banVar != null) {
                    banVar.mo1721f(list);
                }
            }
            return;
        }
        List list2 = this.f2883b;
        synchronized (((bap) batVar).f2879b) {
            ArrayList<bcv> arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((bap) batVar).m2168c(((bcv) obj2).f2964a)) {
                    arrayList.add(obj2);
                }
            }
            for (bcv bcvVar : arrayList) {
                ayc.m2099a();
                int i = baq.f2881a;
                StringBuilder sb = new StringBuilder();
                sb.append("Constraints met for ");
                sb.append(bcvVar);
            }
            ban banVar2 = ((bap) batVar).f2878a;
            if (banVar2 != null) {
                banVar2.mo1720e(arrayList);
            }
        }
    }
}
