package androidx.glance.appwidget;

import android.content.Context;
import androidx.glance.state.C0703a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.sbd;
import p000.ux5;
import p000.vp2;
import p000.vr4;
import p000.xfa;
import p000.xr4;
import p000.zr4;

/* JADX INFO: renamed from: androidx.glance.appwidget.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0664l {

    /* JADX INFO: renamed from: g */
    public static final C0663k f6023g = new C0663k();

    /* JADX INFO: renamed from: a */
    public final Context f6024a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f6025b;

    /* JADX INFO: renamed from: c */
    public int f6026c;

    /* JADX INFO: renamed from: d */
    public final int f6027d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f6028e;

    /* JADX INFO: renamed from: f */
    public final Set f6029f;

    public C0664l(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set, int i3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        set = (i3 & 32) != 0 ? new LinkedHashSet() : set;
        this.f6024a = context;
        this.f6025b = linkedHashMap;
        this.f6026c = i;
        this.f6027d = i2;
        this.f6028e = linkedHashSet;
        this.f6029f = set;
    }

    /* JADX INFO: renamed from: a */
    public final int m2254a(vp2 vp2Var) {
        vr4 vr4VarM21209b = sbd.m21209b(this.f6024a, vp2Var);
        synchronized (this) {
            Integer num = (Integer) this.f6025b.get(vr4VarM21209b);
            if (num != null) {
                int iIntValue = num.intValue();
                this.f6028e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i = this.f6026c;
            while (this.f6029f.contains(Integer.valueOf(i))) {
                i = (i + 1) % xr4.f68582c;
                if (i == this.f6026c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.f6026c = (i + 1) % xr4.f68582c;
            this.f6028e.add(Integer.valueOf(i));
            this.f6029f.add(Integer.valueOf(i));
            this.f6025b.put(vr4VarM21209b, Integer.valueOf(i));
            return i;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2255b(Continuation continuation) {
        Object objM2505d = C0703a.f6305a.m2505d(this.f6024a, zr4.f72004a, ux5.m22988k(this.f6027d, "appWidgetLayout-"), new LayoutConfiguration$save$2(this, null), (ContinuationImpl) continuation);
        return objM2505d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2505d : xfa.f68157a;
    }
}
