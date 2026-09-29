package p000;

import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class bf4 implements hy2 {

    /* JADX INFO: renamed from: b */
    public jy2 f8463b;

    /* JADX INFO: renamed from: c */
    public int f8464c;

    /* JADX INFO: renamed from: d */
    public int f8465d;

    /* JADX INFO: renamed from: e */
    public int f8466e;

    /* JADX INFO: renamed from: g */
    public k36 f8468g;

    /* JADX INFO: renamed from: h */
    public iy2 f8469h;

    /* JADX INFO: renamed from: i */
    public rr3 f8470i;

    /* JADX INFO: renamed from: j */
    public i46 f8471j;

    /* JADX INFO: renamed from: a */
    public final k47 f8462a = new k47(2);

    /* JADX INFO: renamed from: f */
    public long f8467f = -1;

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
        i46 i46Var = this.f8471j;
        if (i46Var != null) {
            i46Var.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) throws ParserException {
        String strM14837u;
        rr3 rr3VarM10753a;
        k36 k36Var;
        long j;
        int i = this.f8464c;
        long j2 = -1;
        k47 k47Var = this.f8462a;
        if (i == 0) {
            k47Var.m14815J(2);
            iy2Var.readFully(k47Var.f46700a, 0, 2);
            int iM14812G = k47Var.m14812G();
            this.f8465d = iM14812G;
            if (iM14812G == 65498) {
                if (this.f8467f != -1) {
                    this.f8464c = 4;
                    return 0;
                }
                m3682g();
                return 0;
            }
            if ((iM14812G < 65488 || iM14812G > 65497) && iM14812G != 65281) {
                this.f8464c = 1;
            }
            return 0;
        }
        if (i == 1) {
            k47Var.m14815J(2);
            iy2Var.mo13085o(k47Var.f46700a, 0, 2);
            this.f8466e = k47Var.m14812G() - 2;
            iy2Var.mo13082k(2);
            this.f8464c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    uk9.m22770c();
                    return 0;
                }
                if (this.f8470i == null || iy2Var != this.f8469h) {
                    this.f8469h = iy2Var;
                    this.f8470i = new rr3(iy2Var, this.f8467f);
                }
                i46 i46Var = this.f8471j;
                i46Var.getClass();
                int iMo110b = i46Var.mo110b(this.f8470i, n63Var);
                if (iMo110b == 1) {
                    n63Var.f52394a += this.f8467f;
                }
                return iMo110b;
            }
            long position = iy2Var.getPosition();
            long j3 = this.f8467f;
            if (position != j3) {
                n63Var.f52394a = j3;
                return 1;
            }
            if (!iy2Var.mo13076d(k47Var.f46700a, 0, 1, true)) {
                m3682g();
                return 0;
            }
            iy2Var.mo13080i();
            if (this.f8471j == null) {
                this.f8471j = new i46(bn9.f8727w, 8);
            }
            rr3 rr3Var = new rr3(iy2Var, this.f8467f);
            this.f8470i = rr3Var;
            if (!this.f8471j.mo111c(rr3Var)) {
                m3682g();
                return 0;
            }
            i46 i46Var2 = this.f8471j;
            long j4 = this.f8467f;
            jy2 jy2Var = this.f8463b;
            jy2Var.getClass();
            i46Var2.mo113f(new rr3(j4, jy2Var, 3));
            k36 k36Var2 = this.f8468g;
            k36Var2.getClass();
            jy2 jy2Var2 = this.f8463b;
            jy2Var2.getClass();
            n8a n8aVarMo2555n = jy2Var2.mo2555n(1024, 4);
            lc3 lc3Var = new lc3();
            lc3Var.f49452m = ez5.m11402l("image/jpeg");
            lc3Var.f49450k = new ey5(k36Var2);
            n8aVarMo2555n.mo2537g(new C0713b(lc3Var));
            this.f8464c = 5;
            return 0;
        }
        if (this.f8465d == 65505) {
            k47 k47Var2 = new k47(this.f8466e);
            iy2Var.readFully(k47Var2.f46700a, 0, this.f8466e);
            if (this.f8468g == null && "http://ns.adobe.com/xap/1.0/".equals(k47Var2.m14837u()) && (strM14837u = k47Var2.m14837u()) != null) {
                long length = iy2Var.getLength();
                if (length == -1) {
                    k36Var = null;
                } else {
                    try {
                        rr3VarM10753a = dyc.m10753a(strM14837u);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        ss5.m21707d0("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        rr3VarM10753a = null;
                    }
                    if (rr3VarM10753a == null) {
                        k36Var = null;
                    } else {
                        List list = (List) rr3VarM10753a.f59739c;
                        if (list.size() < 2) {
                            k36Var = null;
                        } else {
                            int size = list.size() - 1;
                            long j5 = -1;
                            long j6 = -1;
                            long j7 = -1;
                            long j8 = -1;
                            while (size >= 0) {
                                j36 j36Var = (j36) list.get(size);
                                long j9 = j2;
                                boolean z = j36Var.f45009a.equals("video/mp4") || j36Var.f45009a.equals("video/quicktime");
                                if (size == 0) {
                                    length -= j36Var.f45011c;
                                    j = 0;
                                } else {
                                    j = length - j36Var.f45010b;
                                }
                                long j10 = length;
                                length = j;
                                if (z && length != j10) {
                                    j8 = j10 - length;
                                    j7 = length;
                                }
                                if (size == 0) {
                                    j6 = j10;
                                    j5 = length;
                                }
                                size--;
                                j2 = j9;
                            }
                            long j11 = j2;
                            if (j7 == j11 || j8 == j11 || j5 == j11 || j6 == j11) {
                                k36Var = null;
                            } else {
                                k36Var = new k36(j5, j6, rr3VarM10753a.f59738b, j7, j8);
                            }
                        }
                    }
                }
                this.f8468g = k36Var;
                if (k36Var != null) {
                    this.f8467f = k36Var.f46623d;
                }
            }
        } else {
            iy2Var.mo13082k(this.f8466e);
        }
        this.f8464c = 0;
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        String strM14837u;
        h62 h62Var = (h62) iy2Var;
        k47 k47Var = this.f8462a;
        k47Var.m14815J(2);
        h62Var.mo13076d(k47Var.f46700a, 0, 2, false);
        if (k47Var.m14812G() == 65496) {
            while (true) {
                k47Var.m14815J(2);
                h62Var.mo13076d(k47Var.f46700a, 0, 2, false);
                int iM14812G = k47Var.m14812G();
                this.f8465d = iM14812G;
                if (iM14812G == 65498) {
                    break;
                }
                k47Var.m14815J(2);
                h62Var.mo13085o(k47Var.f46700a, 0, 2);
                int iM14812G2 = k47Var.m14812G() - 2;
                if (iM14812G2 < 0) {
                    break;
                }
                if (this.f8465d != 65505) {
                    h62Var.m13081j(iM14812G2, false);
                } else {
                    k47Var.m14815J(iM14812G2);
                    h62Var.mo13076d(k47Var.f46700a, 0, iM14812G2, false);
                    if (Objects.equals(k47Var.m14837u(), "http://ns.adobe.com/xap/1.0/") && (strM14837u = k47Var.m14837u()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (strM14837u.contains(dyc.f36431a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        if (j == 0) {
            this.f8464c = 0;
            this.f8471j = null;
        } else if (this.f8464c == 5) {
            i46 i46Var = this.f8471j;
            i46Var.getClass();
            i46Var.mo112d(j, j2);
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f8463b = jy2Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m3682g() {
        jy2 jy2Var = this.f8463b;
        jy2Var.getClass();
        jy2Var.mo2551j();
        this.f8463b.mo2558q(new h60(-9223372036854775807L));
        this.f8464c = 6;
    }
}
