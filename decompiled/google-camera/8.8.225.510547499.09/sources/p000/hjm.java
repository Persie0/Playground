package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hjm implements hjn {

    /* JADX INFO: renamed from: a */
    public List f28054a = null;

    /* JADX INFO: renamed from: a */
    public final void m10381a(hju... hjuVarArr) {
        for (hju hjuVar : hjuVarArr) {
            hjt hjtVar = new hjt(hjuVar);
            if (this.f28054a == null) {
                this.f28054a = new ArrayList();
            }
            this.f28054a.add(hjtVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo10382b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo10383c() {
    }

    /* JADX INFO: renamed from: d */
    public void mo10384d() {
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public void mo5711f() {
        List list = this.f28054a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((hjo) it.next()).mo5711f();
            }
        }
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public void mo5712g() {
        List list = this.f28054a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((hjo) it.next()).mo5712g();
            }
        }
    }

    @Override // p000.hjn
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void mo5713h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo10385i() {
    }
}
