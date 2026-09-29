package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class p6b {

    /* JADX INFO: renamed from: a */
    public static final t56 f55667a;

    /* JADX INFO: renamed from: b */
    public static final n6b[] f55668b;

    static {
        t56 t56Var = new t56(8);
        n6b.f52420a.getClass();
        o6b o6bVar = m6b.f50679g;
        t56Var.m21850i(1, o6bVar);
        o6b o6bVar2 = m6b.f50678f;
        t56Var.m21850i(2, o6bVar2);
        o6b o6bVar3 = m6b.f50674b;
        t56Var.m21850i(4, o6bVar3);
        o6b o6bVar4 = m6b.f50676d;
        t56Var.m21850i(8, o6bVar4);
        o6b o6bVar5 = m6b.f50680h;
        t56Var.m21850i(16, o6bVar5);
        o6b o6bVar6 = m6b.f50677e;
        t56Var.m21850i(32, o6bVar6);
        o6b o6bVar7 = m6b.f50681i;
        t56Var.m21850i(64, o6bVar7);
        o6b o6bVar8 = m6b.f50675c;
        t56Var.m21850i(128, o6bVar8);
        f55667a = t56Var;
        f55668b = new n6b[]{o6bVar, o6bVar2, o6bVar3, o6bVar7, o6bVar5, o6bVar6, o6bVar4, m6b.f50682j, o6bVar8};
    }

    /* JADX INFO: renamed from: a */
    public static final void m18931a(vk5 vk5Var, h28 h28Var, long j, int i, int i2) {
        if (nda.m17377a(j, -1L)) {
            return;
        }
        vk5Var.m23363c(h28Var.mo1483b(), (int) ((j >>> 48) & 65535));
        vk5Var.m23363c(h28Var.mo1484c(), (int) ((j >>> 32) & 65535));
        vk5Var.m23363c(h28Var.mo1485d(), i - ((int) ((j >>> 16) & 65535)));
        vk5Var.m23363c(h28Var.mo1482a(), i2 - ((int) (j & 65535)));
    }
}
