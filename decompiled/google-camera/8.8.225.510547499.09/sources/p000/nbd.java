package p000;

import java.util.logging.Level;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nbd extends nbn implements nbw {
    protected nbd(Level level) {
        super(level);
    }

    @Override // p000.nbn
    /* JADX INFO: renamed from: a */
    protected final ner mo17255a() {
        return nep.f42148a;
    }

    @Override // p000.nbn
    /* JADX INFO: renamed from: b */
    protected final boolean mo17256b(nbr nbrVar) {
        int iM17263a;
        int i;
        ncr ncrVarMo17285j = mo17285j();
        int iMo17264b = ncrVarMo17285j.mo17264b();
        for (int i2 = 0; i2 < iMo17264b; i2++) {
            if (ncrVarMo17285j.mo17265c(i2).f41965a == "eye3tag") {
                if (ncrVarMo17285j.mo17266d(nbl.f41936a) != null || ncrVarMo17285j.mo17266d(nbl.f41942g) != null) {
                    break;
                    break;
                }
                m17289n(nbl.f41942g, ncb.SMALL);
                break;
            }
        }
        nbm nbmVar = this.f41947c;
        if (nbmVar == null) {
            return true;
        }
        if (nbrVar != null) {
            Integer num = (Integer) nbmVar.mo17266d(nbl.f41937b);
            nbt nbtVar = (nbt) this.f41947c.mo17266d(nbl.f41938c);
            nbm nbmVar2 = this.f41947c;
            lyz lyzVar = nbu.f41961d;
            Object nbuVar = ((ConcurrentHashMap) lyzVar.f39584a).get(nbrVar);
            if (nbuVar == null) {
                nbuVar = new nbu();
                Object objPutIfAbsent = ((ConcurrentHashMap) lyzVar.f39584a).putIfAbsent(nbrVar, nbuVar);
                if (objPutIfAbsent != null) {
                    nbuVar = objPutIfAbsent;
                } else {
                    int i3 = nbmVar2.f41944b;
                    lll lllVar = null;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (nbl.f41939d.equals(nbmVar2.mo17265c(i4))) {
                            Object objMo17267e = nbmVar2.mo17267e(i4);
                            if (objMo17267e instanceof nbx) {
                                if (lllVar == null) {
                                    lllVar = new lll(lyzVar, nbrVar, 8, null);
                                }
                                ((nbx) objMo17267e).m17306a();
                            }
                        }
                    }
                }
            }
            nbu nbuVar2 = (nbu) nbuVar;
            long j = 0;
            if (num != null) {
                if (nbuVar2.f41962a.getAndIncrement() % ((long) num.intValue()) != 0) {
                    return false;
                }
            }
            if (nbtVar != null) {
                long j2 = this.f41946b;
                long j3 = nbuVar2.f41963b.get();
                long nanos = nbtVar.f41958a.toNanos(10000L) + j3;
                if (nanos >= 0) {
                    if (j2 >= nanos) {
                        j = j3;
                    } else if (j3 == 0) {
                    }
                    if (nbuVar2.f41963b.compareAndSet(j, j2)) {
                        nbtVar.f41959b = nbuVar2.f41964c.getAndSet(0);
                    }
                }
                nbuVar2.f41964c.incrementAndGet();
                return false;
            }
        }
        ncb ncbVar = (ncb) this.f41947c.mo17266d(nbl.f41942g);
        if (ncbVar != null) {
            nbz nbzVar = nbl.f41942g;
            nbm nbmVar3 = this.f41947c;
            if (nbmVar3 != null && (iM17263a = nbmVar3.m17263a(nbzVar)) >= 0) {
                int i5 = iM17263a + iM17263a;
                int i6 = i5 + 2;
                while (true) {
                    i = nbmVar3.f41944b;
                    if (i6 >= i + i) {
                        break;
                    }
                    Object obj = nbmVar3.f41943a[i6];
                    if (!obj.equals(nbzVar)) {
                        Object[] objArr = nbmVar3.f41943a;
                        objArr[i5] = obj;
                        objArr[i5 + 1] = objArr[i6 + 1];
                        i5 += 2;
                    }
                    i6 += 2;
                }
                nbmVar3.f41944b = i - ((i6 - i5) >> 1);
                while (i5 < i6) {
                    nbmVar3.f41943a[i5] = null;
                    i5++;
                }
            }
            Throwable th = (Throwable) mo17285j().mo17266d(nbl.f41936a);
            int i7 = ncbVar.f41984f;
            if (i7 <= 0 && i7 != -1) {
                throw new IllegalArgumentException("invalid maximum depth: 0");
            }
            m17289n(nbl.f41936a, new nbs(th, ncbVar, neu.f42156a.mo17429b(nbn.class, i7)));
        }
        return true;
    }
}
