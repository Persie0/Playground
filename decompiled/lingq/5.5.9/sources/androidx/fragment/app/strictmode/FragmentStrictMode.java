package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptySet;
import p080e.RunnableC5286r;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentStrictMode {

    /* JADX INFO: renamed from: a */
    public static final C0978a f6401a = C0978a.f6402c;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m13365d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$a */
    public static final class C0978a {

        /* JADX INFO: renamed from: c */
        public static final C0978a f6402c = new C0978a(EmptySet.f38034a, C6753d.m13459L0());

        /* JADX INFO: renamed from: a */
        public final Set<Flag> f6403a;

        /* JADX INFO: renamed from: b */
        public final LinkedHashMap f6404b;

        public C0978a(EmptySet emptySet, Map map) {
            C5207g.m11111f(emptySet, "flags");
            this.f6403a = emptySet;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ((EmptySet) map.entrySet()).getClass();
            this.f6404b = linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0978a m3799a(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.f6080R) {
            if (fragment2.m3604y()) {
                fragment2.m3598r();
            }
        }
        return f6401a;
    }

    /* JADX INFO: renamed from: b */
    public static void m3800b(C0978a c0978a, Violation violation) {
        Fragment fragment = violation.f6405a;
        String name = fragment.getClass().getName();
        Flag flag = Flag.PENALTY_LOG;
        Set<Flag> set = c0978a.f6403a;
        if (set.contains(flag)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(Flag.PENALTY_DEATH)) {
            RunnableC5286r runnableC5286r = new RunnableC5286r(name, 2, violation);
            if (fragment.m3604y()) {
                Handler handler = fragment.m3598r().f6178u.f6430c;
                C5207g.m11110e(handler, "fragment.parentFragmentManager.host.handler");
                if (C5207g.m11106a(handler.getLooper(), Looper.myLooper())) {
                    runnableC5286r.run();
                    return;
                } else {
                    handler.post(runnableC5286r);
                    return;
                }
            }
            runnableC5286r.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3801c(Violation violation) {
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f6405a.getClass().getName()), violation);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m3802d(Fragment fragment, String str) {
        C5207g.m11111f(fragment, "fragment");
        C5207g.m11111f(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        m3801c(fragmentReuseViolation);
        C0978a c0978aM3799a = m3799a(fragment);
        if (c0978aM3799a.f6403a.contains(Flag.DETECT_FRAGMENT_REUSE) && m3803e(c0978aM3799a, fragment.getClass(), FragmentReuseViolation.class)) {
            m3800b(c0978aM3799a, fragmentReuseViolation);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3803e(C0978a c0978a, Class cls, Class cls2) {
        Set set = (Set) c0978a.f6404b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C5207g.m11106a(cls2.getSuperclass(), Violation.class) || !C6752c.m13415I(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
