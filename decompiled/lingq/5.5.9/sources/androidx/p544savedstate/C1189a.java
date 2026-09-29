package androidx.p544savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.view.C1039j;
import dm.C5207g;
import java.util.Iterator;
import java.util.Map;
import p229l.C7203b;
import p270n4.InterfaceC7706c;

/* JADX INFO: renamed from: androidx.savedstate.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class C1189a {

    /* JADX INFO: renamed from: b */
    public boolean f7562b;

    /* JADX INFO: renamed from: c */
    public Bundle f7563c;

    /* JADX INFO: renamed from: d */
    public boolean f7564d;

    /* JADX INFO: renamed from: e */
    public Recreator.C1186a f7565e;

    /* JADX INFO: renamed from: a */
    public final C7203b<String, b> f7561a = new C7203b<>();

    /* JADX INFO: renamed from: f */
    public boolean f7566f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3946a(InterfaceC7706c interfaceC7706c);
    }

    /* JADX INFO: renamed from: androidx.savedstate.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Bundle mo811a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Bundle m4584a(String str) {
        C5207g.m11111f(str, "key");
        if (!this.f7564d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f7563c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f7563c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f7563c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f7563c = null;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: b */
    public final b m4585b() {
        String str;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f7561a.iterator();
        do {
            C7203b.e eVar = (C7203b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            C5207g.m11110e(entry, "components");
            str = (String) entry.getKey();
            bVar = (b) entry.getValue();
        } while (!C5207g.m11106a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m4586c(String str, b bVar) {
        C5207g.m11111f(str, "key");
        C5207g.m11111f(bVar, "provider");
        if (!(this.f7561a.mo14516f(str, bVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4587d() {
        if (!this.f7566f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.C1186a c1186a = this.f7565e;
        if (c1186a == null) {
            c1186a = new Recreator.C1186a(this);
        }
        this.f7565e = c1186a;
        try {
            C1039j.a.class.getDeclaredConstructor(new Class[0]);
            Recreator.C1186a c1186a2 = this.f7565e;
            if (c1186a2 != null) {
                c1186a2.f7558a.add(C1039j.a.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + C1039j.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
