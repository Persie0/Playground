package p000;

import androidx.media3.common.C0713b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rn2 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59572a;

    /* JADX INFO: renamed from: b */
    public boolean f59573b;

    /* JADX INFO: renamed from: c */
    public long f59574c;

    /* JADX INFO: renamed from: d */
    public int f59575d;

    /* JADX INFO: renamed from: e */
    public int f59576e;

    /* JADX INFO: renamed from: f */
    public final Object f59577f;

    /* JADX INFO: renamed from: g */
    public Object f59578g;

    public rn2(List list) {
        this.f59572a = 0;
        this.f59577f = list;
        this.f59578g = new n8a[list.size()];
        this.f59574c = -9223372036854775807L;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) {
        boolean z;
        boolean z2;
        switch (this.f59572a) {
            case 0:
                if (this.f59573b) {
                    if (this.f59575d == 2) {
                        if (k47Var.m14820a() == 0) {
                            z2 = false;
                        } else {
                            if (k47Var.m14842z() != 32) {
                                this.f59573b = false;
                            }
                            this.f59575d--;
                            z2 = this.f59573b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.f59575d == 1) {
                        if (k47Var.m14820a() == 0) {
                            z = false;
                        } else {
                            if (k47Var.m14842z() != 0) {
                                this.f59573b = false;
                            }
                            this.f59575d--;
                            z = this.f59573b;
                        }
                        if (!z) {
                        }
                    }
                    int i = k47Var.f46701b;
                    int iM14820a = k47Var.m14820a();
                    for (n8a n8aVar : (n8a[]) this.f59578g) {
                        k47Var.m14818M(i);
                        n8aVar.mo2535e(iM14820a, k47Var);
                    }
                    this.f59576e += iM14820a;
                }
                break;
            default:
                k47 k47Var2 = (k47) this.f59577f;
                ((n8a) this.f59578g).getClass();
                if (this.f59573b) {
                    int iM14820a2 = k47Var.m14820a();
                    int i2 = this.f59576e;
                    if (i2 < 10) {
                        int iMin = Math.min(iM14820a2, 10 - i2);
                        System.arraycopy(k47Var.f46700a, k47Var.f46701b, k47Var2.f46700a, this.f59576e, iMin);
                        if (this.f59576e + iMin == 10) {
                            k47Var2.m14818M(0);
                            if (73 == k47Var2.m14842z() && 68 == k47Var2.m14842z() && 51 == k47Var2.m14842z()) {
                                k47Var2.m14819N(3);
                                this.f59575d = k47Var2.m14841y() + 10;
                            } else {
                                ss5.m21707d0("Id3Reader", "Discarding invalid ID3 tag");
                                this.f59573b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM14820a2, this.f59575d - this.f59576e);
                    ((n8a) this.f59578g).mo2535e(iMin2, k47Var);
                    this.f59576e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        switch (this.f59572a) {
            case 0:
                this.f59573b = false;
                this.f59574c = -9223372036854775807L;
                break;
            default:
                this.f59573b = false;
                this.f59574c = -9223372036854775807L;
                break;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
        int i;
        switch (this.f59572a) {
            case 0:
                if (this.f59573b) {
                    bna.m3987z(this.f59574c != -9223372036854775807L);
                    for (n8a n8aVar : (n8a[]) this.f59578g) {
                        n8aVar.mo2531a(this.f59574c, 1, this.f59576e, 0, null);
                    }
                    this.f59573b = false;
                }
                break;
            default:
                ((n8a) this.f59578g).getClass();
                if (this.f59573b && (i = this.f59575d) != 0 && this.f59576e == i) {
                    bna.m3987z(this.f59574c != -9223372036854775807L);
                    ((n8a) this.f59578g).mo2531a(this.f59574c, 1, this.f59575d, 0, null);
                    this.f59573b = false;
                    break;
                }
                break;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        switch (this.f59572a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f59573b = true;
                    this.f59574c = j;
                    this.f59576e = 0;
                    this.f59575d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f59573b = true;
                    this.f59574c = j;
                    this.f59575d = 0;
                    this.f59576e = 0;
                    break;
                }
                break;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        switch (this.f59572a) {
            case 0:
                n8a[] n8aVarArr = (n8a[]) this.f59578g;
                for (int i = 0; i < n8aVarArr.length; i++) {
                    lca lcaVar = (lca) ((List) this.f59577f).get(i);
                    mcaVar.m16767a();
                    mcaVar.m16768b();
                    n8a n8aVarMo2555n = jy2Var.mo2555n(mcaVar.f51086d, 3);
                    lc3 lc3Var = new lc3();
                    mcaVar.m16768b();
                    lc3Var.f49440a = mcaVar.f51087e;
                    lc3Var.f49452m = ez5.m11402l("video/mp2t");
                    lc3Var.f49453n = ez5.m11402l("application/dvbsubs");
                    lc3Var.f49456q = Collections.singletonList(lcaVar.f49481b);
                    lc3Var.f49443d = lcaVar.f49480a;
                    n8aVarMo2555n.mo2537g(new C0713b(lc3Var));
                    n8aVarArr[i] = n8aVarMo2555n;
                }
                break;
            default:
                mcaVar.m16767a();
                mcaVar.m16768b();
                n8a n8aVarMo2555n2 = jy2Var.mo2555n(mcaVar.f51086d, 5);
                this.f59578g = n8aVarMo2555n2;
                lc3 lc3Var2 = new lc3();
                mcaVar.m16768b();
                lc3Var2.f49440a = mcaVar.f51087e;
                lc3Var2.f49452m = ez5.m11402l("video/mp2t");
                lc3Var2.f49453n = ez5.m11402l("application/id3");
                n8aVarMo2555n2.mo2537g(new C0713b(lc3Var2));
                break;
        }
    }

    public rn2() {
        this.f59572a = 1;
        this.f59577f = new k47(10);
        this.f59574c = -9223372036854775807L;
    }
}
