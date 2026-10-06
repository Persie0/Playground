package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqm {

    /* JADX INFO: renamed from: b */
    public boolean f2141b;

    /* JADX INFO: renamed from: c */
    public Bundle f2142c;

    /* JADX INFO: renamed from: d */
    public boolean f2143d;

    /* JADX INFO: renamed from: f */
    private aqj f2145f;

    /* JADX INFO: renamed from: a */
    public final C0943qu f2140a = new C0943qu();

    /* JADX INFO: renamed from: e */
    public boolean f2144e = true;

    /* JADX INFO: renamed from: a */
    public final Bundle m1858a(String str) {
        if (!this.f2143d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2142c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f2142c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2142c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2142c = null;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1859b(String str, aql aqlVar) {
        aqlVar.getClass();
        if (((aql) this.f2140a.m19359f(str, aqlVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1860c(Class cls) {
        if (!this.f2144e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        aqj aqjVar = this.f2145f;
        if (aqjVar == null) {
            aqjVar = new aqj(this);
        }
        this.f2145f = aqjVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            aqj aqjVar2 = this.f2145f;
            if (aqjVar2 != null) {
                String name = cls.getName();
                name.getClass();
                aqjVar2.f2139a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final aql m1861d() {
        Iterator it = this.f2140a.iterator();
        while (it.hasNext()) {
            Map.Entry entryM19356c = ((AbstractC0941qs) it).next();
            entryM19356c.getClass();
            C0939qq c0939qq = (C0939qq) entryM19356c;
            String str = (String) c0939qq.f47499a;
            aql aqlVar = (aql) c0939qq.f47500b;
            if (ooc.m18737c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return aqlVar;
            }
        }
        return null;
    }
}
