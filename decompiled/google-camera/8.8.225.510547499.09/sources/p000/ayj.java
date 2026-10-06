package p000;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayj {

    /* JADX INFO: renamed from: a */
    public UUID f2721a;

    /* JADX INFO: renamed from: b */
    public bcv f2722b;

    /* JADX INFO: renamed from: c */
    public final Set f2723c;

    /* JADX INFO: renamed from: d */
    private final Class f2724d;

    public ayj(Class cls) {
        this.f2724d = cls;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f2721a = uuidRandomUUID;
        String string = this.f2721a.toString();
        string.getClass();
        String name = cls.getName();
        name.getClass();
        this.f2722b = new bcv(string, 0, name, null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, null);
        String name2 = cls.getName();
        name2.getClass();
        String[] strArr = {name2};
        LinkedHashSet linkedHashSet = new LinkedHashSet(omn.m18721z(1));
        omn.m18697ak(strArr, linkedHashSet);
        this.f2723c = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public final void m2105a(String str) {
        str.getClass();
        this.f2723c.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final C1058va m2106b() {
        C1058va c1058va = new C1058va(this);
        axr axrVar = this.f2722b.f2972i;
        boolean z = true;
        if (!axrVar.m2089a() && !axrVar.f2681d && !axrVar.f2679b && !axrVar.f2680c) {
            z = false;
        }
        bcv bcvVar = this.f2722b;
        if (bcvVar.f2978o) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (bcvVar.f2969f > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f2721a = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        bcv bcvVar2 = this.f2722b;
        bcvVar2.getClass();
        String str = bcvVar2.f2965b;
        int i = bcvVar2.f2981r;
        String str2 = bcvVar2.f2966c;
        axt axtVar = new axt(bcvVar2.f2967d);
        axt axtVar2 = new axt(bcvVar2.f2968e);
        long j = bcvVar2.f2969f;
        long j2 = bcvVar2.f2970g;
        long j3 = bcvVar2.f2971h;
        axr axrVar2 = bcvVar2.f2972i;
        axrVar2.getClass();
        boolean z2 = axrVar2.f2679b;
        boolean z3 = axrVar2.f2680c;
        this.f2722b = new bcv(string, i, str, str2, axtVar, axtVar2, j, j2, j3, new axr(axrVar2.f2686i, z2, z3, axrVar2.f2681d, axrVar2.f2682e, axrVar2.f2683f, axrVar2.f2684g, axrVar2.f2685h), bcvVar2.f2973j, bcvVar2.f2982s, bcvVar2.f2974k, bcvVar2.f2975l, bcvVar2.f2976m, bcvVar2.f2977n, bcvVar2.f2978o, bcvVar2.f2983t, bcvVar2.f2979p, 524288, null);
        return c1058va;
    }
}
