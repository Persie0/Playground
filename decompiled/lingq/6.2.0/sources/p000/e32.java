package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e32 implements InterfaceC3579sm {

    /* JADX INFO: renamed from: a */
    public final long f36637a;

    /* JADX INFO: renamed from: b */
    public final Object f36638b;

    /* JADX INFO: renamed from: c */
    public final Object f36639c;

    /* JADX INFO: renamed from: d */
    public final Object f36640d;

    /* JADX INFO: renamed from: e */
    public final Object f36641e;

    /* JADX INFO: renamed from: f */
    public final Object f36642f;

    /* JADX INFO: renamed from: g */
    public final Object f36643g;

    /* JADX INFO: renamed from: h */
    public final Object f36644h;

    public e32(f32 f32Var, jda jdaVar, Object obj, AbstractC3081hn abstractC3081hn) {
        a00 a00Var = new a00(f32Var.f38334a);
        h73 h73Var = (h73) a00Var.f5b;
        this.f36638b = a00Var;
        this.f36639c = jdaVar;
        this.f36640d = obj;
        AbstractC3081hn abstractC3081hn2 = (AbstractC3081hn) jdaVar.f45442a.invoke(obj);
        this.f36642f = abstractC3081hn2;
        this.f36643g = do7.m10533i(abstractC3081hn);
        vi3 vi3Var = jdaVar.f45443b;
        if (((AbstractC3081hn) a00Var.f8e) == null) {
            a00Var.f8e = abstractC3081hn2.mo10485c();
        }
        AbstractC3081hn abstractC3081hn3 = (AbstractC3081hn) a00Var.f8e;
        if (abstractC3081hn3 == null) {
            fa4.m11636J("targetVector");
            throw null;
        }
        int iMo10484b = abstractC3081hn3.mo10484b();
        int i = 0;
        while (true) {
            AbstractC3081hn abstractC3081hn4 = (AbstractC3081hn) a00Var.f8e;
            if (i >= iMo10484b) {
                if (abstractC3081hn4 == null) {
                    fa4.m11636J("targetVector");
                    throw null;
                }
                this.f36641e = vi3Var.invoke(abstractC3081hn4);
                if (((AbstractC3081hn) a00Var.f7d) == null) {
                    a00Var.f7d = abstractC3081hn2.mo10485c();
                }
                AbstractC3081hn abstractC3081hn5 = (AbstractC3081hn) a00Var.f7d;
                if (abstractC3081hn5 == null) {
                    fa4.m11636J("velocityVector");
                    throw null;
                }
                int iMo10484b2 = abstractC3081hn5.mo10484b();
                long jMax = 0;
                for (int i2 = 0; i2 < iMo10484b2; i2++) {
                    abstractC3081hn2.getClass();
                    jMax = Math.max(jMax, h73Var.mo13112m(abstractC3081hn.mo10483a(i2)));
                }
                this.f36637a = jMax;
                AbstractC3081hn abstractC3081hnM10533i = do7.m10533i(((a00) this.f36638b).m1a(jMax, (AbstractC3081hn) this.f36642f, abstractC3081hn));
                this.f36644h = abstractC3081hnM10533i;
                int iMo10484b3 = abstractC3081hnM10533i.mo10484b();
                for (int i3 = 0; i3 < iMo10484b3; i3++) {
                    AbstractC3081hn abstractC3081hn6 = (AbstractC3081hn) this.f36644h;
                    float fMo10483a = abstractC3081hn6.mo10483a(i3);
                    float f = ((a00) this.f36638b).f4a;
                    abstractC3081hn6.mo10487e(i3, l70.m15944g(fMo10483a, -f, f));
                }
                return;
            }
            if (abstractC3081hn4 == null) {
                fa4.m11636J("targetVector");
                throw null;
            }
            abstractC3081hn4.mo10487e(i, h73Var.mo13113p(abstractC3081hn2.mo10483a(i), abstractC3081hn.mo10483a(i)));
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static e32 m10815a(l67 l67Var, long j, boolean z) {
        dg4 dg4VarM10336f = ((dg4) l67Var.f49188b).m10336f();
        String strM10344n = dg4VarM10336f.m10344n("kochava_device_id", null);
        String strM10344n2 = dg4VarM10336f.m10344n("kochava_app_id", null);
        String strM10344n3 = dg4VarM10336f.m10344n("sdk_version", null);
        dg4 dg4VarM10336f2 = ((dg4) l67Var.f49189c).m10336f();
        return new e32(strM10344n, strM10344n2, strM10344n3, dg4VarM10336f2.m10344n("app_version", null), dg4VarM10336f2.m10344n("os_version", null), Long.valueOf(System.currentTimeMillis() / 1000), z ? Boolean.TRUE : null, j);
    }

    /* JADX INFO: renamed from: i */
    public static e32 m10816i(eg4 eg4Var) {
        dg4 dg4Var = (dg4) eg4Var;
        return new e32(dg4Var.m10344n("kochava_device_id", null), dg4Var.m10344n("kochava_app_id", null), dg4Var.m10344n("sdk_version", null), dg4Var.m10344n("app_version", null), dg4Var.m10344n("os_version", null), dg4Var.m10343m("time", null), dg4Var.m10337g("sdk_disabled", null), dg4Var.m10343m("count", 0L).longValue());
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: b */
    public boolean mo10817b() {
        return false;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: c */
    public long mo10818c() {
        return this.f36637a;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: d */
    public jda mo10819d() {
        return (jda) this.f36639c;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: e */
    public AbstractC3081hn mo10820e(long j) {
        return !m21452f(j) ? ((a00) this.f36638b).m1a(j, (AbstractC3081hn) this.f36642f, (AbstractC3081hn) this.f36643g) : (AbstractC3081hn) this.f36644h;
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: g */
    public Object mo10821g(long j) {
        if (m21452f(j)) {
            return this.f36641e;
        }
        vi3 vi3Var = ((jda) this.f36639c).f45443b;
        a00 a00Var = (a00) this.f36638b;
        AbstractC3081hn abstractC3081hn = (AbstractC3081hn) this.f36642f;
        AbstractC3081hn abstractC3081hn2 = (AbstractC3081hn) this.f36643g;
        if (((AbstractC3081hn) a00Var.f6c) == null) {
            a00Var.f6c = abstractC3081hn.mo10485c();
        }
        AbstractC3081hn abstractC3081hn3 = (AbstractC3081hn) a00Var.f6c;
        if (abstractC3081hn3 == null) {
            fa4.m11636J("valueVector");
            throw null;
        }
        int iMo10484b = abstractC3081hn3.mo10484b();
        int i = 0;
        while (true) {
            AbstractC3081hn abstractC3081hn4 = (AbstractC3081hn) a00Var.f6c;
            if (i >= iMo10484b) {
                if (abstractC3081hn4 != null) {
                    return vi3Var.invoke(abstractC3081hn4);
                }
                fa4.m11636J("valueVector");
                throw null;
            }
            if (abstractC3081hn4 == null) {
                fa4.m11636J("valueVector");
                throw null;
            }
            abstractC3081hn4.mo10487e(i, ((h73) a00Var.f5b).mo13111i(abstractC3081hn.mo10483a(i), abstractC3081hn2.mo10483a(i), j));
            i++;
        }
    }

    @Override // p000.InterfaceC3579sm
    /* JADX INFO: renamed from: h */
    public Object mo10822h() {
        return this.f36641e;
    }

    /* JADX INFO: renamed from: j */
    public dg4 m10823j() {
        dg4 dg4VarM10328c = dg4.m10328c();
        String str = (String) this.f36638b;
        if (str != null) {
            dg4VarM10328c.m10331B("kochava_device_id", str);
        }
        String str2 = (String) this.f36639c;
        if (str2 != null) {
            dg4VarM10328c.m10331B("kochava_app_id", str2);
        }
        String str3 = (String) this.f36640d;
        if (str3 != null) {
            dg4VarM10328c.m10331B("sdk_version", str3);
        }
        String str4 = (String) this.f36641e;
        if (str4 != null) {
            dg4VarM10328c.m10331B("app_version", str4);
        }
        String str5 = (String) this.f36642f;
        if (str5 != null) {
            dg4VarM10328c.m10331B("os_version", str5);
        }
        Long l = (Long) this.f36643g;
        if (l != null) {
            dg4VarM10328c.m10330A("time", l.longValue());
        }
        Boolean bool = (Boolean) this.f36644h;
        if (bool != null) {
            dg4VarM10328c.m10351u("sdk_disabled", bool.booleanValue());
        }
        dg4VarM10328c.m10330A("count", this.f36637a);
        return dg4VarM10328c;
    }

    public e32(String str, String str2, String str3, String str4, String str5, Long l, Boolean bool, long j) {
        this.f36638b = str;
        this.f36639c = str2;
        this.f36640d = str3;
        this.f36641e = str4;
        this.f36642f = str5;
        this.f36643g = l;
        this.f36644h = bool;
        this.f36637a = j;
    }

    public e32() {
        this.f36638b = null;
        this.f36639c = null;
        this.f36640d = null;
        this.f36641e = null;
        this.f36642f = null;
        this.f36643g = null;
        this.f36644h = null;
        this.f36637a = 0L;
    }
}
