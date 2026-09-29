package p000;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
public abstract class ra1 {

    /* JADX INFO: renamed from: a */
    public static final vh9 f58959a = new vh9(new C3288l7(6));

    /* JADX INFO: renamed from: a */
    public static final long m20488a(pa1 pa1Var, long j) {
        long j2 = pa1Var.f55842a;
        long j3 = pa1Var.f55836U;
        long j4 = pa1Var.f55832Q;
        long j5 = pa1Var.f55828M;
        long j6 = pa1Var.f55873q;
        if (aa1.m199c(j, j2)) {
            return pa1Var.f55844b;
        }
        if (aa1.m199c(j, pa1Var.f55852f)) {
            return pa1Var.f55854g;
        }
        if (aa1.m199c(j, pa1Var.f55860j)) {
            return pa1Var.f55862k;
        }
        if (aa1.m199c(j, pa1Var.f55868n)) {
            return pa1Var.f55870o;
        }
        if (aa1.m199c(j, pa1Var.f55879w)) {
            return pa1Var.f55880x;
        }
        if (aa1.m199c(j, pa1Var.f55846c)) {
            return pa1Var.f55848d;
        }
        if (aa1.m199c(j, pa1Var.f55856h)) {
            return pa1Var.f55858i;
        }
        if (aa1.m199c(j, pa1Var.f55864l)) {
            return pa1Var.f55866m;
        }
        if (aa1.m199c(j, pa1Var.f55881y)) {
            return pa1Var.f55882z;
        }
        if (aa1.m199c(j, pa1Var.f55877u)) {
            return pa1Var.f55878v;
        }
        if (aa1.m199c(j, pa1Var.f55872p)) {
            return j6;
        }
        if (aa1.m199c(j, pa1Var.f55874r)) {
            return pa1Var.f55875s;
        }
        if (aa1.m199c(j, pa1Var.f55819D) || aa1.m199c(j, pa1Var.f55821F) || aa1.m199c(j, pa1Var.f55822G) || aa1.m199c(j, pa1Var.f55823H) || aa1.m199c(j, pa1Var.f55824I) || aa1.m199c(j, pa1Var.f55825J) || aa1.m199c(j, pa1Var.f55820E)) {
            return j6;
        }
        if (aa1.m199c(j, pa1Var.f55826K) || aa1.m199c(j, pa1Var.f55827L)) {
            return j5;
        }
        if (aa1.m199c(j, pa1Var.f55830O) || aa1.m199c(j, pa1Var.f55831P)) {
            return j4;
        }
        if (aa1.m199c(j, pa1Var.f55834S) || aa1.m199c(j, pa1Var.f55835T)) {
            return j3;
        }
        int i = aa1.f413l;
        return aa1.f412k;
    }

    /* JADX INFO: renamed from: b */
    public static final long m20489b(long j, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(89373914);
        long jM20488a = m20488a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
        if (jM20488a == 16) {
            jM20488a = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
        }
        tj3Var.m22139q(false);
        return jM20488a;
    }

    /* JADX INFO: renamed from: c */
    public static pa1 m20490c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, int i2) {
        long j36 = (i & 1) != 0 ? da1.f35283z : j;
        return new pa1(j36, (i & 2) != 0 ? da1.f35267j : j2, (i & 4) != 0 ? da1.f35237A : j3, (i & 8) != 0 ? da1.f35268k : j4, (i & 16) != 0 ? da1.f35262e : j5, (i & 32) != 0 ? da1.f35241E : j6, (i & 64) != 0 ? da1.f35271n : j7, (i & 128) != 0 ? da1.f35242F : j8, (i & 256) != 0 ? da1.f35272o : j9, (i & 512) != 0 ? da1.f35254R : j10, (i & 1024) != 0 ? da1.f35277t : j11, (i & 2048) != 0 ? da1.f35255S : j12, (i & 4096) != 0 ? da1.f35278u : j13, (i & 8192) != 0 ? da1.f35258a : j14, (i & 16384) != 0 ? da1.f35264g : j15, (32768 & i) != 0 ? da1.f35245I : j16, (65536 & i) != 0 ? da1.f35275r : j17, (131072 & i) != 0 ? da1.f35253Q : j18, (262144 & i) != 0 ? da1.f35276s : j19, j36, (1048576 & i) != 0 ? da1.f35263f : j20, (2097152 & i) != 0 ? da1.f35261d : j21, (4194304 & i) != 0 ? da1.f35259b : j22, (8388608 & i) != 0 ? da1.f35265h : j23, (16777216 & i) != 0 ? da1.f35260c : j24, (33554432 & i) != 0 ? da1.f35266i : j25, (67108864 & i) != 0 ? da1.f35281x : j26, (134217728 & i) != 0 ? da1.f35282y : j27, (268435456 & i) != 0 ? da1.f35240D : j28, (536870912 & i) != 0 ? da1.f35246J : j29, (i2 & 8) != 0 ? da1.f35252P : j35, (1073741824 & i) != 0 ? da1.f35247K : j30, (i & Integer.MIN_VALUE) != 0 ? da1.f35248L : j31, (i2 & 1) != 0 ? da1.f35249M : j32, (i2 & 2) != 0 ? da1.f35250N : j33, (i2 & 4) != 0 ? da1.f35251O : j34, da1.f35238B, da1.f35239C, da1.f35269l, da1.f35270m, da1.f35243G, da1.f35244H, da1.f35273p, da1.f35274q, da1.f35256T, da1.f35257U, da1.f35279v, da1.f35280w);
    }

    /* JADX INFO: renamed from: d */
    public static final long m20491d(pa1 pa1Var, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (qa1.f57486a[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return pa1Var.f55868n;
            case 2:
                return pa1Var.f55879w;
            case 3:
                return pa1Var.f55881y;
            case 4:
                return pa1Var.f55878v;
            case 5:
                return pa1Var.f55850e;
            case 6:
                return pa1Var.f55877u;
            case 7:
                return pa1Var.f55870o;
            case 8:
                return pa1Var.f55880x;
            case 9:
                return pa1Var.f55882z;
            case 10:
                return pa1Var.f55844b;
            case 11:
                return pa1Var.f55848d;
            case 12:
                return pa1Var.f55854g;
            case 13:
                return pa1Var.f55858i;
            case 14:
                return pa1Var.f55873q;
            case 15:
                return pa1Var.f55875s;
            case 16:
                return pa1Var.f55876t;
            case 17:
                return pa1Var.f55862k;
            case 18:
                return pa1Var.f55866m;
            case 19:
                return pa1Var.f55816A;
            case 20:
                return pa1Var.f55817B;
            case 21:
                return pa1Var.f55842a;
            case 22:
                return pa1Var.f55846c;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return pa1Var.f55818C;
            case 24:
                return pa1Var.f55852f;
            case 25:
                return pa1Var.f55856h;
            case 26:
                return pa1Var.f55872p;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return pa1Var.f55874r;
            case 28:
                return pa1Var.f55819D;
            case 29:
                return pa1Var.f55821F;
            case 30:
                return pa1Var.f55822G;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return pa1Var.f55823H;
            case 32:
                return pa1Var.f55824I;
            case 33:
                return pa1Var.f55825J;
            case 34:
                return pa1Var.f55820E;
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                return pa1Var.f55860j;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return pa1Var.f55864l;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return pa1Var.f55826K;
            case 38:
                return pa1Var.f55827L;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return pa1Var.f55828M;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                return pa1Var.f55829N;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return pa1Var.f55830O;
            case 42:
                return pa1Var.f55831P;
            case 43:
                return pa1Var.f55832Q;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return pa1Var.f55833R;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return pa1Var.f55834S;
            case 46:
                return pa1Var.f55835T;
            case 47:
                return pa1Var.f55836U;
            case eda.f37086g /* 48 */:
                return pa1Var.f55837V;
            default:
                gm5.m12750e();
                return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final long m20492e(ColorSchemeKeyTokens colorSchemeKeyTokens, ye1 ye1Var) {
        return m20491d(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a, colorSchemeKeyTokens);
    }

    /* JADX INFO: renamed from: f */
    public static pa1 m20493f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, int i2) {
        long j36 = (i & 1) != 0 ? ja1.f45326z : j;
        return new pa1(j36, (i & 2) != 0 ? ja1.f45310j : j2, (i & 4) != 0 ? ja1.f45280A : j3, (i & 8) != 0 ? ja1.f45311k : j4, (i & 16) != 0 ? ja1.f45305e : j5, (i & 32) != 0 ? ja1.f45284E : j6, (i & 64) != 0 ? ja1.f45314n : j7, (i & 128) != 0 ? ja1.f45285F : j8, (i & 256) != 0 ? ja1.f45315o : j9, (i & 512) != 0 ? ja1.f45297R : j10, (i & 1024) != 0 ? ja1.f45320t : j11, (i & 2048) != 0 ? ja1.f45298S : j12, (i & 4096) != 0 ? ja1.f45321u : j13, (i & 8192) != 0 ? ja1.f45301a : j14, (i & 16384) != 0 ? ja1.f45307g : j15, (32768 & i) != 0 ? ja1.f45288I : j16, (65536 & i) != 0 ? ja1.f45318r : j17, (131072 & i) != 0 ? ja1.f45296Q : j18, (262144 & i) != 0 ? ja1.f45319s : j19, j36, (1048576 & i) != 0 ? ja1.f45306f : j20, (2097152 & i) != 0 ? ja1.f45304d : j21, (4194304 & i) != 0 ? ja1.f45302b : j22, (8388608 & i) != 0 ? ja1.f45308h : j23, (16777216 & i) != 0 ? ja1.f45303c : j24, (33554432 & i) != 0 ? ja1.f45309i : j25, (67108864 & i) != 0 ? ja1.f45324x : j26, (134217728 & i) != 0 ? ja1.f45325y : j27, (268435456 & i) != 0 ? ja1.f45283D : j28, (536870912 & i) != 0 ? ja1.f45289J : j29, (i2 & 8) != 0 ? ja1.f45295P : j35, (1073741824 & i) != 0 ? ja1.f45290K : j30, (i & Integer.MIN_VALUE) != 0 ? ja1.f45291L : j31, (i2 & 1) != 0 ? ja1.f45292M : j32, (i2 & 2) != 0 ? ja1.f45293N : j33, (i2 & 4) != 0 ? ja1.f45294O : j34, ja1.f45281B, ja1.f45282C, ja1.f45312l, ja1.f45313m, ja1.f45286G, ja1.f45287H, ja1.f45316p, ja1.f45317q, ja1.f45299T, ja1.f45300U, ja1.f45322v, ja1.f45323w);
    }
}
