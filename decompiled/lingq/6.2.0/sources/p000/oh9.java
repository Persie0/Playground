package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oh9 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final cd9 f54355a;

    /* JADX INFO: renamed from: b */
    public final Iterator f54356b;

    /* JADX INFO: renamed from: c */
    public int f54357c;

    /* JADX INFO: renamed from: d */
    public Map.Entry f54358d;

    /* JADX INFO: renamed from: e */
    public Map.Entry f54359e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f54360f;

    public oh9(cd9 cd9Var, Iterator it, int i) {
        this.f54360f = i;
        this.f54355a = cd9Var;
        this.f54356b = it;
        this.f54357c = cd9Var.m4547b().f8393d;
        m17994a();
    }

    /* JADX INFO: renamed from: a */
    public final void m17994a() {
        this.f54358d = this.f54359e;
        Iterator it = this.f54356b;
        this.f54359e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f54359e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f54360f) {
            case 0:
                m17994a();
                if (this.f54358d != null) {
                    return new nh9(this);
                }
                uk9.m22770c();
                return null;
            case 1:
                Map.Entry entry = this.f54359e;
                if (entry != null) {
                    m17994a();
                    return entry.getKey();
                }
                uk9.m22770c();
                return null;
            default:
                Map.Entry entry2 = this.f54359e;
                if (entry2 != null) {
                    m17994a();
                    return entry2.getValue();
                }
                uk9.m22770c();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        cd9 cd9Var = this.f54355a;
        if (cd9Var.m4547b().f8393d != this.f54357c) {
            C3386nv.m17619e();
            return;
        }
        Map.Entry entry = this.f54358d;
        if (entry == null) {
            uk9.m22770c();
            return;
        }
        cd9Var.remove(entry.getKey());
        this.f54358d = null;
        this.f54357c = cd9Var.m4547b().f8393d;
    }
}
