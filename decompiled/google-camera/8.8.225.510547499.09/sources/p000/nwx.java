package p000;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nwx implements nzi {

    /* JADX INFO: renamed from: a */
    public final nww f44880a;

    /* JADX INFO: renamed from: b */
    public int f44881b;

    /* JADX INFO: renamed from: c */
    public int f44882c = 0;

    /* JADX INFO: renamed from: d */
    private int f44883d;

    private nwx(nww nwwVar) {
        Charset charset = nxz.f44985a;
        this.f44880a = nwwVar;
        nwwVar.f44879c = this;
    }

    /* JADX INFO: renamed from: Q */
    private final void m17880Q(Object obj, nzm nzmVar, nxf nxfVar) {
        int i = this.f44883d;
        this.f44883d = oal.m18388c(oal.m18386a(this.f44881b), 4);
        try {
            nzmVar.mo18252h(obj, this, nxfVar);
            if (this.f44881b != this.f44883d) {
                throw nyb.m18165g();
            }
            this.f44883d = i;
        } catch (Throwable th) {
            this.f44883d = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m17881R(Object obj, nzm nzmVar, nxf nxfVar) throws nyb {
        int iMo17827n = this.f44880a.mo17827n();
        nww nwwVar = this.f44880a;
        if (nwwVar.f44877a >= nwwVar.f44878b) {
            throw new nyb("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo17818e = nwwVar.mo17818e(iMo17827n);
        this.f44880a.f44877a++;
        nzmVar.mo18252h(obj, this, nxfVar);
        this.f44880a.mo17839z(0);
        nww nwwVar2 = this.f44880a;
        nwwVar2.f44877a--;
        nwwVar2.mo17809A(iMo17818e);
    }

    /* JADX INFO: renamed from: S */
    private final void m17882S(int i) throws nyb {
        if (this.f44880a.mo17817d() != i) {
            throw nyb.m18167i();
        }
    }

    /* JADX INFO: renamed from: T */
    private static final void m17883T(int i) throws nyb {
        if ((i & 3) != 0) {
            throw nyb.m18165g();
        }
    }

    /* JADX INFO: renamed from: U */
    private static final void m17884U(int i) throws nyb {
        if ((i & 7) != 0) {
            throw nyb.m18165g();
        }
    }

    /* JADX INFO: renamed from: p */
    public static nwx m17885p(nww nwwVar) {
        nwx nwxVar = nwwVar.f44879c;
        return nwxVar != null ? nwxVar : new nwx(nwwVar);
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: A */
    public final void mo17886A(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxr)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Integer.valueOf(this.f44880a.mo17819f()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.f44880a.mo17819f()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxr nxrVar = (nxr) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nxrVar.mo18148g(this.f44880a.mo17819f());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nxrVar.mo18148g(this.f44880a.mo17819f());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: B */
    public final void mo17887B(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxr)) {
            switch (oal.m18387b(this.f44881b)) {
                case 2:
                    int iMo17827n = this.f44880a.mo17827n();
                    m17883T(iMo17827n);
                    int iMo17817d = this.f44880a.mo17817d() + iMo17827n;
                    do {
                        list.add(Integer.valueOf(this.f44880a.mo17820g()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    return;
                case 5:
                    break;
                default:
                    throw nyb.m18159a();
            }
            do {
                list.add(Integer.valueOf(this.f44880a.mo17820g()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxr nxrVar = (nxr) list;
        switch (oal.m18387b(this.f44881b)) {
            case 2:
                int iMo17827n2 = this.f44880a.mo17827n();
                m17883T(iMo17827n2);
                int iMo17817d2 = this.f44880a.mo17817d() + iMo17827n2;
                do {
                    nxrVar.mo18148g(this.f44880a.mo17820g());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                return;
            case 5:
                break;
            default:
                throw nyb.m18159a();
        }
        do {
            nxrVar.mo18148g(this.f44880a.mo17820g());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: C */
    public final void mo17888C(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nyn)) {
            switch (oal.m18387b(this.f44881b)) {
                case 1:
                    break;
                case 2:
                    int iMo17827n = this.f44880a.mo17827n();
                    m17884U(iMo17827n);
                    int iMo17817d = this.f44880a.mo17817d() + iMo17827n;
                    do {
                        list.add(Long.valueOf(this.f44880a.mo17828o()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    return;
                default:
                    throw nyb.m18159a();
            }
            do {
                list.add(Long.valueOf(this.f44880a.mo17828o()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nyn nynVar = (nyn) list;
        switch (oal.m18387b(this.f44881b)) {
            case 1:
                break;
            case 2:
                int iMo17827n2 = this.f44880a.mo17827n();
                m17884U(iMo17827n2);
                int iMo17817d2 = this.f44880a.mo17817d() + iMo17827n2;
                do {
                    nynVar.mo18151f(this.f44880a.mo17828o());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                return;
            default:
                throw nyb.m18159a();
        }
        do {
            nynVar.mo18151f(this.f44880a.mo17828o());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: D */
    public final void mo17889D(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxj)) {
            switch (oal.m18387b(this.f44881b)) {
                case 2:
                    int iMo17827n = this.f44880a.mo17827n();
                    m17883T(iMo17827n);
                    int iMo17817d = this.f44880a.mo17817d() + iMo17827n;
                    do {
                        list.add(Float.valueOf(this.f44880a.mo17816c()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    return;
                case 5:
                    break;
                default:
                    throw nyb.m18159a();
            }
            do {
                list.add(Float.valueOf(this.f44880a.mo17816c()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxj nxjVar = (nxj) list;
        switch (oal.m18387b(this.f44881b)) {
            case 2:
                int iMo17827n2 = this.f44880a.mo17827n();
                m17883T(iMo17827n2);
                int iMo17817d2 = this.f44880a.mo17817d() + iMo17827n2;
                do {
                    nxjVar.mo18034g(this.f44880a.mo17816c());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                return;
            case 5:
                break;
            default:
                throw nyb.m18159a();
        }
        do {
            nxjVar.mo18034g(this.f44880a.mo17816c());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: E */
    public final void mo17890E(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxr)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Integer.valueOf(this.f44880a.mo17821h()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.f44880a.mo17821h()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxr nxrVar = (nxr) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nxrVar.mo18148g(this.f44880a.mo17821h());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nxrVar.mo18148g(this.f44880a.mo17821h());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: F */
    public final void mo17891F(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nyn)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Long.valueOf(this.f44880a.mo17829p()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Long.valueOf(this.f44880a.mo17829p()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nyn nynVar = (nyn) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nynVar.mo18151f(this.f44880a.mo17829p());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nynVar.mo18151f(this.f44880a.mo17829p());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: G */
    public final void mo17892G(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxr)) {
            switch (oal.m18387b(this.f44881b)) {
                case 2:
                    int iMo17827n = this.f44880a.mo17827n();
                    m17883T(iMo17827n);
                    int iMo17817d = this.f44880a.mo17817d() + iMo17827n;
                    do {
                        list.add(Integer.valueOf(this.f44880a.mo17824k()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    return;
                case 5:
                    break;
                default:
                    throw nyb.m18159a();
            }
            do {
                list.add(Integer.valueOf(this.f44880a.mo17824k()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxr nxrVar = (nxr) list;
        switch (oal.m18387b(this.f44881b)) {
            case 2:
                int iMo17827n2 = this.f44880a.mo17827n();
                m17883T(iMo17827n2);
                int iMo17817d2 = this.f44880a.mo17817d() + iMo17827n2;
                do {
                    nxrVar.mo18148g(this.f44880a.mo17824k());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                return;
            case 5:
                break;
            default:
                throw nyb.m18159a();
        }
        do {
            nxrVar.mo18148g(this.f44880a.mo17824k());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: H */
    public final void mo17893H(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nyn)) {
            switch (oal.m18387b(this.f44881b)) {
                case 1:
                    break;
                case 2:
                    int iMo17827n = this.f44880a.mo17827n();
                    m17884U(iMo17827n);
                    int iMo17817d = this.f44880a.mo17817d() + iMo17827n;
                    do {
                        list.add(Long.valueOf(this.f44880a.mo17833t()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    return;
                default:
                    throw nyb.m18159a();
            }
            do {
                list.add(Long.valueOf(this.f44880a.mo17833t()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nyn nynVar = (nyn) list;
        switch (oal.m18387b(this.f44881b)) {
            case 1:
                break;
            case 2:
                int iMo17827n2 = this.f44880a.mo17827n();
                m17884U(iMo17827n2);
                int iMo17817d2 = this.f44880a.mo17817d() + iMo17827n2;
                do {
                    nynVar.mo18151f(this.f44880a.mo17833t());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                return;
            default:
                throw nyb.m18159a();
        }
        do {
            nynVar.mo18151f(this.f44880a.mo17833t());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: I */
    public final void mo17894I(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxr)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Integer.valueOf(this.f44880a.mo17825l()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.f44880a.mo17825l()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxr nxrVar = (nxr) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nxrVar.mo18148g(this.f44880a.mo17825l());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nxrVar.mo18148g(this.f44880a.mo17825l());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: J */
    public final void mo17895J(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nyn)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Long.valueOf(this.f44880a.mo17834u()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Long.valueOf(this.f44880a.mo17834u()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nyn nynVar = (nyn) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nynVar.mo18151f(this.f44880a.mo17834u());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nynVar.mo18151f(this.f44880a.mo17834u());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    /* JADX INFO: renamed from: K */
    public final void m17896K(List list, boolean z) throws nya {
        int iMo17826m;
        int iMo17826m2;
        if (oal.m18387b(this.f44881b) != 2) {
            throw nyb.m18159a();
        }
        if (!(list instanceof nyj) || z) {
            do {
                list.add(z ? mo17922v() : mo17921u());
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nyj nyjVar = (nyj) list;
        do {
            nyjVar.mo18178i(mo17916o());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: L */
    public final void mo17897L(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxr)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Integer.valueOf(this.f44880a.mo17827n()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.f44880a.mo17827n()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxr nxrVar = (nxr) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nxrVar.mo18148g(this.f44880a.mo17827n());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nxrVar.mo18148g(this.f44880a.mo17827n());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: M */
    public final void mo17898M(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nyn)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Long.valueOf(this.f44880a.mo17835v()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Long.valueOf(this.f44880a.mo17835v()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nyn nynVar = (nyn) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nynVar.mo18151f(this.f44880a.mo17835v());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nynVar.mo18151f(this.f44880a.mo17835v());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    /* JADX INFO: renamed from: N */
    public final void m17899N(int i) throws nya {
        if (oal.m18387b(this.f44881b) != i) {
            throw nyb.m18159a();
        }
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: O */
    public final boolean mo17900O() throws nya {
        m17899N(0);
        return this.f44880a.mo17812D();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: P */
    public final boolean mo17901P() {
        int i;
        if (this.f44880a.mo17811C() || (i = this.f44881b) == this.f44883d) {
            return false;
        }
        return this.f44880a.mo17813E(i);
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: a */
    public final double mo17902a() throws nya {
        m17899N(1);
        return this.f44880a.mo17815b();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: b */
    public final float mo17903b() throws nya {
        m17899N(5);
        return this.f44880a.mo17816c();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: c */
    public final int mo17904c() {
        int iMo17826m = this.f44882c;
        if (iMo17826m != 0) {
            this.f44881b = iMo17826m;
            this.f44882c = 0;
        } else {
            iMo17826m = this.f44880a.mo17826m();
            this.f44881b = iMo17826m;
        }
        if (iMo17826m == 0 || iMo17826m == this.f44883d) {
            return Integer.MAX_VALUE;
        }
        return oal.m18386a(iMo17826m);
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: d */
    public final int mo17905d() throws nya {
        m17899N(0);
        return this.f44880a.mo17819f();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: e */
    public final int mo17906e() throws nya {
        m17899N(5);
        return this.f44880a.mo17820g();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: f */
    public final int mo17907f() throws nya {
        m17899N(0);
        return this.f44880a.mo17821h();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: g */
    public final int mo17908g() throws nya {
        m17899N(5);
        return this.f44880a.mo17824k();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: h */
    public final int mo17909h() throws nya {
        m17899N(0);
        return this.f44880a.mo17825l();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: i */
    public final int mo17910i() throws nya {
        m17899N(0);
        return this.f44880a.mo17827n();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: j */
    public final long mo17911j() throws nya {
        m17899N(1);
        return this.f44880a.mo17828o();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: k */
    public final long mo17912k() throws nya {
        m17899N(0);
        return this.f44880a.mo17829p();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: l */
    public final long mo17913l() throws nya {
        m17899N(1);
        return this.f44880a.mo17833t();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: m */
    public final long mo17914m() throws nya {
        m17899N(0);
        return this.f44880a.mo17834u();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: n */
    public final long mo17915n() throws nya {
        m17899N(0);
        return this.f44880a.mo17835v();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: o */
    public final nwr mo17916o() throws nya {
        m17899N(2);
        return this.f44880a.mo17836w();
    }

    /* JADX INFO: renamed from: q */
    public final Object m17917q(oaj oajVar, Class cls, nxf nxfVar) {
        oaj oajVar2 = oaj.DOUBLE;
        switch (oajVar) {
            case DOUBLE:
                return Double.valueOf(mo17902a());
            case FLOAT:
                return Float.valueOf(mo17903b());
            case f45133c:
                return Long.valueOf(mo17912k());
            case UINT64:
                return Long.valueOf(mo17915n());
            case INT32:
                return Integer.valueOf(mo17907f());
            case FIXED64:
                return Long.valueOf(mo17911j());
            case FIXED32:
                return Integer.valueOf(mo17906e());
            case BOOL:
                return Boolean.valueOf(mo17900O());
            case STRING:
                return mo17922v();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case f45141k:
                return mo17920t(cls, nxfVar);
            case BYTES:
                return mo17916o();
            case UINT32:
                return Integer.valueOf(mo17910i());
            case ENUM:
                return Integer.valueOf(mo17905d());
            case SFIXED32:
                return Integer.valueOf(mo17908g());
            case SFIXED64:
                return Long.valueOf(mo17913l());
            case f45147q:
                return Integer.valueOf(mo17909h());
            case SINT64:
                return Long.valueOf(mo17914m());
        }
    }

    /* JADX INFO: renamed from: r */
    public final Object m17918r(nzm nzmVar, nxf nxfVar) {
        Object objMo18249e = nzmVar.mo18249e();
        m17880Q(objMo18249e, nzmVar, nxfVar);
        nzmVar.mo18250f(objMo18249e);
        return objMo18249e;
    }

    /* JADX INFO: renamed from: s */
    public final Object m17919s(nzm nzmVar, nxf nxfVar) throws nyb {
        Object objMo18249e = nzmVar.mo18249e();
        m17881R(objMo18249e, nzmVar, nxfVar);
        nzmVar.mo18250f(objMo18249e);
        return objMo18249e;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: t */
    public final Object mo17920t(Class cls, nxf nxfVar) throws nya {
        m17899N(2);
        return m17919s(nzf.f45060a.m18259a(cls), nxfVar);
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: u */
    public final String mo17921u() throws nya {
        m17899N(2);
        return this.f44880a.mo17837x();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: v */
    public final String mo17922v() throws nya {
        m17899N(2);
        return this.f44880a.mo17838y();
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: w */
    public final void mo17923w(Object obj, nzm nzmVar, nxf nxfVar) throws nya {
        m17899N(3);
        m17880Q(obj, nzmVar, nxfVar);
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: x */
    public final void mo17924x(Object obj, nzm nzmVar, nxf nxfVar) throws nyb {
        m17899N(2);
        m17881R(obj, nzmVar, nxfVar);
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: y */
    public final void mo17925y(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nwj)) {
            switch (oal.m18387b(this.f44881b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw nyb.m18159a();
                case 2:
                    int iMo17817d = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                    do {
                        list.add(Boolean.valueOf(this.f44880a.mo17812D()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    m17882S(iMo17817d);
                    return;
            }
            do {
                list.add(Boolean.valueOf(this.f44880a.mo17812D()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nwj nwjVar = (nwj) list;
        switch (oal.m18387b(this.f44881b)) {
            case 0:
                break;
            case 1:
            default:
                throw nyb.m18159a();
            case 2:
                int iMo17817d2 = this.f44880a.mo17817d() + this.f44880a.mo17827n();
                do {
                    nwjVar.mo17776f(this.f44880a.mo17812D());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                m17882S(iMo17817d2);
                return;
        }
        do {
            nwjVar.mo17776f(this.f44880a.mo17812D());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }

    @Override // p000.nzi
    /* JADX INFO: renamed from: z */
    public final void mo17926z(List list) throws nyb {
        int iMo17826m;
        int iMo17826m2;
        if (!(list instanceof nxc)) {
            switch (oal.m18387b(this.f44881b)) {
                case 1:
                    break;
                case 2:
                    int iMo17827n = this.f44880a.mo17827n();
                    m17884U(iMo17827n);
                    int iMo17817d = this.f44880a.mo17817d() + iMo17827n;
                    do {
                        list.add(Double.valueOf(this.f44880a.mo17815b()));
                    } while (this.f44880a.mo17817d() < iMo17817d);
                    return;
                default:
                    throw nyb.m18159a();
            }
            do {
                list.add(Double.valueOf(this.f44880a.mo17815b()));
                if (this.f44880a.mo17811C()) {
                    return;
                } else {
                    iMo17826m = this.f44880a.mo17826m();
                }
            } while (iMo17826m == this.f44881b);
            this.f44882c = iMo17826m;
            return;
        }
        nxc nxcVar = (nxc) list;
        switch (oal.m18387b(this.f44881b)) {
            case 1:
                break;
            case 2:
                int iMo17827n2 = this.f44880a.mo17827n();
                m17884U(iMo17827n2);
                int iMo17817d2 = this.f44880a.mo17817d() + iMo17827n2;
                do {
                    nxcVar.m18010d(this.f44880a.mo17815b());
                } while (this.f44880a.mo17817d() < iMo17817d2);
                return;
            default:
                throw nyb.m18159a();
        }
        do {
            nxcVar.m18010d(this.f44880a.mo17815b());
            if (this.f44880a.mo17811C()) {
                return;
            } else {
                iMo17826m2 = this.f44880a.mo17826m();
            }
        } while (iMo17826m2 == this.f44881b);
        this.f44882c = iMo17826m2;
    }
}
