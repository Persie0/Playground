package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7751h extends AbstractC7743b0.e {

    /* JADX INFO: renamed from: a */
    public final String f42551a;

    /* JADX INFO: renamed from: b */
    public final String f42552b;

    /* JADX INFO: renamed from: c */
    public final long f42553c;

    /* JADX INFO: renamed from: d */
    public final Long f42554d;

    /* JADX INFO: renamed from: e */
    public final boolean f42555e;

    /* JADX INFO: renamed from: f */
    public final AbstractC7743b0.e.a f42556f;

    /* JADX INFO: renamed from: g */
    public final AbstractC7743b0.e.f f42557g;

    /* JADX INFO: renamed from: h */
    public final AbstractC7743b0.e.AbstractC10663e f42558h;

    /* JADX INFO: renamed from: i */
    public final AbstractC7743b0.e.c f42559i;

    /* JADX INFO: renamed from: j */
    public final C7745c0<AbstractC7743b0.e.d> f42560j;

    /* JADX INFO: renamed from: k */
    public final int f42561k;

    /* JADX INFO: renamed from: ne.h$a */
    public static final class a extends AbstractC7743b0.e.b {

        /* JADX INFO: renamed from: a */
        public String f42562a;

        /* JADX INFO: renamed from: b */
        public String f42563b;

        /* JADX INFO: renamed from: c */
        public Long f42564c;

        /* JADX INFO: renamed from: d */
        public Long f42565d;

        /* JADX INFO: renamed from: e */
        public Boolean f42566e;

        /* JADX INFO: renamed from: f */
        public AbstractC7743b0.e.a f42567f;

        /* JADX INFO: renamed from: g */
        public AbstractC7743b0.e.f f42568g;

        /* JADX INFO: renamed from: h */
        public AbstractC7743b0.e.AbstractC10663e f42569h;

        /* JADX INFO: renamed from: i */
        public AbstractC7743b0.e.c f42570i;

        /* JADX INFO: renamed from: j */
        public C7745c0<AbstractC7743b0.e.d> f42571j;

        /* JADX INFO: renamed from: k */
        public Integer f42572k;

        public a() {
        }

        public a(AbstractC7743b0.e eVar) {
            this.f42562a = eVar.mo15372e();
            this.f42563b = eVar.mo15374g();
            this.f42564c = Long.valueOf(eVar.mo15376i());
            this.f42565d = eVar.mo15370c();
            this.f42566e = Boolean.valueOf(eVar.mo15378k());
            this.f42567f = eVar.mo15368a();
            this.f42568g = eVar.mo15377j();
            this.f42569h = eVar.mo15375h();
            this.f42570i = eVar.mo15369b();
            this.f42571j = eVar.mo15371d();
            this.f42572k = Integer.valueOf(eVar.mo15373f());
        }

        /* JADX INFO: renamed from: a */
        public final C7751h m15464a() {
            String strM765k = this.f42562a == null ? " generator" : "";
            if (this.f42563b == null) {
                strM765k = strM765k.concat(" identifier");
            }
            if (this.f42564c == null) {
                strM765k = C0166e.m765k(strM765k, " startedAt");
            }
            if (this.f42566e == null) {
                strM765k = C0166e.m765k(strM765k, " crashed");
            }
            if (this.f42567f == null) {
                strM765k = C0166e.m765k(strM765k, " app");
            }
            if (this.f42572k == null) {
                strM765k = C0166e.m765k(strM765k, " generatorType");
            }
            if (strM765k.isEmpty()) {
                return new C7751h(this.f42562a, this.f42563b, this.f42564c.longValue(), this.f42565d, this.f42566e.booleanValue(), this.f42567f, this.f42568g, this.f42569h, this.f42570i, this.f42571j, this.f42572k.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7751h() {
        throw null;
    }

    public C7751h(String str, String str2, long j10, Long l10, boolean z10, AbstractC7743b0.e.a aVar, AbstractC7743b0.e.f fVar, AbstractC7743b0.e.AbstractC10663e abstractC10663e, AbstractC7743b0.e.c cVar, C7745c0 c7745c0, int i10) {
        this.f42551a = str;
        this.f42552b = str2;
        this.f42553c = j10;
        this.f42554d = l10;
        this.f42555e = z10;
        this.f42556f = aVar;
        this.f42557g = fVar;
        this.f42558h = abstractC10663e;
        this.f42559i = cVar;
        this.f42560j = c7745c0;
        this.f42561k = i10;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0.e.a mo15368a() {
        return this.f42556f;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: b */
    public final AbstractC7743b0.e.c mo15369b() {
        return this.f42559i;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: c */
    public final Long mo15370c() {
        return this.f42554d;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: d */
    public final C7745c0<AbstractC7743b0.e.d> mo15371d() {
        return this.f42560j;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: e */
    public final String mo15372e() {
        return this.f42551a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        Long l10;
        AbstractC7743b0.e.AbstractC10663e abstractC10663e;
        AbstractC7743b0.e.c cVar;
        C7745c0<AbstractC7743b0.e.d> c7745c0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e)) {
            return false;
        }
        AbstractC7743b0.e eVar = (AbstractC7743b0.e) obj;
        if (this.f42551a.equals(eVar.mo15372e()) && this.f42552b.equals(eVar.mo15374g()) && this.f42553c == eVar.mo15376i() && ((l10 = this.f42554d) != null ? l10.equals(eVar.mo15370c()) : eVar.mo15370c() == null) && this.f42555e == eVar.mo15378k() && this.f42556f.equals(eVar.mo15368a())) {
            AbstractC7743b0.e.f fVar = this.f42557g;
            if (fVar == null) {
                if (eVar.mo15377j() == null) {
                    abstractC10663e = this.f42558h;
                    if (abstractC10663e == null) {
                        if (eVar.mo15375h() == null) {
                            cVar = this.f42559i;
                            if (cVar == null) {
                                if (eVar.mo15369b() == null) {
                                    c7745c0 = this.f42560j;
                                    if (c7745c0 == null) {
                                        if (eVar.mo15371d() == null) {
                                            if (this.f42561k == eVar.mo15373f()) {
                                                return true;
                                            }
                                        }
                                    } else if (c7745c0.equals(eVar.mo15371d())) {
                                        if (this.f42561k == eVar.mo15373f()) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (cVar.equals(eVar.mo15369b())) {
                                c7745c0 = this.f42560j;
                                if (c7745c0 == null) {
                                    if (eVar.mo15371d() == null) {
                                        if (this.f42561k == eVar.mo15373f()) {
                                            return true;
                                        }
                                    }
                                } else if (c7745c0.equals(eVar.mo15371d())) {
                                    if (this.f42561k == eVar.mo15373f()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else if (abstractC10663e.equals(eVar.mo15375h())) {
                        cVar = this.f42559i;
                        if (cVar == null) {
                            if (eVar.mo15369b() == null) {
                                c7745c0 = this.f42560j;
                                if (c7745c0 == null) {
                                    if (eVar.mo15371d() == null) {
                                        if (this.f42561k == eVar.mo15373f()) {
                                            return true;
                                        }
                                    }
                                } else if (c7745c0.equals(eVar.mo15371d())) {
                                    if (this.f42561k == eVar.mo15373f()) {
                                        return true;
                                    }
                                }
                            }
                        } else if (cVar.equals(eVar.mo15369b())) {
                            c7745c0 = this.f42560j;
                            if (c7745c0 == null) {
                                if (eVar.mo15371d() == null) {
                                    if (this.f42561k == eVar.mo15373f()) {
                                        return true;
                                    }
                                }
                            } else if (c7745c0.equals(eVar.mo15371d())) {
                                if (this.f42561k == eVar.mo15373f()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (fVar.equals(eVar.mo15377j())) {
                abstractC10663e = this.f42558h;
                if (abstractC10663e == null) {
                    if (eVar.mo15375h() == null) {
                        cVar = this.f42559i;
                        if (cVar == null) {
                            if (eVar.mo15369b() == null) {
                                c7745c0 = this.f42560j;
                                if (c7745c0 == null) {
                                    if (eVar.mo15371d() == null) {
                                        if (this.f42561k == eVar.mo15373f()) {
                                            return true;
                                        }
                                    }
                                } else if (c7745c0.equals(eVar.mo15371d())) {
                                    if (this.f42561k == eVar.mo15373f()) {
                                        return true;
                                    }
                                }
                            }
                        } else if (cVar.equals(eVar.mo15369b())) {
                            c7745c0 = this.f42560j;
                            if (c7745c0 == null) {
                                if (eVar.mo15371d() == null) {
                                    if (this.f42561k == eVar.mo15373f()) {
                                        return true;
                                    }
                                }
                            } else if (c7745c0.equals(eVar.mo15371d())) {
                                if (this.f42561k == eVar.mo15373f()) {
                                    return true;
                                }
                            }
                        }
                    }
                } else if (abstractC10663e.equals(eVar.mo15375h())) {
                    cVar = this.f42559i;
                    if (cVar == null) {
                        if (eVar.mo15369b() == null) {
                            c7745c0 = this.f42560j;
                            if (c7745c0 == null) {
                                if (eVar.mo15371d() == null) {
                                    if (this.f42561k == eVar.mo15373f()) {
                                        return true;
                                    }
                                }
                            } else if (c7745c0.equals(eVar.mo15371d())) {
                                if (this.f42561k == eVar.mo15373f()) {
                                    return true;
                                }
                            }
                        }
                    } else if (cVar.equals(eVar.mo15369b())) {
                        c7745c0 = this.f42560j;
                        if (c7745c0 == null) {
                            if (eVar.mo15371d() == null) {
                                if (this.f42561k == eVar.mo15373f()) {
                                    return true;
                                }
                            }
                        } else if (c7745c0.equals(eVar.mo15371d())) {
                            if (this.f42561k == eVar.mo15373f()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: f */
    public final int mo15373f() {
        return this.f42561k;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: g */
    public final String mo15374g() {
        return this.f42552b;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: h */
    public final AbstractC7743b0.e.AbstractC10663e mo15375h() {
        return this.f42558h;
    }

    public final int hashCode() {
        int iHashCode = (((this.f42551a.hashCode() ^ 1000003) * 1000003) ^ this.f42552b.hashCode()) * 1000003;
        long j10 = this.f42553c;
        int i10 = (iHashCode ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        Long l10 = this.f42554d;
        int iHashCode2 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f42555e ? 1231 : 1237)) * 1000003) ^ this.f42556f.hashCode()) * 1000003;
        AbstractC7743b0.e.f fVar = this.f42557g;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC7743b0.e.AbstractC10663e abstractC10663e = this.f42558h;
        int iHashCode4 = (iHashCode3 ^ (abstractC10663e == null ? 0 : abstractC10663e.hashCode())) * 1000003;
        AbstractC7743b0.e.c cVar = this.f42559i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C7745c0<AbstractC7743b0.e.d> c7745c0 = this.f42560j;
        return ((iHashCode5 ^ (c7745c0 != null ? c7745c0.hashCode() : 0)) * 1000003) ^ this.f42561k;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: i */
    public final long mo15376i() {
        return this.f42553c;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: j */
    public final AbstractC7743b0.e.f mo15377j() {
        return this.f42557g;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: k */
    public final boolean mo15378k() {
        return this.f42555e;
    }

    @Override // ne.AbstractC7743b0.e
    /* JADX INFO: renamed from: l */
    public final a mo15379l() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f42551a);
        sb2.append(", identifier=");
        sb2.append(this.f42552b);
        sb2.append(", startedAt=");
        sb2.append(this.f42553c);
        sb2.append(", endedAt=");
        sb2.append(this.f42554d);
        sb2.append(", crashed=");
        sb2.append(this.f42555e);
        sb2.append(", app=");
        sb2.append(this.f42556f);
        sb2.append(", user=");
        sb2.append(this.f42557g);
        sb2.append(", os=");
        sb2.append(this.f42558h);
        sb2.append(", device=");
        sb2.append(this.f42559i);
        sb2.append(", events=");
        sb2.append(this.f42560j);
        sb2.append(", generatorType=");
        return C0166e.m768o(sb2, this.f42561k, "}");
    }
}
