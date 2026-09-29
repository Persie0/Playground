package p000;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tu5 {

    /* JADX INFO: renamed from: B */
    public static final tu5 f62885B;

    /* JADX INFO: renamed from: A */
    public final ImmutableList f62886A;

    /* JADX INFO: renamed from: a */
    public final CharSequence f62887a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f62888b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f62889c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f62890d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f62891e;

    /* JADX INFO: renamed from: f */
    public final byte[] f62892f;

    /* JADX INFO: renamed from: g */
    public final Integer f62893g;

    /* JADX INFO: renamed from: h */
    public final Integer f62894h;

    /* JADX INFO: renamed from: i */
    public final Integer f62895i;

    /* JADX INFO: renamed from: j */
    public final Integer f62896j;

    /* JADX INFO: renamed from: k */
    public final Boolean f62897k;

    /* JADX INFO: renamed from: l */
    public final Integer f62898l;

    /* JADX INFO: renamed from: m */
    public final Integer f62899m;

    /* JADX INFO: renamed from: n */
    public final Integer f62900n;

    /* JADX INFO: renamed from: o */
    public final Integer f62901o;

    /* JADX INFO: renamed from: p */
    public final Integer f62902p;

    /* JADX INFO: renamed from: q */
    public final Integer f62903q;

    /* JADX INFO: renamed from: r */
    public final Integer f62904r;

    /* JADX INFO: renamed from: s */
    public final CharSequence f62905s;

    /* JADX INFO: renamed from: t */
    public final CharSequence f62906t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f62907u;

    /* JADX INFO: renamed from: v */
    public final Integer f62908v;

    /* JADX INFO: renamed from: w */
    public final Integer f62909w;

    /* JADX INFO: renamed from: x */
    public final CharSequence f62910x;

    /* JADX INFO: renamed from: y */
    public final CharSequence f62911y;

    /* JADX INFO: renamed from: z */
    public final Integer f62912z;

    static {
        su5 su5Var = new su5();
        su5Var.f61443z = ImmutableList.m6289v();
        f62885B = new tu5(su5Var);
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
        AbstractC3393o1.m17746u(5, 6, 8, 9, 10);
        AbstractC3393o1.m17746u(11, 12, 13, 14, 15);
        AbstractC3393o1.m17746u(16, 17, 18, 19, 20);
        AbstractC3393o1.m17746u(21, 22, 23, 24, 25);
        AbstractC3393o1.m17746u(26, 27, 28, 29, 30);
        AbstractC3393o1.m17746u(31, 32, 33, 34, DescriptorProtos.Edition.EDITION_2023_VALUE);
    }

    public tu5(su5 su5Var) {
        Boolean boolValueOf = su5Var.f61428k;
        Integer numValueOf = su5Var.f61427j;
        Integer numValueOf2 = su5Var.f61442y;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            break;
                        case 20:
                        case 26:
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.f62887a = su5Var.f61418a;
        this.f62888b = su5Var.f61419b;
        this.f62889c = su5Var.f61420c;
        this.f62890d = su5Var.f61421d;
        this.f62891e = su5Var.f61422e;
        this.f62892f = su5Var.f61423f;
        this.f62893g = su5Var.f61424g;
        this.f62894h = su5Var.f61425h;
        this.f62895i = su5Var.f61426i;
        this.f62896j = numValueOf;
        this.f62897k = boolValueOf;
        Integer num = su5Var.f61429l;
        this.f62898l = num;
        this.f62899m = num;
        this.f62900n = su5Var.f61430m;
        this.f62901o = su5Var.f61431n;
        this.f62902p = su5Var.f61432o;
        this.f62903q = su5Var.f61433p;
        this.f62904r = su5Var.f61434q;
        this.f62905s = su5Var.f61435r;
        this.f62906t = su5Var.f61436s;
        this.f62907u = su5Var.f61437t;
        this.f62908v = su5Var.f61438u;
        this.f62909w = su5Var.f61439v;
        this.f62910x = su5Var.f61440w;
        this.f62911y = su5Var.f61441x;
        this.f62912z = numValueOf2;
        this.f62886A = su5Var.f61443z;
    }

    /* JADX INFO: renamed from: a */
    public final su5 m22307a() {
        su5 su5Var = new su5();
        su5Var.f61418a = this.f62887a;
        su5Var.f61419b = this.f62888b;
        su5Var.f61420c = this.f62889c;
        su5Var.f61421d = this.f62890d;
        su5Var.f61422e = this.f62891e;
        su5Var.f61423f = this.f62892f;
        su5Var.f61424g = this.f62893g;
        su5Var.f61425h = this.f62894h;
        su5Var.f61426i = this.f62895i;
        su5Var.f61427j = this.f62896j;
        su5Var.f61428k = this.f62897k;
        su5Var.f61429l = this.f62899m;
        su5Var.f61430m = this.f62900n;
        su5Var.f61431n = this.f62901o;
        su5Var.f61432o = this.f62902p;
        su5Var.f61433p = this.f62903q;
        su5Var.f61434q = this.f62904r;
        su5Var.f61435r = this.f62905s;
        su5Var.f61436s = this.f62906t;
        su5Var.f61437t = this.f62907u;
        su5Var.f61438u = this.f62908v;
        su5Var.f61439v = this.f62909w;
        su5Var.f61440w = this.f62910x;
        su5Var.f61441x = this.f62911y;
        su5Var.f61442y = this.f62912z;
        su5Var.f61443z = this.f62886A;
        return su5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tu5.class != obj.getClass()) {
            return false;
        }
        tu5 tu5Var = (tu5) obj;
        return TextUtils.equals(this.f62887a, tu5Var.f62887a) && TextUtils.equals(this.f62888b, tu5Var.f62888b) && TextUtils.equals(this.f62889c, tu5Var.f62889c) && TextUtils.equals(this.f62890d, tu5Var.f62890d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f62891e, tu5Var.f62891e) && Arrays.equals(this.f62892f, tu5Var.f62892f) && Objects.equals(this.f62893g, tu5Var.f62893g) && Objects.equals(this.f62894h, tu5Var.f62894h) && Objects.equals(this.f62895i, tu5Var.f62895i) && Objects.equals(this.f62896j, tu5Var.f62896j) && Objects.equals(this.f62897k, tu5Var.f62897k) && Objects.equals(this.f62899m, tu5Var.f62899m) && Objects.equals(this.f62900n, tu5Var.f62900n) && Objects.equals(this.f62901o, tu5Var.f62901o) && Objects.equals(this.f62902p, tu5Var.f62902p) && Objects.equals(this.f62903q, tu5Var.f62903q) && Objects.equals(this.f62904r, tu5Var.f62904r) && TextUtils.equals(this.f62905s, tu5Var.f62905s) && TextUtils.equals(this.f62906t, tu5Var.f62906t) && TextUtils.equals(this.f62907u, tu5Var.f62907u) && Objects.equals(this.f62908v, tu5Var.f62908v) && Objects.equals(this.f62909w, tu5Var.f62909w) && TextUtils.equals(this.f62910x, tu5Var.f62910x) && TextUtils.equals(null, null) && TextUtils.equals(this.f62911y, tu5Var.f62911y) && Objects.equals(this.f62912z, tu5Var.f62912z) && Objects.equals(this.f62886A, tu5Var.f62886A);
    }

    public final int hashCode() {
        return Objects.hash(this.f62887a, this.f62888b, this.f62889c, this.f62890d, null, null, this.f62891e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f62892f)), this.f62893g, null, this.f62894h, this.f62895i, this.f62896j, this.f62897k, null, this.f62899m, this.f62900n, this.f62901o, this.f62902p, this.f62903q, this.f62904r, this.f62905s, this.f62906t, this.f62907u, this.f62908v, this.f62909w, this.f62910x, null, this.f62911y, this.f62912z, true, this.f62886A);
    }
}
