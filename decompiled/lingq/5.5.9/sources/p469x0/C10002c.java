package p469x0;

import androidx.activity.result.C0204c;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;
import p387t0.C9169u;
import p470x1.C10017e;

/* JADX INFO: renamed from: x0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10002c {

    /* JADX INFO: renamed from: a */
    public final String f50834a;

    /* JADX INFO: renamed from: b */
    public final float f50835b;

    /* JADX INFO: renamed from: c */
    public final float f50836c;

    /* JADX INFO: renamed from: d */
    public final float f50837d;

    /* JADX INFO: renamed from: e */
    public final float f50838e;

    /* JADX INFO: renamed from: f */
    public final C10008i f50839f;

    /* JADX INFO: renamed from: g */
    public final long f50840g;

    /* JADX INFO: renamed from: h */
    public final int f50841h;

    /* JADX INFO: renamed from: i */
    public final boolean f50842i;

    /* JADX INFO: renamed from: x0.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f50843a = "";

        /* JADX INFO: renamed from: b */
        public final float f50844b;

        /* JADX INFO: renamed from: c */
        public final float f50845c;

        /* JADX INFO: renamed from: d */
        public final float f50846d;

        /* JADX INFO: renamed from: e */
        public final float f50847e;

        /* JADX INFO: renamed from: f */
        public final long f50848f;

        /* JADX INFO: renamed from: g */
        public final int f50849g;

        /* JADX INFO: renamed from: h */
        public final boolean f50850h;

        /* JADX INFO: renamed from: i */
        public final ArrayList<C10679a> f50851i;

        /* JADX INFO: renamed from: j */
        public final C10679a f50852j;

        /* JADX INFO: renamed from: k */
        public boolean f50853k;

        /* JADX INFO: renamed from: x0.c$a$a, reason: collision with other inner class name */
        public static final class C10679a {

            /* JADX INFO: renamed from: a */
            public final String f50854a;

            /* JADX INFO: renamed from: b */
            public final float f50855b;

            /* JADX INFO: renamed from: c */
            public final float f50856c;

            /* JADX INFO: renamed from: d */
            public final float f50857d;

            /* JADX INFO: renamed from: e */
            public final float f50858e;

            /* JADX INFO: renamed from: f */
            public final float f50859f;

            /* JADX INFO: renamed from: g */
            public final float f50860g;

            /* JADX INFO: renamed from: h */
            public final float f50861h;

            /* JADX INFO: renamed from: i */
            public final List<? extends AbstractC10003d> f50862i;

            /* JADX INFO: renamed from: j */
            public final List<AbstractC10010k> f50863j;

            public C10679a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }

            public C10679a(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i10) {
                str = (i10 & 1) != 0 ? "" : str;
                f3 = (i10 & 2) != 0 ? 0.0f : f3;
                f10 = (i10 & 4) != 0 ? 0.0f : f10;
                f11 = (i10 & 8) != 0 ? 0.0f : f11;
                f12 = (i10 & 16) != 0 ? 1.0f : f12;
                f13 = (i10 & 32) != 0 ? 1.0f : f13;
                f14 = (i10 & 64) != 0 ? 0.0f : f14;
                f15 = (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0.0f : f15;
                list = (i10 & 256) != 0 ? C10009j.f50944a : list;
                ArrayList arrayList = (i10 & 512) != 0 ? new ArrayList() : null;
                C5207g.m11111f(str, "name");
                C5207g.m11111f(list, "clipPathData");
                C5207g.m11111f(arrayList, "children");
                this.f50854a = str;
                this.f50855b = f3;
                this.f50856c = f10;
                this.f50857d = f11;
                this.f50858e = f12;
                this.f50859f = f13;
                this.f50860g = f14;
                this.f50861h = f15;
                this.f50862i = list;
                this.f50863j = arrayList;
            }
        }

        public a(float f3, float f10, float f11, float f12, long j10, int i10, boolean z10) {
            this.f50844b = f3;
            this.f50845c = f10;
            this.f50846d = f11;
            this.f50847e = f12;
            this.f50848f = j10;
            this.f50849g = i10;
            this.f50850h = z10;
            ArrayList<C10679a> arrayList = new ArrayList<>();
            this.f50851i = arrayList;
            C10679a c10679a = new C10679a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.f50852j = c10679a;
            arrayList.add(c10679a);
        }

        /* JADX INFO: renamed from: a */
        public final void m18586a(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list) {
            C5207g.m11111f(str, "name");
            C5207g.m11111f(list, "clipPathData");
            m18588c();
            this.f50851i.add(new C10679a(str, f3, f10, f11, f12, f13, f14, f15, list, 512));
        }

        /* JADX INFO: renamed from: b */
        public final void m18587b() {
            m18588c();
            ArrayList<C10679a> arrayList = this.f50851i;
            C10679a c10679aRemove = arrayList.remove(arrayList.size() - 1);
            arrayList.get(arrayList.size() - 1).f50863j.add(new C10008i(c10679aRemove.f50854a, c10679aRemove.f50855b, c10679aRemove.f50856c, c10679aRemove.f50857d, c10679aRemove.f50858e, c10679aRemove.f50859f, c10679aRemove.f50860g, c10679aRemove.f50861h, c10679aRemove.f50862i, c10679aRemove.f50863j));
        }

        /* JADX INFO: renamed from: c */
        public final void m18588c() {
            if (!(!this.f50853k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }
    }

    public C10002c(String str, float f3, float f10, float f11, float f12, C10008i c10008i, long j10, int i10, boolean z10) {
        this.f50834a = str;
        this.f50835b = f3;
        this.f50836c = f10;
        this.f50837d = f11;
        this.f50838e = f12;
        this.f50839f = c10008i;
        this.f50840g = j10;
        this.f50841h = i10;
        this.f50842i = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10002c)) {
            return false;
        }
        C10002c c10002c = (C10002c) obj;
        if (C5207g.m11106a(this.f50834a, c10002c.f50834a) && C10017e.m18618a(this.f50835b, c10002c.f50835b) && C10017e.m18618a(this.f50836c, c10002c.f50836c)) {
            if (!(this.f50837d == c10002c.f50837d)) {
                return false;
            }
            if ((this.f50838e == c10002c.f50838e) && C5207g.m11106a(this.f50839f, c10002c.f50839f) && C9169u.m17497c(this.f50840g, c10002c.f50840g)) {
                return (this.f50841h == c10002c.f50841h) && this.f50842i == c10002c.f50842i;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f50839f.hashCode() + C0204c.m846e(this.f50838e, C0204c.m846e(this.f50837d, C0204c.m846e(this.f50836c, C0204c.m846e(this.f50835b, this.f50834a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = C9169u.f47704g;
        return Boolean.hashCode(this.f50842i) + C0009a.m16d(this.f50841h, C0204c.m847f(this.f50840g, iHashCode, 31), 31);
    }
}
