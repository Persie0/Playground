package p270n4;

import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import androidx.p544savedstate.Recreator;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import dm.C5207g;
import java.util.Map;
import p229l.C7203b;

/* JADX INFO: renamed from: n4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7705b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7706c f42231a;

    /* JADX INFO: renamed from: b */
    public final C1189a f42232b = new C1189a();

    /* JADX INFO: renamed from: c */
    public boolean f42233c;

    public C7705b(InterfaceC7706c interfaceC7706c) {
        this.f42231a = interfaceC7706c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m15298a() {
        InterfaceC7706c interfaceC7706c = this.f42231a;
        C1052r c1052rMo786G = interfaceC7706c.mo786G();
        if (!(c1052rMo786G.f6681d == Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        c1052rMo786G.mo3883a(new Recreator(interfaceC7706c));
        final C1189a c1189a = this.f42232b;
        c1189a.getClass();
        if (!(!c1189a.f7562b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        c1052rMo786G.mo3883a(new InterfaceC1049o() { // from class: n4.a
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                C1189a c1189a2 = c1189a;
                C5207g.m11111f(c1189a2, "this$0");
                if (event == Lifecycle.Event.ON_START) {
                    c1189a2.f7566f = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    c1189a2.f7566f = false;
                }
            }
        });
        c1189a.f7562b = true;
        this.f42233c = true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final void m15299b(Bundle bundle) {
        if (!this.f42233c) {
            m15298a();
        }
        C1052r c1052rMo786G = this.f42231a.mo786G();
        if (!(!c1052rMo786G.f6681d.isAtLeast(Lifecycle.State.STARTED))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c1052rMo786G.f6681d).toString());
        }
        C1189a c1189a = this.f42232b;
        if (!c1189a.f7562b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!c1189a.f7564d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        c1189a.f7563c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c1189a.f7564d = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m15300c(Bundle bundle) {
        C5207g.m11111f(bundle, "outBundle");
        C1189a c1189a = this.f42232b;
        c1189a.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1189a.f7563c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C7203b<String, C1189a.b> c7203b = c1189a.f7561a;
        c7203b.getClass();
        C7203b.d dVar = new C7203b.d();
        c7203b.f40533c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C1189a.b) entry.getValue()).mo811a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
