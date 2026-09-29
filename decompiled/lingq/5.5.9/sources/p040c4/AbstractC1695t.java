package p040c4;

import ae.C0062b;
import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.StateFlowImpl;
import sl.C9072e;

/* JADX INFO: renamed from: c4.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1695t {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f9461a = new ReentrantLock(true);

    /* JADX INFO: renamed from: b */
    public final StateFlowImpl f9462b;

    /* JADX INFO: renamed from: c */
    public final StateFlowImpl f9463c;

    /* JADX INFO: renamed from: d */
    public boolean f9464d;

    /* JADX INFO: renamed from: e */
    public final C7135p f9465e;

    /* JADX INFO: renamed from: f */
    public final C7135p f9466f;

    public AbstractC1695t() {
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(EmptyList.f38032a);
        this.f9462b = stateFlowImplM14379a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(EmptySet.f38034a);
        this.f9463c = stateFlowImplM14379a2;
        this.f9465e = C0062b.m306S(stateFlowImplM14379a);
        this.f9466f = C0062b.m306S(stateFlowImplM14379a2);
    }

    /* JADX INFO: renamed from: a */
    public abstract NavBackStackEntry mo4006a(NavDestination navDestination, Bundle bundle);

    /* JADX INFO: renamed from: b */
    public final void m5428b(NavBackStackEntry navBackStackEntry) {
        StateFlowImpl stateFlowImpl = this.f9462b;
        stateFlowImpl.setValue(C6752c.m13439g0(navBackStackEntry, C6752c.m13435c0((Iterable) stateFlowImpl.getValue(), C6752c.m13432Z((List) stateFlowImpl.getValue()))));
    }

    /* JADX INFO: renamed from: c */
    public void mo4007c(NavBackStackEntry navBackStackEntry, boolean z10) {
        C5207g.m11111f(navBackStackEntry, "popUpTo");
        ReentrantLock reentrantLock = this.f9461a;
        reentrantLock.lock();
        try {
            StateFlowImpl stateFlowImpl = this.f9462b;
            Iterable iterable = (Iterable) stateFlowImpl.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!C5207g.m11106a((NavBackStackEntry) obj, navBackStackEntry))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            stateFlowImpl.setValue(arrayList);
            C9072e c9072e = C9072e.f47360a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public void mo4008d(NavBackStackEntry navBackStackEntry) {
        C5207g.m11111f(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f9461a;
        reentrantLock.lock();
        try {
            StateFlowImpl stateFlowImpl = this.f9462b;
            stateFlowImpl.setValue(C6752c.m13439g0(navBackStackEntry, (Collection) stateFlowImpl.getValue()));
            C9072e c9072e = C9072e.f47360a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
