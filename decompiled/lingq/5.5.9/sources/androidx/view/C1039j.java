package androidx.view;

import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import dm.C5207g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p270n4.InterfaceC7706c;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1039j {

    /* JADX INFO: renamed from: androidx.lifecycle.j$a */
    public static final class a implements C1189a.a {
        @Override // androidx.p544savedstate.C1189a.a
        /* JADX INFO: renamed from: a */
        public final void mo3946a(InterfaceC7706c interfaceC7706c) {
            LinkedHashMap linkedHashMap;
            C5207g.m11111f(interfaceC7706c, "owner");
            if (!(interfaceC7706c instanceof InterfaceC1048n0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            C1046m0 c1046m0Mo796n = ((InterfaceC1048n0) interfaceC7706c).mo796n();
            C1189a c1189aMo797q = interfaceC7706c.mo797q();
            c1046m0Mo796n.getClass();
            Iterator it = new HashSet(c1046m0Mo796n.f6677a.keySet()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                linkedHashMap = c1046m0Mo796n.f6677a;
                if (!zHasNext) {
                    break;
                }
                String str = (String) it.next();
                C5207g.m11111f(str, "key");
                AbstractC1036h0 abstractC1036h0 = (AbstractC1036h0) linkedHashMap.get(str);
                C5207g.m11108c(abstractC1036h0);
                C1039j.m3943a(abstractC1036h0, c1189aMo797q, interfaceC7706c.mo786G());
            }
            if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                c1189aMo797q.m4587d();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3943a(AbstractC1036h0 abstractC1036h0, C1189a c1189a, Lifecycle lifecycle) {
        Object obj;
        C5207g.m11111f(c1189a, "registry");
        C5207g.m11111f(lifecycle, "lifecycle");
        HashMap map = abstractC1036h0.f6655a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = abstractC1036h0.f6655a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f6588c) {
            savedStateHandleController.m3907a(lifecycle, c1189a);
            m3945c(lifecycle, c1189a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final SavedStateHandleController m3944b(C1189a c1189a, Lifecycle lifecycle, String str, Bundle bundle) {
        Bundle bundleM4584a = c1189a.m4584a(str);
        Class<? extends Object>[] clsArr = C1024c0.f6615f;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1024c0.a.m3931a(bundleM4584a, bundle));
        savedStateHandleController.m3907a(lifecycle, c1189a);
        m3945c(lifecycle, c1189a);
        return savedStateHandleController;
    }

    /* JADX INFO: renamed from: c */
    public static void m3945c(final Lifecycle lifecycle, final C1189a c1189a) {
        Lifecycle.State stateMo3884b = lifecycle.mo3884b();
        if (stateMo3884b == Lifecycle.State.INITIALIZED || stateMo3884b.isAtLeast(Lifecycle.State.STARTED)) {
            c1189a.m4587d();
        } else {
            lifecycle.mo3883a(new InterfaceC1049o() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.view.InterfaceC1049o
                /* JADX INFO: renamed from: e */
                public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.mo3885c(this);
                        c1189a.m4587d();
                    }
                }
            });
        }
    }
}
