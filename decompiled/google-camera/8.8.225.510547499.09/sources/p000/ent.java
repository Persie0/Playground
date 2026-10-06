package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ent {

    /* JADX INFO: renamed from: a */
    public int f14790a;

    /* JADX INFO: renamed from: b */
    public final Object f14791b;

    public ent() {
        this.f14791b = new Object[256];
    }

    public ent(String str) {
        this.f14790a = 0;
        this.f14791b = str;
    }

    public ent(jwn jwnVar) {
        this.f14791b = jwnVar;
    }

    public ent(kbz kbzVar) {
        this.f14790a = 0;
        this.f14791b = kbzVar.mo13958b("AliveLock");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kce] */
    /* JADX INFO: renamed from: l */
    private final void m7568l() {
        this.f14791b.mo13955c(this.f14790a);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7569a() {
        this.f14790a++;
        m7568l();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7570b() {
        this.f14790a--;
        m7568l();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m7571c() {
        return this.f14790a > 0;
    }

    /* JADX INFO: renamed from: d */
    public final char m7572d() {
        int i = this.f14790a;
        String str = (String) this.f14791b;
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: e */
    public final char m7573e(int i) {
        String str = (String) this.f14791b;
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m7574f(String str, int i) throws bfc {
        char cM7573e = m7573e(this.f14790a);
        int i2 = 0;
        boolean z = false;
        while (cM7573e >= '0' && cM7573e <= '9') {
            int i3 = this.f14790a + 1;
            this.f14790a = i3;
            i2 = (i2 * 10) + (cM7573e - '0');
            cM7573e = m7573e(i3);
            z = true;
        }
        if (!z) {
            throw new bfc(str, 5);
        }
        if (i2 > i) {
            return i;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public final int m7575g() {
        return ((String) this.f14791b).length();
    }

    /* JADX INFO: renamed from: h */
    public final void m7576h() {
        this.f14790a++;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7577i() {
        return this.f14790a < ((String) this.f14791b).length();
    }

    /* JADX INFO: renamed from: j */
    public final Object m7578j() {
        int i = this.f14790a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.f14791b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f14790a = i2;
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m7579k(Object obj) {
        int i = this.f14790a;
        if (i < 256) {
            ((Object[]) this.f14791b)[i] = obj;
            this.f14790a = i + 1;
        }
    }
}
