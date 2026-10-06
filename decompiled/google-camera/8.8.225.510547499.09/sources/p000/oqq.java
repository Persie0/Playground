package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqq extends oln implements osr {

    /* JADX INFO: renamed from: b */
    public static final olt f46428b = new olt();

    /* JADX INFO: renamed from: a */
    public final long f46429a;

    public oqq(long j) {
        super(f46428b);
        this.f46429a = j;
    }

    @Override // p000.osr
    /* JADX INFO: renamed from: cK */
    public final /* bridge */ /* synthetic */ Object mo18918cK(oly olyVar) {
        oqr oqrVar = (oqr) olyVar.get(oqr.f46430b);
        String str = oqrVar != null ? oqrVar.f46431a : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iM18801o = ook.m18801o(name);
        name.getClass();
        int iLastIndexOf = name.lastIndexOf(" @", iM18801o);
        if (iLastIndexOf < 0) {
            iLastIndexOf = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iLastIndexOf + 10);
        String strSubstring = name.substring(0, iLastIndexOf);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f46429a);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // p000.osr
    /* JADX INFO: renamed from: cL */
    public final /* bridge */ /* synthetic */ void mo18919cL(Object obj) {
        String str = (String) obj;
        str.getClass();
        Thread.currentThread().setName(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqq) && this.f46429a == ((oqq) obj).f46429a;
    }

    public final int hashCode() {
        long j = this.f46429a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.f46429a + ")";
    }
}
