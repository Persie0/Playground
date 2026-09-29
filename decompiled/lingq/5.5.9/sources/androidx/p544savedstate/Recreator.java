package androidx.p544savedstate;

import android.os.Bundle;
import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import p270n4.InterfaceC7706c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/o;", "a", "savedstate_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class Recreator implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7706c f7557a;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$a */
    public static final class C1186a implements C1189a.b {

        /* JADX INFO: renamed from: a */
        public final LinkedHashSet f7558a;

        public C1186a(C1189a c1189a) {
            C5207g.m11111f(c1189a, "registry");
            this.f7558a = new LinkedHashSet();
            c1189a.m4586c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.p544savedstate.C1189a.b
        /* JADX INFO: renamed from: a */
        public final Bundle mo811a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f7558a));
            return bundle;
        }
    }

    public Recreator(InterfaceC7706c interfaceC7706c) {
        C5207g.m11111f(interfaceC7706c, "owner");
        this.f7557a = interfaceC7706c;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1051q.mo786G().mo3885c(this);
        InterfaceC7706c interfaceC7706c = this.f7557a;
        Bundle bundleM4584a = interfaceC7706c.mo797q().m4584a("androidx.savedstate.Restarter");
        if (bundleM4584a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM4584a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1189a.a.class);
                C5207g.m11110e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        C5207g.m11110e(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((C1189a.a) objNewInstance).mo3946a(interfaceC7706c);
                    } catch (Exception e10) {
                        throw new RuntimeException(C0204c.m852k("Failed to instantiate ", str), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(C0141b.m611g("Class ", str, " wasn't found"), e12);
            }
        }
    }
}
