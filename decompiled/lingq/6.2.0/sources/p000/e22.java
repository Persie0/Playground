package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = h22.class)
public abstract class e22 {
    public static final d22 Companion = new d22();

    /* JADX INFO: renamed from: a */
    public abstract int mo4273a();

    /* JADX INFO: renamed from: b */
    public int mo4274b() {
        return (int) (mo4279g() / 3600000000000L);
    }

    /* JADX INFO: renamed from: c */
    public int mo4275c() {
        return (int) ((mo4279g() % 3600000000000L) / 60000000000L);
    }

    /* JADX INFO: renamed from: d */
    public int mo4276d() {
        return (int) (mo4279g() % 1000000000);
    }

    /* JADX INFO: renamed from: e */
    public int mo4277e() {
        return (int) ((mo4279g() % 60000000000L) / 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e22)) {
            return false;
        }
        e22 e22Var = (e22) obj;
        return mo4278f() == e22Var.mo4278f() && mo4273a() == e22Var.mo4273a() && mo4279g() == e22Var.mo4279g();
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo4278f();

    /* JADX INFO: renamed from: g */
    public abstract long mo4279g();

    public final int hashCode() {
        return Long.hashCode(mo4279g()) + ((mo4273a() + (Long.hashCode(mo4278f()) * 31)) * 31);
    }

    public final String toString() {
        int i;
        Object objValueOf;
        StringBuilder sb = new StringBuilder();
        if (mo4278f() > 0 || mo4273a() > 0 || mo4279g() > 0 || ((mo4278f() | mo4279g()) == 0 && mo4273a() == 0)) {
            i = 1;
        } else {
            sb.append('-');
            i = -1;
        }
        sb.append('P');
        if (((int) (mo4278f() / 12)) != 0) {
            sb.append(((int) (mo4278f() / 12)) * i);
            sb.append('Y');
        }
        if (((int) (mo4278f() % 12)) != 0) {
            sb.append(((int) (mo4278f() % 12)) * i);
            sb.append('M');
        }
        if (mo4273a() != 0) {
            sb.append(mo4273a() * i);
            sb.append('D');
        }
        String str = "";
        String str2 = "T";
        if (mo4274b() != 0) {
            sb.append("T");
            sb.append(mo4274b() * i);
            sb.append('H');
            str2 = "";
        }
        if (mo4275c() != 0) {
            sb.append(str2);
            sb.append(mo4275c() * i);
            sb.append('M');
        } else {
            str = str2;
        }
        if ((mo4277e() | mo4276d()) != 0) {
            sb.append(str);
            if (mo4277e() != 0) {
                objValueOf = Integer.valueOf(mo4277e() * i);
            } else {
                objValueOf = mo4276d() * i < 0 ? "-0" : "0";
            }
            sb.append(objValueOf);
            if (mo4276d() != 0) {
                sb.append('.');
                sb.append(vk9.m23396s0(9, String.valueOf(Math.abs(mo4276d()))));
            }
            sb.append('S');
        }
        if (sb.length() == 1) {
            sb.append("0D");
        }
        return sb.toString();
    }
}
