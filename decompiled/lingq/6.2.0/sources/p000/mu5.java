package p000;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mu5 {

    /* JADX INFO: renamed from: a */
    public final Uri f51852a;

    /* JADX INFO: renamed from: b */
    public final String f51853b;

    /* JADX INFO: renamed from: c */
    public final List f51854c;

    /* JADX INFO: renamed from: d */
    public final ImmutableList f51855d;

    /* JADX INFO: renamed from: e */
    public final long f51856e;

    static {
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
        uma.m22828w(5);
        uma.m22828w(6);
        uma.m22828w(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mu5(Uri uri, ImmutableList immutableList) {
        List list = Collections.EMPTY_LIST;
        this.f51852a = uri;
        ArrayList arrayList = ez5.f38107a;
        this.f51853b = null;
        this.f51854c = list;
        this.f51855d = immutableList;
        c14 c14VarM6284m = ImmutableList.m6284m();
        for (int i = 0; i < immutableList.size(); i++) {
            c14VarM6284m.m3157b(nid.m17446a(((ou5) immutableList.get(i)).m18520a()));
        }
        c14VarM6284m.m4280g();
        this.f51856e = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu5)) {
            return false;
        }
        mu5 mu5Var = (mu5) obj;
        return this.f51852a.equals(mu5Var.f51852a) && Objects.equals(this.f51853b, mu5Var.f51853b) && this.f51854c.equals(mu5Var.f51854c) && this.f51855d.equals(mu5Var.f51855d) && this.f51856e == mu5Var.f51856e;
    }

    public final int hashCode() {
        int iHashCode = this.f51852a.hashCode() * 31;
        String str = this.f51853b;
        return (int) ((((long) ((this.f51855d.hashCode() + ((this.f51854c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.f51856e);
    }
}
