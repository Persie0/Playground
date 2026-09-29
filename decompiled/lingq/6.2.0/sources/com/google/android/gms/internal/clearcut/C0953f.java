package com.google.android.gms.internal.clearcut;

import p000.a4c;
import p000.g9a;
import p000.m1c;
import p000.qcd;
import p000.tsb;
import p000.u3c;
import p000.vnb;
import p000.zmb;
import p000.zqb;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0953f implements m1c {

    /* JADX INFO: renamed from: a */
    public final zmb f11794a;

    /* JADX INFO: renamed from: b */
    public final a4c f11795b;

    /* JADX INFO: renamed from: c */
    public final zqb f11796c;

    public C0953f(a4c a4cVar, zqb zqbVar, zmb zmbVar) {
        this.f11795b = a4cVar;
        zqbVar.getClass();
        this.f11796c = zqbVar;
        this.f11794a = zmbVar;
    }

    @Override // p000.m1c
    /* JADX INFO: renamed from: a */
    public final void mo5306a(Object obj) {
        this.f11795b.getClass();
        ((AbstractC0949b) obj).zzjp.f63371d = false;
        this.f11796c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.m1c
    /* JADX INFO: renamed from: b */
    public final void mo5307b(AbstractC0949b abstractC0949b, AbstractC0949b abstractC0949b2) {
        AbstractC0954g.m5327a(this.f11795b, abstractC0949b, abstractC0949b2);
    }

    @Override // p000.m1c
    /* JADX INFO: renamed from: c */
    public final boolean mo5308c(AbstractC0949b abstractC0949b, AbstractC0949b abstractC0949b2) {
        this.f11795b.getClass();
        return abstractC0949b.zzjp.equals(abstractC0949b2.zzjp);
    }

    @Override // p000.m1c
    /* JADX INFO: renamed from: d */
    public final int mo5309d(AbstractC0949b abstractC0949b) {
        this.f11795b.getClass();
        return abstractC0949b.zzjp.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0062 A[EDGE_INSN: B:51:0x0062->B:28:0x0062 BREAK  A[LOOP:1: B:14:0x0032->B:54:0x0032], SYNTHETIC] */
    @Override // p000.m1c
    /* JADX INFO: renamed from: e */
    public final void mo5310e(Object obj, byte[] bArr, int i, int i2, vnb vnbVar) throws zzco {
        AbstractC0949b abstractC0949b = (AbstractC0949b) obj;
        u3c u3cVarM22437b = abstractC0949b.zzjp;
        if (u3cVarM22437b == u3c.f63367e) {
            u3cVarM22437b = u3c.m22437b();
            abstractC0949b.zzjp = u3cVarM22437b;
        }
        u3c u3cVar = u3cVarM22437b;
        while (i < i2) {
            int iM19867e = qcd.m19867e(bArr, i, vnbVar);
            int i3 = vnbVar.f65674a;
            if (i3 != 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                vnb vnbVar2 = vnbVar;
                i = (i3 & 7) == 2 ? qcd.m19865c(i3, bArr2, iM19867e, i4, u3cVar, vnbVar2) : qcd.m19864b(i3, bArr2, iM19867e, i4, vnbVar2);
            } else {
                byte[] bArr3 = bArr;
                int i5 = i2;
                vnb vnbVar3 = vnbVar;
                int i6 = 0;
                zzbb zzbbVar = null;
                while (true) {
                    if (iM19867e >= i5) {
                        i = iM19867e;
                        break;
                    }
                    i = qcd.m19867e(bArr3, iM19867e, vnbVar3);
                    int i7 = vnbVar3.f65674a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 == 2) {
                        if (i9 != 0) {
                            if (i7 != 12) {
                                break;
                                break;
                            }
                            iM19867e = qcd.m19864b(i7, bArr3, i, i5, vnbVar3);
                        } else {
                            iM19867e = qcd.m19867e(bArr3, i, vnbVar3);
                            i6 = vnbVar3.f65674a;
                        }
                    } else if (i8 != 3 || i9 != 2) {
                        if (i7 != 12) {
                            break;
                        } else {
                            iM19867e = qcd.m19864b(i7, bArr3, i, i5, vnbVar3);
                        }
                    } else {
                        iM19867e = qcd.m19872j(bArr3, i, vnbVar3);
                        zzbbVar = (zzbb) vnbVar3.f65676c;
                    }
                }
                if (zzbbVar != null) {
                    u3cVar.m22438a((i6 << 3) | 2, zzbbVar);
                }
                bArr = bArr3;
                i2 = i5;
                vnbVar = vnbVar3;
            }
        }
        if (i != i2) {
            throw zzco.m5347b();
        }
    }

    @Override // p000.m1c
    /* JADX INFO: renamed from: f */
    public final boolean mo5311f(Object obj) {
        this.f11796c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.m1c
    public final Object newInstance() {
        return ((tsb) ((AbstractC0949b) this.f11794a).mo5293a(5)).m22296c();
    }
}
