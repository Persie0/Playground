package androidx.lifecycle;

import java.util.List;
import p000.aki;
import p000.akk;
import p000.akq;
import p000.akt;
import p000.akv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ReflectiveGenericLifecycleObserver implements akt {

    /* JADX INFO: renamed from: a */
    private final Object f1521a;

    /* JADX INFO: renamed from: b */
    private final aki f1522b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1521a = obj;
        this.f1522b = akk.f589a.m866b(obj.getClass());
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        aki akiVar = this.f1522b;
        Object obj = this.f1521a;
        aki.m863a((List) akiVar.f585a.get(akqVar), akvVar, akqVar, obj);
        aki.m863a((List) akiVar.f585a.get(akq.ON_ANY), akvVar, akqVar, obj);
    }
}
