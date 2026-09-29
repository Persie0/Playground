package pa;

import android.graphics.Color;
import android.graphics.PointF;
import android.support.v4.media.C0141b;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: renamed from: pa.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8212c {

    /* JADX INFO: renamed from: a */
    public final String f44444a;

    /* JADX INFO: renamed from: b */
    public final int f44445b;

    /* JADX INFO: renamed from: c */
    public final Integer f44446c;

    /* JADX INFO: renamed from: d */
    public final Integer f44447d;

    /* JADX INFO: renamed from: e */
    public final float f44448e;

    /* JADX INFO: renamed from: f */
    public final boolean f44449f;

    /* JADX INFO: renamed from: g */
    public final boolean f44450g;

    /* JADX INFO: renamed from: h */
    public final boolean f44451h;

    /* JADX INFO: renamed from: i */
    public final boolean f44452i;

    /* JADX INFO: renamed from: j */
    public final int f44453j;

    /* JADX INFO: renamed from: pa.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f44454a;

        /* JADX INFO: renamed from: b */
        public final int f44455b;

        /* JADX INFO: renamed from: c */
        public final int f44456c;

        /* JADX INFO: renamed from: d */
        public final int f44457d;

        /* JADX INFO: renamed from: e */
        public final int f44458e;

        /* JADX INFO: renamed from: f */
        public final int f44459f;

        /* JADX INFO: renamed from: g */
        public final int f44460g;

        /* JADX INFO: renamed from: h */
        public final int f44461h;

        /* JADX INFO: renamed from: i */
        public final int f44462i;

        /* JADX INFO: renamed from: j */
        public final int f44463j;

        /* JADX INFO: renamed from: k */
        public final int f44464k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f44454a = i10;
            this.f44455b = i11;
            this.f44456c = i12;
            this.f44457d = i13;
            this.f44458e = i14;
            this.f44459f = i15;
            this.f44460g = i16;
            this.f44461h = i17;
            this.f44462i = i18;
            this.f44463j = i19;
            this.f44464k = i20;
        }
    }

    /* JADX INFO: renamed from: pa.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final Pattern f44465a = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: b */
        public static final Pattern f44466b = Pattern.compile(C10134c0.m19045l("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: c */
        public static final Pattern f44467c = Pattern.compile(C10134c0.m19045l("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: d */
        public static final Pattern f44468d = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a */
        public static PointF m16360a(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f44466b.matcher(str);
            Matcher matcher2 = f44467c.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    C10145n.m19098f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            strGroup.getClass();
            float f3 = Float.parseFloat(strGroup.trim());
            strGroup2.getClass();
            return new PointF(f3, Float.parseFloat(strGroup2.trim()));
        }
    }

    public C8212c(String str, int i10, Integer num, Integer num2, float f3, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f44444a = str;
        this.f44445b = i10;
        this.f44446c = num;
        this.f44447d = num2;
        this.f44448e = f3;
        this.f44449f = z10;
        this.f44450g = z11;
        this.f44451h = z12;
        this.f44452i = z13;
        this.f44453j = i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m16357a(String str) {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        C0141b.m622r("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16358b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            C10145n.m19100h("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m16359c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C10129a.m18990b(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.m9142l0(((j10 >> 24) & 255) ^ 255), Ints.m9142l0(j10 & 255), Ints.m9142l0((j10 >> 8) & 255), Ints.m9142l0((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            C10145n.m19100h("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
