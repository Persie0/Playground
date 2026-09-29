package androidx.view;

import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import km.InterfaceC6719b;
import p270n4.InterfaceC7706c;
import p427v3.AbstractC9634a;
import p427v3.C9635b;
import p427v3.C9636c;
import p427v3.C9637d;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleSupport {

    /* JADX INFO: renamed from: a */
    public static final C1016b f6589a = new C1016b();

    /* JADX INFO: renamed from: b */
    public static final C1017c f6590b = new C1017c();

    /* JADX INFO: renamed from: c */
    public static final C1015a f6591c = new C1015a();

    /* JADX INFO: renamed from: androidx.lifecycle.SavedStateHandleSupport$a */
    public static final class C1015a {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.SavedStateHandleSupport$b */
    public static final class C1016b {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.SavedStateHandleSupport$c */
    public static final class C1017c {
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public static final C1024c0 m3908a(C9636c c9636c) {
        C1016b c1016b = f6589a;
        LinkedHashMap linkedHashMap = c9636c.f49329a;
        InterfaceC7706c interfaceC7706c = (InterfaceC7706c) linkedHashMap.get(c1016b);
        if (interfaceC7706c == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC1048n0 interfaceC1048n0 = (InterfaceC1048n0) linkedHashMap.get(f6590b);
        if (interfaceC1048n0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f6591c);
        String str = (String) linkedHashMap.get(C1044l0.f6676a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        C1189a.b bVarM4585b = interfaceC7706c.mo797q().m4585b();
        SavedStateHandlesProvider savedStateHandlesProvider = bVarM4585b instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) bVarM4585b : null;
        if (savedStateHandlesProvider == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C1028d0 c1028d0M3910c = m3910c(interfaceC1048n0);
        C1024c0 c1024c0M3931a = (C1024c0) c1028d0M3910c.f6637d.get(str);
        if (c1024c0M3931a == null) {
            Class<? extends Object>[] clsArr = C1024c0.f6615f;
            if (!savedStateHandlesProvider.f6594b) {
                savedStateHandlesProvider.f6595c = savedStateHandlesProvider.f6593a.m4584a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                savedStateHandlesProvider.f6594b = true;
            }
            Bundle bundle2 = savedStateHandlesProvider.f6595c;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
            Bundle bundle4 = savedStateHandlesProvider.f6595c;
            if (bundle4 != null) {
                bundle4.remove(str);
            }
            Bundle bundle5 = savedStateHandlesProvider.f6595c;
            if (bundle5 != null && bundle5.isEmpty()) {
                savedStateHandlesProvider.f6595c = null;
            }
            c1024c0M3931a = C1024c0.a.m3931a(bundle3, bundle);
            c1028d0M3910c.f6637d.put(str, c1024c0M3931a);
        }
        return c1024c0M3931a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final <T extends InterfaceC7706c & InterfaceC1048n0> void m3909b(T t10) {
        C5207g.m11111f(t10, "<this>");
        Lifecycle.State state = t10.mo786G().f6681d;
        if (!(state == Lifecycle.State.INITIALIZED || state == Lifecycle.State.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.mo797q().m4585b() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t10.mo797q(), t10);
            t10.mo797q().m4586c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            t10.mo786G().mo3883a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C1028d0 m3910c(InterfaceC1048n0 interfaceC1048n0) {
        C5207g.m11111f(interfaceC1048n0, "<this>");
        ArrayList arrayList = new ArrayList();
        SavedStateHandleSupport$savedStateHandlesVM$1$1 savedStateHandleSupport$savedStateHandlesVM$1$1 = new InterfaceC2052l<AbstractC9634a, C1028d0>() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C1028d0 mo528n(AbstractC9634a abstractC9634a) {
                C5207g.m11111f(abstractC9634a, "$this$initializer");
                return new C1028d0();
            }
        };
        InterfaceC6719b interfaceC6719bM11118a = C5209i.m11118a(C1028d0.class);
        C5207g.m11111f(interfaceC6719bM11118a, "clazz");
        C5207g.m11111f(savedStateHandleSupport$savedStateHandlesVM$1$1, "initializer");
        arrayList.add(new C9637d(C5206f.m10998T0(interfaceC6719bM11118a), savedStateHandleSupport$savedStateHandlesVM$1$1));
        C9637d[] c9637dArr = (C9637d[]) arrayList.toArray(new C9637d[0]);
        return (C1028d0) new C1042k0(interfaceC1048n0, new C9635b((C9637d[]) Arrays.copyOf(c9637dArr, c9637dArr.length))).m3948b(C1028d0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
